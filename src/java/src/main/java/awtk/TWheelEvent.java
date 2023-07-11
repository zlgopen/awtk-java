package awtk;


/**
 * 滚轮事件。
 *
 */
public class TWheelEvent extends TEvent { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TWheelEvent(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TWheelEvent cast(long nativeObj) {
   return new TWheelEvent(nativeObj);
 }


  /**
   * 把event对象转wheel_event_t对象。
   * 
   * @param event event对象。
   *
   * @return event对象。
   */
 public  static TWheelEvent cast(TEvent event)  {
    return new TWheelEvent(wheel_event_cast(event != null ? (event.nativeObj) : 0));
 }


  /**
   * 滚轮的y值。
   *
   */
 public int getDy() {
   return wheel_event_t_get_prop_dy(this.nativeObj);
 }


  /**
   * alt键是否按下。
   *
   */
 public boolean getAlt() {
   return wheel_event_t_get_prop_alt(this.nativeObj);
 }


  /**
   * ctrl键是否按下。
   *
   */
 public boolean getCtrl() {
   return wheel_event_t_get_prop_ctrl(this.nativeObj);
 }


  /**
   * shift键是否按下。
   *
   */
 public boolean getShift() {
   return wheel_event_t_get_prop_shift(this.nativeObj);
 }

static private native long wheel_event_cast(long event);
static private native int wheel_event_t_get_prop_dy(long nativeObj);
static private native boolean wheel_event_t_get_prop_alt(long nativeObj);
static private native boolean wheel_event_t_get_prop_ctrl(long nativeObj);
static private native boolean wheel_event_t_get_prop_shift(long nativeObj);
};