package awtk;

public class LineNumber extends Widget {
 public LineNumber(long nativeObj) {
   super(nativeObj);
 }

 static public LineNumber cast(long nativeObj) {
   return new LineNumber(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new LineNumber(line_number_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  Ret setTopMargin(int top_margin)  {
   return Ret.from(line_number_set_top_margin(this.nativeObj, top_margin));
 }

 public  Ret setBottomMargin(int bottom_margin)  {
   return Ret.from(line_number_set_bottom_margin(this.nativeObj, bottom_margin));
 }

 public  Ret setLineHeight(int line_height)  {
   return Ret.from(line_number_set_line_height(this.nativeObj, line_height));
 }

 public  Ret setYoffset(int yoffset)  {
   return Ret.from(line_number_set_yoffset(this.nativeObj, yoffset));
 }

 public  static Widget cast(Widget widget)  {
   return new LineNumber(line_number_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long line_number_create(long parent, int x, int y, int w, int h);
static private native int line_number_set_top_margin(long widget, int top_margin);
static private native int line_number_set_bottom_margin(long widget, int bottom_margin);
static private native int line_number_set_line_height(long widget, int line_height);
static private native int line_number_set_yoffset(long widget, int yoffset);
static private native long line_number_cast(long widget);
}

