package awtk;


/**
 * 滚动视图。
 * 
 *  scroll\_view\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于scroll\_view\_t控件。
 * 
 *  在xml中使用"scroll\_view"标签创建滚动视图控件。如：
 * 
 *  ```xml
 *  <list_view x="0"  y="30" w="100%" h="-80" item_height="60">
 *    <scroll_view name="view" x="0"  y="0" w="100%" h="100%">
 *      <list_item style="odd" children_layout="default(rows=1,cols=0)">
 *        <image draw_type="icon" w="30" image="earth"/>
 *        <label w="-30" text="1.Hello AWTK !">
 *          <switch x="r:10" y="m" w="60" h="20"/>
 *        </label>
 *      </list_item>
 *      ...
 *    </scroll_view>
 *   </list_view>
 *  ```
 * 
 * 滚动视图一般作为列表视图的子控件使用。
 * 
 * 更多用法请参考：[list\_view\_m.xml](
 * https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/list_view_m.xml)
 * 
 *  在c代码中使用函数scroll\_view\_create创建列表视图控件。如：
 * 
 *  ```c
 *   widget_t* scroll_view = scroll_view_create(win, 0, 0, 0, 0);
 *  ```
 * 
 *  可用通过style来设置控件的显示风格，如背景颜色和边框颜色等(一般情况不需要)。
 *
 */
public class ScrollView extends Widget {
 public long nativeObj;

 public ScrollView(long nativeObj) {
   super(nativeObj);
 }

 static public ScrollView cast(long nativeObj) {
   return new ScrollView(nativeObj);
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
 * @returns 对象。
 */
 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new ScrollView(scroll_view_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换为scroll_view对象(供脚本语言使用)。
 * 
 * @param widget scroll_view对象。
 *
 * @returns scroll_view对象。
 */
 public  static ScrollView cast(Widget widget)  {
   return new ScrollView(scroll_view_cast(widget != null ? (widget.nativeObj) : 0));
 }


/**
 * 设置虚拟宽度。
 * 
 * @param widget 控件对象。
 * @param w 虚拟宽度。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setVirtualW(int w)  {
   return Ret.from(scroll_view_set_virtual_w(this != null ? (this.nativeObj) : 0, w));
 }


/**
 * 设置虚拟高度。
 * 
 * @param widget 控件对象。
 * @param h 虚拟高度。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setVirtualH(int h)  {
   return Ret.from(scroll_view_set_virtual_h(this != null ? (this.nativeObj) : 0, h));
 }


/**
 * 设置是否允许x方向滑动。
 * 
 * @param widget 控件对象。
 * @param xslidable 是否允许滑动。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setXslidable(boolean xslidable)  {
   return Ret.from(scroll_view_set_xslidable(this != null ? (this.nativeObj) : 0, xslidable));
 }


/**
 * 设置是否允许y方向滑动。
 * 
 * @param widget 控件对象。
 * @param yslidable 是否允许滑动。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setYslidable(boolean yslidable)  {
   return Ret.from(scroll_view_set_yslidable(this != null ? (this.nativeObj) : 0, yslidable));
 }


/**
 * 设置偏移量。
 * 
 * @param widget 控件对象。
 * @param xoffset x偏移量。
 * @param yoffset y偏移量。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setOffset(int xoffset, int yoffset)  {
   return Ret.from(scroll_view_set_offset(this != null ? (this.nativeObj) : 0, xoffset, yoffset));
 }


/**
 * 设置偏移速度比例。
 * 
 * @param widget 控件对象。
 * @param xspeed_scale x偏移速度比例。。
 * @param yspeed_scale y偏移速度比例。。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setSpeedScale(double xspeed_scale, double yspeed_scale)  {
   return Ret.from(scroll_view_set_speed_scale(this != null ? (this.nativeObj) : 0, xspeed_scale, yspeed_scale));
 }


/**
 * 滚动到指定的偏移量。
 * 
 * @param widget 控件对象。
 * @param xoffset_end x偏移量。
 * @param yoffset_end y偏移量。
 * @param duration 时间。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret scrollTo(int xoffset_end, int yoffset_end, int duration)  {
   return Ret.from(scroll_view_scroll_to(this != null ? (this.nativeObj) : 0, xoffset_end, yoffset_end, duration));
 }


/**
 * 滚动到指定的偏移量。
 * 
 * @param widget 控件对象。
 * @param xoffset_delta x偏移量。
 * @param yoffset_delta y偏移量。
 * @param duration 时间。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret scrollDeltaTo(int xoffset_delta, int yoffset_delta, int duration)  {
   return Ret.from(scroll_view_scroll_delta_to(this != null ? (this.nativeObj) : 0, xoffset_delta, yoffset_delta, duration));
 }

 public int getVirtualW() {
   return scroll_view_t_get_prop_virtual_w(this.nativeObj);
 }

 public int getVirtualH() {
   return scroll_view_t_get_prop_virtual_h(this.nativeObj);
 }

 public int getXoffset() {
   return scroll_view_t_get_prop_xoffset(this.nativeObj);
 }

 public int getYoffset() {
   return scroll_view_t_get_prop_yoffset(this.nativeObj);
 }

 public double getXspeedScale() {
   return scroll_view_t_get_prop_xspeed_scale(this.nativeObj);
 }

 public double getYspeedScale() {
   return scroll_view_t_get_prop_yspeed_scale(this.nativeObj);
 }

 public boolean getXslidable() {
   return scroll_view_t_get_prop_xslidable(this.nativeObj);
 }

 public boolean getYslidable() {
   return scroll_view_t_get_prop_yslidable(this.nativeObj);
 }

static private native long scroll_view_create(long parent, int x, int y, int w, int h);
static private native long scroll_view_cast(long widget);
static private native int scroll_view_set_virtual_w(long widget, int w);
static private native int scroll_view_set_virtual_h(long widget, int h);
static private native int scroll_view_set_xslidable(long widget, boolean xslidable);
static private native int scroll_view_set_yslidable(long widget, boolean yslidable);
static private native int scroll_view_set_offset(long widget, int xoffset, int yoffset);
static private native int scroll_view_set_speed_scale(long widget, double xspeed_scale, double yspeed_scale);
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
}

