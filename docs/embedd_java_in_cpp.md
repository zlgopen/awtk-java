# 如何在 C++中嵌入 JAVA

最近在为 [AWTK](https://github.com/zlgopen/awtk) 增加 JAVA 绑定，在 Windows 和 Linux 下工作正常，但是在 MACOS 上运行起来遇到下列问题：

```
java[5714:260503] WARNING: NSWindow drag regions should only be invalidated on the Main Thread! This will throw an exception in the future. Called from (
	0   AppKit                              0x00007fff50d21607 -[NSWindow(NSWindow_Theme) _postWindowNeedsToResetDragMarginsUnlessPostingDisabled] + 378
	1   AppKit                              0x00007fff50d1e9f7 -[NSWindow _initContent:styleMask:backing:defer:contentView:] + 1479
	2   AppKit                              0x00007fff50d1e42a -[NSWindow initWithContentRect:styleMask:backing:defer:] + 45
	3   AppKit                              0x00007fff50fead08 -[NSWindow initWithContentRect:styleMask:backing:defer:screen:] + 52
	4   libSDL2-2.0.dylib                   0x0000000109947d87 Cocoa_CreateWindow + 887
	5   libSDL2-2.0.dylib                   0x000000010990aa46 SDL_CreateWindow_REAL + 1190
	6   libawtk-jni.dylib                   0x00000001225d7ad6 native_window_create_internal + 150
	7   libawtk-jni.dylib                   0x00000001225d7cc2 native_window_sdl_init + 162
	8   libawtk-jni.dylib                   0x00000001225da166 main_loop_init + 38
	9   libawtk-jni.dylib                   0x000000012251f866 tk_init + 262
	10  libawtk-jni.dylib                   0x0000000122505519 Java_awtk_AWTK_init + 57
	11  ???                                 0x0000000109b359f4 0x0 + 4457716212
	12  ???                                 0x0000000109b25d00 0x0 + 4457651456
)
```

看起来大概是说，AWTK 没有在 UI 线程运行，所以无法初始化 SDL。找了半天也没有找到解决方法，转念一想，能不能把像处理脚本语言一样，把 JAVA 嵌入到 C/C++中来呢？ 

在网上搜了一下，可能这种用法太奇葩，只找到少量例子，而且没有一个可以直接运行的，花了不少时间去调整。这里做个笔记，供有需要的朋友参考。

## 一、启动虚拟机的参数

基本参数需要两个：

* JNI 动态库的路径通过 java.library.path 设置。
* 程序 jar 文件通过 java.class.path 设置。
    
```c
static string toClassPath(const string& program) {
  return string("-Djava.class.path=") + program;
}

...

jvmopt[0].optionString = (char*)"-Djava.library.path=./lib";
jvmopt[1].optionString = (char*)classPath.c_str()
```

## 二、调用 main 函数

这里我需要把宽度和高度两个参数，通过 main 函数传递给 java 程序。

```c
static jobjectArray prepareProgramArgs(JNIEnv* env, const char* w, const char* h) {
    jobjectArray ret= (jobjectArray)env->NewObjectArray(2,
          env->FindClass("java/lang/String"),
          env->NewStringUTF(""));

    env->SetObjectArrayElement(ret,0, env->NewStringUTF(w));
    env->SetObjectArrayElement(ret,1, env->NewStringUTF(h));

    return ret;
}

...

    jmethodID methodId = env->GetStaticMethodID(jcls, "main", "([Ljava/lang/String;)V");
    if (methodId != NULL) {
      jobjectArray args = prepareProgramArgs(env, w, h);

      env->CallStaticVoidMethod(jcls, methodId, args);

      if (env->ExceptionCheck()) {
        env->ExceptionDescribe();
        env->ExceptionClear();
      }
    }
```

## 三、完整代码

```c
#include <jni.h>
#include <string>
#include <iostream>

using namespace std;

static string toClassName(const string& program) {
  string className;
  size_t start = program.find_last_of('/');
  size_t end = program.find_last_of('.');

  if(start == std::string::npos) {
    start = program.find_last_of('\\');
    if(start == std::string::npos) {
      start = -1;
    }
  }

  className = program.substr(start+1, end - start - 1);

  return className;
}
  
static string toClassPath(const string& program) {
  return string("-Djava.class.path=") + program;
}

static jobjectArray prepareProgramArgs(JNIEnv* env, const char* w, const char* h) {
    jobjectArray ret= (jobjectArray)env->NewObjectArray(2,
          env->FindClass("java/lang/String"),
          env->NewStringUTF(""));

    env->SetObjectArrayElement(ret,0, env->NewStringUTF(w));
    env->SetObjectArrayElement(ret,1, env->NewStringUTF(h));

    return ret;
}

int main(int argc, char** argv) {
  JavaVM* javaVM;
  JNIEnv* jniEnv;
  string program;
  string classPath;
  string className;
  const char* w = "320";
  const char* h = "480";
  JavaVMInitArgs vmArgs;
  JavaVMOption jvmopt[2];

  if(argc < 2) {
    printf("Usage: %s jar [w] [h]\n", argv[0]);

    return 0;
  }

  if(argc > 2) {
    w = argv[2];
  }
  
  if(argc > 3) {
    h = argv[3];
  }

  program = argv[1];
  className = toClassName(program);
  classPath = toClassPath(program);
  jvmopt[0].optionString = (char*)"-Djava.library.path=./lib";
  jvmopt[1].optionString = (char*)classPath.c_str();

  vmArgs.options = jvmopt;
  vmArgs.version = JNI_VERSION_1_8;
  vmArgs.ignoreUnrecognized = JNI_TRUE;
  vmArgs.nOptions = sizeof(jvmopt) / sizeof(jvmopt[0]);

  long flag = JNI_CreateJavaVM(&javaVM, (void**)&jniEnv, &vmArgs);
  if (flag == JNI_ERR) {
    cout << "Error creating VM. Exiting...\n";
    return 1;
  }

  JNIEnv* env = jniEnv;
  jclass jcls = env->FindClass(className.c_str());
  if (jcls == NULL) {
    jniEnv->ExceptionDescribe();
    javaVM->DestroyJavaVM();
    return 1;
  }

  if (jcls != NULL) {
    jmethodID methodId = env->GetStaticMethodID(jcls, "main", "([Ljava/lang/String;)V");
    if (methodId != NULL) {
      jobjectArray args = prepareProgramArgs(env, w, h);

      env->CallStaticVoidMethod(jcls, methodId, args);

      if (env->ExceptionCheck()) {
        env->ExceptionDescribe();
        env->ExceptionClear();
      }
    } else {
      cout << "Not found main, Exiting...\n";
    }
  } else {
    cout << "Not found class , Exiting...\n";
  }

  javaVM->DestroyJavaVM();
  return 0;
}

```

## 四、编译和链接

* JAVA_HOME

```
/Library/Java/JavaVirtualMachines/jdk1.8.0_111.jdk/Contents/Home
```

* 头文件路径。

```
$JAVA_HOME/include
$JAVA_HOME/include/darwin
```

* 库的路径。

```
$JAVA_HOME/jre/lib/server
```

* 库的名称。 libjvm

* 运行时库的路径  

```
export DYLD_LIBRARY_PATH="$JAVA_HOME/jre/lib/server"
```

## 五、命令函数参数

> 编译通过，以为大功告成，运行时却提示找不到 JRE。原来安装了 JDK 还不行，还需另外在安装 JRE，安装之后 AWTK 显示正常。

```
./bin/awtkRun bin/DemoButton.jar
```
