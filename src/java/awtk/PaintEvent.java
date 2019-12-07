package awtk;

public class PaintEvent extends Event {
 public PaintEvent(long nativeObj) {
   super(nativeObj);
 }

 static public PaintEvent cast(long nativeObj) {
   return new PaintEvent(nativeObj);
 }

 public  static PaintEvent cast(Event event)  {
   return new PaintEvent(paint_event_cast(event != null ? (event.nativeObj) : 0));
 }

 public Canvas getC() {
   return new Canvas(paint_event_t_get_prop_c(this.nativeObj));
 }

static private native long paint_event_cast(long event);
static private native long paint_event_t_get_prop_c(long nativeObj);
}

