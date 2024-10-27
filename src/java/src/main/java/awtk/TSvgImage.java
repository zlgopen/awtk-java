package awtk;


/**
 * SVG图片控件。
 *
 *svg\_image\_t是[image\_base\_t](image_base_t.md)的子类控件，image\_base\_t的函数均适用于svg\_image\_t控件。
 *
 *在xml中使用"svg"标签创建SVG图片控件。如：
 *
 *```xml
 *<svg image="girl"/>
 *```
 *
 *>更多用法请参考：[svg image](
 *https://github.com/zlgopen/awtk/blob/master/design/default/ui/svg_image.xml)
 *
 *在c代码中使用函数svg\_image\_create创建SVG图片控件。如：
 *
 *
 *
 *> 创建之后: 需要用widget\_set\_image设置图片名称。
 *
 *> 完整示例请参考：[svg image demo](
 *https://github.com/zlgopen/awtk-c-demos/blob/master/demos/svg_image.c)
 *
 *可用通过style来设置控件的显示风格，如背景和边框等。如：
 *
 *```xml
 *<svg>
 *<style name="default">
 *<normal border_color="green" fg_color="red" />
 *</style>
 *</svg>
 *```
 *
 *> 更多用法请参考：[theme default](
 *https://github.com/zlgopen/awtk/blob/master/design/default/styles/default.xml)
 *
 */
public class TSvgImage extends TImageBase { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TSvgImage(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TSvgImage cast(long nativeObj) {
   return new TSvgImage(nativeObj);
 }


  /**
   * 创建svg_image对象
   * 
   * @param parent 父控件
   * @param x x坐标
   * @param y y坐标
   * @param w 宽度
   * @param h 高度
   *
   * @return 对象。
   */
 public  static TWidget create(TWidget parent, int x, int y, int w, int h)  {
    return new TSvgImage(svg_image_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 设置控件的图片名称。
   *
   *> 如果需要显示文件系统中的图片，只需将图片名称换成实际的文件名，并加上"file://"前缀即可。
   * 
   * @param name 图片名称，该图片必须存在于资源管理器。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setImage(String name)  {
   return TRet.from(svg_image_set_image(this != null ? (this.nativeObj) : 0, name));
 }


  /**
   * 控件设置是否开启离线缓存渲染模式。
   *
   *> 在确保svg图片不经常变化大小及状态的情况下，开启离线缓存渲染能够减少解析bsvg的开销，提高效率。
   * 
   * @param is_cache_mode 是否开启缓存模式。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setCacheMode(boolean is_cache_mode)  {
   return TRet.from(svg_image_set_cache_mode(this != null ? (this.nativeObj) : 0, is_cache_mode));
 }


  /**
   * 控件设置svg图片绘制模式。
   * 
   * @param draw_type 绘制模式。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setDrawType(TImageDrawType draw_type)  {
   return TRet.from(svg_image_set_draw_type(this != null ? (this.nativeObj) : 0, draw_type.value()));
 }


  /**
   * 转换为svg_image对象(供脚本语言使用)。
   * 
   * @param widget svg_image对象。
   *
   * @return svg_image对象。
   */
 public  static TSvgImage cast(TWidget widget)  {
    return new TSvgImage(svg_image_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 离线缓存渲染模式。
   *
   */
 public boolean getIsCacheMode() {
   return svg_image_t_get_prop_is_cache_mode(this.nativeObj);
 }


  /**
   * svg图片的绘制方式(支持旋转缩放, 目前仅支持scale、scale_auto模式)。
   *
   */
 public TImageDrawType getDrawType() {
   return TImageDrawType.from(svg_image_t_get_prop_draw_type(this.nativeObj));

 }

static private native long svg_image_create(long parent, int x, int y, int w, int h);
static private native int svg_image_set_image(long widget, String name);
static private native int svg_image_set_cache_mode(long widget, boolean is_cache_mode);
static private native int svg_image_set_draw_type(long widget, int draw_type);
static private native long svg_image_cast(long widget);
static private native boolean svg_image_t_get_prop_is_cache_mode(long nativeObj);
static private native int svg_image_t_get_prop_draw_type(long nativeObj);
};