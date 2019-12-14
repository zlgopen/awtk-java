package awtk;


/**
 * 文本控件。用于显示一行或多行文本。
 * 
 *  文本控件不会根据文本的长度自动换行，只有文本内容包含换行符时才会换行。
 * 
 *  如需自动换行请使用[rich\_text\_t](rich_text_t.md)控件。
 * 
 *  label\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于label\_t控件。
 * 
 *  在xml中使用"label"标签创建文本控件。如：
 * 
 *  ```xml
 *  <label style="center" text="center"/>
 *  ```
 * 
 * 更多用法请参考：[label.xml](
 * https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/label.xml)
 * 
 *  在c代码中使用函数label\_create创建文本控件。如：
 * 
 *  ```c
 *   widget_t* label = label_create(win, 10, 10, 128, 30);
 *   widget_set_text(label, L"hello awtk!");
 *  ```
 * 
 * 创建之后，需要用widget\_set\_text或widget\_set\_text\_utf8设置文本内容。
 * 
 * 完整示例请参考：[label demo](
 * https://github.com/zlgopen/awtk-c-demos/blob/master/demos/label.c)
 * 
 *  可用通过style来设置控件的显示风格，如字体的大小和颜色等等。如：
 * 
 *  ```xml
 *   <style name="left">
 *    <normal text_color="red" text_align_h="left" border_color="#a0a0a0" margin="4" />
 *   </style>
 *  ```
 * 
 * 更多用法请参考：
 *  [theme default](
 * https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/styles/default.xml#L144)
 *
 */
public class Label extends Widget {
 public long nativeObj;

 public Label(long nativeObj) {
   super(nativeObj);
 }

 static public Label cast(long nativeObj) {
   return new Label(nativeObj);
 }


/**
 * 创建label对象
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
   return new Label(label_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 设置显示字符的个数(小余0时全部显示)。。
 * 
 * @param widget 控件对象。
 * @param length 最大可显示字符个数。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setLength(int length)  {
   return Ret.from(label_set_length(this != null ? (this.nativeObj) : 0, length));
 }


/**
 * 根据文本内容调节控件大小。
 * 
 * @param widget 控件对象。
 * @param min_w 最小宽度。
 * @param max_w 最大宽度。
 * @param min_h 最小高度。
 * @param max_h 最大高度。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret resizeToContent(int min_w, int max_w, int min_h, int max_h)  {
   return Ret.from(label_resize_to_content(this != null ? (this.nativeObj) : 0, min_w, max_w, min_h, max_h));
 }


/**
 * 转换为label对象(供脚本语言使用)。
 * 
 * @param widget label对象。
 *
 * @returns label对象。
 */
 public  static Label cast(Widget widget)  {
   return new Label(label_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public int getLength() {
   return label_t_get_prop_length(this.nativeObj);
 }

static private native long label_create(long parent, int x, int y, int w, int h);
static private native int label_set_length(long widget, int length);
static private native int label_resize_to_content(long widget, int min_w, int max_w, int min_h, int max_h);
static private native long label_cast(long widget);
static private native int label_t_get_prop_length(long nativeObj);
}

