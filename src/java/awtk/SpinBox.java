package awtk;

public class SpinBox extends Edit {
 public SpinBox(long nativeObj) {
   super(nativeObj);
 }

 static public SpinBox cast(long nativeObj) {
   return new SpinBox(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new SpinBox(spin_box_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new SpinBox(spin_box_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long spin_box_create(long parent, int x, int y, int w, int h);
static private native long spin_box_cast(long widget);
}

