package awtk;


/**
 * 软键盘。
 * 
 *  软键盘是一个特殊的窗口，由编辑器通过输入法自动打开和关闭。
 * 
 *  这里介绍一下定制软键盘的方法：
 * 
 *   编辑器输入类型和软键盘UI资源文件的对应关系:
 * 
 * | 输入类型       | 软键盘UI资源文件|
 * |----------------|:---------------:|
 * | INPUT\_PHONE    | kb\_phone.xml    |
 * | INPUT\_INT      | kb\_int.xml      |
 * | INPUT\_FLOAT    | kb\_float.xml    |
 * | INPUT\_UINT     | kb\_uint.xml     |
 * | INPUT\_UFLOAT   | kb\_ufloat.xml   |
 * | INPUT\_HEX      | kb\_hex.xml      |
 * | INPUT\_EMAIL    | kb\_ascii.xml    |
 * | INPUT\_PASSWORD | kb\_ascii.xml    |
 * | INPUT\_CUSTOM   | 使用自定义的键盘 |
 * | 其它            | kb\_default.xml  |
 * 
 *  keyboard中按钮子控件的名称有些特殊要求：
 * 
 * |  名称          | 功能            |
 * |----------------|:---------------:|
 * | return         | 回车键          |
 * | action         | 定制按钮        |
 * | backspace      | 删除键          |
 * | tab            | tab键           |
 * | space          | 空格键          |
 * | close          | 关闭软键盘      |
 * | 前缀key:       | 键值            |
 * | 前缀page:      | 切换到页面      |
 * 
 * 
 * 更多用法请参考：
 *  [kb_default](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/kb_default.xml)
 *
 */
public class Keyboard extends WindowBase {
 public long nativeObj;

 public Keyboard(long nativeObj) {
   super(nativeObj);
 }

 static public Keyboard cast(long nativeObj) {
   return new Keyboard(nativeObj);
 }


/**
 * 创建keyboard对象
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
   return new Keyboard(keyboard_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换为keyboard对象(供脚本语言使用)。
 * 
 * @param widget keyboard对象。
 *
 * @returns keyboard对象。
 */
 public  static Keyboard cast(Widget widget)  {
   return new Keyboard(keyboard_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long keyboard_create(long parent, int x, int y, int w, int h);
static private native long keyboard_cast(long widget);
}

