package awtk;


/**
 * 分组控件。
 *
 *单选按钮在同一个父控件中是互斥的，所以通常将相关的单选按钮放在一个group\_box中。
 *
 *它本身不提供布局功能，仅提供具有语义的标签，让xml更具有可读性。
 *子控件的布局可用layout\_children属性指定。
 *请参考[布局参数](https://github.com/zlgopen/awtk/blob/master/docs/layout.md)。
 *
 *group\_box\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于group\_box\_t控件。
 *
 *在xml中使用"group\_box"标签创建group\_box。如：
 *
 *```xml
 *<group_box x="20" y="230" w="50%" h="90" children_layout="default(r=3,c=1,ym=2,s=10)"
 *<radio_button name="r1" text="Book"/>
 *<radio_button name="r2" text="Food"/>
 *<radio_button name="r3" text="Pencil" value="true"/>
 *</group_box>
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
public class TGroupBox extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TGroupBox(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TGroupBox cast(long nativeObj) {
   return new TGroupBox(nativeObj);
 }


  /**
   * 创建group_box对象
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
    return new TGroupBox(group_box_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 设置选中的单选按钮的索引。
   * 
   * @param value 选中的单选按钮的索引。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setValue(int value)  {
   return TRet.from(group_box_set_value(this != null ? (this.nativeObj) : 0, value));
 }


  /**
   * 转换为group_box对象(供脚本语言使用)。
   * 
   * @param widget group_box对象。
   *
   * @return group_box对象。
   */
 public  static TGroupBox cast(TWidget widget)  {
    return new TGroupBox(group_box_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long group_box_create(long parent, int x, int y, int w, int h);
static private native int group_box_set_value(long widget, int value);
static private native long group_box_cast(long widget);
static private native int group_box_t_get_prop_value(long nativeObj);
};