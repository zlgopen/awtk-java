package awtk;

public class Mledit extends Widget {
 public Mledit(long nativeObj) {
   super(nativeObj);
 }

 static public Mledit cast(long nativeObj) {
   return new Mledit(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new Mledit(mledit_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  Ret setReadonly(boolean readonly)  {
   return Ret.from(mledit_set_readonly(this.nativeObj, readonly));
 }

 public  Ret setFocus(boolean focus)  {
   return Ret.from(mledit_set_focus(this.nativeObj, focus));
 }

 public  Ret setWrapWord(boolean wrap_word)  {
   return Ret.from(mledit_set_wrap_word(this.nativeObj, wrap_word));
 }

 public  Ret setMaxLines(int max_lines)  {
   return Ret.from(mledit_set_max_lines(this.nativeObj, max_lines));
 }

 public  Ret setInputTips(String tips)  {
   return Ret.from(mledit_set_input_tips(this.nativeObj, tips));
 }

 public  Ret setCursor(int cursor)  {
   return Ret.from(mledit_set_cursor(this.nativeObj, cursor));
 }

 public  Ret setScrollLine(int scroll_line)  {
   return Ret.from(mledit_set_scroll_line(this.nativeObj, scroll_line));
 }

 public  static Widget cast(Widget widget)  {
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

