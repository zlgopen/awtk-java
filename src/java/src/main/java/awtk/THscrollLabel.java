package awtk;


/**
 * 可水平滚动的文本控件，方便实现长文本滚动。
 *
 *
 *hscroll\_label\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于hscroll\_label\_t控件。
 *
 *> 更多用法请参考：[hscroll_label.xml](
 *https://github.com/zlgopen/awtk/blob/master/design/default/ui/hscroll_label.xml)
 *
 *可用通过style来设置控件的显示风格，如字体的大小和颜色等等。如：
 *
 *```xml
 *<style name="default" text_color="black">
 *<normal   />
 *<focused  />
 *</style>
 *```
 *
 *> 更多用法请参考：
 *[theme default](
 *https://github.com/zlgopen/awtk/blob/master/design/default/styles/default.xml)
 *
 */
public class THscrollLabel extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public THscrollLabel(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public THscrollLabel cast(long nativeObj) {
   return new THscrollLabel(nativeObj);
 }


  /**
   * 创建hscroll_label对象
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
    return new THscrollLabel(hscroll_label_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 设置lull。
   * 
   * @param lull 间歇时间(ms)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setLull(int lull)  {
   return TRet.from(hscroll_label_set_lull(this != null ? (this.nativeObj) : 0, lull));
 }


  /**
   * 设置duration。
   * 
   * @param duration 滚动时间(ms)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setDuration(int duration)  {
   return TRet.from(hscroll_label_set_duration(this != null ? (this.nativeObj) : 0, duration));
 }


  /**
   * 设置speed（设置后 duration 不生效）。
   * 
   * @param speed 滚动速度(px/ms)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setSpeed(double speed)  {
   return TRet.from(hscroll_label_set_speed(this != null ? (this.nativeObj) : 0, speed));
 }


  /**
   * 设置only_focus。
   * 
   * @param only_focus 是否只有处于focus时才滚动。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setOnlyFocus(boolean only_focus)  {
   return TRet.from(hscroll_label_set_only_focus(this != null ? (this.nativeObj) : 0, only_focus));
 }


  /**
   * 设置only_parent_focus。
   * 
   * @param only_parent_focus 是否只有处于focus时才滚动。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setOnlyParentFocus(boolean only_parent_focus)  {
   return TRet.from(hscroll_label_set_only_parent_focus(this != null ? (this.nativeObj) : 0, only_parent_focus));
 }


  /**
   * 设置loop。
   * 
   * @param loop 是否循环滚动。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setLoop(boolean loop)  {
   return TRet.from(hscroll_label_set_loop(this != null ? (this.nativeObj) : 0, loop));
 }


  /**
   * 设置yoyo。
   * 
   * @param yoyo 是否往返滚动。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setYoyo(boolean yoyo)  {
   return TRet.from(hscroll_label_set_yoyo(this != null ? (this.nativeObj) : 0, yoyo));
 }


  /**
   * 设置ellipses。
   * 
   * @param ellipses 是否在文本超长时在行尾显示"..."。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setEllipses(boolean ellipses)  {
   return TRet.from(hscroll_label_set_ellipses(this != null ? (this.nativeObj) : 0, ellipses));
 }


  /**
   * 设置x偏移(一般无需用户调用)。。
   * 
   * @param xoffset x偏移。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setXoffset(int xoffset)  {
   return TRet.from(hscroll_label_set_xoffset(this != null ? (this.nativeObj) : 0, xoffset));
 }


  /**
   * 启动(一般无需用户调用)。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet start()  {
   return TRet.from(hscroll_label_start(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 停止(一般无需用户调用)。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet stop()  {
   return TRet.from(hscroll_label_stop(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 转换为hscroll_label对象(供脚本语言使用)。
   * 
   * @param widget hscroll_label对象。
   *
   * @return hscroll_label对象。
   */
 public  static THscrollLabel cast(TWidget widget)  {
    return new THscrollLabel(hscroll_label_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 只有处于focus时才滚动(缺省否)。
   *
   */
 public boolean getOnlyFocus() {
   return hscroll_label_t_get_prop_only_focus(this.nativeObj);
 }


  /**
   * 只有父控件处于focus时才滚动(缺省否)。
   *
   */
 public boolean getOnlyParentFocus() {
   return hscroll_label_t_get_prop_only_parent_focus(this.nativeObj);
 }


  /**
   * loop是否循环滚动(缺省FALSE)。
   *
   */
 public boolean getLoop() {
   return hscroll_label_t_get_prop_loop(this.nativeObj);
 }


  /**
   * 是否往返滚动(缺省FALSE)。
   *
   */
 public boolean getYoyo() {
   return hscroll_label_t_get_prop_yoyo(this.nativeObj);
 }


  /**
   * 文本显示不下时，在行尾显示省略号(缺省FALSE)。
   *
   */
 public boolean getEllipses() {
   return hscroll_label_t_get_prop_ellipses(this.nativeObj);
 }


  /**
   * 滚动之间的间歇时间(ms)，缺省3000ms。
   *
   */
 public int getLull() {
   return hscroll_label_t_get_prop_lull(this.nativeObj);
 }


  /**
   * 完整的滚动一次需要的时间(ms)，缺省5000ms。
   *
   */
 public int getDuration() {
   return hscroll_label_t_get_prop_duration(this.nativeObj);
 }


  /**
   * 滚动速度(px/ms)（设置后 duration 不生效）。
   *
   */
 public double getSpeed() {
   return hscroll_label_t_get_prop_speed(this.nativeObj);
 }


  /**
   * 偏移量。
   *
   */
 public int getXoffset() {
   return hscroll_label_t_get_prop_xoffset(this.nativeObj);
 }


  /**
   * 文本的宽度。
   *
   */
 public int getTextW() {
   return hscroll_label_t_get_prop_text_w(this.nativeObj);
 }

static private native long hscroll_label_create(long parent, int x, int y, int w, int h);
static private native int hscroll_label_set_lull(long widget, int lull);
static private native int hscroll_label_set_duration(long widget, int duration);
static private native int hscroll_label_set_speed(long widget, double speed);
static private native int hscroll_label_set_only_focus(long widget, boolean only_focus);
static private native int hscroll_label_set_only_parent_focus(long widget, boolean only_parent_focus);
static private native int hscroll_label_set_loop(long widget, boolean loop);
static private native int hscroll_label_set_yoyo(long widget, boolean yoyo);
static private native int hscroll_label_set_ellipses(long widget, boolean ellipses);
static private native int hscroll_label_set_xoffset(long widget, int xoffset);
static private native int hscroll_label_start(long widget);
static private native int hscroll_label_stop(long widget);
static private native long hscroll_label_cast(long widget);
static private native boolean hscroll_label_t_get_prop_only_focus(long nativeObj);
static private native boolean hscroll_label_t_get_prop_only_parent_focus(long nativeObj);
static private native boolean hscroll_label_t_get_prop_loop(long nativeObj);
static private native boolean hscroll_label_t_get_prop_yoyo(long nativeObj);
static private native boolean hscroll_label_t_get_prop_ellipses(long nativeObj);
static private native int hscroll_label_t_get_prop_lull(long nativeObj);
static private native int hscroll_label_t_get_prop_duration(long nativeObj);
static private native double hscroll_label_t_get_prop_speed(long nativeObj);
static private native int hscroll_label_t_get_prop_xoffset(long nativeObj);
static private native int hscroll_label_t_get_prop_text_w(long nativeObj);
};