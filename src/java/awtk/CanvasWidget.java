package awtk;

public class CanvasWidget extends Widget {
 public CanvasWidget(long nativeObj) {
   super(nativeObj);
 }

 static public CanvasWidget cast(long nativeObj) {
   return new CanvasWidget(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new CanvasWidget(canvas_widget_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new CanvasWidget(canvas_widget_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long canvas_widget_create(long parent, int x, int y, int w, int h);
static private native long canvas_widget_cast(long widget);
}

