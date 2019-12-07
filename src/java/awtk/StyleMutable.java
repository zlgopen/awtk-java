package awtk;

public class StyleMutable extends Style {
 public StyleMutable(long nativeObj) {
   super(nativeObj);
 }

 static public StyleMutable cast(long nativeObj) {
   return new StyleMutable(nativeObj);
 }

 public  Ret setName(String name)  {
   return Ret.from(style_mutable_set_name(this.nativeObj, name));
 }

 public  Ret setInt(String state, String name, int val)  {
   return Ret.from(style_mutable_set_int(this.nativeObj, state, name, val));
 }

 public  static Style cast(Style s)  {
   return new StyleMutable(style_mutable_cast(s != null ? (s.nativeObj) : 0));
 }

 public  static Style create(Widget widget, Style default_style)  {
   return new StyleMutable(style_mutable_create(widget != null ? (widget.nativeObj) : 0, default_style != null ? (default_style.nativeObj) : 0));
 }

 public String getName() {
   return style_mutable_t_get_prop_name(this.nativeObj);
 }

static private native int style_mutable_set_name(long s, String name);
static private native int style_mutable_set_int(long s, String state, String name, int val);
static private native long style_mutable_cast(long s);
static private native long style_mutable_create(long widget, long default_style);
static private native String style_mutable_t_get_prop_name(long nativeObj);
}

