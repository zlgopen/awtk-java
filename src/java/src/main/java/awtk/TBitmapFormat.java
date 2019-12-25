package awtk;



/**
 * 位图格式常量定义。
 *
 */

public enum TBitmapFormat {
  
/**
 * 无效格式。
 *
 */
 
  NONE (BITMAP_FMT_NONE()),
  
/**
 * 一个像素占用4个字节，RGBA占一个字节，按内存地址递增。
 *
 */
 
  RGBA8888 (BITMAP_FMT_RGBA8888()),
  
/**
 * 一个像素占用4个字节，ABGR占一个字节，按内存地址递增。
 *
 */
 
  ABGR8888 (BITMAP_FMT_ABGR8888()),
  
/**
 * 一个像素占用4个字节，BGRA占一个字节，按内存地址递增。
 *
 */
 
  BGRA8888 (BITMAP_FMT_BGRA8888()),
  
/**
 * 一个像素占用4个字节，ARGB占一个字节，按内存地址递增。
 *
 */
 
  ARGB8888 (BITMAP_FMT_ARGB8888()),
  
/**
 * 一个像素占用2个字节，RGB分别占用5,6,5位, 按内存地址递增。
 *
 */
 
  RGB565 (BITMAP_FMT_RGB565()),
  
/**
 * 一个像素占用2个字节，BGR分别占用5,6,5位, 按内存地址递增。
 *
 */
 
  BGR565 (BITMAP_FMT_BGR565()),
  
/**
 * 一个像素占用3个字节，RGB占一个字节，按内存地址递增。
 *
 */
 
  RGB888 (BITMAP_FMT_RGB888()),
  
/**
 * 一个像素占用3个字节，RGB占一个字节，按内存地址递增。
 *
 */
 
  BGR888 (BITMAP_FMT_BGR888()),
  
/**
 * 一个像素占用1个字节。
 *
 */
 
  GRAY (BITMAP_FMT_GRAY()),
  
/**
 * 一个像素占用1比特。
 *
 */
 
  MONO (BITMAP_FMT_MONO());
 
 
  private TBitmapFormat(int value) {
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
  public static TBitmapFormat from(int value) {
    for(TBitmapFormat iter : TBitmapFormat.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return NONE;
  }
  
  private int value;

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
