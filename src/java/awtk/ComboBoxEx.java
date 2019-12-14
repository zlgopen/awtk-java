package awtk;


/**
 * 可滚动的combo_box控件。
 *
 */
public class ComboBoxEx extends ComboBox {
 public long nativeObj;

 public ComboBoxEx(long nativeObj) {
   super(nativeObj);
 }

 static public ComboBoxEx cast(long nativeObj) {
   return new ComboBoxEx(nativeObj);
 }


/**
 * 创建combo_box_ex对象
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
   return new ComboBoxEx(combo_box_ex_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

static private native long combo_box_ex_create(long parent, int x, int y, int w, int h);
}

