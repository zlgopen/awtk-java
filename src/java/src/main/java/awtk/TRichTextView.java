package awtk;


/**
 * rich_text_view是一个专用容器，用来放rich text和 scroll bar，并在两者之间建立联系。
 *
 *rich_text_view\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于rich_text_view\_t控件。
 *
 *在xml中使用"rich_text_view"标签创建rich_text_view。如：
 *
 *```xml
 *<rich_text_view x="0" y="10" w="100%" h="300">
 *<rich_text line_gap="5" x="0" y="10" w="-12" h="100%" margin="10">
 *...
 *</rich_text>
 *<scroll_bar_d name="bar" x="right" y="0" w="12" h="100%" value="0"/>
 *</rich_text_view>
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
public class TRichTextView extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TRichTextView(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TRichTextView cast(long nativeObj) {
   return new TRichTextView(nativeObj);
 }


  /**
   * 创建rich_text_view对象
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
    return new TRichTextView(rich_text_view_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为rich_text_view对象(供脚本语言使用)。
   * 
   * @param widget rich_text_view对象。
   *
   * @return rich_text_view对象。
   */
 public  static TRichTextView cast(TWidget widget)  {
    return new TRichTextView(rich_text_view_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long rich_text_view_create(long parent, int x, int y, int w, int h);
static private native long rich_text_view_cast(long widget);
};