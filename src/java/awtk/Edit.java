package awtk;


/**
 * 单行编辑器控件。
 * 
 *  在基于SDL的平台，单行编辑器控件使用平台原生的输入法，对于嵌入式平台使用内置的输入法。
 * 
 *  在使用内置的输入法时，软键盘由输入类型决定，开发者可以自定义软键盘的界面。
 * 
 *  edit\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于edit\_t控件。
 * 
 *  edit\_t本身可以做为容器，放入按钮等控件。有几个特殊的子控件：
 * 
 *  * 名为"clear"的按钮。点击时清除编辑器中的内容。
 *  * 名为"inc"的按钮。点击时增加编辑器的值，用于实现类似于spinbox的功能。
 *  * 名为"dec"的按钮。点击时减少编辑器的值，用于实现类似于spinbox的功能。
 *  * 名为"visible"的复选框。勾选时显示密码，反之不显示密码。
 * 
 * 在xml中使用"edit"标签创建编辑器控件。如：
 * 
 *  ```xml
 *  <edit x="c" y="m" w="80" h="30"
 *    tips="age" input_type="uint" min="0" max="150" step="1" auto_fix="true" style="number" />
 *  ```
 * 
 * XXX：需要在min/max/step之前设置input\_type。
 * 
 *更多用法请参考：
 *  [edit.xml](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/edit.xml)
 * 
 *  在c代码中使用函数edit\_create创建编辑器控件。如：
 * 
 *  ```c
 *   widget_t* edit = edit_create(win, 10, 10, 128, 30);
 *   widget_set_text(edit, L"OK");
 *  ```
 * 
 * 创建之后，可以用widget\_set\_text或widget\_set\_text\_utf8设置文本内容。
 * 
 * 完整示例请参考：
 *  [edit demo](https://github.com/zlgopen/awtk-c-demos/blob/master/demos/edit.c)
 * 
 *  可用通过style来设置控件的显示风格，如字体的大小和颜色等等。如：
 * 
 *  ```xml
 *  <style name="default" border_color="#a0a0a0"  text_color="black" text_align_h="left">
 *    <normal     bg_color="#f0f0f0" />
 *    <focused    bg_color="#f0f0f0" border_color="black"/>
 *    <disable    bg_color="gray" text_color="#d0d0d0" />
 *    <error      bg_color="#f0f0f0" text_color="red" />
 *    <empty      bg_color="#f0f0f0" text_color="#a0a0a0" />
 *  </style>
 *  ```
 * 
 * 更多用法请参考：
 *  [theme
 * default](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/styles/default.xml#L104)
 *
 */
public class Edit extends Widget {
 public long nativeObj;

 public Edit(long nativeObj) {
   super(nativeObj);
 }

 static public Edit cast(long nativeObj) {
   return new Edit(nativeObj);
 }


/**
 * 创建edit对象
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
   return new Edit(edit_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换为edit对象(供脚本语言使用)。
 * 
 * @param widget edit对象。
 *
 * @returns edit对象。
 */
 public  static Edit cast(Widget widget)  {
   return new Edit(edit_cast(widget != null ? (widget.nativeObj) : 0));
 }


/**
 * 获取int类型的值。
 * 
 * @param widget widget对象。
 *
 * @returns 返回int的值。
 */
 public  int getInt()  {
   return edit_get_int(this != null ? (this.nativeObj) : 0);
 }


/**
 * 获取double类型的值。
 * 
 * @param widget widget对象。
 *
 * @returns 返回double的值。
 */
 public  double getDouble()  {
   return edit_get_double(this != null ? (this.nativeObj) : 0);
 }


/**
 * 设置int类型的值。
 * 
 * @param widget widget对象。
 * @param value 值。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setInt(int value)  {
   return Ret.from(edit_set_int(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 设置double类型的值。
 * 
 * @param widget widget对象。
 * @param value 值。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setDouble(double value)  {
   return Ret.from(edit_set_double(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 设置为文本输入及其长度限制，不允许输入超过max个字符，少于min个字符时进入error状态。
 * 
 * @param widget widget对象。
 * @param min 最小长度。
 * @param max 最大长度。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setTextLimit(int min, int max)  {
   return Ret.from(edit_set_text_limit(this != null ? (this.nativeObj) : 0, min, max));
 }


/**
 * 设置为整数输入及取值范围。
 * 
 * @param widget widget对象。
 * @param min 最小值。
 * @param max 最大值。
 * @param step 步长。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setIntLimit(int min, int max, int step)  {
   return Ret.from(edit_set_int_limit(this != null ? (this.nativeObj) : 0, min, max, step));
 }


/**
 * 设置为浮点数输入及取值范围。
 * 
 * @param widget widget对象。
 * @param min 最小值。
 * @param max 最大值。
 * @param step 步长。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setFloatLimit(double min, double max, double step)  {
   return Ret.from(edit_set_float_limit(this != null ? (this.nativeObj) : 0, min, max, step));
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
   return Ret.from(edit_set_readonly(this != null ? (this.nativeObj) : 0, readonly));
 }


/**
 * 设置编辑器是否为自动改正。
 * 
 * @param widget widget对象。
 * @param auto_fix 自动改正。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setAutoFix(boolean auto_fix)  {
   return Ret.from(edit_set_auto_fix(this != null ? (this.nativeObj) : 0, auto_fix));
 }


/**
 * 设置编辑器是否在获得焦点时不选中文本。
 * 
 * @param widget widget对象。
 * @param select_none_when_focused 是否在获得焦点时不选中文本。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setSelectNoneWhenFocused(boolean select_none_when_focused)  {
   return Ret.from(edit_set_select_none_when_focused(this != null ? (this.nativeObj) : 0, select_none_when_focused));
 }


/**
 * 设置编辑器是否在获得焦点时打开输入法。
 * 
 * @param widget widget对象。
 * @param open_im_when_focused 是否在获得焦点时打开输入法。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setOpenImWhenFocused(boolean open_im_when_focused)  {
   return Ret.from(edit_set_open_im_when_focused(this != null ? (this.nativeObj) : 0, open_im_when_focused));
 }


/**
 * 设置编辑器的输入类型。
 * 
 * @param widget widget对象。
 * @param type 输入类型。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setInputType(InputType type)  {
   return Ret.from(edit_set_input_type(this != null ? (this.nativeObj) : 0, type.value()));
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
   return Ret.from(edit_set_input_tips(this != null ? (this.nativeObj) : 0, tips));
 }


/**
 * 当编辑器输入类型为密码时，设置密码是否可见。
 * 
 * @param widget widget对象。
 * @param password_visible 密码是否可见。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setPasswordVisible(boolean password_visible)  {
   return Ret.from(edit_set_password_visible(this != null ? (this.nativeObj) : 0, password_visible));
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
   return Ret.from(edit_set_focus(this != null ? (this.nativeObj) : 0, focus));
 }


/**
 * 设置输入框的光标坐标。
 * 
 * @param widget widget对象。
 * @param cursor 是否为焦点。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setCursor(int cursor)  {
   return Ret.from(edit_set_cursor(this != null ? (this.nativeObj) : 0, cursor));
 }

 public boolean getReadonly() {
   return edit_t_get_prop_readonly(this.nativeObj);
 }

 public boolean getPasswordVisible() {
   return edit_t_get_prop_password_visible(this.nativeObj);
 }

 public boolean getAutoFix() {
   return edit_t_get_prop_auto_fix(this.nativeObj);
 }

 public boolean getSelectNoneWhenFocused() {
   return edit_t_get_prop_select_none_when_focused(this.nativeObj);
 }

 public boolean getOpenImWhenFocused() {
   return edit_t_get_prop_open_im_when_focused(this.nativeObj);
 }

 public String getTips() {
   return edit_t_get_prop_tips(this.nativeObj);
 }

 public InputType getInputType() {
   return InputType.from(edit_t_get_prop_input_type(this.nativeObj));

 }

 public double getMin() {
   return edit_t_get_prop_min(this.nativeObj);
 }

 public double getMax() {
   return edit_t_get_prop_max(this.nativeObj);
 }

 public double getStep() {
   return edit_t_get_prop_step(this.nativeObj);
 }

static private native long edit_create(long parent, int x, int y, int w, int h);
static private native long edit_cast(long widget);
static private native int edit_get_int(long widget);
static private native double edit_get_double(long widget);
static private native int edit_set_int(long widget, int value);
static private native int edit_set_double(long widget, double value);
static private native int edit_set_text_limit(long widget, int min, int max);
static private native int edit_set_int_limit(long widget, int min, int max, int step);
static private native int edit_set_float_limit(long widget, double min, double max, double step);
static private native int edit_set_readonly(long widget, boolean readonly);
static private native int edit_set_auto_fix(long widget, boolean auto_fix);
static private native int edit_set_select_none_when_focused(long widget, boolean select_none_when_focused);
static private native int edit_set_open_im_when_focused(long widget, boolean open_im_when_focused);
static private native int edit_set_input_type(long widget, int type);
static private native int edit_set_input_tips(long widget, String tips);
static private native int edit_set_password_visible(long widget, boolean password_visible);
static private native int edit_set_focus(long widget, boolean focus);
static private native int edit_set_cursor(long widget, int cursor);
static private native boolean edit_t_get_prop_readonly(long nativeObj);
static private native boolean edit_t_get_prop_password_visible(long nativeObj);
static private native boolean edit_t_get_prop_auto_fix(long nativeObj);
static private native boolean edit_t_get_prop_select_none_when_focused(long nativeObj);
static private native boolean edit_t_get_prop_open_im_when_focused(long nativeObj);
static private native String edit_t_get_prop_tips(long nativeObj);
static private native int edit_t_get_prop_input_type(long nativeObj);
static private native double edit_t_get_prop_min(long nativeObj);
static private native double edit_t_get_prop_max(long nativeObj);
static private native double edit_t_get_prop_step(long nativeObj);
}

