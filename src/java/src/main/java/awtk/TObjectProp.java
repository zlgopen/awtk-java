package awtk;



/**
 * 对象常见属性定义
 *
 */

public enum TObjectProp {
  
  /**
   * 属性的个数。
   *
   */
 
  SIZE (OBJECT_PROP_SIZE()),
  
  /**
   * 属性是否勾选。
   *
   */
 
  CHECKED (OBJECT_PROP_CHECKED());
 
 
  private TObjectProp(String value) {
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
  public static TObjectProp from(String value) {
    for(TObjectProp iter : TObjectProp.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return SIZE;
  }
  
  private String value;

  static private native String OBJECT_PROP_SIZE();
  static private native String OBJECT_PROP_CHECKED();

}
