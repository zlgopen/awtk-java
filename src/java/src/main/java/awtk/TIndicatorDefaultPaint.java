package awtk;



/**
 * 指示器默认绘制的类型。
 *
 */

public enum TIndicatorDefaultPaint {
  
  /**
   * 自动选择。
   *
   */
 
  AUTO (INDICATOR_DEFAULT_PAINT_AUTO()),
  
  /**
   * 实心圆点指示器，当前项填充selected_fg_color，其他填充fg_color。
   *
   */
 
  FILL_DOT (INDICATOR_DEFAULT_PAINT_FILL_DOT()),
  
  /**
   * 镂空圆点指示器，当前项填充selected_fg_color，其他镂空fg_color。
   *
   */
 
  STROKE_DOT (INDICATOR_DEFAULT_PAINT_STROKE_DOT()),
  
  /**
   * 实心矩形指示器，当前项填充selected_fg_color，其他填充fg_color。
   *
   */
 
  FILL_RECT (INDICATOR_DEFAULT_PAINT_FILL_RECT()),
  
  /**
   * 镂空矩形指示器，当前项填充selected_fg_color，其他镂空fg_color。
   *
   */
 
  STROKE_RECT (INDICATOR_DEFAULT_PAINT_STROKE_RECT());
 
 
  private TIndicatorDefaultPaint(int value) {
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
  public static TIndicatorDefaultPaint from(int value) {
    for(TIndicatorDefaultPaint iter : TIndicatorDefaultPaint.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return AUTO;
  }
  
  private int value;

  static private native int INDICATOR_DEFAULT_PAINT_AUTO();
  static private native int INDICATOR_DEFAULT_PAINT_FILL_DOT();
  static private native int INDICATOR_DEFAULT_PAINT_STROKE_DOT();
  static private native int INDICATOR_DEFAULT_PAINT_FILL_RECT();
  static private native int INDICATOR_DEFAULT_PAINT_STROKE_RECT();

}
