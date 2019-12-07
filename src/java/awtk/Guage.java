package awtk;

public class Guage extends Widget {
 public Guage(long nativeObj) {
   super(nativeObj);
 }

 static public Guage cast(long nativeObj) {
   return new Guage(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new Guage(guage_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new Guage(guage_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public  Ret setImage(String name)  {
   return Ret.from(guage_set_image(this.nativeObj, name));
 }

 public  Ret setDrawType(ImageDrawType draw_type)  {
   return Ret.from(guage_set_draw_type(this.nativeObj, draw_type.value()));
 }

 public String getImage() {
   return guage_t_get_prop_image(this.nativeObj);
 }

 public ImageDrawType getDrawType() {
   return ImageDrawType.from(guage_t_get_prop_draw_type(this.nativeObj));

 }

static private native long guage_create(long parent, int x, int y, int w, int h);
static private native long guage_cast(long widget);
static private native int guage_set_image(long widget, String name);
static private native int guage_set_draw_type(long widget, int draw_type);
static private native String guage_t_get_prop_image(long nativeObj);
static private native int guage_t_get_prop_draw_type(long nativeObj);
}

