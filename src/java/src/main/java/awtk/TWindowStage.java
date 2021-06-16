package awtk;



/**
 * 窗口的生命周期常量定义。
 *
 */

public enum TWindowStage {
  
  /**
   * 初始状态。
   *
   */
 
  NONE (WINDOW_STAGE_NONE()),
  
  /**
   * 从UI资源加载完成。
   *
   */
 
  LOADED (WINDOW_STAGE_LOADED()),
  
  /**
   * 创建完成。
   *
   */
 
  CREATED (WINDOW_STAGE_CREATED()),
  
  /**
   * 窗口已经打开(窗口打开动画完成后)
   *
   */
 
  OPENED (WINDOW_STAGE_OPENED()),
  
  /**
   * 窗口已关闭。
   *
   */
 
  CLOSED (WINDOW_STAGE_CLOSED()),
  
  /**
   * 窗口挂起状态。
   *
   */
 
  SUSPEND (WINDOW_STAGE_SUSPEND());
 
 
  private TWindowStage(int value) {
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
  public static TWindowStage from(int value) {
    for(TWindowStage iter : TWindowStage.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return NONE;
  }
  
  private int value;

  static private native int WINDOW_STAGE_NONE();
  static private native int WINDOW_STAGE_LOADED();
  static private native int WINDOW_STAGE_CREATED();
  static private native int WINDOW_STAGE_OPENED();
  static private native int WINDOW_STAGE_CLOSED();
  static private native int WINDOW_STAGE_SUSPEND();

}
