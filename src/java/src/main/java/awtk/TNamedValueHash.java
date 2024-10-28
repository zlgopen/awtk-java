package awtk;


/**
 * 带有散列值的命名的值。
 *
 */
public class TNamedValueHash extends TNamedValue { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TNamedValueHash(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TNamedValueHash cast(long nativeObj) {
   return new TNamedValueHash(nativeObj);
 }


  /**
   * 创建named_value_hash对象。
   * 
   *
   * @return 返回named_value_hash对象。
   */
 public  static TNamedValueHash create()  {
    return new TNamedValueHash(named_value_hash_create());
 }


  /**
   * 设置散列值。
   * 
   * @param name 名称。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setName(String name)  {
   return TRet.from(named_value_hash_set_name(this != null ? (this.nativeObj) : 0, name));
 }


  /**
   * 销毁named_value_hash对象。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet destroy()  {
   return TRet.from(named_value_hash_destroy(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 克隆named_value_hash对象。
   * 
   *
   * @return 返回named_value_hash对象。
   */
 public  TNamedValueHash clone()  {
    return new TNamedValueHash(named_value_hash_clone(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 获取字符串散列值。
   * 
   * @param str 字符串。
   *
   * @return 返回散列值。
   */
 public  static long getHashFromStr(String str)  {
    return named_value_hash_get_hash_from_str(str);
 }

static private native long named_value_hash_create();
static private native int named_value_hash_set_name(long nvh, String name);
static private native int named_value_hash_destroy(long nvh);
static private native long named_value_hash_clone(long nvh);
static private native long named_value_hash_get_hash_from_str(String str);
};