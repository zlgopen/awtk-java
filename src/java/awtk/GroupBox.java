package awtk;

public class GroupBox extends Widget {
 public GroupBox(long nativeObj) {
   super(nativeObj);
 }

 static public GroupBox cast(long nativeObj) {
   return new GroupBox(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new GroupBox(group_box_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new GroupBox(group_box_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long group_box_create(long parent, int x, int y, int w, int h);
static private native long group_box_cast(long widget);
}

