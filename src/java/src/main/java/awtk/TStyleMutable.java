package awtk;


/**
 * 可变的style(可实时修改并生效，主要用于在designer中被编辑的控件，或者一些特殊控件)。
 *
 *style\_mutable也对style\_const进行了包装，当用户没修改某个值时，便从style\_const中获取。
 *
 */
public class TStyleMutable extends TStyle { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TStyleMutable(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TStyleMutable cast(long nativeObj) {
   return new TStyleMutable(nativeObj);
 }


  /**
   * 设置style的名称。
   * 
   * @param name 名称。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setName(String name)  {
   return TRet.from(style_mutable_set_name(this != null ? (this.nativeObj) : 0, name));
 }


  /**
   * 设置指定名称整数格式的值。
   * 
   * @param state 控件状态。
   * @param name 属性名。
   * @param val 值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setInt(String state, String name, int val)  {
   return TRet.from(style_mutable_set_int(this != null ? (this.nativeObj) : 0, state, name, val));
 }


  /**
   * 转换为style_mutable对象。
   * 
   * @param s style对象。
   *
   * @return style对象。
   */
 public  static TStyleMutable cast(TStyle s)  {
    return new TStyleMutable(style_mutable_cast(s != null ? (s.nativeObj) : 0));
 }


  /**
   * 创建style\_mutable对象。
   *
   *> 除了测试程序外不需要直接调用，widget会通过style\_factory\_create创建。
   * 
   * @param default_style 缺省的style。
   *
   * @return style对象。
   */
 public  static TStyle create(TStyle default_style)  {
    return new TStyleMutable(style_mutable_create(default_style != null ? (default_style.nativeObj) : 0));
 }


  /**
   * 名称。
   *
   */
 public String getName() {
   return style_mutable_t_get_prop_name(this.nativeObj);
 }

static private native int style_mutable_set_name(long s, String name);
static private native int style_mutable_set_int(long s, String state, String name, int val);
static private native long style_mutable_cast(long s);
static private native long style_mutable_create(long default_style);
static private native String style_mutable_t_get_prop_name(long nativeObj);
};