package awtk;

public class WindowManagerSimple extends WindowManager {
 public WindowManagerSimple(long nativeObj) {
   super(nativeObj);
 }

 static public WindowManagerSimple cast(long nativeObj) {
   return new WindowManagerSimple(nativeObj);
 }

}

