package awtk;


/**
 * 系统事件。
 *
 */
public class TSystemEvent extends TEvent { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TSystemEvent(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TSystemEvent cast(long nativeObj) {
   return new TSystemEvent(nativeObj);
 }


  /**
   * 把event对象转system_event_t对象。
   * 
   * @param event event对象。
   *
   * @return event 对象。
   */
 public  static TSystemEvent cast(TEvent event)  {
    return new TSystemEvent(system_event_cast(event != null ? (event.nativeObj) : 0));
 }


  /**
   * SDL_Event。
   *
   */
 public long getSdlEvent() {
   return system_event_t_get_prop_sdl_event(this.nativeObj);
 }

static private native long system_event_cast(long event);
static private native long system_event_t_get_prop_sdl_event(long nativeObj);
};