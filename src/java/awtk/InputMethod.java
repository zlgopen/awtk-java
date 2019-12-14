package awtk;


/**
 * 输入法接口。 常见的实现方式有以下几种： * 空实现。用于不需要输入法的嵌入式平台。 * 缺省实现。用于需要输入法的嵌入式平台。 * 基于SDL实现的平台原生输入法。用于桌面系统和手机系统。 ```graphviz  [default_style]  input_method_default_t -> input_method_t [arrowhead=empty style=dashed]  input_method_sdl_t -> input_method_t [arrowhead=empty style=dashed]  input_method_null_t -> input_method_t [arrowhead=empty style=dashed] ``` 输入类型请参考：[input\_type](input_type_t.md)
 *
 */
public class InputMethod {
 public long nativeObj;

 public InputMethod(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public InputMethod cast(long nativeObj) {
   return new InputMethod(nativeObj);
 }


/**
 * 提交输入文本。
 * 
 * @param im 输入法对象。
 * @param text 文本。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret commitText(String text)  {
   return Ret.from(input_method_commit_text(this != null ? (this.nativeObj) : 0, text));
 }


/**
 * 提交按键。
 * 
 * @param im 输入法对象。
 * @param key 键值。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret dispatchKey(int key)  {
   return Ret.from(input_method_dispatch_key(this != null ? (this.nativeObj) : 0, key));
 }


/**
 * 获取全局输入法对象。
 * 
 *
 * @returns 成功返回输入法对象，失败返回NULL。
 */
 public  static InputMethod instance()  {
   return new InputMethod(input_method());
 }

static private native int input_method_commit_text(long im, String text);
static private native int input_method_dispatch_key(long im, int key);
static private native long input_method();
}

