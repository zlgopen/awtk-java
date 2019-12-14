package awtk;


/**
 * 位图。
 *
 */
public class Bitmap {
 public long nativeObj;

 public Bitmap(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public Bitmap cast(long nativeObj) {
   return new Bitmap(nativeObj);
 }


/**
 * 创建图片对象(一般供脚本语言中使用)。
 * 
 *
 * @returns 返回bitmap对象。
 */
 public  static Bitmap create()  {
   return new Bitmap(bitmap_create());
 }


/**
 * 创建图片对象。
 * 
 * @param w 宽度。
 * @param h 高度。
 * @param line_length line_length。
 * @param format 格式。
 *
 * @returns 返回bitmap对象。
 */
 public  static Bitmap createEx(int w, int h, int line_length, BitmapFormat format)  {
   return new Bitmap(bitmap_create_ex(w, h, line_length, format.value()));
 }


/**
 * 获取图片一个像素占用的字节数。
 * 
 * @param bitmap bitmap对象。
 *
 * @returns 返回一个像素占用的字节数。
 */
 public  int getBpp()  {
   return bitmap_get_bpp(this != null ? (this.nativeObj) : 0);
 }


/**
 * 销毁图片。
 * 
 * @param bitmap bitmap对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret destroy()  {
   return Ret.from(bitmap_destroy(this != null ? (this.nativeObj) : 0));
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

