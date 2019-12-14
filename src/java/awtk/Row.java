package awtk;


/**
 * row。一个简单的容器控件，用于水平排列其子控件。
 * 
 *  它本身不提供布局功能，仅提供具有语义的标签，让xml更具有可读性。
 *  子控件的布局可用layout\_children属性指定。
 *  请参考[布局参数](https://github.com/zlgopen/awtk/blob/master/docs/layout.md)。
 * 
 *  row\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于row\_t控件。
 * 
 *  在xml中使用"row"标签创建row。如：
 * 
 *  ```xml
 *   <row x="0" y="0" w="100%" h="100%" children_layout="default(c=0,r=1)">
 *      <button name="open:basic" text="Basic"/>
 *      <button name="open:button" text="Buttons"/>
 *      <button name="open:edit" text="Edits"/>
 *      <button name="open:keyboard" text="KeyBoard"/>
 *    </row>
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
public class Row extends Widget {
 public long nativeObj;

 public Row(long nativeObj) {
   super(nativeObj);
 }

 static public Row cast(long nativeObj) {
   return new Row(nativeObj);
 }


/**
 * 创建row对象
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
   return new Row(row_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换为row对象(供脚本语言使用)。
 * 
 * @param widget row对象。
 *
 * @returns row对象。
 */
 public  static Row cast(Widget widget)  {
   return new Row(row_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long row_create(long parent, int x, int y, int w, int h);
static private native long row_cast(long widget);
}

