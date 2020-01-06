package awtk;


/**
 * 软键盘。
 *
 *软键盘是一个特殊的窗口，由编辑器通过输入法自动打开和关闭。
 *
 *这里介绍一下定制软键盘的方法：
 *
 *编辑器输入类型和软键盘UI资源文件的对应关系:
 *
 *| 输入类型       | 软键盘UI资源文件|
 *|----------------|:---------------:|
 *| INPUT\_PHONE    | kb\_phone.xml    |
 *| INPUT\_INT      | kb\_int.xml      |
 *| INPUT\_FLOAT    | kb\_float.xml    |
 *| INPUT\_UINT     | kb\_uint.xml     |
 *| INPUT\_UFLOAT   | kb\_ufloat.xml   |
 *| INPUT\_HEX      | kb\_hex.xml      |
 *| INPUT\_EMAIL    | kb\_ascii.xml    |
 *| INPUT\_PASSWORD | kb\_ascii.xml    |
 *| INPUT\_CUSTOM   | 使用自定义的键盘 |
 *| 其它            | kb\_default.xml  |
 *
 *keyboard中按钮子控件的名称有些特殊要求：
 *
 *|  名称          | 功能            |
 *|----------------|:---------------:|
 *| return         | 回车键          |
 *| action         | 定制按钮        |
 *| backspace      | 删除键          |
 *| tab            | tab键           |
 *| space          | 空格键          |
 *| close          | 关闭软键盘      |
 *| 前缀key:        | 键值           |
 *| 前缀hard_key:   | 模拟物理键盘    |
 *| 前缀page:       | 切换到页面      |
 *
 *示例：
 *
 ** 按键"a"，提交输入法处理。
 *
 *```xml
 *<button repeat="300" name="key:a" text="a"/>
 *```
 *
 ** 字符"a"，直接提交到编辑器。
 *
 *```xml
 *<button repeat="300" name="a" text="a"/>
 *```
 *
 ** 模拟物理键盘数字"1"，触发key down/up事件（可以用来选择候选字）。
 *
 *```xml
 *<button repeat="300" name="hard_key:1" text="1"/>
 *```
 *
 *> 更多用法请参考：
 *[kb_default](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/kb_default.xml)
 *
 */
public class TKeyboard extends TWindowBase { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TKeyboard(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TKeyboard cast(long nativeObj) {
   return new TKeyboard(nativeObj);
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
   * @return 对象。
   */
 public  static TWidget create(TWidget parent, int x, int y, int w, int h)  {
    return new TKeyboard(keyboard_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为keyboard对象(供脚本语言使用)。
   * 
   * @param widget keyboard对象。
   *
   * @return keyboard对象。
   */
 public  static TKeyboard cast(TWidget widget)  {
    return new TKeyboard(keyboard_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long keyboard_create(long parent, int x, int y, int w, int h);
static private native long keyboard_cast(long widget);
};