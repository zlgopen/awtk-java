package awtk;

public class Rect {
 public long nativeObj;

 public Rect(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public Rect cast(long nativeObj) {
   return new Rect(nativeObj);
 }

 public  static Rect create(int x, int y, int w, int h)  {
   return new Rect(rect_create(x, y, w, h));
 }

 public  Rect set(int x, int y, int w, int h)  {
   return new Rect(rect_set(this.nativeObj, x, y, w, h));
 }

 public  static Rect cast(Rect rect)  {
   return new Rect(rect_cast(rect != null ? (rect.nativeObj) : 0));
 }

 public  Ret destroy()  {
   return Ret.from(rect_destroy(this.nativeObj));
 }

 public int getX() {
   return rect_t_get_prop_x(this.nativeObj);
 }

 public int getY() {
   return rect_t_get_prop_y(this.nativeObj);
 }

 public int getW() {
   return rect_t_get_prop_w(this.nativeObj);
 }

 public int getH() {
   return rect_t_get_prop_h(this.nativeObj);
 }

static private native long rect_create(int x, int y, int w, int h);
static private native long rect_set(long rect, int x, int y, int w, int h);
static private native long rect_cast(long rect);
static private native int rect_destroy(long r);
static private native int rect_t_get_prop_x(long nativeObj);
static private native int rect_t_get_prop_y(long nativeObj);
static private native int rect_t_get_prop_w(long nativeObj);
static private native int rect_t_get_prop_h(long nativeObj);
}

