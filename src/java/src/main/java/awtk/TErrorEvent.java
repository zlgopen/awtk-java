package awtk;


/**
 * 执行完成事件。
 *
 */
public class TErrorEvent extends TEvent { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TErrorEvent(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TErrorEvent cast(long nativeObj) {
   return new TErrorEvent(nativeObj);
 }


  /**
   * 把event对象转error_event_t对象。
   * 
   * @param event event对象。
   *
   * @return 返回event对象。
   */
 public  static TErrorEvent cast(TEvent event)  {
    return new TErrorEvent(error_event_cast(event != null ? (event.nativeObj) : 0));
 }


  /**
   * 错误码。
   *
   */
 public int getCode() {
   return error_event_t_get_prop_code(this.nativeObj);
 }


  /**
   * 错误信息。
   *
   */
 public String getMessage() {
   return error_event_t_get_prop_message(this.nativeObj);
 }

static private native long error_event_cast(long event);
static private native int error_event_t_get_prop_code(long nativeObj);
static private native String error_event_t_get_prop_message(long nativeObj);
};