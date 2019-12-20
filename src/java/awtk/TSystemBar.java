package awtk;


/**
 * system\_bar窗口。
 *
 *system\_bar窗口是一种特殊的窗口，独占LCD顶部区域，用来显示当前窗口的标题和关闭按钮等内容。
 *
 *> system\_bar窗口需要在打开第一个应用程序窗口之前打开。
 *
 *system_bar对两个子控件会做特殊处理：
 *
 ** 1.名为"title"的label控件，自动显示当前主窗口的name或text。
 ** 2.名为"close"的button控件，点击之后向当前主窗口发送EVT\_REQUEST\_CLOSE\_WINDOW消息。
 *
 *system\_bar\_t是[window\_base\_t](window_base_t.md)的子类控件，
 *window\_base\_t的函数均适用于system\_bar\_t控件。
 *
 *在xml中使用"system\_bar"标签创建system\_bar窗口。如：
 *
 *```xml
 *<system_bar h="30">
 *<column x="0" y="0" w="-40" h="100%">
 *<label style="title" x="10" y="m" w="55%" h="100%" name="title"/>
 *<digit_clock style="time" x="r" y="m" w="40%" h="100%" format="hh:mm"/>
 *</column>
 *<button style="close" x="r:5" y="m" w="26" h="26" name="close" text="x"/>
 *</system_bar>
 *```
 *
 *> 更多用法请参考：
 *[system_bar](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/system_bar.xml)
 *
 *在c代码中使用函数system\_bar\_create创建system\_bar窗口。如：
 *
 *
 *> 创建之后，和使用普通窗口是一样的。
 *
 *可用通过style来设置控件的显示风格，如背景颜色等等。如：
 *
 *```xml
 *<system_bar>
 *<style name="default">
 *<normal bg_color="#a0a0a0"/>
 *</style>
 *</system_bar>
 *```
 *
 *> 更多用法请参考：
 *[system_bar.xml](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/styles/system_bar.xml)
 *
 */
public class TSystemBar extends TWindowBase { 

/**
 * 原生对象。
 */

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TSystemBar(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TSystemBar cast(long nativeObj) {
   return new TSystemBar(nativeObj);
 }


/**
 * 创建system_bar对象。
 * 
 * @param parent 父控件
 * @param x x坐标
 * @param y y坐标
 * @param w 宽度
 * @param h 高度
 
 * @return system_bar对象。
 */
 public  static TWidget create(TWidget parent, int x, int y, int w, int h)  {
    return new TSystemBar(system_bar_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换为system_bar对象(供脚本语言使用)。
 * 
 * @param widget system_bar对象。
 
 * @return system_bar对象。
 */
 public  static TSystemBar cast(TWidget widget)  {
    return new TSystemBar(system_bar_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long system_bar_create(long parent, int x, int y, int w, int h);
static private native long system_bar_cast(long widget);
};