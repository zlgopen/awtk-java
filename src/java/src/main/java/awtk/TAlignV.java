package awtk;



/**
 * 垂直对齐的常量定义。
 *
 */

public enum TAlignV {
  
/**
 * 无效对齐方式。
 *
 */
 
  NONE (ALIGN_V_NONE()),
  
/**
 * 居中对齐。
 *
 */
 
  MIDDLE (ALIGN_V_MIDDLE()),
  
/**
 * 顶部对齐。
 *
 */
 
  TOP (ALIGN_V_TOP()),
  
/**
 * 底部对齐。
 *
 */
 
  BOTTOM (ALIGN_V_BOTTOM());
 
 
  private TAlignV(int value) {
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
  public static TAlignV from(int value) {
    for(TAlignV iter : TAlignV.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return NONE;
  }
  
  private int value;

  static private native int ALIGN_V_NONE();
  static private native int ALIGN_V_MIDDLE();
  static private native int ALIGN_V_TOP();
  static private native int ALIGN_V_BOTTOM();

}
