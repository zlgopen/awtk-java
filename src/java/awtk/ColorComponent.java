package awtk;


/**
 * 颜色选择器的颜色分量。
 *  控件的名称有严格规定：
 *  COLOR_PICKER_CHILD_SV: 水平为Value/Brightness(递增)，垂直为Saturation(递减)。
 *  COLOR_PICKER_CHILD_H: 水平为同色，垂直为Hue(递减)。
 *
 */
public class ColorComponent extends Widget {
 public long nativeObj;

 public ColorComponent(long nativeObj) {
   super(nativeObj);
 }

 static public ColorComponent cast(long nativeObj) {
   return new ColorComponent(nativeObj);
 }


/**
 * 转换为color_component对象(供脚本语言使用)。
 * 
 * @param widget color_component对象。
 *
 * @returns color_component对象。
 */
 public  static ColorComponent cast(Widget widget)  {
   return new ColorComponent(color_component_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long color_component_cast(long widget);
}

