package awtk;


/**
 * 进度圆环控件。
 *
 *progress\_circle\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于progress\_circle\_t控件。
 *
 *在xml中使用"progress\_circle"标签创建进度圆环控件。如：
 *
 *```xml
 *<progress_circle max="360" show_text="true" start_angle="90" />
 *```
 *
 *> 更多用法请参考：
 *[progress_circle.xml](https://github.com/zlgopen/awtk/blob/master/design/default/ui/progress_circle.xml)
 *
 *在c代码中使用函数progress\_circle\_create创建进度圆环控件。如：
 *
 *
 *> 完整示例请参考：
 *[progress_circle
 *demo](https://github.com/zlgopen/awtk-c-demos/blob/master/demos/progress_circle.c)
 *
 *可用通过style来设置控件的显示风格，如字体的大小和颜色等等。如：
 *
 *```xml
 *<style name="default">
 *<normal text_color="green" fg_color="black" />
 *</style>
 *```
 *
 *> 更多用法请参考：
 *[theme
 *default](https://github.com/zlgopen/awtk/blob/master/design/default/styles/default.xml#L467)
 *
 */
public class TProgressCircle extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TProgressCircle(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TProgressCircle cast(long nativeObj) {
   return new TProgressCircle(nativeObj);
 }


  /**
   * 创建progress_circle对象
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
    return new TProgressCircle(progress_circle_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为progress_circle对象(供脚本语言使用)。
   * 
   * @param widget progress_circle对象。
   *
   * @return progress_circle对象。
   */
 public  static TProgressCircle cast(TWidget widget)  {
    return new TProgressCircle(progress_circle_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 设置值。
   * 
   * @param value 值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setValue(double value)  {
   return TRet.from(progress_circle_set_value(this != null ? (this.nativeObj) : 0, value));
 }


  /**
   * 设置最大值。
   * 
   * @param max 最大值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setMax(int max)  {
   return TRet.from(progress_circle_set_max(this != null ? (this.nativeObj) : 0, max));
 }


  /**
   * 设置环线的厚度。
   * 
   * @param line_width 环线的厚度。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setLineWidth(int line_width)  {
   return TRet.from(progress_circle_set_line_width(this != null ? (this.nativeObj) : 0, line_width));
 }


  /**
   * 设置起始角度。
   * 
   * @param start_angle 起始角度。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setStartAngle(int start_angle)  {
   return TRet.from(progress_circle_set_start_angle(this != null ? (this.nativeObj) : 0, start_angle));
 }


  /**
   * 设置单位。
   * 
   * @param unit 单位。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setUnit(String unit)  {
   return TRet.from(progress_circle_set_unit(this != null ? (this.nativeObj) : 0, unit));
 }


  /**
   * 设置线帽类型。
   * 
   * @param line_cap 线帽类型(round:圆头，square:方头)。。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setLineCap(String line_cap)  {
   return TRet.from(progress_circle_set_line_cap(this != null ? (this.nativeObj) : 0, line_cap));
 }


  /**
   * 设置是否显示文本。
   * 
   * @param show_text 是否显示文本。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setShowText(boolean show_text)  {
   return TRet.from(progress_circle_set_show_text(this != null ? (this.nativeObj) : 0, show_text));
 }


  /**
   * 设置是否为逆时针方向。
   * 
   * @param counter_clock_wise 是否为逆时针方向。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setCounterClockWise(boolean counter_clock_wise)  {
   return TRet.from(progress_circle_set_counter_clock_wise(this != null ? (this.nativeObj) : 0, counter_clock_wise));
 }


  /**
   * 最大值(缺省为100)。
   *
   */
 public int getMax() {
   return progress_circle_t_get_prop_max(this.nativeObj);
 }


  /**
   * 起始角度(单位为度，缺省-90)。
   *
   */
 public int getStartAngle() {
   return progress_circle_t_get_prop_start_angle(this.nativeObj);
 }


  /**
   * 环线的厚度(缺省为8)。
   *
   */
 public int getLineWidth() {
   return progress_circle_t_get_prop_line_width(this.nativeObj);
 }


  /**
   * 单元(缺省无)。
   *
   */
 public String getUnit() {
   return progress_circle_t_get_prop_unit(this.nativeObj);
 }


  /**
   * 线帽类型(round:圆头，square:方头)。
   *
   */
 public String getLineCap() {
   return progress_circle_t_get_prop_line_cap(this.nativeObj);
 }


  /**
   * 是否为逆时针方向(缺省为FALSE)。
   *
   */
 public boolean getCounterClockWise() {
   return progress_circle_t_get_prop_counter_clock_wise(this.nativeObj);
 }


  /**
   * 是否显示文本(缺省为TRUE)。
   *
   */
 public boolean getShowText() {
   return progress_circle_t_get_prop_show_text(this.nativeObj);
 }

static private native long progress_circle_create(long parent, int x, int y, int w, int h);
static private native long progress_circle_cast(long widget);
static private native int progress_circle_set_value(long widget, double value);
static private native int progress_circle_set_max(long widget, int max);
static private native int progress_circle_set_line_width(long widget, int line_width);
static private native int progress_circle_set_start_angle(long widget, int start_angle);
static private native int progress_circle_set_unit(long widget, String unit);
static private native int progress_circle_set_line_cap(long widget, String line_cap);
static private native int progress_circle_set_show_text(long widget, boolean show_text);
static private native int progress_circle_set_counter_clock_wise(long widget, boolean counter_clock_wise);
static private native double progress_circle_t_get_prop_value(long nativeObj);
static private native int progress_circle_t_get_prop_max(long nativeObj);
static private native int progress_circle_t_get_prop_start_angle(long nativeObj);
static private native int progress_circle_t_get_prop_line_width(long nativeObj);
static private native String progress_circle_t_get_prop_unit(long nativeObj);
static private native String progress_circle_t_get_prop_line_cap(long nativeObj);
static private native boolean progress_circle_t_get_prop_counter_clock_wise(long nativeObj);
static private native boolean progress_circle_t_get_prop_show_text(long nativeObj);
};