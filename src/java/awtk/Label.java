package awtk;

public class Label extends Widget {
 public Label(long nativeObj) {
   super(nativeObj);
 }

 static public Label cast(long nativeObj) {
   return new Label(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new Label(label_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  Ret setLength(int length)  {
   return Ret.from(label_set_length(this.nativeObj, length));
 }

 public  Ret resizeToContent(int min_w, int max_w, int min_h, int max_h)  {
   return Ret.from(label_resize_to_content(this.nativeObj, min_w, max_w, min_h, max_h));
 }

 public  static Widget cast(Widget widget)  {
   return new Label(label_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public int getLength() {
   return label_t_get_prop_length(this.nativeObj);
 }

static private native long label_create(long parent, int x, int y, int w, int h);
static private native int label_set_length(long widget, int length);
static private native int label_resize_to_content(long widget, int min_w, int max_w, int min_h, int max_h);
static private native long label_cast(long widget);
static private native int label_t_get_prop_length(long nativeObj);
}

