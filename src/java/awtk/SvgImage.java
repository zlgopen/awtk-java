package awtk;

public class SvgImage extends ImageBase {
 public SvgImage(long nativeObj) {
   super(nativeObj);
 }

 static public SvgImage cast(long nativeObj) {
   return new SvgImage(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new SvgImage(svg_image_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  Ret setImage(String name)  {
   return Ret.from(svg_image_set_image(this.nativeObj, name));
 }

 public  static Widget cast(Widget widget)  {
   return new SvgImage(svg_image_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long svg_image_create(long parent, int x, int y, int w, int h);
static private native int svg_image_set_image(long widget, String name);
static private native long svg_image_cast(long widget);
}

