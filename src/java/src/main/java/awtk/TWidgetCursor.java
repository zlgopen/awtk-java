package awtk;



/**
 * 控件鼠标光标常量定义。
 *
 */

public enum TWidgetCursor {
  
  /**
   * 默认光标。
   *
   */
 
  CURSOR_DEFAULT (WIDGET_CURSOR_DEFAULT()),
  
  /**
   * 文本选择光标。
   *
   */
 
  CURSOR_EDIT (WIDGET_CURSOR_EDIT()),
  
  /**
   * 手指光标。
   *
   */
 
  CURSOR_HAND (WIDGET_CURSOR_HAND()),
  
  /**
   * 等待光标。
   *
   */
 
  CURSOR_WAIT (WIDGET_CURSOR_WAIT()),
  
  /**
   * 叉光标。
   *
   */
 
  CURSOR_CROSS (WIDGET_CURSOR_CROSS()),
  
  /**
   * Slashed circle or crossbones。
   *
   */
 
  CURSOR_NO (WIDGET_CURSOR_NO()),
  
  /**
   * Double arrow pointing northwest and southeast。
   *
   */
 
  CURSOR_SIZENWSE (WIDGET_CURSOR_SIZENWSE()),
  
  /**
   * Double arrow pointing northeast and southwest。
   *
   */
 
  CURSOR_SIZENESW (WIDGET_CURSOR_SIZENESW()),
  
  /**
   * Double arrow pointing west and east。
   *
   */
 
  CURSOR_SIZEWE (WIDGET_CURSOR_SIZEWE()),
  
  /**
   * Double arrow pointing north and south。
   *
   */
 
  CURSOR_SIZENS (WIDGET_CURSOR_SIZENS()),
  
  /**
   * Four pointed arrow pointing north, south, east, and west。
   *
   */
 
  CURSOR_SIZEALL (WIDGET_CURSOR_SIZEALL());
 
 
  private TWidgetCursor(String value) {
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
  public static TWidgetCursor from(String value) {
    for(TWidgetCursor iter : TWidgetCursor.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return CURSOR_DEFAULT;
  }
  
  private String value;

  static private native String WIDGET_CURSOR_DEFAULT();
  static private native String WIDGET_CURSOR_EDIT();
  static private native String WIDGET_CURSOR_HAND();
  static private native String WIDGET_CURSOR_WAIT();
  static private native String WIDGET_CURSOR_CROSS();
  static private native String WIDGET_CURSOR_NO();
  static private native String WIDGET_CURSOR_SIZENWSE();
  static private native String WIDGET_CURSOR_SIZENESW();
  static private native String WIDGET_CURSOR_SIZEWE();
  static private native String WIDGET_CURSOR_SIZENS();
  static private native String WIDGET_CURSOR_SIZEALL();

}
