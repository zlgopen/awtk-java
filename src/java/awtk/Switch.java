package awtk;

public class Switch extends Widget {
 public Switch(long nativeObj) {
   super(nativeObj);
 }

 static public Switch cast(long nativeObj) {
   return new Switch(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new Switch(switch_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  Ret setValue(boolean value)  {
   return Ret.from(switch_set_value(this.nativeObj, value));
 }

 public  static Widget cast(Widget widget)  {
   return new Switch(switch_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public double getMaxXoffsetRatio() {
   return switch_t_get_prop_max_xoffset_ratio(this.nativeObj);
 }

static private native long switch_create(long parent, int x, int y, int w, int h);
static private native int switch_set_value(long widget, boolean value);
static private native long switch_cast(long widget);
static private native boolean switch_t_get_prop_value(long nativeObj);
static private native double switch_t_get_prop_max_xoffset_ratio(long nativeObj);
}

