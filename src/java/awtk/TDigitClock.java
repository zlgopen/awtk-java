package awtk;


/**
 * 数字时钟控件。
 *
 *digit\_clock\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于digit\_clock\_t控件。
 *
 *在xml中使用"digit\_clock"标签创建数字时钟控件。如：
 *
 *```xml
 *<digit_clock format="YY/MM/DD h:mm:ss"/>
 *```
 *
 *> 更多用法请参考：[digit\_clock.xml](
 *https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/digit_clock.xml)
 *
 *在c代码中使用函数digit\_clock\_create创建数字时钟控件。如：
 *
 *
 *> 完整示例请参考：[digit\_clock demo](
 *https://github.com/zlgopen/awtk-c-demos/blob/master/demos/digit_clock.c)
 *
 *可用通过style来设置控件的显示风格，如字体的大小和颜色等等。如：
 *
 *```xml
 *<style name="default">
 *<normal text_color="black" />
 *</style>
 *```
 *
 *> 更多用法请参考：[theme default](
 *https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/styles/default.xml#L138)
 *
 */
public class TDigitClock extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TDigitClock(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TDigitClock cast(long nativeObj) {
   return new TDigitClock(nativeObj);
 }


/**
 * 创建digit_clock对象
 * 
 * @param parent 父控件
 * @param x x坐标
 * @param y y坐标
 * @param w 宽度
 * @param h 高度
 
 * @return 对象。
 */
 public  static TWidget create(TWidget parent, int x, int y, int w, int h)  {
    return new TDigitClock(digit_clock_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换为digit_clock对象(供脚本语言使用)。
 * 
 * @param widget digit_clock对象。
 
 * @return digit_clock对象。
 */
 public  static TDigitClock cast(TWidget widget)  {
    return new TDigitClock(digit_clock_cast(widget != null ? (widget.nativeObj) : 0));
 }


/**
 * 设置显示格式。
 * 
 * @param format 格式。
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet setFormat(String format)  {
   return TRet.from(digit_clock_set_format(this != null ? (this.nativeObj) : 0, format));
 }


/**
 * 显示格式。
 *
 ** Y 代表年(完整显示)
 ** M 代表月(1-12)
 ** D 代表日(1-31)
 ** h 代表时(0-23)
 ** m 代表分(0-59)
 ** s 代表秒(0-59)
 ** w 代表星期(0-6)
 ** W 代表星期的英文缩写(支持翻译)
 ** YY 代表年(只显示末两位)
 ** MM 代表月(01-12)
 ** DD 代表日(01-31)
 ** hh 代表时(00-23)
 ** mm 代表分(00-59)
 ** ss 代表秒(00-59)
 ** MMM 代表月的英文缩写(支持翻译)
 *
 *如 日期时间为：2018/11/12 9:10:20
 ** "Y/D/M"显示为"2018/11/12"
 ** "Y-D-M"显示为"2018-11-12"
 ** "Y-D-M h:m:s"显示为"2018-11-12 9:10:20"
 ** "Y-D-M hh:mm:ss"显示为"2018-11-12 09:10:20"
 *
 */
 public String getFormat() {
   return digit_clock_t_get_prop_format(this.nativeObj);
 }

static private native long digit_clock_create(long parent, int x, int y, int w, int h);
static private native long digit_clock_cast(long widget);
static private native int digit_clock_set_format(long widget, String format);
static private native String digit_clock_t_get_prop_format(long nativeObj);
};