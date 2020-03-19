package awtk;



/**
 * 线条连接类型。
 *
 */

public enum TVgcanvasLineJoin {
  
  /**
   * round。
   *
   */
 
  ROUND (VGCANVAS_LINE_JOIN_ROUND()),
  
  /**
   * bevel。
   *
   */
 
  BEVEL (VGCANVAS_LINE_JOIN_BEVEL()),
  
  /**
   * mitter。
   *
   */
 
  MITTER (VGCANVAS_LINE_JOIN_MITTER());
 
 
  private TVgcanvasLineJoin(String value) {
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
  public static TVgcanvasLineJoin from(String value) {
    for(TVgcanvasLineJoin iter : TVgcanvasLineJoin.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return ROUND;
  }
  
  private String value;

  static private native String VGCANVAS_LINE_JOIN_ROUND();
  static private native String VGCANVAS_LINE_JOIN_BEVEL();
  static private native String VGCANVAS_LINE_JOIN_MITTER();

}
