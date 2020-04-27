package awtk;


/**
 * 输入法语言指示器。
 *
 *用于显示输入法的输入语言或类型，主要用于T9输入法。
 *
 *lang_indicator\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于lang_indicator\_t控件。
 *
 *在xml中使用"lang_indicator"标签创建lang_indicator。如：
 *
 *```xml
 *<lang_indicator x="0" y="0" w="100%" h="100%" children_layout="default(c=2,r=2,m=5,s=5)">
 *</lang_indicator>
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
public class TLangIndicator extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TLangIndicator(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TLangIndicator cast(long nativeObj) {
   return new TLangIndicator(nativeObj);
 }


  /**
   * 创建lang_indicator对象
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
    return new TLangIndicator(lang_indicator_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 设置缺省获得焦点的子控件(可用控件名或类型)。
   * 
   * @param image 缺省获得焦点的子控件(可用控件名或类型)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setImage(String image)  {
   return TRet.from(lang_indicator_set_image(this != null ? (this.nativeObj) : 0, image));
 }


  /**
   * 转换为lang_indicator对象(供脚本语言使用)。
   * 
   * @param widget lang_indicator对象。
   *
   * @return lang_indicator对象。
   */
 public  static TLangIndicator cast(TWidget widget)  {
    return new TLangIndicator(lang_indicator_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 如果希望用图片格式显示，本属性用于指定图片的前缀。
   *
   */
 public String getImage() {
   return lang_indicator_t_get_prop_image(this.nativeObj);
 }

static private native long lang_indicator_create(long parent, int x, int y, int w, int h);
static private native int lang_indicator_set_image(long widget, String image);
static private native long lang_indicator_cast(long widget);
static private native String lang_indicator_t_get_prop_image(long nativeObj);
};