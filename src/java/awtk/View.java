package awtk;

public class View extends Widget {
 public View(long nativeObj) {
   super(nativeObj);
 }

 static public View cast(long nativeObj) {
   return new View(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new View(view_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new View(view_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long view_create(long parent, int x, int y, int w, int h);
static private native long view_cast(long widget);
}

