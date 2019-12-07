package awtk;

public class Image extends ImageBase {
 public Image(long nativeObj) {
   super(nativeObj);
 }

 static public Image cast(long nativeObj) {
   return new Image(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new Image(image_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  Ret setDrawType(ImageDrawType draw_type)  {
   return Ret.from(image_set_draw_type(this.nativeObj, draw_type.value()));
 }

 public  static Widget cast(Widget widget)  {
   return new Image(image_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public ImageDrawType getDrawType() {
   return ImageDrawType.from(image_t_get_prop_draw_type(this.nativeObj));

 }

static private native long image_create(long parent, int x, int y, int w, int h);
static private native int image_set_draw_type(long widget, int draw_type);
static private native long image_cast(long widget);
static private native int image_t_get_prop_draw_type(long nativeObj);
}

