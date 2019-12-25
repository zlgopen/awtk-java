package awtk;


/**
 * 列表视图控件。
 *
 *列表视图控件是一个可以垂直滚动的列表控件。
 *
 *如果不需要滚动，可以用view控件配置适当的layout参数作为列表控件。
 *
 *列表视图中的列表项可以固定高度，也可以使用不同高度。请参考[变高列表项](
 *https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/list_view_vh.xml)
 *
 *列表视图控件的中可以有滚动条，也可以没有滚动条。
 *可以使用移动设备风格的滚动条，也可以使用桌面风格的滚动条。
 *
 *list\_view\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于list\_view\_t控件。
 *
 *在xml中使用"list\_view"标签创建列表视图控件。如：
 *
 *```xml
 *<list_view x="0"  y="30" w="100%" h="-80" item_height="60">
 *<scroll_view name="view" x="0"  y="0" w="100%" h="100%">
 *<list_item style="odd" children_layout="default(rows=1,cols=0)">
 *<image draw_type="icon" w="30" image="earth"/>
 *<label w="-30" text="1.Hello AWTK !">
 *<switch x="r:10" y="m" w="60" h="20"/>
 *</label>
 *</list_item>
 *...
 *</scroll_view>
 *</list_view>
 *```
 *
 *> 注意：列表项不是作为列表视图控件的直接子控件，而是作为滚动视图的子控件。
 *
 *
 *> 更多用法请参考：[list\_view\_m.xml](
 *https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/list_view_m.xml)
 *
 *在c代码中使用函数list\_view\_create创建列表视图控件。如：
 *
 *
 *用代码构造列表视图是比较繁琐的事情，最好用XML来构造。
 *如果需要动态修改，可以使用widget\_clone来增加列表项，使用widget\_remove\_child来移出列表项。
 *
 *可用通过style来设置控件的显示风格，如背景颜色和边框颜色等(一般情况不需要)。
 *
 */
public class TListView extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TListView(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TListView cast(long nativeObj) {
   return new TListView(nativeObj);
 }


  /**
   * 创建list_view对象
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
    return new TListView(list_view_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 设置列表项的高度。
   * 
   * @param item_height 列表项的高度。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setItemHeight(int item_height)  {
   return TRet.from(list_view_set_item_height(this != null ? (this.nativeObj) : 0, item_height));
 }


  /**
   * 设置列表项的缺省高度。
   * 
   * @param default_item_height 列表项的高度。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setDefaultItemHeight(int default_item_height)  {
   return TRet.from(list_view_set_default_item_height(this != null ? (this.nativeObj) : 0, default_item_height));
 }


  /**
   * 设置是否自动隐藏滚动条。
   * 
   * @param auto_hide_scroll_bar 是否自动隐藏滚动条。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setAutoHideScrollBar(boolean auto_hide_scroll_bar)  {
   return TRet.from(list_view_set_auto_hide_scroll_bar(this != null ? (this.nativeObj) : 0, auto_hide_scroll_bar));
 }


  /**
   * 转换为list_view对象(供脚本语言使用)。
   * 
   * @param widget list_view对象。
   *
   * @return list_view对象。
   */
 public  static TListView cast(TWidget widget)  {
    return new TListView(list_view_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 列表项的高度。如果 item_height 0，所有列表项使用固定高度，否则使用列表项自身的高度。
   *
   */
 public int getItemHeight() {
   return list_view_t_get_prop_item_height(this.nativeObj);
 }


  /**
   * 列表项的缺省高度。如果item_height <= 0 而且列表项自身的高度 <= 0，则使用缺省高度。
   *
   */
 public int getDefaultItemHeight() {
   return list_view_t_get_prop_default_item_height(this.nativeObj);
 }


  /**
   * 如果不需要滚动条时，自动隐藏滚动条。
   *
   */
 public boolean getAutoHideScrollBar() {
   return list_view_t_get_prop_auto_hide_scroll_bar(this.nativeObj);
 }

static private native long list_view_create(long parent, int x, int y, int w, int h);
static private native int list_view_set_item_height(long widget, int item_height);
static private native int list_view_set_default_item_height(long widget, int default_item_height);
static private native int list_view_set_auto_hide_scroll_bar(long widget, boolean auto_hide_scroll_bar);
static private native long list_view_cast(long widget);
static private native int list_view_t_get_prop_item_height(long nativeObj);
static private native int list_view_t_get_prop_default_item_height(long nativeObj);
static private native boolean list_view_t_get_prop_auto_hide_scroll_bar(long nativeObj);
};