package awtk;


/**
 * 列表项控件。
 *
 *列表项控件是一个简单的容器控件，一般作为列表视图中滚动视图的子控件。
 *
 *list\_item\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于list\_item\_t控件。
 *
 *在xml中使用"list\_item"标签创建列表项控件。如：
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
 *> 更多用法请参考：[list\_view\_m.xml](
 *https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/list_view_m.xml)
 *
 *在c代码中使用函数list\_item\_create创建列表项控件。如：
 *
 *
 *> 列表项控件大小一般由列表控制，不需指定xywh参数。
 *
 *可以用style来实现可点击或不可点击的效果。如：
 *
 *```xml
 *<style name="odd_clickable" border_color="#a0a0a0"  border="bottom" text_color="black">
 *<normal     bg_color="#f5f5f5" />
 *<pressed    bg_color="#c0c0c0" />
 *<over       bg_color="#f5f5f5" />
 *</style>
 *```
 *
 *> 更多用法请参考：[theme default](
 *https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/styles/default.xml#L372)
 *
 */
public class TListItem extends TWidget { 

/**
 * 原生对象。
 */
 public long nativeObj;


/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TListItem(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TListItem cast(long nativeObj) {
   return new TListItem(nativeObj);
 }


/**
 * 创建list_item对象
 * 
 * @param parent 父控件
 * @param x x坐标
 * @param y y坐标
 * @param w 宽度
 * @param h 高度
 
 * @return 对象。
 */
 public  static TWidget create(TWidget parent, int x, int y, int w, int h)  {
    return new TListItem(list_item_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换为list_item对象(供脚本语言使用)。
 * 
 * @param widget list_item对象。
 
 * @return list_item对象。
 */
 public  static TListItem cast(TWidget widget)  {
    return new TListItem(list_item_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long list_item_create(long parent, int x, int y, int w, int h);
static private native long list_item_cast(long widget);
};