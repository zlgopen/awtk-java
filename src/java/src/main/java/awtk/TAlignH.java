package awtk;



/**
 * 水平对齐的常量定义。
 *
 */

public enum TAlignH {
  
/**
 * 无效对齐方式。
 *
 */
 
  NONE (ALIGN_H_NONE()),
  
/**
 * 居中对齐。
 *
 */
 
  CENTER (ALIGN_H_CENTER()),
  
/**
 * 左边对齐。
 *
 */
 
  LEFT (ALIGN_H_LEFT()),
  
/**
 * 右边对齐。
 *
 */
 
  RIGHT (ALIGN_H_RIGHT());
 
 
  private TAlignH(int value) {
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
  public static TAlignH from(int value) {
    for(TAlignH iter : TAlignH.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return NONE;
  }
  
  private int value;

  static private native int ALIGN_H_NONE();
  static private native int ALIGN_H_CENTER();
  static private native int ALIGN_H_LEFT();
  static private native int ALIGN_H_RIGHT();

}
