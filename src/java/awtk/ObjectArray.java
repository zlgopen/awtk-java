package awtk;


/**
 * 简单的动态数组，内部存放value对象。 访问时属性名称为： * "size"/"length" 用于获取数组的长度。 * index 用于访问属性，-1可以用来追加新元素。
 *
 */
public class ObjectArray extends Object {
 public long nativeObj;

 public ObjectArray(long nativeObj) {
   super(nativeObj);
 }

 static public ObjectArray cast(long nativeObj) {
   return new ObjectArray(nativeObj);
 }


/**
 * 创建对象。
 * 
 *
 * @returns 返回object对象。
 */
 public  static Object create()  {
   return new ObjectArray(object_array_create());
 }


/**
 * for script gc
 * 
 * @param obj 对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret unref()  {
   return Ret.from(object_array_unref(this != null ? (this.nativeObj) : 0));
 }


/**
 * 清除全部属性。
 * 
 * @param obj 对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret clearProps()  {
   return Ret.from(object_array_clear_props(this != null ? (this.nativeObj) : 0));
 }

 public int getPropsSize() {
   return object_array_t_get_prop_props_size(this.nativeObj);
 }

static private native long object_array_create();
static private native int object_array_unref(long obj);
static private native int object_array_clear_props(long obj);
static private native int object_array_t_get_prop_props_size(long nativeObj);
}

