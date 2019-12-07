package awtk;

public class Overlay extends Widget {
 public Overlay(long nativeObj) {
   super(nativeObj);
 }

 static public Overlay cast(long nativeObj) {
   return new Overlay(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new Overlay(overlay_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new Overlay(overlay_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long overlay_create(long parent, int x, int y, int w, int h);
static private native long overlay_cast(long widget);
}

