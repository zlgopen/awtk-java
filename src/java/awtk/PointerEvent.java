package awtk;

public class PointerEvent extends Event {
 public PointerEvent(long nativeObj) {
   super(nativeObj);
 }

 static public PointerEvent cast(long nativeObj) {
   return new PointerEvent(nativeObj);
 }

 public  static PointerEvent cast(Event event)  {
   return new PointerEvent(pointer_event_cast(event != null ? (event.nativeObj) : 0));
 }

 public int getX() {
   return pointer_event_t_get_prop_x(this.nativeObj);
 }

 public int getY() {
   return pointer_event_t_get_prop_y(this.nativeObj);
 }

 public int getButton() {
   return pointer_event_t_get_prop_button(this.nativeObj);
 }

 public boolean getPressed() {
   return pointer_event_t_get_prop_pressed(this.nativeObj);
 }

 public boolean getAlt() {
   return pointer_event_t_get_prop_alt(this.nativeObj);
 }

 public boolean getCtrl() {
   return pointer_event_t_get_prop_ctrl(this.nativeObj);
 }

 public boolean getCmd() {
   return pointer_event_t_get_prop_cmd(this.nativeObj);
 }

 public boolean getMenu() {
   return pointer_event_t_get_prop_menu(this.nativeObj);
 }

 public boolean getShift() {
   return pointer_event_t_get_prop_shift(this.nativeObj);
 }

static private native long pointer_event_cast(long event);
static private native int pointer_event_t_get_prop_x(long nativeObj);
static private native int pointer_event_t_get_prop_y(long nativeObj);
static private native int pointer_event_t_get_prop_button(long nativeObj);
static private native boolean pointer_event_t_get_prop_pressed(long nativeObj);
static private native boolean pointer_event_t_get_prop_alt(long nativeObj);
static private native boolean pointer_event_t_get_prop_ctrl(long nativeObj);
static private native boolean pointer_event_t_get_prop_cmd(long nativeObj);
static private native boolean pointer_event_t_get_prop_menu(long nativeObj);
static private native boolean pointer_event_t_get_prop_shift(long nativeObj);
}

