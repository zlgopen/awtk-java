package awtk;



/**
 * 字模格式常量定义。
 *
 */

public enum TGlyphFormat {
  
/**
 * 每个像素占用1个字节(缺省)。
 *
 */
 
  ALPHA (GLYPH_FMT_ALPHA()),
  
/**
 * 每个像素占用1个比特。
 *
 */
 
  MONO (GLYPH_FMT_MONO()),
  
/**
 * 每个像素占用4个字节。
 *
 */
 
  RGBA (GLYPH_FMT_RGBA());
 
 
  private TGlyphFormat(int value) {
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
  public static TGlyphFormat from(int value) {
    for(TGlyphFormat iter : TGlyphFormat.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return ALPHA;
  }
  
  private int value;

  static private native int GLYPH_FMT_ALPHA();
  static private native int GLYPH_FMT_MONO();
  static private native int GLYPH_FMT_RGBA();

}
