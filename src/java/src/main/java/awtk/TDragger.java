package awtk;


/**
 * dragger控件。
 *
 *目前主要用于scrollbar里的滑块。
 *
 */
public class TDragger extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TDragger(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TDragger cast(long nativeObj) {
   return new TDragger(nativeObj);
 }


  /**
   * 创建dragger对象。
   * 
   * @param parent 父控件
   * @param x x坐标
   * @param y y坐标
   * @param w 宽度
   * @param h 高度
   *
   * @return 对象。
   */
 public  static TWidget create(TWidget parent, int x, int y, int w, int h)  {
    return new TDragger(dragger_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为dragger对象(供脚本语言使用)。
   * 
   * @param widget dragger对象。
   *
   * @return dragger对象。
   */
 public  static TDragger cast(TWidget widget)  {
    return new TDragger(dragger_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 设置拖动的范围。
   * 
   * @param x_min x坐标最小值。
   * @param y_min y坐标最小值。
   * @param x_max x坐标最大值。
   * @param y_max y坐标最大值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setRange(int x_min, int y_min, int x_max, int y_max)  {
   return TRet.from(dragger_set_range(this != null ? (this.nativeObj) : 0, x_min, y_min, x_max, y_max));
 }


  /**
   * x坐标的最小值。
   *
   */
 public int getXMin() {
   return dragger_t_get_prop_x_min(this.nativeObj);
 }


  /**
   * y坐标的最小值。
   *
   */
 public int getYMin() {
   return dragger_t_get_prop_y_min(this.nativeObj);
 }


  /**
   * x坐标的最大值。
   *
   */
 public int getXMax() {
   return dragger_t_get_prop_x_max(this.nativeObj);
 }


  /**
   * y坐标的最大值。
   *
   */
 public int getYMax() {
   return dragger_t_get_prop_y_max(this.nativeObj);
 }

static private native long dragger_create(long parent, int x, int y, int w, int h);
static private native long dragger_cast(long widget);
static private native int dragger_set_range(long widget, int x_min, int y_min, int x_max, int y_max);
static private native int dragger_t_get_prop_x_min(long nativeObj);
static private native int dragger_t_get_prop_y_min(long nativeObj);
static private native int dragger_t_get_prop_x_max(long nativeObj);
static private native int dragger_t_get_prop_y_max(long nativeObj);
};