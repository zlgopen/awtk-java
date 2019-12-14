package awtk;


/**
 * 窗口。
 * 
 *  本类把窗口相关的公共行为进行抽象，放到一起方便重用。目前已知的具体实现如下图：
 * 
 *  ```graphviz
 *    [default_style]
 * 
 *    window_t -> window_base_t[arrowhead = "empty"]
 *    popup_t -> window_base_t[arrowhead = "empty"]
 *    dialog_t -> window_base_t[arrowhead = "empty"]
 *    system_bar_t -> window_base_t[arrowhead = "empty"]
 *    calibration_win_t -> window_base_t[arrowhead = "empty"]
 *  ```
 * 
 * 本类是一个抽象类，不能进行实例化。请在应用程序中使用具体的类，如window\_t。
 *
 */
public class WindowBase extends Widget {
 public long nativeObj;

 public WindowBase(long nativeObj) {
   super(nativeObj);
 }

 static public WindowBase cast(long nativeObj) {
   return new WindowBase(nativeObj);
 }


/**
 * 转换为window_base对象(供脚本语言使用)。
 * 
 * @param widget window_base对象。
 *
 * @returns window_base对象。
 */
 public  static WindowBase cast(Widget widget)  {
   return new WindowBase(window_base_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public String getTheme() {
   return window_base_t_get_prop_theme(this.nativeObj);
 }

 public WindowClosable getClosable() {
   return WindowClosable.from(window_base_t_get_prop_closable(this.nativeObj));

 }

static private native long window_base_cast(long widget);
static private native String window_base_t_get_prop_theme(long nativeObj);
static private native int window_base_t_get_prop_closable(long nativeObj);
}

