package awtk;

public class ColorComponent extends Widget {
 public ColorComponent(long nativeObj) {
   super(nativeObj);
 }

 static public ColorComponent cast(long nativeObj) {
   return new ColorComponent(nativeObj);
 }

 public  static Widget cast(Widget widget)  {
   return new ColorComponent(color_component_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long color_component_cast(long widget);
}

