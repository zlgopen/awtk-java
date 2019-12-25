package awtk;


/**
 * column。一个简单的容器控件，垂直排列其子控件。
 *
 *它本身不提供布局功能，仅提供具有语义的标签，让xml更具有可读性。
 *子控件的布局可用layout\_children属性指定。
 *请参考[布局参数](https://github.com/zlgopen/awtk/blob/master/docs/layout.md)。
 *
 *column\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于column\_t控件。
 *
 *在xml中使用"column"标签创建column。如：
 *
 *```xml
 *<column x="0" y="0" w="100%" h="100%" children_layout="default(c=1,r=0)">
 *<button name="open:basic" text="Basic"/>
 *<button name="open:button" text="Buttons"/>
 *<button name="open:edit" text="Edits"/>
 *<button name="open:keyboard" text="KeyBoard"/>
 *</column>
 *```
 *
 *可用通过style来设置控件的显示风格，如背景颜色等。如：
 *
 *```xml
 *<style name="default" border_color="#a0a0a0">
 *<normal     bg_color="#f0f0f0" />
 *</style>
 *```
 *
 */
public class TColumn extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TColumn(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TColumn cast(long nativeObj) {
   return new TColumn(nativeObj);
 }


  /**
   * 创建column对象
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
    return new TColumn(column_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为column对象(供脚本语言使用)。
   * 
   * @param widget column对象。
   *
   * @return column对象。
   */
 public  static TColumn cast(TWidget widget)  {
    return new TColumn(column_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long column_create(long parent, int x, int y, int w, int h);
static private native long column_cast(long widget);
};