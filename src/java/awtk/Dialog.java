package awtk;

public class Dialog extends WindowBase {
 public Dialog(long nativeObj) {
   super(nativeObj);
 }

 static public Dialog cast(long nativeObj) {
   return new Dialog(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new Dialog(dialog_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget createSimple(Widget parent, int x, int y, int w, int h)  {
   return new Dialog(dialog_create_simple(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new Dialog(dialog_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public  Widget getTitle()  {
   return new Widget(dialog_get_title(this.nativeObj));
 }

 public  Widget getClient()  {
   return new Widget(dialog_get_client(this.nativeObj));
 }

 public  static Widget open(String name)  {
   return new Dialog(dialog_open(name));
 }

 public  Ret setTitle(String title)  {
   return Ret.from(dialog_set_title(this.nativeObj, title));
 }

 public  Ret modal()  {
   return Ret.from(dialog_modal(this.nativeObj));
 }

 public  Ret quit(int code)  {
   return Ret.from(dialog_quit(this.nativeObj, code));
 }

 public  boolean isQuited()  {
   return dialog_is_quited(this.nativeObj);
 }

 public  boolean isModal()  {
   return dialog_is_modal(this.nativeObj);
 }

 public  static Ret toast(String text, int duration)  {
   return Ret.from(dialog_toast(text, duration));
 }

 public  static Ret info(String title, String text)  {
   return Ret.from(dialog_info(title, text));
 }

 public  static Ret warn(String title, String text)  {
   return Ret.from(dialog_warn(title, text));
 }

 public  static Ret confirm(String title, String text)  {
   return Ret.from(dialog_confirm(title, text));
 }

 public String getHighlight() {
   return dialog_t_get_prop_highlight(this.nativeObj);
 }

static private native long dialog_create(long parent, int x, int y, int w, int h);
static private native long dialog_create_simple(long parent, int x, int y, int w, int h);
static private native long dialog_cast(long widget);
static private native long dialog_get_title(long widget);
static private native long dialog_get_client(long widget);
static private native long dialog_open(String name);
static private native int dialog_set_title(long widget, String title);
static private native int dialog_modal(long widget);
static private native int dialog_quit(long widget, int code);
static private native boolean dialog_is_quited(long widget);
static private native boolean dialog_is_modal(long widget);
static private native int dialog_toast(String text, int duration);
static private native int dialog_info(String title, String text);
static private native int dialog_warn(String title, String text);
static private native int dialog_confirm(String title, String text);
static private native String dialog_t_get_prop_highlight(long nativeObj);
}

