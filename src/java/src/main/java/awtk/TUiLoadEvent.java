package awtk;


/**
 * UI加载完成事件。
 *
 */
public class TUiLoadEvent extends TEvent { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TUiLoadEvent(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TUiLoadEvent cast(long nativeObj) {
   return new TUiLoadEvent(nativeObj);
 }


  /**
   * 把event对象转ui_load_event_t对象。
   * 
   * @param event event对象。
   *
   * @return event 对象。
   */
 public  static TUiLoadEvent cast(TEvent event)  {
    return new TUiLoadEvent(ui_load_event_cast(event != null ? (event.nativeObj) : 0));
 }


  /**
   * UI的根控件对象。
   *
   */
 public TWidget getRoot() {
   return new TWidget(ui_load_event_t_get_prop_root(this.nativeObj));
 }


  /**
   * UI的名称。
   *
   */
 public String getName() {
   return ui_load_event_t_get_prop_name(this.nativeObj);
 }

static private native long ui_load_event_cast(long event);
static private native long ui_load_event_t_get_prop_root(long nativeObj);
static private native String ui_load_event_t_get_prop_name(long nativeObj);
};