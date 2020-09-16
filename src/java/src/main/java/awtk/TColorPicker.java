package awtk;


/**
 * 颜色选择器。
 *
 *color\_picker\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于color\_picker\_t控件。
 *
 *在xml中使用"color\_picker"标签创建颜色选择器控件。如：
 *
 *```xml
 *<color_picker x="0" y="0" w="100%" h="100%" value="orange">
 *<color_component x="0" y="0" w="200" h="200" name="sv"/>
 *<color_component x="210" y="0" w="20" h="200" name="h"/>
 *<color_tile x="0" y="210" w="50%" h="20" name="new" bg_color="green"/>
 *<color_tile x="right" y="210" w="50%" h="20" name="old" bg_color="blue"/>
 *</color_picker>
 *```
 *
 *> 更多用法请参考：
 *[color\_picker](https://github.com/zlgopen/awtk/blob/master/design/default/ui/color_picker.xml)
 *
 *其中的子控件必须按下列规则命名：
 *
 ** r 红色分量。可以是spin_box、edit和slider。
 ** g 绿色分量。可以是spin_box、edit和slider。
 ** b 蓝色分量。可以是spin_box、edit和slider。
 ** h Hue分量。可以是spin_box、edit、slider和color_component。
 ** s Saturation分量。可以是spin_box、edit和slider。
 ** v Value/Brightness分量。可以是spin_box、edit和slider。
 ** sv Saturation和Value/Brightness分量。可以是color_component。
 ** old 旧的值。可以是spin_box、edit和color_tile。
 ** new 新的值。可以是spin_box、edit和color_tile。
 *
 */
public class TColorPicker extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TColorPicker(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TColorPicker cast(long nativeObj) {
   return new TColorPicker(nativeObj);
 }


  /**
   * 创建color_picker对象
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
    return new TColorPicker(color_picker_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 设置颜色。
   * 
   * @param color 颜色。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setColor(String color)  {
   return TRet.from(color_picker_set_color(this != null ? (this.nativeObj) : 0, color));
 }


  /**
   * 转换为color_picker对象(供脚本语言使用)。
   * 
   * @param widget color_picker对象。
   *
   * @return color_picker对象。
   */
 public  static TColorPicker cast(TWidget widget)  {
    return new TColorPicker(color_picker_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long color_picker_create(long parent, int x, int y, int w, int h);
static private native int color_picker_set_color(long widget, String color);
static private native long color_picker_cast(long widget);
static private native String color_picker_t_get_prop_value(long nativeObj);
};