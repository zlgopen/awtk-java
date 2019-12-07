package awtk;

public class TimerInfo extends Object {
 public TimerInfo(long nativeObj) {
   super(nativeObj);
 }

 static public TimerInfo cast(long nativeObj) {
   return new TimerInfo(nativeObj);
 }

 public  static TimerInfo cast(TimerInfo timer)  {
   return new TimerInfo(timer_info_cast(timer != null ? (timer.nativeObj) : 0));
 }

 public long getCtx() {
   return timer_info_t_get_prop_ctx(this.nativeObj);
 }

 public int getId() {
   return timer_info_t_get_prop_id(this.nativeObj);
 }

 public long getNow() {
   return timer_info_t_get_prop_now(this.nativeObj);
 }

static private native long timer_info_cast(long timer);
static private native long timer_info_t_get_prop_ctx(long nativeObj);
static private native int timer_info_t_get_prop_id(long nativeObj);
static private native long timer_info_t_get_prop_now(long nativeObj);
}

