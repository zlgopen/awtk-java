package awtk;

public class Event {
 public long nativeObj;

 public Event(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public Event cast(long nativeObj) {
   return new Event(nativeObj);
 }

 public  static Event cast(Event event)  {
   return new Event(event_cast(event != null ? (event.nativeObj) : 0));
 }

 public  static Event create(int type)  {
   return new Event(event_create(type));
 }

 public  Ret destroy()  {
   return Ret.from(event_destroy(this.nativeObj));
 }

 public int getType() {
   return event_t_get_prop_type(this.nativeObj);
 }

 public int getTime() {
   return event_t_get_prop_time(this.nativeObj);
 }

 public long getTarget() {
   return event_t_get_prop_target(this.nativeObj);
 }

static private native long event_cast(long event);
static private native long event_create(int type);
static private native int event_destroy(long event);
static private native int event_t_get_prop_type(long nativeObj);
static private native int event_t_get_prop_time(long nativeObj);
static private native long event_t_get_prop_target(long nativeObj);
}

