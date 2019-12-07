package awtk;

public class SystemBar extends WindowBase {
 public SystemBar(long nativeObj) {
   super(nativeObj);
 }

 static public SystemBar cast(long nativeObj) {
   return new SystemBar(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new SystemBar(system_bar_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new SystemBar(system_bar_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long system_bar_create(long parent, int x, int y, int w, int h);
static private native long system_bar_cast(long widget);
}

