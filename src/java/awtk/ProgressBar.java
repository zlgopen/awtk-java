package awtk;

public class ProgressBar extends Widget {
 public ProgressBar(long nativeObj) {
   super(nativeObj);
 }

 static public ProgressBar cast(long nativeObj) {
   return new ProgressBar(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new ProgressBar(progress_bar_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new ProgressBar(progress_bar_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public  Ret setValue(double value)  {
   return Ret.from(progress_bar_set_value(this.nativeObj, value));
 }

 public  Ret setMax(int max)  {
   return Ret.from(progress_bar_set_max(this.nativeObj, max));
 }

 public  Ret setVertical(boolean vertical)  {
   return Ret.from(progress_bar_set_vertical(this.nativeObj, vertical));
 }

 public  Ret setShowText(boolean show_text)  {
   return Ret.from(progress_bar_set_show_text(this.nativeObj, show_text));
 }

 public  int getPercent()  {
   return progress_bar_get_percent(this.nativeObj);
 }

 public double getMax() {
   return progress_bar_t_get_prop_max(this.nativeObj);
 }

 public boolean getVertical() {
   return progress_bar_t_get_prop_vertical(this.nativeObj);
 }

 public boolean getShowText() {
   return progress_bar_t_get_prop_show_text(this.nativeObj);
 }

static private native long progress_bar_create(long parent, int x, int y, int w, int h);
static private native long progress_bar_cast(long widget);
static private native int progress_bar_set_value(long widget, double value);
static private native int progress_bar_set_max(long widget, int max);
static private native int progress_bar_set_vertical(long widget, boolean vertical);
static private native int progress_bar_set_show_text(long widget, boolean show_text);
static private native int progress_bar_get_percent(long widget);
static private native double progress_bar_t_get_prop_value(long nativeObj);
static private native double progress_bar_t_get_prop_max(long nativeObj);
static private native boolean progress_bar_t_get_prop_vertical(long nativeObj);
static private native boolean progress_bar_t_get_prop_show_text(long nativeObj);
}

