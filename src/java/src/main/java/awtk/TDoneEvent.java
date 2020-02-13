package awtk;


/**
 * 执行完成事件。
 *
 */
public class TDoneEvent extends TEvent { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TDoneEvent(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TDoneEvent cast(long nativeObj) {
   return new TDoneEvent(nativeObj);
 }


  /**
   * 把event对象转done_event_t对象，主要给脚本语言使用。
   * 
   * @param event event对象。
   *
   * @return 返回event对象。
   */
 public  static TDoneEvent cast(TEvent event)  {
    return new TDoneEvent(done_event_cast(event != null ? (event.nativeObj) : 0));
 }


  /**
   * 执行结果。
   *
   */
 public TRet getResult() {
   return TRet.from(done_event_t_get_prop_result(this.nativeObj));

 }

static private native long done_event_cast(long event);
static private native int done_event_t_get_prop_result(long nativeObj);
};