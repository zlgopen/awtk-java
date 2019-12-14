package awtk;


/**
 * 左右滑动菜单控件。
 * 
 *  一般用一组按钮作为子控件，通过左右滑动改变当前的项。除了当菜单使用外，也可以用来切换页面。
 * 
 *  slide\_menu\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于slide\_menu\_t控件。
 * 
 *  在xml中使用"slide\_menu"标签创建左右滑动菜单控件。如：
 * 
 *  ```xml
 *  <slide_menu style="mask" align_v="top">
 *   <button style="slide_button" text="0"/>
 *    <button style="slide_button" text="1"/>
 *    <button style="slide_button" text="2"/>
 *    <button style="slide_button" text="3"/>
 *    <button style="slide_button" text="4"/>
 *  </slide_menu>
 *  ```
 * 
 * 更多用法请参考：[slide_menu.xml](
 *  https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/slide_menu.xml)
 * 
 *  在c代码中使用函数slide\_menu\_create创建左右滑动菜单控件。如：
 * 
 *  ```c
 *  slide_menu = slide_menu_create(win, 10, 10, 300, 60);
 *  b = button_create(slide_menu, 0, 0, 0, 0);
 *  widget_set_text_utf8(b, "1");
 *  b = button_create(slide_menu, 0, 0, 0, 0);
 *  widget_set_text_utf8(b, "2");
 *  b = button_create(slide_menu, 0, 0, 0, 0);
 *  widget_set_text_utf8(b, "3");
 *  b = button_create(slide_menu, 0, 0, 0, 0);
 *  widget_set_text_utf8(b, "4");
 *  ```
 * 
 *  可按下面的方法关注当前项改变的事件：
 * 
 *  ```c
 *  widget_on(slide_menu, EVT_VALUE_CHANGED, on_current_changed, slide_menu);
 *  ```
 * 
 *  可按下面的方法关注当前按钮被点击的事件：
 * 
 *  ```c
 *  widget_on(b, EVT_CLICK, on_button_click, b);
 *  ```
 * 
 * 完整示例请参考：[slide_menu demo](
 *  https://github.com/zlgopen/awtk-c-demos/blob/master/demos/slide_menu.c)
 * 
 *  可用通过style来设置控件的显示风格，如背景颜色和蒙版颜色等等。如：
 * 
 *  ```xml
 *  <style name="mask">
 *    <normal     bg_color="#f0f0f0" mask_color="#f0f0f0"/>
 *  </style>
 *  ```
 * 
 * 更多用法请参考：[theme default](
 *  https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/styles/default.xml#L493)
 *
 */
public class SlideMenu extends Widget {
 public long nativeObj;

 public SlideMenu(long nativeObj) {
   super(nativeObj);
 }

 static public SlideMenu cast(long nativeObj) {
   return new SlideMenu(nativeObj);
 }


/**
 * 创建slide_menu对象
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
   return new SlideMenu(slide_menu_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换slide_menu对象(供脚本语言使用)。
 * 
 * @param widget slide_menu对象。
 *
 * @returns slide_menu对象。
 */
 public  static SlideMenu cast(Widget widget)  {
   return new SlideMenu(slide_menu_cast(widget != null ? (widget.nativeObj) : 0));
 }


/**
 * 设置当前项。
 * 
 * @param widget slide_menu对象。
 * @param value 当前项的索引。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setValue(int value)  {
   return Ret.from(slide_menu_set_value(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 设置垂直对齐方式。
 * 
 * @param widget slide_menu对象。
 * @param align_v 对齐方式。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setAlignV(AlignV align_v)  {
   return Ret.from(slide_menu_set_align_v(this != null ? (this.nativeObj) : 0, align_v.value()));
 }


/**
 * 设置最小缩放比例。
 * 
 * @param widget slide_menu对象。
 * @param min_scale 最小缩放比例，范围[0.5-1]。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setMinScale(double min_scale)  {
   return Ret.from(slide_menu_set_min_scale(this != null ? (this.nativeObj) : 0, min_scale));
 }

 public AlignV getAlignV() {
   return AlignV.from(slide_menu_t_get_prop_align_v(this.nativeObj));

 }

 public double getMinScale() {
   return slide_menu_t_get_prop_min_scale(this.nativeObj);
 }

static private native long slide_menu_create(long parent, int x, int y, int w, int h);
static private native long slide_menu_cast(long widget);
static private native int slide_menu_set_value(long widget, int value);
static private native int slide_menu_set_align_v(long widget, int align_v);
static private native int slide_menu_set_min_scale(long widget, double min_scale);
static private native int slide_menu_t_get_prop_value(long nativeObj);
static private native int slide_menu_t_get_prop_align_v(long nativeObj);
static private native double slide_menu_t_get_prop_min_scale(long nativeObj);
}

