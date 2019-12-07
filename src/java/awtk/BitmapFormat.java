package awtk;


public enum BitmapFormat {
  NONE (BITMAP_FMT_NONE()),
  RGBA8888 (BITMAP_FMT_RGBA8888()),
  ABGR8888 (BITMAP_FMT_ABGR8888()),
  BGRA8888 (BITMAP_FMT_BGRA8888()),
  ARGB8888 (BITMAP_FMT_ARGB8888()),
  RGB565 (BITMAP_FMT_RGB565()),
  BGR565 (BITMAP_FMT_BGR565()),
  RGB888 (BITMAP_FMT_RGB888()),
  BGR888 (BITMAP_FMT_BGR888()),
  GRAY (BITMAP_FMT_GRAY()),
  MONO (BITMAP_FMT_MONO());
 
   
  private int value;
  BitmapFormat(int value) {
    this.value = value;
  }
  public int value() {
    return this.value;
  }

  public static BitmapFormat from(int value) {
    for(BitmapFormat iter : BitmapFormat.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return NONE;
  }

  static private native int BITMAP_FMT_NONE();
  static private native int BITMAP_FMT_RGBA8888();
  static private native int BITMAP_FMT_ABGR8888();
  static private native int BITMAP_FMT_BGRA8888();
  static private native int BITMAP_FMT_ARGB8888();
  static private native int BITMAP_FMT_RGB565();
  static private native int BITMAP_FMT_BGR565();
  static private native int BITMAP_FMT_RGB888();
  static private native int BITMAP_FMT_BGR888();
  static private native int BITMAP_FMT_GRAY();
  static private native int BITMAP_FMT_MONO();

}
