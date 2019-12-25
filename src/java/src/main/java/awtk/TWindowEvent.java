package awtk;


/**
 * 窗口事件，由窗口管理器触发。
 *
 */
public class TWindowEvent extends TEvent { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TWindowEvent(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TWindowEvent cast(long nativeObj) {
   return new TWindowEvent(nativeObj);
 }


  /**
   * 把event对象转window_event_t对象。主要给脚本语言使用。
   * 
   * @param event event对象。
   *
   * @return 对象。
   */
 public  static TWindowEvent cast(TEvent event)  {
    return new TWindowEvent(window_event_cast(event != null ? (event.nativeObj) : 0));
 }


  /**
   * canvas。
   *
   */
 public TWidget getWindow() {
   return new TWidget(window_event_t_get_prop_window(this.nativeObj));
 }

static private native long window_event_cast(long event);
static private native long window_event_t_get_prop_window(long nativeObj);
};