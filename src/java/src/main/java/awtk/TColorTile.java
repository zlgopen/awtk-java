package awtk;


/**
 * 色块控件。
 *
 *用来显示一个颜色块，它通过属性而不是主题来设置颜色，方便在运行时动态改变颜色。
 *
 *可以使用value属性访问背景颜色的颜色值。
 *
 *color\_tile\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于color\_tile\_t控件。
 *
 *在xml中使用"color_tile"标签创建色块控件。如：
 *
 *```xml
 *<color_tile x="c" y="m" w="80" h="30" bg_color="green" />
 *```
 *
 *> 更多用法请参考：
 *[color_tile](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/color_picker_rgb.xml)
 *
 *在c代码中使用函数color_tile\_create创建色块控件。如：
 *
 *> 创建之后，用color\_tile\_set\_bg\_color设置背景颜色。
 *
 */
public class TColorTile extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TColorTile(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TColorTile cast(long nativeObj) {
   return new TColorTile(nativeObj);
 }


  /**
   * 创建color_tile对象
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
    return new TColorTile(color_tile_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为color_tile对象(供脚本语言使用)。
   * 
   * @param widget color_tile对象。
   *
   * @return color_tile对象。
   */
 public  static TColorTile cast(TWidget widget)  {
    return new TColorTile(color_tile_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 设置背景颜色。
   * 
   * @param color 背景颜色。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setBgColor(String color)  {
   return TRet.from(color_tile_set_bg_color(this != null ? (this.nativeObj) : 0, color));
 }


  /**
   * 背景颜色。
   *
   */
 public String getBgColor() {
   return color_tile_t_get_prop_bg_color(this.nativeObj);
 }


  /**
   * 边框颜色。
   *
   */
 public String getBorderColor() {
   return color_tile_t_get_prop_border_color(this.nativeObj);
 }

static private native long color_tile_create(long parent, int x, int y, int w, int h);
static private native long color_tile_cast(long widget);
static private native int color_tile_set_bg_color(long widget, String color);
static private native String color_tile_t_get_prop_bg_color(long nativeObj);
static private native String color_tile_t_get_prop_border_color(long nativeObj);
};