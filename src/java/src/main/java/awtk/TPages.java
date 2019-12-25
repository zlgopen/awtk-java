package awtk;


/**
 * 页面管理控件。
 *
 *只有一个Page处于active状态，处于active状态的Page才能显示并接收事件。
 *常用于实现标签控件中的页面管理。
 *
 *pages\_t是[widget\_t](widget_t.md)的子类控件，
 *widget\_t的函数均适用于pages\_t控件。
 *
 *在xml中使用"pages"标签创建页面管理控件。如：
 *
 *```xml
 *<tab_control x="0" y="0" w="100%" h="100%"
 *<pages x="c" y="20" w="90%" h="-60" value="1">
 *...
 *</pages>
 *<tab_button_group>
 *...
 *</tab_button_group>
 *</tab_control>
 *```
 *
 *> 更多用法请参考：
 *[tab control](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/)
 *
 */
public class TPages extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TPages(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TPages cast(long nativeObj) {
   return new TPages(nativeObj);
 }


  /**
   * 创建pages对象
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
    return new TPages(pages_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为pages对象(供脚本语言使用)。
   * 
   * @param widget pages对象。
   *
   * @return pages对象。
   */
 public  static TPages cast(TWidget widget)  {
    return new TPages(pages_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 设置当前的Page。
   * 
   * @param index 当前Page的序号。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setActive(int index)  {
   return TRet.from(pages_set_active(this != null ? (this.nativeObj) : 0, index));
 }


  /**
   * 通过页面的名字设置当前的Page。
   * 
   * @param name 当前Page的名字。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setActiveByName(String name)  {
   return TRet.from(pages_set_active_by_name(this != null ? (this.nativeObj) : 0, name));
 }


  /**
   * 当前活跃的page。
   *
   */
 public int getActive() {
   return pages_t_get_prop_active(this.nativeObj);
 }

static private native long pages_create(long parent, int x, int y, int w, int h);
static private native long pages_cast(long widget);
static private native int pages_set_active(long widget, int index);
static private native int pages_set_active_by_name(long widget, String name);
static private native int pages_t_get_prop_active(long nativeObj);
};