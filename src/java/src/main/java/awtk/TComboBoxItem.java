package awtk;


/**
 * ComboBox Item控件。
 *
 *本类仅供combo\_box控件内部使用。
 *
 */
public class TComboBoxItem extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TComboBoxItem(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TComboBoxItem cast(long nativeObj) {
   return new TComboBoxItem(nativeObj);
 }


/**
 * 创建combo_box_item对象
 * 
 * @param parent 父控件
 * @param x x坐标
 * @param y y坐标
 * @param w 宽度
 * @param h 高度
 
 * @return 对象。
 */
 public  static TWidget create(TWidget parent, int x, int y, int w, int h)  {
    return new TComboBoxItem(combo_box_item_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换combo_box_item对象(供脚本语言使用)。
 * 
 * @param widget combo_box_item对象。
 
 * @return combo_box_item对象。
 */
 public  static TComboBoxItem cast(TWidget widget)  {
    return new TComboBoxItem(combo_box_item_cast(widget != null ? (widget.nativeObj) : 0));
 }


/**
 * 设置控件是否被选中。
 * 
 * @param checked 是否被选中。
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet setChecked(boolean checked)  {
   return TRet.from(combo_box_item_set_checked(this != null ? (this.nativeObj) : 0, checked));
 }


/**
 * 设置控件的值。
 * 
 * @param value 值
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet setValue(int value)  {
   return TRet.from(combo_box_item_set_value(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 是否被选中。
 *
 */
 public boolean getChecked() {
   return combo_box_item_t_get_prop_checked(this.nativeObj);
 }

static private native long combo_box_item_create(long parent, int x, int y, int w, int h);
static private native long combo_box_item_cast(long widget);
static private native int combo_box_item_set_checked(long widget, boolean checked);
static private native int combo_box_item_set_value(long widget, int value);
static private native int combo_box_item_t_get_prop_value(long nativeObj);
static private native boolean combo_box_item_t_get_prop_checked(long nativeObj);
};