package awtk;


/**
 * 图文混排控件，实现简单的图文混排。 rich\_text\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于rich\_text\_t控件。 在xml中使用"rich\_text"标签创建图文混排控件。如： ```xml <rich_text x="0" y="0" w="100%" h="60" text="<image name=&quota;bricks&quota;/><font align_v=&quota;middle&quota;>hello awtk!</font>" /> ``` 更多用法请参考： [rich_text.xml](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/rich_text.xml) 在c代码中使用函数rich\_text\_create创建图文混排控件。如： ```c  widget_t* rich_text = rich_text_create(win, 0, 0, 0, 0);  widget_set_text_utf8(rich_text,                    "<image name=\"bricks\"/><font color=\"gold\" align_v=\"bottom\" "                    "size=\"24\">hello awtk!</font><font color=\"green\" size=\"20\">ProTip! The "                    "feed shows you events from people you follow and repositories you watch. "                    "nhello world. </font><font color=\"red\" "                    "size=\"20\">确定取消中文字符测试。确定。取消。中文字符测试。</font>"); widget_set_self_layout_params(rich_text, "center", "middle", "100%", "100%"); ``` 完整示例请参考： [rich_text demo](https://github.com/zlgopen/awtk-c-demos/blob/master/demos/rich_text.c) 可用通过style来设置控件的显示风格，如背景颜色等等。而字体的大小和颜色则由文本内部的属性决定。 目前支持image和font两个tag： * image 支持的属性有：   * name 图片的名称。   * w 图片的宽度。   * h 图片的高度。 * font 支持的属性有：   * color 颜色。   * size 大小。   * align_v 垂直方向对齐的方式(top|middle|bottom)。   * bold 粗体(暂不支持)   * italic 斜体(暂不支持)   * underline 下划线(暂不支持)
 *
 */
public class RichText extends Widget {
 public long nativeObj;

 public RichText(long nativeObj) {
   super(nativeObj);
 }

 static public RichText cast(long nativeObj) {
   return new RichText(nativeObj);
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
 * @returns 对象。
 */
 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new RichText(rich_text_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 设置文本。
 * 
 * @param widget 控件对象。
 * @param text 文本。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setText(String text)  {
   return Ret.from(rich_text_set_text(this != null ? (this.nativeObj) : 0, text));
 }


/**
 * 转换为rich_text对象(供脚本语言使用)。
 * 
 * @param widget rich_text对象。
 *
 * @returns rich_text对象。
 */
 public  static RichText cast(Widget widget)  {
   return new RichText(rich_text_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public int getLineGap() {
   return rich_text_t_get_prop_line_gap(this.nativeObj);
 }

 public int getMargin() {
   return rich_text_t_get_prop_margin(this.nativeObj);
 }

static private native long rich_text_create(long parent, int x, int y, int w, int h);
static private native int rich_text_set_text(long widget, String text);
static private native long rich_text_cast(long widget);
static private native int rich_text_t_get_prop_line_gap(long nativeObj);
static private native int rich_text_t_get_prop_margin(long nativeObj);
}

