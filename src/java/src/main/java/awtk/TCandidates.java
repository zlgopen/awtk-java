package awtk;


/**
 * 输入法候选字词控件。
 *
 *如果希望启用用数字选择对应的候选字，请设置属性grab_keys="true"。如：
 *
 *```xml
 *<candidates x="0" y="0" w="100%" h="30" grab_keys="true"/>
 *```
 *
 *>相关文件： assets/default/raw/ui/kb_default.xml
 *
 *如果希望通过左右键切换不同的候选字，除了设置属性grab_keys="true"，还需要设置按钮的focused状态的style。
 *
 *```xml
 *<style name="candidates" text_color="black">
 *<normal  />
 *<pressed    bg_color="#c0c0c0" border_color="#a0a0a0"/>
 *<over       bg_color="#e0e0e0" border_color="#a0a0a0"/>
 *<focused    border_color="#a0a0a0"/>
 *</style>
 *```
 *
 *>相关文件：assets/default/raw/styles/keyboard.xml
 *
 */
public class TCandidates extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TCandidates(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TCandidates cast(long nativeObj) {
   return new TCandidates(nativeObj);
 }


  /**
   * 创建candidates对象
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
    return new TCandidates(candidates_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为candidates对象(供脚本语言使用)。
   * 
   * @param widget candidates对象。
   *
   * @return candidates对象。
   */
 public  static TCandidates cast(TWidget widget)  {
    return new TCandidates(candidates_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 设置是否为预候选字列表。
   *
   *> 为预候选字列表则注册EVT\_IM\_SHOW\_PRE\_CANDIDATES，否则注册EVT\_IM\_SHOW\_CANDIDATES事件。
   * 
   * @param pre 是否为预候选字列表。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setPre(boolean pre)  {
   return TRet.from(candidates_set_pre(this != null ? (this.nativeObj) : 0, pre));
 }


  /**
   * 设置是否启用用数字选择候选字。
   * 
   * @param select_by_num 是否启用用数字选择候选字。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setSelectByNum(boolean select_by_num)  {
   return TRet.from(candidates_set_select_by_num(this != null ? (this.nativeObj) : 0, select_by_num));
 }


  /**
   * 设置是否自动隐藏。
   * 
   * @param auto_hide 是否自动隐藏。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setAutoHide(boolean auto_hide)  {
   return TRet.from(candidates_set_auto_hide(this != null ? (this.nativeObj) : 0, auto_hide));
 }


  /**
   * 设置按钮的style名称。
   * 
   * @param button_style 按钮的style名称。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setButtonStyle(String button_style)  {
   return TRet.from(candidates_set_button_style(this != null ? (this.nativeObj) : 0, button_style));
 }


  /**
   * 是否为预候选字。
   *
   *> 预候选字: 在有的输入法中，比如T9硬键盘输入时，按下12两个键时，预候选字会显示可用的拼音列表。
   *> 从预候选字列表中选择拼音，再查询拼音对应的候选字列表。
   *
   */
 public boolean getPre() {
   return candidates_t_get_prop_pre(this.nativeObj);
 }


  /**
   * 是否启用用数字选择候选字。比如按下1选择第1个候选字，按下2选择第2个候选字。
   *
   */
 public boolean getSelectByNum() {
   return candidates_t_get_prop_select_by_num(this.nativeObj);
 }


  /**
   * 没有候选字时，是否自动隐藏控件。
   *
   */
 public boolean getAutoHide() {
   return candidates_t_get_prop_auto_hide(this.nativeObj);
 }


  /**
   * 按钮的style名称。
   *
   */
 public String getButtonStyle() {
   return candidates_t_get_prop_button_style(this.nativeObj);
 }


  /**
   * 是否启用候选字预览。
   *
   */
 public boolean getEnablePreview() {
   return candidates_t_get_prop_enable_preview(this.nativeObj);
 }

static private native long candidates_create(long parent, int x, int y, int w, int h);
static private native long candidates_cast(long widget);
static private native int candidates_set_pre(long widget, boolean pre);
static private native int candidates_set_select_by_num(long widget, boolean select_by_num);
static private native int candidates_set_auto_hide(long widget, boolean auto_hide);
static private native int candidates_set_button_style(long widget, String button_style);
static private native boolean candidates_t_get_prop_pre(long nativeObj);
static private native boolean candidates_t_get_prop_select_by_num(long nativeObj);
static private native boolean candidates_t_get_prop_auto_hide(long nativeObj);
static private native String candidates_t_get_prop_button_style(long nativeObj);
static private native boolean candidates_t_get_prop_enable_preview(long nativeObj);
};