package awtk;


/**
 * 弹出窗口。
 * 
 *  弹出窗口是一种特殊的窗口，大小和位置可以自由设置，主要用来实现右键菜单和combo\_box的下列列表等功能。
 * 
 *  popup\_t是[window\_base\_t](window_base_t.md)的子类控件，window\_base\_t的函数均适用于popup\_t控件。
 * 
 *  在xml中使用"popup"标签创建弹出窗口。如：
 * 
 *  ```xml
 *  <popup close_when_click_outside="true" x="c" y="m" w="80%" h="80"
 *  <list_view x="0"  y="0" w="100%" h="100%" item_height="30">
 *    <scroll_view name="view" x="0"  y="0" w="-12" h="100%">
 *      <combo_box_item tr_text="english"/>
 *      <combo_box_item tr_text="chinese" />
 *    </scroll_view>
 *    <scroll_bar_d name="bar" x="right" y="0" w="12" h="100%" value="0"/>
 *  </list_view>
 *  </popup>
 *  ```
 * 
 *
 *  更多用法请参考：[popup](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/)
 * 
 *  在c代码中使用函数popup\_create创建弹出窗口。如：
 * 
 *  ```c
 *  widget_t* win = popup_create(NULL, 0, 0, w, h);
 *  popup_set_close_when_click_outside(win, TRUE);
 *  ```
 * 
 * 创建之后，和使用普通窗口是一样的。
 * 
 * 完整示例请参考：[combo_box.c](https://github.com/zlgopen/awtk-c-demos/blob/master/demos/combo_box.c)
 * 
 *  可用通过style来设置控件的显示风格，如字体的大小和颜色等等。如：
 * 
 *  ```xml
 *  <popup>
 *   <style name="default" border_color="#a0a0a0">
 *     <normal bg_color="#f0f0f0"/>
 *   </style>
 *  </popup>
 *  ```
 * 
 * 更多用法请参考：[theme
 *  default](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/styles/default.xml#L324)
 *
 */
public class Popup extends WindowBase {
 public long nativeObj;

 public Popup(long nativeObj) {
   super(nativeObj);
 }

 static public Popup cast(long nativeObj) {
   return new Popup(nativeObj);
 }


/**
 * 创建popup对象。
 * 
 * @param parent 父控件
 * @param x x坐标
 * @param y y坐标
 * @param w 宽度
 * @param h 高度
 *
 * @returns popup对象。
 */
 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new Popup(popup_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换为popup对象(供脚本语言使用)。
 * 
 * @param widget popup对象。
 *
 * @returns popup对象。
 */
 public  static Popup cast(Widget widget)  {
   return new Popup(popup_cast(widget != null ? (widget.nativeObj) : 0));
 }


/**
 * 设置点击时是否关闭窗口。
 * 
 * @param widget 控件对象。
 * @param close_when_click 点击时是否关闭窗口。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setCloseWhenClick(boolean close_when_click)  {
   return Ret.from(popup_set_close_when_click(this != null ? (this.nativeObj) : 0, close_when_click));
 }


/**
 * 设置点击窗口外部时是否关闭窗口。
 * 
 * @param widget 控件对象。
 * @param close_when_click_outside 点击窗口外部时是否关闭窗口。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setCloseWhenClickOutside(boolean close_when_click_outside)  {
   return Ret.from(popup_set_close_when_click_outside(this != null ? (this.nativeObj) : 0, close_when_click_outside));
 }

 public boolean getCloseWhenClick() {
   return popup_t_get_prop_close_when_click(this.nativeObj);
 }

 public boolean getCloseWhenClickOutside() {
   return popup_t_get_prop_close_when_click_outside(this.nativeObj);
 }

static private native long popup_create(long parent, int x, int y, int w, int h);
static private native long popup_cast(long widget);
static private native int popup_set_close_when_click(long widget, boolean close_when_click);
static private native int popup_set_close_when_click_outside(long widget, boolean close_when_click_outside);
static private native boolean popup_t_get_prop_close_when_click(long nativeObj);
static private native boolean popup_t_get_prop_close_when_click_outside(long nativeObj);
}

