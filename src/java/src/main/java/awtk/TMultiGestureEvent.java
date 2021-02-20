package awtk;


/**
 * 多点触摸手势事件。
 *
 */
public class TMultiGestureEvent extends TEvent { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TMultiGestureEvent(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TMultiGestureEvent cast(long nativeObj) {
   return new TMultiGestureEvent(nativeObj);
 }


  /**
   * 把event对象转multi_gesture_event_t对象，主要给脚本语言使用。
   * 
   * @param event event对象。
   *
   * @return event对象。
   */
 public  static TMultiGestureEvent cast(TEvent event)  {
    return new TMultiGestureEvent(multi_gesture_event_cast(event != null ? (event.nativeObj) : 0));
 }


  /**
   * 中心点x坐标。
   *
   */
 public int getX() {
   return multi_gesture_event_t_get_prop_x(this.nativeObj);
 }


  /**
   * 中心点y坐标。
   *
   */
 public int getY() {
   return multi_gesture_event_t_get_prop_y(this.nativeObj);
 }


  /**
   * 旋转角度(幅度)增量。（单位弧度）
   *
   */
 public double getRotation() {
   return multi_gesture_event_t_get_prop_rotation(this.nativeObj);
 }


  /**
   * 两点间的距离增量。(-1,0)表示缩小，(0-1)表示增加。
   *
   */
 public double getDistance() {
   return multi_gesture_event_t_get_prop_distance(this.nativeObj);
 }

static private native long multi_gesture_event_cast(long event);
static private native int multi_gesture_event_t_get_prop_x(long nativeObj);
static private native int multi_gesture_event_t_get_prop_y(long nativeObj);
static private native double multi_gesture_event_t_get_prop_rotation(long nativeObj);
static private native double multi_gesture_event_t_get_prop_distance(long nativeObj);
};