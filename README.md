# awtk-java

ZLG 开源 GUI 引擎 [awtk](https://github.com/zlgopen/awtk) 针对 JAVA 的绑定。

## 为什么要支持 JAVA

JAVA 运行环境体积很大，而且自己有强大的 GUI 系统。AWTK 为什么要支持 JAVA 的绑定呢：

* 首先这是一件很好玩的事情。

* 相对于 C#/Go/Rust 而言，我对 JAVA 稍微熟悉一点。

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

* 编译 JNI

```
git clone https://github.com/zlgopen/awtk-java.git
cd awtk-java
scons
```

* 编译 AWTK-JAVA

```
./build.sh
```

* 编译 AWTK-DEMO

```
./build_demo.sh
```

## 运行

```
./run_demo.sh ./bin/xxx.jar
```

> 请把 xxxx.jar 换成具体的 jar 文件。

## 更新绑定（由本项目的维护人员完成）

```
./sync.sh
```

> 在非 bash 终端（如 Windows 平台的 cmd.exe)，需要根据 sync.sh 的内容手工执行相应的命令。

## 文档

[AWTK 脚本绑定原理](https://github.com/zlgopen/awtk/blob/master/docs/script_binding.md)

[JAVA 绑定笔记](docs/tech_notes.md)

> 本文以 Linux/MacOS 为例，Windows 可能会微妙差异，请酌情处理。
