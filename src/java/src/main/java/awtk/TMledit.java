package awtk;


/**
 * 多行编辑器控件。
 *
 *mledit\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于mledit\_t控件。
 *
 *在xml中使用"mledit"标签创建多行编辑器控件。如：
 *
 *```xml
 *<mledit x="c" y="m" w="300" h="300" />
 *```
 *
 *> 更多用法请参考：[mledit.xml](
 *https://github.com/zlgopen/awtk/blob/master/design/default/ui/mledit.xml)
 *
 *在c代码中使用函数mledit\_create创建多行编辑器控件。如：
 *
 *
 *> 完整示例请参考：[mledit demo](
 *https://github.com/zlgopen/awtk-c-demos/blob/master/demos/mledit.c)
 *
 *time\_clock一般不需要设置style。
 *
 */
public class TMledit extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TMledit(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TMledit cast(long nativeObj) {
   return new TMledit(nativeObj);
 }


  /**
   * 创建mledit对象
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
    return new TMledit(mledit_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 设置编辑器是否为只读。
   * 
   * @param readonly 只读。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setReadonly(boolean readonly)  {
   return TRet.from(mledit_set_readonly(this != null ? (this.nativeObj) : 0, readonly));
 }


  /**
   * 设置编辑器是否为可撤销修改。
   * 
   * @param cancelable 是否为可撤销修。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setCancelable(boolean cancelable)  {
   return TRet.from(mledit_set_cancelable(this != null ? (this.nativeObj) : 0, cancelable));
 }


  /**
   * 设置为焦点。
   * 
   * @param focus 是否为焦点。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setFocus(boolean focus)  {
   return TRet.from(mledit_set_focus(this != null ? (this.nativeObj) : 0, focus));
 }


  /**
   * 设置编辑器是否自动折行。
   * 
   * @param wrap_word 是否自动折行。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setWrapWord(boolean wrap_word)  {
   return TRet.from(mledit_set_wrap_word(this != null ? (this.nativeObj) : 0, wrap_word));
 }


  /**
   * 设置编辑器的最大行数。
   * 
   * @param max_lines 最大行数。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setMaxLines(int max_lines)  {
   return TRet.from(mledit_set_max_lines(this != null ? (this.nativeObj) : 0, max_lines));
 }


  /**
   * 设置编辑器的输入提示。
   * 
   * @param tips 输入提示。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setTips(String tips)  {
   return TRet.from(mledit_set_tips(this != null ? (this.nativeObj) : 0, tips));
 }


  /**
   * 获取翻译之后的文本，然后调用mledit_set_tips。
   * 
   * @param tr_tips 提示信息。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setTrTips(String tr_tips)  {
   return TRet.from(mledit_set_tr_tips(this != null ? (this.nativeObj) : 0, tr_tips));
 }


  /**
   * 设置自定义软键盘名称。
   * 
   * @param keyboard 键盘名称(相应UI资源必须存在)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setKeyboard(String keyboard)  {
   return TRet.from(mledit_set_keyboard(this != null ? (this.nativeObj) : 0, keyboard));
 }


  /**
   * 设置编辑器光标位置。
   * 
   * @param cursor 光标位置。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setCursor(int cursor)  {
   return TRet.from(mledit_set_cursor(this != null ? (this.nativeObj) : 0, cursor));
 }


  /**
   * 设置编辑器滚动速度。
   * 
   * @param scroll_line 滚动行数。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setScrollLine(int scroll_line)  {
   return TRet.from(mledit_set_scroll_line(this != null ? (this.nativeObj) : 0, scroll_line));
 }


  /**
   * 转换为mledit对象(供脚本语言使用)。
   * 
   * @param widget mledit对象。
   *
   * @return mledit对象。
   */
 public  static TMledit cast(TWidget widget)  {
    return new TMledit(mledit_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 编辑器是否为只读。
   *
   */
 public boolean getReadonly() {
   return mledit_t_get_prop_readonly(this.nativeObj);
 }


  /**
   * 上边距。
   *
   */
 public int getTopMargin() {
   return mledit_t_get_prop_top_margin(this.nativeObj);
 }


  /**
   * 下边距。
   *
   */
 public int getBottomMargin() {
   return mledit_t_get_prop_bottom_margin(this.nativeObj);
 }


  /**
   * 左边距。
   *
   */
 public int getLeftMargin() {
   return mledit_t_get_prop_left_margin(this.nativeObj);
 }


  /**
   * 右边距。
   *
   */
 public int getRightMargin() {
   return mledit_t_get_prop_right_margin(this.nativeObj);
 }


  /**
   * 输入提示。
   *
   */
 public String getTips() {
   return mledit_t_get_prop_tips(this.nativeObj);
 }


  /**
   * 保存用于翻译的提示信息。
   *
   */
 public String getTrTips() {
   return mledit_t_get_prop_tr_tips(this.nativeObj);
 }


  /**
   * 自定义软键盘名称。
   *
   */
 public String getKeyboard() {
   return mledit_t_get_prop_keyboard(this.nativeObj);
 }


  /**
   * 是否自动折行。
   *
   */
 public boolean getWrapWord() {
   return mledit_t_get_prop_wrap_word(this.nativeObj);
 }


  /**
   * 最大行数。
   *
   */
 public int getMaxLines() {
   return mledit_t_get_prop_max_lines(this.nativeObj);
 }


  /**
   * 鼠标一次滚动行数。
   *
   */
 public int getScrollLine() {
   return mledit_t_get_prop_scroll_line(this.nativeObj);
 }


  /**
   * 是否支持撤销编辑。如果为TRUE，在失去焦点之前可以撤销所有修改(恢复获得焦点之前的内容)。
   *
   *> * 1.一般配合keyboard的"cancel"按钮使用。
   *> * 2.为TRUE时，如果内容有变化，会设置编辑器的状态为changed，所以此时编辑器需要支持changed状态的style。
   *
   */
 public boolean getCancelable() {
   return mledit_t_get_prop_cancelable(this.nativeObj);
 }

static private native long mledit_create(long parent, int x, int y, int w, int h);
static private native int mledit_set_readonly(long widget, boolean readonly);
static private native int mledit_set_cancelable(long widget, boolean cancelable);
static private native int mledit_set_focus(long widget, boolean focus);
static private native int mledit_set_wrap_word(long widget, boolean wrap_word);
static private native int mledit_set_max_lines(long widget, int max_lines);
static private native int mledit_set_tips(long widget, String tips);
static private native int mledit_set_tr_tips(long widget, String tr_tips);
static private native int mledit_set_keyboard(long widget, String keyboard);
static private native int mledit_set_cursor(long widget, int cursor);
static private native int mledit_set_scroll_line(long widget, int scroll_line);
static private native long mledit_cast(long widget);
static private native boolean mledit_t_get_prop_readonly(long nativeObj);
static private native int mledit_t_get_prop_top_margin(long nativeObj);
static private native int mledit_t_get_prop_bottom_margin(long nativeObj);
static private native int mledit_t_get_prop_left_margin(long nativeObj);
static private native int mledit_t_get_prop_right_margin(long nativeObj);
static private native String mledit_t_get_prop_tips(long nativeObj);
static private native String mledit_t_get_prop_tr_tips(long nativeObj);
static private native String mledit_t_get_prop_keyboard(long nativeObj);
static private native boolean mledit_t_get_prop_wrap_word(long nativeObj);
static private native int mledit_t_get_prop_max_lines(long nativeObj);
static private native int mledit_t_get_prop_scroll_line(long nativeObj);
static private native boolean mledit_t_get_prop_cancelable(long nativeObj);
};