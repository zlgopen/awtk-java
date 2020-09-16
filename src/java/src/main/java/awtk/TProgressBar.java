package awtk;


/**
 * 进度条控件。
 *
 *进度条控件可以水平显示也可以垂直显示，由vertical属性决定。
 *
 *progress\_bar\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于progress\_bar\_t控件。
 *
 *在xml中使用"progress\_bar"标签创建进度条控件。如：
 *
 *```xml
 *<progress_bar name="bar1" x="10" y="128" w="240" h="30" value="40"/>
 *<progress_bar name="bar2" x="280" y="128" w="30" h="118" value="20" vertical="true"/>
 *```
 *
 *> 更多用法请参考：
 *[basic demo](https://github.com/zlgopen/awtk/blob/master/design/default/ui/basic.xml)
 *
 *在c代码中使用函数progress\_bar\_create创建进度条控件。如：
 *
 *
 *> 完整示例请参考：
 *[progress_bar demo](https://github.com/zlgopen/awtk-c-demos/blob/master/demos/progress_bar.c)
 *
 *可用通过style来设置控件的显示风格，如字体的大小和颜色等等。如：
 *
 *```xml
 *<style>
 *<normal bg_color="#f0f0f0" text_color="gold" fg_color="#c0c0c0" border_color="#a0a0a0" />
 *</style>
 *```
 *
 *> 更多用法请参考：
 *[theme
 *default](https://github.com/zlgopen/awtk/blob/master/design/default/styles/default.xml#L183)
 *
 */
public class TProgressBar extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TProgressBar(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TProgressBar cast(long nativeObj) {
   return new TProgressBar(nativeObj);
 }


  /**
   * 创建progress_bar对象
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
    return new TProgressBar(progress_bar_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为progress_bar对象(供脚本语言使用)。
   * 
   * @param widget progress_bar对象。
   *
   * @return progress_bar对象。
   */
 public  static TProgressBar cast(TWidget widget)  {
    return new TProgressBar(progress_bar_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 设置进度条的进度。
   * 
   * @param value 进度
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setValue(double value)  {
   return TRet.from(progress_bar_set_value(this != null ? (this.nativeObj) : 0, value));
 }


  /**
   * 设置最大值。
   * 
   * @param max 最大值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setMax(int max)  {
   return TRet.from(progress_bar_set_max(this != null ? (this.nativeObj) : 0, max));
 }


  /**
   * 设置进度条的方向。
   * 
   * @param vertical 是否为垂直方向。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setVertical(boolean vertical)  {
   return TRet.from(progress_bar_set_vertical(this != null ? (this.nativeObj) : 0, vertical));
 }


  /**
   * 设置进度条的是否显示文本。
   * 
   * @param show_text 是否显示文本。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setShowText(boolean show_text)  {
   return TRet.from(progress_bar_set_show_text(this != null ? (this.nativeObj) : 0, show_text));
 }


  /**
   * 获取进度百分比。
   *
   *> 当max为100时，percent和value取整后一致。
   * 
   *
   * @return 返回百分比。
   */
 public  int getPercent()  {
    return progress_bar_get_percent(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 最大值(缺省为100)。
   *
   */
 public double getMax() {
   return progress_bar_t_get_prop_max(this.nativeObj);
 }


  /**
   * 进度条的是否为垂直方向。
   *
   */
 public boolean getVertical() {
   return progress_bar_t_get_prop_vertical(this.nativeObj);
 }


  /**
   * 是否显示文本。
   *
   */
 public boolean getShowText() {
   return progress_bar_t_get_prop_show_text(this.nativeObj);
 }

static private native long progress_bar_create(long parent, int x, int y, int w, int h);
static private native long progress_bar_cast(long widget);
static private native int progress_bar_set_value(long widget, double value);
static private native int progress_bar_set_max(long widget, int max);
static private native int progress_bar_set_vertical(long widget, boolean vertical);
static private native int progress_bar_set_show_text(long widget, boolean show_text);
static private native int progress_bar_get_percent(long widget);
static private native double progress_bar_t_get_prop_value(long nativeObj);
static private native double progress_bar_t_get_prop_max(long nativeObj);
static private native boolean progress_bar_t_get_prop_vertical(long nativeObj);
static private native boolean progress_bar_t_get_prop_show_text(long nativeObj);
};