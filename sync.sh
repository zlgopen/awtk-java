#!/bin/bash

rm -rf src/java/src/main/java/awtk/*
cp -vf ../awtk-binding/tools/code_gen/java/output/tk_jni.c src/c
cp -vf ../awtk-binding/share/java/*.java src/java/src/main/java/awtk/
cp -vf ../awtk-binding/tools/code_gen/java/output/*.java src/java/src/main/java/awtk/

cp -vrf ../awtk-binding/demos/java/*.java demos/src/main/java/demos/

