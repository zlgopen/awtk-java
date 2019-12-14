package awtk;


/**
 * 图片管理器。负责加载，解码和缓存图片。
 *
 */
public class ImageManager {
 public long nativeObj;

 public ImageManager(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public ImageManager cast(long nativeObj) {
   return new ImageManager(nativeObj);
 }


/**
 * 获取缺省的图片管理器。
 * 
 *
 * @returns 返回图片管理器对象。
 */
 public  static ImageManager instance()  {
   return new ImageManager(image_manager());
 }


/**
 * 获取指定的图片。 先从缓存查找，如果没找到，再加载并缓存。
 * 
 * @param imm 图片管理器对象。
 * @param name 图片名称。
 * @param image 用于返回图片。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret getBitmap(String name, Bitmap image)  {
   return Ret.from(image_manager_get_bitmap(this != null ? (this.nativeObj) : 0, name, image != null ? (image.nativeObj) : 0));
 }

static private native long image_manager();
static private native int image_manager_get_bitmap(long imm, String name, long image);
}

