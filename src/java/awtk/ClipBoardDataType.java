package awtk;


public enum ClipBoardDataType {
  NONE (CLIP_BOARD_DATA_TYPE_NONE()),
  TEXT (CLIP_BOARD_DATA_TYPE_TEXT());
 
   
  private int value;
  ClipBoardDataType(int value) {
    this.value = value;
  }
  public int value() {
    return this.value;
  }

  public static ClipBoardDataType from(int value) {
    for(ClipBoardDataType iter : ClipBoardDataType.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return NONE;
  }

  static private native int CLIP_BOARD_DATA_TYPE_NONE();
  static private native int CLIP_BOARD_DATA_TYPE_TEXT();

}
