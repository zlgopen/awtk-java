package awtk;


/**
 * 多行编辑器控件。 mledit\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于mledit\_t控件。 在xml中使用"mledit"标签创建多行编辑器控件。如： ```xml <mledit x="c" y="m" w="300" h="300" /> ``` 更多用法请参考：[mledit.xml]( https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/mledit.xml) 在c代码中使用函数mledit\_create创建多行编辑器控件。如： ```c widget_t* tc = mledit_create(win, 10, 10, 240, 240); ``` 完整示例请参考：[mledit demo]( https://github.com/zlgopen/awtk-c-demos/blob/master/demos/mledit.c) time\_clock一般不需要设置style。
 *
 */
public class Mledit extends Widget {
 public long nativeObj;

 public Mledit(long nativeObj) {
   super(nativeObj);
 }

 static public Mledit cast(long nativeObj) {
   return new Mledit(nativeObj);
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
 * @returns 对象。
 */
 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new Mledit(mledit_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 设置编辑器是否为只读。
 * 
 * @param widget widget对象。
 * @param readonly 只读。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setReadonly(boolean readonly)  {
   return Ret.from(mledit_set_readonly(this != null ? (this.nativeObj) : 0, readonly));
 }


/**
 * 设置为焦点。
 * 
 * @param widget widget对象。
 * @param focus 是否为焦点。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setFocus(boolean focus)  {
   return Ret.from(mledit_set_focus(this != null ? (this.nativeObj) : 0, focus));
 }


/**
 * 设置编辑器是否自动折行。
 * 
 * @param widget widget对象。
 * @param wrap_word 是否自动折行。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setWrapWord(boolean wrap_word)  {
   return Ret.from(mledit_set_wrap_word(this != null ? (this.nativeObj) : 0, wrap_word));
 }


/**
 * 设置编辑器的最大行数。
 * 
 * @param widget widget对象。
 * @param max_lines 最大行数。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setMaxLines(int max_lines)  {
   return Ret.from(mledit_set_max_lines(this != null ? (this.nativeObj) : 0, max_lines));
 }


/**
 * 设置编辑器的输入提示。
 * 
 * @param widget widget对象。
 * @param tips 输入提示。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setInputTips(String tips)  {
   return Ret.from(mledit_set_input_tips(this != null ? (this.nativeObj) : 0, tips));
 }


/**
 * 设置编辑器光标位置。
 * 
 * @param widget widget对象。
 * @param cursor 光标位置。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setCursor(int cursor)  {
   return Ret.from(mledit_set_cursor(this != null ? (this.nativeObj) : 0, cursor));
 }


/**
 * 设置编辑器滚动速度。
 * 
 * @param widget widget对象。
 * @param scroll_line 滚动行数。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setScrollLine(int scroll_line)  {
   return Ret.from(mledit_set_scroll_line(this != null ? (this.nativeObj) : 0, scroll_line));
 }


/**
 * 转换为mledit对象(供脚本语言使用)。
 * 
 * @param widget mledit对象。
 *
 * @returns mledit对象。
 */
 public  static Mledit cast(Widget widget)  {
   return new Mledit(mledit_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public boolean getReadonly() {
   return mledit_t_get_prop_readonly(this.nativeObj);
 }

 public String getTips() {
   return mledit_t_get_prop_tips(this.nativeObj);
 }

 public boolean getWrapWord() {
   return mledit_t_get_prop_wrap_word(this.nativeObj);
 }

 public int getMaxLines() {
   return mledit_t_get_prop_max_lines(this.nativeObj);
 }

 public double getScrollLine() {
   return mledit_t_get_prop_scroll_line(this.nativeObj);
 }

static private native long mledit_create(long parent, int x, int y, int w, int h);
static private native int mledit_set_readonly(long widget, boolean readonly);
static private native int mledit_set_focus(long widget, boolean focus);
static private native int mledit_set_wrap_word(long widget, boolean wrap_word);
static private native int mledit_set_max_lines(long widget, int max_lines);
static private native int mledit_set_input_tips(long widget, String tips);
static private native int mledit_set_cursor(long widget, int cursor);
static private native int mledit_set_scroll_line(long widget, int scroll_line);
static private native long mledit_cast(long widget);
static private native boolean mledit_t_get_prop_readonly(long nativeObj);
static private native String mledit_t_get_prop_tips(long nativeObj);
static private native boolean mledit_t_get_prop_wrap_word(long nativeObj);
static private native int mledit_t_get_prop_max_lines(long nativeObj);
static private native double mledit_t_get_prop_scroll_line(long nativeObj);
}

