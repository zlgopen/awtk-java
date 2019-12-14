package awtk;


/**
 * 矩形。包括一个x坐标、y坐标、宽度和高度。
 *
 */
public class Rect {
 public long nativeObj;

 public Rect(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public Rect cast(long nativeObj) {
   return new Rect(nativeObj);
 }


/**
 * 创建rect对象。 主要供脚本语言使用。
 * 
 * @param x x坐标。
 * @param y y坐标。
 * @param w 宽度。
 * @param h 高度。
 *
 * @returns rect对象。
 */
 public  static Rect create(int x, int y, int w, int h)  {
   return new Rect(rect_create(x, y, w, h));
 }


/**
 * 设置rect对象的xywh。 主要供脚本语言使用。
 * 
 * @param rect rect对象。
 * @param x x坐标。
 * @param y y坐标。
 * @param w 宽度。
 * @param h 高度。
 *
 * @returns rect对象。
 */
 public  Rect set(int x, int y, int w, int h)  {
   return new Rect(rect_set(this != null ? (this.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换为rect对象。 供脚本语言使用。
 * 
 * @param rect rect对象。
 *
 * @returns rect对象。
 */
 public  static Rect cast(Rect rect)  {
   return new Rect(rect_cast(rect != null ? (rect.nativeObj) : 0));
 }


/**
 * 销毁rect对象。 主要供脚本语言使用。
 * 
 * @param r rect对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret destroy()  {
   return Ret.from(rect_destroy(this != null ? (this.nativeObj) : 0));
 }

 public int getX() {
   return rect_t_get_prop_x(this.nativeObj);
 }

 public int getY() {
   return rect_t_get_prop_y(this.nativeObj);
 }

 public int getW() {
   return rect_t_get_prop_w(this.nativeObj);
 }

 public int getH() {
   return rect_t_get_prop_h(this.nativeObj);
 }

static private native long rect_create(int x, int y, int w, int h);
static private native long rect_set(long rect, int x, int y, int w, int h);
static private native long rect_cast(long rect);
static private native int rect_destroy(long r);
static private native int rect_t_get_prop_x(long nativeObj);
static private native int rect_t_get_prop_y(long nativeObj);
static private native int rect_t_get_prop_w(long nativeObj);
static private native int rect_t_get_prop_h(long nativeObj);
}

