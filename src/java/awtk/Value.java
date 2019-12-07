package awtk;

public class Value {
 public long nativeObj;

 public Value(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public Value cast(long nativeObj) {
   return new Value(nativeObj);
 }

 public  Value setBool(boolean value)  {
   return new Value(value_set_bool(this.nativeObj, value));
 }

 public  boolean bool()  {
   return value_bool(this.nativeObj);
 }

 public  Value setInt8(int value)  {
   return new Value(value_set_int8(this.nativeObj, value));
 }

 public  int int8()  {
   return value_int8(this.nativeObj);
 }

 public  Value setUint8(int value)  {
   return new Value(value_set_uint8(this.nativeObj, value));
 }

 public  int uint8()  {
   return value_uint8(this.nativeObj);
 }

 public  Value setInt16(int value)  {
   return new Value(value_set_int16(this.nativeObj, value));
 }

 public  int int16()  {
   return value_int16(this.nativeObj);
 }

 public  Value setUint16(int value)  {
   return new Value(value_set_uint16(this.nativeObj, value));
 }

 public  int uint16()  {
   return value_uint16(this.nativeObj);
 }

 public  Value setInt32(int value)  {
   return new Value(value_set_int32(this.nativeObj, value));
 }

 public  int int32()  {
   return value_int32(this.nativeObj);
 }

 public  Value setUint32(int value)  {
   return new Value(value_set_uint32(this.nativeObj, value));
 }

 public  Value setInt64(long value)  {
   return new Value(value_set_int64(this.nativeObj, value));
 }

 public  long int64()  {
   return value_int64(this.nativeObj);
 }

 public  Value setUint64(long value)  {
   return new Value(value_set_uint64(this.nativeObj, value));
 }

 public  long uint64()  {
   return value_uint64(this.nativeObj);
 }

 public  Value setFloat(double value)  {
   return new Value(value_set_float(this.nativeObj, value));
 }

 public  double float32()  {
   return value_float32(this.nativeObj);
 }

 public  Value setFloat64(double value)  {
   return new Value(value_set_double(this.nativeObj, value));
 }

 public  double float64()  {
   return value_double(this.nativeObj);
 }

 public  Value setStr(String value)  {
   return new Value(value_dup_str(this.nativeObj, value));
 }

 public  String str()  {
   return value_str(this.nativeObj);
 }

 public  boolean isNull()  {
   return value_is_null(this.nativeObj);
 }

 public  Value setInt(int value)  {
   return new Value(value_set_int(this.nativeObj, value));
 }

 public  Value setObject(Object value)  {
   return new Value(value_set_object(this.nativeObj, value != null ? (value.nativeObj) : 0));
 }

 public  Object object()  {
   return new Object(value_object(this.nativeObj));
 }

 public  Value setToken(int value)  {
   return new Value(value_set_token(this.nativeObj, value));
 }

 public  int token()  {
   return value_token(this.nativeObj);
 }

 public  static Value create()  {
   return new Value(value_create());
 }

 public  Ret destroy()  {
   return Ret.from(value_destroy(this.nativeObj));
 }

 public  Ret reset()  {
   return Ret.from(value_reset(this.nativeObj));
 }

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

