package awtk;

public class Global {
 public long nativeObj;

 public Global(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public Global cast(long nativeObj) {
   return new Global(nativeObj);
 }

 public  static Ret quit()  {
   return Ret.from(tk_quit());
 }

 public  static int getPointerX()  {
   return tk_get_pointer_x();
 }

 public  static int getPointerY()  {
   return tk_get_pointer_y();
 }

 public  static boolean isPointerPressed()  {
   return tk_is_pointer_pressed();
 }

static private native int tk_quit();
static private native int tk_get_pointer_x();
static private native int tk_get_pointer_y();
static private native boolean tk_is_pointer_pressed();
}

