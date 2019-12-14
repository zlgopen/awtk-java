package awtk;


/**
 * 滚轮事件。
 *
 */
public class OrientationEvent extends Event {
 public long nativeObj;

 public OrientationEvent(long nativeObj) {
   super(nativeObj);
 }

 static public OrientationEvent cast(long nativeObj) {
   return new OrientationEvent(nativeObj);
 }


/**
 * 把event对象转orientation_event_t对象，主要给脚本语言使用。
 * 
 * @param event event对象。
 *
 * @returns event对象。
 */
 public  static OrientationEvent cast(Event event)  {
   return new OrientationEvent(orientation_event_cast(event != null ? (event.nativeObj) : 0));
 }

 public int getOrientation() {
   return orientation_event_t_get_prop_orientation(this.nativeObj);
 }

static private native long orientation_event_cast(long event);
static private native int orientation_event_t_get_prop_orientation(long nativeObj);
}

