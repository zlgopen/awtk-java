package awtk;


/**
 * 对象属性变化事件。
 *
 */
public class PropChangeEvent extends Event {
 public long nativeObj;

 public PropChangeEvent(long nativeObj) {
   super(nativeObj);
 }

 static public PropChangeEvent cast(long nativeObj) {
   return new PropChangeEvent(nativeObj);
 }


/**
 * 把event对象转prop_change_event_t对象，主要给脚本语言使用。
 * 
 * @param event event对象。
 *
 * @returns 返回event对象。
 */
 public  static PropChangeEvent cast(Event event)  {
   return new PropChangeEvent(prop_change_event_cast(event != null ? (event.nativeObj) : 0));
 }

 public String getName() {
   return prop_change_event_t_get_prop_name(this.nativeObj);
 }

static private native long prop_change_event_cast(long event);
static private native String prop_change_event_t_get_prop_name(long nativeObj);
static private native long prop_change_event_t_get_prop_value(long nativeObj);
}

