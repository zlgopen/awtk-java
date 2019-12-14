package awtk;


/**
 * 标签按钮控件。
 * 
 *  标签按钮有点类似单选按钮，但点击标签按钮之后会自动切换当前的标签页。
 * 
 *  tab\_button\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于tab\_button\_t控件。
 * 
 *  在xml中使用"tab\_button"标签创建标签按钮控件。如：
 * 
 *  ```xml
 *    <tab_button_group x="c" y="bottom:10" w="90%" h="30" compact="true"
 *      <tab_button text="General"/>
 *      <tab_button text="Network" value="true" />
 *      <tab_button text="Security"/>
 *    </tab_button_group>
 *  ```
 * 
 *  标签按钮一般放在标签按钮分组中，布局由标签按钮分组控件决定，不需要指定自己的布局参数和坐标。
 * 
 * 更多用法请参考：
 *  [tab control](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/)
 * 
 *  可用通过style来设置控件的显示风格，如字体的大小和颜色等等。如：
 * 
 *  ```xml
 *  <tab_button>
 *   <style name="default" border_color="#a0a0a0"  text_color="black">
 *    <normal     bg_color="#d0d0d0" />
 *    <pressed    bg_color="#f0f0f0" />
 *    <over       bg_color="#e0e0e0" />
 *    <normal_of_active     bg_color="#f0f0f0" />
 *    <pressed_of_active    bg_color="#f0f0f0" />
 *    <over_of_active       bg_color="#f0f0f0" />
 *  </style>
 *  </tab_button>
 *  ```
 *
 */
public class TabButton extends Widget {
 public long nativeObj;

 public TabButton(long nativeObj) {
   super(nativeObj);
 }

 static public TabButton cast(long nativeObj) {
   return new TabButton(nativeObj);
 }


/**
 * 创建tab_button对象
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
   return new TabButton(tab_button_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换tab_button对象(供脚本语言使用)。
 * 
 * @param widget tab_button对象。
 *
 * @returns tab_button对象。
 */
 public  static TabButton cast(Widget widget)  {
   return new TabButton(tab_button_cast(widget != null ? (widget.nativeObj) : 0));
 }


/**
 * 设置为当前标签。
 * 
 * @param widget tab_button对象。
 * @param value 是否为当前标签。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setValue(int value)  {
   return Ret.from(tab_button_set_value(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 设置控件的图标。
 * 
 * @param widget tab_button对象。
 * @param name 当前项的图标。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setIcon(String name)  {
   return Ret.from(tab_button_set_icon(this != null ? (this.nativeObj) : 0, name));
 }


/**
 * 设置控件的active图标。
 * 
 * @param widget tab_button对象。
 * @param name 当前项的图标。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setActiveIcon(String name)  {
   return Ret.from(tab_button_set_active_icon(this != null ? (this.nativeObj) : 0, name));
 }

 public String getActiveIcon() {
   return tab_button_t_get_prop_active_icon(this.nativeObj);
 }

 public String getIcon() {
   return tab_button_t_get_prop_icon(this.nativeObj);
 }

static private native long tab_button_create(long parent, int x, int y, int w, int h);
static private native long tab_button_cast(long widget);
static private native int tab_button_set_value(long widget, int value);
static private native int tab_button_set_icon(long widget, String name);
static private native int tab_button_set_active_icon(long widget, String name);
static private native boolean tab_button_t_get_prop_value(long nativeObj);
static private native String tab_button_t_get_prop_active_icon(long nativeObj);
static private native String tab_button_t_get_prop_icon(long nativeObj);
}

