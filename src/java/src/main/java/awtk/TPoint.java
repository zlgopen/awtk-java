package awtk;


/**
 * 点。包括一个x坐标和一个y坐标。
 *
 */
public class TPoint { 

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
 public TPoint(long nativeObj) {
   this.nativeObj = nativeObj;
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TPoint cast(long nativeObj) {
   return new TPoint(nativeObj);
 }

};