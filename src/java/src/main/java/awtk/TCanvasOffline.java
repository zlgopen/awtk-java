package awtk;


/**
 * 离线画布 canvas。
 *
 */
public class TCanvasOffline { 

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
 public TCanvasOffline(long nativeObj) {
   this.nativeObj = nativeObj;
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TCanvasOffline cast(long nativeObj) {
   return new TCanvasOffline(nativeObj);
 }

};