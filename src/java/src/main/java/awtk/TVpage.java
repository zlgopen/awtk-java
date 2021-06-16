package awtk;


/**
 * 虚拟页面(根据情况自动加载/卸载页面，并提供入场/出场动画)。
 *
 *> 虚拟页面只能作为pages的直接子控件使用。
 *
 *如果指定了ui_asset:
 *
 ** 当页面切换到后台时自动卸载，并触发EVT\_VPAGE\_CLOSE消息。
 ** 当页面切换到前台时自动加载，在动画前出发EVT\_VPAGE\_WILL\_OPEN消息，在动画完成时触发 EVT\_VPAGE\_CLOSE消息。
 *
 *vpage\_t也可以当作普通view嵌入到pages中，让tab控件在切换时具有动画效果。
 *
 *在xml中使用"vpage"标签创建控件。如：
 *
 *```xml
 *<!-- ui -->
 *<vpage x="c" y="50" w="100" h="100" ui_asset="mypage"/>
 *```
 *
 *可用通过style来设置控件的显示风格，如字体的大小和颜色等等(一般无需指定)。如：
 *
 *```xml
 *<!-- style -->
 *<vpage>
 *<style name="default">
 *<normal />
 *</style>
 *</vpage>
 *```
 *
 */
public class TVpage extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TVpage(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TVpage cast(long nativeObj) {
   return new TVpage(nativeObj);
 }


  /**
   * 创建vpage对象
   * 
   * @param parent 父控件
   * @param x x坐标
   * @param y y坐标
   * @param w 宽度
   * @param h 高度
   *
   * @return vpage对象。
   */
 public  static TWidget create(TWidget parent, int x, int y, int w, int h)  {
    return new TVpage(vpage_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为vpage对象(供脚本语言使用)。
   * 
   * @param widget vpage对象。
   *
   * @return vpage对象。
   */
 public  static TVpage cast(TWidget widget)  {
    return new TVpage(vpage_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 设置 UI资源名称。
   * 
   * @param ui_asset UI资源名称。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setUiAsset(String ui_asset)  {
   return TRet.from(vpage_set_ui_asset(this != null ? (this.nativeObj) : 0, ui_asset));
 }


  /**
   * 设置动画类型(vtranslate: 垂直平移，htranslate: 水平平移)。
   * 
   * @param anim_hint 动画类型。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setAnimHint(String anim_hint)  {
   return TRet.from(vpage_set_anim_hint(this != null ? (this.nativeObj) : 0, anim_hint));
 }


  /**
   * UI资源名称。
   *
   */
 public String getUiAsset() {
   return vpage_t_get_prop_ui_asset(this.nativeObj);
 }


  /**
   * 动画类型(目前支持：vtranslate: 垂直平移，htranslate: 水平平移)。
   *
   */
 public String getAnimHint() {
   return vpage_t_get_prop_anim_hint(this.nativeObj);
 }

static private native long vpage_create(long parent, int x, int y, int w, int h);
static private native long vpage_cast(long widget);
static private native int vpage_set_ui_asset(long widget, String ui_asset);
static private native int vpage_set_anim_hint(long widget, String anim_hint);
static private native String vpage_t_get_prop_ui_asset(long nativeObj);
static private native String vpage_t_get_prop_anim_hint(long nativeObj);
};