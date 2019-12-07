package awtk;

public class DialogTitle extends Widget {
 public DialogTitle(long nativeObj) {
   super(nativeObj);
 }

 static public DialogTitle cast(long nativeObj) {
   return new DialogTitle(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new DialogTitle(dialog_title_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new DialogTitle(dialog_title_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long dialog_title_create(long parent, int x, int y, int w, int h);
static private native long dialog_title_cast(long widget);
}

