package awtk;

public class KeyEvent extends Event {
 public KeyEvent(long nativeObj) {
   super(nativeObj);
 }

 static public KeyEvent cast(long nativeObj) {
   return new KeyEvent(nativeObj);
 }

 public  static KeyEvent cast(Event event)  {
   return new KeyEvent(key_event_cast(event != null ? (event.nativeObj) : 0));
 }

 public int getKey() {
   return key_event_t_get_prop_key(this.nativeObj);
 }

 public boolean getAlt() {
   return key_event_t_get_prop_alt(this.nativeObj);
 }

 public boolean getLalt() {
   return key_event_t_get_prop_lalt(this.nativeObj);
 }

 public boolean getRalt() {
   return key_event_t_get_prop_ralt(this.nativeObj);
 }

 public boolean getCtrl() {
   return key_event_t_get_prop_ctrl(this.nativeObj);
 }

 public boolean getLctrl() {
   return key_event_t_get_prop_lctrl(this.nativeObj);
 }

 public boolean getRctrl() {
   return key_event_t_get_prop_rctrl(this.nativeObj);
 }

 public boolean getShift() {
   return key_event_t_get_prop_shift(this.nativeObj);
 }

 public boolean getLshift() {
   return key_event_t_get_prop_lshift(this.nativeObj);
 }

 public boolean getRshift() {
   return key_event_t_get_prop_rshift(this.nativeObj);
 }

 public boolean getCmd() {
   return key_event_t_get_prop_cmd(this.nativeObj);
 }

 public boolean getMenu() {
   return key_event_t_get_prop_menu(this.nativeObj);
 }

 public boolean getCapslock() {
   return key_event_t_get_prop_capslock(this.nativeObj);
 }

static private native long key_event_cast(long event);
static private native int key_event_t_get_prop_key(long nativeObj);
static private native boolean key_event_t_get_prop_alt(long nativeObj);
static private native boolean key_event_t_get_prop_lalt(long nativeObj);
static private native boolean key_event_t_get_prop_ralt(long nativeObj);
static private native boolean key_event_t_get_prop_ctrl(long nativeObj);
static private native boolean key_event_t_get_prop_lctrl(long nativeObj);
static private native boolean key_event_t_get_prop_rctrl(long nativeObj);
static private native boolean key_event_t_get_prop_shift(long nativeObj);
static private native boolean key_event_t_get_prop_lshift(long nativeObj);
static private native boolean key_event_t_get_prop_rshift(long nativeObj);
static private native boolean key_event_t_get_prop_cmd(long nativeObj);
static private native boolean key_event_t_get_prop_menu(long nativeObj);
static private native boolean key_event_t_get_prop_capslock(long nativeObj);
}

