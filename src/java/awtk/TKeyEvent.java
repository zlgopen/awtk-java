package awtk;


/**
 * 按键事件。
 *
 */
public class TKeyEvent extends TEvent { 

/**
 * 原生对象。
 */
 public long nativeObj;


/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TKeyEvent(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TKeyEvent cast(long nativeObj) {
   return new TKeyEvent(nativeObj);
 }


/**
 * 把event对象转key_event_t对象，主要给脚本语言使用。
 * 
 * @param event event对象。
 
 * @return event对象。
 */
 public  static TKeyEvent cast(TEvent event)  {
    return new TKeyEvent(key_event_cast(event != null ? (event.nativeObj) : 0));
 }


/**
 * 键值。
 *
 */
 public int getKey() {
   return key_event_t_get_prop_key(this.nativeObj);
 }


/**
 * alt键是否按下。
 *
 */
 public boolean getAlt() {
   return key_event_t_get_prop_alt(this.nativeObj);
 }


/**
 * left alt键是否按下。
 *
 */
 public boolean getLalt() {
   return key_event_t_get_prop_lalt(this.nativeObj);
 }


/**
 * right alt键是否按下。
 *
 */
 public boolean getRalt() {
   return key_event_t_get_prop_ralt(this.nativeObj);
 }


/**
 * right alt键是否按下。
 *ctrl键是否按下。
 *
 */
 public boolean getCtrl() {
   return key_event_t_get_prop_ctrl(this.nativeObj);
 }


/**
 * left ctrl键是否按下。
 *
 */
 public boolean getLctrl() {
   return key_event_t_get_prop_lctrl(this.nativeObj);
 }


/**
 * right ctrl键是否按下。
 *
 */
 public boolean getRctrl() {
   return key_event_t_get_prop_rctrl(this.nativeObj);
 }


/**
 * shift键是否按下。
 *
 */
 public boolean getShift() {
   return key_event_t_get_prop_shift(this.nativeObj);
 }


/**
 * left shift键是否按下。
 *
 */
 public boolean getLshift() {
   return key_event_t_get_prop_lshift(this.nativeObj);
 }


/**
 * right shift键是否按下。
 *
 */
 public boolean getRshift() {
   return key_event_t_get_prop_rshift(this.nativeObj);
 }


/**
 * left shift键是否按下。
 *cmd/win键是否按下。
 *
 */
 public boolean getCmd() {
   return key_event_t_get_prop_cmd(this.nativeObj);
 }


/**
 * menu键是否按下。
 *
 */
 public boolean getMenu() {
   return key_event_t_get_prop_menu(this.nativeObj);
 }


/**
 * capslock键是否按下。
 *
 */
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
};