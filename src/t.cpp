#include <jni.h>
#include <iostream>
#include <string>
using namespace std;

int main(int argc, char** argv) {
  JavaVM* javaVM;
  JNIEnv* jniEnv;
  string program;
  JavaVMInitArgs vmArgs;
  JavaVMOption jvmopt[2];
  string classPath = "";

  if(argc != 2) {
    printf("Usage: %s jar\n", argv[0]);
  }


  program = argv[1];
  classPath = string("-Djava.class.path=") + program;
  jvmopt[0].optionString = (char*)"-Djava.library.path=./lib";
  jvmopt[1].optionString = (char*)classPath.c_str();

  /*
     jvmopt[0].optionString =
     (char*)"-Djava.library.path=/Users/jim/Share/lab/gui/awtk/awtk-java/lib";
     jvmopt[1].optionString =
     (char*)"-Djava.class.path=/Users/jim/Share/lab/gui/awtk/awtk-java/bin/DemoButton.jar";
     jvmopt[2].optionString = (char*)"-jar bin/DemoButton.jar";
  */
//     jvmopt[1].optionString =
//     (char*)"-Djava.class.path=/Users/jim/Share/lab/gui/awtk/awtk-java/bin/DemoButton.jar";
  printf("%s\n", jvmopt[1].optionString);
     //jvmopt[2].optionString = (char*)"-jar bin/DemoButton.jar";
  vmArgs.version = JNI_VERSION_1_8;
  vmArgs.nOptions = sizeof(jvmopt) / sizeof(jvmopt[0]);
  vmArgs.options = jvmopt;
  vmArgs.ignoreUnrecognized = JNI_TRUE;

  long flag = JNI_CreateJavaVM(&javaVM, (void**)&jniEnv, &vmArgs);
  if (flag == JNI_ERR) {
    cout << "Error creating VM. Exiting...\n";
    return 1;
  }

  JNIEnv* env = jniEnv;
  jclass jcls = env->FindClass("DemoButton");
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
