package awtk;


/**
 * 控件风格。 widget从style对象中，获取诸如字体、颜色和图片相关的参数，根据这些参数来绘制界面。 ```c style_t* style = widget->astyle; int32_t margin = style_get_int(style, STYLE_ID_MARGIN, 2); int32_t icon_at = style_get_int(style, STYLE_ID_ICON_AT, ICON_AT_AUTO); uint16_t font_size = style_get_int(style, STYLE_ID_FONT_SIZE, TK_DEFAULT_FONT_SIZE); ``` 属性名称的请参考[style\_id](style_id_t.md)
 *
 */
public class Style {
 public long nativeObj;

 public Style(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public Style cast(long nativeObj) {
   return new Style(nativeObj);
 }


/**
 * widget状态改变时，通知style更新数据。
 * 
 * @param s style对象。
 * @param widget 控件对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret notifyWidgetStateChanged(Widget widget)  {
   return Ret.from(style_notify_widget_state_changed(this != null ? (this.nativeObj) : 0, widget != null ? (widget.nativeObj) : 0));
 }


/**
 * 检查style对象是否有效
 * 
 * @param s style对象。
 *
 * @returns 返回是否有效。
 */
 public  boolean isValid()  {
   return style_is_valid(this != null ? (this.nativeObj) : 0);
 }


/**
 * 获取指定name的整数格式的值。
 * 
 * @param s style对象。
 * @param name 属性名。
 * @param defval 缺省值。
 *
 * @returns 返回整数格式的值。
 */
 public  int getInt(String name, int defval)  {
   return style_get_int(this != null ? (this.nativeObj) : 0, name, defval);
 }


/**
 * 获取指定name的字符串格式的值。
 * 
 * @param s style对象。
 * @param name 属性名。
 * @param defval 缺省值。
 *
 * @returns 返回字符串格式的值。
 */
 public  String getStr(String name, String defval)  {
   return style_get_str(this != null ? (this.nativeObj) : 0, name, defval);
 }


/**
 * 设置指定状态的指定属性的值(仅仅对mutable的style有效)。
 * 
 * @param s style对象。
 * @param state 状态。
 * @param name 属性名。
 * @param value 值。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret set(String state, String name, Value value)  {
   return Ret.from(style_set(this != null ? (this.nativeObj) : 0, state, name, value != null ? (value.nativeObj) : 0));
 }


/**
 * 检查style是否是mutable的。
 * 
 * @param s style对象。
 *
 * @returns 返回TRUE表示是，否则表示不是。
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
}

