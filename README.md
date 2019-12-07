# awtk-java

ZLG 开源 GUI 引擎 [awtk](https://github.com/zlgopen/awtk) 针对 JAVA 的绑定。

## 准备

1. 获取 awtk 并编译

```
git clone https://github.com/zlgopen/awtk.git
cd awtk; scons; cd -
```
> AWTK 的编译环境请参考 AWTK 的文档。

2. 获取 awtk-java 并编译

```
git clone https://github.com/zlgopen/awtk-java.git
cd awtk-java
scons

./build.sh
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
