package awtk;

public class Object extends Emitter {
 public Object(long nativeObj) {
   super(nativeObj);
 }

 static public Object cast(long nativeObj) {
   return new Object(nativeObj);
 }

 public  Ret unref()  {
   return Ret.from(object_unref(this.nativeObj));
 }

 public  static Object ref(Object obj)  {
   return new Object(object_ref(obj != null ? (obj.nativeObj) : 0));
 }

 public  String getType()  {
   return object_get_type(this.nativeObj);
 }

 public  String getDesc()  {
   return object_get_desc(this.nativeObj);
 }

 public  int getSize()  {
   return object_get_size(this.nativeObj);
 }

 public  boolean isCollection()  {
   return object_is_collection(this.nativeObj);
 }

 public  Ret setName(String name)  {
   return Ret.from(object_set_name(this.nativeObj, name));
 }

 public  int compare(Object other)  {
   return object_compare(this.nativeObj, other != null ? (other.nativeObj) : 0);
 }

 public  Ret getProp(String name, Value v)  {
   return Ret.from(object_get_prop(this.nativeObj, name, v != null ? (v.nativeObj) : 0));
 }

 public  String getPropStr(String name)  {
   return object_get_prop_str(this.nativeObj, name);
 }

 public  long getPropPointer(String name)  {
   return object_get_prop_pointer(this.nativeObj, name);
 }

 public  Object getPropObject(String name)  {
   return new Object(object_get_prop_object(this.nativeObj, name));
 }

 public  int getPropInt(String name, int defval)  {
   return object_get_prop_int(this.nativeObj, name, defval);
 }

 public  boolean getPropBool(String name, boolean defval)  {
   return object_get_prop_bool(this.nativeObj, name, defval);
 }

 public  double getPropFloat(String name, double defval)  {
   return object_get_prop_float(this.nativeObj, name, defval);
 }

 public  Ret removeProp(String name)  {
   return Ret.from(object_remove_prop(this.nativeObj, name));
 }

 public  Ret setProp(String name, Value value)  {
   return Ret.from(object_set_prop(this.nativeObj, name, value != null ? (value.nativeObj) : 0));
 }

 public  Ret setPropStr(String name, String value)  {
   return Ret.from(object_set_prop_str(this.nativeObj, name, value));
 }

 public  Ret setPropObject(String name, Object value)  {
   return Ret.from(object_set_prop_object(this.nativeObj, name, value != null ? (value.nativeObj) : 0));
 }

 public  Ret setPropInt(String name, int value)  {
   return Ret.from(object_set_prop_int(this.nativeObj, name, value));
 }

 public  Ret setPropBool(String name, boolean value)  {
   return Ret.from(object_set_prop_bool(this.nativeObj, name, value));
 }

 public  Ret setPropFloat(String name, double value)  {
   return Ret.from(object_set_prop_float(this.nativeObj, name, value));
 }

 public  Ret copyProp(Object src, String name)  {
   return Ret.from(object_copy_prop(this.nativeObj, src != null ? (src.nativeObj) : 0, name));
 }

 public  boolean hasProp(String name)  {
   return object_has_prop(this.nativeObj, name);
 }

 public  Ret eval(String expr, Value v)  {
   return Ret.from(object_eval(this.nativeObj, expr, v != null ? (v.nativeObj) : 0));
 }

 public  boolean canExec(String name, String args)  {
   return object_can_exec(this.nativeObj, name, args);
 }

 public  Ret exec(String name, String args)  {
   return Ret.from(object_exec(this.nativeObj, name, args));
 }

 public  Ret notifyChanged()  {
   return Ret.from(object_notify_changed(this.nativeObj));
 }

 public  String getPropStrByPath(String path)  {
   return object_get_prop_str_by_path(this.nativeObj, path);
 }

 public  long getPropPointerByPath(String path)  {
   return object_get_prop_pointer_by_path(this.nativeObj, path);
 }

 public  Object getPropObjectByPath(String path)  {
   return new Object(object_get_prop_object_by_path(this.nativeObj, path));
 }

 public  int getPropIntByPath(String path, int defval)  {
   return object_get_prop_int_by_path(this.nativeObj, path, defval);
 }

 public  boolean getPropBoolByPath(String path, boolean defval)  {
   return object_get_prop_bool_by_path(this.nativeObj, path, defval);
 }

 public  double getPropFloatByPath(String path, double defval)  {
   return object_get_prop_float_by_path(this.nativeObj, path, defval);
 }

 public int getRefCount() {
   return object_t_get_prop_ref_count(this.nativeObj);
 }

 public String getName() {
   return object_t_get_prop_name(this.nativeObj);
 }

static private native int object_unref(long obj);
static private native long object_ref(long obj);
static private native String object_get_type(long obj);
static private native String object_get_desc(long obj);
static private native int object_get_size(long obj);
static private native boolean object_is_collection(long obj);
static private native int object_set_name(long obj, String name);
static private native int object_compare(long obj, long other);
static private native int object_get_prop(long obj, String name, long v);
static private native String object_get_prop_str(long obj, String name);
static private native long object_get_prop_pointer(long obj, String name);
static private native long object_get_prop_object(long obj, String name);
static private native int object_get_prop_int(long obj, String name, int defval);
static private native boolean object_get_prop_bool(long obj, String name, boolean defval);
static private native double object_get_prop_float(long obj, String name, double defval);
static private native int object_remove_prop(long obj, String name);
static private native int object_set_prop(long obj, String name, long value);
static private native int object_set_prop_str(long obj, String name, String value);
static private native int object_set_prop_object(long obj, String name, long value);
static private native int object_set_prop_int(long obj, String name, int value);
static private native int object_set_prop_bool(long obj, String name, boolean value);
static private native int object_set_prop_float(long obj, String name, double value);
static private native int object_copy_prop(long obj, long src, String name);
static private native boolean object_has_prop(long obj, String name);
static private native int object_eval(long obj, String expr, long v);
static private native boolean object_can_exec(long obj, String name, String args);
static private native int object_exec(long obj, String name, String args);
static private native int object_notify_changed(long obj);
static private native String object_get_prop_str_by_path(long obj, String path);
static private native long object_get_prop_pointer_by_path(long obj, String path);
static private native long object_get_prop_object_by_path(long obj, String path);
static private native int object_get_prop_int_by_path(long obj, String path, int defval);
static private native boolean object_get_prop_bool_by_path(long obj, String path, boolean defval);
static private native double object_get_prop_float_by_path(long obj, String path, double defval);
static private native int object_t_get_prop_ref_count(long nativeObj);
static private native String object_t_get_prop_name(long nativeObj);
}

