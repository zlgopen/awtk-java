package awtk;

public class FontManager {
 public long nativeObj;

 public FontManager(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public FontManager cast(long nativeObj) {
   return new FontManager(nativeObj);
 }

 public  Ret unloadFont(String name, int size)  {
   return Ret.from(font_manager_unload_font(this.nativeObj, name, size));
 }

 public  Ret unloadAll()  {
   return Ret.from(font_manager_unload_all(this.nativeObj));
 }

static private native int font_manager_unload_font(long fm, String name, int size);
static private native int font_manager_unload_all(long fm);
}

