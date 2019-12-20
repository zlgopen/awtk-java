package awtk;


/**
 * 进度变化事件。
 *
 */
public class TProgressEvent extends TEvent { 

/**
 * 原生对象。
 */

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TProgressEvent(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TProgressEvent cast(long nativeObj) {
   return new TProgressEvent(nativeObj);
 }


/**
 * 把event对象转progress_event_t对象，主要给脚本语言使用。
 * 
 * @param event event对象。
 
 * @return 返回event对象。
 */
 public  static TProgressEvent cast(TEvent event)  {
    return new TProgressEvent(progress_event_cast(event != null ? (event.nativeObj) : 0));
 }


/**
 * 进度百分比。
 *
 */
 public int getPercent() {
   return progress_event_t_get_prop_percent(this.nativeObj);
 }

static private native long progress_event_cast(long event);
static private native int progress_event_t_get_prop_percent(long nativeObj);
};