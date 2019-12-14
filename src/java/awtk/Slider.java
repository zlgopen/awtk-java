package awtk;


/**
 * 滑块控件。
 * 
 *  slider\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于slider\_t控件。
 * 
 *  在xml中使用"slider"标签创建滑块控件。如：
 * 
 *  ```xml
 *  <slider x="center" y="10" w="80%" h="20" value="10"/>
 *  <slider style="img" x="center" y="50" w="80%" h="30" value="20" />
 *  <slider style="img" x="center" y="90" w="80%" h="30" value="30" min="5" max="50" step="5"/>
 *  ```
 * 
 * 更多用法请参考：
 *  [basic](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/basic.xml)
 * 
 *  在c代码中使用函数slider\_create创建滑块控件。如：
 * 
 *  ```c
 *   widget_t* slider = slider_create(win, 10, 10, 200, 30);
 *   widget_on(slider, EVT_VALUE_CHANGED, on_changed, NULL);
 *   widget_on(slider, EVT_VALUE_CHANGING, on_changing, NULL);
 *  ```
 * 
 * 完整示例请参考：
 *  [slider demo](https://github.com/zlgopen/awtk-c-demos/blob/master/demos/slider.c)
 * 
 *  可用通过style来设置控件的显示风格，如图片和颜色等等。如：
 * 
 *  ```xml
 *  <style name="img" bg_image="slider_bg" fg_image="slider_fg">
 *   <normal icon="slider_drag"/>
 *   <pressed icon="slider_drag_p"/>
 *   <over icon="slider_drag_o"/>
 *  </style>
 *  ```
 * 
 * 更多用法请参考：
 *  [theme
 *  default](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/styles/default.xml#L179)
 *
 */
public class Slider extends Widget {
 public long nativeObj;

 public Slider(long nativeObj) {
   super(nativeObj);
 }

 static public Slider cast(long nativeObj) {
   return new Slider(nativeObj);
 }


/**
 * 创建slider对象
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
   return new Slider(slider_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换为slider对象(供脚本语言使用)。
 * 
 * @param widget slider对象。
 *
 * @returns slider对象。
 */
 public  static Slider cast(Widget widget)  {
   return new Slider(slider_cast(widget != null ? (widget.nativeObj) : 0));
 }


/**
 * 设置滑块的值。
 * 
 * @param widget 控件对象。
 * @param value 值
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setValue(double value)  {
   return Ret.from(slider_set_value(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 设置滑块的最小值。
 * 
 * @param widget 控件对象。
 * @param min 最小值
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setMin(double min)  {
   return Ret.from(slider_set_min(this != null ? (this.nativeObj) : 0, min));
 }


/**
 * 设置滑块的最大值。
 * 
 * @param widget 控件对象。
 * @param max 最大值
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setMax(double max)  {
   return Ret.from(slider_set_max(this != null ? (this.nativeObj) : 0, max));
 }


/**
 * 设置滑块的拖动的最小单位。
 * 
 * @param widget 控件对象。
 * @param step 拖动的最小单位。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setStep(double step)  {
   return Ret.from(slider_set_step(this != null ? (this.nativeObj) : 0, step));
 }


/**
 * 设置bar的宽度或高度。
 * 
 * @param widget 控件对象。
 * @param bar_size bar的宽度或高度。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setBarSize(int bar_size)  {
   return Ret.from(slider_set_bar_size(this != null ? (this.nativeObj) : 0, bar_size));
 }


/**
 * 设置滑块的方向。
 * 
 * @param widget 控件对象。
 * @param vertical 是否为垂直方向。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setVertical(boolean vertical)  {
   return Ret.from(slider_set_vertical(this != null ? (this.nativeObj) : 0, vertical));
 }

 public double getMin() {
   return slider_t_get_prop_min(this.nativeObj);
 }

 public double getMax() {
   return slider_t_get_prop_max(this.nativeObj);
 }

 public double getStep() {
   return slider_t_get_prop_step(this.nativeObj);
 }

 public boolean getVertical() {
   return slider_t_get_prop_vertical(this.nativeObj);
 }

 public int getBarSize() {
   return slider_t_get_prop_bar_size(this.nativeObj);
 }

 public int getDraggerSize() {
   return slider_t_get_prop_dragger_size(this.nativeObj);
 }

 public boolean getDraggerAdaptToIcon() {
   return slider_t_get_prop_dragger_adapt_to_icon(this.nativeObj);
 }

 public boolean getSlideWithBar() {
   return slider_t_get_prop_slide_with_bar(this.nativeObj);
 }

static private native long slider_create(long parent, int x, int y, int w, int h);
static private native long slider_cast(long widget);
static private native int slider_set_value(long widget, double value);
static private native int slider_set_min(long widget, double min);
static private native int slider_set_max(long widget, double max);
static private native int slider_set_step(long widget, double step);
static private native int slider_set_bar_size(long widget, int bar_size);
static private native int slider_set_vertical(long widget, boolean vertical);
static private native double slider_t_get_prop_value(long nativeObj);
static private native double slider_t_get_prop_min(long nativeObj);
static private native double slider_t_get_prop_max(long nativeObj);
static private native double slider_t_get_prop_step(long nativeObj);
static private native boolean slider_t_get_prop_vertical(long nativeObj);
static private native int slider_t_get_prop_bar_size(long nativeObj);
static private native int slider_t_get_prop_dragger_size(long nativeObj);
static private native boolean slider_t_get_prop_dragger_adapt_to_icon(long nativeObj);
static private native boolean slider_t_get_prop_slide_with_bar(long nativeObj);
}

