package awtk;


/**
 * 滚动条控件。
 *
 *> 目前只支持垂直滚动。
 *
 *scroll\_bar\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于scroll\_bar\_t控件。
 *
 *在xml中使用"scroll\_bar"或"scroll\_bar\_d"或"scroll\_bar\_m"标签创建滚动条控件。如：
 *
 *```xml
 *<list_view x="0"  y="30" w="100%" h="-80" item_height="60">
 *<scroll_view name="view" x="0"  y="0" w="100%" h="100%">
 *...
 *</scroll_view>
 *<scroll_bar_m name="bar" x="right" y="0" w="6" h="100%" value="0"/>
 *</list_view>
 *```
 *
 *> 更多用法请参考：[list\_view\_m.xml](
 *https://github.com/zlgopen/awtk/blob/master/design/default/ui/list_view_m.xml)
 *
 *在c代码中使用函数scroll\_bar\_create创建列表项控件。如：
 *
 *
 *
 *```xml
 *<style name="default">
 *<normal bg_color="#c0c0c0" fg_color="#808080"/>
 *<over bg_color="#c0c0c0" fg_color="#808080"/>
 *<pressed bg_color="#c0c0c0" fg_color="#808080"/>
 *</style>
 *```
 *
 *> 更多用法请参考：[theme default](
 *https://github.com/zlgopen/awtk/blob/master/design/default/styles/default.xml#L350)
 *
 */
public class TScrollBar extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TScrollBar(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TScrollBar cast(long nativeObj) {
   return new TScrollBar(nativeObj);
 }


  /**
   * 创建scroll_bar对象
   *
   *> 根据宏WITH_DESKTOP_STYLE决定创建desktop风格还是mobile风格的滚动条
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
    return new TScrollBar(scroll_bar_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为scroll_bar对象(供脚本语言使用)。
   * 
   * @param widget scroll_bar对象。
   *
   * @return scroll_bar对象。
   */
 public  static TScrollBar cast(TWidget widget)  {
    return new TScrollBar(scroll_bar_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 创建mobile风格的scroll_bar对象
   * 
   * @param parent 父控件
   * @param x x坐标
   * @param y y坐标
   * @param w 宽度
   * @param h 高度
   *
   * @return 对象。
   */
 public  static TWidget createMobile(TWidget parent, int x, int y, int w, int h)  {
    return new TScrollBar(scroll_bar_create_mobile(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 创建desktop风格的scroll_bar对象
   * 
   * @param parent 父控件
   * @param x x坐标
   * @param y y坐标
   * @param w 宽度
   * @param h 高度
   *
   * @return 对象。
   */
 public  static TWidget createDesktop(TWidget parent, int x, int y, int w, int h)  {
    return new TScrollBar(scroll_bar_create_desktop(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 设置参数。
   * 
   * @param virtual_size 虚拟高度。
   * @param row 每一行的高度。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setParams(int virtual_size, int row)  {
   return TRet.from(scroll_bar_set_params(this != null ? (this.nativeObj) : 0, virtual_size, row));
 }


  /**
   * 滚动到指定的值。
   * 
   * @param value 值。
   * @param duration 动画持续时间(毫秒)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet scrollTo(int value, int duration)  {
   return TRet.from(scroll_bar_scroll_to(this != null ? (this.nativeObj) : 0, value, duration));
 }


  /**
   * 设置值，并触发EVT_VALUE_CHANGED事件。
   * 
   * @param value 值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setValue(int value)  {
   return TRet.from(scroll_bar_set_value(this != null ? (this.nativeObj) : 0, value));
 }


  /**
   * 在当前的值上增加一个值，并触发EVT_VALUE_CHANGED事件。
   * 
   * @param delta 值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet addDelta(int delta)  {
   return TRet.from(scroll_bar_add_delta(this != null ? (this.nativeObj) : 0, delta));
 }


  /**
   * 设置值，但不触发EVT_VALUE_CHANGED事件。
   * 
   * @param value 值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setValueOnly(int value)  {
   return TRet.from(scroll_bar_set_value_only(this != null ? (this.nativeObj) : 0, value));
 }


  /**
   * 设置auto_hide属性。
   *
   *>仅对mobile风格的滚动条有效
   * 
   * @param auto_hide 值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setAutoHide(boolean auto_hide)  {
   return TRet.from(scroll_bar_set_auto_hide(this != null ? (this.nativeObj) : 0, auto_hide));
 }


  /**
   * 判断是否是mobile风格的滚动条。
   * 
   *
   * @return 返回TRUE表示是mobile风格的，否则表示不是mobile风格的。
   */
 public  boolean isMobile()  {
    return scroll_bar_is_mobile(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 设置翻页滚动动画时间(毫秒)。
   * 
   * @param animator_time 时间(毫秒)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setAnimatorTime(int animator_time)  {
   return TRet.from(scroll_bar_set_animator_time(this != null ? (this.nativeObj) : 0, animator_time));
 }


  /**
   * 通过动画隐藏滚动条。
   * 
   * @param duration 动画持续时间(毫秒)。
   * @param delay 动画执行时间(毫秒)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet hideByOpacityAnimation(int duration, int delay)  {
   return TRet.from(scroll_bar_hide_by_opacity_animation(this != null ? (this.nativeObj) : 0, duration, delay));
 }


  /**
   * 通过动画显示滚动条。
   * 
   * @param duration 动画持续时间(毫秒)。
   * @param delay 动画执行时间(毫秒)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet showByOpacityAnimation(int duration, int delay)  {
   return TRet.from(scroll_bar_show_by_opacity_animation(this != null ? (this.nativeObj) : 0, duration, delay));
 }


  /**
   * 设置鼠标滚轮是否滚动(仅对desktop风格的滚动条有效)。
   * 
   * @param scroll 是否设置该功能。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setWheelScroll(boolean scroll)  {
   return TRet.from(scroll_bar_set_wheel_scroll(this != null ? (this.nativeObj) : 0, scroll));
 }


  /**
   * 设置鼠标滚轮幅度(仅对desktop风格的滚动条有效)。
   * 
   * @param scroll_delta 滚动幅度。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setScrollDelta(int scroll_delta)  {
   return TRet.from(scroll_bar_set_scroll_delta(this != null ? (this.nativeObj) : 0, scroll_delta));
 }


  /**
   * 虚拟宽度或高度。
   *
   */
 public int getVirtualSize() {
   return scroll_bar_t_get_prop_virtual_size(this.nativeObj);
 }


  /**
   * 行的高度。
   *
   */
 public int getRow() {
   return scroll_bar_t_get_prop_row(this.nativeObj);
 }


  /**
   * 翻页滚动动画时间(毫秒)。
   *
   */
 public int getAnimatorTime() {
   return scroll_bar_t_get_prop_animator_time(this.nativeObj);
 }


  /**
   * 每次鼠标滚动值。（缺省值为0，0 则使用鼠标滚动默认值）
   *
   */
 public int getScrollDelta() {
   return scroll_bar_t_get_prop_scroll_delta(this.nativeObj);
 }


  /**
   * 滚动时是否启用动画。
   *
   */
 public boolean getAnimatable() {
   return scroll_bar_t_get_prop_animatable(this.nativeObj);
 }


  /**
   * 是否自动隐藏(仅对mobile风格的滚动条有效)。
   *
   */
 public boolean getAutoHide() {
   return scroll_bar_t_get_prop_auto_hide(this.nativeObj);
 }


  /**
   * 设置鼠标滚轮是否滚动(仅对desktop风格的滚动条有效)（垂直滚动条缺省值为TRUE，水平滚动条缺省值为FALSE）。
   *
   */
 public boolean getWheelScroll() {
   return scroll_bar_t_get_prop_wheel_scroll(this.nativeObj);
 }

static private native long scroll_bar_create(long parent, int x, int y, int w, int h);
static private native long scroll_bar_cast(long widget);
static private native long scroll_bar_create_mobile(long parent, int x, int y, int w, int h);
static private native long scroll_bar_create_desktop(long parent, int x, int y, int w, int h);
static private native int scroll_bar_set_params(long widget, int virtual_size, int row);
static private native int scroll_bar_scroll_to(long widget, int value, int duration);
static private native int scroll_bar_set_value(long widget, int value);
static private native int scroll_bar_add_delta(long widget, int delta);
static private native int scroll_bar_set_value_only(long widget, int value);
static private native int scroll_bar_set_auto_hide(long widget, boolean auto_hide);
static private native boolean scroll_bar_is_mobile(long widget);
static private native int scroll_bar_set_animator_time(long widget, int animator_time);
static private native int scroll_bar_hide_by_opacity_animation(long widget, int duration, int delay);
static private native int scroll_bar_show_by_opacity_animation(long widget, int duration, int delay);
static private native int scroll_bar_set_wheel_scroll(long widget, boolean scroll);
static private native int scroll_bar_set_scroll_delta(long widget, int scroll_delta);
static private native int scroll_bar_t_get_prop_virtual_size(long nativeObj);
static private native int scroll_bar_t_get_prop_value(long nativeObj);
static private native int scroll_bar_t_get_prop_row(long nativeObj);
static private native int scroll_bar_t_get_prop_animator_time(long nativeObj);
static private native int scroll_bar_t_get_prop_scroll_delta(long nativeObj);
static private native boolean scroll_bar_t_get_prop_animatable(long nativeObj);
static private native boolean scroll_bar_t_get_prop_auto_hide(long nativeObj);
static private native boolean scroll_bar_t_get_prop_wheel_scroll(long nativeObj);
};