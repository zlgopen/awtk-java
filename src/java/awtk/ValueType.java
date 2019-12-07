package awtk;


public enum ValueType {
  INVALID (VALUE_TYPE_INVALID()),
  BOOL (VALUE_TYPE_BOOL()),
  INT8 (VALUE_TYPE_INT8()),
  UINT8 (VALUE_TYPE_UINT8()),
  INT16 (VALUE_TYPE_INT16()),
  UINT16 (VALUE_TYPE_UINT16()),
  INT32 (VALUE_TYPE_INT32()),
  UINT32 (VALUE_TYPE_UINT32()),
  INT64 (VALUE_TYPE_INT64()),
  UINT64 (VALUE_TYPE_UINT64()),
  POINTER (VALUE_TYPE_POINTER()),
  FLOAT (VALUE_TYPE_FLOAT()),
  FLOAT32 (VALUE_TYPE_FLOAT32()),
  DOUBLE (VALUE_TYPE_DOUBLE()),
  STRING (VALUE_TYPE_STRING()),
  WSTRING (VALUE_TYPE_WSTRING()),
  OBJECT (VALUE_TYPE_OBJECT()),
  SIZED_STRING (VALUE_TYPE_SIZED_STRING()),
  BINARY (VALUE_TYPE_BINARY()),
  UBJSON (VALUE_TYPE_UBJSON()),
  TOKEN (VALUE_TYPE_TOKEN());
 
   
  private int value;
  ValueType(int value) {
    this.value = value;
  }
  public int value() {
    return this.value;
  }

  public static ValueType from(int value) {
    for(ValueType iter : ValueType.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return INVALID;
  }

  static private native int VALUE_TYPE_INVALID();
  static private native int VALUE_TYPE_BOOL();
  static private native int VALUE_TYPE_INT8();
  static private native int VALUE_TYPE_UINT8();
  static private native int VALUE_TYPE_INT16();
  static private native int VALUE_TYPE_UINT16();
  static private native int VALUE_TYPE_INT32();
  static private native int VALUE_TYPE_UINT32();
  static private native int VALUE_TYPE_INT64();
  static private native int VALUE_TYPE_UINT64();
  static private native int VALUE_TYPE_POINTER();
  static private native int VALUE_TYPE_FLOAT();
  static private native int VALUE_TYPE_FLOAT32();
  static private native int VALUE_TYPE_DOUBLE();
  static private native int VALUE_TYPE_STRING();
  static private native int VALUE_TYPE_WSTRING();
  static private native int VALUE_TYPE_OBJECT();
  static private native int VALUE_TYPE_SIZED_STRING();
  static private native int VALUE_TYPE_BINARY();
  static private native int VALUE_TYPE_UBJSON();
  static private native int VALUE_TYPE_TOKEN();

}
