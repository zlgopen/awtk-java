package awtk;



/**
 * 输入类型常量定义。
 *
 */

public enum TInputType {
  
  /**
   * 文本。字符串属性值：text
   *
   */
 
  TEXT (INPUT_TEXT()),
  
  /**
   * 整数。字符串属性值：int
   *
   */
 
  INT (INPUT_INT()),
  
  /**
   * 非负整数。字符串属性值：uint
   *
   */
 
  UINT (INPUT_UINT()),
  
  /**
   * 16进制整数。字符串属性值：hex
   *
   */
 
  HEX (INPUT_HEX()),
  
  /**
   * 浮点数。字符串属性值：float
   *
   */
 
  FLOAT (INPUT_FLOAT()),
  
  /**
   * 非负浮点数。字符串属性值：ufloat
   *
   */
 
  UFLOAT (INPUT_UFLOAT()),
  
  /**
   * 邮件地址。字符串属性值：email
   *
   */
 
  EMAIL (INPUT_EMAIL()),
  
  /**
   * 密码。字符串属性值：password
   *
   */
 
  PASSWORD (INPUT_PASSWORD()),
  
  /**
   * 电话号码。字符串属性值：phone
   *
   */
 
  PHONE (INPUT_PHONE()),
  
  /**
   * IP Addr V4(如：192.168.1.1)。字符串属性值：ipv4
   *
   */
 
  IPV4 (INPUT_IPV4()),
  
  /**
   * 日期(如：2020/02/20)。字符串属性值：date
   *
   */
 
  DATE (INPUT_DATE()),
  
  /**
   * 时间(时分，如：12:00)。字符串属性值：time
   *
   */
 
  TIME (INPUT_TIME()),
  
  /**
   * 时间(时分秒，如：12:00:00)。字符串属性值：time_full
   *
   */
 
  TIME_FULL (INPUT_TIME_FULL()),
  
  /**
   * 使用自定义的软键盘(如计算器等应用不希望弹出系统软键盘)。字符串属性值：custom
   *
   */
 
  CUSTOM (INPUT_CUSTOM()),
  
  /**
   * 使用自定义的密码软键盘。字符串属性值：custom_password
   *
   */
 
  CUSTOM_PASSWORD (INPUT_CUSTOM_PASSWORD());
 
 
  private TInputType(int value) {
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
  public static TInputType from(int value) {
    for(TInputType iter : TInputType.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return TEXT;
  }
  
  private int value;

  static private native int INPUT_TEXT();
  static private native int INPUT_INT();
  static private native int INPUT_UINT();
  static private native int INPUT_HEX();
  static private native int INPUT_FLOAT();
  static private native int INPUT_UFLOAT();
  static private native int INPUT_EMAIL();
  static private native int INPUT_PASSWORD();
  static private native int INPUT_PHONE();
  static private native int INPUT_IPV4();
  static private native int INPUT_DATE();
  static private native int INPUT_TIME();
  static private native int INPUT_TIME_FULL();
  static private native int INPUT_CUSTOM();
  static private native int INPUT_CUSTOM_PASSWORD();

}
