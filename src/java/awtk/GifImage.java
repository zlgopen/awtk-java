package awtk;


/**
 * GIF图片控件。
 * 
 * 注意：GIF图片的尺寸大于控件大小时会自动缩小图片，但一般的嵌入式系统的硬件加速都不支持图片缩放，
 *  所以缩放图片会导致性能明显下降。如果性能不满意时，请确认一下GIF图片的尺寸是否小余控件大小。
 * 
 *  gif\_image\_t是[image\_base\_t](image_base_t.md)的子类控件，image\_base\_t的函数均适用于gif\_image\_t控件。
 * 
 *  在xml中使用"gif"标签创建GIF图片控件。如：
 * 
 *  ```xml
 *  <gif image="bee"/>
 *  ```
 * 
 *更多用法请参考：
 *  [gif
 *  image](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/gif_image.xml)
 * 
 *  在c代码中使用函数gif\_image\_create创建GIF图片控件。如：
 * 
 *  ```c
 *   widget_t* image = gif_image_create(win, 10, 10, 200, 200);
 *   image_set_image(image, "bee");
 *  ```
 * 
 * 创建之后:
 *
 * 需要用widget\_set\_image设置图片名称。
 * 
 * 完整示例请参考：[gif image demo](
 *  https://github.com/zlgopen/awtk-c-demos/blob/master/demos/gif_image.c)
 * 
 *  可用通过style来设置控件的显示风格，如背景和边框等。如：
 * 
 *  ```xml
 *  <gif>
 *   <style name="border">
 *    <normal border_color="#000000" bg_color="#e0e0e0" text_color="black"/>
 *   </style>
 *  </gif>
 *  ```
 * 
 * 更多用法请参考：[theme default](
 *  https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/styles/default.xml)
 *
 */
public class GifImage extends ImageBase {
 public long nativeObj;

 public GifImage(long nativeObj) {
   super(nativeObj);
 }

 static public GifImage cast(long nativeObj) {
   return new GifImage(nativeObj);
 }


/**
 * 创建gif_image对象
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
   return new GifImage(gif_image_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换为gif_image对象(供脚本语言使用)。
 * 
 * @param widget gif_image对象。
 *
 * @returns gif_image对象。
 */
 public  static GifImage cast(Widget widget)  {
   return new GifImage(gif_image_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long gif_image_create(long parent, int x, int y, int w, int h);
static private native long gif_image_cast(long widget);
}

