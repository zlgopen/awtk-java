package awtk;

public class ProgressEvent extends Event {
 public ProgressEvent(long nativeObj) {
   super(nativeObj);
 }

 static public ProgressEvent cast(long nativeObj) {
   return new ProgressEvent(nativeObj);
 }

 public  static ProgressEvent cast(Event event)  {
   return new ProgressEvent(progress_event_cast(event != null ? (event.nativeObj) : 0));
 }

 public int getPercent() {
   return progress_event_t_get_prop_percent(this.nativeObj);
 }

static private native long progress_event_cast(long event);
static private native int progress_event_t_get_prop_percent(long nativeObj);
}

