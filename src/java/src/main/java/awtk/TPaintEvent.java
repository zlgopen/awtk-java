package awtk;


/**
 * 绘制事件。
 *
 */
public class TPaintEvent extends TEvent { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TPaintEvent(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TPaintEvent cast(long nativeObj) {
   return new TPaintEvent(nativeObj);
 }


  /**
   * 把event对象转paint_event_t对象。主要给脚本语言使用。
   * 
   * @param event event对象。
   *
   * @return event 对象。
   */
 public  static TPaintEvent cast(TEvent event)  {
    return new TPaintEvent(paint_event_cast(event != null ? (event.nativeObj) : 0));
 }


  /**
   * canvas。
   *
   */
 public TCanvas getC() {
   return new TCanvas(paint_event_t_get_prop_c(this.nativeObj));
 }

static private native long paint_event_cast(long event);
static private native long paint_event_t_get_prop_c(long nativeObj);
};