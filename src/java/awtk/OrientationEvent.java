package awtk;

public class OrientationEvent extends Event {
 public OrientationEvent(long nativeObj) {
   super(nativeObj);
 }

 static public OrientationEvent cast(long nativeObj) {
   return new OrientationEvent(nativeObj);
 }

 public  static OrientationEvent cast(Event event)  {
   return new OrientationEvent(orientation_event_cast(event != null ? (event.nativeObj) : 0));
 }

 public int getOrientation() {
   return orientation_event_t_get_prop_orientation(this.nativeObj);
 }

static private native long orientation_event_cast(long event);
static private native int orientation_event_t_get_prop_orientation(long nativeObj);
}

