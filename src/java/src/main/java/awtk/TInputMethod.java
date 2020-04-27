package awtk;


/**
 * 输入法接口。
 *
 *常见的实现方式有以下几种：
 *
 ** 空实现。用于不需要输入法的嵌入式平台。
 *
 ** 缺省实现。用于需要输入法的嵌入式平台。
 *
 ** 基于SDL实现的平台原生输入法。用于桌面系统和手机系统。
 *
 *
 *
 *> 输入类型请参考：[input\_type](input_type_t.md)
 *
 */
public class TInputMethod { 

/**
 * 原生对象。
 */
 public long nativeObj;


/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TInputMethod(long nativeObj) {
   this.nativeObj = nativeObj;
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TInputMethod cast(long nativeObj) {
   return new TInputMethod(nativeObj);
 }


  /**
   * 提交输入文本。
   * 
   * @param text 文本。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet commitText(String text)  {
   return TRet.from(input_method_commit_text(this != null ? (this.nativeObj) : 0, text));
 }


  /**
   * 设置语言。
   *
   *> 有时在同一种语言环境下，也需要输入多种文字，典型的情况是同时输入中文和英文。
   *> 比如T9输入法，可以同时支持中文和英文输入，配合软键盘随时切换输入的语言。
   *> 数字、小写字母、大写字母和符合也可以视为输入的语言。
   *> 主要用于提示输入法引擎选择适当的输入方法。
   * 
   * @param lang 语言。格式为语言+国家/地区码。如：zh_cn和en_us等。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setLang(String lang)  {
   return TRet.from(input_method_set_lang(this != null ? (this.nativeObj) : 0, lang));
 }


  /**
   * 获取语言。
   * 
   *
   * @return 返回语言。
   */
 public  String getLang()  {
    return input_method_get_lang(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 提交按键。
   * 
   * @param key 键值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet dispatchKey(int key)  {
   return TRet.from(input_method_dispatch_key(this != null ? (this.nativeObj) : 0, key));
 }


  /**
   * 提交按键。
   * 
   * @param key 键值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet dispatchKeys(String key)  {
   return TRet.from(input_method_dispatch_keys(this != null ? (this.nativeObj) : 0, key));
 }


  /**
   * 分发进入预编辑状态的事件。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet dispatchPreedit()  {
   return TRet.from(input_method_dispatch_preedit(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 分发确认预编辑状态的事件(提交预编辑内容，退出预编辑状态)。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet dispatchPreeditConfirm()  {
   return TRet.from(input_method_dispatch_preedit_confirm(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 分发取消预编辑状态的事件(提交预编辑内容，退出预编辑状态)。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet dispatchPreeditAbort()  {
   return TRet.from(input_method_dispatch_preedit_abort(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 获取全局输入法对象。
   * 
   *
   * @return 成功返回输入法对象，失败返回NULL。
   */
 public  static TInputMethod instance()  {
    return new TInputMethod(input_method());
 }

static private native int input_method_commit_text(long im, String text);
static private native int input_method_set_lang(long im, String lang);
static private native String input_method_get_lang(long im);
static private native int input_method_dispatch_key(long im, int key);
static private native int input_method_dispatch_keys(long im, String key);
static private native int input_method_dispatch_preedit(long im);
static private native int input_method_dispatch_preedit_confirm(long im);
static private native int input_method_dispatch_preedit_abort(long im);
static private native long input_method();
};