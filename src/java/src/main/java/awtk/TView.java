package awtk;


/**
 * 一个通用的容器控件。
 *
 *它本身不提供布局功能，仅提供具有语义的标签，让xml更具有可读性。
 *子控件的布局可用layout\_children属性指定。
 *请参考[布局参数](https://github.com/zlgopen/awtk/blob/master/docs/layout.md)。
 *
 *view\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于view\_t控件。
 *
 *在xml中使用"view"标签创建view。如：
 *
 *```xml
 *<view x="0" y="0" w="100%" h="100%" children_layout="default(c=2,r=2,m=5,s=5)">
 *</view>
 *```
 *
 *可用通过style来设置控件的显示风格，如背景颜色等。如：
 *
 *```xml
 *<style name="default" border_color="#a0a0a0">
 *<normal     bg_color="#f0f0f0" />
 *</style>
 *```
 *
 */
public class TView extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TView(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TView cast(long nativeObj) {
   return new TView(nativeObj);
 }


  /**
   * 创建view对象
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
    return new TView(view_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 设置缺省获得焦点的子控件(可用控件名或类型)。
   * 
   * @param default_focused_child 缺省获得焦点的子控件(可用控件名或类型)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setDefaultFocusedChild(String default_focused_child)  {
   return TRet.from(view_set_default_focused_child(this != null ? (this.nativeObj) : 0, default_focused_child));
 }


  /**
   * 转换为view对象(供脚本语言使用)。
   * 
   * @param widget view对象。
   *
   * @return view对象。
   */
 public  static TView cast(TWidget widget)  {
    return new TView(view_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 缺省获得焦点的子控件(可用控件名或类型)。(该属性废弃。)
   *
   *> view作为pages/slideview的直接子控件才需要设置。
   *> 正常情况下，一个窗口只能指定一个初始焦点。
   *> 但是对于pages/slideview来说，可能希望每一个页面都有一个初始焦点，此时可用default\_focused\_child来指定。
   *
   */
 public String getDefaultFocusedChild() {
   return view_t_get_prop_default_focused_child(this.nativeObj);
 }

static private native long view_create(long parent, int x, int y, int w, int h);
static private native int view_set_default_focused_child(long widget, String default_focused_child);
static private native long view_cast(long widget);
static private native String view_t_get_prop_default_focused_child(long nativeObj);
};