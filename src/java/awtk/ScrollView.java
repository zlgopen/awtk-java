package awtk;

public class ScrollView extends Widget {
 public ScrollView(long nativeObj) {
   super(nativeObj);
 }

 static public ScrollView cast(long nativeObj) {
   return new ScrollView(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new ScrollView(scroll_view_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new ScrollView(scroll_view_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public  Ret setVirtualW(int w)  {
   return Ret.from(scroll_view_set_virtual_w(this.nativeObj, w));
 }

 public  Ret setVirtualH(int h)  {
   return Ret.from(scroll_view_set_virtual_h(this.nativeObj, h));
 }

 public  Ret setXslidable(boolean xslidable)  {
   return Ret.from(scroll_view_set_xslidable(this.nativeObj, xslidable));
 }

 public  Ret setYslidable(boolean yslidable)  {
   return Ret.from(scroll_view_set_yslidable(this.nativeObj, yslidable));
 }

 public  Ret setOffset(int xoffset, int yoffset)  {
   return Ret.from(scroll_view_set_offset(this.nativeObj, xoffset, yoffset));
 }

 public  Ret setSpeedScale(double xspeed_scale, double yspeed_scale)  {
   return Ret.from(scroll_view_set_speed_scale(this.nativeObj, xspeed_scale, yspeed_scale));
 }

 public  Ret scrollTo(int xoffset_end, int yoffset_end, int duration)  {
   return Ret.from(scroll_view_scroll_to(this.nativeObj, xoffset_end, yoffset_end, duration));
 }

 public  Ret scrollDeltaTo(int xoffset_delta, int yoffset_delta, int duration)  {
   return Ret.from(scroll_view_scroll_delta_to(this.nativeObj, xoffset_delta, yoffset_delta, duration));
 }

 public int getVirtualW() {
   return scroll_view_t_get_prop_virtual_w(this.nativeObj);
 }

 public int getVirtualH() {
   return scroll_view_t_get_prop_virtual_h(this.nativeObj);
 }

 public int getXoffset() {
   return scroll_view_t_get_prop_xoffset(this.nativeObj);
 }

 public int getYoffset() {
   return scroll_view_t_get_prop_yoffset(this.nativeObj);
 }

 public double getXspeedScale() {
   return scroll_view_t_get_prop_xspeed_scale(this.nativeObj);
 }

 public double getYspeedScale() {
   return scroll_view_t_get_prop_yspeed_scale(this.nativeObj);
 }

 public boolean getXslidable() {
   return scroll_view_t_get_prop_xslidable(this.nativeObj);
 }

 public boolean getYslidable() {
   return scroll_view_t_get_prop_yslidable(this.nativeObj);
 }

static private native long scroll_view_create(long parent, int x, int y, int w, int h);
static private native long scroll_view_cast(long widget);
static private native int scroll_view_set_virtual_w(long widget, int w);
static private native int scroll_view_set_virtual_h(long widget, int h);
static private native int scroll_view_set_xslidable(long widget, boolean xslidable);
static private native int scroll_view_set_yslidable(long widget, boolean yslidable);
static private native int scroll_view_set_offset(long widget, int xoffset, int yoffset);
static private native int scroll_view_set_speed_scale(long widget, double xspeed_scale, double yspeed_scale);
static private native int scroll_view_scroll_to(long widget, int xoffset_end, int yoffset_end, int duration);
static private native int scroll_view_scroll_delta_to(long widget, int xoffset_delta, int yoffset_delta, int duration);
static private native int scroll_view_t_get_prop_virtual_w(long nativeObj);
static private native int scroll_view_t_get_prop_virtual_h(long nativeObj);
static private native int scroll_view_t_get_prop_xoffset(long nativeObj);
static private native int scroll_view_t_get_prop_yoffset(long nativeObj);
static private native double scroll_view_t_get_prop_xspeed_scale(long nativeObj);
static private native double scroll_view_t_get_prop_yspeed_scale(long nativeObj);
static private native boolean scroll_view_t_get_prop_xslidable(long nativeObj);
static private native boolean scroll_view_t_get_prop_yslidable(long nativeObj);
}

