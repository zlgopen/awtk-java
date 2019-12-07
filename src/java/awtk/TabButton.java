package awtk;

public class TabButton extends Widget {
 public TabButton(long nativeObj) {
   super(nativeObj);
 }

 static public TabButton cast(long nativeObj) {
   return new TabButton(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new TabButton(tab_button_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new TabButton(tab_button_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public  Ret setValue(int value)  {
   return Ret.from(tab_button_set_value(this.nativeObj, value));
 }

 public  Ret setIcon(String name)  {
   return Ret.from(tab_button_set_icon(this.nativeObj, name));
 }

 public  Ret setActiveIcon(String name)  {
   return Ret.from(tab_button_set_active_icon(this.nativeObj, name));
 }

 public String getActiveIcon() {
   return tab_button_t_get_prop_active_icon(this.nativeObj);
 }

 public String getIcon() {
   return tab_button_t_get_prop_icon(this.nativeObj);
 }

static private native long tab_button_create(long parent, int x, int y, int w, int h);
static private native long tab_button_cast(long widget);
static private native int tab_button_set_value(long widget, int value);
static private native int tab_button_set_icon(long widget, String name);
static private native int tab_button_set_active_icon(long widget, String name);
static private native boolean tab_button_t_get_prop_value(long nativeObj);
static private native String tab_button_t_get_prop_active_icon(long nativeObj);
static private native String tab_button_t_get_prop_icon(long nativeObj);
}

