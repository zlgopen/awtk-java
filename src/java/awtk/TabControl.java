package awtk;


/**
 * 标签控件。
 * 
 *  它本身不提供布局功能，仅提供具有语义的标签，让xml更具有可读性。
 * 
 *  标签控件通常会包含一个pages控件和一个tab\_button\_group控件。
 * 
 *  ```graphviz
 *    [default_style]
 * 
 *    pages_t -> tab_control_t[arrowhead = "ediamond"]
 *    tab_button_group_t -> tab_control_t[arrowhead = "ediamond"]
 *    view_t ->pages_t[arrowhead = "ediamond"]
 *    tab_button_t -> tab_button_group_t[arrowhead = "ediamond"]
 *  ```
 * 
 *  tab\_control\_t是[widget\_t](widget_t.md)的子类控件，
 *  widget\_t的函数均适用于tab\_control\_t控件。
 * 
 *  在xml中使用"tab\_control"标签创建标签控件。如：
 * 
 *  ```xml
 *  <tab_control x="0" y="0" w="100%" h="100%"
 *    <pages x="c" y="20" w="90%" h="-60" value="1">
 *    ...
 *    </pages>
 *    <tab_button_group>
 *    ...
 *    </tab_button_group>
 *  </tab_control>
 *  ```
 * 
 * 更多用法请参考：
 *  [tab control](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/)
 *
 */
public class TabControl extends Widget {
 public long nativeObj;

 public TabControl(long nativeObj) {
   super(nativeObj);
 }

 static public TabControl cast(long nativeObj) {
   return new TabControl(nativeObj);
 }


/**
 * 创建tab_control对象
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
   return new TabControl(tab_control_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换tab_control对象(供脚本语言使用)。
 * 
 * @param widget tab_control对象。
 *
 * @returns tab_control对象。
 */
 public  static TabControl cast(Widget widget)  {
   return new TabControl(tab_control_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long tab_control_create(long parent, int x, int y, int w, int h);
static private native long tab_control_cast(long widget);
}

