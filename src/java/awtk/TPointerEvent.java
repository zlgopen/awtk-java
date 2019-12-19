package awtk;


/**
 * 指针事件。
 *
 */
public class TPointerEvent extends TEvent { 

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
 public TPointerEvent(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TPointerEvent cast(long nativeObj) {
   return new TPointerEvent(nativeObj);
 }


/**
 * 把event对象转pointer_event_t对象，主要给脚本语言使用。
 * 
 * @param event event对象。
 
 * @return event对象。
 */
 public  static TPointerEvent cast(TEvent event)  {
    return new TPointerEvent(pointer_event_cast(event != null ? (event.nativeObj) : 0));
 }


/**
 * x坐标。
 *
 */
 public int getX() {
   return pointer_event_t_get_prop_x(this.nativeObj);
 }


/**
 * y坐标。
 *
 */
 public int getY() {
   return pointer_event_t_get_prop_y(this.nativeObj);
 }


/**
 * button。
 *
 */
 public int getButton() {
   return pointer_event_t_get_prop_button(this.nativeObj);
 }


/**
 * 指针是否按下。
 *
 */
 public boolean getPressed() {
   return pointer_event_t_get_prop_pressed(this.nativeObj);
 }


/**
 * alt键是否按下。
 *
 */
 public boolean getAlt() {
   return pointer_event_t_get_prop_alt(this.nativeObj);
 }


/**
 * ctrl键是否按下。
 *
 */
 public boolean getCtrl() {
   return pointer_event_t_get_prop_ctrl(this.nativeObj);
 }


/**
 * cmd键是否按下。
 *
 */
 public boolean getCmd() {
   return pointer_event_t_get_prop_cmd(this.nativeObj);
 }


/**
 * menu键是否按下。
 *
 */
 public boolean getMenu() {
   return pointer_event_t_get_prop_menu(this.nativeObj);
 }


/**
 * shift键是否按下。
 *
 */
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
};