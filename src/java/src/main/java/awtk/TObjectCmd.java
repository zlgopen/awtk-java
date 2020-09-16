package awtk;



/**
 * 对象常见命令定义
 *
 */

public enum TObjectCmd {
  
  /**
   * 保存命令
   *
   */
 
  SAVE (OBJECT_CMD_SAVE()),
  
  /**
   * 重新加载命令
   *
   */
 
  RELOAD (OBJECT_CMD_RELOAD()),
  
  /**
   * 和前一个属性交换位置
   *>参数为属性的名称或路径。
   *
   */
 
  MOVE_UP (OBJECT_CMD_MOVE_UP()),
  
  /**
   * 和后一个属性交换位置
   *>参数为属性的名称或路径。
   *
   */
 
  MOVE_DOWN (OBJECT_CMD_MOVE_DOWN()),
  
  /**
   * 删除属性。
   *>参数为属性的名称或路径。
   *
   */
 
  REMOVE (OBJECT_CMD_REMOVE()),
  
  /**
   * 删除勾选的属性。
   *>参数为属性的名称或路径。
   *
   */
 
  REMOVE_CHECKED (OBJECT_CMD_REMOVE_CHECKED()),
  
  /**
   * 清除全部属性。
   *>参数为属性的名称或路径。
   *
   */
 
  CLEAR (OBJECT_CMD_CLEAR()),
  
  /**
   * 增加子项。
   *>参数为属性的名称或路径。
   *
   */
 
  ADD (OBJECT_CMD_ADD()),
  
  /**
   * 显示对象详细信息。
   *>参数为属性的名称或路径。
   *
   */
 
  DETAIL (OBJECT_CMD_DETAIL()),
  
  /**
   * 编辑子项。
   *>参数为属性的名称或路径。
   *
   */
 
  EDIT (OBJECT_CMD_EDIT());
 
 
  private TObjectCmd(String value) {
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
  public static TObjectCmd from(String value) {
    for(TObjectCmd iter : TObjectCmd.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return SAVE;
  }
  
  private String value;

  static private native String OBJECT_CMD_SAVE();
  static private native String OBJECT_CMD_RELOAD();
  static private native String OBJECT_CMD_MOVE_UP();
  static private native String OBJECT_CMD_MOVE_DOWN();
  static private native String OBJECT_CMD_REMOVE();
  static private native String OBJECT_CMD_REMOVE_CHECKED();
  static private native String OBJECT_CMD_CLEAR();
  static private native String OBJECT_CMD_ADD();
  static private native String OBJECT_CMD_DETAIL();
  static private native String OBJECT_CMD_EDIT();

}
