package awtk;



/**
 * 剪切板数据类型定义。
 *
 */

public enum TClipBoardDataType {
  
  /**
   * 无数据。
   *
   */
 
  NONE (CLIP_BOARD_DATA_TYPE_NONE()),
  
  /**
   * UTF8文本。
   *
   */
 
  TEXT (CLIP_BOARD_DATA_TYPE_TEXT());
 
 
  private TClipBoardDataType(int value) {
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
  public static TClipBoardDataType from(int value) {
    for(TClipBoardDataType iter : TClipBoardDataType.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return NONE;
  }
  
  private int value;

  static private native int CLIP_BOARD_DATA_TYPE_NONE();
  static private native int CLIP_BOARD_DATA_TYPE_TEXT();

}
