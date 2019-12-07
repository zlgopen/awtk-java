package awtk;

public class Bitmap {
 public long nativeObj;

 public Bitmap(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public Bitmap cast(long nativeObj) {
   return new Bitmap(nativeObj);
 }

 public  static Bitmap create()  {
   return new Bitmap(bitmap_create());
 }

 public  static Bitmap createEx(int w, int h, int line_length, BitmapFormat format)  {
   return new Bitmap(bitmap_create_ex(w, h, line_length, format.value()));
 }

 public  int getBpp()  {
   return bitmap_get_bpp(this.nativeObj);
 }

 public  Ret destroy()  {
   return Ret.from(bitmap_destroy(this.nativeObj));
 }

 public int getW() {
   return bitmap_t_get_prop_w(this.nativeObj);
 }

 public int getH() {
   return bitmap_t_get_prop_h(this.nativeObj);
 }

 public int getLineLength() {
   return bitmap_t_get_prop_line_length(this.nativeObj);
 }

 public int getFlags() {
   return bitmap_t_get_prop_flags(this.nativeObj);
 }

 public int getFormat() {
   return bitmap_t_get_prop_format(this.nativeObj);
 }

 public String getName() {
   return bitmap_t_get_prop_name(this.nativeObj);
 }

static private native long bitmap_create();
static private native long bitmap_create_ex(int w, int h, int line_length, int format);
static private native int bitmap_get_bpp(long bitmap);
static private native int bitmap_destroy(long bitmap);
static private native int bitmap_t_get_prop_w(long nativeObj);
static private native int bitmap_t_get_prop_h(long nativeObj);
static private native int bitmap_t_get_prop_line_length(long nativeObj);
static private native int bitmap_t_get_prop_flags(long nativeObj);
static private native int bitmap_t_get_prop_format(long nativeObj);
static private native String bitmap_t_get_prop_name(long nativeObj);
}

