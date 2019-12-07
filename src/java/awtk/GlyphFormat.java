package awtk;


public enum GlyphFormat {
  ALPHA (GLYPH_FMT_ALPHA()),
  MONO (GLYPH_FMT_MONO()),
  RGBA (GLYPH_FMT_RGBA());
 
   
  private int value;
  GlyphFormat(int value) {
    this.value = value;
  }
  public int value() {
    return this.value;
  }

  public static GlyphFormat from(int value) {
    for(GlyphFormat iter : GlyphFormat.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return ALPHA;
  }

  static private native int GLYPH_FMT_ALPHA();
  static private native int GLYPH_FMT_MONO();
  static private native int GLYPH_FMT_RGBA();

}
