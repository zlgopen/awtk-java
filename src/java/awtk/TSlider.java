package awtk;


/**
 * 滑块控件。
 *
 *slider\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于slider\_t控件。
 *
 *在xml中使用"slider"标签创建滑块控件。如：
 *
 *```xml
 *<slider x="center" y="10" w="80%" h="20" value="10"/>
 *<slider style="img" x="center" y="50" w="80%" h="30" value="20" />
 *<slider style="img" x="center" y="90" w="80%" h="30" value="30" min="5" max="50" step="5"/>
 *```
 *
 *> 更多用法请参考：
 *[basic](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/basic.xml)
 *
 *在c代码中使用函数slider\_create创建滑块控件。如：
 *
 *
 *> 完整示例请参考：
 *[slider demo](https://github.com/zlgopen/awtk-c-demos/blob/master/demos/slider.c)
 *
 *可用通过style来设置控件的显示风格，如图片和颜色等等。如：
 *
 *```xml
 *<style name="img" bg_image="slider_bg" fg_image="slider_fg">
 *<normal icon="slider_drag"/>
 *<pressed icon="slider_drag_p"/>
 *<over icon="slider_drag_o"/>
 *</style>
 *```
 *
 *> 更多用法请参考：
 *[theme
 *default](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/styles/default.xml#L179)
 *
 */
public class TSlider extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TSlider(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TSlider cast(long nativeObj) {
   return new TSlider(nativeObj);
 }


/**
 * 创建slider对象
 * 
 * @param parent 父控件
 * @param x x坐标
 * @param y y坐标
 * @param w 宽度
 * @param h 高度
 
 * @return 对象。
 */
 public  static TWidget create(TWidget parent, int x, int y, int w, int h)  {
    return new TSlider(slider_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换为slider对象(供脚本语言使用)。
 * 
 * @param widget slider对象。
 
 * @return slider对象。
 */
 public  static TSlider cast(TWidget widget)  {
    return new TSlider(slider_cast(widget != null ? (widget.nativeObj) : 0));
 }


/**
 * 设置滑块的值。
 * 
 * @param value 值
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet setValue(double value)  {
   return TRet.from(slider_set_value(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 设置滑块的最小值。
 * 
 * @param min 最小值
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet setMin(double min)  {
   return TRet.from(slider_set_min(this != null ? (this.nativeObj) : 0, min));
 }


/**
 * 设置滑块的最大值。
 * 
 * @param max 最大值
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet setMax(double max)  {
   return TRet.from(slider_set_max(this != null ? (this.nativeObj) : 0, max));
 }


/**
 * 设置滑块的拖动的最小单位。
 * 
 * @param step 拖动的最小单位。
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet setStep(double step)  {
   return TRet.from(slider_set_step(this != null ? (this.nativeObj) : 0, step));
 }


/**
 * 设置bar的宽度或高度。
 * 
 * @param bar_size bar的宽度或高度。
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet setBarSize(int bar_size)  {
   return TRet.from(slider_set_bar_size(this != null ? (this.nativeObj) : 0, bar_size));
 }


/**
 * 设置滑块的方向。
 * 
 * @param vertical 是否为垂直方向。
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet setVertical(boolean vertical)  {
   return TRet.from(slider_set_vertical(this != null ? (this.nativeObj) : 0, vertical));
 }


/**
 * 最小值。
 *
 */
 public double getMin() {
   return slider_t_get_prop_min(this.nativeObj);
 }


/**
 * 最大值。
 *
 */
 public double getMax() {
   return slider_t_get_prop_max(this.nativeObj);
 }


/**
 * 拖动的最小单位。
 *
 */
 public double getStep() {
   return slider_t_get_prop_step(this.nativeObj);
 }


/**
 * 滑块的是否为垂直方向。
 *
 */
 public boolean getVertical() {
   return slider_t_get_prop_vertical(this.nativeObj);
 }


/**
 * 轴的宽度或高度（单位：像素），为0表示为控件的宽度或高度的一半，缺省为0。
 *
 */
 public int getBarSize() {
   return slider_t_get_prop_bar_size(this.nativeObj);
 }


/**
 * 滑块的宽度或高度（单位：像素），缺省为10。
 *
 */
 public int getDraggerSize() {
   return slider_t_get_prop_dragger_size(this.nativeObj);
 }


/**
 * 滑块的宽度或高度是否与icon适应，缺省为true。
 *
 */
 public boolean getDraggerAdaptToIcon() {
   return slider_t_get_prop_dragger_adapt_to_icon(this.nativeObj);
 }


/**
 * 是否允许在轴上滑动来改变滑块位置，缺省为FALSE。
 *
 */
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
};