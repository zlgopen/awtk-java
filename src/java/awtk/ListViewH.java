package awtk;


/**
 * 水平列表视图控件。
 * 
 *  list\_view\_h\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于list\_view\_h\_t控件。
 * 
 *  在xml中使用"list\_view\_h"标签创建水平列表视图控件。如：
 * 
 *  ```xml
 *  <list_view_h x="center"  y="10" w="90%" h="100" item_width="200" spacing="5">
 *    <scroll_view name="view" w="100%" h="100%">
 *      <image style="border" draw_type="auto" image="1" text="1"/>
 *      ...
 *    </scroll_view>
 *  </list_view_h>
 *  ```
 * 
 * 注意：列表项不是作为列表视图控件的直接子控件，而是作为滚动视图的子控件。
 * 
 * 
 * 更多用法请参考：[list\_view\_h.xml](
 * https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/list_view_h.xml)
 * 
 *  在c代码中使用函数list\_view\_h\_create创建水平列表视图控件。如：
 * 
 *  ```c
 *   widget_t* list_view = list_view_h_create(win, 0, 0, 0, 0);
 *  ```
 * 
 *  用代码构造列表视图是比较繁琐的事情，最好用XML来构造。
 *  如果需要动态修改，可以使用widget\_clone来增加列表项，使用widget\_remove\_child来移出列表项。
 * 
 *  可用通过style来设置控件的显示风格，如背景颜色和边框颜色等(一般情况不需要)。
 *
 */
public class ListViewH extends Widget {
 public long nativeObj;

 public ListViewH(long nativeObj) {
   super(nativeObj);
 }

 static public ListViewH cast(long nativeObj) {
   return new ListViewH(nativeObj);
 }


/**
 * 创建list_view_h对象
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
   return new ListViewH(list_view_h_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 设置列表项的宽度。
 * 
 * @param widget 控件对象。
 * @param item_width 列表项的宽度。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setItemWidth(int item_width)  {
   return Ret.from(list_view_h_set_item_width(this != null ? (this.nativeObj) : 0, item_width));
 }


/**
 * 设置列表项的间距。
 * 
 * @param widget 控件对象。
 * @param spacing 列表项的间距。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setSpacing(int spacing)  {
   return Ret.from(list_view_h_set_spacing(this != null ? (this.nativeObj) : 0, spacing));
 }


/**
 * 转换为list_view_h对象(供脚本语言使用)。
 * 
 * @param widget list_view_h对象。
 *
 * @returns list_view_h对象。
 */
 public  static ListViewH cast(Widget widget)  {
   return new ListViewH(list_view_h_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public int getItemWidth() {
   return list_view_h_t_get_prop_item_width(this.nativeObj);
 }

 public int getSpacing() {
   return list_view_h_t_get_prop_spacing(this.nativeObj);
 }

static private native long list_view_h_create(long parent, int x, int y, int w, int h);
static private native int list_view_h_set_item_width(long widget, int item_width);
static private native int list_view_h_set_spacing(long widget, int spacing);
static private native long list_view_h_cast(long widget);
static private native int list_view_h_t_get_prop_item_width(long nativeObj);
static private native int list_view_h_t_get_prop_spacing(long nativeObj);
}

