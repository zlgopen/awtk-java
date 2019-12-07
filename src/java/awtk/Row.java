package awtk;

public class Row extends Widget {
 public Row(long nativeObj) {
   super(nativeObj);
 }

 static public Row cast(long nativeObj) {
   return new Row(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new Row(row_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new Row(row_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long row_create(long parent, int x, int y, int w, int h);
static private native long row_cast(long widget);
}

