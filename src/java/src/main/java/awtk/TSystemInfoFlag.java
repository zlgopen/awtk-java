package awtk;



/**
 * SystemInfo常量定义。
 *
 */

public enum TSystemInfoFlag {
  
  /**
   * 无特殊标志。
   *
   */
 
  NONE (SYSTEM_INFO_FLAG_NONE()),
  
  /**
   * 使用快速旋转功能。
   *
   */
 
  FAST_LCD_PORTRAIT (SYSTEM_INFO_FLAG_FAST_LCD_PORTRAIT());
 
 
  private TSystemInfoFlag(int value) {
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
  public static TSystemInfoFlag from(int value) {
    for(TSystemInfoFlag iter : TSystemInfoFlag.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return NONE;
  }
  
  private int value;

  static private native int SYSTEM_INFO_FLAG_NONE();
  static private native int SYSTEM_INFO_FLAG_FAST_LCD_PORTRAIT();

}
