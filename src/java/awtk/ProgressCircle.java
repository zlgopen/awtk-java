package awtk;

public class ProgressCircle extends Widget {
 public ProgressCircle(long nativeObj) {
   super(nativeObj);
 }

 static public ProgressCircle cast(long nativeObj) {
   return new ProgressCircle(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new ProgressCircle(progress_circle_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new ProgressCircle(progress_circle_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public  Ret setValue(double value)  {
   return Ret.from(progress_circle_set_value(this.nativeObj, value));
 }

 public  Ret setMax(int max)  {
   return Ret.from(progress_circle_set_max(this.nativeObj, max));
 }

 public  Ret setLineWidth(int line_width)  {
   return Ret.from(progress_circle_set_line_width(this.nativeObj, line_width));
 }

 public  Ret setStartAngle(int start_angle)  {
   return Ret.from(progress_circle_set_start_angle(this.nativeObj, start_angle));
 }

 public  Ret setUnit(String unit)  {
   return Ret.from(progress_circle_set_unit(this.nativeObj, unit));
 }

 public  Ret setShowText(boolean show_text)  {
   return Ret.from(progress_circle_set_show_text(this.nativeObj, show_text));
 }

 public  Ret setCounterClockWise(boolean counter_clock_wise)  {
   return Ret.from(progress_circle_set_counter_clock_wise(this.nativeObj, counter_clock_wise));
 }

 public int getMax() {
   return progress_circle_t_get_prop_max(this.nativeObj);
 }

 public int getStartAngle() {
   return progress_circle_t_get_prop_start_angle(this.nativeObj);
 }

 public int getLineWidth() {
   return progress_circle_t_get_prop_line_width(this.nativeObj);
 }

 public String getUnit() {
   return progress_circle_t_get_prop_unit(this.nativeObj);
 }

 public boolean getCounterClockWise() {
   return progress_circle_t_get_prop_counter_clock_wise(this.nativeObj);
 }

 public boolean getShowText() {
   return progress_circle_t_get_prop_show_text(this.nativeObj);
 }

static private native long progress_circle_create(long parent, int x, int y, int w, int h);
static private native long progress_circle_cast(long widget);
static private native int progress_circle_set_value(long widget, double value);
static private native int progress_circle_set_max(long widget, int max);
static private native int progress_circle_set_line_width(long widget, int line_width);
static private native int progress_circle_set_start_angle(long widget, int start_angle);
static private native int progress_circle_set_unit(long widget, String unit);
static private native int progress_circle_set_show_text(long widget, boolean show_text);
static private native int progress_circle_set_counter_clock_wise(long widget, boolean counter_clock_wise);
static private native double progress_circle_t_get_prop_value(long nativeObj);
static private native int progress_circle_t_get_prop_max(long nativeObj);
static private native int progress_circle_t_get_prop_start_angle(long nativeObj);
static private native int progress_circle_t_get_prop_line_width(long nativeObj);
static private native String progress_circle_t_get_prop_unit(long nativeObj);
static private native boolean progress_circle_t_get_prop_counter_clock_wise(long nativeObj);
static private native boolean progress_circle_t_get_prop_show_text(long nativeObj);
}

