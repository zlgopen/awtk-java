package awtk;



/**
 * bidi 类型常量定义。
 *
 */

public enum TBidiType {
  
  /**
   * 自动检查。
   *
   */
 
  AUTO (BIDI_TYPE_AUTO()),
  
  /**
   * Left-To-Right letter。
   *
   */
 
  LTR (BIDI_TYPE_LTR()),
  
  /**
   * Right-To-Left letter。
   *
   */
 
  RTL (BIDI_TYPE_RTL()),
  
  /**
   * Weak Left To Right paragraph。
   *
   */
 
  WLTR (BIDI_TYPE_WLTR()),
  
  /**
   * Weak Right To Left paragraph。
   *
   */
 
  WRTL (BIDI_TYPE_WRTL());
 
 
  private TBidiType(int value) {
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
  public static TBidiType from(int value) {
    for(TBidiType iter : TBidiType.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return AUTO;
  }
  
  private int value;

  static private native int BIDI_TYPE_AUTO();
  static private native int BIDI_TYPE_LTR();
  static private native int BIDI_TYPE_RTL();
  static private native int BIDI_TYPE_WLTR();
  static private native int BIDI_TYPE_WRTL();

}
