package awtk;


/**
 * 点。包括一个x坐标和一个y坐标。
 *
 */
public class Point {
 public long nativeObj;

 public Point(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public Point cast(long nativeObj) {
   return new Point(nativeObj);
 }

}

