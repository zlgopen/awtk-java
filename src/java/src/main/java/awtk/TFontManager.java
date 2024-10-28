package awtk;


/**
 * 字体管理器，负责字体的加载和缓存管理。
 *(如果使用nanovg，字体由nanovg内部管理)
 *
 */
public class TFontManager extends TEmitter { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TFontManager(long nativeObj) {
   super(nativeObj);
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
   * 设置是否使用标准字号
   * 
   * @param is_standard 是否使用标准字号
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setStandardFontSize(boolean is_standard)  {
   return TRet.from(font_manager_set_standard_font_size(this != null ? (this.nativeObj) : 0, is_standard));
 }


  /**
   * 获取是否使用标准字号
   * 
   *
   * @return 返回TRUE表示使用标准字号，否则表示不是。
   */
 public  boolean getStandardFontSize()  {
    return font_manager_get_standard_font_size(this != null ? (this.nativeObj) : 0);
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
   * 清除最久没有被使用的缓冲字模。
   * 
   * @param cache_size 每种字体保留缓存字模的个数。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet shrinkCache(int cache_size)  {
   return TRet.from(font_manager_shrink_cache(this != null ? (this.nativeObj) : 0, cache_size));
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

static private native int font_manager_set_standard_font_size(long fm, boolean is_standard);
static private native boolean font_manager_get_standard_font_size(long fm);
static private native int font_manager_unload_font(long fm, String name, int size);
static private native int font_manager_shrink_cache(long fm, int cache_size);
static private native int font_manager_unload_all(long fm);
};