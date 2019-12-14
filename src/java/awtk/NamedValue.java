package awtk;


/**
 * 命名的值。
 *
 */
public class NamedValue {
 public long nativeObj;

 public NamedValue(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public NamedValue cast(long nativeObj) {
   return new NamedValue(nativeObj);
 }


/**
 * 创建named_value对象。
 * 
 *
 * @returns 返回named_value对象。
 */
 public  static NamedValue create()  {
   return new NamedValue(named_value_create());
 }


/**
 * 转换为named_value对象(供脚本语言使用)。
 * 
 * @param nv named_value对象。
 *
 * @returns 返回named_value对象。
 */
 public  static NamedValue cast(NamedValue nv)  {
   return new NamedValue(named_value_cast(nv != null ? (nv.nativeObj) : 0));
 }


/**
 * 设置名称。
 * 
 * @param nv named_value对象。
 * @param name 名称。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setName(String name)  {
   return Ret.from(named_value_set_name(this != null ? (this.nativeObj) : 0, name));
 }


/**
 * 设置值。
 * 
 * @param nv named_value对象。
 * @param value 值。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setValue(Value value)  {
   return Ret.from(named_value_set_value(this != null ? (this.nativeObj) : 0, value != null ? (value.nativeObj) : 0));
 }


/**
 * 获取值对象(主要给脚本语言使用)。
 * 
 * @param nv named_value对象。
 *
 * @returns 返回值对象。
 */
 public  Value getValue()  {
   return new Value(named_value_get_value(this != null ? (this.nativeObj) : 0));
 }


/**
 * 销毁named_value对象。
 * 
 * @param nv named_value对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret destroy()  {
   return Ret.from(named_value_destroy(this != null ? (this.nativeObj) : 0));
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

