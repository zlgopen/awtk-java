package awtk;


/**
 * 窗口事件，由窗口管理器触发。
 *
 */
public class WindowEvent extends Event {
 public long nativeObj;

 public WindowEvent(long nativeObj) {
   super(nativeObj);
 }

 static public WindowEvent cast(long nativeObj) {
   return new WindowEvent(nativeObj);
 }


/**
 * 把event对象转window_event_t对象。主要给脚本语言使用。
 * 
 * @param event event对象。
 *
 * @returns 对象。
 */
 public  static WindowEvent cast(Event event)  {
   return new WindowEvent(window_event_cast(event != null ? (event.nativeObj) : 0));
 }

 public Widget getWindow() {
   return new Widget(window_event_t_get_prop_window(this.nativeObj));
 }

static private native long window_event_cast(long event);
static private native long window_event_t_get_prop_window(long nativeObj);
}

