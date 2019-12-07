# JAVA 绑定技术笔记

AWTK 之前支持了 LUA 和 JS 的绑定，JS 又支持了 JerryScript、QuickJS 和 NodeJS 几种不同的运行环境。AWTK 支持脚本语言算是经过验证了，要增加新的脚本语言应该是很容易的事了。

JAVA 的绑定则是第一次支持静态类型的语言绑定，虽然在支持 JS 绑定时用了 TypeScript，但是 TypeScript 的类型要求并不严格，有些类型转换的问题就绕过去了，而 JAVA 是一门类型要求严格语言，加上对 JAVA 不熟悉，在实现 JAVA 的绑定过程中遇到不少问题。这里做个备忘：

## 一、为什么要支持 JAVA

JAVA 运行环境体积很大，而且自己有强大的 GUI 系统。AWTK 为什么要支持 JAVA 的绑定呢：

* 首先这是一件很好玩的事情。

* 相对于 C#/Go/Rust 而言，我对 JAVA 稍微熟悉一点。

* JAVA 是一个典型的静态类型语言，希望支持 JAVA 绑定后，再支持 C#/Go/Rust 应该不难了。

* JAVA 是从嵌入式开发来的。嵌入式 Linux 系统用 J2ME + AWTK 或 minijvm + AWTK 也是有趣的尝试。

## 二、JAVA 命令行编译

这个看起来很简单的问题，因为对 JAVA 不熟悉，浪费了我不少时间。先尝试了用 scons 来编译，但是很多参数不知道如何指定，文档中也没有看到。后来尝试用 gradle, 但是编译 C 的 JNI 库遇到了一些问题，算了懒得折腾了，用命令行编译吧。

* 将 java 文件编译成。class 文件。

```
javac -d classes/awtk src/java/awtk/*.java
javac -d classes/demos  demos/*.java -classpath classes/awtk
```

* 将 demo 的。class 文件和 awtk 的。class 编译成。jar 文件。

```
jar cfm ./bin/DemoButton.jar demos/DemoButton.MF -C classes/awtk . -C classes/demos DemoButton.class
```

> 本来打算把绑定代码编译成独立的文件 awtk.jar, 但是编译 demos 时出现问题，以后再研究吧。

## 三、编译 JNI

JNI 仍然采用 scons。

## 四、运行

```
java -Djava.library.path=lib/  -classpath . -jar bin/DemoButton.jar
```

## 五、JNI 函数原型

JNI 中 C 函数的函数原型可以用 javah 生成，或者在 dlsync 函数设置断点，观察加载函数的名称。

```
javah -d native -classpath classes/awtk/ awtk.Widget
```

> 有点奇怪的是函数名单词前要加个 1。

如：
```
static private native int widget_count_children(long widget);
```

对应的函数名是：

```
/*
 * Class:     awtk_Widget
 * Method:    widget_count_children
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_awtk_Widget_widget_1count_1children(JNIEnv *, jclass, jlong);
```

## 六、JAVA 层的代码

JNI 提供 C 函数一对一的封装，再 JAVA 层的代码把 C 风格的代码包装成面向对象的代码。

JNI 提供的函数，不能传递指针，而是用 long 类型来表示，nativeObj 表示 C 语言对象中的对象指针。

```
public class Widget {
 public long nativeObj;

 public Widget(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public Widget cast(long nativeObj) {
   return new Widget(nativeObj);
 }

 public  int countChildren()  {
   return widget_count_children(this.nativeObj);
 }
 ```

JAVA 中的枚举类型是强类型，不像 C 语言中直接和 int 进行转换，而在 JNI 中去把 C 的枚举转换成 JAVA 的枚举很麻烦，所以在定义枚举时，就提供相应的转换函数。如：

value 把 JAVA 的枚举转换成 C 语言枚举对应的值，而 from 负责把 C 枚举的值转换成 JAVA 枚举的值。

```
public enum AppType {
  MOBILE (APP_MOBILE()),
  SIMULATOR (APP_SIMULATOR()),
  DESKTOP (APP_DESKTOP());

  private int value;
  AppType(int value) {
    this.value = value;
  }
  public int value() {
    return this.value;
  }

  public static AppType from(int value) {
    for(AppType iter : AppType.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return MOBILE;
  }

  static private native int APP_MOBILE();
  static private native int APP_SIMULATOR();
  static private native int APP_DESKTOP();

}
```

使用时，用 from/value 在 C 和 JAVA 之间进行转换。

```
public class AWTK {
  static public Ret init(int w, int h, AppType appType) {
    return Ret.from(AWTK.init(w, h, appType.value()));
  }

  static public native int init(int w, int h, int appType);

  static public native Ret run();
}
```

## 七、JNI 中 异步调用 JAVA 编写的事件处理函数

由于是异步调用，所以需要把 env 和 java 对象保存起来，并且增加 java 对象的引用计数：

```
static async_callback_info_t* async_callback_info_create(JNIEnv* env, jobject obj,
                                                         const char* name) {
  async_callback_info_t* info = TKMEM_ZALLOC(async_callback_info_t);
  return_value_if_fail(info != NULL, NULL);

  info->env = env;
  info->obj = (*env)->NewGlobalRef(env, obj);
  tk_strncpy(info->func, name, TK_NAME_LEN);

  return info;
}
```

调用 JAVA 实现的事件处理函数。

```
static int async_callback_info_call(async_callback_info_t* info, void* data) {
  JNIEnv* env = info->env;
  jclass cls = (*env)->GetObjectClass(env, info->obj);
  jmethodID mid = (*env)->GetMethodID(env, cls, info->func, "(J)Lawtk/Ret;");
  return_value_if_fail(cls != NULL && mid != NULL, RET_BAD_PARAMS);

  return (*env)->CallIntMethod(env, info->obj, mid, data);
}
```

在注销的时候，减少 java 对象的引用计数。

```
static ret_t async_callback_info_destroy(async_callback_info_t* info) {
  return_value_if_fail(info != NULL, RET_BAD_PARAMS);

  (*(info->env))->DeleteGlobalRef(info->env, info->obj);

  TKMEM_FREE(info);

  return RET_OK;
}
```
