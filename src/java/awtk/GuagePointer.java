package awtk;


/**
 * 仪表指针控件。 仪表指针就是一张旋转的图片，图片可以是普通图片也可以是SVG图片。 在嵌入式平台上，对于旋转的图片，SVG图片的效率比位图高数倍，所以推荐使用SVG图片。 guage\_pointer\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于guage\_pointer\_t控件。 在xml中使用"guage\_pointer"标签创建仪表指针控件。如： ```xml <guage_pointer x="c" y="50" w="24" h="140" value="-128" image="guage_pointer" /> ``` 更多用法请参考： [guage.xml](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/guage.xml) 在c代码中使用函数guage\_pointer\_create创建仪表指针控件。如： ```c  widget_t* guage_pointer = guage_pointer_create(guage, 10, 10, 100, 30);  guage_pointer_set_image(guage_pointer, "guage_pointer"); ``` 创建之后，需要用guage\_pointer\_set\_image设置仪表指针图片。
 *
 */
public class GuagePointer extends Widget {
 public long nativeObj;

 public GuagePointer(long nativeObj) {
   super(nativeObj);
 }

 static public GuagePointer cast(long nativeObj) {
   return new GuagePointer(nativeObj);
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
 * @returns 对象。
 */
 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new GuagePointer(guage_pointer_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换为guage_pointer对象(供脚本语言使用)。
 * 
 * @param widget guage_pointer对象。
 *
 * @returns guage_pointer对象。
 */
 public  static GuagePointer cast(Widget widget)  {
   return new GuagePointer(guage_pointer_cast(widget != null ? (widget.nativeObj) : 0));
 }


/**
 * 设置指针角度。12点钟方向为0度，顺时钟方向为正，单位为度。
 * 
 * @param widget 控件对象。
 * @param angle 指针角度。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setAngle(int angle)  {
   return Ret.from(guage_pointer_set_angle(this != null ? (this.nativeObj) : 0, angle));
 }


/**
 * 设置指针的图片。
 * 
 * @param widget 控件对象。
 * @param image 指针的图片。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setImage(String image)  {
   return Ret.from(guage_pointer_set_image(this != null ? (this.nativeObj) : 0, image));
 }


/**
 * 设置指针的旋转锚点。
 * 
 * @param widget 控件对象。
 * @param anchor_x 指针的锚点坐标x。(后面加上px为像素点，不加px为相对百分比坐标)
 * @param anchor_y 指针的锚点坐标y。(后面加上px为像素点，不加px为相对百分比坐标)
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setAnchor(String anchor_x, String anchor_y)  {
   return Ret.from(guage_pointer_set_anchor(this != null ? (this.nativeObj) : 0, anchor_x, anchor_y));
 }

 public int getAngle() {
   return guage_pointer_t_get_prop_angle(this.nativeObj);
 }

 public String getImage() {
   return guage_pointer_t_get_prop_image(this.nativeObj);
 }

 public double getAnchorX() {
   return guage_pointer_t_get_prop_anchor_x(this.nativeObj);
 }

 public double getAnchorY() {
   return guage_pointer_t_get_prop_anchor_y(this.nativeObj);
 }

static private native long guage_pointer_create(long parent, int x, int y, int w, int h);
static private native long guage_pointer_cast(long widget);
static private native int guage_pointer_set_angle(long widget, int angle);
static private native int guage_pointer_set_image(long widget, String image);
static private native int guage_pointer_set_anchor(long widget, String anchor_x, String anchor_y);
static private native int guage_pointer_t_get_prop_angle(long nativeObj);
static private native String guage_pointer_t_get_prop_image(long nativeObj);
static private native double guage_pointer_t_get_prop_anchor_x(long nativeObj);
static private native double guage_pointer_t_get_prop_anchor_y(long nativeObj);
}

