package awtk;


/**
 * 表盘控件。
 *
 *表盘控件就是一张图片。
 *
 *gauge\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于gauge\_t控件。
 *
 *在xml中使用"gauge"标签创建表盘控件。如：
 *
 *```xml
 *<gauge x="c" y="10" w="240" h="240" image="gauge_bg"
 *```
 *
 *> 更多用法请参考：
 *[gauge.xml](https://github.com/zlgopen/awtk/blob/master/design/default/ui/gauge.xml)
 *
 *在c代码中使用函数gauge\_create创建表盘控件。如：
 *
 *
 *
 *可用通过style来设置控件的显示风格，如背景和边框等。如：
 *
 *```xml
 *<gauge>
 *<style name="border">
 *<normal border_color="#000000" bg_color="#e0e0e0" text_color="black"/>
 *</style>
 *</gauge>
 *```
 *
 *> 更多用法请参考：
 *[theme
 *default](https://github.com/zlgopen/awtk/blob/master/design/default/styles/default.xml)
 *
 */
public class TGauge extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TGauge(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TGauge cast(long nativeObj) {
   return new TGauge(nativeObj);
 }


  /**
   * 创建gauge对象
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
    return new TGauge(gauge_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为gauge对象(供脚本语言使用)。
   * 
   * @param widget gauge对象。
   *
   * @return gauge对象。
   */
 public  static TGauge cast(TWidget widget)  {
    return new TGauge(gauge_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 设置背景图片的名称。
   * 
   * @param name 图片名称，该图片必须存在于资源管理器。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setImage(String name)  {
   return TRet.from(gauge_set_image(this != null ? (this.nativeObj) : 0, name));
 }


  /**
   * 设置图片的显示方式。
   *
   *> 绘制方式的属性值和枚举值:
   *[image\_draw\_type\_name\_value](https://github.com/zlgopen/awtk/blob/master/src/base/enums.c#L98)
   * 
   * @param draw_type 显示方式。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setDrawType(TImageDrawType draw_type)  {
   return TRet.from(gauge_set_draw_type(this != null ? (this.nativeObj) : 0, draw_type.value()));
 }


  /**
   * 背景图片。
   *
   */
 public String getImage() {
   return gauge_t_get_prop_image(this.nativeObj);
 }


  /**
   * 图片的绘制方式。
   *
   */
 public TImageDrawType getDrawType() {
   return TImageDrawType.from(gauge_t_get_prop_draw_type(this.nativeObj));

 }

static private native long gauge_create(long parent, int x, int y, int w, int h);
static private native long gauge_cast(long widget);
static private native int gauge_set_image(long widget, String name);
static private native int gauge_set_draw_type(long widget, int draw_type);
static private native String gauge_t_get_prop_image(long nativeObj);
static private native int gauge_t_get_prop_draw_type(long nativeObj);
};