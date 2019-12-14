package awtk;


/**
 * 点(浮点数)。包括一个x坐标和一个y坐标。
 *
 */
public class Pointf {
 public long nativeObj;

 public Pointf(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public Pointf cast(long nativeObj) {
   return new Pointf(nativeObj);
 }

}

