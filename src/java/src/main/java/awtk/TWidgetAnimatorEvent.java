package awtk;


/**
 * 控件动画事件。
 *
 */
public class TWidgetAnimatorEvent extends TEvent { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TWidgetAnimatorEvent(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TWidgetAnimatorEvent cast(long nativeObj) {
   return new TWidgetAnimatorEvent(nativeObj);
 }


  /**
   * 把event对象转widget_animator_event_t对象。
   * 
   * @param event event对象。
   *
   * @return event对象。
   */
 public  static TWidgetAnimatorEvent cast(TEvent event)  {
    return new TWidgetAnimatorEvent(widget_animator_event_cast(event != null ? (event.nativeObj) : 0));
 }


  /**
   * 控件对象。
   *
   */
 public TWidget getWidget() {
   return new TWidget(widget_animator_event_t_get_prop_widget(this.nativeObj));
 }


  /**
   * 控件动画句柄。
   *
   */
 public long getAnimator() {
   return widget_animator_event_t_get_prop_animator(this.nativeObj);
 }

static private native long widget_animator_event_cast(long event);
static private native long widget_animator_event_t_get_prop_widget(long nativeObj);
static private native long widget_animator_event_t_get_prop_animator(long nativeObj);
};