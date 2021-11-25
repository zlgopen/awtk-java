package awtk;


/**
 * 值变化事件。
 *
 */
public class TOffsetChangeEvent extends TEvent { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TOffsetChangeEvent(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TOffsetChangeEvent cast(long nativeObj) {
   return new TOffsetChangeEvent(nativeObj);
 }


  /**
   * 把event对象转offset_change_event_t对象，主要给脚本语言使用。
   * 
   * @param event event对象。
   *
   * @return event对象。
   */
 public  static TOffsetChangeEvent cast(TEvent event)  {
    return new TOffsetChangeEvent(offset_change_event_cast(event != null ? (event.nativeObj) : 0));
 }

static private native long offset_change_event_cast(long event);
};