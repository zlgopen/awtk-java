package awtk;


/**
 * 图片值控件。
 * 
 *  可以用图片来表示如电池电量、WIFI信号强度和其它各种数值的值。
 * 
 *  其原理如下：
 * 
 *   * 1.把value以format为格式转换成字符串。
 *   * 2.把每个字符与image(图片文件名前缀)映射成一个图片名。
 *   * 3.最后把这些图片显示出来。
 * 
 * image\_value\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于image\_value\_t控件。
 * 
 * 在xml中使用"image\_value"标签创建图片值控件。如：
 * 
 *  ```xml
 *  <image_value  value="0" image="num_" />
 *  ```
 * 
 * 更多用法请参考：
 *  [image\_value](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/image_value.xml)
 * 
 *  在c代码中使用函数image\_value\_create创建图片值控件。如：
 * 
 *  ```c
 *  image_value = image_value_create(win, 10, 10, 200, 200);
 *  image_value_set_image(image_value, "num_");
 *  image_value_set_value(image_value, 100);
 *  ```
 * 
 * 完整示例请参考：
 *  [image_value demo](https://github.com/zlgopen/awtk-c-demos/blob/master/demos/image_value.c)
 * 
 *  可用通过style来设置控件的显示风格，如背景颜色和边框等等，不过一般情况并不需要。
 *
 */
public class ImageValue extends Widget {
 public long nativeObj;

 public ImageValue(long nativeObj) {
   super(nativeObj);
 }

 static public ImageValue cast(long nativeObj) {
   return new ImageValue(nativeObj);
 }


/**
 * 创建image_value对象
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
   return new ImageValue(image_value_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 设置图片前缀。
 * 
 * @param widget image_value对象。
 * @param image 图片前缀。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setImage(String image)  {
   return Ret.from(image_value_set_image(this != null ? (this.nativeObj) : 0, image));
 }


/**
 * 设置格式。
 * 
 * @param widget image_value对象。
 * @param format 格式。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setFormat(String format)  {
   return Ret.from(image_value_set_format(this != null ? (this.nativeObj) : 0, format));
 }


/**
 * 设置值。
 * 
 * @param widget image_value对象。
 * @param value 值。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setValue(double value)  {
   return Ret.from(image_value_set_value(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 转换为image_value对象(供脚本语言使用)。
 * 
 * @param widget image_value对象。
 *
 * @returns image_value对象。
 */
 public  static ImageValue cast(Widget widget)  {
   return new ImageValue(image_value_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public String getImage() {
   return image_value_t_get_prop_image(this.nativeObj);
 }

 public String getFormat() {
   return image_value_t_get_prop_format(this.nativeObj);
 }

static private native long image_value_create(long parent, int x, int y, int w, int h);
static private native int image_value_set_image(long widget, String image);
static private native int image_value_set_format(long widget, String format);
static private native int image_value_set_value(long widget, double value);
static private native long image_value_cast(long widget);
static private native String image_value_t_get_prop_image(long nativeObj);
static private native String image_value_t_get_prop_format(long nativeObj);
static private native double image_value_t_get_prop_value(long nativeObj);
}

