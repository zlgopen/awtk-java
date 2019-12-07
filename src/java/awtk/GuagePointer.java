package awtk;

public class GuagePointer extends Widget {
 public GuagePointer(long nativeObj) {
   super(nativeObj);
 }

 static public GuagePointer cast(long nativeObj) {
   return new GuagePointer(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new GuagePointer(guage_pointer_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new GuagePointer(guage_pointer_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public  Ret setAngle(int angle)  {
   return Ret.from(guage_pointer_set_angle(this.nativeObj, angle));
 }

 public  Ret setImage(String image)  {
   return Ret.from(guage_pointer_set_image(this.nativeObj, image));
 }

 public  Ret setAnchor(String anchor_x, String anchor_y)  {
   return Ret.from(guage_pointer_set_anchor(this.nativeObj, anchor_x, anchor_y));
 }

 public int getAngle() {
   return guage_pointer_t_get_prop_angle(this.nativeObj);
 }

 public String getImage() {
   return guage_pointer_t_get_prop_image(this.nativeObj);
 }

 public double getAnchorX() {
   return guage_pointer_t_get_prop_anchor_x(this.nativeObj);
 }

 public double getAnchorY() {
   return guage_pointer_t_get_prop_anchor_y(this.nativeObj);
 }

static private native long guage_pointer_create(long parent, int x, int y, int w, int h);
static private native long guage_pointer_cast(long widget);
static private native int guage_pointer_set_angle(long widget, int angle);
static private native int guage_pointer_set_image(long widget, String image);
static private native int guage_pointer_set_anchor(long widget, String anchor_x, String anchor_y);
static private native int guage_pointer_t_get_prop_angle(long nativeObj);
static private native String guage_pointer_t_get_prop_image(long nativeObj);
static private native double guage_pointer_t_get_prop_anchor_x(long nativeObj);
static private native double guage_pointer_t_get_prop_anchor_y(long nativeObj);
}

