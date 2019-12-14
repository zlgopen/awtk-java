package awtk;


/**
 * 对象接口的缺省实现。 内部使用有序数组保存所有属性，可以快速查找指定名称的属性。
 *
 */
public class ObjectDefault extends Object {
 public long nativeObj;

 public ObjectDefault(long nativeObj) {
   super(nativeObj);
 }

 static public ObjectDefault cast(long nativeObj) {
   return new ObjectDefault(nativeObj);
 }


/**
 * 创建对象。
 * 
 *
 * @returns 返回object对象。
 */
 public  static Object create()  {
   return new ObjectDefault(object_default_create());
 }


/**
 * for script gc
 * 
 * @param obj 对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret unref()  {
   return Ret.from(object_default_unref(this != null ? (this.nativeObj) : 0));
 }


/**
 * 清除全部属性。
 * 
 * @param obj 对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret clearProps()  {
   return Ret.from(object_default_clear_props(this != null ? (this.nativeObj) : 0));
 }

 public int getPropsSize() {
   return object_default_t_get_prop_props_size(this.nativeObj);
 }

static private native long object_default_create();
static private native int object_default_unref(long obj);
static private native int object_default_clear_props(long obj);
static private native int object_default_t_get_prop_props_size(long nativeObj);
}

