package awtk;

public class ScrollBar extends Widget {
 public ScrollBar(long nativeObj) {
   super(nativeObj);
 }

 static public ScrollBar cast(long nativeObj) {
   return new ScrollBar(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new ScrollBar(scroll_bar_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new ScrollBar(scroll_bar_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public  static Widget createMobile(Widget parent, int x, int y, int w, int h)  {
   return new ScrollBar(scroll_bar_create_mobile(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget createDesktop(Widget parent, int x, int y, int w, int h)  {
   return new ScrollBar(scroll_bar_create_desktop(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  Ret setParams(int virtual_size, int row)  {
   return Ret.from(scroll_bar_set_params(this.nativeObj, virtual_size, row));
 }

 public  Ret scrollTo(int value, int duration)  {
   return Ret.from(scroll_bar_scroll_to(this.nativeObj, value, duration));
 }

 public  Ret setValue(int value)  {
   return Ret.from(scroll_bar_set_value(this.nativeObj, value));
 }

 public  Ret addDelta(int delta)  {
   return Ret.from(scroll_bar_add_delta(this.nativeObj, delta));
 }

 public  Ret scrollDelta(int delta)  {
   return Ret.from(scroll_bar_scroll_delta(this.nativeObj, delta));
 }

 public  Ret setValueOnly(int value)  {
   return Ret.from(scroll_bar_set_value_only(this.nativeObj, value));
 }

 public  boolean isMobile()  {
   return scroll_bar_is_mobile(this.nativeObj);
 }

 public int getVirtualSize() {
   return scroll_bar_t_get_prop_virtual_size(this.nativeObj);
 }

 public int getRow() {
   return scroll_bar_t_get_prop_row(this.nativeObj);
 }

 public boolean getAnimatable() {
   return scroll_bar_t_get_prop_animatable(this.nativeObj);
 }

static private native long scroll_bar_create(long parent, int x, int y, int w, int h);
static private native long scroll_bar_cast(long widget);
static private native long scroll_bar_create_mobile(long parent, int x, int y, int w, int h);
static private native long scroll_bar_create_desktop(long parent, int x, int y, int w, int h);
static private native int scroll_bar_set_params(long widget, int virtual_size, int row);
static private native int scroll_bar_scroll_to(long widget, int value, int duration);
static private native int scroll_bar_set_value(long widget, int value);
static private native int scroll_bar_add_delta(long widget, int delta);
static private native int scroll_bar_scroll_delta(long widget, int delta);
static private native int scroll_bar_set_value_only(long widget, int value);
static private native boolean scroll_bar_is_mobile(long widget);
static private native int scroll_bar_t_get_prop_virtual_size(long nativeObj);
static private native int scroll_bar_t_get_prop_value(long nativeObj);
static private native int scroll_bar_t_get_prop_row(long nativeObj);
static private native boolean scroll_bar_t_get_prop_animatable(long nativeObj);
}

