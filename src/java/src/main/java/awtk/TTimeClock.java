package awtk;


/**
 * 模拟时钟控件。
 *
 *time\_clock\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于time\_clock\_t控件。
 *
 *在xml中使用"time\_clock"标签创建模拟时钟控件。如：
 *
 *```xml
 *<time_clock x="c" y="m" w="300" h="300" bg_image="clock_bg" image="clock"
 *hour_image="clock_hour" minute_image="clock_minute" second_image="clock_second"/>
 *```
 *
 *> 更多用法请参考：[time\_clock.xml](
 *https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/time_clock.xml)
 *
 *在c代码中使用函数time\_clock\_create创建模拟时钟控件。如：
 *
 *
 *> 完整示例请参考：[time_clock demo](
 *https://github.com/zlgopen/awtk-c-demos/blob/master/demos/time_clock.c)
 *
 *time\_clock一般不需要设置style。
 *
 */
public class TTimeClock extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TTimeClock(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TTimeClock cast(long nativeObj) {
   return new TTimeClock(nativeObj);
 }


  /**
   * 创建time_clock对象
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
    return new TTimeClock(time_clock_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为time_clock对象(供脚本语言使用)。
   * 
   * @param widget time_clock对象。
   *
   * @return time_clock对象。
   */
 public  static TTimeClock cast(TWidget widget)  {
    return new TTimeClock(time_clock_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 设置小时的值。
   * 
   * @param hour 小时的值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setHour(int hour)  {
   return TRet.from(time_clock_set_hour(this != null ? (this.nativeObj) : 0, hour));
 }


  /**
   * 设置分钟的值。
   * 
   * @param minute 分钟的值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setMinute(int minute)  {
   return TRet.from(time_clock_set_minute(this != null ? (this.nativeObj) : 0, minute));
 }


  /**
   * 设置秒的值。
   * 
   * @param second 秒的值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setSecond(int second)  {
   return TRet.from(time_clock_set_second(this != null ? (this.nativeObj) : 0, second));
 }


  /**
   * 设置小时的图片。
   * 
   * @param hour 小时的图片。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setHourImage(String hour)  {
   return TRet.from(time_clock_set_hour_image(this != null ? (this.nativeObj) : 0, hour));
 }


  /**
   * 设置分钟的图片。
   * 
   * @param minute_image 分钟的图片。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setMinuteImage(String minute_image)  {
   return TRet.from(time_clock_set_minute_image(this != null ? (this.nativeObj) : 0, minute_image));
 }


  /**
   * 设置秒的图片。
   * 
   * @param second_image 秒的图片。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setSecondImage(String second_image)  {
   return TRet.from(time_clock_set_second_image(this != null ? (this.nativeObj) : 0, second_image));
 }


  /**
   * 设置背景图片。
   * 
   * @param bg_image 背景图片。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setBgImage(String bg_image)  {
   return TRet.from(time_clock_set_bg_image(this != null ? (this.nativeObj) : 0, bg_image));
 }


  /**
   * 设置中心图片。
   * 
   * @param image 图片。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setImage(String image)  {
   return TRet.from(time_clock_set_image(this != null ? (this.nativeObj) : 0, image));
 }


  /**
   * 设置小时指针的旋转锚点。
   *> 后面加上px为像素点，不加px为相对百分比坐标0.0f到1.0f
   * 
   * @param anchor_x 指针的锚点坐标x。
   * @param anchor_y 指针的锚点坐标y。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setHourAnchor(String anchor_x, String anchor_y)  {
   return TRet.from(time_clock_set_hour_anchor(this != null ? (this.nativeObj) : 0, anchor_x, anchor_y));
 }


  /**
   * 设置分钟指针的旋转锚点。
   *> 后面加上px为像素点，不加px为相对百分比坐标0.0f到1.0f
   * 
   * @param anchor_x 指针的锚点坐标x。
   * @param anchor_y 指针的锚点坐标y。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setMinuteAnchor(String anchor_x, String anchor_y)  {
   return TRet.from(time_clock_set_minute_anchor(this != null ? (this.nativeObj) : 0, anchor_x, anchor_y));
 }


  /**
   * 设置秒钟指针的旋转锚点。
   *> 后面加上px为像素点，不加px为相对百分比坐标0.0f到1.0f
   * 
   * @param anchor_x 指针的锚点坐标x。
   * @param anchor_y 指针的锚点坐标y。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setSecondAnchor(String anchor_x, String anchor_y)  {
   return TRet.from(time_clock_set_second_anchor(this != null ? (this.nativeObj) : 0, anchor_x, anchor_y));
 }


  /**
   * 小时。
   *
   */
 public int getHour() {
   return time_clock_t_get_prop_hour(this.nativeObj);
 }


  /**
   * 分钟。
   *
   */
 public int getMinute() {
   return time_clock_t_get_prop_minute(this.nativeObj);
 }


  /**
   * 秒。
   *
   */
 public int getSecond() {
   return time_clock_t_get_prop_second(this.nativeObj);
 }


  /**
   * 中心图片。
   *
   */
 public String getImage() {
   return time_clock_t_get_prop_image(this.nativeObj);
 }


  /**
   * 背景图片。
   *
   */
 public String getBgImage() {
   return time_clock_t_get_prop_bg_image(this.nativeObj);
 }


  /**
   * 时针图片。
   *
   */
 public String getHourImage() {
   return time_clock_t_get_prop_hour_image(this.nativeObj);
 }


  /**
   * 分针图片。
   *
   */
 public String getMinuteImage() {
   return time_clock_t_get_prop_minute_image(this.nativeObj);
 }


  /**
   * 秒针图片。
   *
   */
 public String getSecondImage() {
   return time_clock_t_get_prop_second_image(this.nativeObj);
 }


  /**
   * 时针图片旋转锚点x坐标。(后面加上px为像素点，不加px为相对百分比坐标0.0f到1.0f)
   *
   */
 public String getHourAnchorX() {
   return time_clock_t_get_prop_hour_anchor_x(this.nativeObj);
 }


  /**
   * 时针图片旋转锚点y坐标。(后面加上px为像素点，不加px为相对百分比坐标0.0f到1.0f)
   *
   */
 public String getHourAnchorY() {
   return time_clock_t_get_prop_hour_anchor_y(this.nativeObj);
 }


  /**
   * 分针图片旋转锚点x坐标。(后面加上px为像素点，不加px为相对百分比坐标0.0f到1.0f)
   *
   */
 public String getMinuteAnchorX() {
   return time_clock_t_get_prop_minute_anchor_x(this.nativeObj);
 }


  /**
   * 分针图片旋转锚点y坐标。(后面加上px为像素点，不加px为相对百分比坐标0.0f到1.0f)
   *
   */
 public String getMinuteAnchorY() {
   return time_clock_t_get_prop_minute_anchor_y(this.nativeObj);
 }


  /**
   * 秒针图片旋转锚点x坐标。(后面加上px为像素点，不加px为相对百分比坐标0.0f到1.0f)
   *
   */
 public String getSecondAnchorX() {
   return time_clock_t_get_prop_second_anchor_x(this.nativeObj);
 }


  /**
   * 秒针图片旋转锚点y坐标。(后面加上px为像素点，不加px为相对百分比坐标0.0f到1.0f)
   *
   */
 public String getSecondAnchorY() {
   return time_clock_t_get_prop_second_anchor_y(this.nativeObj);
 }

static private native long time_clock_create(long parent, int x, int y, int w, int h);
static private native long time_clock_cast(long widget);
static private native int time_clock_set_hour(long widget, int hour);
static private native int time_clock_set_minute(long widget, int minute);
static private native int time_clock_set_second(long widget, int second);
static private native int time_clock_set_hour_image(long widget, String hour);
static private native int time_clock_set_minute_image(long widget, String minute_image);
static private native int time_clock_set_second_image(long widget, String second_image);
static private native int time_clock_set_bg_image(long widget, String bg_image);
static private native int time_clock_set_image(long widget, String image);
static private native int time_clock_set_hour_anchor(long widget, String anchor_x, String anchor_y);
static private native int time_clock_set_minute_anchor(long widget, String anchor_x, String anchor_y);
static private native int time_clock_set_second_anchor(long widget, String anchor_x, String anchor_y);
static private native int time_clock_t_get_prop_hour(long nativeObj);
static private native int time_clock_t_get_prop_minute(long nativeObj);
static private native int time_clock_t_get_prop_second(long nativeObj);
static private native String time_clock_t_get_prop_image(long nativeObj);
static private native String time_clock_t_get_prop_bg_image(long nativeObj);
static private native String time_clock_t_get_prop_hour_image(long nativeObj);
static private native String time_clock_t_get_prop_minute_image(long nativeObj);
static private native String time_clock_t_get_prop_second_image(long nativeObj);
static private native String time_clock_t_get_prop_hour_anchor_x(long nativeObj);
static private native String time_clock_t_get_prop_hour_anchor_y(long nativeObj);
static private native String time_clock_t_get_prop_minute_anchor_x(long nativeObj);
static private native String time_clock_t_get_prop_minute_anchor_y(long nativeObj);
static private native String time_clock_t_get_prop_second_anchor_x(long nativeObj);
static private native String time_clock_t_get_prop_second_anchor_y(long nativeObj);
};