package awtk;


/**
 * 一个通用数据类型，用来存放整数、浮点数、字符串和其它对象。 在C/C++中，一般不需动态创建对象，直接声明并初始化即可。如： ```c value_t v; value_set_int(&v, 100); ```> 在脚本语言中，需要动态创建对象。
 *
 */
public class Value {
 public long nativeObj;

 public Value(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public Value cast(long nativeObj) {
   return new Value(nativeObj);
 }


/**
 * 设置类型为bool的值。
 * 
 * @param v value对象。
 * @param value 待设置的值。
 *
 * @returns value对象本身。
 */
 public  Value setBool(boolean value)  {
   return new Value(value_set_bool(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 获取类型为bool的值。
 * 
 * @param v value对象。
 *
 * @returns 值。
 */
 public  boolean bool()  {
   return value_bool(this != null ? (this.nativeObj) : 0);
 }


/**
 * 设置类型为int8的值。
 * 
 * @param v value对象。
 * @param value 待设置的值。
 *
 * @returns value对象本身。
 */
 public  Value setInt8(int value)  {
   return new Value(value_set_int8(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 获取类型为int8的值。
 * 
 * @param v value对象。
 *
 * @returns 值。
 */
 public  int int8()  {
   return value_int8(this != null ? (this.nativeObj) : 0);
 }


/**
 * 设置类型为uint8的值。
 * 
 * @param v value对象。
 * @param value 待设置的值。
 *
 * @returns value对象本身。
 */
 public  Value setUint8(int value)  {
   return new Value(value_set_uint8(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 获取类型为uint8的值。
 * 
 * @param v value对象。
 *
 * @returns 值。
 */
 public  int uint8()  {
   return value_uint8(this != null ? (this.nativeObj) : 0);
 }


/**
 * 设置类型为int16的值。
 * 
 * @param v value对象。
 * @param value 待设置的值。
 *
 * @returns value对象本身。
 */
 public  Value setInt16(int value)  {
   return new Value(value_set_int16(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 获取类型为int16的值。
 * 
 * @param v value对象。
 *
 * @returns 值。
 */
 public  int int16()  {
   return value_int16(this != null ? (this.nativeObj) : 0);
 }


/**
 * 设置类型为uint16的值。
 * 
 * @param v value对象。
 * @param value 待设置的值。
 *
 * @returns value对象本身。
 */
 public  Value setUint16(int value)  {
   return new Value(value_set_uint16(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 获取类型为uint16的值。
 * 
 * @param v value对象。
 *
 * @returns 值。
 */
 public  int uint16()  {
   return value_uint16(this != null ? (this.nativeObj) : 0);
 }


/**
 * 设置类型为int32的值。
 * 
 * @param v value对象。
 * @param value 待设置的值。
 *
 * @returns value对象本身。
 */
 public  Value setInt32(int value)  {
   return new Value(value_set_int32(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 获取类型为int32的值。
 * 
 * @param v value对象。
 *
 * @returns 值。
 */
 public  int int32()  {
   return value_int32(this != null ? (this.nativeObj) : 0);
 }


/**
 * 设置类型为uint32的值。
 * 
 * @param v value对象。
 * @param value 待设置的值。
 *
 * @returns value对象本身。
 */
 public  Value setUint32(int value)  {
   return new Value(value_set_uint32(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 设置类型为int64的值。
 * 
 * @param v value对象。
 * @param value 待设置的值。
 *
 * @returns value对象本身。
 */
 public  Value setInt64(long value)  {
   return new Value(value_set_int64(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 获取类型为int64的值。
 * 
 * @param v value对象。
 *
 * @returns 值。
 */
 public  long int64()  {
   return value_int64(this != null ? (this.nativeObj) : 0);
 }


/**
 * 设置类型为uint64的值。
 * 
 * @param v value对象。
 * @param value 待设置的值。
 *
 * @returns value对象本身。
 */
 public  Value setUint64(long value)  {
   return new Value(value_set_uint64(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 获取类型为uint64的值。
 * 
 * @param v value对象。
 *
 * @returns 值。
 */
 public  long uint64()  {
   return value_uint64(this != null ? (this.nativeObj) : 0);
 }


/**
 * 设置类型为float\_t的值。
 * 
 * @param v value对象。
 * @param value 待设置的值。
 *
 * @returns value对象本身。
 */
 public  Value setFloat(double value)  {
   return new Value(value_set_float(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 获取类型为float的值。
 * 
 * @param v value对象。
 *
 * @returns 值。
 */
 public  double float32()  {
   return value_float32(this != null ? (this.nativeObj) : 0);
 }


/**
 * 设置类型为double的值。
 * 
 * @param v value对象。
 * @param value 待设置的值。
 *
 * @returns value对象本身。
 */
 public  Value setFloat64(double value)  {
   return new Value(value_set_double(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 获取类型为double的值。
 * 
 * @param v value对象。
 *
 * @returns 值。
 */
 public  double float64()  {
   return value_double(this != null ? (this.nativeObj) : 0);
 }


/**
 * 设置类型为字符串的值(并拷贝字符串)。 供脚本语言使用。
 * 
 * @param v value对象。
 * @param value 待设置的值。
 *
 * @returns value对象本身。
 */
 public  Value setStr(String value)  {
   return new Value(value_dup_str(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 获取类型为字符串的值。
 * 
 * @param v value对象。
 *
 * @returns 值。
 */
 public  String str()  {
   return value_str(this != null ? (this.nativeObj) : 0);
 }


/**
 * 判断value是否为空值。
 * 
 * @param value value对象。
 *
 * @returns 为空值返回TRUE，否则返回FALSE。
 */
 public  boolean isNull()  {
   return value_is_null(this != null ? (this.nativeObj) : 0);
 }


/**
 * 设置类型为int的值。
 * 
 * @param v value对象。
 * @param value 待设置的值。
 *
 * @returns value对象本身。
 */
 public  Value setInt(int value)  {
   return new Value(value_set_int(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 设置类型为object的值。
 * 
 * @param v value对象。
 * @param value 待设置的值。
 *
 * @returns value对象本身。
 */
 public  Value setObject(Object value)  {
   return new Value(value_set_object(this != null ? (this.nativeObj) : 0, value != null ? (value.nativeObj) : 0));
 }


/**
 * 转换为object的值。
 * 
 * @param v value对象。
 *
 * @returns 值。
 */
 public  Object object()  {
   return new Object(value_object(this != null ? (this.nativeObj) : 0));
 }


/**
 * 设置类型为token的值。
 * 
 * @param v value对象。
 * @param value 待设置的值。
 *
 * @returns value对象本身。
 */
 public  Value setToken(int value)  {
   return new Value(value_set_token(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 获取token的值。
 * 
 * @param v value对象。
 *
 * @returns 值。
 */
 public  int token()  {
   return value_token(this != null ? (this.nativeObj) : 0);
 }


/**
 * 创建value对象。
 * 
 *
 * @returns 对象。
 */
 public  static Value create()  {
   return new Value(value_create());
 }


/**
 * 销毁value对象。
 * 
 * @param v value对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret destroy()  {
   return Ret.from(value_destroy(this != null ? (this.nativeObj) : 0));
 }


/**
 * 重置value对象。
 * 
 * @param v value对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret reset()  {
   return Ret.from(value_reset(this != null ? (this.nativeObj) : 0));
 }


/**
 * 转换为value对象。 供脚本语言使用
 * 
 * @param value value对象。
 *
 * @returns 对象。
 */
 public  static Value cast(Value value)  {
   return new Value(value_cast(value != null ? (value.nativeObj) : 0));
 }

static private native long value_set_bool(long v, boolean value);
static private native boolean value_bool(long v);
static private native long value_set_int8(long v, int value);
static private native int value_int8(long v);
static private native long value_set_uint8(long v, int value);
static private native int value_uint8(long v);
static private native long value_set_int16(long v, int value);
static private native int value_int16(long v);
static private native long value_set_uint16(long v, int value);
static private native int value_uint16(long v);
static private native long value_set_int32(long v, int value);
static private native int value_int32(long v);
static private native long value_set_uint32(long v, int value);
static private native long value_set_int64(long v, long value);
static private native long value_int64(long v);
static private native long value_set_uint64(long v, long value);
static private native long value_uint64(long v);
static private native long value_set_float(long v, double value);
static private native double value_float32(long v);
static private native long value_set_double(long v, double value);
static private native double value_double(long v);
static private native long value_dup_str(long v, String value);
static private native String value_str(long v);
static private native boolean value_is_null(long value);
static private native long value_set_int(long v, int value);
static private native long value_set_object(long v, long value);
static private native long value_object(long v);
static private native long value_set_token(long v, int value);
static private native int value_token(long v);
static private native long value_create();
static private native int value_destroy(long v);
static private native int value_reset(long v);
static private native long value_cast(long value);
}

