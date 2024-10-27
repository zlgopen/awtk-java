export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home
export JAVA_JNI_PATH="$JAVA_HOME/include"
export JAVA_JNI_OS_PATH="$JAVA_HOME/include/darwin"
export JAVA_LIB_PATH="$JAVA_HOME/lib/server"
export DYLD_LIBRARY_PATH="$JAVA_HOME/lib/server"
cp -fv $DYLD_LIBRARY_PATH/libjvm.dylib bin
