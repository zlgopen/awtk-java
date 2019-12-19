import os
import sys
import platform

#for pc
sys.path.insert(0, '../awtk/')

#for linux-fb
#sys.path.insert(0, '../awtk-linux-fb/')

import awtk_config as awtk

APP_ROOT    = os.path.normpath(os.getcwd())
APP_BIN_DIR = os.path.join(APP_ROOT, 'bin')
APP_LIB_DIR = os.path.join(APP_ROOT, 'lib')
RES_ROOT    = awtk.TK_DEMO_ROOT.replace("\\", "\\\\")
TK_JS_ROOT  = os.path.normpath(os.getcwd())

JAVA_HOME = os.environ['JAVA_HOME']
JAVA_JNI_PATH = os.environ['JAVA_JNI_PATH']
JAVA_JNI_OS_PATH = os.environ['JAVA_JNI_OS_PATH']
JAVA_LIB_PATH=os.environ['JAVA_LIB_PATH'];

os.environ['APP_ROOT'] = APP_ROOT;
os.environ['BIN_DIR'] = APP_BIN_DIR;
os.environ['LIB_DIR'] = APP_LIB_DIR;


APP_LIBS = ['assets', 'jvm']
APP_LIBPATH = [APP_LIB_DIR, JAVA_LIB_PATH]
APP_CPPPATH = [JAVA_JNI_PATH, JAVA_JNI_OS_PATH]
APP_CFLAGS = ' -DPATH_MAX=256 -fPIC '
APP_CCFLAGS = APP_CFLAGS

if hasattr(awtk, 'CC'):
  DefaultEnvironment(
    CC=awtk.CC,
    CXX=awtk.CXX,
    LD=awtk.LD,
    AR=awtk.AR,
    STRIP=awtk.STRIP,
    
    CPPPATH   = APP_CPPPATH + awtk.CPPPATH,
    LINKFLAGS = awtk.LINKFLAGS,
    LIBS      = APP_LIBS + awtk.LIBS,
    LIBPATH   = APP_LIBPATH + awtk.LIBPATH,
    CFLAGS    = APP_CFLAGS + awtk.CFLAGS, 
    CCFLAGS   = APP_CCFLAGS + awtk.CCFLAGS, 
    OS_SUBSYSTEM_CONSOLE=awtk.OS_SUBSYSTEM_CONSOLE,
    OS_SUBSYSTEM_WINDOWS=awtk.OS_SUBSYSTEM_WINDOWS)
else:
  DefaultEnvironment(
    CPPPATH   = APP_CPPPATH + awtk.CPPPATH,
    LINKFLAGS = awtk.LINKFLAGS,
    LIBS      = APP_LIBS + awtk.LIBS,
    LIBPATH   = APP_LIBPATH + awtk.LIBPATH,
    CFLAGS    = APP_CFLAGS + awtk.CFLAGS, 
    CCFLAGS   = APP_CCFLAGS + awtk.CCFLAGS, 
    OS_SUBSYSTEM_CONSOLE=awtk.OS_SUBSYSTEM_CONSOLE,
    OS_SUBSYSTEM_WINDOWS=awtk.OS_SUBSYSTEM_WINDOWS)


SConscript(['src/SConscript', 'demos/SConscript']);

