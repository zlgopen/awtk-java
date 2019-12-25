package awtk;


/**
 * 位图。
 *
 */
public class TBitmap { 

/**
 * 原生对象。
 */
 public long nativeObj;


/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TBitmap(long nativeObj) {
   this.nativeObj = nativeObj;
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TBitmap cast(long nativeObj) {
   return new TBitmap(nativeObj);
 }


  /**
   * 创建图片对象(一般供脚本语言中使用)。
   * 
   *
   * @return 返回bitmap对象。
   */
 public  static TBitmap create()  {
    return new TBitmap(bitmap_create());
 }


  /**
   * 创建图片对象。
   * 
   * @param w 宽度。
   * @param h 高度。
   * @param line_length line_length。
   * @param format 格式。
   *
   * @return 返回bitmap对象。
   */
 public  static TBitmap createEx(int w, int h, int line_length, TBitmapFormat format)  {
    return new TBitmap(bitmap_create_ex(w, h, line_length, format.value()));
 }


  /**
   * 获取图片一个像素占用的字节数。
   * 
   *
   * @return 返回一个像素占用的字节数。
   */
 public  int getBpp()  {
    return bitmap_get_bpp(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 销毁图片。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet destroy()  {
   return TRet.from(bitmap_destroy(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 宽度。
   *
   */
 public int getW() {
   return bitmap_t_get_prop_w(this.nativeObj);
 }


  /**
   * 高度。
   *
   */
 public int getH() {
   return bitmap_t_get_prop_h(this.nativeObj);
 }


  /**
   * 每一行实际占用的内存(也称为stride或pitch)，一般情况下为w*bpp。
   *
   */
 public int getLineLength() {
   return bitmap_t_get_prop_line_length(this.nativeObj);
 }


  /**
   * 标志。请参考{bitmap_flag_t}。
   *
   */
 public int getFlags() {
   return bitmap_t_get_prop_flags(this.nativeObj);
 }


  /**
   * 格式。请参考{bitmap_format_t}。
   *
   */
 public int getFormat() {
   return bitmap_t_get_prop_format(this.nativeObj);
 }


  /**
   * 名称。
   *
   */
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
};