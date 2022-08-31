package awtk;


/**
 * spinbox控件。
 *
 *一个特殊的数值编辑器，将edit\_t和button\_t进行组合，方便编辑数值。
 *
 *点击向上的按钮将数值增加一个step，点击向下的按钮将数值减小一个step。
 *step的值可以通过step属性进行设置。
 *
 *spin_box\_t是[edit\_t](edit_t.md)的子类控件，edit\_t的函数均适用于spin\_box\_t控件。
 *
 *在xml中使用"spin_box"标签创建spinbox控件。如：
 *
 *```xml
 *<spin_box w="70%" input_type="int" min="-100" max="100" step="5">
 *```
 *
 *>
 *更多用法请参考：[spin_box.xml](https://github.com/zlgopen/awtk/blob/master/design/default/ui/spinbox.xml)
 *
 *在c代码中使用函数spin_box\_create创建spinbox控件。如：
 *
 *
 *> 创建之后:
 *>
 *> 可以用edit相关函数去设置它的各种属性。
 *
 *> 完整示例请参考：[spin_box
 *demo](https://github.com/zlgopen/awtk-c-demos/blob/master/demos/spin_box.c)
 *
 *可用通过style来设置控件的显示风格，如背景和边框等。如：
 *
 *```xml
 *<spin_box>
 *<style name="default" border_color="#a0a0a0"  text_color="black" text_align_h="left">
 *<normal     bg_color="#f0f0f0" />
 *<focused    bg_color="#f0f0f0" border_color="black"/>
 *<disable    bg_color="gray" text_color="#d0d0d0" />
 *<error      bg_color="#f0f0f0" text_color="red" />
 *<empty      bg_color="#f0f0f0" text_color="#a0a0a0" />
 *</style>
 *</spin_box>
 *```
 *
 *> 更多用法请参考：[theme
 *default](https://github.com/zlgopen/awtk/blob/master/design/default/styles/default.xml#L128)
 *
 */
public class TSpinBox extends TEdit { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TSpinBox(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TSpinBox cast(long nativeObj) {
   return new TSpinBox(nativeObj);
 }


  /**
   * 创建spin_box对象
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
    return new TSpinBox(spin_box_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为spin_box对象(供脚本语言使用)。
   * 
   * @param widget spin_box对象。
   *
   * @return spin_box对象。
   */
 public  static TSpinBox cast(TWidget widget)  {
    return new TSpinBox(spin_box_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 设置是否启用易点击模式。
   * 
   * @param easy_touch_mode 易点击模式。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setEasyTouchMode(boolean easy_touch_mode)  {
   return TRet.from(spin_box_set_easy_touch_mode(this != null ? (this.nativeObj) : 0, easy_touch_mode));
 }


  /**
   * 设置连击的时间间隔。
   *备注：时间间隔越低，速度越快。
   * 
   * @param repeat 连击的时间间隔。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet spinSetRepeat(int repeat)  {
   return TRet.from(spin_set_repeat(this != null ? (this.nativeObj) : 0, repeat));
 }


  /**
   * 是否启用易点击模式(在电容屏设备上建议启用)。
   *> 在该模式下：
   *> * 1.当高度大于font size的3倍时，inc按钮在顶部(style名为spinbox_top)，dec按钮在底部(style名为spinbox_bottom)。
   *> * 2.当高度正常时，dec按钮在左边(style名为spinbox_left)，inc按钮在右边(style名为spinbox_right)。
   *> 不在该模式下：
   *> inc按钮在右上角(style名为spinbox_up)，dec按钮在右下角(style名为spinbox_down)。
   *
   */
 public boolean getEasyTouchMode() {
   return spin_box_t_get_prop_easy_touch_mode(this.nativeObj);
 }

static private native long spin_box_create(long parent, int x, int y, int w, int h);
static private native long spin_box_cast(long widget);
static private native int spin_box_set_easy_touch_mode(long widget, boolean easy_touch_mode);
static private native int spin_set_repeat(long widget, int repeat);
static private native boolean spin_box_t_get_prop_easy_touch_mode(long nativeObj);
};