package awtk;


/**
 * grid控件。一个简单的容器控件，用于网格排列一组控件。
 * 
 *  它本身不提供布局功能，仅提供具有语义的标签，让xml更具有可读性。
 *  子控件的布局可用layout\_children属性指定。
 *  请参考[布局参数](https://github.com/zlgopen/awtk/blob/master/docs/layout.md)。
 * 
 *  grid\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于grid\_t控件。
 * 
 *  在xml中使用"grid"标签创建grid。如：
 * 
 *  ```xml
 *   <grid x="0" y="0" w="100%" h="100%" children_layout="default(c=2,r=2,m=5,s=5)">
 *      <button name="open:basic" text="Basic"/>
 *      <button name="open:button" text="Buttons"/>
 *      <button name="open:edit" text="Edits"/>
 *      <button name="open:keyboard" text="KeyBoard"/>
 *    </grid>
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
public class Grid extends Widget {
 public long nativeObj;

 public Grid(long nativeObj) {
   super(nativeObj);
 }

 static public Grid cast(long nativeObj) {
   return new Grid(nativeObj);
 }


/**
 * 创建grid对象
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
   return new Grid(grid_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换为grid对象(供脚本语言使用)。
 * 
 * @param widget grid对象。
 *
 * @returns grid对象。
 */
 public  static Grid cast(Widget widget)  {
   return new Grid(grid_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long grid_create(long parent, int x, int y, int w, int h);
static private native long grid_cast(long widget);
}

