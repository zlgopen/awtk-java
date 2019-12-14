package awtk;


/**
 * 滑动视图。
 * 
 *  滑动视图可以管理多个页面，并通过滑动来切换当前页面。也可以管理多张图片，让它们自动切换。
 * 
 *  slide\_view\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于slide\_view\_t控件。
 * 
 *  在xml中使用"slide\_view"标签创建滑动视图控件。如：
 * 
 *  ```xml
 *    <slide_view x="0" y="0" w="100%" h="100%" style="dot">
 *    <view x="0" y="0" w="100%" h="100%" children_layout="default(w=60,h=60,m=5,s=10)">
 *     ...
 *    </view>
 *    <view x="0" y="0" w="100%" h="100%" children_layout="default(w=60,h=60,m=5,s=10)">
 *     ...
 *    </view>
 *    </slide_view>
 *  ```
 * 
 * 更多用法请参考：[slide_view.xml](
 * https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/slide_view.xml)
 * 
 *  在c代码中使用函数slide\_view\_create创建滑动视图控件。如：
 * 
 *  ```c
 *  slide_view = slide_view_create(win, 0, 0, win->w, win->h);
 *  ```
 * 
 * 完整示例请参考：
 *  [slide_view demo](
 *  https://github.com/zlgopen/awtk-c-demos/blob/master/demos/slide_view.c)
 * 
 *  可用通过style来设置控件的显示风格，如背景颜色和指示器的图标等等。如：
 * 
 *  ```xml
 *  <style name="dot">
 *    <normal  icon="dot" active_icon="active_dot"/>
 *  </style>
 *  ```
 * 
 * 如果希望背景图片跟随滚动，请将背景图片设置到页面上，否则设置到slide\_view上。
 * 
 * 更多用法请参考：[theme default](
 *  https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/styles/default.xml#L458)
 *
 */
public class SlideView extends Widget {
 public long nativeObj;

 public SlideView(long nativeObj) {
   super(nativeObj);
 }

 static public SlideView cast(long nativeObj) {
   return new SlideView(nativeObj);
 }


/**
 * 创建slide_view对象
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
   return new SlideView(slide_view_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换为slide_view对象(供脚本语言使用)。
 * 
 * @param widget slide_view对象。
 *
 * @returns slide_view对象。
 */
 public  static SlideView cast(Widget widget)  {
   return new SlideView(slide_view_cast(widget != null ? (widget.nativeObj) : 0));
 }


/**
 * 设置为自动播放模式。
 * 
 * @param widget slide_view对象。
 * @param auto_play 0表示禁止自动播放，非0表示自动播放时每一页播放的时间。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setAutoPlay(int auto_play)  {
   return Ret.from(slide_view_set_auto_play(this != null ? (this.nativeObj) : 0, auto_play));
 }


/**
 * 设置当前页的序号。
 * 
 * @param widget slide_view对象。
 * @param index 当前页的序号。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setActive(int index)  {
   return Ret.from(slide_view_set_active(this != null ? (this.nativeObj) : 0, index));
 }


/**
 * 设置为上下滑动(缺省为左右滑动)。
 * 
 * @param widget slide_view对象。
 * @param vertical TRUE表示上下滑动，FALSE表示左右滑动。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setVertical(boolean vertical)  {
   return Ret.from(slide_view_set_vertical(this != null ? (this.nativeObj) : 0, vertical));
 }


/**
 * 设置页面切换动画。
 * 
 *  anim_hint取值如下：
 * 
 *  * "translate"：平移。
 *  * "overlap"：覆盖。
 *  * "overlap\_with\_alpha"：覆盖并改变透明度。
 * 
 * 使用"overlap"或"overlap\_with\_alpha"动画时，背景图片最好指定到page上。
 *
 * 使用"overlap\_with\_alpha"动画时，slideview的背景设置为黑色，
 * 或slideview的背景设置为透明，窗口的背景设置为黑色，以获得更好的视觉效果和性能。
 * 
 * @param widget slide_view对象。
 * @param anim_hint 页面切换动画。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setAnimHint(String anim_hint)  {
   return Ret.from(slide_view_set_anim_hint(this != null ? (this.nativeObj) : 0, anim_hint));
 }


/**
 * 设置循环切换模式。
 * 
 * @param widget slide_view对象。
 * @param loop 是否启用循环切换模式。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setLoop(boolean loop)  {
   return Ret.from(slide_view_set_loop(this != null ? (this.nativeObj) : 0, loop));
 }

 public boolean getVertical() {
   return slide_view_t_get_prop_vertical(this.nativeObj);
 }

 public int getAutoPlay() {
   return slide_view_t_get_prop_auto_play(this.nativeObj);
 }

 public boolean getLoop() {
   return slide_view_t_get_prop_loop(this.nativeObj);
 }

 public String getAnimHint() {
   return slide_view_t_get_prop_anim_hint(this.nativeObj);
 }

static private native long slide_view_create(long parent, int x, int y, int w, int h);
static private native long slide_view_cast(long widget);
static private native int slide_view_set_auto_play(long widget, int auto_play);
static private native int slide_view_set_active(long widget, int index);
static private native int slide_view_set_vertical(long widget, boolean vertical);
static private native int slide_view_set_anim_hint(long widget, String anim_hint);
static private native int slide_view_set_loop(long widget, boolean loop);
static private native boolean slide_view_t_get_prop_vertical(long nativeObj);
static private native int slide_view_t_get_prop_auto_play(long nativeObj);
static private native boolean slide_view_t_get_prop_loop(long nativeObj);
static private native String slide_view_t_get_prop_anim_hint(long nativeObj);
}

