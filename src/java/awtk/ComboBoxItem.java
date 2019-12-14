package awtk;


/**
 * ComboBox Item控件。
 * 
 *  本类仅供combo\_box控件内部使用。
 *
 */
public class ComboBoxItem extends Widget {
 public long nativeObj;

 public ComboBoxItem(long nativeObj) {
   super(nativeObj);
 }

 static public ComboBoxItem cast(long nativeObj) {
   return new ComboBoxItem(nativeObj);
 }


/**
 * 创建combo_box_item对象
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
   return new ComboBoxItem(combo_box_item_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


/**
 * 转换combo_box_item对象(供脚本语言使用)。
 * 
 * @param widget combo_box_item对象。
 *
 * @returns combo_box_item对象。
 */
 public  static ComboBoxItem cast(Widget widget)  {
   return new ComboBoxItem(combo_box_item_cast(widget != null ? (widget.nativeObj) : 0));
 }


/**
 * 设置控件是否被选中。
 * 
 * @param widget combo_box_item对象。
 * @param checked 是否被选中。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setChecked(boolean checked)  {
   return Ret.from(combo_box_item_set_checked(this != null ? (this.nativeObj) : 0, checked));
 }


/**
 * 设置控件的值。
 * 
 * @param widget combo_box_item对象。
 * @param value 值
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setValue(int value)  {
   return Ret.from(combo_box_item_set_value(this != null ? (this.nativeObj) : 0, value));
 }

 public boolean getChecked() {
   return combo_box_item_t_get_prop_checked(this.nativeObj);
 }

static private native long combo_box_item_create(long parent, int x, int y, int w, int h);
static private native long combo_box_item_cast(long widget);
static private native int combo_box_item_set_checked(long widget, boolean checked);
static private native int combo_box_item_set_value(long widget, int value);
static private native int combo_box_item_t_get_prop_value(long nativeObj);
static private native boolean combo_box_item_t_get_prop_checked(long nativeObj);
}

