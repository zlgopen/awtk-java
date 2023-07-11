package awtk;


/**
 * overlay窗口。
 *
 *overlay窗口有点类似于非模态的dialog，但是它位置和大小是完全自由的，窗口管理器不会对它做任何限制。
 *
 *如果overlay窗口有透明或半透效果，则不支持窗口动画，但可以通过移动窗口位置来实现类似动画的效果。
 *
 *overlay\_t是[window\_base\_t](window_base_t.md)的子类控件，window\_base\_t的函数均适用于overlay\_t控件。
 *
 *在xml中使用"overlay"标签创建窗口。需要指定坐标和大小，可以指定窗体样式和动画名称。如：
 *
 *```xml
 *<overlay theme="basic" x="100" y="100" w="200" h="300">
 *...
 *</overlay>
 *```
 *
 *>
 *更多用法请参考：[overlay.xml](https://github.com/zlgopen/awtk/blob/master/design/default/ui/)
 *
 *在c代码中使用函数overlay\_create创建窗口。如：
 *
 *
 *> 完整示例请参考：[overlay
 *demo](https://github.com/zlgopen/awtk-c-demos/blob/master/demos/)
 *
 *可用通过style来设置窗口的风格，如背景颜色或图片等。如：
 *
 *```xml
 *<style name="bricks">
 *<normal bg_image="bricks"  bg_image_draw_type="repeat"/>
 *</style>
 *```
 *
 *> 更多用法请参考：[theme
 *default](https://github.com/zlgopen/awtk/blob/master/design/default/styles/default.xml#L0)
 *
 */
public class TOverlay extends TWindowBase { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TOverlay(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TOverlay cast(long nativeObj) {
   return new TOverlay(nativeObj);
 }


  /**
   * 创建overlay对象
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
    return new TOverlay(overlay_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 设置是否启用点击穿透。
   * 
   * @param click_through 是否启用点击穿透。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setClickThrough(boolean click_through)  {
   return TRet.from(overlay_set_click_through(this != null ? (this.nativeObj) : 0, click_through));
 }


  /**
   * 设置是否总是在最上面。
   * 
   * @param always_on_top 是否总是在最上面。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setAlwaysOnTop(boolean always_on_top)  {
   return TRet.from(overlay_set_always_on_top(this != null ? (this.nativeObj) : 0, always_on_top));
 }


  /**
   * 设置是否非模态窗口模式。
   * 
   * @param modeless 是否非模态窗口模式。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setModeless(boolean modeless)  {
   return TRet.from(overlay_set_modeless(this != null ? (this.nativeObj) : 0, modeless));
 }


  /**
   * 转换为overlay对象(供脚本语言使用)。
   * 
   * @param widget overlay对象。
   *
   * @return overlay对象。
   */
 public  static TOverlay cast(TWidget widget)  {
    return new TOverlay(overlay_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 点击穿透。点击没有子控件的位置，是否穿透到底层窗口。
   *
   *缺省不启用。
   *
   */
 public boolean getClickThrough() {
   return overlay_t_get_prop_click_through(this.nativeObj);
 }


  /**
   * 是否总在最上面。
   *
   *缺省不启用。
   *
   */
 public boolean getAlwaysOnTop() {
   return overlay_t_get_prop_always_on_top(this.nativeObj);
 }


  /**
   * 非模态窗口。
   *
   *缺省不启用。
   *
   */
 public boolean getModeless() {
   return overlay_t_get_prop_modeless(this.nativeObj);
 }

static private native long overlay_create(long parent, int x, int y, int w, int h);
static private native int overlay_set_click_through(long widget, boolean click_through);
static private native int overlay_set_always_on_top(long widget, boolean always_on_top);
static private native int overlay_set_modeless(long widget, boolean modeless);
static private native long overlay_cast(long widget);
static private native boolean overlay_t_get_prop_click_through(long nativeObj);
static private native boolean overlay_t_get_prop_always_on_top(long nativeObj);
static private native boolean overlay_t_get_prop_modeless(long nativeObj);
};