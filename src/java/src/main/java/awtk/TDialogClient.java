package awtk;


/**
 * 对话框客户区控件。
 *
 *它本身不提供布局功能，仅提供具有语义的标签，让xml更具有可读性。
 *子控件的布局可用layout\_children属性指定。
 *请参考[布局参数](https://github.com/zlgopen/awtk/blob/master/docs/layout.md)。
 *
 *dialog\_client\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于dialog\_client\_t控件。
 *
 *在xml中使用"dialog\_client"标签创建dialog\_client。如：
 *
 *```xml
 *<dialog anim_hint="center_scale(duration=300)" x="c" y="m" w="80%" h="160" text="Dialog">
 *<dialog_title x="0" y="0" w="100%" h="30" text="Hello AWTK" />
 *<dialog_client x="0" y="bottom" w="100%" h="-30">
 *<label name="" x="center" y="middle:-20" w="200" h="30" text="Are you ready?"/>
 *<button name="quit" x="10" y="bottom:10" w="40%" h="30" text="确定"/>
 *<button name="quit" x="right:10" y="bottom:10" w="40%" h="30" text="取消"/>
 *</dialog_client>
 *</dialog>
 *```
 *
 *在c代码中，用dialog\_create\_simple创建对话框时，自动创建dialog客户区对象。
 *
 */
public class TDialogClient extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TDialogClient(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TDialogClient cast(long nativeObj) {
   return new TDialogClient(nativeObj);
 }


  /**
   * 创建dialog客户区对象。
   * 
   * @param parent 父控件
   * @param x x坐标
   * @param y y坐标
   * @param w 宽度
   * @param h 高度
   *
   * @return dialog对象。
   */
 public  static TWidget create(TWidget parent, int x, int y, int w, int h)  {
    return new TDialogClient(dialog_client_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为dialog_client对象(供脚本语言使用)。
   * 
   * @param widget dialog_client对象。
   *
   * @return dialog_client对象。
   */
 public  static TDialogClient cast(TWidget widget)  {
    return new TDialogClient(dialog_client_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long dialog_client_create(long parent, int x, int y, int w, int h);
static private native long dialog_client_cast(long widget);
};