package awtk;


public enum DialogQuitCode {
  NONE (DIALOG_QUIT_NONE()),
  OK (DIALOG_QUIT_OK()),
  YES (DIALOG_QUIT_YES()),
  CANCEL (DIALOG_QUIT_CANCEL()),
  NO (DIALOG_QUIT_NO()),
  OTHER (DIALOG_QUIT_OTHER());
 
   
  private int value;
  DialogQuitCode(int value) {
    this.value = value;
  }
  public int value() {
    return this.value;
  }

  public static DialogQuitCode from(int value) {
    for(DialogQuitCode iter : DialogQuitCode.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return NONE;
  }

  static private native int DIALOG_QUIT_NONE();
  static private native int DIALOG_QUIT_OK();
  static private native int DIALOG_QUIT_YES();
  static private native int DIALOG_QUIT_CANCEL();
  static private native int DIALOG_QUIT_NO();
  static private native int DIALOG_QUIT_OTHER();

}
