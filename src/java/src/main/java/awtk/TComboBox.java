package awtk;


/**
 * 下拉列表控件。
 *
 *点击右边的按钮，可弹出一个下拉列表，从中选择一项作为当前的值。
 *
 *combo\_box\_t是[edit\_t](edit_t.md)的子类控件，edit\_t的函数均适用于combo\_box\_t控件。
 *
 *在xml中使用"combo_box"标签创建下拉列表控件。
 *
 *列表选项可以直接写在"options"属性中。如：
 *
 *```xml
 *<combo_box readonly="true" x="10" y="bottom:5" w="200" h="30" tr_text="ok"
 *options="1:ok;2:cancel;"/>
 *```
 *
 *列表选项也可以放在独立的窗口中，用属性"open_window"指定窗口的名称。如：
 *
 *```xml
 *<combo_box open_window="language" readonly="true" x="10" y="bottom:50" w="200" h="30"
 *tr_text="english"/>
 *```
 *
 *language.xml:
 *
 *```xml
 *<popup close_when_click_outside="true" h="80"
 *<list_view x="0"  y="0" w="100%" h="100%" item_height="30">
 *<scroll_view name="view" x="0"  y="0" w="-12" h="100%">
 *<combo_box_item tr_text="english"/>
 *<combo_box_item tr_text="chinese" />
 *</scroll_view>
 *<scroll_bar_d name="bar" x="right" y="0" w="12" h="100%" value="0"/>
 *</list_view>
 *</popup>
 *```
 *
 *> 更多用法请参考：[combo_box.xml](https://github.com/zlgopen/awtk/blob/master/design/default/ui/combo_box.xml)
 *
 *
 *
 *如果在文本比较长时，希望在获得焦点时文本自动滚动，可以放入一个hscroll_label为子控件，并命名为"value"。如：
 *
 *```xml
 *<combo_box left_margin="6" readonly="true" x="10" y="50" w="80" h="30" options="leftttttttttt;centerrrrrrrrrrrrrrrr;rightttttttttt;"
 *selected_index="1">
 *<hscroll_label x="0" y="0" w="-30" h="100%"
 *name="value"
 *lull="1000"
 *loop="true"
 *yoyo="true"
 *ellipses="true"
 *only_parent_focus="true"/>
 *<button style="combobox_down" x="right:5" y="middle" w="20" h="20"/>
 *</combo_box>
 *```
 *
 *在c代码中使用函数combo\_box\_create创建下拉列表控件。如：
 *
 *
 *创建之后：
 *
 ** 用combo\_box\_set\_options设置可选项目。
 ** 用combo\_box\_set\_selected\_index设置缺省项。
 *
 *> 完整示例请参考：[combo_box
 *demo](https://github.com/zlgopen/awtk-c-demos/blob/master/demos/combo_box.c)
 *
 *可用通过style来设置控件的显示风格，如字体的大小和颜色等等。如：
 *
 *```xml
 *<combo_box>
 *<style name="default" border_color="#a0a0a0"  text_color="black" text_align_h="left">
 *<normal     bg_color="#f0f0f0" />
 *<focused    bg_color="#f0f0f0" border_color="black"/>
 *<empty      bg_color="#f0f0f0" text_color="#a0a0a0" />
 *</style>
 *</combo_box>
 *```
 *
 ** 1.combobox的下拉按钮的style名称为combobox_down，可以在窗体样式文件中设置。
 *
 *```xml
 *<button>
 *<style name="combobox_down" border_color="#a0a0a0">
 *<normal     bg_color="#f0f0f0" icon="arrow_down_n"/>
 *<pressed    bg_color="#c0c0c0" icon="arrow_down_p"/>
 *<over       bg_color="#e0e0e0" icon="arrow_down_o"/>
 *</style>
 *</button>
 *```
 *
 ** 2.combobox的弹出popup窗口的style名称为combobox_popup，可以在窗体样式文件中设置。
 *
 *```xml
 *<popup>
 *<style name="combobox_popup" border_color="red">
 *<normal bg_color="#808080"/>
 *</style>
 *</popup>
 *```
 *
 *> 更多用法请参考：[theme
 *default](https://github.com/zlgopen/awtk/blob/master/design/default/styles/default.xml#L422)
 *
 */
public class TComboBox extends TEdit { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TComboBox(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TComboBox cast(long nativeObj) {
   return new TComboBox(nativeObj);
 }


  /**
   * 创建combo_box对象
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
    return new TComboBox(combo_box_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换combo_box对象(供脚本语言使用)。
   * 
   * @param widget combo_box对象。
   *
   * @return combo_box对象。
   */
 public  static TComboBox cast(TWidget widget)  {
    return new TComboBox(combo_box_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 点击按钮时可以打开popup窗口，本函数可设置窗口的名称。
   * 
   * @param open_window 弹出窗口的名称。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setOpenWindow(String open_window)  {
   return TRet.from(combo_box_set_open_window(this != null ? (this.nativeObj) : 0, open_window));
 }


  /**
   * 重置所有选项。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet resetOptions()  {
   return TRet.from(combo_box_reset_options(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 获取选项个数。
   * 
   *
   * @return 返回选项个数。
   */
 public  int countOptions()  {
    return combo_box_count_options(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 设置第index个选项为当前选中的选项。
   * 
   * @param index 选项的索引。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setSelectedIndex(int index)  {
   return TRet.from(combo_box_set_selected_index(this != null ? (this.nativeObj) : 0, index));
 }


  /**
   * 设置是否本地化(翻译)选项。
   * 
   * @param localize_options 是否本地化(翻译)选项。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setLocalizeOptions(boolean localize_options)  {
   return TRet.from(combo_box_set_localize_options(this != null ? (this.nativeObj) : 0, localize_options));
 }


  /**
   * 设置值。
   * 
   * @param value 值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setValue(int value)  {
   return TRet.from(combo_box_set_value(this != null ? (this.nativeObj) : 0, value));
 }


  /**
   * 设置item高度。
   * 
   * @param item_height item的高度。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setItemHeight(int item_height)  {
   return TRet.from(combo_box_set_item_height(this != null ? (this.nativeObj) : 0, item_height));
 }


  /**
   * 追加一个选项。
   * 
   * @param value 值。
   * @param text 文本。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet appendOption(int value, String text)  {
   return TRet.from(combo_box_append_option(this != null ? (this.nativeObj) : 0, value, text));
 }


  /**
   * 删除选项。
   * 
   * @param value 值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet removeOption(int value)  {
   return TRet.from(combo_box_remove_option(this != null ? (this.nativeObj) : 0, value));
 }


  /**
   * 设置选项。
   * 
   * @param options 选项。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setOptions(String options)  {
   return TRet.from(combo_box_set_options(this != null ? (this.nativeObj) : 0, options));
 }


  /**
   * 获取combo_box的值。
   * 
   *
   * @return 返回值。
   */
 public  int getValueInt()  {
    return combo_box_get_value(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 检查选项中是否存在指定的文本。
   * 
   * @param text option text
   *
   * @return 返回TRUE表示存在，否则表示不存在。
   */
 public  boolean hasOptionText(String text)  {
    return combo_box_has_option_text(this != null ? (this.nativeObj) : 0, text);
 }


  /**
   * 获取combo_box的文本。
   * 
   *
   * @return 返回文本。
   */
 public  String getTextValue()  {
    return combo_box_get_text(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 为点击按钮时，要打开窗口的名称。
   *
   */
 public String getOpenWindow() {
   return combo_box_t_get_prop_open_window(this.nativeObj);
 }


  /**
   * 当前选中的选项。
   *
   */
 public int getSelectedIndex() {
   return combo_box_t_get_prop_selected_index(this.nativeObj);
 }


  /**
   * 是否本地化(翻译)选项(缺省为TRUE)。
   *
   */
 public boolean getLocalizeOptions() {
   return combo_box_t_get_prop_localize_options(this.nativeObj);
 }


  /**
   * 设置可选项(冒号分隔值和文本，分号分隔选项，如:1:red;2:green;3:blue)。
   *
   */
 public String getOptions() {
   return combo_box_t_get_prop_options(this.nativeObj);
 }


  /**
   * 下拉选项的高度。如果open_window为空，则使用缺省高度。
   *
   */
 public int getItemHeight() {
   return combo_box_t_get_prop_item_height(this.nativeObj);
 }

static private native long combo_box_create(long parent, int x, int y, int w, int h);
static private native long combo_box_cast(long widget);
static private native int combo_box_set_open_window(long widget, String open_window);
static private native int combo_box_reset_options(long widget);
static private native int combo_box_count_options(long widget);
static private native int combo_box_set_selected_index(long widget, int index);
static private native int combo_box_set_localize_options(long widget, boolean localize_options);
static private native int combo_box_set_value(long widget, int value);
static private native int combo_box_set_item_height(long widget, int item_height);
static private native int combo_box_append_option(long widget, int value, String text);
static private native int combo_box_remove_option(long widget, int value);
static private native int combo_box_set_options(long widget, String options);
static private native int combo_box_get_value(long widget);
static private native boolean combo_box_has_option_text(long widget, String text);
static private native String combo_box_get_text(long widget);
static private native String combo_box_t_get_prop_open_window(long nativeObj);
static private native int combo_box_t_get_prop_selected_index(long nativeObj);
static private native int combo_box_t_get_prop_value(long nativeObj);
static private native boolean combo_box_t_get_prop_localize_options(long nativeObj);
static private native String combo_box_t_get_prop_options(long nativeObj);
static private native int combo_box_t_get_prop_item_height(long nativeObj);
};