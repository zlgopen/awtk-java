package awtk;


/**
 * 标签按钮分组控件。
 *
 *一个简单的容器，主要用于对标签按钮进行布局和管理。
 *
 *tab\_button\_group\_t是[widget\_t](widget_t.md)的子类控件，
 *widget\_t的函数均适用于tab\_button\_group\_t控件。
 *
 *在xml中使用"tab\_button\_group"标签创建标签按钮分组控件。如：
 *
 *```xml
 *<tab_button_group x="c" y="bottom:10" w="90%" h="30" compact="true"
 *<tab_button text="General"/>
 *<tab_button text="Network" value="true" />
 *<tab_button text="Security"/>
 *</tab_button_group>
 *```
 *
 *> 更多用法请参考：
 *[tab control](https://github.com/zlgopen/awtk/blob/master/design/default/ui/)
 *
 *可用通过style来设置控件的显示风格，如颜色等等。如：
 *
 *```xml
 *<tab_button_group>
 *<style name="default">
 *<normal/>
 *</style>
 *</tab_button_group>
 *```
 *
 */
public class TTabButtonGroup extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TTabButtonGroup(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TTabButtonGroup cast(long nativeObj) {
   return new TTabButtonGroup(nativeObj);
 }


  /**
   * 创建tab_button_group对象
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
    return new TTabButtonGroup(tab_button_group_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 设置compact。
   * 
   * @param compact 是否使用紧凑布局(缺省FALSE)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setCompact(boolean compact)  {
   return TRet.from(tab_button_group_set_compact(this != null ? (this.nativeObj) : 0, compact));
 }


  /**
   * 设置scrollable。
   * 
   * @param scrollable 是否允许滚动(缺省FALSE)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setScrollable(boolean scrollable)  {
   return TRet.from(tab_button_group_set_scrollable(this != null ? (this.nativeObj) : 0, scrollable));
 }


  /**
   * 设置拖拽 tab_button 控件位置。
   * 
   * @param drag_child 是否拖拽(缺省FALSE)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setDragChild(boolean drag_child)  {
   return TRet.from(tab_button_group_set_drag_child(this != null ? (this.nativeObj) : 0, drag_child));
 }


  /**
   * 设置删除 tab_button_group 控件中的 tab_button 控件和对应页。
   * 
   * @param index tab_button 的序号。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet removeIndex(int index)  {
   return TRet.from(tab_button_group_remove_index(this != null ? (this.nativeObj) : 0, index));
 }


  /**
   * 转换tab_button_group对象(供脚本语言使用)。
   * 
   * @param widget tab_button_group对象。
   *
   * @return tab_button_group对象。
   */
 public  static TTabButtonGroup cast(TWidget widget)  {
    return new TTabButtonGroup(tab_button_group_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 紧凑型排版子控件(缺省FALSE)。
   *
   */
 public boolean getCompact() {
   return tab_button_group_t_get_prop_compact(this.nativeObj);
 }


  /**
   * 是否支持滚动(缺省FALSE)。
   *
   *> 紧凑型排版子控件时才支持滚动。
   *
   */
 public boolean getScrollable() {
   return tab_button_group_t_get_prop_scrollable(this.nativeObj);
 }


  /**
   * 是否支持拖拽并且修改 tab_button 控件的位置(缺省FALSE)。
   *
   *> 紧凑型排版子控件时才支持滚动，开启该功能后，就不能拖拽滚动了，只能鼠标滚轮滚动了。
   *
   */
 public boolean getDragChild() {
   return tab_button_group_t_get_prop_drag_child(this.nativeObj);
 }

static private native long tab_button_group_create(long parent, int x, int y, int w, int h);
static private native int tab_button_group_set_compact(long widget, boolean compact);
static private native int tab_button_group_set_scrollable(long widget, boolean scrollable);
static private native int tab_button_group_set_drag_child(long widget, boolean drag_child);
static private native int tab_button_group_remove_index(long widget, int index);
static private native long tab_button_group_cast(long widget);
static private native boolean tab_button_group_t_get_prop_compact(long nativeObj);
static private native boolean tab_button_group_t_get_prop_scrollable(long nativeObj);
static private native boolean tab_button_group_t_get_prop_drag_child(long nativeObj);
};