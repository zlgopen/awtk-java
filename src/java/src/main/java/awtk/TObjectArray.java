package awtk;


/**
 * 简单的动态数组，内部存放value对象。
 *
 *访问时属性名称为：
 *
 ** "size"/"length" 用于获取数组的长度。
 ** index 用于访问属性，-1可以用来追加新元素。
 *
 */
public class TObjectArray extends TObject { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TObjectArray(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TObjectArray cast(long nativeObj) {
   return new TObjectArray(nativeObj);
 }


  /**
   * 创建对象。
   * 
   *
   * @return 返回object对象。
   */
 public  static TObject create()  {
    return new TObjectArray(object_array_create());
 }


  /**
   * for script gc
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet unref()  {
   return TRet.from(object_array_unref(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 清除全部属性。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet clearProps()  {
   return TRet.from(object_array_clear_props(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 在指定位置插入一个元素。
   * 
   * @param index 位置。
   * @param v 值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet insert(int index, TValue v)  {
   return TRet.from(object_array_insert(this != null ? (this.nativeObj) : 0, index, v != null ? (v.nativeObj) : 0));
 }


  /**
   * 追加一个元素。
   * 
   * @param v 值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet push(TValue v)  {
   return TRet.from(object_array_push(this != null ? (this.nativeObj) : 0, v != null ? (v.nativeObj) : 0));
 }


  /**
   * 在指定位置删除一个元素。
   * 
   * @param index 位置。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet remove(int index)  {
   return TRet.from(object_array_remove(this != null ? (this.nativeObj) : 0, index));
 }


  /**
   * 属性个数。
   *
   */
 public int getSize() {
   return object_array_t_get_prop_size(this.nativeObj);
 }

static private native long object_array_create();
static private native int object_array_unref(long obj);
static private native int object_array_clear_props(long obj);
static private native int object_array_insert(long obj, int index, long v);
static private native int object_array_push(long obj, long v);
static private native int object_array_remove(long obj, int index);
static private native int object_array_t_get_prop_size(long nativeObj);
};