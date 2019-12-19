package awtk;


/**
 * 矩形。包括一个x坐标、y坐标、宽度和高度。
 *
 */
public class TRect { 

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
 public TRect(long nativeObj) {
   this.nativeObj = nativeObj;
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TRect cast(long nativeObj) {
   return new TRect(nativeObj);
 }


/**
 * 创建rect对象。
 *
 *> 主要供脚本语言使用。
 * 
 * @param x x坐标。
 * @param y y坐标。
 * @param w 宽度。
 * @param h 高度。
 
 * @return rect对象。
 */
 public  static TRect create(int x, int y, int w, int h)  {
    return new TRect(rect_create(x, y, w, h));
 }


/**
 * 设置rect对象的xywh。
 *
 *> 主要供脚本语言使用。
 * 
 * @param x x坐标。
 * @param y y坐标。
 * @param w 宽度。
 * @param h 高度。
 
 * @return rect对象。
 */
 public  TRect set(int x, int y, int w, int h)  {
    return new TRect(rect_set(this != null ? (this.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换为rect对象。
 *
 *> 供脚本语言使用。
 * 
 * @param rect rect对象。
 
 * @return rect对象。
 */
 public  static TRect cast(TRect rect)  {
    return new TRect(rect_cast(rect != null ? (rect.nativeObj) : 0));
 }


/**
 * 销毁rect对象。
 *
 *> 主要供脚本语言使用。
 * 
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet destroy()  {
   return TRet.from(rect_destroy(this != null ? (this.nativeObj) : 0));
 }


/**
 * x坐标。
 *
 */
 public int getX() {
   return rect_t_get_prop_x(this.nativeObj);
 }


/**
 * y坐标。
 *
 */
 public int getY() {
   return rect_t_get_prop_y(this.nativeObj);
 }


/**
 * 宽度。
 *
 */
 public int getW() {
   return rect_t_get_prop_w(this.nativeObj);
 }


/**
 * 高度。
 *
 */
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
};