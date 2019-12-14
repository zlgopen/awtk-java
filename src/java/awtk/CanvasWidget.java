package awtk;


/**
 * 画布控件。
 * 
 *  画布控件让开发者可以自己在控件上绘制需要的内容。
 * 
 *  canvas\_widget\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于canvas\_widget\_t控件。
 * 
 *  在xml中使用"canvas"标签创建画布控件。如：
 * 
 *  ```xml
 *  <canvas name="paint_vgcanvas" x="0" y="0" w="100%" h="100%" />
 *  ```
 * 
 * 更多用法请参考：
 *  [canvas_widget.xml](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/vgcanvas.xml)
 * 
 *  在c代码中使用函数canvas\_widget\_create创建画布控件。如：
 * 
 *  ```c
 *  widget_t* canvas = canvas_widget_create(win, 0, 0, win->w, win->h);
 *  ```
 * 
 * 创建之后，需要用widget\_on注册EVT\_PAINT事件，并在EVT\_PAINT事件处理函数中绘制。
 * 
 *  ```c
 *  widget_on(canvas, EVT_PAINT, on_paint_event, canvas);
 *  ```
 * 
 *  绘制时，可以通过canvas接口去绘制，也可以通过vgcanvas接口去绘制。
 *  先从evt获取canvas对象，再通过canvas\_get\_vgcanvas从canvas中获取vgcanvas对象。
 * 
 *  ```c
 * 
 *  static ret_t on_paint_event(void* ctx, event_t* evt) {
 *   widget_t* canvas_widget = WIDGET(ctx);
 *   canvas_t* c = paint_event_cast(evt)->c;
 *   vgcanvas_t* vg = canvas_get_vgcanvas(c);
 *   color_t bg = color_init(0xe0, 0xe0, 0xe0, 0xff);
 *   color_t tc = color_init(0, 0, 0, 0xff);
 *   rect_t r = rect_init(canvas_widget->x, canvas_widget->y, canvas_widget->w, canvas_widget->h);
 * 
 *   vgcanvas_save(vg);
 *   vgcanvas_clip_rect(vg, r.x, r.y, r.w, r.h);
 *   vgcanvas_translate(vg, r.x, r.y);
 * 
 *  ...
 * 
 *   vgcanvas_restore(vg);
 * 
 *   return RET_OK;
 *  }
 *  ```
 * 
 * 完整示例请参考：
 *  [canvas demo](https://github.com/zlgopen/awtk-c-demos/blob/master/demos/canvas.c)
 * 
 *  参考：
 * 
 *  * [canvas接口描述](canvas_t.md)
 *  * [vgcanvas接口描述](vgcanvas_t.md)
 *
 */
public class CanvasWidget extends Widget {
 public long nativeObj;

 public CanvasWidget(long nativeObj) {
   super(nativeObj);
 }

 static public CanvasWidget cast(long nativeObj) {
   return new CanvasWidget(nativeObj);
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
 * @returns 对象。
 */
 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new CanvasWidget(canvas_widget_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换为canvas_widget对象(供脚本语言使用)。
 * 
 * @param widget canvas_widget对象。
 *
 * @returns canvas_widget对象。
 */
 public  static CanvasWidget cast(Widget widget)  {
   return new CanvasWidget(canvas_widget_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long canvas_widget_create(long parent, int x, int y, int w, int h);
static private native long canvas_widget_cast(long widget);
}

