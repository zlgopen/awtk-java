package awtk;

public class ImageManager {
 public long nativeObj;

 public ImageManager(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public ImageManager cast(long nativeObj) {
   return new ImageManager(nativeObj);
 }

 public  static ImageManager instance()  {
   return new ImageManager(image_manager());
 }

 public  Ret getBitmap(String name, Bitmap image)  {
   return Ret.from(image_manager_get_bitmap(this.nativeObj, name, image != null ? (image.nativeObj) : 0));
 }

static private native long image_manager();
static private native int image_manager_get_bitmap(long imm, String name, long image);
}

