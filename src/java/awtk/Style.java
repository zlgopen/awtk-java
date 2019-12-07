package awtk;

public class Style {
 public long nativeObj;

 public Style(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public Style cast(long nativeObj) {
   return new Style(nativeObj);
 }

 public  Ret notifyWidgetStateChanged(Widget widget)  {
   return Ret.from(style_notify_widget_state_changed(this.nativeObj, widget != null ? (widget.nativeObj) : 0));
 }

 public  boolean isValid()  {
   return style_is_valid(this.nativeObj);
 }

 public  int getInt(String name, int defval)  {
   return style_get_int(this.nativeObj, name, defval);
 }

 public  String getStr(String name, String defval)  {
   return style_get_str(this.nativeObj, name, defval);
 }

 public  Ret set(String state, String name, Value value)  {
   return Ret.from(style_set(this.nativeObj, state, name, value != null ? (value.nativeObj) : 0));
 }

 public  boolean isMutable()  {
   return style_is_mutable(this.nativeObj);
 }

static private native int style_notify_widget_state_changed(long s, long widget);
static private native boolean style_is_valid(long s);
static private native int style_get_int(long s, String name, int defval);
static private native String style_get_str(long s, String name, String defval);
static private native int style_set(long s, String state, String name, long value);
static private native boolean style_is_mutable(long s);
}

