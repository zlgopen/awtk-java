package awtk;


/**
 * 颜色选择器的颜色分量。
 *控件的名称有严格规定：
 *COLOR_PICKER_CHILD_SV: 水平为Value/Brightness(递增)，垂直为Saturation(递减)。
 *COLOR_PICKER_CHILD_H: 水平为同色，垂直为Hue(递减)。
 *
 */
public class TColorComponent extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TColorComponent(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TColorComponent cast(long nativeObj) {
   return new TColorComponent(nativeObj);
 }


  /**
   * 创建color_component对象
   * 
   * @param parent 父控件
   * @param x x坐标
   * @param y y坐标
   * @param w 宽度
   * @param h 高度
   *
   * @return 对象。
   */
 public  static TWidget create(TWidget parent, int x, int y, int w, int h)  {
    return new TColorComponent(color_component_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为color_component对象(供脚本语言使用)。
   * 
   * @param widget color_component对象。
   *
   * @return color_component对象。
   */
 public  static TColorComponent cast(TWidget widget)  {
    return new TColorComponent(color_component_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long color_component_create(long parent, int x, int y, int w, int h);
static private native long color_component_cast(long widget);
};