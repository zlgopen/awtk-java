package awtk;


public enum AlignH {
  NONE (ALIGN_H_NONE()),
  CENTER (ALIGN_H_CENTER()),
  LEFT (ALIGN_H_LEFT()),
  RIGHT (ALIGN_H_RIGHT());
 
   
  private int value;
  AlignH(int value) {
    this.value = value;
  }
  public int value() {
    return this.value;
  }

  public static AlignH from(int value) {
    for(AlignH iter : AlignH.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return NONE;
  }

  static private native int ALIGN_H_NONE();
  static private native int ALIGN_H_CENTER();
  static private native int ALIGN_H_LEFT();
  static private native int ALIGN_H_RIGHT();

}
