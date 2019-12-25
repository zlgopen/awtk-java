package awtk;


/**
 * 勾选按钮控件(单选/多选)。
 *
 *check\_button\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于check\_button\_t控件。
 *
 *在xml中使用"check_button"标签创建多选按钮控件。如：
 *
 *```xml
 *<check_button name="c1" text="Book"/>
 *```
 *
 *在xml中使用"radio_button"标签创建单选按钮控件。如：
 *
 *```xml
 *<radio_button name="r1" text="Book"/>
 *```
 *
 *> 更多用法请参考：
 *[button.xml](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/basic.xml)
 *
 *在c代码中使用函数check\_button\_create创建多选按钮控件。如：
 *
 *
 *在c代码中使用函数check\_button\_create\_radio创建单选按钮控件。如：
 *
 *
 *> 完整示例请参考：
 *[button demo](https://github.com/zlgopen/awtk-c-demos/blob/master/demos/check_button.c)
 *
 *可用通过style来设置控件的显示风格，如字体的大小和颜色等等。如：
 *
 *```xml
 *<style name="default" icon_at="left">
 *<normal  icon="unchecked" />
 *<pressed icon="unchecked" />
 *<over    icon="unchecked" text_color="green"/>
 *<normal_of_checked icon="checked" text_color="blue"/>
 *<pressed_of_checked icon="checked" text_color="blue"/>
 *<over_of_checked icon="checked" text_color="green"/>
 *</style>
 *```
 *
 *> 更多用法请参考：
 *[theme
 *default](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/styles/default.xml#L227)
 *
 */
public class TCheckButton extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TCheckButton(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TCheckButton cast(long nativeObj) {
   return new TCheckButton(nativeObj);
 }


  /**
   * 创建多选按钮对象
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
    return new TCheckButton(check_button_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 创建单选按钮对象
   * 
   * @param parent 父控件
   * @param x x坐标
   * @param y y坐标
   * @param w 宽度
   * @param h 高度
   *
   * @return 对象。
   */
 public  static TWidget createRadio(TWidget parent, int x, int y, int w, int h)  {
    return new TCheckButton(check_button_create_radio(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 设置控件的值。
   * 
   * @param value 值
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setValue(boolean value)  {
   return TRet.from(check_button_set_value(this != null ? (this.nativeObj) : 0, value));
 }


  /**
   * 转换check_button对象(供脚本语言使用)。
   * 
   * @param widget check_button对象。
   *
   * @return check_button对象。
   */
 public  static TCheckButton cast(TWidget widget)  {
    return new TCheckButton(check_button_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long check_button_create(long parent, int x, int y, int w, int h);
static private native long check_button_create_radio(long parent, int x, int y, int w, int h);
static private native int check_button_set_value(long widget, boolean value);
static private native long check_button_cast(long widget);
static private native boolean check_button_t_get_prop_value(long nativeObj);
};