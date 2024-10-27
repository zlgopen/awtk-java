package awtk;


/**
 * 日志事件。
 *
 */
public class TLogMessageEvent extends TEvent { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TLogMessageEvent(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TLogMessageEvent cast(long nativeObj) {
   return new TLogMessageEvent(nativeObj);
 }


  /**
   * 把event对象转log_message_event_t对象。
   * 
   * @param event event对象。
   *
   * @return event对象。
   */
 public  static TLogMessageEvent cast(TEvent event)  {
    return new TLogMessageEvent(log_message_event_cast(event != null ? (event.nativeObj) : 0));
 }

static private native long log_message_event_cast(long event);
};