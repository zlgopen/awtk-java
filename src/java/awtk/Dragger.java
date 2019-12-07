package awtk;

public class Dragger extends Widget {
 public Dragger(long nativeObj) {
   super(nativeObj);
 }

 static public Dragger cast(long nativeObj) {
   return new Dragger(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new Dragger(dragger_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new Dragger(dragger_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public  Widget setRange(int x_min, int y_min, int x_max, int y_max)  {
   return new Widget(dragger_set_range(this.nativeObj, x_min, y_min, x_max, y_max));
 }

 public int getXMin() {
   return dragger_t_get_prop_x_min(this.nativeObj);
 }

 public int getYMin() {
   return dragger_t_get_prop_y_min(this.nativeObj);
 }

 public int getXMax() {
   return dragger_t_get_prop_x_max(this.nativeObj);
 }

 public int getYMax() {
   return dragger_t_get_prop_y_max(this.nativeObj);
 }

static private native long dragger_create(long parent, int x, int y, int w, int h);
static private native long dragger_cast(long widget);
static private native long dragger_set_range(long widget, int x_min, int y_min, int x_max, int y_max);
static private native int dragger_t_get_prop_x_min(long nativeObj);
static private native int dragger_t_get_prop_y_min(long nativeObj);
static private native int dragger_t_get_prop_x_max(long nativeObj);
static private native int dragger_t_get_prop_y_max(long nativeObj);
}

