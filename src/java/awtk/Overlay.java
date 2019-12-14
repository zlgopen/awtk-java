package awtk;


/**
 * overlay窗口。 overlay窗口有点类似于非模态的dialog，但是它位置和大小是完全自由的，窗口管理器不会对它做任何限制。 如果overlay窗口有透明或半透效果，则不支持窗口动画，但可以通过移动窗口位置来实现类似动画的效果。 overlay\_t是[window\_base\_t](window_base_t.md)的子类控件，window\_base\_t的函数均适用于overlay\_t控件。 在xml中使用"overlay"标签创建窗口。需要指定坐标和大小，可以指定主题和动画名称。如： ```xml <overlay theme="basic" x="100" y="100" w="200" h="300"> ... </overlay> ``` 更多用法请参考：[overlay.xml](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/) 在c代码中使用函数overlay\_create创建窗口。如： ```c  widget_t* overlay = overlay_create(NULL, 100, 100, 200, 300); ``` 完整示例请参考：[overlay demo](https://github.com/zlgopen/awtk-c-demos/blob/master/demos/) 可用通过style来设置窗口的风格，如背景颜色或图片等。如： ```xml <style name="bricks">  <normal bg_image="bricks"  bg_image_draw_type="repeat"/> </style> ``` 更多用法请参考：[theme default](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/styles/default.xml#L0)
 *
 */
public class Overlay extends Widget {
 public long nativeObj;

 public Overlay(long nativeObj) {
   super(nativeObj);
 }

 static public Overlay cast(long nativeObj) {
   return new Overlay(nativeObj);
 }


/**
 * 创建overlay对象
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
   return new Overlay(overlay_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换为overlay对象(供脚本语言使用)。
 * 
 * @param widget overlay对象。
 *
 * @returns overlay对象。
 */
 public  static Overlay cast(Widget widget)  {
   return new Overlay(overlay_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long overlay_create(long parent, int x, int y, int w, int h);
static private native long overlay_cast(long widget);
}

