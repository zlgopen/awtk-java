package awtk;


/**
 * slide_view的指示器控件。
 *
 *> 支持直线、弧线排布，默认有4种绘制样式，若设置了icon/active_icon，则优先使用icon/active_icon
 *
 *slide\_indicator\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于slide\_indicator\_t控件。
 *
 *在xml中使用"slide\_indicator"或"slide\_indicator\_arc"标签创建指示器控件。如：
 *
 *```xml
 *<slide_view name="view" x="0"  y="0" w="100%" h="100%">
 *...
 *</slide_view>
 *<slide_indicator name="indicator" x="right" y="0" w="6" h="100%"/>
 *```
 *
 *> 更多用法请参考：[slide\_view.xml](
 *https://github.com/zlgopen/awtk/blob/master/design/default/ui/slide_view.xml)
 *
 *在c代码中使用函数slide\_indicator\_create创建指示器控件。如：
 *
 *
 *```xml
 *<style name="default">
 *<normal fg_color="#FFFFFF80" selected_fg_color="#FFFFFF"/>
 *</style>
 *```
 *
 *> 更多用法请参考：[theme default](
 *https://github.com/zlgopen/awtk/blob/master/design/default/styles/default.xml#L350)
 *
 */
public class TSlideIndicator extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TSlideIndicator(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TSlideIndicator cast(long nativeObj) {
   return new TSlideIndicator(nativeObj);
 }


  /**
   * 创建slide_indicator对象
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
    return new TSlideIndicator(slide_indicator_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 创建slide_indicator对象（线性显示）
   * 
   * @param parent 父控件
   * @param x x坐标
   * @param y y坐标
   * @param w 宽度
   * @param h 高度
   *
   * @return 对象。
   */
 public  static TWidget createLinear(TWidget parent, int x, int y, int w, int h)  {
    return new TSlideIndicator(slide_indicator_create_linear(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 创建slide_indicator对象（圆弧显示）
   * 
   * @param parent 父控件
   * @param x x坐标
   * @param y y坐标
   * @param w 宽度
   * @param h 高度
   *
   * @return 对象。
   */
 public  static TWidget createArc(TWidget parent, int x, int y, int w, int h)  {
    return new TSlideIndicator(slide_indicator_create_arc(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为slide_indicator对象(供脚本语言使用)。
   * 
   * @param widget slide_indicator对象。
   *
   * @return slide_indicator对象。
   */
 public  static TSlideIndicator cast(TWidget widget)  {
    return new TSlideIndicator(slide_indicator_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 设置当前页的序号。
   * 
   * @param value 当前项的序号。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setValue(int value)  {
   return TRet.from(slide_indicator_set_value(this != null ? (this.nativeObj) : 0, value));
 }


  /**
   * 设置指示器的数量。
   * 
   * @param max 数量。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setMax(int max)  {
   return TRet.from(slide_indicator_set_max(this != null ? (this.nativeObj) : 0, max));
 }


  /**
   * 设置指示器的默认绘制类型。
   * 
   * @param default_paint 默认绘制类型。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setDefaultPaint(TIndicatorDefaultPaint default_paint)  {
   return TRet.from(slide_indicator_set_default_paint(this != null ? (this.nativeObj) : 0, default_paint.value()));
 }


  /**
   * 设置指示器是否自动隐藏。
   * 
   * @param auto_hide 0表示禁止，非0表示无操作后延迟多久隐藏。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setAutoHide(int auto_hide)  {
   return TRet.from(slide_indicator_set_auto_hide(this != null ? (this.nativeObj) : 0, auto_hide));
 }


  /**
   * 设置指示器的边距(默认为10像素)。
   * 
   * @param margin 指示器的边距。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setMargin(int margin)  {
   return TRet.from(slide_indicator_set_margin(this != null ? (this.nativeObj) : 0, margin));
 }


  /**
   * 设置指示器的间距(指示器有弧度时为角度值，否则为直线间距)。
   * 
   * @param spacing 指示器的间距。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setSpacing(double spacing)  {
   return TRet.from(slide_indicator_set_spacing(this != null ? (this.nativeObj) : 0, spacing));
 }


  /**
   * 设置指示器的大小(默认为8)。
   * 
   * @param size 指示器的大小。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setSize(int size)  {
   return TRet.from(slide_indicator_set_size(this != null ? (this.nativeObj) : 0, size));
 }


  /**
   * 设置旋转锚点。
   * 
   * @param anchor_x 锚点坐标x。(后面加上px为像素点，不加px为相对百分比坐标)
   * @param anchor_y 锚点坐标y。(后面加上px为像素点，不加px为相对百分比坐标)
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setAnchor(String anchor_x, String anchor_y)  {
   return TRet.from(slide_indicator_set_anchor(this != null ? (this.nativeObj) : 0, anchor_x, anchor_y));
 }


  /**
   * 设置指示器指示的目标。
   * 
   * @param target_name 指示器指示的目标控件的名称
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setIndicatedTarget(String target_name)  {
   return TRet.from(slide_indicator_set_indicated_target(this != null ? (this.nativeObj) : 0, target_name));
 }


  /**
   * 设置是否启用过渡效果。
   * 
   * @param transition 是否启用过渡效果
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setTransition(boolean transition)  {
   return TRet.from(slide_indicator_set_transition(this != null ? (this.nativeObj) : 0, transition));
 }


  /**
   * 最大值(缺省为100)。
   *
   */
 public int getMax() {
   return slide_indicator_t_get_prop_max(this.nativeObj);
 }


  /**
   * 指示器的类型。
   *
   */
 public TIndicatorDefaultPaint getDefaultPaint() {
   return TIndicatorDefaultPaint.from(slide_indicator_t_get_prop_default_paint(this.nativeObj));

 }


  /**
   * 自动隐藏。0表示禁止，非0表示无操作后延迟多久隐藏。
   *
   */
 public int getAutoHide() {
   return slide_indicator_t_get_prop_auto_hide(this.nativeObj);
 }


  /**
   * 指示器与边缘的边距。
   *
   */
 public int getMargin() {
   return slide_indicator_t_get_prop_margin(this.nativeObj);
 }


  /**
   * 指示器的中心之间的间距（圆弧显示时，间距的单位为弧度，否则为像素）。
   *
   */
 public double getSpacing() {
   return slide_indicator_t_get_prop_spacing(this.nativeObj);
 }


  /**
   * 指示器的大小。
   *
   */
 public int getSize() {
   return slide_indicator_t_get_prop_size(this.nativeObj);
 }


  /**
   * 锚点x坐标。(后面加上px为像素点，不加px为相对百分比坐标0.0f到1.0f)
   *
   */
 public String getAnchorX() {
   return slide_indicator_t_get_prop_anchor_x(this.nativeObj);
 }


  /**
   * 锚点y坐标。(后面加上px为像素点，不加px为相对百分比坐标0.0f到1.0f)
   *
   */
 public String getAnchorY() {
   return slide_indicator_t_get_prop_anchor_y(this.nativeObj);
 }


  /**
   * 指示器指示的目标控件的名称。
   *
   */
 public String getIndicatedTarget() {
   return slide_indicator_t_get_prop_indicated_target(this.nativeObj);
 }


  /**
   * 是否启用过渡效果。
   *
   */
 public boolean getTransition() {
   return slide_indicator_t_get_prop_transition(this.nativeObj);
 }

static private native long slide_indicator_create(long parent, int x, int y, int w, int h);
static private native long slide_indicator_create_linear(long parent, int x, int y, int w, int h);
static private native long slide_indicator_create_arc(long parent, int x, int y, int w, int h);
static private native long slide_indicator_cast(long widget);
static private native int slide_indicator_set_value(long widget, int value);
static private native int slide_indicator_set_max(long widget, int max);
static private native int slide_indicator_set_default_paint(long widget, int default_paint);
static private native int slide_indicator_set_auto_hide(long widget, int auto_hide);
static private native int slide_indicator_set_margin(long widget, int margin);
static private native int slide_indicator_set_spacing(long widget, double spacing);
static private native int slide_indicator_set_size(long widget, int size);
static private native int slide_indicator_set_anchor(long widget, String anchor_x, String anchor_y);
static private native int slide_indicator_set_indicated_target(long widget, String target_name);
static private native int slide_indicator_set_transition(long widget, boolean transition);
static private native int slide_indicator_t_get_prop_value(long nativeObj);
static private native int slide_indicator_t_get_prop_max(long nativeObj);
static private native int slide_indicator_t_get_prop_default_paint(long nativeObj);
static private native int slide_indicator_t_get_prop_auto_hide(long nativeObj);
static private native int slide_indicator_t_get_prop_margin(long nativeObj);
static private native double slide_indicator_t_get_prop_spacing(long nativeObj);
static private native int slide_indicator_t_get_prop_size(long nativeObj);
static private native String slide_indicator_t_get_prop_anchor_x(long nativeObj);
static private native String slide_indicator_t_get_prop_anchor_y(long nativeObj);
static private native String slide_indicator_t_get_prop_indicated_target(long nativeObj);
static private native boolean slide_indicator_t_get_prop_transition(long nativeObj);
};