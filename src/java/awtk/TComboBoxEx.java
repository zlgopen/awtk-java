package awtk;


/**
 * 可滚动的combo_box控件。
 *
 */
public class TComboBoxEx extends TComboBox { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TComboBoxEx(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TComboBoxEx cast(long nativeObj) {
   return new TComboBoxEx(nativeObj);
 }


/**
 * 创建combo_box_ex对象
 * 
 * @param parent 父控件
 * @param x x坐标
 * @param y y坐标
 * @param w 宽度
 * @param h 高度
 
 * @return 对象。
 */
 public  static TWidget create(TWidget parent, int x, int y, int w, int h)  {
    return new TComboBoxEx(combo_box_ex_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

static private native long combo_box_ex_create(long parent, int x, int y, int w, int h);
};