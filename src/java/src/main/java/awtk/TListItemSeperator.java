package awtk;


/**
 * list_item_seperator。
 *用来模拟实现风琴控件(accordion)和属性页分组控件。
 *> 当前控件被点击时，显示/隐藏当前控件到下一个分隔符控件之间的控件。
 *list_item_seperator\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于list_item_seperator\_t控件。
 *
 *在xml中使用"list_item_seperator"标签创建list_item_seperator。如：
 *
 *```xml
 *<list_item_seperator radio="true" text="Group2" h="32"/>
 *<list_item style="empty" children_layout="default(r=1,c=0,ym=1)">
 *<label w="30%" text="ASCII"/>
 *<edit w="70%" text="" tips="ascii" input_type="ascii" focused="true" action_text="next"/>
 *</list_item>
 *<list_item style="empty" children_layout="default(r=1,c=0,ym=1)">
 *<label w="30%" text="Int"/>
 *<edit w="70%" text="" tips="int" input_type="int"/>
 *</list_item>
 *
 *<list_item_seperator radio="true" text="Group3" h="32"/>
 *<list_item style="empty" children_layout="default(r=1,c=0,ym=1)">
 *<label w="30%" text="Float"/>
 *<edit w="70%" text="" tips="float" input_type="float"/>
 *</list_item>
 *<list_item style="empty" children_layout="default(r=1,c=0,ym=1)">
 *<label w="30%" text="UFloat"/>
 *<edit w="70%" text="" tips="unsigned float" input_type="ufloat"/>
 *</list_item>
 *```
 *
 *可用通过style来设置控件的显示风格，如背景颜色等。如：
 *
 *```xml
 *<list_item_seperator text_color="black" bg_color="#e0e0e0">
 *<style name="default" icon_at="left">
 *<normal  icon="collapse" />
 *<pressed icon="collapse" />
 *<over    icon="collapse" text_color="green"/>
 *<focused icon="collapse" text_color="green"/>
 *<normal_of_checked icon="expand" text_color="blue"/>
 *<pressed_of_checked icon="expand" text_color="blue"/>
 *<over_of_checked icon="expand" text_color="green"/>
 *<focused_of_checked icon="expand" text_color="green"/>
 *</style>
 *</list_item_seperator>
 *```
 *
 */
public class TListItemSeperator extends TCheckButton { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TListItemSeperator(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TListItemSeperator cast(long nativeObj) {
   return new TListItemSeperator(nativeObj);
 }


  /**
   * 创建list_item_seperator对象
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
    return new TListItemSeperator(list_item_seperator_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为list_item_seperator对象(供脚本语言使用)。
   * 
   * @param widget list_item_seperator对象。
   *
   * @return list_item_seperator对象。
   */
 public  static TListItemSeperator cast(TWidget widget)  {
    return new TListItemSeperator(list_item_seperator_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long list_item_seperator_create(long parent, int x, int y, int w, int h);
static private native long list_item_seperator_cast(long widget);
};