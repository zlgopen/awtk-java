package awtk;

public class AppBar extends Widget {
 public AppBar(long nativeObj) {
   super(nativeObj);
 }

 static public AppBar cast(long nativeObj) {
   return new AppBar(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new AppBar(app_bar_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new AppBar(app_bar_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long app_bar_create(long parent, int x, int y, int w, int h);
static private native long app_bar_cast(long widget);
}

