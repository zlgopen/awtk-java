package awtk;


public enum InputType {
  TEXT (INPUT_TEXT()),
  INT (INPUT_INT()),
  UINT (INPUT_UINT()),
  HEX (INPUT_HEX()),
  FLOAT (INPUT_FLOAT()),
  UFLOAT (INPUT_UFLOAT()),
  EMAIL (INPUT_EMAIL()),
  PASSWORD (INPUT_PASSWORD()),
  PHONE (INPUT_PHONE()),
  CUSTOM (INPUT_CUSTOM()),
  CUSTOM_PASSWORD (INPUT_CUSTOM_PASSWORD());
 
   
  private int value;
  InputType(int value) {
    this.value = value;
  }
  public int value() {
    return this.value;
  }

  public static InputType from(int value) {
    for(InputType iter : InputType.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return TEXT;
  }

  static private native int INPUT_TEXT();
  static private native int INPUT_INT();
  static private native int INPUT_UINT();
  static private native int INPUT_HEX();
  static private native int INPUT_FLOAT();
  static private native int INPUT_UFLOAT();
  static private native int INPUT_EMAIL();
  static private native int INPUT_PASSWORD();
  static private native int INPUT_PHONE();
  static private native int INPUT_CUSTOM();
  static private native int INPUT_CUSTOM_PASSWORD();

}
