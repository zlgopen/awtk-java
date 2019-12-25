#include <jni.h>
#include <string>
#include <iostream>

using namespace std;

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

  if(argc < 3) {
    printf("Usage: %s jar class [w] [h]\n", argv[0]);

    return 0;
  }

  if(argc > 3) {
    w = argv[3];
  }
  
  if(argc > 4) {
    h = argv[4];
  }

  program = argv[1];
  className = argv[2];
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
