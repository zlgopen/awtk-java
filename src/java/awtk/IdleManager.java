package awtk;

public class IdleManager {
 public long nativeObj;

 public IdleManager(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public IdleManager cast(long nativeObj) {
   return new IdleManager(nativeObj);
 }

}

