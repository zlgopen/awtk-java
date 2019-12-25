package awtk;



/**
 * 窗口的closable常量定义。
 *
 */

public enum TWindowClosable {
  
  /**
   * 窗口可关闭。
   *
   */
 
  YES (WINDOW_CLOSABLE_YES()),
  
  /**
   * 窗口不可关闭。
   *
   */
 
  NO (WINDOW_CLOSABLE_NO()),
  
  /**
   * 窗口需要确认后才能关闭。
   *
   */
 
  CONFIRM (WINDOW_CLOSABLE_CONFIRM());
 
 
  private TWindowClosable(int value) {
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
  public static TWindowClosable from(int value) {
    for(TWindowClosable iter : TWindowClosable.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return YES;
  }
  
  private int value;

  static private native int WINDOW_CLOSABLE_YES();
  static private native int WINDOW_CLOSABLE_NO();
  static private native int WINDOW_CLOSABLE_CONFIRM();

}
