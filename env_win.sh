export JAVA_HOME="/c/Program Files/Java/jdk-21"
export JAVA_JNI_PATH="$JAVA_HOME/include"
export JAVA_JNI_OS_PATH="$JAVA_HOME/include/win32"
export JAVA_LIB_PATH="$JAVA_HOME/lib"
cp -fv "$JAVA_HOME/bin/server/jvm.dll" .
export PATH=$JAVA_HOME/bin:$PATH
