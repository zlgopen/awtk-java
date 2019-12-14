package awtk;


/**
 * dragger控件。
 * 
 *  目前主要用于scrollbar里的滑块。
 *
 */
public class Dragger extends Widget {
 public long nativeObj;

 public Dragger(long nativeObj) {
   super(nativeObj);
 }

 static public Dragger cast(long nativeObj) {
   return new Dragger(nativeObj);
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
 * @returns 对象。
 */
 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new Dragger(dragger_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换为dragger对象(供脚本语言使用)。
 * 
 * @param widget dragger对象。
 *
 * @returns dragger对象。
 */
 public  static Dragger cast(Widget widget)  {
   return new Dragger(dragger_cast(widget != null ? (widget.nativeObj) : 0));
 }


/**
 * 设置拖动的范围。
 * 
 * @param widget dragger控件。
 * @param x_min x坐标最小值。
 * @param y_min y坐标最小值。
 * @param x_max x坐标最大值。
 * @param y_max y坐标最大值。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setRange(int x_min, int y_min, int x_max, int y_max)  {
   return Ret.from(dragger_set_range(this != null ? (this.nativeObj) : 0, x_min, y_min, x_max, y_max));
 }

 public int getXMin() {
   return dragger_t_get_prop_x_min(this.nativeObj);
 }

 public int getYMin() {
   return dragger_t_get_prop_y_min(this.nativeObj);
 }

 public int getXMax() {
   return dragger_t_get_prop_x_max(this.nativeObj);
 }

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
}

