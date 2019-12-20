# awtk-java

ZLG 开源 GUI 引擎 [awtk](https://github.com/zlgopen/awtk) 针对 JAVA 的绑定。

## 为什么要支持 JAVA

JAVA 运行环境体积很大，而且自己有强大的 GUI 系统。AWTK 为什么要支持 JAVA 的绑定呢：

* 首先这是一件很好玩的事情。

* JAVA 是一个典型的静态类型语言，希望支持 JAVA 绑定后，再支持 C#/Go/Rust 应该不难了。

* JAVA 是从嵌入式开发来的。嵌入式 Linux 系统用 J2ME + AWTK 或 minijvm + AWTK 也是有趣的尝试。

## 准备

1. 获取 awtk 并编译

```
git clone https://github.com/zlgopen/awtk.git
cd awtk; scons; cd -
```
> AWTK 的编译环境请参考 AWTK 的文档。

2. 获取 awtk-java 并编译

* 获取代码

```
git clone https://github.com/zlgopen/awtk-java.git
cd awtk-java
```

* 安装最新版本的 JDK 和 JRE。


* 根据平台修改 env_xxx.sh，设置 JAVA_HOME 等环境变量。

* 编译 JNI

```
scons
```

* 编译 AWTK-JAVA

```
./build.sh
```

* 编译 AWTK-DEMO

```
./build_demo.sh DemoUI
```

## 运行

```
./bin/awtkRun bin/xxxx.jar 
```

请把 xxxx.jar 换成具体的 jar 文件。如：

```
./bin/awtkRun bin/DemoUI.jar 
```

## 更新绑定（由本项目的维护人员完成）

```
./sync.sh
```

> 在非 bash 终端（如 Windows 平台的 cmd.exe)，需要根据 sync.sh 的内容手工执行相应的命令。

## 代码示例

```java
    TWidget win = TWindow.createDefault();
    TWidget button = TButton.create(win, 10, 0, 0, 0);

    button.setName("quit");
    button.setText("Quit");
    button.setSelfLayout("default(x=c,y=m,w=200,h=40)");

    button.on(TEventType.CLICK, new TOnEvent() {
      @Override
      public TRet onEvent(TEvent evt) {
        System.out.println("OnClick");
        TGlobal.quit();
        return TRet.OK;
      }
    }, 0)
```

## 文档

[AWTK 脚本绑定原理](https://github.com/zlgopen/awtk/blob/master/docs/script_binding.md)

[JAVA 绑定笔记](docs/tech_notes.md)

[在C++中嵌入JAVA](docs/embedd_java_in_cpp.md)
> 本文以 Linux/MacOS 为例，Windows 可能会微妙差异，请酌情处理。
