package awtk;

public class WindowManager extends Widget {
 public WindowManager(long nativeObj) {
   super(nativeObj);
 }

 static public WindowManager cast(long nativeObj) {
   return new WindowManager(nativeObj);
 }

 public  static Widget instance()  {
   return new WindowManager(window_manager());
 }

 public  static Widget cast(Widget widget)  {
   return new WindowManager(window_manager_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public  Widget getTopMainWindow()  {
   return new Widget(window_manager_get_top_main_window(this.nativeObj));
 }

 public  Widget getTopWindow()  {
   return new Widget(window_manager_get_top_window(this.nativeObj));
 }

 public  Widget getPrevWindow()  {
   return new Widget(window_manager_get_prev_window(this.nativeObj));
 }

 public  int getPointerX()  {
   return window_manager_get_pointer_x(this.nativeObj);
 }

 public  int getPointerY()  {
   return window_manager_get_pointer_y(this.nativeObj);
 }

 public  boolean getPointerPressed()  {
   return window_manager_get_pointer_pressed(this.nativeObj);
 }

 public  Ret setShowFps(boolean show_fps)  {
   return Ret.from(window_manager_set_show_fps(this.nativeObj, show_fps));
 }

 public  Ret setScreenSaverTime(int screen_saver_time)  {
   return Ret.from(window_manager_set_screen_saver_time(this.nativeObj, screen_saver_time));
 }

 public  Ret setCursor(String cursor)  {
   return Ret.from(window_manager_set_cursor(this.nativeObj, cursor));
 }

 public  Ret back()  {
   return Ret.from(window_manager_back(this.nativeObj));
 }

 public  Ret backToHome()  {
   return Ret.from(window_manager_back_to_home(this.nativeObj));
 }

 public  Ret backTo(String target)  {
   return Ret.from(window_manager_back_to(this.nativeObj, target));
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

