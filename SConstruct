import os
import scripts.app_helper as app

JAVA_HOME = os.environ['JAVA_HOME']
JAVA_JNI_PATH = os.environ['JAVA_JNI_PATH']
JAVA_JNI_OS_PATH = os.environ['JAVA_JNI_OS_PATH']
JAVA_LIB_PATH=os.environ['JAVA_LIB_PATH'];

ARGUMENTS['FONT'] = 'default_full'
helper = app.Helper(ARGUMENTS);

APP_LIBS = ['jvm']
APP_LIBPATH = [JAVA_LIB_PATH]
APP_CPPPATH = [JAVA_JNI_PATH, JAVA_JNI_OS_PATH]
APP_CCFLAGS = ' -DPATH_MAX=256 -fPIC '
helper.add_libs(APP_LIBS).add_ccflags(APP_CCFLAGS).add_cpppath(APP_CPPPATH).call(DefaultEnvironment)

SConscriptFiles = ['3rd/quickjs/SConscript', 'src/SConscript']
SConscript(SConscriptFiles)
