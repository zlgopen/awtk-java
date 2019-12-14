package awtk;


/**
 * app_bar控件。
 * 
 *  一个简单的容器控件，一般在窗口的顶部，用于显示本窗口的状态和信息。
 * 
 *  它本身不提供布局功能，仅提供具有语义的标签，让xml更具有可读性。
 *  子控件的布局可用layout\_children属性指定。
 *  请参考[布局参数](https://github.com/zlgopen/awtk/blob/master/docs/layout.md)。
 * 
 *  app\_bar\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于app\_bar\_t控件。
 * 
 *  在xml中使用"app\_bar"标签创建app\_bar。如：
 * 
 *  ```xml
 *  <app_bar x="0" y="0" w="100%" h="30"
 *    <label x="0" y="0" w="100%" h="100%" text="Basic Controls" />
 *  </app_bar>
 *  ```
 * 
 *  在c代码中使用函数app\_bar\_create创建app\_bar。如：
 * 
 *  ```c
 *   widget_t* app_bar = app_bar_create(win, 0, 0, 320, 30);
 *  ```
 * 
 *  可用通过style来设置控件的显示风格，如背景颜色等。如：
 * 
 *  ```xml
 *  <style name="default" border_color="#a0a0a0">
 *    <normal     bg_color="#f0f0f0" />
 *  </style>
 *  ```
 *
 */
public class AppBar extends Widget {
 public long nativeObj;

 public AppBar(long nativeObj) {
   super(nativeObj);
 }

 static public AppBar cast(long nativeObj) {
   return new AppBar(nativeObj);
 }


/**
 * 创建app_bar对象
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
   return new AppBar(app_bar_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换为app_bar对象(供脚本语言使用)。
 * 
 * @param widget app_bar对象。
 *
 * @returns app_bar对象。
 */
 public  static AppBar cast(Widget widget)  {
   return new AppBar(app_bar_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long app_bar_create(long parent, int x, int y, int w, int h);
static private native long app_bar_cast(long widget);
}

