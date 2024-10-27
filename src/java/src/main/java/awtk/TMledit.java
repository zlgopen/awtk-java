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
   * 设置编辑器是否启用覆盖行（在行数达到最大行数时，可继续新增行，但最早的行将会消失）。
   * 
   * @param overwrite 是否启用覆盖行。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setOverwrite(boolean overwrite)  {
   return TRet.from(mledit_set_overwrite(this != null ? (this.nativeObj) : 0, overwrite));
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
   * 设置编辑器的最大字符数（0 为不限制字符数）。
   * 
   * @param max_chars 最大字符数。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setMaxChars(int max_chars)  {
   return TRet.from(mledit_set_max_chars(this != null ? (this.nativeObj) : 0, max_chars));
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
   * 获取编辑器光标位置。
   * 
   *
   * @return 返回光标位置。
   */
 public  int getCursor()  {
    return mledit_get_cursor(this != null ? (this.nativeObj) : 0);
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
   * 设置编辑器滚动到指定偏移位置。
   * 
   * @param offset 偏移位置。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet scrollToOffset(int offset)  {
   return TRet.from(mledit_scroll_to_offset(this != null ? (this.nativeObj) : 0, offset));
 }


  /**
   * 设置编辑器是否在获得焦点时打开输入法。
   *
   *> * 设置默认焦点时，打开窗口时不弹出软键盘。
   *> * 用键盘切换焦点时，编辑器获得焦点时不弹出软键盘。
   * 
   * @param open_im_when_focused 是否在获得焦点时打开输入法。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setOpenImWhenFocused(boolean open_im_when_focused)  {
   return TRet.from(mledit_set_open_im_when_focused(this != null ? (this.nativeObj) : 0, open_im_when_focused));
 }


  /**
   * 设置编辑器是否在失去焦点时关闭输入法。
   * 
   * @param close_im_when_blured 是否是否在失去焦点时关闭输入法。在失去焦点时关闭输入法。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setCloseImWhenBlured(boolean close_im_when_blured)  {
   return TRet.from(mledit_set_close_im_when_blured(this != null ? (this.nativeObj) : 0, close_im_when_blured));
 }


  /**
   * 选择编辑器中指定范围的文本。
   * 
   * @param start 起始偏移。
   * @param end 结束偏移。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setSelect(int start, int end)  {
   return TRet.from(mledit_set_select(this != null ? (this.nativeObj) : 0, start, end));
 }


  /**
   * 获取选中的文本。
   *使用完后需调用 TKMEM_FREE() 进行释放文本占有内存。
   * 
   *
   * @return 返回选中文本。
   */
 public  String getSelectedText()  {
    return mledit_get_selected_text(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 获取光标所在视觉行号(一行文本可能分多行显示)。
   * 
   *
   * @return 返回光标所在行号。
   */
 public  int getCurrentLineIndex()  {
    return mledit_get_current_line_index(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 获取光标所在物理行号。
   * 
   *
   * @return 返回光标所在行号。
   */
 public  int getCurrentRowIndex()  {
    return mledit_get_current_row_index(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 插入一段文本。
   * 
   * @param offset 插入的偏移位置。
   * @param text 待插入的文本。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet insertText(int offset, String text)  {
   return TRet.from(mledit_insert_text(this != null ? (this.nativeObj) : 0, offset, text));
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
   * 最大行数。
   *
   */
 public int getMaxLines() {
   return mledit_t_get_prop_max_lines(this.nativeObj);
 }


  /**
   * 最大字符数。
   *
   */
 public int getMaxChars() {
   return mledit_t_get_prop_max_chars(this.nativeObj);
 }


  /**
   * 鼠标一次滚动行数。
   *
   */
 public int getScrollLine() {
   return mledit_t_get_prop_scroll_line(this.nativeObj);
 }


  /**
   * 是否启用覆盖行。
   *
   */
 public boolean getOverwrite() {
   return mledit_t_get_prop_overwrite(this.nativeObj);
 }


  /**
   * 是否自动折行。
   *
   */
 public boolean getWrapWord() {
   return mledit_t_get_prop_wrap_word(this.nativeObj);
 }


  /**
   * 编辑器是否为只读。
   *
   */
 public boolean getReadonly() {
   return mledit_t_get_prop_readonly(this.nativeObj);
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


  /**
   * 获得焦点时打开输入法。
   *
   *> 主要用于没有指针设备的情况，否则每次切换焦点时都打开输入法。
   *
   */
 public boolean getOpenImWhenFocused() {
   return mledit_t_get_prop_open_im_when_focused(this.nativeObj);
 }


  /**
   * 是否在失去焦点时关闭输入法(默认是)。
   *
   */
 public boolean getCloseImWhenBlured() {
   return mledit_t_get_prop_close_im_when_blured(this.nativeObj);
 }

static private native long mledit_create(long parent, int x, int y, int w, int h);
static private native int mledit_set_readonly(long widget, boolean readonly);
static private native int mledit_set_cancelable(long widget, boolean cancelable);
static private native int mledit_set_focus(long widget, boolean focus);
static private native int mledit_set_wrap_word(long widget, boolean wrap_word);
static private native int mledit_set_overwrite(long widget, boolean overwrite);
static private native int mledit_set_max_lines(long widget, int max_lines);
static private native int mledit_set_max_chars(long widget, int max_chars);
static private native int mledit_set_tips(long widget, String tips);
static private native int mledit_set_tr_tips(long widget, String tr_tips);
static private native int mledit_set_keyboard(long widget, String keyboard);
static private native int mledit_set_cursor(long widget, int cursor);
static private native int mledit_get_cursor(long widget);
static private native int mledit_set_scroll_line(long widget, int scroll_line);
static private native int mledit_scroll_to_offset(long widget, int offset);
static private native int mledit_set_open_im_when_focused(long widget, boolean open_im_when_focused);
static private native int mledit_set_close_im_when_blured(long widget, boolean close_im_when_blured);
static private native int mledit_set_select(long widget, int start, int end);
static private native String mledit_get_selected_text(long widget);
static private native int mledit_get_current_line_index(long widget);
static private native int mledit_get_current_row_index(long widget);
static private native int mledit_insert_text(long widget, int offset, String text);
static private native long mledit_cast(long widget);
static private native String mledit_t_get_prop_tips(long nativeObj);
static private native String mledit_t_get_prop_tr_tips(long nativeObj);
static private native String mledit_t_get_prop_keyboard(long nativeObj);
static private native int mledit_t_get_prop_max_lines(long nativeObj);
static private native int mledit_t_get_prop_max_chars(long nativeObj);
static private native int mledit_t_get_prop_scroll_line(long nativeObj);
static private native boolean mledit_t_get_prop_overwrite(long nativeObj);
static private native boolean mledit_t_get_prop_wrap_word(long nativeObj);
static private native boolean mledit_t_get_prop_readonly(long nativeObj);
static private native boolean mledit_t_get_prop_cancelable(long nativeObj);
static private native boolean mledit_t_get_prop_open_im_when_focused(long nativeObj);
static private native boolean mledit_t_get_prop_close_im_when_blured(long nativeObj);
};