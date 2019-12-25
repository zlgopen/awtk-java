package awtk;


/**
 * 滚轮事件。
 *
 */
public class TOrientationEvent extends TEvent { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TOrientationEvent(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TOrientationEvent cast(long nativeObj) {
   return new TOrientationEvent(nativeObj);
 }


  /**
   * 把event对象转orientation_event_t对象，主要给脚本语言使用。
   * 
   * @param event event对象。
   *
   * @return event对象。
   */
 public  static TOrientationEvent cast(TEvent event)  {
    return new TOrientationEvent(orientation_event_cast(event != null ? (event.nativeObj) : 0));
 }


  /**
   * 屏幕方向。
   *
   */
 public int getOrientation() {
   return orientation_event_t_get_prop_orientation(this.nativeObj);
 }

static private native long orientation_event_cast(long event);
static private native int orientation_event_t_get_prop_orientation(long nativeObj);
};