package awtk;


/**
 * 行号。多行编辑器的行号。 line\_number\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于line\_number\_t控件。 在xml中使用"lin\e_number"标签创建行号控件，一般配合mledit使用。如： ```xml <mledit x="c" y="10" h="40%" w="90%" focus="true" left_margin="36" right_margin="16" wrap_word="true">  <line_number x="0" y="0" w="32" h="100%" value="0"/>  <scroll_bar_d x="right" y="0" w="14" h="100%" value="0"/> </mledit> ``` 更多用法请参考：[mledit.xml](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/mledit.xml) 可用通过style来设置控件的显示风格，如字体的大小和颜色等等。如： ```xml <line_number> <style name="default">    <normal text_color="black" bg_color="#d0d0d0" text_align_h="right"/> </style> </line_number> ``` 更多用法请参考： [theme default](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/styles/default.xml#L556)
 *
 */
public class LineNumber extends Widget {
 public long nativeObj;

 public LineNumber(long nativeObj) {
   super(nativeObj);
 }

 static public LineNumber cast(long nativeObj) {
   return new LineNumber(nativeObj);
 }


/**
 * 创建line_number对象
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
   return new LineNumber(line_number_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 设置顶部边距。
 * 
 * @param widget 控件对象。
 * @param top_margin 顶部边距。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setTopMargin(int top_margin)  {
   return Ret.from(line_number_set_top_margin(this != null ? (this.nativeObj) : 0, top_margin));
 }


/**
 * 设置顶部边距。
 * 
 * @param widget 控件对象。
 * @param bottom_margin 顶部边距。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setBottomMargin(int bottom_margin)  {
   return Ret.from(line_number_set_bottom_margin(this != null ? (this.nativeObj) : 0, bottom_margin));
 }


/**
 * 设置行高。
 * 
 * @param widget 控件对象。
 * @param line_height 行高。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setLineHeight(int line_height)  {
   return Ret.from(line_number_set_line_height(this != null ? (this.nativeObj) : 0, line_height));
 }


/**
 * 设置y偏移。
 * 
 * @param widget 控件对象。
 * @param yoffset 行高。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setYoffset(int yoffset)  {
   return Ret.from(line_number_set_yoffset(this != null ? (this.nativeObj) : 0, yoffset));
 }


/**
 * 转换为line_number对象(供脚本语言使用)。
 * 
 * @param widget line_number对象。
 *
 * @returns line_number对象。
 */
 public  static LineNumber cast(Widget widget)  {
   return new LineNumber(line_number_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long line_number_create(long parent, int x, int y, int w, int h);
static private native int line_number_set_top_margin(long widget, int top_margin);
static private native int line_number_set_bottom_margin(long widget, int bottom_margin);
static private native int line_number_set_line_height(long widget, int line_height);
static private native int line_number_set_yoffset(long widget, int yoffset);
static private native long line_number_cast(long widget);
}

