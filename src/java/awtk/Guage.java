package awtk;


/**
 * 表盘控件。
 * 
 *  表盘控件就是一张图片。
 * 
 *  guage\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于guage\_t控件。
 * 
 *  在xml中使用"guage"标签创建表盘控件。如：
 * 
 *  ```xml
 *  <guage x="c" y="10" w="240" h="240" image="guage_bg"
 *  ```
 * 
 * 更多用法请参考：
 *  [guage.xml](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/guage.xml)
 * 
 *  在c代码中使用函数guage\_create创建表盘控件。如：
 * 
 *  ```c
 *   widget_t* guage = guage_create(win, 10, 10, 200, 200);
 *   guage_set_image(guage, "guage_bg");
 *  ```
 * 
 *  可用通过style来设置控件的显示风格，如背景和边框等。如：
 * 
 *  ```xml
 *  <guage>
 *   <style name="border">
 *    <normal border_color="#000000" bg_color="#e0e0e0" text_color="black"/>
 *   </style>
 *  </guage>
 *  ```
 * 
 * 更多用法请参考：
 *  [theme
 *  default](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/styles/default.xml)
 *
 */
public class Guage extends Widget {
 public long nativeObj;

 public Guage(long nativeObj) {
   super(nativeObj);
 }

 static public Guage cast(long nativeObj) {
   return new Guage(nativeObj);
 }


/**
 * 创建guage对象
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
   return new Guage(guage_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换为guage对象(供脚本语言使用)。
 * 
 * @param widget guage对象。
 *
 * @returns guage对象。
 */
 public  static Guage cast(Widget widget)  {
   return new Guage(guage_cast(widget != null ? (widget.nativeObj) : 0));
 }


/**
 * 设置背景图片的名称。
 * 
 * @param widget image对象。
 * @param name 图片名称，该图片必须存在于资源管理器。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setImage(String name)  {
   return Ret.from(guage_set_image(this != null ? (this.nativeObj) : 0, name));
 }


/**
 * 设置图片的显示方式。
 * 
 * 绘制方式的属性值和枚举值:
 *  [image\_draw\_type\_name\_value](https://github.com/zlgopen/awtk/blob/master/src/base/enums.c#L98)
 * 
 * @param widget image对象。
 * @param draw_type 显示方式。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setDrawType(ImageDrawType draw_type)  {
   return Ret.from(guage_set_draw_type(this != null ? (this.nativeObj) : 0, draw_type.value()));
 }

 public String getImage() {
   return guage_t_get_prop_image(this.nativeObj);
 }

 public ImageDrawType getDrawType() {
   return ImageDrawType.from(guage_t_get_prop_draw_type(this.nativeObj));

 }

static private native long guage_create(long parent, int x, int y, int w, int h);
static private native long guage_cast(long widget);
static private native int guage_set_image(long widget, String name);
static private native int guage_set_draw_type(long widget, int draw_type);
static private native String guage_t_get_prop_image(long nativeObj);
static private native int guage_t_get_prop_draw_type(long nativeObj);
}

