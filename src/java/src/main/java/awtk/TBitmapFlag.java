package awtk;



/**
 * 位图标志常量定义。
 *
 */

public enum TBitmapFlag {
  
  /**
   * 无特殊标志。
   *
   */
 
  NONE (BITMAP_FLAG_NONE()),
  
  /**
   * 不透明图片。
   *
   */
 
  OPAQUE (BITMAP_FLAG_OPAQUE()),
  
  /**
   * 图片内容不会变化。
   *
   */
 
  IMMUTABLE (BITMAP_FLAG_IMMUTABLE()),
  
  /**
   * OpenGL Texture, bitmap的id是有效的texture id。
   *
   */
 
  TEXTURE (BITMAP_FLAG_TEXTURE()),
  
  /**
   * 如果是MUTABLE的图片，更新时需要设置此标志，底层可能会做特殊处理，比如更新图片到GPU。
   *
   */
 
  CHANGED (BITMAP_FLAG_CHANGED()),
  
  /**
   * 预乘alpha。
   *
   */
 
  PREMULTI_ALPHA (BITMAP_FLAG_PREMULTI_ALPHA()),
  
  /**
   * 位图数据已经处理了 lcd 旋转，同时说明 bitmap 的宽高和真实数据的宽高可能不一致
   *
   */
 
  LCD_ORIENTATION (BITMAP_FLAG_LCD_ORIENTATION()),
  
  /**
   * 该位图为 GPU 的 fbo 数据。
   *
   */
 
  GPU_FBO_TEXTURE (BITMAP_FLAG_GPU_FBO_TEXTURE());
 
 
  private TBitmapFlag(int value) {
    this.value = value;
  }

/**
 * 获取枚举的值。
 *
 * @return 枚举的值。
 */
  public int value() {
    return this.value;
  }

/**
 * 把枚举的值转换层枚举。
 *
 * @param value 枚举的值。

 * @return 对应的枚举类型。
 */
  public static TBitmapFlag from(int value) {
    for(TBitmapFlag iter : TBitmapFlag.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return NONE;
  }
  
  private int value;

  static private native int BITMAP_FLAG_NONE();
  static private native int BITMAP_FLAG_OPAQUE();
  static private native int BITMAP_FLAG_IMMUTABLE();
  static private native int BITMAP_FLAG_TEXTURE();
  static private native int BITMAP_FLAG_CHANGED();
  static private native int BITMAP_FLAG_PREMULTI_ALPHA();
  static private native int BITMAP_FLAG_LCD_ORIENTATION();
  static private native int BITMAP_FLAG_GPU_FBO_TEXTURE();

}
