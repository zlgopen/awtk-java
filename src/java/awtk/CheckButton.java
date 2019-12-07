package awtk;

public class CheckButton extends Widget {
 public CheckButton(long nativeObj) {
   super(nativeObj);
 }

 static public CheckButton cast(long nativeObj) {
   return new CheckButton(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new CheckButton(check_button_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget createRadio(Widget parent, int x, int y, int w, int h)  {
   return new CheckButton(check_button_create_radio(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  Ret setValue(boolean value)  {
   return Ret.from(check_button_set_value(this.nativeObj, value));
 }

 public  static Widget cast(Widget widget)  {
   return new CheckButton(check_button_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long check_button_create(long parent, int x, int y, int w, int h);
static private native long check_button_create_radio(long parent, int x, int y, int w, int h);
static private native int check_button_set_value(long widget, boolean value);
static private native long check_button_cast(long widget);
static private native boolean check_button_t_get_prop_value(long nativeObj);
}

