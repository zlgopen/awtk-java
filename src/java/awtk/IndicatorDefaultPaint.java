package awtk;


public enum IndicatorDefaultPaint {
  AUTO (INDICATOR_DEFAULT_PAINT_AUTO()),
  FILL_DOT (INDICATOR_DEFAULT_PAINT_FILL_DOT()),
  STROKE_DOT (INDICATOR_DEFAULT_PAINT_STROKE_DOT()),
  FILL_RECT (INDICATOR_DEFAULT_PAINT_FILL_RECT()),
  STROKE_RECT (INDICATOR_DEFAULT_PAINT_STROKE_RECT());
 
   
  private int value;
  IndicatorDefaultPaint(int value) {
    this.value = value;
  }
  public int value() {
    return this.value;
  }

  public static IndicatorDefaultPaint from(int value) {
    for(IndicatorDefaultPaint iter : IndicatorDefaultPaint.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return AUTO;
  }

  static private native int INDICATOR_DEFAULT_PAINT_AUTO();
  static private native int INDICATOR_DEFAULT_PAINT_FILL_DOT();
  static private native int INDICATOR_DEFAULT_PAINT_STROKE_DOT();
  static private native int INDICATOR_DEFAULT_PAINT_FILL_RECT();
  static private native int INDICATOR_DEFAULT_PAINT_STROKE_RECT();

}
