package awtk;


/**
 * 颜色。
 *
 */
public class TColor { 

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
 public TColor(long nativeObj) {
   this.nativeObj = nativeObj;
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TColor cast(long nativeObj) {
   return new TColor(nativeObj);
 }


  /**
   * 创建color对象。
   *
   *> 主要供脚本语言使用。
   * 
   * @param r 红色通道。
   * @param g 绿色通道。
   * @param b 蓝色通道。
   * @param a alpha通道。
   *
   * @return color对象。
   */
 public  static TColor create(int r, int g, int b, int a)  {
    return new TColor(color_create(r, g, b, a));
 }


  /**
   * 创建color对象。
   *
   *> 主要供脚本语言使用。
   * 
   * @param str css类似的颜色值。
   *
   * @return color对象。
   */
 public  TColor fromStr(String str)  {
    return new TColor(color_from_str(this != null ? (this.nativeObj) : 0, str));
 }


  /**
   * 获取红色通道的值。
   *
   *> 主要供脚本语言使用。
   * 
   *
   * @return 返回红色通道的值。
   */
 public  int r()  {
    return color_r(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 获取绿色通道的值。
   *
   *> 主要供脚本语言使用。
   * 
   *
   * @return 返回绿色通道的值。
   */
 public  int g()  {
    return color_g(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 获取蓝色通道的值。
   *
   *> 主要供脚本语言使用。
   * 
   *
   * @return 返回蓝色通道的值。
   */
 public  int b()  {
    return color_b(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 获取alpha通道的值。
   *
   *> 主要供脚本语言使用。
   * 
   *
   * @return 返回alpha通道的值。
   */
 public  int a()  {
    return color_a(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 获取颜色值。
   *
   *> 主要供脚本语言使用。
   * 
   *
   * @return 返回颜色值。
   */
 public  int getColor()  {
    return color_get_color(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 转换为color对象。
   *
   *> 供脚本语言使用。
   * 
   * @param color color对象。
   *
   * @return color对象。
   */
 public  static TColor cast(TColor color)  {
    return new TColor(color_cast(color != null ? (color.nativeObj) : 0));
 }


  /**
   * 销毁color对象。
   *> 主要供脚本语言使用。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet destroy()  {
   return TRet.from(color_destroy(this != null ? (this.nativeObj) : 0));
 }

static private native long color_create(int r, int g, int b, int a);
static private native long color_from_str(long c, String str);
static private native int color_r(long c);
static private native int color_g(long c);
static private native int color_b(long c);
static private native int color_a(long c);
static private native int color_get_color(long c);
static private native long color_cast(long color);
static private native int color_destroy(long c);
static private native int color_t_get_prop_color(long nativeObj);
static private native void color_t_set_prop_color(long nativeObj, int value);
};