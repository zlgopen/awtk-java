package awtk;



/**
 * 线帽类型。
 *
 */

public enum TVgcanvasLineCap {
  
  /**
   * 圆头。
   *
   */
 
  ROUND (VGCANVAS_LINE_CAP_ROUND()),
  
  /**
   * 方头。
   *
   */
 
  SQUARE (VGCANVAS_LINE_CAP_SQUARE()),
  
  /**
   * 平头。
   *
   */
 
  BUTT (VGCANVAS_LINE_CAP_BUTT());
 
 
  private TVgcanvasLineCap(String value) {
    this.value = value;
  }

/**
 * 获取枚举的值。
 *
 * @return 枚举的值。
 */
  public String value() {
    return this.value;
  }

/**
 * 把枚举的值转换层枚举。
 *
 * @param value 枚举的值。

 * @return 对应的枚举类型。
 */
  public static TVgcanvasLineCap from(String value) {
    for(TVgcanvasLineCap iter : TVgcanvasLineCap.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return ROUND;
  }
  
  private String value;

  static private native String VGCANVAS_LINE_CAP_ROUND();
  static private native String VGCANVAS_LINE_CAP_SQUARE();
  static private native String VGCANVAS_LINE_CAP_BUTT();

}
