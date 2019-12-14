package awtk;


/**
 * 数字时钟控件。 digit\_clock\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于digit\_clock\_t控件。 在xml中使用"digit\_clock"标签创建数字时钟控件。如： ```xml <digit_clock format="YY/MM/DD h:mm:ss"/> ``` 更多用法请参考：[digit\_clock.xml]( https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/digit_clock.xml) 在c代码中使用函数digit\_clock\_create创建数字时钟控件。如： ```c widget_t* tc = digit_clock_create(win, 10, 10, 240, 30); digit_clock_set_format(tc, "YY/MM/DD h:mm:ss"); ``` 完整示例请参考：[digit\_clock demo]( https://github.com/zlgopen/awtk-c-demos/blob/master/demos/digit_clock.c) 可用通过style来设置控件的显示风格，如字体的大小和颜色等等。如： ```xml <style name="default">   <normal text_color="black" /> </style> ``` 更多用法请参考：[theme default]( https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/styles/default.xml#L138)
 *
 */
public class DigitClock extends Widget {
 public long nativeObj;

 public DigitClock(long nativeObj) {
   super(nativeObj);
 }

 static public DigitClock cast(long nativeObj) {
   return new DigitClock(nativeObj);
 }


/**
 * 创建digit_clock对象
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
   return new DigitClock(digit_clock_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换为digit_clock对象(供脚本语言使用)。
 * 
 * @param widget digit_clock对象。
 *
 * @returns digit_clock对象。
 */
 public  static DigitClock cast(Widget widget)  {
   return new DigitClock(digit_clock_cast(widget != null ? (widget.nativeObj) : 0));
 }


/**
 * 设置显示格式。
 * 
 * @param widget 控件对象。
 * @param format 格式。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setFormat(String format)  {
   return Ret.from(digit_clock_set_format(this != null ? (this.nativeObj) : 0, format));
 }

 public String getFormat() {
   return digit_clock_t_get_prop_format(this.nativeObj);
 }

static private native long digit_clock_create(long parent, int x, int y, int w, int h);
static private native long digit_clock_cast(long widget);
static private native int digit_clock_set_format(long widget, String format);
static private native String digit_clock_t_get_prop_format(long nativeObj);
}

