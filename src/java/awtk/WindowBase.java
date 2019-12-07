package awtk;

public class WindowBase extends Widget {
 public WindowBase(long nativeObj) {
   super(nativeObj);
 }

 static public WindowBase cast(long nativeObj) {
   return new WindowBase(nativeObj);
 }

 public  static Widget cast(Widget widget)  {
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

