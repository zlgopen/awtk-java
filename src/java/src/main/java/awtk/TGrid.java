package awtk;


/**
 * 网格。
 *在xml中使用"grid"标签创建控件。如：
 *
 *```xml
 *<!-- ui -->
 *<grid x="c" y="50" w="100" h="100"/>
 *```
 *
 *可用通过style来设置控件的显示风格，如字体的大小和颜色等等。如：
 *
 *```xml
 *<!-- style -->
 *<grid>
 *<style name="default" grid_color="gray" border_color="black" odd_bg_color="#f5f5f5" even_bg_color="#eeeeee">
 *<normal />
 *</style>
 *</grid>
 *```
 *
 */
public class TGrid extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TGrid(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TGrid cast(long nativeObj) {
   return new TGrid(nativeObj);
 }


  /**
   * 创建grid对象
   * 
   * @param parent 父控件
   * @param x x坐标
   * @param y y坐标
   * @param w 宽度
   * @param h 高度
   *
   * @return grid对象。
   */
 public  static TWidget create(TWidget parent, int x, int y, int w, int h)  {
    return new TGrid(grid_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为grid对象(供脚本语言使用)。
   * 
   * @param widget grid对象。
   *
   * @return grid对象。
   */
 public  static TGrid cast(TWidget widget)  {
    return new TGrid(grid_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 设置 行数。
   * 
   * @param rows 行数。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setRows(int rows)  {
   return TRet.from(grid_set_rows(this != null ? (this.nativeObj) : 0, rows));
 }


  /**
   * 设置 各列的参数。
   * 
   * @param columns_definition 各列的参数。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setColumnsDefinition(String columns_definition)  {
   return TRet.from(grid_set_columns_definition(this != null ? (this.nativeObj) : 0, columns_definition));
 }


  /**
   * 设置 是否显示网格。
   * 
   * @param show_grid 是否显示网格。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setShowGrid(boolean show_grid)  {
   return TRet.from(grid_set_show_grid(this != null ? (this.nativeObj) : 0, show_grid));
 }


  /**
   * 行数。
   *
   */
 public int getRows() {
   return grid_t_get_prop_rows(this.nativeObj);
 }


  /**
   * 各列的参数。
   *各列的参数之间用英文的分号(;)分隔，每列参数的格式为：
   *
   *col(w=?,left_margin=?,right_margin=?,top_maorgin=?,bottom_margin=?)
   *
   ** w 为列的宽度(必须存在)。取值在(0-1]区间时，视为grid控件宽度的比例，否则为像素宽度。
   *(如果为负数，将计算结果加上控件的宽度)
   ** left_margin(可选，可缩写为l) 该列左边的边距。
   ** right_margin(可选，可缩写为r) 该列右边的边距。
   ** top_margin(可选，可缩写为t) 该列顶部的边距。
   ** bottom_margin(可选，可缩写为b) 该列底部的边距。
   ** margin(可选，可缩写为m) 同时指定上面4个边距。
   ** fill_available(可选，可缩写为f) 填充剩余宽度(只有一列可以指定)。
   *
   */
 public String getColumnsDefinition() {
   return grid_t_get_prop_columns_definition(this.nativeObj);
 }


  /**
   * 是否显示网格。
   *
   */
 public boolean getShowGrid() {
   return grid_t_get_prop_show_grid(this.nativeObj);
 }

static private native long grid_create(long parent, int x, int y, int w, int h);
static private native long grid_cast(long widget);
static private native int grid_set_rows(long widget, int rows);
static private native int grid_set_columns_definition(long widget, String columns_definition);
static private native int grid_set_show_grid(long widget, boolean show_grid);
static private native int grid_t_get_prop_rows(long nativeObj);
static private native String grid_t_get_prop_columns_definition(long nativeObj);
static private native boolean grid_t_get_prop_show_grid(long nativeObj);
};