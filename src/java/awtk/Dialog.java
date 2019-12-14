package awtk;


/**
 * 对话框。 对话框是一种特殊的窗口，大小和位置可以自由设置。 AWTK中的对话框可以是模态的，也可以是非模态的。 如果dialog有透明或半透效果则不支持窗口动画。> 由于浏览器中无法实现主循环嵌套，因此无法实现模态对话框。 如果希望自己写的AWTK应用程序可以在浏览器(包括各种小程序)中运行或演示， 请避免使用模态对话框。 对话框通常由对话框标题和对话框客户区两部分组成： ```graphviz   [default_style]   dialog_title_t -> dialog_t[arrowhead = "ediamond"]   dialog_client_t -> dialog_t[arrowhead = "ediamond"] ``` dialog\_t是[window\_base\_t](window_base_t.md)的子类控件，window\_base\_t的函数均适用于dialog\_t控件。 在xml中使用"dialog"标签创建对话框。如： ```xml <dialog anim_hint="center_scale(duration=300)" x="c" y="m" w="80%" h="160" text="Dialog"> <dialog_title x="0" y="0" w="100%" h="30" text="Hello AWTK" /> <dialog_client x="0" y="bottom" w="100%" h="-30">   <label name="" x="center" y="middle:-20" w="200" h="30" text="Are you ready?"/>   <button name="quit" x="10" y="bottom:10" w="40%" h="30" text="确定"/>   <button name="quit" x="right:10" y="bottom:10" w="40%" h="30" text="取消"/> </dialog_client> </dialog> ``` 如果你不需要对话框的标题，可以这样写： ```xml <dialog anim_hint="center_scale(duration=300)" x="c" y="m" w="80%" h="160" text="Dialog">   <label name="" x="center" y="middle:-20" w="200" h="30" text="Are you ready?"/>   <button name="quit" x="10" y="bottom:10" w="40%" h="30" text="确定"/>   <button name="quit" x="right:10" y="bottom:10" w="40%" h="30" text="取消"/> </dialog> ``` 打开非模态对话框时，其用法与普通窗口一样。打开非模态对话框时，还需要调用dialog\_modal。 ```c  widget_t* dlg = dialog_open(name);  ret = dialog_modal(dlg); ``` 关闭模态对话框用dialog\_quit ```c static ret_t on_dialog_btn_click(void* ctx, event_t* evt) {   widget_t* win = widget_get_window(WIDGET(evt->target));   int code = (char*)ctx - (char*)NULL;   dialog_quit(win, code);    return RET_OK; } ``` 关闭非模态对话框用window\_close。 ```c static ret_t on_dialog_btn_click(void* ctx, event_t* evt) {   widget_t* win = widget_get_window(WIDGET(evt->target));   int code = (char*)ctx - (char*)NULL;   window_close(win);   return RET_OK; } ``` 更多用法请参考： [dialog.xml](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/) 完整C代码示例请参考： * [非模态对话框](https://github.com/zlgopen/awtk-c-demos/blob/master/demos/dialog.c) * [模态对话框](https://github.com/zlgopen/awtk-c-demos/blob/master/demos/dialog_modal.c)可用通过style来设置控件的显示风格，如字体的大小和颜色等等。如： ```xml <style name="default">   <normal border_color="#606060" /> </style> ``` 更多用法请参考： [theme default] (https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/styles/default.xml#L324)
 *
 */
public class Dialog extends WindowBase {
 public long nativeObj;

 public Dialog(long nativeObj) {
   super(nativeObj);
 }

 static public Dialog cast(long nativeObj) {
   return new Dialog(nativeObj);
 }


/**
 * 创建dialog对象。
 * 
 * @param parent 父控件
 * @param x x坐标
 * @param y y坐标
 * @param w 宽度
 * @param h 高度
 *
 * @returns dialog对象。
 */
 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new Dialog(dialog_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 创建dialog对象，同时创建title/client。
 * 
 * @param parent 父控件
 * @param x x坐标
 * @param y y坐标
 * @param w 宽度
 * @param h 高度
 *
 * @returns dialog对象。
 */
 public  static Widget createSimple(Widget parent, int x, int y, int w, int h)  {
   return new Dialog(dialog_create_simple(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换dialog对象(供脚本语言使用)。
 * 
 * @param widget dialog对象。
 *
 * @returns dialog对象。
 */
 public  static Dialog cast(Widget widget)  {
   return new Dialog(dialog_cast(widget != null ? (widget.nativeObj) : 0));
 }


/**
 * 获取title控件。
 * 
 * @param widget dialog对象。
 *
 * @returns title对象。
 */
 public  Widget getTitle()  {
   return new Widget(dialog_get_title(this != null ? (this.nativeObj) : 0));
 }


/**
 * 获取client控件。
 * 
 * @param widget dialog对象。
 *
 * @returns client对象。
 */
 public  Widget getClient()  {
   return new Widget(dialog_get_client(this != null ? (this.nativeObj) : 0));
 }


/**
 * 从资源文件中加载并创建Dialog对象。 本函数在ui\_loader/ui\_builder_default里实现。
 * 
 * @param name dialog的名称。
 *
 * @returns 对象。
 */
 public  static Widget open(String name)  {
   return new Dialog(dialog_open(name));
 }


/**
 * 设置对话框的标题文本。
 * 
 * @param widget dialog对象。
 * @param title 标题。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setTitle(String title)  {
   return Ret.from(dialog_set_title(this != null ? (this.nativeObj) : 0, title));
 }


/**
 * 模态显示对话框。 dialog_modal返回后，dialog对象将在下一个idle函数中回收。 也就是在dialog_modal调用完成后仍然可以访问dialog中控件，直到本次事件结束。
 * 
 * @param widget dialog对象。
 *
 * @returns 返回退出吗。
 */
 public  DialogQuitCode modal()  {
   return DialogQuitCode.from(dialog_modal(this != null ? (this.nativeObj) : 0));
 }


/**
 * 退出模态显示，关闭对话框。> 比如，在对话框中关闭按钮的事件处理函数中，调用本函数关闭对话框。
 * 
 * @param widget dialog对象。
 * @param code 退出码，作为dialog_modal的返回值(参考：[dialog_quit_code_t](dialog_quit_code_t.md))。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret quit(int code)  {
   return Ret.from(dialog_quit(this != null ? (this.nativeObj) : 0, code));
 }


/**
 * 检查对话框是否已经退出模态。
 * 
 * @param widget dialog对象。
 *
 * @returns 返回TRUE表示已经退出，否则表示没有。
 */
 public  boolean isQuited()  {
   return dialog_is_quited(this != null ? (this.nativeObj) : 0);
 }


/**
 * 检查对话框是否为模态对话框。
 * 
 * @param widget dialog对象。
 *
 * @returns 返回TRUE表示是模态对话框，否则表示不是。
 */
 public  boolean isModal()  {
   return dialog_is_modal(this != null ? (this.nativeObj) : 0);
 }


/**
 * 显示『短暂提示信息』对话框。 主题由dialog_toast.xml文件决定。
 * 
 * @param text 文本内容。
 * @param duration 显示时间(单位为毫秒)。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  static Ret toast(String text, int duration)  {
   return Ret.from(dialog_toast(text, duration));
 }


/**
 * 显示『提示信息』对话框。 主题由dialog_info.xml文件决定。
 * 
 * @param title 标题。
 * @param text 文本内容。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  static Ret info(String title, String text)  {
   return Ret.from(dialog_info(title, text));
 }


/**
 * 显示『警告』对话框。 主题由dialog_warn.xml文件决定。
 * 
 * @param title 标题。
 * @param text 文本内容。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  static Ret warn(String title, String text)  {
   return Ret.from(dialog_warn(title, text));
 }


/**
 * 显示『确认』对话框。 主题由dialog_confirm.xml文件决定。
 * 
 * @param title 标题。
 * @param text 文本内容。
 *
 * @returns 返回RET_OK表示确认，否则表示取消。
 */
 public  static Ret confirm(String title, String text)  {
   return Ret.from(dialog_confirm(title, text));
 }

 public String getHighlight() {
   return dialog_t_get_prop_highlight(this.nativeObj);
 }

static private native long dialog_create(long parent, int x, int y, int w, int h);
static private native long dialog_create_simple(long parent, int x, int y, int w, int h);
static private native long dialog_cast(long widget);
static private native long dialog_get_title(long widget);
static private native long dialog_get_client(long widget);
static private native long dialog_open(String name);
static private native int dialog_set_title(long widget, String title);
static private native int dialog_modal(long widget);
static private native int dialog_quit(long widget, int code);
static private native boolean dialog_is_quited(long widget);
static private native boolean dialog_is_modal(long widget);
static private native int dialog_toast(String text, int duration);
static private native int dialog_info(String title, String text);
static private native int dialog_warn(String title, String text);
static private native int dialog_confirm(String title, String text);
static private native String dialog_t_get_prop_highlight(long nativeObj);
}

