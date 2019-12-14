package awtk;


/**
 * 图片控件基类。
 * 
 *  本类把图片相关控件的公共行为进行抽象，放到一起方便重用。目前已知的具体实现如下图：
 * 
 *  ```graphviz
 *    [default_style]
 * 
 *    image_t -> image_base_t[arrowhead = "empty"]
 *    svg_image_t -> image_base_t[arrowhead = "empty"]
 *    gif_image_t -> image_base_t[arrowhead = "empty"]
 *  ```
 * 
 * 本类是一个抽象类，不能进行实例化。请在应用程序中使用具体的类，如image\_t。
 * 
 *  如果需要显示文件系统中的图片，只需将图片名称换成实际的文件名，并加上"file://"前缀即可。如：
 * 
 * ```
 *   <image draw_type="center" image="file://./demos/assets/default/raw/images/xx/flag_CN.png" />
 *   <gif image="file://./demos/assets/default/raw/images/x2/bee.gif" />
 *   <svg image="file://./demos/assets/default/raw/images/svg/china.bsvg" />
 *  ```
 *
 */
public class ImageBase extends Widget {
 public long nativeObj;

 public ImageBase(long nativeObj) {
   super(nativeObj);
 }

 static public ImageBase cast(long nativeObj) {
   return new ImageBase(nativeObj);
 }


/**
 * 设置控件的图片名称。
 * 
 * 如果需要显示文件系统中的图片，只需将图片名称换成实际的文件名，并加上"file://"前缀即可。
 * 
 * @param widget image对象。
 * @param name 图片名称，该图片必须存在于资源管理器。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setImage(String name)  {
   return Ret.from(image_base_set_image(this != null ? (this.nativeObj) : 0, name));
 }


/**
 * 设置控件的旋转角度(仅在WITH_VGCANVAS定义时生效)。
 * 
 * @param widget 控件对象。
 * @param rotation 旋转角度(幅度)。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setRotation(double rotation)  {
   return Ret.from(image_base_set_rotation(this != null ? (this.nativeObj) : 0, rotation));
 }


/**
 * 设置控件的缩放比例(仅在WITH_VGCANVAS定义时生效)。
 * 
 * @param widget 控件对象。
 * @param scale_x X方向缩放比例。
 * @param scale_y Y方向缩放比例。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setScale(double scale_x, double scale_y)  {
   return Ret.from(image_base_set_scale(this != null ? (this.nativeObj) : 0, scale_x, scale_y));
 }


/**
 * 设置控件的锚点(仅在WITH_VGCANVAS定义时生效)。
 * 
 * @param widget 控件对象。
 * @param anchor_x 锚点X(0-1)。0在控件左边，0.5在控件中间，1在控件右边。
 * @param anchor_y 锚点Y(0-1)。0在控件顶部，0.5在控件中间，1在控件底部。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setAnchor(double anchor_x, double anchor_y)  {
   return Ret.from(image_base_set_anchor(this != null ? (this.nativeObj) : 0, anchor_x, anchor_y));
 }


/**
 * 设置控件的选中状态。
 * 
 * @param widget 控件对象。
 * @param selected 是否被选中。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setSelected(boolean selected)  {
   return Ret.from(image_base_set_selected(this != null ? (this.nativeObj) : 0, selected));
 }


/**
 * 设置控件是否可以被选中。
 * 
 * @param widget 控件对象。
 * @param selectable 是否可以被选中。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setSelectable(boolean selectable)  {
   return Ret.from(image_base_set_selectable(this != null ? (this.nativeObj) : 0, selectable));
 }


/**
 * 设置控件是否可以被点击。
 * 
 * @param widget 控件对象。
 * @param clickable 是否可以被点击。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setClickable(boolean clickable)  {
   return Ret.from(image_base_set_clickable(this != null ? (this.nativeObj) : 0, clickable));
 }


/**
 * 转换为image_base对象(供脚本语言使用)。
 * 
 * @param widget image_base对象。
 *
 * @returns image_base对象。
 */
 public  static ImageBase cast(Widget widget)  {
   return new ImageBase(image_base_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public String getImage() {
   return image_base_t_get_prop_image(this.nativeObj);
 }

 public double getAnchorX() {
   return image_base_t_get_prop_anchor_x(this.nativeObj);
 }

 public double getAnchorY() {
   return image_base_t_get_prop_anchor_y(this.nativeObj);
 }

 public double getScaleX() {
   return image_base_t_get_prop_scale_x(this.nativeObj);
 }

 public double getScaleY() {
   return image_base_t_get_prop_scale_y(this.nativeObj);
 }

 public double getRotation() {
   return image_base_t_get_prop_rotation(this.nativeObj);
 }

 public boolean getClickable() {
   return image_base_t_get_prop_clickable(this.nativeObj);
 }

 public boolean getSelectable() {
   return image_base_t_get_prop_selectable(this.nativeObj);
 }

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
}

