package awtk;


/**
 * 对象属性变化事件。
 *
 */
public class TPropChangeEvent extends TEvent { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TPropChangeEvent(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TPropChangeEvent cast(long nativeObj) {
   return new TPropChangeEvent(nativeObj);
 }


  /**
   * 把event对象转prop_change_event_t对象。
   * 
   * @param event event对象。
   *
   * @return 返回event对象。
   */
 public  static TPropChangeEvent cast(TEvent event)  {
    return new TPropChangeEvent(prop_change_event_cast(event != null ? (event.nativeObj) : 0));
 }


  /**
   * 属性的名称。
   *
   */
 public String getName() {
   return prop_change_event_t_get_prop_name(this.nativeObj);
 }

static private native long prop_change_event_cast(long event);
static private native String prop_change_event_t_get_prop_name(long nativeObj);
static private native long prop_change_event_t_get_prop_value(long nativeObj);
};