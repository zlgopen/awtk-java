package awtk;


/**
 * 图片值控件。
 *
 *可以用图片来表示如电池电量、WIFI信号强度和其它各种数值的值。
 *
 *其原理如下：
 *
 ** 1.把value以format为格式转换成字符串。
 ** 2.把每个字符与image(图片文件名前缀)映射成一个图片名。
 ** 3.最后把这些图片显示出来。
 *
 *如果设置click\_add\_delta为非0，那么点击时自动增加指定的增量，值超过最大值时回到最小值,
 *或者值超过最小值时回到最大值。
 *
 *image\_value\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于image\_value\_t控件。
 *
 *在xml中使用"image\_value"标签创建图片值控件。如：
 *
 *```xml
 *<image_value  value="0" image="num_" />
 *```
 *
 *> 更多用法请参考：
 *[image\_value](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/image_value.xml)
 *
 *在c代码中使用函数image\_value\_create创建图片值控件。如：
 *
 *
 *> 完整示例请参考：
 *[image_value demo](https://github.com/zlgopen/awtk-c-demos/blob/master/demos/image_value.c)
 *
 *可用通过style来设置控件的显示风格，如背景颜色和边框等等，不过一般情况并不需要。
 *
 */
public class TImageValue extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TImageValue(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TImageValue cast(long nativeObj) {
   return new TImageValue(nativeObj);
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
   * @return 对象。
   */
 public  static TWidget create(TWidget parent, int x, int y, int w, int h)  {
    return new TImageValue(image_value_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 设置图片前缀。
   * 
   * @param image 图片前缀。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setImage(String image)  {
   return TRet.from(image_value_set_image(this != null ? (this.nativeObj) : 0, image));
 }


  /**
   * 设置格式。
   * 
   * @param format 格式。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setFormat(String format)  {
   return TRet.from(image_value_set_format(this != null ? (this.nativeObj) : 0, format));
 }


  /**
   * 设置点击时加上的增量。
   * 
   * @param delta 增量。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setClickAddDelta(double delta)  {
   return TRet.from(image_value_set_click_add_delta(this != null ? (this.nativeObj) : 0, delta));
 }


  /**
   * 设置值。
   * 
   * @param value 值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setValue(double value)  {
   return TRet.from(image_value_set_value(this != null ? (this.nativeObj) : 0, value));
 }


  /**
   * 设置最小值。
   * 
   * @param min 最小值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setMin(double min)  {
   return TRet.from(image_value_set_min(this != null ? (this.nativeObj) : 0, min));
 }


  /**
   * 设置最大值。
   * 
   * @param max 最大值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setMax(double max)  {
   return TRet.from(image_value_set_max(this != null ? (this.nativeObj) : 0, max));
 }


  /**
   * 转换为image_value对象(供脚本语言使用)。
   * 
   * @param widget image_value对象。
   *
   * @return image_value对象。
   */
 public  static TImageValue cast(TWidget widget)  {
    return new TImageValue(image_value_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 图片名称的前缀。
   *
   */
 public String getImage() {
   return image_value_t_get_prop_image(this.nativeObj);
 }


  /**
   * 数值到字符串转换时的格式，缺省为"%d"。
   *
   */
 public String getFormat() {
   return image_value_t_get_prop_format(this.nativeObj);
 }


  /**
   * 点击时加上一个增量。
   *
   */
 public double getClickAddDelta() {
   return image_value_t_get_prop_click_add_delta(this.nativeObj);
 }


  /**
   * 最小值(如果设置了click\_add\_delta，到达最小值后回到最大值)。
   *
   */
 public double getMin() {
   return image_value_t_get_prop_min(this.nativeObj);
 }


  /**
   * 最大值(如果设置了click\_add\_delta，到达最大值后回到最小值)。
   *
   */
 public double getMax() {
   return image_value_t_get_prop_max(this.nativeObj);
 }

static private native long image_value_create(long parent, int x, int y, int w, int h);
static private native int image_value_set_image(long widget, String image);
static private native int image_value_set_format(long widget, String format);
static private native int image_value_set_click_add_delta(long widget, double delta);
static private native int image_value_set_value(long widget, double value);
static private native int image_value_set_min(long widget, double min);
static private native int image_value_set_max(long widget, double max);
static private native long image_value_cast(long widget);
static private native String image_value_t_get_prop_image(long nativeObj);
static private native String image_value_t_get_prop_format(long nativeObj);
static private native double image_value_t_get_prop_click_add_delta(long nativeObj);
static private native double image_value_t_get_prop_value(long nativeObj);
static private native double image_value_t_get_prop_min(long nativeObj);
static private native double image_value_t_get_prop_max(long nativeObj);
};