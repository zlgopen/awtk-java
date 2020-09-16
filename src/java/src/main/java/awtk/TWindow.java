package awtk;


/**
 * 窗口。
 *
 *缺省的应用程序窗口，占用除system\_bar\_t之外的整个区域，请不要修改它的位置和大小(除非你清楚后果)。
 *
 *window\_t是[window\_base\_t](window_base_t.md)的子类控件，window\_base\_t的函数均适用于window\_t控件。
 *
 *在xml中使用"window"标签创建窗口。无需指定坐标和大小，可以指定主题和动画名称。如：
 *
 *```xml
 *<window theme="basic" anim_hint="htranslate">
 *...
 *</window>
 *```
 *
 *>
 *更多用法请参考：[window.xml](https://github.com/zlgopen/awtk/blob/master/design/default/ui/)
 *
 *在c代码中使用函数window\_create创建窗口。如：
 *
 *
 *> 无需指定父控件、坐标和大小，使用0即可。
 *
 *> 完整示例请参考：[window
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
public class TWindow extends TWindowBase { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TWindow(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TWindow cast(long nativeObj) {
   return new TWindow(nativeObj);
 }


  /**
   * 创建window对象
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
    return new TWindow(window_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 以缺省的方式创建window对象。
   * 
   *
   * @return 对象。
   */
 public  static TWidget createDefault()  {
    return new TWindow(window_create_default());
 }


  /**
   * 设置为全屏窗口。
   *
   *>这里全屏是指与LCD相同大小，而非让SDL窗口全屏。
   * 
   * @param fullscreen 是否全屏。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setFullscreen(boolean fullscreen)  {
   return TRet.from(window_set_fullscreen(this != null ? (this.nativeObj) : 0, fullscreen));
 }


  /**
   * 从资源文件中加载并创建window_base对象。本函数在ui_loader/ui_builder_default里实现。
   * 
   * @param name window的名称。
   *
   * @return 对象。
   */
 public  static TWidget open(String name)  {
    return new TWindow(window_open(name));
 }


  /**
   * 从资源文件中加载并创建window对象。本函数在ui_loader/ui_builder_default里实现。
   * 
   * @param name window的名称。
   * @param to_close 关闭该窗口。
   *
   * @return 对象。
   */
 public  static TWidget openAndClose(String name, TWidget to_close)  {
    return new TWindow(window_open_and_close(name, to_close != null ? (to_close.nativeObj) : 0));
 }


  /**
   * 关闭窗口。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet close()  {
   return TRet.from(window_close(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 立即无条件关闭窗口(无动画)。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet closeForce()  {
   return TRet.from(window_close_force(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 转换为window对象(供脚本语言使用)。
   * 
   * @param widget window对象。
   *
   * @return window对象。
   */
 public  static TWindow cast(TWidget widget)  {
    return new TWindow(window_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 是否全屏。
   *
   *>这里全屏是指与LCD相同大小，而非让SDL窗口全屏。
   *
   */
 public boolean getFullscreen() {
   return window_t_get_prop_fullscreen(this.nativeObj);
 }

static private native long window_create(long parent, int x, int y, int w, int h);
static private native long window_create_default();
static private native int window_set_fullscreen(long widget, boolean fullscreen);
static private native long window_open(String name);
static private native long window_open_and_close(String name, long to_close);
static private native int window_close(long widget);
static private native int window_close_force(long widget);
static private native long window_cast(long widget);
static private native boolean window_t_get_prop_fullscreen(long nativeObj);
};