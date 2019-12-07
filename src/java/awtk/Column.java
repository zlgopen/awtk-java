package awtk;

public class Column extends Widget {
 public Column(long nativeObj) {
   super(nativeObj);
 }

 static public Column cast(long nativeObj) {
   return new Column(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new Column(column_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new Column(column_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long column_create(long parent, int x, int y, int w, int h);
static private native long column_cast(long widget);
}

