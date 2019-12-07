package awtk;

public class Popup extends WindowBase {
 public Popup(long nativeObj) {
   super(nativeObj);
 }

 static public Popup cast(long nativeObj) {
   return new Popup(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new Popup(popup_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new Popup(popup_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public  Ret setCloseWhenClick(boolean close_when_click)  {
   return Ret.from(popup_set_close_when_click(this.nativeObj, close_when_click));
 }

 public  Ret setCloseWhenClickOutside(boolean close_when_click_outside)  {
   return Ret.from(popup_set_close_when_click_outside(this.nativeObj, close_when_click_outside));
 }

 public boolean getCloseWhenClick() {
   return popup_t_get_prop_close_when_click(this.nativeObj);
 }

 public boolean getCloseWhenClickOutside() {
   return popup_t_get_prop_close_when_click_outside(this.nativeObj);
 }

static private native long popup_create(long parent, int x, int y, int w, int h);
static private native long popup_cast(long widget);
static private native int popup_set_close_when_click(long widget, boolean close_when_click);
static private native int popup_set_close_when_click_outside(long widget, boolean close_when_click_outside);
static private native boolean popup_t_get_prop_close_when_click(long nativeObj);
static private native boolean popup_t_get_prop_close_when_click_outside(long nativeObj);
}

