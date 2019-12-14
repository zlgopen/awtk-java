package awtk;


/**
 * 图片控件。
 * 
 *  用来显示一张静态图片，目前支持bmp/png/jpg等格式。
 * 
 *  如果要显示gif文件，请用[gif\_image](gif_image_t.md)。
 * 
 *  如果要显示svg文件，请用[svg\_image](svg_image_t.md)。
 * 
 *  如果需要支持勾选效果，请设置**selectable**属性。
 * 
 *  如果需要支持点击效果，请设置**clickable**属性。
 * 
 *  image\_t是[image\_base\_t](image_base_t.md)的子类控件，image\_base\_t的函数均适用于image\_t控件。
 * 
 *  在xml中使用"image"标签创建图片控件。如：
 * 
 *  ```xml
 *  <image style="border" image="earth" draw_type="icon" />
 *  ```
 * 
 * 更多用法请参考：
 *  [image.xml](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/images.xml)
 * 
 *  在c代码中使用函数image\_create创建图片控件。如：
 * 
 *  ```c
 *   widget_t* image = image_create(win, 10, 10, 128, 30);
 *   image_set_image(image, "earth");
 *  ```
 * 
 * 创建之后:
 *
 * 需要用widget\_set\_image设置图片名称。
 *
 * 可以用image\_set\_draw\_type设置图片的绘制方式。
 * 
 * 绘制方式请参考[image\_draw\_type\_t](image_draw_type_t.md)
 * 
 * 绘制方式的属性值和枚举值:
 *  [image\_draw\_type\_name\_value](https://github.com/zlgopen/awtk/blob/master/src/base/enums.c#L98)
 * 
 * 完整示例请参考：
 *  [image demo](https://github.com/zlgopen/awtk-c-demos/blob/master/demos/image.c)
 * 
 *  可用通过style来设置控件的显示风格，如背景和边框等。如：
 * 
 *  ```xml
 *  <image>
 *   <style name="border">
 *    <normal border_color="#000000" bg_color="#e0e0e0" text_color="black"/>
 *   </style>
 *  </image>
 *  ```
 * 
 * 更多用法请参考：
 *  [theme
 *  default](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/styles/default.xml#L313)
 *
 */
public class Image extends ImageBase {
 public long nativeObj;

 public Image(long nativeObj) {
   super(nativeObj);
 }

 static public Image cast(long nativeObj) {
   return new Image(nativeObj);
 }


/**
 * 创建image对象
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
   return new Image(image_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 设置图片的绘制方式。
 * 
 * @param widget image对象。
 * @param draw_type 绘制方式(仅在没有旋转和缩放时生效)。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setDrawType(ImageDrawType draw_type)  {
   return Ret.from(image_set_draw_type(this != null ? (this.nativeObj) : 0, draw_type.value()));
 }


/**
 * 转换为image对象(供脚本语言使用)。
 * 
 * @param widget image对象。
 *
 * @returns image对象。
 */
 public  static Image cast(Widget widget)  {
   return new Image(image_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public ImageDrawType getDrawType() {
   return ImageDrawType.from(image_t_get_prop_draw_type(this.nativeObj));

 }

static private native long image_create(long parent, int x, int y, int w, int h);
static private native int image_set_draw_type(long widget, int draw_type);
static private native long image_cast(long widget);
static private native int image_t_get_prop_draw_type(long nativeObj);
}

