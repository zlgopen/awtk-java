package awtk;

public class ComboBoxItem extends Widget {
 public ComboBoxItem(long nativeObj) {
   super(nativeObj);
 }

 static public ComboBoxItem cast(long nativeObj) {
   return new ComboBoxItem(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new ComboBoxItem(combo_box_item_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new ComboBoxItem(combo_box_item_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public  Ret setChecked(boolean checked)  {
   return Ret.from(combo_box_item_set_checked(this.nativeObj, checked));
 }

 public  Ret setValue(int value)  {
   return Ret.from(combo_box_item_set_value(this.nativeObj, value));
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

