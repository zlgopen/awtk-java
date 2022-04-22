package awtk;



/**
 * 控件状态常量定义。
 *
 *这里指定常用的状态值，扩展控件可以在自己的头文件中定义私有的状态。
 *
 */

public enum TWidgetState {
  
  /**
   * 无效状态。
   *
   */
 
  NONE (WIDGET_STATE_NONE()),
  
  /**
   * 正常状态。
   *
   */
 
  NORMAL (WIDGET_STATE_NORMAL()),
  
  /**
   * 3/5keys模式时，进入激活状态(此时方向键用于修改值)。
   *
   */
 
  ACTIVATED (WIDGET_STATE_ACTIVATED()),
  
  /**
   * 内容被修改的状态。
   *
   */
 
  CHANGED (WIDGET_STATE_CHANGED()),
  
  /**
   * 指针按下状态。
   *
   */
 
  PRESSED (WIDGET_STATE_PRESSED()),
  
  /**
   * 指针悬浮状态。
   *
   */
 
  OVER (WIDGET_STATE_OVER()),
  
  /**
   * 禁用状态。
   *
   */
 
  DISABLE (WIDGET_STATE_DISABLE()),
  
  /**
   * 聚焦状态。
   *
   */
 
  FOCUSED (WIDGET_STATE_FOCUSED()),
  
  /**
   * 勾选状态。
   *
   */
 
  CHECKED (WIDGET_STATE_CHECKED()),
  
  /**
   * 没勾选状态。
   *
   */
 
  UNCHECKED (WIDGET_STATE_UNCHECKED()),
  
  /**
   * 编辑器无内容状态。
   *
   */
 
  EMPTY (WIDGET_STATE_EMPTY()),
  
  /**
   * 编辑器无内容同时聚焦的状态。
   *
   */
 
  EMPTY_FOCUS (WIDGET_STATE_EMPTY_FOCUS()),
  
  /**
   * 编辑器无内容同时指针悬浮的状态。
   *
   */
 
  EMPTY_OVER (WIDGET_STATE_EMPTY_OVER()),
  
  /**
   * 输入错误状态。
   *
   */
 
  ERROR (WIDGET_STATE_ERROR()),
  
  /**
   * 选中状态。
   *
   */
 
  SELECTED (WIDGET_STATE_SELECTED()),
  
  /**
   * 正常状态(选中项)。
   *
   */
 
  NORMAL_OF_CHECKED (WIDGET_STATE_NORMAL_OF_CHECKED()),
  
  /**
   * 指针按下状态(选中项)。
   *
   */
 
  PRESSED_OF_CHECKED (WIDGET_STATE_PRESSED_OF_CHECKED()),
  
  /**
   * 指针悬浮状态(选中项)。
   *
   */
 
  OVER_OF_CHECKED (WIDGET_STATE_OVER_OF_CHECKED()),
  
  /**
   * 禁用状态(选中项)。
   *
   */
 
  DISABLE_OF_CHECKED (WIDGET_STATE_DISABLE_OF_CHECKED()),
  
  /**
   * 焦点状态(选中项)。
   *
   */
 
  FOCUSED_OF_CHECKED (WIDGET_STATE_FOCUSED_OF_CHECKED()),
  
  /**
   * 正常状态(当前项)。
   *
   */
 
  NORMAL_OF_ACTIVE (WIDGET_STATE_NORMAL_OF_ACTIVE()),
  
  /**
   * 指针按下状态(当前项)。
   *
   */
 
  PRESSED_OF_ACTIVE (WIDGET_STATE_PRESSED_OF_ACTIVE()),
  
  /**
   * 指针悬浮状态(当前项)。
   *
   */
 
  OVER_OF_ACTIVE (WIDGET_STATE_OVER_OF_ACTIVE()),
  
  /**
   * 禁用状态(当前项)。
   *
   */
 
  DISABLE_OF_ACTIVE (WIDGET_STATE_DISABLE_OF_ACTIVE()),
  
  /**
   * 焦点状态(当前项)。
   *
   */
 
  FOCUSED_OF_ACTIVE (WIDGET_STATE_FOCUSED_OF_ACTIVE());
 
 
  private TWidgetState(String value) {
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
  public static TWidgetState from(String value) {
    for(TWidgetState iter : TWidgetState.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return NONE;
  }
  
  private String value;

  static private native String WIDGET_STATE_NONE();
  static private native String WIDGET_STATE_NORMAL();
  static private native String WIDGET_STATE_ACTIVATED();
  static private native String WIDGET_STATE_CHANGED();
  static private native String WIDGET_STATE_PRESSED();
  static private native String WIDGET_STATE_OVER();
  static private native String WIDGET_STATE_DISABLE();
  static private native String WIDGET_STATE_FOCUSED();
  static private native String WIDGET_STATE_CHECKED();
  static private native String WIDGET_STATE_UNCHECKED();
  static private native String WIDGET_STATE_EMPTY();
  static private native String WIDGET_STATE_EMPTY_FOCUS();
  static private native String WIDGET_STATE_EMPTY_OVER();
  static private native String WIDGET_STATE_ERROR();
  static private native String WIDGET_STATE_SELECTED();
  static private native String WIDGET_STATE_NORMAL_OF_CHECKED();
  static private native String WIDGET_STATE_PRESSED_OF_CHECKED();
  static private native String WIDGET_STATE_OVER_OF_CHECKED();
  static private native String WIDGET_STATE_DISABLE_OF_CHECKED();
  static private native String WIDGET_STATE_FOCUSED_OF_CHECKED();
  static private native String WIDGET_STATE_NORMAL_OF_ACTIVE();
  static private native String WIDGET_STATE_PRESSED_OF_ACTIVE();
  static private native String WIDGET_STATE_OVER_OF_ACTIVE();
  static private native String WIDGET_STATE_DISABLE_OF_ACTIVE();
  static private native String WIDGET_STATE_FOCUSED_OF_ACTIVE();

}
