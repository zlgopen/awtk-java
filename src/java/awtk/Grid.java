package awtk;

public class Grid extends Widget {
 public Grid(long nativeObj) {
   super(nativeObj);
 }

 static public Grid cast(long nativeObj) {
   return new Grid(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new Grid(grid_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new Grid(grid_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long grid_create(long parent, int x, int y, int w, int h);
static private native long grid_cast(long widget);
}

