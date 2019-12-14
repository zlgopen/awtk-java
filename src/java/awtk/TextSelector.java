package awtk;


/**
 * 文本选择器控件，通常用于选择日期和时间等。
 * 
 * XXX: 目前需要先设置options和visible_nr，再设置其它参数(在XML中也需要按此顺序)。
 * 
 *  text\_selector\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于text\_selector\_t控件。
 * 
 *  在xml中使用"text\_selector"标签创建文本选择器控件。如：
 * 
 *  ```xml
 *  <text_selector options="red;green;blue;gold;orange" visible_nr="3" text="red"/>
 *  ```
 * 
 * 更多用法请参考：[text\_selector.xml](
 *  https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/text_selector.xml)
 * 
 *  在c代码中使用函数text\_selector\_create创建文本选择器控件。如：
 * 
 *  ```c
 *  widget_t* ts = text_selector_create(win, 10, 10, 80, 150);
 *  text_selector_set_options(ts, "1:red;2:green;3:blue;4:orange;5:gold");
 *  text_selector_set_value(ts, 1);
 *  widget_use_style(ts, "dark");
 *  ```
 * 
 * 完整示例请参考：[text\_selector demo](
 *  https://github.com/zlgopen/awtk-c-demos/blob/master/demos/text_selector.c)
 * 
 *  可用通过style来设置控件的显示风格，如字体和背景颜色等。如：
 * 
 *  ```xml
 *  <style name="dark" fg_color="#a0a0a0"  text_color="black" text_align_h="center">
 *    <normal     bg_color="#ffffff" mask_color="#404040" border_color="#404040"/>
 *  </style>
 *  ```
 * 
 * 更多用法请参考：[theme default](
 *  https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/styles/default.xml#L443)
 *
 */
public class TextSelector extends Widget {
 public long nativeObj;

 public TextSelector(long nativeObj) {
   super(nativeObj);
 }

 static public TextSelector cast(long nativeObj) {
   return new TextSelector(nativeObj);
 }


/**
 * 创建text_selector对象
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
   return new TextSelector(text_selector_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换text_selector对象(供脚本语言使用)。
 * 
 * @param widget text_selector对象。
 *
 * @returns text_selector对象。
 */
 public  static TextSelector cast(Widget widget)  {
   return new TextSelector(text_selector_cast(widget != null ? (widget.nativeObj) : 0));
 }


/**
 * 重置所有选项。
 * 
 * @param widget text_selector对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret resetOptions()  {
   return Ret.from(text_selector_reset_options(this != null ? (this.nativeObj) : 0));
 }


/**
 * 获取选项个数。
 * 
 * @param widget text_selector对象。
 *
 * @returns 返回选项个数。
 */
 public  int countOptions()  {
   return text_selector_count_options(this != null ? (this.nativeObj) : 0);
 }


/**
 * 追加一个选项。
 * 
 * @param widget text_selector对象。
 * @param value 值。
 * @param text 文本。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret appendOption(int value, String text)  {
   return Ret.from(text_selector_append_option(this != null ? (this.nativeObj) : 0, value, text));
 }


/**
 * 设置选项。
 * 
 * @param widget text_selector对象。
 * @param options 选项。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setOptions(String options)  {
   return Ret.from(text_selector_set_options(this != null ? (this.nativeObj) : 0, options));
 }


/**
 * 设置一系列的整数选项。
 * 
 * @param widget text_selector对象。
 * @param start 起始值。
 * @param nr 个数。
 * @param step 步长。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setRangeOptions(int start, int nr, int step)  {
   return Ret.from(text_selector_set_range_options(this != null ? (this.nativeObj) : 0, start, nr, step));
 }


/**
 * 获取text_selector的值。
 * 
 * @param widget text_selector对象。
 *
 * @returns 返回值。
 */
 public  int getValue()  {
   return text_selector_get_value(this != null ? (this.nativeObj) : 0);
 }


/**
 * 设置text_selector的值。
 * 
 * @param widget text_selector对象。
 * @param value 值。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setValue(int value)  {
   return Ret.from(text_selector_set_value(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 获取text_selector的文本。
 * 
 * @param widget text_selector对象。
 *
 * @returns 返回文本。
 */
 public  String getTextValue()  {
   return text_selector_get_text(this != null ? (this.nativeObj) : 0);
 }


/**
 * 设置text_selector的文本。
 * 
 * @param widget text_selector对象。
 * @param text 文本。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setText(String text)  {
   return Ret.from(text_selector_set_text(this != null ? (this.nativeObj) : 0, text));
 }


/**
 * 设置第index个选项为当前选中的选项。
 * 
 * @param widget text_selector对象。
 * @param index 选项的索引。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setSelectedIndex(int index)  {
   return Ret.from(text_selector_set_selected_index(this != null ? (this.nativeObj) : 0, index));
 }


/**
 * 设置可见的选项数。
 * 
 * @param widget text_selector对象。
 * @param visible_nr 选项数。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setVisibleNr(int visible_nr)  {
   return Ret.from(text_selector_set_visible_nr(this != null ? (this.nativeObj) : 0, visible_nr));
 }

 public int getVisibleNr() {
   return text_selector_t_get_prop_visible_nr(this.nativeObj);
 }

 public int getSelectedIndex() {
   return text_selector_t_get_prop_selected_index(this.nativeObj);
 }

 public String getOptions() {
   return text_selector_t_get_prop_options(this.nativeObj);
 }

static private native long text_selector_create(long parent, int x, int y, int w, int h);
static private native long text_selector_cast(long widget);
static private native int text_selector_reset_options(long widget);
static private native int text_selector_count_options(long widget);
static private native int text_selector_append_option(long widget, int value, String text);
static private native int text_selector_set_options(long widget, String options);
static private native int text_selector_set_range_options(long widget, int start, int nr, int step);
static private native int text_selector_get_value(long widget);
static private native int text_selector_set_value(long widget, int value);
static private native String text_selector_get_text(long widget);
static private native int text_selector_set_text(long widget, String text);
static private native int text_selector_set_selected_index(long widget, int index);
static private native int text_selector_set_visible_nr(long widget, int visible_nr);
static private native int text_selector_t_get_prop_visible_nr(long nativeObj);
static private native int text_selector_t_get_prop_selected_index(long nativeObj);
static private native String text_selector_t_get_prop_options(long nativeObj);
}

