package awtk;


/**
 * 图文混排控件，实现简单的图文混排。
 *
 *rich\_text\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于rich\_text\_t控件。
 *
 *在xml中使用"rich\_text"标签创建图文混排控件。如：
 *
 *```xml
 *<rich_text x="0" y="0" w="100%" h="60"
 *text="<image name=&quota;bricks&quota;/><font align_v=&quota;middle&quota;>hello awtk!</font>" />
 *```
 *>
 *
 *> 更多用法请参考：
 *[rich_text.xml](https://github.com/zlgopen/awtk/blob/master/design/default/ui/rich_text.xml)
 *
 *在c代码中使用函数rich\_text\_create创建图文混排控件。如：
 *
 *
 *
 *> 完整示例请参考：
 *[rich_text demo](https://github.com/zlgopen/awtk-c-demos/blob/master/demos/rich_text.c)
 *
 *可用通过style来设置控件的显示风格，如背景颜色等等。而字体的大小和颜色则由文本内部的属性决定。
 *
 *目前支持image和font两个tag：
 *
 ** image 支持的属性有：
 ** name 图片的名称。
 ** w 图片的宽度。
 ** h 图片的高度。
 *
 ** font 支持的属性有：
 ** color 颜色。
 ** size 大小。
 ** align_v 垂直方向对齐的方式(top|middle|bottom)。
 ** bold 粗体(暂不支持)
 ** italic 斜体(暂不支持)
 ** underline 下划线(暂不支持)
 *
 */
public class TRichText extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TRichText(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TRichText cast(long nativeObj) {
   return new TRichText(nativeObj);
 }


  /**
   * 创建rich_text对象
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
    return new TRichText(rich_text_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 设置文本。
   * 
   * @param text 文本。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setText(String text)  {
   return TRet.from(rich_text_set_text(this != null ? (this.nativeObj) : 0, text));
 }


  /**
   * 设置是否允许y方向滑动。
   * 
   * @param yslidable 是否允许滑动。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setYslidable(boolean yslidable)  {
   return TRet.from(rich_text_set_yslidable(this != null ? (this.nativeObj) : 0, yslidable));
 }


  /**
   * 转换为rich_text对象(供脚本语言使用)。
   * 
   * @param widget rich_text对象。
   *
   * @return rich_text对象。
   */
 public  static TRichText cast(TWidget widget)  {
    return new TRichText(rich_text_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 行间距。
   *
   */
 public int getLineGap() {
   return rich_text_t_get_prop_line_gap(this.nativeObj);
 }


  /**
   * 标识控件是否允许上下拖动。(需满足文字的高度大于控件的高度)
   *
   */
 public boolean getYslidable() {
   return rich_text_t_get_prop_yslidable(this.nativeObj);
 }

static private native long rich_text_create(long parent, int x, int y, int w, int h);
static private native int rich_text_set_text(long widget, String text);
static private native int rich_text_set_yslidable(long widget, boolean yslidable);
static private native long rich_text_cast(long widget);
static private native int rich_text_t_get_prop_line_gap(long nativeObj);
static private native boolean rich_text_t_get_prop_yslidable(long nativeObj);
};