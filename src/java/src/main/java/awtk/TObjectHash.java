package awtk;


/**
 * 对象接口的散列值查询属性的object实现。
 *
 *通用当作 map 数据结构使用，内部用有序数组保存所有属性，因此可以快速查找指定名称的属性。
 *
 *示例
 *
 *
 *
 */
public class TObjectHash extends TObject { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TObjectHash(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TObjectHash cast(long nativeObj) {
   return new TObjectHash(nativeObj);
 }


  /**
   * 创建对象。
   * 
   *
   * @return 返回object对象。
   */
 public  static TObject create()  {
    return new TObjectHash(object_hash_create());
 }


  /**
   * 创建对象。
   * 
   * @param enable_path 是否支持按路径访问属性。
   *
   * @return 返回object对象。
   */
 public  static TObject createEx(boolean enable_path)  {
    return new TObjectHash(object_hash_create_ex(enable_path));
 }


  /**
   * 设置属性值时不改变属性的类型。
   * 
   * @param keep_prop_type 不改变属性的类型。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setKeepPropType(boolean keep_prop_type)  {
   return TRet.from(object_hash_set_keep_prop_type(this != null ? (this.nativeObj) : 0, keep_prop_type));
 }

static private native long object_hash_create();
static private native long object_hash_create_ex(boolean enable_path);
static private native int object_hash_set_keep_prop_type(long obj, boolean keep_prop_type);
};