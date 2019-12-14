package awtk;


/**
 * 将draggable放入目标控件，即可让目标控件或当前窗口可以被拖动。 draggable\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于draggable\_t控件。 在xml中使用"draggable"标签创建draggable控件。如： ```xml  <button text="Drag Me" w="80" h="40" x="10" y="10">   <draggable />  </button> ``` 拖动对话框标题时移动对话框： ```xml <dialog_title x="0" y="0" w="100%" h="30" text="Hello AWTK"   <draggable drag_window="true"/> </dialog_title> ``` 更多用法请参考： [draggable.xml](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/draggable.xml) 在c代码中使用函数draggable\_create创建按钮控件。如： ```c  widget_t* draggable = draggable_create(target, 0, 0, 0, 0); ``` draggable本身不可见，故无需style。
 *
 */
public class Draggable extends Widget {
 public long nativeObj;

 public Draggable(long nativeObj) {
   super(nativeObj);
 }

 static public Draggable cast(long nativeObj) {
   return new Draggable(nativeObj);
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
 * @returns 对象。
 */
 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new Draggable(draggable_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换为draggable对象(供脚本语言使用)。
 * 
 * @param widget draggable对象。
 *
 * @returns draggable对象。
 */
 public  static Draggable cast(Widget widget)  {
   return new Draggable(draggable_cast(widget != null ? (widget.nativeObj) : 0));
 }


/**
 * 设置top。
 * 
 * @param widget widget对象。
 * @param top 拖动范围的顶部限制。缺省为父控件的顶部。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setTop(int top)  {
   return Ret.from(draggable_set_top(this != null ? (this.nativeObj) : 0, top));
 }


/**
 * 设置bottom。
 * 
 * @param widget widget对象。
 * @param bottom 拖动范围的底部限制。缺省为父控件的底部。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setBottom(int bottom)  {
   return Ret.from(draggable_set_bottom(this != null ? (this.nativeObj) : 0, bottom));
 }


/**
 * 设置left。
 * 
 * @param widget widget对象。
 * @param left 拖动范围的左边限制。缺省为父控件的左边。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setLeft(int left)  {
   return Ret.from(draggable_set_left(this != null ? (this.nativeObj) : 0, left));
 }


/**
 * 设置right。
 * 
 * @param widget widget对象。
 * @param right 拖动范围的右边限制。缺省为父控件的右边边。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setRight(int right)  {
   return Ret.from(draggable_set_right(this != null ? (this.nativeObj) : 0, right));
 }


/**
 * 设置vertical_only。
 * 
 * @param widget widget对象。
 * @param vertical_only 只允许垂直拖动。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setVerticalOnly(boolean vertical_only)  {
   return Ret.from(draggable_set_vertical_only(this != null ? (this.nativeObj) : 0, vertical_only));
 }


/**
 * 设置horizontal_only。
 * 
 * @param widget widget对象。
 * @param horizontal_only 只允许水平拖动。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setHorizontalOnly(boolean horizontal_only)  {
   return Ret.from(draggable_set_horizontal_only(this != null ? (this.nativeObj) : 0, horizontal_only));
 }


/**
 * 设置drag_window。 拖动窗口而不是父控件。比如放在对话框的titlebar上，拖动titlebar其实是希望拖动对话框。
 * 
 * @param widget widget对象。
 * @param drag_window drag_window
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setDragWindow(boolean drag_window)  {
   return Ret.from(draggable_set_drag_window(this != null ? (this.nativeObj) : 0, drag_window));
 }

 public int getTop() {
   return draggable_t_get_prop_top(this.nativeObj);
 }

 public int getBottom() {
   return draggable_t_get_prop_bottom(this.nativeObj);
 }

 public int getLeft() {
   return draggable_t_get_prop_left(this.nativeObj);
 }

 public int getRight() {
   return draggable_t_get_prop_right(this.nativeObj);
 }

 public boolean getVerticalOnly() {
   return draggable_t_get_prop_vertical_only(this.nativeObj);
 }

 public boolean getHorizontalOnly() {
   return draggable_t_get_prop_horizontal_only(this.nativeObj);
 }

 public boolean getDragWindow() {
   return draggable_t_get_prop_drag_window(this.nativeObj);
 }

static private native long draggable_create(long parent, int x, int y, int w, int h);
static private native long draggable_cast(long widget);
static private native int draggable_set_top(long widget, int top);
static private native int draggable_set_bottom(long widget, int bottom);
static private native int draggable_set_left(long widget, int left);
static private native int draggable_set_right(long widget, int right);
static private native int draggable_set_vertical_only(long widget, boolean vertical_only);
static private native int draggable_set_horizontal_only(long widget, boolean horizontal_only);
static private native int draggable_set_drag_window(long widget, boolean drag_window);
static private native int draggable_t_get_prop_top(long nativeObj);
static private native int draggable_t_get_prop_bottom(long nativeObj);
static private native int draggable_t_get_prop_left(long nativeObj);
static private native int draggable_t_get_prop_right(long nativeObj);
static private native boolean draggable_t_get_prop_vertical_only(long nativeObj);
static private native boolean draggable_t_get_prop_horizontal_only(long nativeObj);
static private native boolean draggable_t_get_prop_drag_window(long nativeObj);
}

