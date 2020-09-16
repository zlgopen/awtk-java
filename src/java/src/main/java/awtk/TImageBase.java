package awtk;


/**
 * 图片控件基类。
 *
 *本类把图片相关控件的公共行为进行抽象，放到一起方便重用。目前已知的具体实现如下图：
 *
 *
 *
 *> 本类是一个抽象类，不能进行实例化。请在应用程序中使用具体的类，如image\_t。
 *
 *如果需要显示文件系统中的图片，只需将图片名称换成实际的文件名，并加上"file://"前缀即可。如：
 *
 *```
 *<image draw_type="center" image="file://./design/default/images/xx/flag_CN.png" />
 *<gif image="file://./design/default/images/x2/bee.gif" />
 *<svg image="file://./design/default/images/svg/china.bsvg" />
 *```
 *
 */
public class TImageBase extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TImageBase(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TImageBase cast(long nativeObj) {
   return new TImageBase(nativeObj);
 }


  /**
   * 设置控件的图片名称。
   *
   *> 如果需要显示文件系统中的图片，只需将图片名称换成实际的文件名，并加上"file://"前缀即可。
   * 
   * @param name 图片名称，该图片必须存在于资源管理器。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setImage(String name)  {
   return TRet.from(image_base_set_image(this != null ? (this.nativeObj) : 0, name));
 }


  /**
   * 设置控件的旋转角度(仅在WITH_VGCANVAS定义时生效)。
   * 
   * @param rotation 旋转角度(幅度)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setRotation(double rotation)  {
   return TRet.from(image_base_set_rotation(this != null ? (this.nativeObj) : 0, rotation));
 }


  /**
   * 设置控件的缩放比例(仅在WITH_VGCANVAS定义时生效)。
   * 
   * @param scale_x X方向缩放比例。
   * @param scale_y Y方向缩放比例。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setScale(double scale_x, double scale_y)  {
   return TRet.from(image_base_set_scale(this != null ? (this.nativeObj) : 0, scale_x, scale_y));
 }


  /**
   * 设置控件的锚点(仅在WITH_VGCANVAS定义时生效)。
   * 
   * @param anchor_x 锚点X(0-1)。0在控件左边，0.5在控件中间，1在控件右边。
   * @param anchor_y 锚点Y(0-1)。0在控件顶部，0.5在控件中间，1在控件底部。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setAnchor(double anchor_x, double anchor_y)  {
   return TRet.from(image_base_set_anchor(this != null ? (this.nativeObj) : 0, anchor_x, anchor_y));
 }


  /**
   * 设置控件的选中状态。
   * 
   * @param selected 是否被选中。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setSelected(boolean selected)  {
   return TRet.from(image_base_set_selected(this != null ? (this.nativeObj) : 0, selected));
 }


  /**
   * 设置控件是否可以被选中。
   * 
   * @param selectable 是否可以被选中。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setSelectable(boolean selectable)  {
   return TRet.from(image_base_set_selectable(this != null ? (this.nativeObj) : 0, selectable));
 }


  /**
   * 设置控件是否可以被点击。
   * 
   * @param clickable 是否可以被点击。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setClickable(boolean clickable)  {
   return TRet.from(image_base_set_clickable(this != null ? (this.nativeObj) : 0, clickable));
 }


  /**
   * 转换为image_base对象(供脚本语言使用)。
   * 
   * @param widget image_base对象。
   *
   * @return image_base对象。
   */
 public  static TImageBase cast(TWidget widget)  {
    return new TImageBase(image_base_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 图片的名称。
   *
   */
 public String getImage() {
   return image_base_t_get_prop_image(this.nativeObj);
 }


  /**
   * 锚点X(0-1)。0在控件左边，0.5在控件中间，1在控件右边。
   *
   */
 public double getAnchorX() {
   return image_base_t_get_prop_anchor_x(this.nativeObj);
 }


  /**
   * 锚点Y(0-1)。0在控件顶部，0.5在控件中间，1在控件底部。
   *
   */
 public double getAnchorY() {
   return image_base_t_get_prop_anchor_y(this.nativeObj);
 }


  /**
   * 控件在X方向上的缩放比例。
   *
   */
 public double getScaleX() {
   return image_base_t_get_prop_scale_x(this.nativeObj);
 }


  /**
   * 控件在Y方向上的缩放比例。
   *
   */
 public double getScaleY() {
   return image_base_t_get_prop_scale_y(this.nativeObj);
 }


  /**
   * 控件的旋转角度(幅度)。
   *
   */
 public double getRotation() {
   return image_base_t_get_prop_rotation(this.nativeObj);
 }


  /**
   * 点击时，是否触发EVT_CLICK事件。
   *
   */
 public boolean getClickable() {
   return image_base_t_get_prop_clickable(this.nativeObj);
 }


  /**
   * 是否设置选中状态。
   *
   */
 public boolean getSelectable() {
   return image_base_t_get_prop_selectable(this.nativeObj);
 }


  /**
   * 当前是否被选中。
   *
   */
 public boolean getSelected() {
   return image_base_t_get_prop_selected(this.nativeObj);
 }

static private native int image_base_set_image(long widget, String name);
static private native int image_base_set_rotation(long widget, double rotation);
static private native int image_base_set_scale(long widget, double scale_x, double scale_y);
static private native int image_base_set_anchor(long widget, double anchor_x, double anchor_y);
static private native int image_base_set_selected(long widget, boolean selected);
static private native int image_base_set_selectable(long widget, boolean selectable);
static private native int image_base_set_clickable(long widget, boolean clickable);
static private native long image_base_cast(long widget);
static private native String image_base_t_get_prop_image(long nativeObj);
static private native double image_base_t_get_prop_anchor_x(long nativeObj);
static private native double image_base_t_get_prop_anchor_y(long nativeObj);
static private native double image_base_t_get_prop_scale_x(long nativeObj);
static private native double image_base_t_get_prop_scale_y(long nativeObj);
static private native double image_base_t_get_prop_rotation(long nativeObj);
static private native boolean image_base_t_get_prop_clickable(long nativeObj);
static private native boolean image_base_t_get_prop_selectable(long nativeObj);
static private native boolean image_base_t_get_prop_selected(long nativeObj);
};