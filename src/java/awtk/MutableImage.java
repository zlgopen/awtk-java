package awtk;

public class MutableImage extends ImageBase {
 public MutableImage(long nativeObj) {
   super(nativeObj);
 }

 static public MutableImage cast(long nativeObj) {
   return new MutableImage(nativeObj);
 }

}

