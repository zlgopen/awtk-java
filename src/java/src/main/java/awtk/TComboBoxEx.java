package awtk;


/**
 * 扩展combo_box控件。支持以下功能：
 ** 支持滚动。项目比较多时显示滚动条。
 ** 自动调整弹出窗口的宽度。根据最长文本自动调整弹出窗口的宽度。
 ** 支持分组显示。如果item的文本以"seperator."开头，视为一个分组开始，其后的文本为分组的标题。比如: "seperator.basic"，会创建一个basic为标题的分组。
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
   *
   * @return 对象。
   */
 public  static TWidget create(TWidget parent, int x, int y, int w, int h)  {
    return new TComboBoxEx(combo_box_ex_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

static private native long combo_box_ex_create(long parent, int x, int y, int w, int h);
};