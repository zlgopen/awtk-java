package awtk;


public enum AppType {
  MOBILE (APP_MOBILE()),
  SIMULATOR (APP_SIMULATOR()),
  DESKTOP (APP_DESKTOP());
 
   
  private int value;
  AppType(int value) {
    this.value = value;
  }
  public int value() {
    return this.value;
  }

  public static AppType from(int value) {
    for(AppType iter : AppType.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return MOBILE;
  }

  static private native int APP_MOBILE();
  static private native int APP_SIMULATOR();
  static private native int APP_DESKTOP();

}
