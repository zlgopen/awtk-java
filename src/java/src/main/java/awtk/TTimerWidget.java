package awtk;


/**
 * 定时器。
 *> 主要目的是方便以拖拽的方式创建定时器，并用AWBlock编写简单的事件处理程序。
 *在xml中使用"timer"标签创建控件。如：
 *
 *```xml
 *<!-- ui -->
 *<timer x="c" y="50" w="100" h="100" duration="1000"/>
 *```
 *
 *可用通过style来设置控件的显示风格，如字体的大小和颜色等等。如：
 *> 本控件默认不可见，无需指定style。
 *
 *```xml
 *<!-- style -->
 *<timer>
 *<style name="default" font_size="32">
 *<normal text_color="black" />
 *</style>
 *</timer>
 *```
 *
 */
public class TTimerWidget extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TTimerWidget(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TTimerWidget cast(long nativeObj) {
   return new TTimerWidget(nativeObj);
 }


  /**
   * 创建timer_widget对象
   * 
   * @param parent 父控件
   * @param x x坐标
   * @param y y坐标
   * @param w 宽度
   * @param h 高度
   *
   * @return timer_widget对象。
   */
 public  static TWidget create(TWidget parent, int x, int y, int w, int h)  {
    return new TTimerWidget(timer_widget_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为timer_widget对象(供脚本语言使用)。
   * 
   * @param widget timer_widget对象。
   *
   * @return timer_widget对象。
   */
 public  static TTimerWidget cast(TWidget widget)  {
    return new TTimerWidget(timer_widget_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 设置 时长(ms)。
   * 
   * @param duration 时长(ms)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setDuration(int duration)  {
   return TRet.from(timer_widget_set_duration(this != null ? (this.nativeObj) : 0, duration));
 }


  /**
   * 时长(ms)。
   *
   */
 public int getDuration() {
   return timer_widget_t_get_prop_duration(this.nativeObj);
 }

static private native long timer_widget_create(long parent, int x, int y, int w, int h);
static private native long timer_widget_cast(long widget);
static private native int timer_widget_set_duration(long widget, int duration);
static private native int timer_widget_t_get_prop_duration(long nativeObj);
};