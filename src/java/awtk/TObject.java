package awtk;


/**
 * 对象接口。
 *
 */
public class TObject extends TEmitter { 

/**
 * 原生对象。
 */
 public long nativeObj;


/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TObject(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TObject cast(long nativeObj) {
   return new TObject(nativeObj);
 }


/**
 * 引用计数减1。引用计数为0时，销毁对象。
 * 
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet unref()  {
   return TRet.from(object_unref(this != null ? (this.nativeObj) : 0));
 }


/**
 * 引用计数加1。
 * 
 * @param obj object对象。
 
 * @return 返回object对象。
 */
 public  static TObject ref(TObject obj)  {
    return new TObject(object_ref(obj != null ? (obj.nativeObj) : 0));
 }


/**
 * 获取对象的类型名称。
 * 
 
 * @return 返回对象的类型名称。
 */
 public  String getType()  {
    return object_get_type(this != null ? (this.nativeObj) : 0);
 }


/**
 * 获取对象的描述信息。
 * 
 
 * @return 返回对象的描述信息。
 */
 public  String getDesc()  {
    return object_get_desc(this != null ? (this.nativeObj) : 0);
 }


/**
 * 获取对象占用内存的大小。
 * 
 
 * @return 返回对象占用内存的大小。
 */
 public  int getSize()  {
    return object_get_size(this != null ? (this.nativeObj) : 0);
 }


/**
 * 判断对象是否是集合。
 * 
 
 * @return 返回TRUE表示是集合，否则不是。
 */
 public  boolean isCollection()  {
    return object_is_collection(this != null ? (this.nativeObj) : 0);
 }


/**
 * 设置对象的名称。
 * 
 * @param name 对象的名称。
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet setName(String name)  {
   return TRet.from(object_set_name(this != null ? (this.nativeObj) : 0, name));
 }


/**
 * 比较两个对象。
 * 
 * @param other 比较的object对象。
 
 * @return 返回比较结果。
 */
 public  int compare(TObject other)  {
    return object_compare(this != null ? (this.nativeObj) : 0, other != null ? (other.nativeObj) : 0);
 }


/**
 * 获取指定属性的值。
 * 
 * @param name 属性的名称。
 * @param v 返回属性的值。
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet getProp(String name, TValue v)  {
   return TRet.from(object_get_prop(this != null ? (this.nativeObj) : 0, name, v != null ? (v.nativeObj) : 0));
 }


/**
 * 获取指定属性的字符串类型的值。
 * 
 * @param name 属性的名称。
 
 * @return 返回指定属性的字符串类型的值。
 */
 public  String getPropStr(String name)  {
    return object_get_prop_str(this != null ? (this.nativeObj) : 0, name);
 }


/**
 * 获取指定属性的指针类型的值。
 * 
 * @param name 属性的名称。
 
 * @return 返回指定属性的指针类型的值。
 */
 public  long getPropPointer(String name)  {
    return object_get_prop_pointer(this != null ? (this.nativeObj) : 0, name);
 }


/**
 * 获取指定属性的object类型的值。
 * 
 * @param name 属性的名称。
 
 * @return 返回指定属性的object类型的值。
 */
 public  TObject getPropObject(String name)  {
    return new TObject(object_get_prop_object(this != null ? (this.nativeObj) : 0, name));
 }


/**
 * 获取指定属性的整数类型的值。
 * 
 * @param name 属性的名称。
 * @param defval 缺省值。
 
 * @return 返回指定属性的整数类型的值。
 */
 public  int getPropInt(String name, int defval)  {
    return object_get_prop_int(this != null ? (this.nativeObj) : 0, name, defval);
 }


/**
 * 获取指定属性的bool类型的值。
 * 
 * @param name 属性的名称。
 * @param defval 缺省值。
 
 * @return 返回指定属性的bool类型的值。
 */
 public  boolean getPropBool(String name, boolean defval)  {
    return object_get_prop_bool(this != null ? (this.nativeObj) : 0, name, defval);
 }


/**
 * 获取指定属性的浮点数类型的值。
 * 
 * @param name 属性的名称。
 * @param defval 缺省值。
 
 * @return 返回指定属性的浮点数类型的值。
 */
 public  double getPropFloat(String name, double defval)  {
    return object_get_prop_float(this != null ? (this.nativeObj) : 0, name, defval);
 }


/**
 * 删除指定属性。
 * 
 * @param name 属性的名称。
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet removeProp(String name)  {
   return TRet.from(object_remove_prop(this != null ? (this.nativeObj) : 0, name));
 }


/**
 * 设置指定属性的值。
 * 
 * @param name 属性的名称。
 * @param value 属性的值。
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet setProp(String name, TValue value)  {
   return TRet.from(object_set_prop(this != null ? (this.nativeObj) : 0, name, value != null ? (value.nativeObj) : 0));
 }


/**
 * 设置指定属性的字符串类型的值。
 * 
 * @param name 属性的名称。
 * @param value 属性的值。
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet setPropStr(String name, String value)  {
   return TRet.from(object_set_prop_str(this != null ? (this.nativeObj) : 0, name, value));
 }


/**
 * 设置指定属性的object类型的值。
 * 
 * @param name 属性的名称。
 * @param value 属性的值。
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet setPropObject(String name, TObject value)  {
   return TRet.from(object_set_prop_object(this != null ? (this.nativeObj) : 0, name, value != null ? (value.nativeObj) : 0));
 }


/**
 * 设置指定属性的整数类型的值。
 * 
 * @param name 属性的名称。
 * @param value 属性的值。
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet setPropInt(String name, int value)  {
   return TRet.from(object_set_prop_int(this != null ? (this.nativeObj) : 0, name, value));
 }


/**
 * 设置指定属性的bool类型的值。
 * 
 * @param name 属性的名称。
 * @param value 属性的值。
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet setPropBool(String name, boolean value)  {
   return TRet.from(object_set_prop_bool(this != null ? (this.nativeObj) : 0, name, value));
 }


/**
 * 设置指定属性的浮点数类型的值。
 * 
 * @param name 属性的名称。
 * @param value 属性的值。
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet setPropFloat(String name, double value)  {
   return TRet.from(object_set_prop_float(this != null ? (this.nativeObj) : 0, name, value));
 }


/**
 * 拷贝指定的属性。
 * 
 * @param src 源对象。
 * @param name 属性的名称。
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet copyProp(TObject src, String name)  {
   return TRet.from(object_copy_prop(this != null ? (this.nativeObj) : 0, src != null ? (src.nativeObj) : 0, name));
 }


/**
 * 检查是否存在指定的属性。
 * 
 * @param name 属性的名称。
 
 * @return 返回TRUE表示存在，否则表示不存在。
 */
 public  boolean hasProp(String name)  {
    return object_has_prop(this != null ? (this.nativeObj) : 0, name);
 }


/**
 * 计算一个表达式，表达式中引用的变量从prop中获取。
 * 
 * @param expr 表达式。
 * @param v 返回计算结果。
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet eval(String expr, TValue v)  {
   return TRet.from(object_eval(this != null ? (this.nativeObj) : 0, expr, v != null ? (v.nativeObj) : 0));
 }


/**
 * 检查是否可以执行指定的命令。
 * 
 * @param name 命令的名称。
 * @param args 命令的参数。
 
 * @return 返回TRUE表示可以执行，否则表示不可以执行。
 */
 public  boolean canExec(String name, String args)  {
    return object_can_exec(this != null ? (this.nativeObj) : 0, name, args);
 }


/**
 * 执行指定的命令。
 * 
 * @param name 命令的名称。
 * @param args 命令的参数。
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet execute(String name, String args)  {
   return TRet.from(object_exec(this != null ? (this.nativeObj) : 0, name, args));
 }


/**
 * 触发EVT_PROPS_CHANGED事件。
 * 
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet notifyChanged()  {
   return TRet.from(object_notify_changed(this != null ? (this.nativeObj) : 0));
 }


/**
 * 获取指定属性的字符串类型的值。
 * 
 * @param path 属性的path。
 
 * @return 返回指定属性的字符串类型的值。
 */
 public  String getPropStrByPath(String path)  {
    return object_get_prop_str_by_path(this != null ? (this.nativeObj) : 0, path);
 }


/**
 * 获取指定属性的指针类型的值。
 * 
 * @param path 属性的path。
 
 * @return 返回指定属性的指针类型的值。
 */
 public  long getPropPointerByPath(String path)  {
    return object_get_prop_pointer_by_path(this != null ? (this.nativeObj) : 0, path);
 }


/**
 * 获取指定属性的object类型的值。
 * 
 * @param path 属性的path。
 
 * @return 返回指定属性的object类型的值。
 */
 public  TObject getPropObjectByPath(String path)  {
    return new TObject(object_get_prop_object_by_path(this != null ? (this.nativeObj) : 0, path));
 }


/**
 * 获取指定属性的整数类型的值。
 * 
 * @param path 属性的path。
 * @param defval 缺省值。
 
 * @return 返回指定属性的整数类型的值。
 */
 public  int getPropIntByPath(String path, int defval)  {
    return object_get_prop_int_by_path(this != null ? (this.nativeObj) : 0, path, defval);
 }


/**
 * 获取指定属性的bool类型的值。
 * 
 * @param path 属性的path。
 * @param defval 缺省值。
 
 * @return 返回指定属性的bool类型的值。
 */
 public  boolean getPropBoolByPath(String path, boolean defval)  {
    return object_get_prop_bool_by_path(this != null ? (this.nativeObj) : 0, path, defval);
 }


/**
 * 获取指定属性的浮点数类型的值。
 * 
 * @param path 属性的path。
 * @param defval 缺省值。
 
 * @return 返回指定属性的浮点数类型的值。
 */
 public  double getPropFloatByPath(String path, double defval)  {
    return object_get_prop_float_by_path(this != null ? (this.nativeObj) : 0, path, defval);
 }


/**
 * 引用计数。
 *
 */
 public int getRefCount() {
   return object_t_get_prop_ref_count(this.nativeObj);
 }


/**
 * 对象的名称。
 *
 */
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
};