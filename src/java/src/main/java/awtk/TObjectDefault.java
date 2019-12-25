package awtk;


/**
 * 对象接口的缺省实现。
 *
 *内部使用有序数组保存所有属性，可以快速查找指定名称的属性。
 *
 */
public class TObjectDefault extends TObject { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TObjectDefault(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TObjectDefault cast(long nativeObj) {
   return new TObjectDefault(nativeObj);
 }


  /**
   * 创建对象。
   * 
   *
   * @return 返回object对象。
   */
 public  static TObject create()  {
    return new TObjectDefault(object_default_create());
 }


  /**
   * for script gc
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet unref()  {
   return TRet.from(object_default_unref(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 清除全部属性。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet clearProps()  {
   return TRet.from(object_default_clear_props(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 属性个数。
   *
   */
 public int getPropsSize() {
   return object_default_t_get_prop_props_size(this.nativeObj);
 }

static private native long object_default_create();
static private native int object_default_unref(long obj);
static private native int object_default_clear_props(long obj);
static private native int object_default_t_get_prop_props_size(long nativeObj);
};