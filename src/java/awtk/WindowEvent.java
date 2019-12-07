package awtk;

public class WindowEvent extends Event {
 public WindowEvent(long nativeObj) {
   super(nativeObj);
 }

 static public WindowEvent cast(long nativeObj) {
   return new WindowEvent(nativeObj);
 }

 public  static WindowEvent cast(Event event)  {
   return new WindowEvent(window_event_cast(event != null ? (event.nativeObj) : 0));
 }

 public Widget getWindow() {
   return new Widget(window_event_t_get_prop_window(this.nativeObj));
 }

static private native long window_event_cast(long event);
static private native long window_event_t_get_prop_window(long nativeObj);
}

