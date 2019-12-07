package awtk;

public class ObjectDefault extends Object {
 public ObjectDefault(long nativeObj) {
   super(nativeObj);
 }

 static public ObjectDefault cast(long nativeObj) {
   return new ObjectDefault(nativeObj);
 }

 public  static Object create()  {
   return new ObjectDefault(object_default_create());
 }

 public  Ret unref()  {
   return Ret.from(object_default_unref(this.nativeObj));
 }

 public  Ret clearProps()  {
   return Ret.from(object_default_clear_props(this.nativeObj));
 }

 public int getPropsSize() {
   return object_default_t_get_prop_props_size(this.nativeObj);
 }

static private native long object_default_create();
static private native int object_default_unref(long obj);
static private native int object_default_clear_props(long obj);
static private native int object_default_t_get_prop_props_size(long nativeObj);
}

