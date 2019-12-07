package awtk;

public class Timer {
 public long nativeObj;

 public Timer(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public Timer cast(long nativeObj) {
   return new Timer(nativeObj);
 }

 public  static int add(OnTimer on_timer, long ctx, int duration)  {
   return timer_add(on_timer, ctx, duration);
 }

 public  static Ret remove(int timer_id)  {
   return Ret.from(timer_remove(timer_id));
 }

 public  static Ret reset(int timer_id)  {
   return Ret.from(timer_reset(timer_id));
 }

 public  static Ret modify(int timer_id, int duration)  {
   return Ret.from(timer_modify(timer_id, duration));
 }

static private native int timer_add(OnTimer on_timer, long ctx, int duration);
static private native int timer_remove(int timer_id);
static private native int timer_reset(int timer_id);
static private native int timer_modify(int timer_id, int duration);
}

