package awtk;

public class ColorPicker extends Widget {
 public ColorPicker(long nativeObj) {
   super(nativeObj);
 }

 static public ColorPicker cast(long nativeObj) {
   return new ColorPicker(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new ColorPicker(color_picker_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  Ret setColor(String color)  {
   return Ret.from(color_picker_set_color(this.nativeObj, color));
 }

 public  static Widget cast(Widget widget)  {
   return new ColorPicker(color_picker_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long color_picker_create(long parent, int x, int y, int w, int h);
static private native int color_picker_set_color(long widget, String color);
static private native long color_picker_cast(long widget);
static private native String color_picker_t_get_prop_value(long nativeObj);
}

