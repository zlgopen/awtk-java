package awtk;


/**
 * 提供基本的绘图功能和状态管理。
 *
 */
public class TCanvas { 

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
 public TCanvas(long nativeObj) {
   this.nativeObj = nativeObj;
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TCanvas cast(long nativeObj) {
   return new TCanvas(nativeObj);
 }


  /**
   * 获取画布的宽度。
   * 
   *
   * @return 返回画布的宽度。
   */
 public  int getWidth()  {
    return canvas_get_width(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 获取画布的高度。
   * 
   *
   * @return 返回画布的高度。
   */
 public  int getHeight()  {
    return canvas_get_height(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 获取裁剪区。
   * 
   * @param r rect对象。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet getClipRect(TRect r)  {
   return TRet.from(canvas_get_clip_rect(this != null ? (this.nativeObj) : 0, r != null ? (r.nativeObj) : 0));
 }


  /**
   * 设置裁剪区。
   * 
   * @param r rect对象。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setClipRect(TRect r)  {
   return TRet.from(canvas_set_clip_rect(this != null ? (this.nativeObj) : 0, r != null ? (r.nativeObj) : 0));
 }


  /**
   * 设置裁剪区。
   * 
   * @param r rect对象。
   * @param translate 是否将裁剪区的位置加上canvas当前的偏移。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setClipRectEx(TRect r, boolean translate)  {
   return TRet.from(canvas_set_clip_rect_ex(this != null ? (this.nativeObj) : 0, r != null ? (r.nativeObj) : 0, translate));
 }


  /**
   * 设置填充颜色。
   *
   *> 供脚本语言使用。
   * 
   * @param color 颜色。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setFillColor(String color)  {
   return TRet.from(canvas_set_fill_color_str(this != null ? (this.nativeObj) : 0, color));
 }


  /**
   * 设置文本颜色。
   *
   *> 供脚本语言使用。
   * 
   * @param color 颜色。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setTextColor(String color)  {
   return TRet.from(canvas_set_text_color_str(this != null ? (this.nativeObj) : 0, color));
 }


  /**
   * 设置线条颜色。
   *
   *> 供脚本语言使用。
   * 
   * @param color 颜色。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setStrokeColor(String color)  {
   return TRet.from(canvas_set_stroke_color_str(this != null ? (this.nativeObj) : 0, color));
 }


  /**
   * 设置全局alpha值。
   * 
   * @param alpha alpha值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setGlobalAlpha(int alpha)  {
   return TRet.from(canvas_set_global_alpha(this != null ? (this.nativeObj) : 0, alpha));
 }


  /**
   * 平移原点坐标。
   * 
   * @param dx x偏移。
   * @param dy y偏移。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet translate(int dx, int dy)  {
   return TRet.from(canvas_translate(this != null ? (this.nativeObj) : 0, dx, dy));
 }


  /**
   * 反向平移原点坐标。
   * 
   * @param dx x偏移。
   * @param dy y偏移。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet untranslate(int dx, int dy)  {
   return TRet.from(canvas_untranslate(this != null ? (this.nativeObj) : 0, dx, dy));
 }


  /**
   * 画垂直线。
   * 
   * @param x x坐标。
   * @param y y坐标。
   * @param h 高度。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet drawVline(int x, int y, int h)  {
   return TRet.from(canvas_draw_vline(this != null ? (this.nativeObj) : 0, x, y, h));
 }


  /**
   * 画水平线。
   * 
   * @param x x坐标。
   * @param y y坐标。
   * @param w 宽度。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet drawHline(int x, int y, int w)  {
   return TRet.from(canvas_draw_hline(this != null ? (this.nativeObj) : 0, x, y, w));
 }


  /**
   * 填充矩形。
   * 
   * @param x x坐标。
   * @param y y坐标。
   * @param w 宽度。
   * @param h 高度。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet fillRect(int x, int y, int w, int h)  {
   return TRet.from(canvas_fill_rect(this != null ? (this.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 绘制矩形。
   * 
   * @param x x坐标。
   * @param y y坐标。
   * @param w 宽度。
   * @param h 高度。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet strokeRect(int x, int y, int w, int h)  {
   return TRet.from(canvas_stroke_rect(this != null ? (this.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 设置字体。
   * 
   * @param name 字体名称。
   * @param size 字体大小。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setFont(String name, int size)  {
   return TRet.from(canvas_set_font(this != null ? (this.nativeObj) : 0, name, size));
 }


  /**
   * 计算文本所占的宽度。
   *
   *> 供脚本语言使用。
   * 
   * @param str 字符串。
   *
   * @return 返回文本所占的宽度。
   */
 public  double measureText(String str)  {
    return canvas_measure_utf8(this != null ? (this.nativeObj) : 0, str);
 }


  /**
   * 绘制文本。
   *
   *> 供脚本语言使用。
   * 
   * @param str 字符串。
   * @param x x坐标。
   * @param y y坐标。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet drawText(String str, int x, int y)  {
   return TRet.from(canvas_draw_utf8(this != null ? (this.nativeObj) : 0, str, x, y));
 }


  /**
   * 绘制文本。
   *
   *> 供脚本语言使用。
   * 
   * @param str 字符串。
   * @param r 矩形区域。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet drawTextInRect(String str, TRect r)  {
   return TRet.from(canvas_draw_utf8_in_rect(this != null ? (this.nativeObj) : 0, str, r != null ? (r.nativeObj) : 0));
 }


  /**
   * 绘制图标。
   * 
   * @param img 图片对象。
   * @param cx 中心点x坐标。
   * @param cy 中心点y坐标。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet drawIcon(TBitmap img, int cx, int cy)  {
   return TRet.from(canvas_draw_icon(this != null ? (this.nativeObj) : 0, img != null ? (img.nativeObj) : 0, cx, cy));
 }


  /**
   * 绘制图片。
   * 
   * @param img 图片对象。
   * @param src 源区域。
   * @param dst 目的区域。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet drawImage(TBitmap img, TRect src, TRect dst)  {
   return TRet.from(canvas_draw_image(this != null ? (this.nativeObj) : 0, img != null ? (img.nativeObj) : 0, src != null ? (src.nativeObj) : 0, dst != null ? (dst.nativeObj) : 0));
 }


  /**
   * 绘制图片。
   * 
   * @param img 图片对象。
   * @param draw_type 绘制类型。
   * @param dst 目的区域。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet drawImageEx(TBitmap img, TImageDrawType draw_type, TRect dst)  {
   return TRet.from(canvas_draw_image_ex(this != null ? (this.nativeObj) : 0, img != null ? (img.nativeObj) : 0, draw_type.value(), dst != null ? (dst.nativeObj) : 0));
 }


  /**
   * 获取vgcanvas对象。
   * 
   *
   * @return 返回vgcanvas对象。
   */
 public  TVgcanvas getVgcanvas()  {
    return new TVgcanvas(canvas_get_vgcanvas(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 转换为canvas对象(供脚本语言使用)。
   * 
   * @param c canvas对象。
   *
   * @return canvas对象。
   */
 public  static TCanvas cast(TCanvas c)  {
    return new TCanvas(canvas_cast(c != null ? (c.nativeObj) : 0));
 }


  /**
   * 释放相关资源。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet reset()  {
   return TRet.from(canvas_reset(this != null ? (this.nativeObj) : 0));
 }


  /**
   * x坐标偏移。
   *
   */
 public int getOx() {
   return canvas_t_get_prop_ox(this.nativeObj);
 }


  /**
   * y坐标偏移。
   *
   */
 public int getOy() {
   return canvas_t_get_prop_oy(this.nativeObj);
 }


  /**
   * 当前字体名称。
   *
   */
 public String getFontName() {
   return canvas_t_get_prop_font_name(this.nativeObj);
 }


  /**
   * 当前字体大小。
   *
   */
 public int getFontSize() {
   return canvas_t_get_prop_font_size(this.nativeObj);
 }


  /**
   * 当前全局alpha。
   *
   */
 public int getGlobalAlpha() {
   return canvas_t_get_prop_global_alpha(this.nativeObj);
 }

static private native int canvas_get_width(long c);
static private native int canvas_get_height(long c);
static private native int canvas_get_clip_rect(long c, long r);
static private native int canvas_set_clip_rect(long c, long r);
static private native int canvas_set_clip_rect_ex(long c, long r, boolean translate);
static private native int canvas_set_fill_color_str(long c, String color);
static private native int canvas_set_text_color_str(long c, String color);
static private native int canvas_set_stroke_color_str(long c, String color);
static private native int canvas_set_global_alpha(long c, int alpha);
static private native int canvas_translate(long c, int dx, int dy);
static private native int canvas_untranslate(long c, int dx, int dy);
static private native int canvas_draw_vline(long c, int x, int y, int h);
static private native int canvas_draw_hline(long c, int x, int y, int w);
static private native int canvas_fill_rect(long c, int x, int y, int w, int h);
static private native int canvas_stroke_rect(long c, int x, int y, int w, int h);
static private native int canvas_set_font(long c, String name, int size);
static private native double canvas_measure_utf8(long c, String str);
static private native int canvas_draw_utf8(long c, String str, int x, int y);
static private native int canvas_draw_utf8_in_rect(long c, String str, long r);
static private native int canvas_draw_icon(long c, long img, int cx, int cy);
static private native int canvas_draw_image(long c, long img, long src, long dst);
static private native int canvas_draw_image_ex(long c, long img, int draw_type, long dst);
static private native long canvas_get_vgcanvas(long c);
static private native long canvas_cast(long c);
static private native int canvas_reset(long c);
static private native int canvas_t_get_prop_ox(long nativeObj);
static private native int canvas_t_get_prop_oy(long nativeObj);
static private native String canvas_t_get_prop_font_name(long nativeObj);
static private native int canvas_t_get_prop_font_size(long nativeObj);
static private native int canvas_t_get_prop_global_alpha(long nativeObj);
};