package awtk;


public enum AlignV {
  NONE (ALIGN_V_NONE()),
  MIDDLE (ALIGN_V_MIDDLE()),
  TOP (ALIGN_V_TOP()),
  BOTTOM (ALIGN_V_BOTTOM());
 
   
  private int value;
  AlignV(int value) {
    this.value = value;
  }
  public int value() {
    return this.value;
  }

  public static AlignV from(int value) {
    for(AlignV iter : AlignV.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return NONE;
  }

  static private native int ALIGN_V_NONE();
  static private native int ALIGN_V_MIDDLE();
  static private native int ALIGN_V_TOP();
  static private native int ALIGN_V_BOTTOM();

}
