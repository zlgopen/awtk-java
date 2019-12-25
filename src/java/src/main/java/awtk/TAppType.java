package awtk;



/**
 * 应用程序类型。
 *
 */

public enum TAppType {
  
  /**
   * 嵌入式或移动APP
   *
   */
 
  MOBILE (APP_MOBILE()),
  
  /**
   * 模拟器。
   *
   */
 
  SIMULATOR (APP_SIMULATOR()),
  
  /**
   * 桌面应用程序。
   *
   */
 
  DESKTOP (APP_DESKTOP());
 
 
  private TAppType(int value) {
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
  public static TAppType from(int value) {
    for(TAppType iter : TAppType.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return MOBILE;
  }
  
  private int value;

  static private native int APP_MOBILE();
  static private native int APP_SIMULATOR();
  static private native int APP_DESKTOP();

}
