package awtk;


/**
 * 窗口管理器。
 *
 */
public class WindowManager extends Widget {
 public long nativeObj;

 public WindowManager(long nativeObj) {
   super(nativeObj);
 }

 static public WindowManager cast(long nativeObj) {
   return new WindowManager(nativeObj);
 }


/**
 * 获取全局window_manager对象
 * 
 *
 * @returns 对象。
 */
 public  static WindowManager instance()  {
   return new WindowManager(window_manager());
 }


/**
 * 转换为window_manager对象(供脚本语言使用)。
 * 
 * @param widget window_manager对象。
 *
 * @returns window_manager对象。
 */
 public  static WindowManager cast(Widget widget)  {
   return new WindowManager(window_manager_cast(widget != null ? (widget.nativeObj) : 0));
 }


/**
 * 获取最上面的主窗口。
 * 
 * @param widget 窗口管理器对象。
 *
 * @returns 返回窗口对象。
 */
 public  Widget getTopMainWindow()  {
   return new Widget(window_manager_get_top_main_window(this != null ? (this.nativeObj) : 0));
 }


/**
 * 获取最上面的窗口。
 * 
 * @param widget 窗口管理器对象。
 *
 * @returns 返回窗口对象。
 */
 public  Widget getTopWindow()  {
   return new Widget(window_manager_get_top_window(this != null ? (this.nativeObj) : 0));
 }


/**
 * 获取前一个的窗口。
 * 
 * @param widget 窗口管理器对象。
 *
 * @returns 返回窗口对象。
 */
 public  Widget getPrevWindow()  {
   return new Widget(window_manager_get_prev_window(this != null ? (this.nativeObj) : 0));
 }


/**
 * 获取指针当前的X坐标。
 * 
 * @param widget 窗口管理器对象。
 *
 * @returns 返回指针当前的X坐标。
 */
 public  int getPointerX()  {
   return window_manager_get_pointer_x(this != null ? (this.nativeObj) : 0);
 }


/**
 * 获取指针当前的Y坐标。
 * 
 * @param widget 窗口管理器对象。
 *
 * @returns 返回指针当前的X坐标。
 */
 public  int getPointerY()  {
   return window_manager_get_pointer_y(this != null ? (this.nativeObj) : 0);
 }


/**
 * 获取指针当前是否按下。
 * 
 * @param widget 窗口管理器对象。
 *
 * @returns 返回指针当前是否按下。
 */
 public  boolean getPointerPressed()  {
   return window_manager_get_pointer_pressed(this != null ? (this.nativeObj) : 0);
 }


/**
 * 设置是否显示FPS。
 * 
 * @param widget 窗口管理器对象。
 * @param show_fps 是否显示FPS。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setShowFps(boolean show_fps)  {
   return Ret.from(window_manager_set_show_fps(this != null ? (this.nativeObj) : 0, show_fps));
 }


/**
 * 设置屏保时间。
 * 
 * @param widget 窗口管理器对象。
 * @param screen_saver_time 屏保时间(单位毫秒)。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setScreenSaverTime(int screen_saver_time)  {
   return Ret.from(window_manager_set_screen_saver_time(this != null ? (this.nativeObj) : 0, screen_saver_time));
 }


/**
 * 设置鼠标指针。
 * 
 * @param widget 窗口管理器对象。
 * @param cursor 图片名称(从图片管理器中加载)。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setCursor(String cursor)  {
   return Ret.from(window_manager_set_cursor(this != null ? (this.nativeObj) : 0, cursor));
 }


/**
 * 请求关闭顶层窗口。
 *  
 * 如果顶层窗口时模态对话框，用DIALOG\_QUIT\_NONE调用dialog\_quit。
 * 
 * @param widget 窗口管理器对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret back()  {
   return Ret.from(window_manager_back(this != null ? (this.nativeObj) : 0));
 }


/**
 * 回到主窗口，关闭之上的全部窗口。
 * 
 * 如果顶层窗口时模态对话框，用DIALOG\_QUIT\_NONE调用dialog\_quit。
 * 
 * @param widget 窗口管理器对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret backToHome()  {
   return Ret.from(window_manager_back_to_home(this != null ? (this.nativeObj) : 0));
 }


/**
 * 回到指定的窗口，关闭之上的全部窗口。
 * 
 * 如果顶层窗口时模态对话框，用DIALOG\_QUIT\_NONE调用dialog\_quit。
 * 
 * @param widget 窗口管理器对象。
 * @param target 目标窗口的名称。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret backTo(String target)  {
   return Ret.from(window_manager_back_to(this != null ? (this.nativeObj) : 0, target));
 }

static private native long window_manager();
static private native long window_manager_cast(long widget);
static private native long window_manager_get_top_main_window(long widget);
static private native long window_manager_get_top_window(long widget);
static private native long window_manager_get_prev_window(long widget);
static private native int window_manager_get_pointer_x(long widget);
static private native int window_manager_get_pointer_y(long widget);
static private native boolean window_manager_get_pointer_pressed(long widget);
static private native int window_manager_set_show_fps(long widget, boolean show_fps);
static private native int window_manager_set_screen_saver_time(long widget, int screen_saver_time);
static private native int window_manager_set_cursor(long widget, String cursor);
static private native int window_manager_back(long widget);
static private native int window_manager_back_to_home(long widget);
static private native int window_manager_back_to(long widget, String target);
}

