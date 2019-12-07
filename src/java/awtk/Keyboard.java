package awtk;

public class Keyboard extends WindowBase {
 public Keyboard(long nativeObj) {
   super(nativeObj);
 }

 static public Keyboard cast(long nativeObj) {
   return new Keyboard(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new Keyboard(keyboard_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new Keyboard(keyboard_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long keyboard_create(long parent, int x, int y, int w, int h);
static private native long keyboard_cast(long widget);
}

