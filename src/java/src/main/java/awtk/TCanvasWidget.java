package awtk;


/**
 * 画布控件。
 *
 *画布控件让开发者可以自己在控件上绘制需要的内容。
 *
 *canvas\_widget\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于canvas\_widget\_t控件。
 *
 *在xml中使用"canvas"标签创建画布控件。如：
 *
 *```xml
 *<canvas name="paint_vgcanvas" x="0" y="0" w="100%" h="100%" />
 *```
 *
 *> 更多用法请参考：
 *[canvas_widget.xml](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/vgcanvas.xml)
 *
 *在c代码中使用函数canvas\_widget\_create创建画布控件。如：
 *
 *
 *> 创建之后，需要用widget\_on注册EVT\_PAINT事件，并在EVT\_PAINT事件处理函数中绘制。
 *
 *
 *绘制时，可以通过canvas接口去绘制，也可以通过vgcanvas接口去绘制。
 *先从evt获取canvas对象，再通过canvas\_get\_vgcanvas从canvas中获取vgcanvas对象。
 *
 *
 *> 完整示例请参考：
 *[canvas demo](https://github.com/zlgopen/awtk-c-demos/blob/master/demos/canvas.c)
 *
 *参考：
 *
 ** [canvas接口描述](canvas_t.md)
 ** [vgcanvas接口描述](vgcanvas_t.md)
 *
 */
public class TCanvasWidget extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TCanvasWidget(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TCanvasWidget cast(long nativeObj) {
   return new TCanvasWidget(nativeObj);
 }


  /**
   * 创建canvas_widget对象
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
    return new TCanvasWidget(canvas_widget_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为canvas_widget对象(供脚本语言使用)。
   * 
   * @param widget canvas_widget对象。
   *
   * @return canvas_widget对象。
   */
 public  static TCanvasWidget cast(TWidget widget)  {
    return new TCanvasWidget(canvas_widget_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long canvas_widget_create(long parent, int x, int y, int w, int h);
static private native long canvas_widget_cast(long widget);
};