package awtk;


/**
 * 可水平滚动的文本控件，方便实现长文本滚动。 hscroll\_label\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于hscroll\_label\_t控件。 在xml中使用"hscroll\_label"标签创建行号控件，一般配合mledit使用。如： ```xml ``` 更多用法请参考：[mledit.xml](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/mledit.xml) 可用通过style来设置控件的显示风格，如字体的大小和颜色等等。如： ```xml  <style name="default" text_color="black">    <normal   />    <focused  />  </style> ``` 更多用法请参考： [theme default](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/styles/default.xml)
 *
 */
public class HscrollLabel extends Widget {
 public long nativeObj;

 public HscrollLabel(long nativeObj) {
   super(nativeObj);
 }

 static public HscrollLabel cast(long nativeObj) {
   return new HscrollLabel(nativeObj);
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
 * @returns 对象。
 */
 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new HscrollLabel(hscroll_label_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 设置lull。
 * 
 * @param widget 控件对象。
 * @param lull 间歇时间(ms)。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setLull(int lull)  {
   return Ret.from(hscroll_label_set_lull(this != null ? (this.nativeObj) : 0, lull));
 }


/**
 * 设置duration。
 * 
 * @param widget 控件对象。
 * @param duration 滚动时间(ms)。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setDuration(int duration)  {
   return Ret.from(hscroll_label_set_duration(this != null ? (this.nativeObj) : 0, duration));
 }


/**
 * 设置only_focus。
 * 
 * @param widget 控件对象。
 * @param only_focus 是否只有处于focus时才滚动。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setOnlyFocus(boolean only_focus)  {
   return Ret.from(hscroll_label_set_only_focus(this != null ? (this.nativeObj) : 0, only_focus));
 }


/**
 * 设置only_parent_focus。
 * 
 * @param widget 控件对象。
 * @param only_parent_focus 是否只有处于focus时才滚动。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setOnlyParentFocus(boolean only_parent_focus)  {
   return Ret.from(hscroll_label_set_only_parent_focus(this != null ? (this.nativeObj) : 0, only_parent_focus));
 }


/**
 * 设置loop。
 * 
 * @param widget 控件对象。
 * @param loop 是否循环滚动。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setLoop(boolean loop)  {
   return Ret.from(hscroll_label_set_loop(this != null ? (this.nativeObj) : 0, loop));
 }


/**
 * 设置yoyo。
 * 
 * @param widget 控件对象。
 * @param yoyo 是否往返滚动。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setYoyo(boolean yoyo)  {
   return Ret.from(hscroll_label_set_yoyo(this != null ? (this.nativeObj) : 0, yoyo));
 }


/**
 * 设置ellipses。
 * 
 * @param widget 控件对象。
 * @param ellipses 是否在文本超长时在行尾显示"..."。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setEllipses(boolean ellipses)  {
   return Ret.from(hscroll_label_set_ellipses(this != null ? (this.nativeObj) : 0, ellipses));
 }


/**
 * 设置x偏移(一般无需用户调用)。。
 * 
 * @param widget 控件对象。
 * @param xoffset x偏移。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setXoffset(int xoffset)  {
   return Ret.from(hscroll_label_set_xoffset(this != null ? (this.nativeObj) : 0, xoffset));
 }


/**
 * 启动(一般无需用户调用)。
 * 
 * @param widget 控件对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret start()  {
   return Ret.from(hscroll_label_start(this != null ? (this.nativeObj) : 0));
 }


/**
 * 停止(一般无需用户调用)。
 * 
 * @param widget 控件对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret stop()  {
   return Ret.from(hscroll_label_stop(this != null ? (this.nativeObj) : 0));
 }


/**
 * 转换为hscroll_label对象(供脚本语言使用)。
 * 
 * @param widget hscroll_label对象。
 *
 * @returns hscroll_label对象。
 */
 public  static HscrollLabel cast(Widget widget)  {
   return new HscrollLabel(hscroll_label_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public boolean getOnlyFocus() {
   return hscroll_label_t_get_prop_only_focus(this.nativeObj);
 }

 public boolean getOnlyParentFocus() {
   return hscroll_label_t_get_prop_only_parent_focus(this.nativeObj);
 }

 public boolean getLoop() {
   return hscroll_label_t_get_prop_loop(this.nativeObj);
 }

 public boolean getYoyo() {
   return hscroll_label_t_get_prop_yoyo(this.nativeObj);
 }

 public boolean getEllipses() {
   return hscroll_label_t_get_prop_ellipses(this.nativeObj);
 }

 public int getLull() {
   return hscroll_label_t_get_prop_lull(this.nativeObj);
 }

 public int getDuration() {
   return hscroll_label_t_get_prop_duration(this.nativeObj);
 }

 public int getXoffset() {
   return hscroll_label_t_get_prop_xoffset(this.nativeObj);
 }

 public int getTextW() {
   return hscroll_label_t_get_prop_text_w(this.nativeObj);
 }

static private native long hscroll_label_create(long parent, int x, int y, int w, int h);
static private native int hscroll_label_set_lull(long widget, int lull);
static private native int hscroll_label_set_duration(long widget, int duration);
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
static private native int hscroll_label_t_get_prop_xoffset(long nativeObj);
static private native int hscroll_label_t_get_prop_text_w(long nativeObj);
}

