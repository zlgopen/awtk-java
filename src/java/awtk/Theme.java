package awtk;

public class Theme {
 public long nativeObj;

 public Theme(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public Theme cast(long nativeObj) {
   return new Theme(nativeObj);
 }

 public  static Theme instance()  {
   return new Theme(theme());
 }

static private native long theme();
}

