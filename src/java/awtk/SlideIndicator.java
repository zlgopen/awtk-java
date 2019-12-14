package awtk;


/**
 * slide_view的指示器控件。> 支持直线、弧线排布，默认有4种绘制样式，若设置了icon/active_icon，则优先使用icon/active_icon slide\_indicator\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于slide\_indicator\_t控件。 在xml中使用"slide\_indicator"或"slide\_indicator\_arc"标签创建指示器控件。如： ```xml <slide_view name="view" x="0"  y="0" w="100%" h="100%"> ... </slide_view> <slide_indicator name="indicator" x="right" y="0" w="6" h="100%"/> ``` 更多用法请参考：[slide\_view.xml](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/slide_view.xml) 在c代码中使用函数slide\_indicator\_create创建指示器控件。如： ```c  widget_t* slide_indicator = slide_indicator_create(parent, 0, 0, 0, 0); ``` ```xml <style name="default">   <normal fg_color="#FFFFFF80" selected_fg_color="#FFFFFF"/> </style> ``` 更多用法请参考：[theme default](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/styles/default.xml#L350)
 *
 */
public class SlideIndicator extends Widget {
 public long nativeObj;

 public SlideIndicator(long nativeObj) {
   super(nativeObj);
 }

 static public SlideIndicator cast(long nativeObj) {
   return new SlideIndicator(nativeObj);
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
 * @returns 对象。
 */
 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new SlideIndicator(slide_indicator_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
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
 * @returns 对象。
 */
 public  static Widget createLinear(Widget parent, int x, int y, int w, int h)  {
   return new SlideIndicator(slide_indicator_create_linear(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
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
 * @returns 对象。
 */
 public  static Widget createArc(Widget parent, int x, int y, int w, int h)  {
   return new SlideIndicator(slide_indicator_create_arc(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换为slide_indicator对象(供脚本语言使用)。
 * 
 * @param widget slide_indicator对象。
 *
 * @returns slide_indicator对象。
 */
 public  static SlideIndicator cast(Widget widget)  {
   return new SlideIndicator(slide_indicator_cast(widget != null ? (widget.nativeObj) : 0));
 }


/**
 * 设置当前页的序号。
 * 
 * @param widget slide_indicator对象。
 * @param value 当前项的序号。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setValue(int value)  {
   return Ret.from(slide_indicator_set_value(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 设置指示器的数量。
 * 
 * @param widget slide_indicator对象。
 * @param max 数量。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setMax(int max)  {
   return Ret.from(slide_indicator_set_max(this != null ? (this.nativeObj) : 0, max));
 }


/**
 * 设置指示器的默认绘制类型。
 * 
 * @param widget slide_indicator对象。
 * @param default_paint 默认绘制类型。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setDefaultPaint(IndicatorDefaultPaint default_paint)  {
   return Ret.from(slide_indicator_set_default_paint(this != null ? (this.nativeObj) : 0, default_paint.value()));
 }


/**
 * 设置指示器是否自动隐藏。
 * 
 * @param widget slide_indicator对象。
 * @param auto_hide 0表示禁止，非0表示无操作后延迟多久隐藏。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setAutoHide(int auto_hide)  {
   return Ret.from(slide_indicator_set_auto_hide(this != null ? (this.nativeObj) : 0, auto_hide));
 }


/**
 * 设置指示器的边距(默认为10像素)。
 * 
 * @param widget slide_indicator对象。
 * @param margin 指示器的边距。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setMargin(int margin)  {
   return Ret.from(slide_indicator_set_margin(this != null ? (this.nativeObj) : 0, margin));
 }


/**
 * 设置指示器的间距(指示器有弧度时为角度值，否则为直线间距)。
 * 
 * @param widget slide_indicator对象。
 * @param spacing 指示器的间距。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setSpacing(double spacing)  {
   return Ret.from(slide_indicator_set_spacing(this != null ? (this.nativeObj) : 0, spacing));
 }


/**
 * 设置指示器的大小(默认为8)。
 * 
 * @param widget slide_indicator对象。
 * @param size 指示器的大小。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setSize(int size)  {
   return Ret.from(slide_indicator_set_size(this != null ? (this.nativeObj) : 0, size));
 }


/**
 * 设置旋转锚点。
 * 
 * @param widget slide_indicator对象。
 * @param anchor_x 锚点坐标x。(后面加上px为像素点，不加px为相对百分比坐标)
 * @param anchor_y 锚点坐标y。(后面加上px为像素点，不加px为相对百分比坐标)
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setAnchor(String anchor_x, String anchor_y)  {
   return Ret.from(slide_indicator_set_anchor(this != null ? (this.nativeObj) : 0, anchor_x, anchor_y));
 }


/**
 * 设置指示器指示的目标。
 * 
 * @param widget slide_indicator对象。
 * @param indicated_target 指示器指示的目标
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setIndicatedTarget(String indicated_target)  {
   return Ret.from(slide_indicator_set_indicated_target(this != null ? (this.nativeObj) : 0, indicated_target));
 }

 public int getMax() {
   return slide_indicator_t_get_prop_max(this.nativeObj);
 }

 public IndicatorDefaultPaint getDefaultPaint() {
   return IndicatorDefaultPaint.from(slide_indicator_t_get_prop_default_paint(this.nativeObj));

 }

 public int getAutoHide() {
   return slide_indicator_t_get_prop_auto_hide(this.nativeObj);
 }

 public int getMargin() {
   return slide_indicator_t_get_prop_margin(this.nativeObj);
 }

 public double getSpacing() {
   return slide_indicator_t_get_prop_spacing(this.nativeObj);
 }

 public int getSize() {
   return slide_indicator_t_get_prop_size(this.nativeObj);
 }

 public double getAnchorX() {
   return slide_indicator_t_get_prop_anchor_x(this.nativeObj);
 }

 public double getAnchorY() {
   return slide_indicator_t_get_prop_anchor_y(this.nativeObj);
 }

 public String getIndicatedTarget() {
   return slide_indicator_t_get_prop_indicated_target(this.nativeObj);
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
static private native int slide_indicator_set_indicated_target(long widget, String indicated_target);
static private native int slide_indicator_t_get_prop_value(long nativeObj);
static private native int slide_indicator_t_get_prop_max(long nativeObj);
static private native int slide_indicator_t_get_prop_default_paint(long nativeObj);
static private native int slide_indicator_t_get_prop_auto_hide(long nativeObj);
static private native int slide_indicator_t_get_prop_margin(long nativeObj);
static private native double slide_indicator_t_get_prop_spacing(long nativeObj);
static private native int slide_indicator_t_get_prop_size(long nativeObj);
static private native double slide_indicator_t_get_prop_anchor_x(long nativeObj);
static private native double slide_indicator_t_get_prop_anchor_y(long nativeObj);
static private native String slide_indicator_t_get_prop_indicated_target(long nativeObj);
}

