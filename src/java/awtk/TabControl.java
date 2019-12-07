package awtk;

public class TabControl extends Widget {
 public TabControl(long nativeObj) {
   super(nativeObj);
 }

 static public TabControl cast(long nativeObj) {
   return new TabControl(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new TabControl(tab_control_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new TabControl(tab_control_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long tab_control_create(long parent, int x, int y, int w, int h);
static private native long tab_control_cast(long widget);
}

