package awtk;

public class NamedValue {
 public long nativeObj;

 public NamedValue(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public NamedValue cast(long nativeObj) {
   return new NamedValue(nativeObj);
 }

 public  static NamedValue create()  {
   return new NamedValue(named_value_create());
 }

 public  static NamedValue cast(NamedValue nv)  {
   return new NamedValue(named_value_cast(nv != null ? (nv.nativeObj) : 0));
 }

 public  Ret setName(String name)  {
   return Ret.from(named_value_set_name(this.nativeObj, name));
 }

 public  Ret setValue(Value value)  {
   return Ret.from(named_value_set_value(this.nativeObj, value != null ? (value.nativeObj) : 0));
 }

 public  Value getValue()  {
   return new Value(named_value_get_value(this.nativeObj));
 }

 public  Ret destroy()  {
   return Ret.from(named_value_destroy(this.nativeObj));
 }

 public String getName() {
   return named_value_t_get_prop_name(this.nativeObj);
 }

static private native long named_value_create();
static private native long named_value_cast(long nv);
static private native int named_value_set_name(long nv, String name);
static private native int named_value_set_value(long nv, long value);
static private native long named_value_get_value(long nv);
static private native int named_value_destroy(long nv);
static private native String named_value_t_get_prop_name(long nativeObj);
}

