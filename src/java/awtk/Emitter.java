package awtk;

public class Emitter {
 public long nativeObj;

 public Emitter(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public Emitter cast(long nativeObj) {
   return new Emitter(nativeObj);
 }

 public  static Emitter create()  {
   return new Emitter(emitter_create());
 }

 public  Ret dispatch(Event e)  {
   return Ret.from(emitter_dispatch(this.nativeObj, e != null ? (e.nativeObj) : 0));
 }

 public  Ret dispatchSimpleEvent(EventType type)  {
   return Ret.from(emitter_dispatch_simple_event(this.nativeObj, type.value()));
 }

 public  int on(EventType type, OnEvent on_event, long ctx)  {
   return emitter_on(this.nativeObj, type.value(), on_event, ctx);
 }

 public  Ret off(int id)  {
   return Ret.from(emitter_off(this.nativeObj, id));
 }

 public  Ret enable()  {
   return Ret.from(emitter_enable(this.nativeObj));
 }

 public  Ret disable()  {
   return Ret.from(emitter_disable(this.nativeObj));
 }

 public  int size()  {
   return emitter_size(this.nativeObj);
 }

 public  Ret destroy()  {
   return Ret.from(emitter_destroy(this.nativeObj));
 }

 public  static Emitter cast(Emitter emitter)  {
   return new Emitter(emitter_cast(emitter != null ? (emitter.nativeObj) : 0));
 }

static private native long emitter_create();
static private native int emitter_dispatch(long emitter, long e);
static private native int emitter_dispatch_simple_event(long emitter, int type);
static private native int emitter_on(long emitter, int type, OnEvent on_event, long ctx);
static private native int emitter_off(long emitter, int id);
static private native int emitter_enable(long emitter);
static private native int emitter_disable(long emitter);
static private native int emitter_size(long emitter);
static private native int emitter_destroy(long emitter);
static private native long emitter_cast(long emitter);
}

