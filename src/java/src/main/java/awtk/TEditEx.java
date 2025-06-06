package awtk;


/**
 * 扩展edit控件。支持以下功能：
 ** 支持搜索建议功能。
 *
 */
public class TEditEx extends TEdit { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TEditEx(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TEditEx cast(long nativeObj) {
   return new TEditEx(nativeObj);
 }


  /**
   * 创建edit_ex对象
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
    return new TEditEx(edit_ex_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 设置输入建议词源。
   *> EVT_VALUE_CHANGED 事件请求词源更新，new_value 为 edit 输入内容。
   * 
   * @param suggest_words 输入建议词源。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setSuggestWords(TObject suggest_words)  {
   return TRet.from(edit_ex_set_suggest_words(this != null ? (this.nativeObj) : 0, suggest_words != null ? (suggest_words.nativeObj) : 0));
 }


  /**
   * 设置输入建议词的项格式。
   * 
   * @param formats 输入建议词的项格式。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setSuggestWordsItemFormats(String formats)  {
   return TRet.from(edit_ex_set_suggest_words_item_formats(this != null ? (this.nativeObj) : 0, formats));
 }


  /**
   * 最终输入到edit控件的文本的属性名。
   *> 设置了 suggest_words_item_formats 才会被用到。
   * 
   * @param name 最终输入到edit控件的文本的属性名。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setSuggestWordsInputName(String name)  {
   return TRet.from(edit_ex_set_suggest_words_input_name(this != null ? (this.nativeObj) : 0, name));
 }


  /**
   * 转换为edit对象(供脚本语言使用)。
   * 
   * @param widget edit_ex对象。
   *
   * @return edit对象。
   */
 public  static TEditEx cast(TWidget widget)  {
    return new TEditEx(edit_ex_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 输入建议词。
   *
   */
 public TObject getSuggestWords() {
   return new TObject(edit_ex_t_get_prop_suggest_words(this.nativeObj));
 }


  /**
   * 输入建议词的项格式。
   *
   */
 public String getSuggestWordsItemFormats() {
   return edit_ex_t_get_prop_suggest_words_item_formats(this.nativeObj);
 }


  /**
   * 最终输入到edit控件的文本的属性名。
   *> 设置了 suggest_words_item_formats 才会被用到。
   *
   */
 public String getSuggestWordsInputName() {
   return edit_ex_t_get_prop_suggest_words_input_name(this.nativeObj);
 }

static private native long edit_ex_create(long parent, int x, int y, int w, int h);
static private native int edit_ex_set_suggest_words(long widget, long suggest_words);
static private native int edit_ex_set_suggest_words_item_formats(long widget, String formats);
static private native int edit_ex_set_suggest_words_input_name(long widget, String name);
static private native long edit_ex_cast(long widget);
static private native long edit_ex_t_get_prop_suggest_words(long nativeObj);
static private native String edit_ex_t_get_prop_suggest_words_item_formats(long nativeObj);
static private native String edit_ex_t_get_prop_suggest_words_input_name(long nativeObj);
};