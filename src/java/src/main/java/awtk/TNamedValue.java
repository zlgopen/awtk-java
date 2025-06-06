package awtk;


/**
 * 命名的值。
 *
 */
public class TNamedValue extends TValue { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TNamedValue(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TNamedValue cast(long nativeObj) {
   return new TNamedValue(nativeObj);
 }


  /**
   * 创建named_value对象。
   * 
   *
   * @return 返回named_value对象。
   */
 public  static TNamedValue create()  {
    return new TNamedValue(named_value_create());
 }


  /**
   * 转换为named_value对象(供脚本语言使用)。
   * 
   * @param nv named_value对象。
   *
   * @return 返回named_value对象。
   */
 public  static TNamedValue cast(TNamedValue nv)  {
    return new TNamedValue(named_value_cast(nv != null ? (nv.nativeObj) : 0));
 }


  /**
   * 设置名称。
   * 
   * @param name 名称。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setName(String name)  {
   return TRet.from(named_value_set_name(this != null ? (this.nativeObj) : 0, name));
 }


  /**
   * 设置值。
   * 
   * @param value 值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setValue(TValue value)  {
   return TRet.from(named_value_set_value(this != null ? (this.nativeObj) : 0, value != null ? (value.nativeObj) : 0));
 }


  /**
   * 获取值对象(主要给脚本语言使用)。
   * 
   *
   * @return 返回值对象。
   */
 public  TValue getValue()  {
    return new TValue(named_value_get_value(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 销毁named_value对象。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet destroy()  {
   return TRet.from(named_value_destroy(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 名称。
   *
   */
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
};