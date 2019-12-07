package awtk;

public class Edit extends Widget {
 public Edit(long nativeObj) {
   super(nativeObj);
 }

 static public Edit cast(long nativeObj) {
   return new Edit(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new Edit(edit_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new Edit(edit_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public  int getInt()  {
   return edit_get_int(this.nativeObj);
 }

 public  double getDouble()  {
   return edit_get_double(this.nativeObj);
 }

 public  Ret setInt(int value)  {
   return Ret.from(edit_set_int(this.nativeObj, value));
 }

 public  Ret setDouble(double value)  {
   return Ret.from(edit_set_double(this.nativeObj, value));
 }

 public  Ret setTextLimit(int min, int max)  {
   return Ret.from(edit_set_text_limit(this.nativeObj, min, max));
 }

 public  Ret setIntLimit(int min, int max, int step)  {
   return Ret.from(edit_set_int_limit(this.nativeObj, min, max, step));
 }

 public  Ret setFloatLimit(double min, double max, double step)  {
   return Ret.from(edit_set_float_limit(this.nativeObj, min, max, step));
 }

 public  Ret setReadonly(boolean readonly)  {
   return Ret.from(edit_set_readonly(this.nativeObj, readonly));
 }

 public  Ret setAutoFix(boolean auto_fix)  {
   return Ret.from(edit_set_auto_fix(this.nativeObj, auto_fix));
 }

 public  Ret setSelectNoneWhenFocused(boolean select_none_when_focused)  {
   return Ret.from(edit_set_select_none_when_focused(this.nativeObj, select_none_when_focused));
 }

 public  Ret setOpenImWhenFocused(boolean open_im_when_focused)  {
   return Ret.from(edit_set_open_im_when_focused(this.nativeObj, open_im_when_focused));
 }

 public  Ret setInputType(InputType type)  {
   return Ret.from(edit_set_input_type(this.nativeObj, type.value()));
 }

 public  Ret setInputTips(String tips)  {
   return Ret.from(edit_set_input_tips(this.nativeObj, tips));
 }

 public  Ret setPasswordVisible(boolean password_visible)  {
   return Ret.from(edit_set_password_visible(this.nativeObj, password_visible));
 }

 public  Ret setFocus(boolean focus)  {
   return Ret.from(edit_set_focus(this.nativeObj, focus));
 }

 public  Ret setCursor(int cursor)  {
   return Ret.from(edit_set_cursor(this.nativeObj, cursor));
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

