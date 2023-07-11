package awtk;


/**
 * 将draggable放入目标控件，即可让目标控件或当前窗口可以被拖动。
 *
 *draggable\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于draggable\_t控件。
 *
 *在xml中使用"draggable"标签创建draggable控件。如：
 *
 *```xml
 *<button text="Drag Me" w="80" h="40" x="10" y="10">
 *<draggable />
 *</button>
 *```
 *
 *拖动对话框标题时移动对话框：
 *
 *```xml
 *<dialog_title x="0" y="0" w="100%" h="30" text="Hello AWTK"
 *<draggable drag_window="true"/>
 *</dialog_title>
 *```
 *
 *> 更多用法请参考：
 *[draggable.xml](https://github.com/zlgopen/awtk/blob/master/design/default/ui/draggable.xml)
 *
 *在c代码中使用函数draggable\_create创建按钮控件。如：
 *
 *
 *> draggable本身不可见，故无需style。
 *
 */
public class TDraggable extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TDraggable(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TDraggable cast(long nativeObj) {
   return new TDraggable(nativeObj);
 }


  /**
   * 创建draggable对象
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
    return new TDraggable(draggable_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为draggable对象(供脚本语言使用)。
   * 
   * @param widget draggable对象。
   *
   * @return draggable对象。
   */
 public  static TDraggable cast(TWidget widget)  {
    return new TDraggable(draggable_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 设置top。
   * 
   * @param top 拖动范围的顶部限制。缺省为父控件的顶部。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setTop(int top)  {
   return TRet.from(draggable_set_top(this != null ? (this.nativeObj) : 0, top));
 }


  /**
   * 设置bottom。
   * 
   * @param bottom 拖动范围的底部限制。缺省为父控件的底部。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setBottom(int bottom)  {
   return TRet.from(draggable_set_bottom(this != null ? (this.nativeObj) : 0, bottom));
 }


  /**
   * 设置left。
   * 
   * @param left 拖动范围的左边限制。缺省为父控件的左边。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setLeft(int left)  {
   return TRet.from(draggable_set_left(this != null ? (this.nativeObj) : 0, left));
 }


  /**
   * 设置right。
   * 
   * @param right 拖动范围的右边限制。缺省为父控件的右边边。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setRight(int right)  {
   return TRet.from(draggable_set_right(this != null ? (this.nativeObj) : 0, right));
 }


  /**
   * 设置vertical_only。
   * 
   * @param vertical_only 只允许垂直拖动。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setVerticalOnly(boolean vertical_only)  {
   return TRet.from(draggable_set_vertical_only(this != null ? (this.nativeObj) : 0, vertical_only));
 }


  /**
   * 设置horizontal_only。
   * 
   * @param horizontal_only 只允许水平拖动。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setHorizontalOnly(boolean horizontal_only)  {
   return TRet.from(draggable_set_horizontal_only(this != null ? (this.nativeObj) : 0, horizontal_only));
 }


  /**
   * 设置是否无范围限制拖动。
   *备注：可以让窗口拖动到外面去。
   * 
   * @param allow_out_of_screen 是否无范围限制拖动。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setAllowOutOfScreen(boolean allow_out_of_screen)  {
   return TRet.from(draggable_set_allow_out_of_screen(this != null ? (this.nativeObj) : 0, allow_out_of_screen));
 }


  /**
   * 设置drag_window。
   *拖动窗口而不是父控件。比如放在对话框的titlebar上，拖动titlebar其实是希望拖动对话框。
   * 
   * @param drag_window 是否拖动窗口。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setDragWindow(boolean drag_window)  {
   return TRet.from(draggable_set_drag_window(this != null ? (this.nativeObj) : 0, drag_window));
 }


  /**
   * 设置drag_native_window。
   * 
   * @param drag_native_window 是否拖动原生窗口。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setDragNativeWindow(boolean drag_native_window)  {
   return TRet.from(draggable_set_drag_native_window(this != null ? (this.nativeObj) : 0, drag_native_window));
 }


  /**
   * 设置drag_parent。
   *拖动窗口而不是父控件。比如放在对话框的titlebar上，拖动titlebar其实是希望拖动对话框。
   * 
   * @param drag_parent 0表示直系父控件，1表示父控件的父控件，依次类推。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setDragParent(int drag_parent)  {
   return TRet.from(draggable_set_drag_parent(this != null ? (this.nativeObj) : 0, drag_parent));
 }


  /**
   * 拖动范围的顶部限制。缺省为父控件的顶部。
   *
   */
 public int getTop() {
   return draggable_t_get_prop_top(this.nativeObj);
 }


  /**
   * 拖动范围的底部限制。缺省为父控件的底部。
   *
   */
 public int getBottom() {
   return draggable_t_get_prop_bottom(this.nativeObj);
 }


  /**
   * 拖动范围的左边限制。缺省为父控件的左边。
   *
   */
 public int getLeft() {
   return draggable_t_get_prop_left(this.nativeObj);
 }


  /**
   * 拖动范围的右边限制。缺省为父控件的右边边。
   *
   */
 public int getRight() {
   return draggable_t_get_prop_right(this.nativeObj);
 }


  /**
   * 支持超出原生窗口边界拖动。（无法完全移出原生窗口，同时优先受到拖动范围限制的影响）
   *
   */
 public boolean getAllowOutOfScreen() {
   return draggable_t_get_prop_allow_out_of_screen(this.nativeObj);
 }


  /**
   * 只允许垂直拖动。
   *
   */
 public boolean getVerticalOnly() {
   return draggable_t_get_prop_vertical_only(this.nativeObj);
 }


  /**
   * 只允许水平拖动。
   *
   */
 public boolean getHorizontalOnly() {
   return draggable_t_get_prop_horizontal_only(this.nativeObj);
 }


  /**
   * 拖动窗口而不是父控件。比如放在对话框的titlebar上，拖动titlebar其实是希望拖动对话框。
   *
   */
 public boolean getDragWindow() {
   return draggable_t_get_prop_drag_window(this.nativeObj);
 }


  /**
   * 拖动原生窗口。
   *
   */
 public boolean getDragNativeWindow() {
   return draggable_t_get_prop_drag_native_window(this.nativeObj);
 }


  /**
   * 拖动父控件。0表示直系父控件，1表示父控件的父控件，依次类推。
   *
   */
 public int getDragParent() {
   return draggable_t_get_prop_drag_parent(this.nativeObj);
 }

static private native long draggable_create(long parent, int x, int y, int w, int h);
static private native long draggable_cast(long widget);
static private native int draggable_set_top(long widget, int top);
static private native int draggable_set_bottom(long widget, int bottom);
static private native int draggable_set_left(long widget, int left);
static private native int draggable_set_right(long widget, int right);
static private native int draggable_set_vertical_only(long widget, boolean vertical_only);
static private native int draggable_set_horizontal_only(long widget, boolean horizontal_only);
static private native int draggable_set_allow_out_of_screen(long widget, boolean allow_out_of_screen);
static private native int draggable_set_drag_window(long widget, boolean drag_window);
static private native int draggable_set_drag_native_window(long widget, boolean drag_native_window);
static private native int draggable_set_drag_parent(long widget, int drag_parent);
static private native int draggable_t_get_prop_top(long nativeObj);
static private native int draggable_t_get_prop_bottom(long nativeObj);
static private native int draggable_t_get_prop_left(long nativeObj);
static private native int draggable_t_get_prop_right(long nativeObj);
static private native boolean draggable_t_get_prop_allow_out_of_screen(long nativeObj);
static private native boolean draggable_t_get_prop_vertical_only(long nativeObj);
static private native boolean draggable_t_get_prop_horizontal_only(long nativeObj);
static private native boolean draggable_t_get_prop_drag_window(long nativeObj);
static private native boolean draggable_t_get_prop_drag_native_window(long nativeObj);
static private native int draggable_t_get_prop_drag_parent(long nativeObj);
};