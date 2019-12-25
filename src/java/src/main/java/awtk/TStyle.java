package awtk;


/**
 * 控件风格。
 *
 *widget从style对象中，获取诸如字体、颜色和图片相关的参数，根据这些参数来绘制界面。
 *
 *
 *属性名称的请参考[style\_id](style_id_t.md)
 *
 */
public class TStyle { 

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
 public TStyle(long nativeObj) {
   this.nativeObj = nativeObj;
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TStyle cast(long nativeObj) {
   return new TStyle(nativeObj);
 }


/**
 * widget状态改变时，通知style更新数据。
 * 
 * @param widget 控件对象。
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet notifyWidgetStateChanged(TWidget widget)  {
   return TRet.from(style_notify_widget_state_changed(this != null ? (this.nativeObj) : 0, widget != null ? (widget.nativeObj) : 0));
 }


/**
 * 检查style对象是否有效
 * 
 
 * @return 返回是否有效。
 */
 public  boolean isValid()  {
    return style_is_valid(this != null ? (this.nativeObj) : 0);
 }


/**
 * 获取指定name的整数格式的值。
 * 
 * @param name 属性名。
 * @param defval 缺省值。
 
 * @return 返回整数格式的值。
 */
 public  int getInt(String name, int defval)  {
    return style_get_int(this != null ? (this.nativeObj) : 0, name, defval);
 }


/**
 * 获取指定name的字符串格式的值。
 * 
 * @param name 属性名。
 * @param defval 缺省值。
 
 * @return 返回字符串格式的值。
 */
 public  String getStr(String name, String defval)  {
    return style_get_str(this != null ? (this.nativeObj) : 0, name, defval);
 }


/**
 * 设置指定状态的指定属性的值(仅仅对mutable的style有效)。
 * 
 * @param state 状态。
 * @param name 属性名。
 * @param value 值。
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet set(String state, String name, TValue value)  {
   return TRet.from(style_set(this != null ? (this.nativeObj) : 0, state, name, value != null ? (value.nativeObj) : 0));
 }


/**
 * 检查style是否是mutable的。
 * 
 
 * @return 返回TRUE表示是，否则表示不是。
 */
 public  boolean isMutable()  {
    return style_is_mutable(this != null ? (this.nativeObj) : 0);
 }

static private native int style_notify_widget_state_changed(long s, long widget);
static private native boolean style_is_valid(long s);
static private native int style_get_int(long s, String name, int defval);
static private native String style_get_str(long s, String name, String defval);
static private native int style_set(long s, String state, String name, long value);
static private native boolean style_is_mutable(long s);
};