#!/bin/bash

rm -rf src/java/awtk/*
rm -rf src/classes
cp -vf ../awtk-binding/tools/code_gen/java/output/tk_jni.c src/c
cp -vf ../awtk-binding/tools/code_gen/java/output/*.java src/java/awtk
cp -vf ../awtk-binding/share/java/*.c src/c
cp -vf ../awtk-binding/share/java/*.java src/java/awtk


#cp -vf ../awtk-binding/demos/java/* demos/
