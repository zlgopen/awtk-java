package awtk;


/**
 * 字体管理器，负责字体的加载和缓存管理。
 *(如果使用nanovg，字体由nanovg内部管理)
 *
 */
public class TFontManager { 

/**
 * 原生对象。
 */
 public long nativeObj;


/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TFontManager(long nativeObj) {
   this.nativeObj = nativeObj;
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TFontManager cast(long nativeObj) {
   return new TFontManager(nativeObj);
 }


  /**
   * 卸载指定的字体。
   * 
   * @param name 字体名，为NULL时使用缺省字体。
   * @param size 字体的大小(矢量字体指定为0即可)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet unloadFont(String name, int size)  {
   return TRet.from(font_manager_unload_font(this != null ? (this.nativeObj) : 0, name, size));
 }


  /**
   * 卸载全部字体。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet unloadAll()  {
   return TRet.from(font_manager_unload_all(this != null ? (this.nativeObj) : 0));
 }

static private native int font_manager_unload_font(long fm, String name, int size);
static private native int font_manager_unload_all(long fm);
};