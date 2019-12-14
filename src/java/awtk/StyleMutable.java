package awtk;


/**
 * 可变的style(可实时修改并生效，主要用于在designer中被编辑的控件，或者一些特殊控件)。 style\_mutable也对style\_const进行了包装，当用户没修改某个值时，便从style\_const中获取。
 *
 */
public class StyleMutable extends Style {
 public long nativeObj;

 public StyleMutable(long nativeObj) {
   super(nativeObj);
 }

 static public StyleMutable cast(long nativeObj) {
   return new StyleMutable(nativeObj);
 }


/**
 * 设置style的名称。
 * 
 * @param s style对象。
 * @param name 名称。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setName(String name)  {
   return Ret.from(style_mutable_set_name(this != null ? (this.nativeObj) : 0, name));
 }


/**
 * 设置指定名称整数格式的值。
 * 
 * @param s style对象。
 * @param state 控件状态。
 * @param name 属性名。
 * @param val 值。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setInt(String state, String name, int val)  {
   return Ret.from(style_mutable_set_int(this != null ? (this.nativeObj) : 0, state, name, val));
 }


/**
 * 转换为style_mutable对象。
 * 
 * @param s style对象。
 *
 * @returns style对象。
 */
 public  static StyleMutable cast(Style s)  {
   return new StyleMutable(style_mutable_cast(s != null ? (s.nativeObj) : 0));
 }


/**
 * 创建style\_mutable对象。 除了测试程序外不需要直接调用，widget会通过style\_factory\_create创建。
 * 
 * @param widget 控件
 * @param default_style 缺省的style。
 *
 * @returns style对象。
 */
 public  static Style create(Widget widget, Style default_style)  {
   return new StyleMutable(style_mutable_create(widget != null ? (widget.nativeObj) : 0, default_style != null ? (default_style.nativeObj) : 0));
 }

 public String getName() {
   return style_mutable_t_get_prop_name(this.nativeObj);
 }

static private native int style_mutable_set_name(long s, String name);
static private native int style_mutable_set_int(long s, String state, String name, int val);
static private native long style_mutable_cast(long s);
static private native long style_mutable_create(long widget, long default_style);
static private native String style_mutable_t_get_prop_name(long nativeObj);
}

