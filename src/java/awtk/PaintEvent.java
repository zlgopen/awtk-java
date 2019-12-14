package awtk;


/**
 * 绘制事件。
 *
 */
public class PaintEvent extends Event {
 public long nativeObj;

 public PaintEvent(long nativeObj) {
   super(nativeObj);
 }

 static public PaintEvent cast(long nativeObj) {
   return new PaintEvent(nativeObj);
 }


/**
 * 把event对象转paint_event_t对象。主要给脚本语言使用。
 * 
 * @param event event对象。
 *
 * @returns event 对象。
 */
 public  static PaintEvent cast(Event event)  {
   return new PaintEvent(paint_event_cast(event != null ? (event.nativeObj) : 0));
 }

 public Canvas getC() {
   return new Canvas(paint_event_t_get_prop_c(this.nativeObj));
 }

static private native long paint_event_cast(long event);
static private native long paint_event_t_get_prop_c(long nativeObj);
}

