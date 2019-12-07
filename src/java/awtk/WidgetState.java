package awtk;


public enum WidgetState {
  STATE_NONE (WIDGET_STATE_NONE()),
  STATE_NORMAL (WIDGET_STATE_NORMAL()),
  STATE_PRESSED (WIDGET_STATE_PRESSED()),
  STATE_OVER (WIDGET_STATE_OVER()),
  STATE_DISABLE (WIDGET_STATE_DISABLE()),
  STATE_FOCUSED (WIDGET_STATE_FOCUSED()),
  STATE_CHECKED (WIDGET_STATE_CHECKED()),
  STATE_UNCHECKED (WIDGET_STATE_UNCHECKED()),
  STATE_EMPTY (WIDGET_STATE_EMPTY()),
  STATE_EMPTY_FOCUS (WIDGET_STATE_EMPTY_FOCUS()),
  STATE_ERROR (WIDGET_STATE_ERROR()),
  STATE_SELECTED (WIDGET_STATE_SELECTED()),
  STATE_NORMAL_OF_CHECKED (WIDGET_STATE_NORMAL_OF_CHECKED()),
  STATE_PRESSED_OF_CHECKED (WIDGET_STATE_PRESSED_OF_CHECKED()),
  STATE_OVER_OF_CHECKED (WIDGET_STATE_OVER_OF_CHECKED()),
  STATE_FOCUSED_OF_CHECKED (WIDGET_STATE_FOCUSED_OF_CHECKED()),
  STATE_NORMAL_OF_ACTIVE (WIDGET_STATE_NORMAL_OF_ACTIVE()),
  STATE_PRESSED_OF_ACTIVE (WIDGET_STATE_PRESSED_OF_ACTIVE()),
  STATE_OVER_OF_ACTIVE (WIDGET_STATE_OVER_OF_ACTIVE()),
  STATE_FOCUSED_OF_ACTIVE (WIDGET_STATE_FOCUSED_OF_ACTIVE());
 
   
  private String value;
  WidgetState(String value) {
    this.value = value;
  }
  public String value() {
    return this.value;
  }

  public static WidgetState from(String value) {
    for(WidgetState iter : WidgetState.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return STATE_NONE;
  }

  static private native String WIDGET_STATE_NONE();
  static private native String WIDGET_STATE_NORMAL();
  static private native String WIDGET_STATE_PRESSED();
  static private native String WIDGET_STATE_OVER();
  static private native String WIDGET_STATE_DISABLE();
  static private native String WIDGET_STATE_FOCUSED();
  static private native String WIDGET_STATE_CHECKED();
  static private native String WIDGET_STATE_UNCHECKED();
  static private native String WIDGET_STATE_EMPTY();
  static private native String WIDGET_STATE_EMPTY_FOCUS();
  static private native String WIDGET_STATE_ERROR();
  static private native String WIDGET_STATE_SELECTED();
  static private native String WIDGET_STATE_NORMAL_OF_CHECKED();
  static private native String WIDGET_STATE_PRESSED_OF_CHECKED();
  static private native String WIDGET_STATE_OVER_OF_CHECKED();
  static private native String WIDGET_STATE_FOCUSED_OF_CHECKED();
  static private native String WIDGET_STATE_NORMAL_OF_ACTIVE();
  static private native String WIDGET_STATE_PRESSED_OF_ACTIVE();
  static private native String WIDGET_STATE_OVER_OF_ACTIVE();
  static private native String WIDGET_STATE_FOCUSED_OF_ACTIVE();

}
