package awtk;

public class TimerManager {
 public long nativeObj;

 public TimerManager(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public TimerManager cast(long nativeObj) {
   return new TimerManager(nativeObj);
 }

}

