package awtk;


/**
 * 矩形。包括一个x坐标、y坐标、宽度和高度。
 *
 */
public class TRectf { 

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
 public TRectf(long nativeObj) {
   this.nativeObj = nativeObj;
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TRectf cast(long nativeObj) {
   return new TRectf(nativeObj);
 }


  /**
   * x坐标。
   *
   */
 public double getX() {
   return rectf_t_get_prop_x(this.nativeObj);
 }


  /**
   * y坐标。
   *
   */
 public double getY() {
   return rectf_t_get_prop_y(this.nativeObj);
 }


  /**
   * 宽度。
   *
   */
 public double getW() {
   return rectf_t_get_prop_w(this.nativeObj);
 }


  /**
   * 高度。
   *
   */
 public double getH() {
   return rectf_t_get_prop_h(this.nativeObj);
 }

static private native double rectf_t_get_prop_x(long nativeObj);
static private native double rectf_t_get_prop_y(long nativeObj);
static private native double rectf_t_get_prop_w(long nativeObj);
static private native double rectf_t_get_prop_h(long nativeObj);
};