package awtk;

public class DialogClient extends Widget {
 public DialogClient(long nativeObj) {
   super(nativeObj);
 }

 static public DialogClient cast(long nativeObj) {
   return new DialogClient(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new DialogClient(dialog_client_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new DialogClient(dialog_client_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long dialog_client_create(long parent, int x, int y, int w, int h);
static private native long dialog_client_cast(long widget);
}

