package awtk;


public enum WindowClosable {
  YES (WINDOW_CLOSABLE_YES()),
  NO (WINDOW_CLOSABLE_NO()),
  CONFIRM (WINDOW_CLOSABLE_CONFIRM());
 
   
  private int value;
  WindowClosable(int value) {
    this.value = value;
  }
  public int value() {
    return this.value;
  }

  public static WindowClosable from(int value) {
    for(WindowClosable iter : WindowClosable.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return YES;
  }

  static private native int WINDOW_CLOSABLE_YES();
  static private native int WINDOW_CLOSABLE_NO();
  static private native int WINDOW_CLOSABLE_CONFIRM();

}
