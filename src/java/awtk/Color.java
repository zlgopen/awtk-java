package awtk;

public class Color {
 public long nativeObj;

 public Color(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public Color cast(long nativeObj) {
   return new Color(nativeObj);
 }

 public  static Color create(int r, int b, int g, int a)  {
   return new Color(color_create(r, b, g, a));
 }

 public  Color fromStr(String str)  {
   return new Color(color_from_str(this.nativeObj, str));
 }

 public  int r()  {
   return color_r(this.nativeObj);
 }

 public  int g()  {
   return color_g(this.nativeObj);
 }

 public  int b()  {
   return color_b(this.nativeObj);
 }

 public  int a()  {
   return color_a(this.nativeObj);
 }

 public  static Color cast(Color color)  {
   return new Color(color_cast(color != null ? (color.nativeObj) : 0));
 }

 public  Ret destroy()  {
   return Ret.from(color_destroy(this.nativeObj));
 }

 public int getColor() {
   return color_t_get_prop_color(this.nativeObj);
 }

static private native long color_create(int r, int b, int g, int a);
static private native long color_from_str(long c, String str);
static private native int color_r(long c);
static private native int color_g(long c);
static private native int color_b(long c);
static private native int color_a(long c);
static private native long color_cast(long color);
static private native int color_destroy(long c);
static private native int color_t_get_prop_color(long nativeObj);
static private native void color_t_set_prop_color(long nativeObj, int value);
}

