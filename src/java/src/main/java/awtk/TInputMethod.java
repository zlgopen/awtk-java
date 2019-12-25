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
   * 获取全局输入法对象。
   * 
   *
   * @return 成功返回输入法对象，失败返回NULL。
   */
 public  static TInputMethod instance()  {
    return new TInputMethod(input_method());
 }

static private native int input_method_commit_text(long im, String text);
static private native int input_method_dispatch_key(long im, int key);
static private native long input_method();
};