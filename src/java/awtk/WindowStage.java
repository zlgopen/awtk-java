package awtk;


public enum WindowStage {
  NONE (WINDOW_STAGE_NONE()),
  CREATED (WINDOW_STAGE_CREATED()),
  OPENED (WINDOW_STAGE_OPENED()),
  CLOSED (WINDOW_STAGE_CLOSED());
 
   
  private int value;
  WindowStage(int value) {
    this.value = value;
  }
  public int value() {
    return this.value;
  }

  public static WindowStage from(int value) {
    for(WindowStage iter : WindowStage.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return NONE;
  }

  static private native int WINDOW_STAGE_NONE();
  static private native int WINDOW_STAGE_CREATED();
  static private native int WINDOW_STAGE_OPENED();
  static private native int WINDOW_STAGE_CLOSED();

}
