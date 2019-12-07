package awtk;

public class Pointf {
 public long nativeObj;

 public Pointf(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public Pointf cast(long nativeObj) {
   return new Pointf(nativeObj);
 }

}

