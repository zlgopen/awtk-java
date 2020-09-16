package awtk;


/**
 * 开关控件。
 *
 *switch\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于switch\_t控件。
 *
 *在xml中使用"switch"标签创建开关控件。如：
 *
 *```xml
 *<switch x="10" y="60" w="60" h="22" />
 *```
 *
 *> 更多用法请参考：[switch.xml](
 *https://github.com/zlgopen/awtk/blob/master/design/default/ui/switch.xml)
 *
 *在c代码中使用函数switch\_create创建开关控件。如：
 *
 *
 *> 完整示例请参考：[switch demo](
 *https://github.com/zlgopen/awtk-c-demos/blob/master/demos/switch.c)
 *
 *可用通过style来设置控件的显示风格，如背景图片等。如：
 *
 *```xml
 *<style name="default">
 *<normal  bg_image="switch" />
 *</style>
 *```
 *
 *> 更多用法请参考：[theme default](
 *https://github.com/zlgopen/awtk/blob/master/design/default/styles/default.xml#L452)
 *
 */
public class TSwitch extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TSwitch(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TSwitch cast(long nativeObj) {
   return new TSwitch(nativeObj);
 }


  /**
   * 创建switch对象
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
    return new TSwitch(switch_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 设置控件的值。
   * 
   * @param value 值
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setValue(boolean value)  {
   return TRet.from(switch_set_value(this != null ? (this.nativeObj) : 0, value));
 }


  /**
   * 转换switch对象(供脚本语言使用)。
   * 
   * @param widget switch对象。
   *
   * @return switch对象。
   */
 public  static TSwitch cast(TWidget widget)  {
    return new TSwitch(switch_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 当开关处于关闭时，图片偏移相对于图片宽度的比例(缺省为1/3)。
   *
   */
 public double getMaxXoffsetRatio() {
   return switch_t_get_prop_max_xoffset_ratio(this.nativeObj);
 }

static private native long switch_create(long parent, int x, int y, int w, int h);
static private native int switch_set_value(long widget, boolean value);
static private native long switch_cast(long widget);
static private native boolean switch_t_get_prop_value(long nativeObj);
static private native double switch_t_get_prop_max_xoffset_ratio(long nativeObj);
};