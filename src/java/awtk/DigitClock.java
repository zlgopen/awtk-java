package awtk;

public class DigitClock extends Widget {
 public DigitClock(long nativeObj) {
   super(nativeObj);
 }

 static public DigitClock cast(long nativeObj) {
   return new DigitClock(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new DigitClock(digit_clock_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new DigitClock(digit_clock_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public  Ret setFormat(String format)  {
   return Ret.from(digit_clock_set_format(this.nativeObj, format));
 }

 public String getFormat() {
   return digit_clock_t_get_prop_format(this.nativeObj);
 }

static private native long digit_clock_create(long parent, int x, int y, int w, int h);
static private native long digit_clock_cast(long widget);
static private native int digit_clock_set_format(long widget, String format);
static private native String digit_clock_t_get_prop_format(long nativeObj);
}

