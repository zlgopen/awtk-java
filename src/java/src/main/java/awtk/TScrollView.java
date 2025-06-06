package awtk;


/**
 * 滚动视图。
 *
 *scroll\_view\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于scroll\_view\_t控件。
 *
 *在xml中使用"scroll\_view"标签创建滚动视图控件。如：
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
 *> 滚动视图一般作为列表视图的子控件使用。
 *
 *> 更多用法请参考：[list\_view\_m.xml](
 *https://github.com/zlgopen/awtk/blob/master/design/default/ui/list_view_m.xml)
 *
 *在c代码中使用函数scroll\_view\_create创建列表视图控件。如：
 *
 *
 *
 *可用通过style来设置控件的显示风格，如背景颜色和边框颜色等(一般情况不需要)。
 *
 */
public class TScrollView extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TScrollView(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TScrollView cast(long nativeObj) {
   return new TScrollView(nativeObj);
 }


  /**
   * 创建scroll_view对象
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
    return new TScrollView(scroll_view_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为scroll_view对象(供脚本语言使用)。
   * 
   * @param widget scroll_view对象。
   *
   * @return scroll_view对象。
   */
 public  static TScrollView cast(TWidget widget)  {
    return new TScrollView(scroll_view_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 设置虚拟宽度。
   * 
   * @param w 虚拟宽度。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setVirtualW(int w)  {
   return TRet.from(scroll_view_set_virtual_w(this != null ? (this.nativeObj) : 0, w));
 }


  /**
   * 设置虚拟高度。
   * 
   * @param h 虚拟高度。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setVirtualH(int h)  {
   return TRet.from(scroll_view_set_virtual_h(this != null ? (this.nativeObj) : 0, h));
 }


  /**
   * 设置是否允许x方向滑动。
   * 
   * @param xslidable 是否允许滑动。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setXslidable(boolean xslidable)  {
   return TRet.from(scroll_view_set_xslidable(this != null ? (this.nativeObj) : 0, xslidable));
 }


  /**
   * 设置是否允许y方向滑动。
   * 
   * @param yslidable 是否允许滑动。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setYslidable(boolean yslidable)  {
   return TRet.from(scroll_view_set_yslidable(this != null ? (this.nativeObj) : 0, yslidable));
 }


  /**
   * 设置滚动时offset是否按页面对齐。
   * 
   * @param snap_to_page 是否按页面对齐。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setSnapToPage(boolean snap_to_page)  {
   return TRet.from(scroll_view_set_snap_to_page(this != null ? (this.nativeObj) : 0, snap_to_page));
 }


  /**
   * 设置滚动时是否每次翻一页
   *备注：当 snap_to_page 为ture 的时候才有效果，主要用于区分一次翻一页还是一次翻多页。
   * 
   * @param move_to_page 是否每次翻一页。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setMoveToPage(boolean move_to_page)  {
   return TRet.from(scroll_view_set_move_to_page(this != null ? (this.nativeObj) : 0, move_to_page));
 }


  /**
   * 设置是否递归查找全部子控件。
   * 
   * @param recursive 是否递归查找全部子控件。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setRecursive(boolean recursive)  {
   return TRet.from(scroll_view_set_recursive(this != null ? (this.nativeObj) : 0, recursive));
 }


  /**
   * 设置是否递归查找全部子控件。(不触发repaint和relayout)。
   * 
   * @param recursive 是否递归查找全部子控件。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setRecursiveOnly(boolean recursive)  {
   return TRet.from(scroll_view_set_recursive_only(this != null ? (this.nativeObj) : 0, recursive));
 }


  /**
   * 设置偏移量。
   * 
   * @param xoffset x偏移量。
   * @param yoffset y偏移量。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setOffset(int xoffset, int yoffset)  {
   return TRet.from(scroll_view_set_offset(this != null ? (this.nativeObj) : 0, xoffset, yoffset));
 }


  /**
   * 设置偏移速度比例。
   * 
   * @param xspeed_scale x偏移速度比例。
   * @param yspeed_scale y偏移速度比例。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setSpeedScale(double xspeed_scale, double yspeed_scale)  {
   return TRet.from(scroll_view_set_speed_scale(this != null ? (this.nativeObj) : 0, xspeed_scale, yspeed_scale));
 }


  /**
   * 设置滑动到极限时可继续滑动区域的占比。
   * 
   * @param slide_limit_ratio 滑动到极限时可继续滑动区域的占比。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setSlideLimitRatio(double slide_limit_ratio)  {
   return TRet.from(scroll_view_set_slide_limit_ratio(this != null ? (this.nativeObj) : 0, slide_limit_ratio));
 }


  /**
   * 滚动到指定的偏移量。
   * 
   * @param xoffset_end x偏移量。
   * @param yoffset_end y偏移量。
   * @param duration 时间(毫秒)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet scrollTo(int xoffset_end, int yoffset_end, int duration)  {
   return TRet.from(scroll_view_scroll_to(this != null ? (this.nativeObj) : 0, xoffset_end, yoffset_end, duration));
 }


  /**
   * 滚动到指定的偏移量。
   * 
   * @param xoffset_delta x偏移量。
   * @param yoffset_delta y偏移量。
   * @param duration 时间(毫秒)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet scrollDeltaTo(int xoffset_delta, int yoffset_delta, int duration)  {
   return TRet.from(scroll_view_scroll_delta_to(this != null ? (this.nativeObj) : 0, xoffset_delta, yoffset_delta, duration));
 }


  /**
   * 虚拟宽度。
   *
   */
 public int getVirtualW() {
   return scroll_view_t_get_prop_virtual_w(this.nativeObj);
 }


  /**
   * 虚拟高度。
   *
   */
 public int getVirtualH() {
   return scroll_view_t_get_prop_virtual_h(this.nativeObj);
 }


  /**
   * x偏移量。
   *
   */
 public int getXoffset() {
   return scroll_view_t_get_prop_xoffset(this.nativeObj);
 }


  /**
   * y偏移量。
   *
   */
 public int getYoffset() {
   return scroll_view_t_get_prop_yoffset(this.nativeObj);
 }


  /**
   * x偏移速度比例。
   *
   */
 public double getXspeedScale() {
   return scroll_view_t_get_prop_xspeed_scale(this.nativeObj);
 }


  /**
   * y偏移速度比例。
   *
   */
 public double getYspeedScale() {
   return scroll_view_t_get_prop_yspeed_scale(this.nativeObj);
 }


  /**
   * 是否允许x方向滑动。
   *
   */
 public boolean getXslidable() {
   return scroll_view_t_get_prop_xslidable(this.nativeObj);
 }


  /**
   * 是否允许y方向滑动。
   *
   */
 public boolean getYslidable() {
   return scroll_view_t_get_prop_yslidable(this.nativeObj);
 }


  /**
   * 滚动时offset是否按页面对齐。
   *
   */
 public boolean getSnapToPage() {
   return scroll_view_t_get_prop_snap_to_page(this.nativeObj);
 }


  /**
   * 是否每次翻一页（当 move_to_page 为ture 的时候才有效果，主要用于区分一次翻一页还是一次翻多页）。
   *
   */
 public boolean getMoveToPage() {
   return scroll_view_t_get_prop_move_to_page(this.nativeObj);
 }


  /**
   * 是否递归查找全部子控件。(当scroll_view的父控件是list_view_h或list_view时无效)
   *
   */
 public boolean getRecursive() {
   return scroll_view_t_get_prop_recursive(this.nativeObj);
 }


  /**
   * 滑动到极限时可继续滑动区域的占比。
   *
   */
 public double getSlideLimitRatio() {
   return scroll_view_t_get_prop_slide_limit_ratio(this.nativeObj);
 }

static private native long scroll_view_create(long parent, int x, int y, int w, int h);
static private native long scroll_view_cast(long widget);
static private native int scroll_view_set_virtual_w(long widget, int w);
static private native int scroll_view_set_virtual_h(long widget, int h);
static private native int scroll_view_set_xslidable(long widget, boolean xslidable);
static private native int scroll_view_set_yslidable(long widget, boolean yslidable);
static private native int scroll_view_set_snap_to_page(long widget, boolean snap_to_page);
static private native int scroll_view_set_move_to_page(long widget, boolean move_to_page);
static private native int scroll_view_set_recursive(long widget, boolean recursive);
static private native int scroll_view_set_recursive_only(long widget, boolean recursive);
static private native int scroll_view_set_offset(long widget, int xoffset, int yoffset);
static private native int scroll_view_set_speed_scale(long widget, double xspeed_scale, double yspeed_scale);
static private native int scroll_view_set_slide_limit_ratio(long widget, double slide_limit_ratio);
static private native int scroll_view_scroll_to(long widget, int xoffset_end, int yoffset_end, int duration);
static private native int scroll_view_scroll_delta_to(long widget, int xoffset_delta, int yoffset_delta, int duration);
static private native int scroll_view_t_get_prop_virtual_w(long nativeObj);
static private native int scroll_view_t_get_prop_virtual_h(long nativeObj);
static private native int scroll_view_t_get_prop_xoffset(long nativeObj);
static private native int scroll_view_t_get_prop_yoffset(long nativeObj);
static private native double scroll_view_t_get_prop_xspeed_scale(long nativeObj);
static private native double scroll_view_t_get_prop_yspeed_scale(long nativeObj);
static private native boolean scroll_view_t_get_prop_xslidable(long nativeObj);
static private native boolean scroll_view_t_get_prop_yslidable(long nativeObj);
static private native boolean scroll_view_t_get_prop_snap_to_page(long nativeObj);
static private native boolean scroll_view_t_get_prop_move_to_page(long nativeObj);
static private native boolean scroll_view_t_get_prop_recursive(long nativeObj);
static private native double scroll_view_t_get_prop_slide_limit_ratio(long nativeObj);
};