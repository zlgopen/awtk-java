package awtk;


public enum ImageDrawType {
  DEFAULT (IMAGE_DRAW_DEFAULT()),
  CENTER (IMAGE_DRAW_CENTER()),
  ICON (IMAGE_DRAW_ICON()),
  SCALE (IMAGE_DRAW_SCALE()),
  SCALE_AUTO (IMAGE_DRAW_SCALE_AUTO()),
  SCALE_DOWN (IMAGE_DRAW_SCALE_DOWN()),
  SCALE_W (IMAGE_DRAW_SCALE_W()),
  SCALE_H (IMAGE_DRAW_SCALE_H()),
  REPEAT (IMAGE_DRAW_REPEAT()),
  REPEAT_X (IMAGE_DRAW_REPEAT_X()),
  REPEAT_Y (IMAGE_DRAW_REPEAT_Y()),
  REPEAT_Y_INVERSE (IMAGE_DRAW_REPEAT_Y_INVERSE()),
  PATCH9 (IMAGE_DRAW_PATCH9()),
  PATCH3_X (IMAGE_DRAW_PATCH3_X()),
  PATCH3_Y (IMAGE_DRAW_PATCH3_Y()),
  PATCH3_X_SCALE_Y (IMAGE_DRAW_PATCH3_X_SCALE_Y()),
  PATCH3_Y_SCALE_X (IMAGE_DRAW_PATCH3_Y_SCALE_X());
 
   
  private int value;
  ImageDrawType(int value) {
    this.value = value;
  }
  public int value() {
    return this.value;
  }

  public static ImageDrawType from(int value) {
    for(ImageDrawType iter : ImageDrawType.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return DEFAULT;
  }

  static private native int IMAGE_DRAW_DEFAULT();
  static private native int IMAGE_DRAW_CENTER();
  static private native int IMAGE_DRAW_ICON();
  static private native int IMAGE_DRAW_SCALE();
  static private native int IMAGE_DRAW_SCALE_AUTO();
  static private native int IMAGE_DRAW_SCALE_DOWN();
  static private native int IMAGE_DRAW_SCALE_W();
  static private native int IMAGE_DRAW_SCALE_H();
  static private native int IMAGE_DRAW_REPEAT();
  static private native int IMAGE_DRAW_REPEAT_X();
  static private native int IMAGE_DRAW_REPEAT_Y();
  static private native int IMAGE_DRAW_REPEAT_Y_INVERSE();
  static private native int IMAGE_DRAW_PATCH9();
  static private native int IMAGE_DRAW_PATCH3_X();
  static private native int IMAGE_DRAW_PATCH3_Y();
  static private native int IMAGE_DRAW_PATCH3_X_SCALE_Y();
  static private native int IMAGE_DRAW_PATCH3_Y_SCALE_X();

}
