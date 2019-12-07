package awtk;

public class Idle {
 public long nativeObj;

 public Idle(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public Idle cast(long nativeObj) {
   return new Idle(nativeObj);
 }

 public  static int add(OnIdle on_idle, long ctx)  {
   return idle_add(on_idle, ctx);
 }

 public  static Ret remove(int idle_id)  {
   return Ret.from(idle_remove(idle_id));
 }

static private native int idle_add(OnIdle on_idle, long ctx);
static private native int idle_remove(int idle_id);
}

