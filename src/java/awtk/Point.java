package awtk;

public class Point {
 public long nativeObj;

 public Point(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public Point cast(long nativeObj) {
   return new Point(nativeObj);
 }

}

