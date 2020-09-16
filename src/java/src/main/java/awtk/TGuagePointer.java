package awtk;


/**
 * 仪表指针控件。
 *
 *仪表指针就是一张旋转的图片，图片可以是普通图片也可以是SVG图片。
 *
 *在嵌入式平台上，对于旋转的图片，SVG图片的效率比位图高数倍，所以推荐使用SVG图片。
 *
 *guage\_pointer\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于guage\_pointer\_t控件。
 *
 *在xml中使用"guage\_pointer"标签创建仪表指针控件。如：
 *
 *```xml
 *<guage_pointer x="c" y="50" w="24" h="140" value="-128" image="guage_pointer" />
 *```
 *
 *> 更多用法请参考：
 *[guage.xml](https://github.com/zlgopen/awtk/blob/master/design/default/ui/guage.xml)
 *
 *在c代码中使用函数guage\_pointer\_create创建仪表指针控件。如：
 *
 *
 *> 创建之后，需要用guage\_pointer\_set\_image设置仪表指针图片。
 *
 */
public class TGuagePointer extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TGuagePointer(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TGuagePointer cast(long nativeObj) {
   return new TGuagePointer(nativeObj);
 }


  /**
   * 创建guage_pointer对象
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
    return new TGuagePointer(guage_pointer_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为guage_pointer对象(供脚本语言使用)。
   * 
   * @param widget guage_pointer对象。
   *
   * @return guage_pointer对象。
   */
 public  static TGuagePointer cast(TWidget widget)  {
    return new TGuagePointer(guage_pointer_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 设置指针角度。12点钟方向为0度，顺时钟方向为正，单位为度。
   * 
   * @param angle 指针角度。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setAngle(int angle)  {
   return TRet.from(guage_pointer_set_angle(this != null ? (this.nativeObj) : 0, angle));
 }


  /**
   * 设置指针的图片。
   * 
   * @param image 指针的图片。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setImage(String image)  {
   return TRet.from(guage_pointer_set_image(this != null ? (this.nativeObj) : 0, image));
 }


  /**
   * 设置指针的旋转锚点。
   * 
   * @param anchor_x 指针的锚点坐标x。(后面加上px为像素点，不加px为相对百分比坐标)
   * @param anchor_y 指针的锚点坐标y。(后面加上px为像素点，不加px为相对百分比坐标)
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setAnchor(String anchor_x, String anchor_y)  {
   return TRet.from(guage_pointer_set_anchor(this != null ? (this.nativeObj) : 0, anchor_x, anchor_y));
 }


  /**
   * 指针角度。12点钟方向为0度，顺时钟方向为正，单位为度。
   *
   */
 public int getAngle() {
   return guage_pointer_t_get_prop_angle(this.nativeObj);
 }


  /**
   * 指针图片。
   *
   *图片须垂直向上，图片的中心点为旋转方向。
   *
   */
 public String getImage() {
   return guage_pointer_t_get_prop_image(this.nativeObj);
 }


  /**
   * 图片旋转锚点x坐标。(后面加上px为像素点，不加px为相对百分比坐标0.0f到1.0f)
   *
   */
 public String getAnchorX() {
   return guage_pointer_t_get_prop_anchor_x(this.nativeObj);
 }


  /**
   * 图片旋转锚点x坐标。(后面加上px为像素点，不加px为相对百分比坐标0.0f到1.0f)
   *
   */
 public String getAnchorY() {
   return guage_pointer_t_get_prop_anchor_y(this.nativeObj);
 }

static private native long guage_pointer_create(long parent, int x, int y, int w, int h);
static private native long guage_pointer_cast(long widget);
static private native int guage_pointer_set_angle(long widget, int angle);
static private native int guage_pointer_set_image(long widget, String image);
static private native int guage_pointer_set_anchor(long widget, String anchor_x, String anchor_y);
static private native int guage_pointer_t_get_prop_angle(long nativeObj);
static private native String guage_pointer_t_get_prop_image(long nativeObj);
static private native String guage_pointer_t_get_prop_anchor_x(long nativeObj);
static private native String guage_pointer_t_get_prop_anchor_y(long nativeObj);
};