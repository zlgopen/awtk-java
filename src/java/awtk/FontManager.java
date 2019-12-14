package awtk;


/**
 * 字体管理器，负责字体的加载和缓存管理。 (如果使用nanovg，字体由nanovg内部管理)
 *
 */
public class FontManager {
 public long nativeObj;

 public FontManager(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public FontManager cast(long nativeObj) {
   return new FontManager(nativeObj);
 }


/**
 * 卸载指定的字体。
 * 
 * @param fm 字体管理器对象。
 * @param name 字体名，为NULL时使用缺省字体。
 * @param size 字体的大小(矢量字体指定为0即可)。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret unloadFont(String name, int size)  {
   return Ret.from(font_manager_unload_font(this != null ? (this.nativeObj) : 0, name, size));
 }


/**
 * 卸载全部字体。
 * 
 * @param fm 字体管理器对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret unloadAll()  {
   return Ret.from(font_manager_unload_all(this != null ? (this.nativeObj) : 0));
 }

static private native int font_manager_unload_font(long fm, String name, int size);
static private native int font_manager_unload_all(long fm);
}

