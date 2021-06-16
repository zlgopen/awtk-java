package awtk;


/**
 * 文本控件。用于显示一行或多行文本。
 *
 *文本控件不会根据文本的长度自动换行，只有文本内容包含换行符时才会换行。
 *
 *如需自动换行请使用[rich\_text\_t](rich_text_t.md)控件。
 *
 *label\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于label\_t控件。
 *
 *在xml中使用"label"标签创建文本控件。如：
 *
 *```xml
 *<label style="center" text="center"/>
 *```
 *
 *> 更多用法请参考：[label.xml](
 *https://github.com/zlgopen/awtk/blob/master/design/default/ui/label.xml)
 *
 *在c代码中使用函数label\_create创建文本控件。如：
 *
 *
 *> 创建之后，需要用widget\_set\_text或widget\_set\_text\_utf8设置文本内容。
 *
 *> 完整示例请参考：[label demo](
 *https://github.com/zlgopen/awtk-c-demos/blob/master/demos/label.c)
 *
 *可用通过style来设置控件的显示风格，如字体的大小和颜色等等。如：
 *
 *```xml
 *<style name="left">
 *<normal text_color="red" text_align_h="left" border_color="#a0a0a0" margin="4" />
 *</style>
 *```
 *
 *> 更多用法请参考：
 *[theme default](
 *https://github.com/zlgopen/awtk/blob/master/design/default/styles/default.xml#L144)
 *
 */
public class TLabel extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TLabel(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TLabel cast(long nativeObj) {
   return new TLabel(nativeObj);
 }


  /**
   * 创建label对象
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
    return new TLabel(label_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 设置显示字符的个数(小余0时全部显示)。
   * 
   * @param length 最大可显示字符个数。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setLength(int length)  {
   return TRet.from(label_set_length(this != null ? (this.nativeObj) : 0, length));
 }


  /**
   * 设置max_w。
   * 
   * @param max_w 最大宽度。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setMaxW(int max_w)  {
   return TRet.from(label_set_max_w(this != null ? (this.nativeObj) : 0, max_w));
 }


  /**
   * 设置是否自动换行。
   * 
   * @param line_wrap 是否自动换行。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setLineWrap(boolean line_wrap)  {
   return TRet.from(label_set_line_wrap(this != null ? (this.nativeObj) : 0, line_wrap));
 }


  /**
   * 设置是否允许整个单词换行。(需要开启自动换行才有效果)
   * 
   * @param word_wrap 是否允许整个单词换行。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setWordWrap(boolean word_wrap)  {
   return TRet.from(label_set_word_wrap(this != null ? (this.nativeObj) : 0, word_wrap));
 }


  /**
   * 根据文本内容调节控件大小。
   * 
   * @param min_w 最小宽度。
   * @param max_w 最大宽度。
   * @param min_h 最小高度。
   * @param max_h 最大高度。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet resizeToContent(int min_w, int max_w, int min_h, int max_h)  {
   return TRet.from(label_resize_to_content(this != null ? (this.nativeObj) : 0, min_w, max_w, min_h, max_h));
 }


  /**
   * 转换为label对象(供脚本语言使用)。
   * 
   * @param widget label对象。
   *
   * @return label对象。
   */
 public  static TLabel cast(TWidget widget)  {
    return new TLabel(label_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 显示字符的个数(小余0时全部显示)。
   *主要用于动态改变显示字符的个数，来实现类似[拨号中...]的动画效果。
   *
   */
 public int getLength() {
   return label_t_get_prop_length(this.nativeObj);
 }


  /**
   * 是否自动换行(默认FALSE)。
   *
   */
 public boolean getLineWrap() {
   return label_t_get_prop_line_wrap(this.nativeObj);
 }


  /**
   * 是否允许整个单词换行(默认FALSE)。
   *> 需要开启自动换行才有效果
   *
   */
 public boolean getWordWrap() {
   return label_t_get_prop_word_wrap(this.nativeObj);
 }


  /**
   * 当auto_adjust_size为TRUE时，用于控制控件的最大宽度，超出该宽度后才自动换行。
   *>为0表示忽略该参数。小于0时取父控件宽度加上max_w。
   *
   */
 public int getMaxW() {
   return label_t_get_prop_max_w(this.nativeObj);
 }

static private native long label_create(long parent, int x, int y, int w, int h);
static private native int label_set_length(long widget, int length);
static private native int label_set_max_w(long widget, int max_w);
static private native int label_set_line_wrap(long widget, boolean line_wrap);
static private native int label_set_word_wrap(long widget, boolean word_wrap);
static private native int label_resize_to_content(long widget, int min_w, int max_w, int min_h, int max_h);
static private native long label_cast(long widget);
static private native int label_t_get_prop_length(long nativeObj);
static private native boolean label_t_get_prop_line_wrap(long nativeObj);
static private native boolean label_t_get_prop_word_wrap(long nativeObj);
static private native int label_t_get_prop_max_w(long nativeObj);
};