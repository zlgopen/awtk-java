package awtk;


public enum BitmapFlag {
  NONE (BITMAP_FLAG_NONE()),
  OPAQUE (BITMAP_FLAG_OPAQUE()),
  IMMUTABLE (BITMAP_FLAG_IMMUTABLE()),
  TEXTURE (BITMAP_FLAG_TEXTURE()),
  CHANGED (BITMAP_FLAG_CHANGED()),
  PREMULTI_ALPHA (BITMAP_FLAG_PREMULTI_ALPHA());
 
   
  private int value;
  BitmapFlag(int value) {
    this.value = value;
  }
  public int value() {
    return this.value;
  }

  public static BitmapFlag from(int value) {
    for(BitmapFlag iter : BitmapFlag.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return NONE;
  }

  static private native int BITMAP_FLAG_NONE();
  static private native int BITMAP_FLAG_OPAQUE();
  static private native int BITMAP_FLAG_IMMUTABLE();
  static private native int BITMAP_FLAG_TEXTURE();
  static private native int BITMAP_FLAG_CHANGED();
  static private native int BITMAP_FLAG_PREMULTI_ALPHA();

}
