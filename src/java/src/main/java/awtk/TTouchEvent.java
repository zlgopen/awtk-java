package awtk;


/**
 * 多点触摸事件(目前主要对接 SDL_TouchFingerEvent(SDL_FINGERMOTION/SDL_FINGERDOWN/SDL_FINGERUP))。
 *
 */
public class TTouchEvent extends TEvent { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TTouchEvent(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TTouchEvent cast(long nativeObj) {
   return new TTouchEvent(nativeObj);
 }


  /**
   * 把event对象转touch_event_t对象。
   * 
   * @param event event对象。
   *
   * @return event 对象。
   */
 public  static TTouchEvent cast(TEvent event)  {
    return new TTouchEvent(touch_event_cast(event != null ? (event.nativeObj) : 0));
 }


  /**
   * 触摸ID。
   *
   */
 public long getTouchId() {
   return touch_event_t_get_prop_touch_id(this.nativeObj);
 }


  /**
   * 手指ID。
   *
   */
 public long getFingerId() {
   return touch_event_t_get_prop_finger_id(this.nativeObj);
 }


  /**
   * x坐标(在 0-1 之间，表示与屏幕宽度的比例）。
   *
   */
 public double getX() {
   return touch_event_t_get_prop_x(this.nativeObj);
 }


  /**
   * y坐标(在 0-1 之间，表示与屏幕高度的比例）。
   *
   */
 public double getY() {
   return touch_event_t_get_prop_y(this.nativeObj);
 }


  /**
   * 压力。
   *
   */
 public double getPressure() {
   return touch_event_t_get_prop_pressure(this.nativeObj);
 }

static private native long touch_event_cast(long event);
static private native long touch_event_t_get_prop_touch_id(long nativeObj);
static private native long touch_event_t_get_prop_finger_id(long nativeObj);
static private native double touch_event_t_get_prop_x(long nativeObj);
static private native double touch_event_t_get_prop_y(long nativeObj);
static private native double touch_event_t_get_prop_pressure(long nativeObj);
};