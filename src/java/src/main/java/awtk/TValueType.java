package awtk;



/**
 * 类型常量定义。
 *
 */

public enum TValueType {
  
  /**
   * 无效类型。
   *
   */
 
  INVALID (VALUE_TYPE_INVALID()),
  
  /**
   * BOOL类型。
   *
   */
 
  BOOL (VALUE_TYPE_BOOL()),
  
  /**
   * int8_t类型。
   *
   */
 
  INT8 (VALUE_TYPE_INT8()),
  
  /**
   * uint8_t类型。
   *
   */
 
  UINT8 (VALUE_TYPE_UINT8()),
  
  /**
   * int16_t类型。
   *
   */
 
  INT16 (VALUE_TYPE_INT16()),
  
  /**
   * uint16_t类型。
   *
   */
 
  UINT16 (VALUE_TYPE_UINT16()),
  
  /**
   * int32_t类型。
   *
   */
 
  INT32 (VALUE_TYPE_INT32()),
  
  /**
   * uint32_t类型。
   *
   */
 
  UINT32 (VALUE_TYPE_UINT32()),
  
  /**
   * int64_t类型。
   *
   */
 
  INT64 (VALUE_TYPE_INT64()),
  
  /**
   * uint64_t类型。
   *
   */
 
  UINT64 (VALUE_TYPE_UINT64()),
  
  /**
   * void*类型。
   *
   */
 
  POINTER (VALUE_TYPE_POINTER()),
  
  /**
   * float_t类型。
   *
   */
 
  FLOAT (VALUE_TYPE_FLOAT()),
  
  /**
   * float类型。
   *
   */
 
  FLOAT32 (VALUE_TYPE_FLOAT32()),
  
  /**
   * double类型。
   *
   */
 
  DOUBLE (VALUE_TYPE_DOUBLE()),
  
  /**
   * char*类型。
   *
   */
 
  STRING (VALUE_TYPE_STRING()),
  
  /**
   * wchar_t*类型。
   *
   */
 
  WSTRING (VALUE_TYPE_WSTRING()),
  
  /**
   * object_t*类型。
   *
   */
 
  OBJECT (VALUE_TYPE_OBJECT()),
  
  /**
   * 带长度的字符串。
   *
   */
 
  SIZED_STRING (VALUE_TYPE_SIZED_STRING()),
  
  /**
   * 二进制数据。
   *
   */
 
  BINARY (VALUE_TYPE_BINARY()),
  
  /**
   * 二进制数据(UBJSON)。
   *
   */
 
  UBJSON (VALUE_TYPE_UBJSON()),
  
  /**
   * 特殊用途。
   *
   */
 
  TOKEN (VALUE_TYPE_TOKEN()),
  
  /**
   * 渐变颜色。
   *
   */
 
  GRADIENT (VALUE_TYPE_GRADIENT());
 
 
  private TValueType(int value) {
    this.value = value;
  }

/**
 * 获取枚举的值。
 *
 * @return 枚举的值。
 */
  public int value() {
    return this.value;
  }

/**
 * 把枚举的值转换层枚举。
 *
 * @param value 枚举的值。

 * @return 对应的枚举类型。
 */
  public static TValueType from(int value) {
    for(TValueType iter : TValueType.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return INVALID;
  }
  
  private int value;

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
  static private native int VALUE_TYPE_GRADIENT();

}
