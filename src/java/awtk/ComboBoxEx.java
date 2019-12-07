package awtk;

public class ComboBoxEx extends ComboBox {
 public ComboBoxEx(long nativeObj) {
   super(nativeObj);
 }

 static public ComboBoxEx cast(long nativeObj) {
   return new ComboBoxEx(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new ComboBoxEx(combo_box_ex_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

static private native long combo_box_ex_create(long parent, int x, int y, int w, int h);
}

