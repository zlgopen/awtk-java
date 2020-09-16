package awtk;


/**
 * 按钮控件。
 *
 *点击按钮之后会触发EVT\_CLICK事件，注册EVT\_CLICK事件以执行特定操作。
 *
 *按钮控件也可以作为容器使用，使用图片和文本作为其子控件，可以实现很多有趣的效果。
 *
 *button\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于button\_t控件。
 *
 *在xml中使用"button"标签创建按钮控件。如：
 *
 *```xml
 *<button x="c" y="m" w="80" h="30" text="OK"/>
 *```
 *
 *> 更多用法请参考：
 *[button.xml](https://github.com/zlgopen/awtk/blob/master/design/default/ui/button.xml)
 *
 *在c代码中使用函数button\_create创建按钮控件。如：
 *
 *
 *> 创建之后，需要用widget\_set\_text或widget\_set\_text\_utf8设置文本内容。
 *
 *> 完整示例请参考：
 *[button demo](https://github.com/zlgopen/awtk-c-demos/blob/master/demos/button.c)
 *
 *可用通过style来设置控件的显示风格，如字体的大小和颜色等等。如：
 *
 *```xml
 *<style name="default" border_color="#a0a0a0"  text_color="black">
 *<normal     bg_color="#f0f0f0" />
 *<pressed    bg_color="#c0c0c0" x_offset="1" y_offset="1"/>
 *<over       bg_color="#e0e0e0" />
 *<disable    bg_color="gray" text_color="#d0d0d0" />
 *</style>
 *```
 *
 *> 更多用法请参考：
 *[theme
 *default](https://github.com/zlgopen/awtk/blob/master/design/default/styles/default.xml#L31)
 *
 */
public class TButton extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TButton(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TButton cast(long nativeObj) {
   return new TButton(nativeObj);
 }


  /**
   * 创建button对象
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
    return new TButton(button_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为button对象(供脚本语言使用)。
   * 
   * @param widget button对象。
   *
   * @return button对象。
   */
 public  static TButton cast(TWidget widget)  {
    return new TButton(button_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 设置触发EVT\_CLICK事件的时间间隔。为0则不重复触发EVT\_CLICK事件。
   * 
   * @param repeat 触发EVT_CLICK事件的时间间隔(毫秒)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setRepeat(int repeat)  {
   return TRet.from(button_set_repeat(this != null ? (this.nativeObj) : 0, repeat));
 }


  /**
   * 设置触发长按事件的时间。
   * 
   * @param long_press_time 触发长按事件的时间(毫秒)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setLongPressTime(int long_press_time)  {
   return TRet.from(button_set_long_press_time(this != null ? (this.nativeObj) : 0, long_press_time));
 }


  /**
   * 设置是否启用长按事件。
   * 
   * @param enable_long_press 是否启用长按事件。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setEnableLongPress(boolean enable_long_press)  {
   return TRet.from(button_set_enable_long_press(this != null ? (this.nativeObj) : 0, enable_long_press));
 }


  /**
   * 重复触发EVT\_CLICK事件的时间间隔。
   *
   *为0则不重复触发EVT\_CLICK事件。
   *
   */
 public int getRepeat() {
   return button_t_get_prop_repeat(this.nativeObj);
 }


  /**
   * 是否启用长按事件，为true时才触发长按事件。
   *
   *触发长按事件后不再触发点击事件。
   *缺省不启用。
   *
   */
 public boolean getEnableLongPress() {
   return button_t_get_prop_enable_long_press(this.nativeObj);
 }


  /**
   * 触发长按事件的时间(ms)
   *
   */
 public int getLongPressTime() {
   return button_t_get_prop_long_press_time(this.nativeObj);
 }

static private native long button_create(long parent, int x, int y, int w, int h);
static private native long button_cast(long widget);
static private native int button_set_repeat(long widget, int repeat);
static private native int button_set_long_press_time(long widget, int long_press_time);
static private native int button_set_enable_long_press(long widget, boolean enable_long_press);
static private native int button_t_get_prop_repeat(long nativeObj);
static private native boolean button_t_get_prop_enable_long_press(long nativeObj);
static private native int button_t_get_prop_long_press_time(long nativeObj);
};