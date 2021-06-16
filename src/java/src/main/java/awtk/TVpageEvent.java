package awtk;



/**
 * 虚拟页面的事件。
 *
 */

public enum TVpageEvent {
  
  /**
   * 页面即将打开(动画前)。
   *
   */
 
  VPAGE_WILL_OPEN (EVT_VPAGE_WILL_OPEN()),
  
  /**
   * 页面打开完成(动画后)。
   *
   */
 
  VPAGE_OPEN (EVT_VPAGE_OPEN()),
  
  /**
   * 页面已经关闭(动画后)。
   *
   */
 
  VPAGE_CLOSE (EVT_VPAGE_CLOSE());
 
 
  private TVpageEvent(int value) {
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
  public static TVpageEvent from(int value) {
    for(TVpageEvent iter : TVpageEvent.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return VPAGE_WILL_OPEN;
  }
  
  private int value;

  static private native int EVT_VPAGE_WILL_OPEN();
  static private native int EVT_VPAGE_OPEN();
  static private native int EVT_VPAGE_CLOSE();

}
