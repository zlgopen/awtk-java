package awtk;


/**
 * 窗口管理器。
 *
 */
public class TWindowManager extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TWindowManager(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TWindowManager cast(long nativeObj) {
   return new TWindowManager(nativeObj);
 }


  /**
   * 获取全局window_manager对象
   * 
   *
   * @return 对象。
   */
 public  static TWindowManager instance()  {
    return new TWindowManager(window_manager());
 }


  /**
   * 转换为window_manager对象(供脚本语言使用)。
   * 
   * @param widget window_manager对象。
   *
   * @return window_manager对象。
   */
 public  static TWindowManager cast(TWidget widget)  {
    return new TWindowManager(window_manager_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 获取最上面的主窗口。
   * 
   *
   * @return 返回窗口对象。
   */
 public  TWidget getTopMainWindow()  {
    return new TWidget(window_manager_get_top_main_window(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 获取最上面的窗口。
   * 
   *
   * @return 返回窗口对象。
   */
 public  TWidget getTopWindow()  {
    return new TWidget(window_manager_get_top_window(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 获取前一个的窗口。
   * 
   *
   * @return 返回窗口对象。
   */
 public  TWidget getPrevWindow()  {
    return new TWidget(window_manager_get_prev_window(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 获取指针当前的X坐标。
   * 
   *
   * @return 返回指针当前的X坐标。
   */
 public  int getPointerX()  {
    return window_manager_get_pointer_x(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 获取指针当前的Y坐标。
   * 
   *
   * @return 返回指针当前的X坐标。
   */
 public  int getPointerY()  {
    return window_manager_get_pointer_y(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 获取指针当前是否按下。
   * 
   *
   * @return 返回指针当前是否按下。
   */
 public  boolean getPointerPressed()  {
    return window_manager_get_pointer_pressed(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 获取当前窗口动画是否正在播放。
   * 
   *
   * @return 返回TRUE表示正在播放，FALSE表示没有播放。
   */
 public  boolean isAnimating()  {
    return window_manager_is_animating(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 设置是否显示FPS。
   * 
   * @param show_fps 是否显示FPS。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setShowFps(boolean show_fps)  {
   return TRet.from(window_manager_set_show_fps(this != null ? (this.nativeObj) : 0, show_fps));
 }


  /**
   * 设置屏保时间。
   * 
   * @param screen_saver_time 屏保时间(单位毫秒), 为0关闭屏保。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setScreenSaverTime(int screen_saver_time)  {
   return TRet.from(window_manager_set_screen_saver_time(this != null ? (this.nativeObj) : 0, screen_saver_time));
 }


  /**
   * 设置鼠标指针。
   * 
   * @param cursor 图片名称(从图片管理器中加载)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setCursor(String cursor)  {
   return TRet.from(window_manager_set_cursor(this != null ? (this.nativeObj) : 0, cursor));
 }


  /**
   * 请求关闭顶层窗口。
   *
   *> 如果顶层窗口时模态对话框，用DIALOG\_QUIT\_NONE调用dialog\_quit。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet back()  {
   return TRet.from(window_manager_back(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 回到主窗口，关闭之上的全部窗口。
   *
   *> 如果顶层窗口时模态对话框，用DIALOG\_QUIT\_NONE调用dialog\_quit。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet backToHome()  {
   return TRet.from(window_manager_back_to_home(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 回到指定的窗口，关闭之上的全部窗口。
   *
   *> 如果顶层窗口时模态对话框，用DIALOG\_QUIT\_NONE调用dialog\_quit。
   * 
   * @param target 目标窗口的名称。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet backTo(String target)  {
   return TRet.from(window_manager_back_to(this != null ? (this.nativeObj) : 0, target));
 }


  /**
   * 调整原生窗口的大小。
   * 
   * @param w 宽度
   * @param h 高度
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet resize(int w, int h)  {
   return TRet.from(window_manager_resize(this != null ? (this.nativeObj) : 0, w, h));
 }

static private native long window_manager();
static private native long window_manager_cast(long widget);
static private native long window_manager_get_top_main_window(long widget);
static private native long window_manager_get_top_window(long widget);
static private native long window_manager_get_prev_window(long widget);
static private native int window_manager_get_pointer_x(long widget);
static private native int window_manager_get_pointer_y(long widget);
static private native boolean window_manager_get_pointer_pressed(long widget);
static private native boolean window_manager_is_animating(long widget);
static private native int window_manager_set_show_fps(long widget, boolean show_fps);
static private native int window_manager_set_screen_saver_time(long widget, int screen_saver_time);
static private native int window_manager_set_cursor(long widget, String cursor);
static private native int window_manager_back(long widget);
static private native int window_manager_back_to_home(long widget);
static private native int window_manager_back_to(long widget, String target);
static private native int window_manager_resize(long widget, int w, int h);
};