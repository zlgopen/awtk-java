package awtk;


/**
 * 图片管理器。负责加载，解码和缓存图片。
 *
 */
public class TImageManager { 

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
 public TImageManager(long nativeObj) {
   this.nativeObj = nativeObj;
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TImageManager cast(long nativeObj) {
   return new TImageManager(nativeObj);
 }


  /**
   * 获取缺省的图片管理器。
   * 
   *
   * @return 返回图片管理器对象。
   */
 public  static TImageManager instance()  {
    return new TImageManager(image_manager());
 }


  /**
   * 获取指定的图片。
   *先从缓存查找，如果没找到，再加载并缓存。
   * 
   * @param name 图片名称。
   * @param image 用于返回图片。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet getBitmap(String name, TBitmap image)  {
   return TRet.from(image_manager_get_bitmap(this != null ? (this.nativeObj) : 0, name, image != null ? (image.nativeObj) : 0));
 }


  /**
   * 预加载指定的图片。
   * 
   * @param name 图片名称。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet preload(String name)  {
   return TRet.from(image_manager_preload(this != null ? (this.nativeObj) : 0, name));
 }

static private native long image_manager();
static private native int image_manager_get_bitmap(long imm, String name, long image);
static private native int image_manager_preload(long imm, String name);
};