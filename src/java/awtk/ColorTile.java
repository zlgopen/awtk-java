package awtk;

public class ColorTile extends Widget {
 public ColorTile(long nativeObj) {
   super(nativeObj);
 }

 static public ColorTile cast(long nativeObj) {
   return new ColorTile(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new ColorTile(color_tile_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new ColorTile(color_tile_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public  Ret setBgColor(String color)  {
   return Ret.from(color_tile_set_bg_color(this.nativeObj, color));
 }

 public String getBgColor() {
   return color_tile_t_get_prop_bg_color(this.nativeObj);
 }

 public String getBorderColor() {
   return color_tile_t_get_prop_border_color(this.nativeObj);
 }

static private native long color_tile_create(long parent, int x, int y, int w, int h);
static private native long color_tile_cast(long widget);
static private native int color_tile_set_bg_color(long widget, String color);
static private native String color_tile_t_get_prop_bg_color(long nativeObj);
static private native String color_tile_t_get_prop_border_color(long nativeObj);
}

