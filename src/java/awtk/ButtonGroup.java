package awtk;

public class ButtonGroup extends Widget {
 public ButtonGroup(long nativeObj) {
   super(nativeObj);
 }

 static public ButtonGroup cast(long nativeObj) {
   return new ButtonGroup(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new ButtonGroup(button_group_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new ButtonGroup(button_group_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long button_group_create(long parent, int x, int y, int w, int h);
static private native long button_group_cast(long widget);
}

