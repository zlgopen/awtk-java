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

int main(int argc, char** argv) {
  JavaVM* javaVM;
  JNIEnv* jniEnv;
  string program;
  string classPath;
  string className;
  JavaVMInitArgs vmArgs;
  JavaVMOption jvmopt[2];

  if(argc != 2) {
    printf("Usage: %s jar\n", argv[0]);

    return 0;
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
      jstring str = env->NewStringUTF("10");
      env->CallStaticVoidMethod(jcls, methodId, str);
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
