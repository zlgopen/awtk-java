package awtk;


/**
 * SVG图片控件。
 * 
 *  svg\_image\_t是[image\_base\_t](image_base_t.md)的子类控件，image\_base\_t的函数均适用于svg\_image\_t控件。
 * 
 *  在xml中使用"svg"标签创建SVG图片控件。如：
 * 
 *  ```xml
 *  <svg image="girl"/>
 *  ```
 * 
 *更多用法请参考：[svg image](
 *  https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/svg_image.xml)
 * 
 *  在c代码中使用函数svg\_image\_create创建SVG图片控件。如：
 * 
 *  ```c
 *   widget_t* image = svg_image_create(win, 10, 10, 200, 200);
 *   image_set_image(image, "girl");
 *  ```
 * 
 * 创建之后: 需要用widget\_set\_image设置图片名称。
 * 
 * 完整示例请参考：[svg image demo](
 *  https://github.com/zlgopen/awtk-c-demos/blob/master/demos/svg_image.c)
 * 
 *  可用通过style来设置控件的显示风格，如背景和边框等。如：
 * 
 *  ```xml
 *  <svg>
 *  <style name="default">
 *    <normal border_color="green" fg_color="red" />
 *  </style>
 *  </svg>
 *  ```
 * 
 * 更多用法请参考：[theme default](
 *  https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/styles/default.xml)
 *
 */
public class SvgImage extends ImageBase {
 public long nativeObj;

 public SvgImage(long nativeObj) {
   super(nativeObj);
 }

 static public SvgImage cast(long nativeObj) {
   return new SvgImage(nativeObj);
 }


/**
 * 创建svg_image对象
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
   return new SvgImage(svg_image_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 设置控件的图片名称。
 * 
 * 如果需要显示文件系统中的图片，只需将图片名称换成实际的文件名，并加上"file://"前缀即可。
 * 
 * @param widget image对象。
 * @param name 图片名称，该图片必须存在于资源管理器。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setImage(String name)  {
   return Ret.from(svg_image_set_image(this != null ? (this.nativeObj) : 0, name));
 }


/**
 * 转换为svg_image对象(供脚本语言使用)。
 * 
 * @param widget svg_image对象。
 *
 * @returns svg_image对象。
 */
 public  static SvgImage cast(Widget widget)  {
   return new SvgImage(svg_image_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long svg_image_create(long parent, int x, int y, int w, int h);
static private native int svg_image_set_image(long widget, String name);
static private native long svg_image_cast(long widget);
}

