package awtk;

public class ListItem extends Widget {
 public ListItem(long nativeObj) {
   super(nativeObj);
 }

 static public ListItem cast(long nativeObj) {
   return new ListItem(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new ListItem(list_item_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new ListItem(list_item_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long list_item_create(long parent, int x, int y, int w, int h);
static private native long list_item_cast(long widget);
}

