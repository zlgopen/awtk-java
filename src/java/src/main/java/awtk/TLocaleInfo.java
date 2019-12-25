package awtk;


/**
 * 本地化信息。提供字符串翻译数据管理，当前语言改变的事件通知等等。
 *
 */
public class TLocaleInfo { 

/**
 * 原生对象。
 */
 public long nativeObj;


/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TLocaleInfo(long nativeObj) {
   this.nativeObj = nativeObj;
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TLocaleInfo cast(long nativeObj) {
   return new TLocaleInfo(nativeObj);
 }


  /**
   * 获取缺省locale_info。
   * 
   *
   * @return 返回locale_info对象。
   */
 public  static TLocaleInfo instance()  {
    return new TLocaleInfo(locale_info());
 }


  /**
   * 翻译字符串。
   * 
   * @param text 待翻译的文本。
   *
   * @return 返回翻译之后的字符串。
   */
 public  String tr(String text)  {
    return locale_info_tr(this != null ? (this.nativeObj) : 0, text);
 }


  /**
   * 设置当前的国家和语言。
   * 
   * @param language 语言。
   * @param country 国家或地区。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet change(String language, String country)  {
   return TRet.from(locale_info_change(this != null ? (this.nativeObj) : 0, language, country));
 }


  /**
   * 注销指定事件的处理函数。
   * 
   * @param id locale_info_on返回的ID。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet off(int id)  {
   return TRet.from(locale_info_off(this != null ? (this.nativeObj) : 0, id));
 }

static private native long locale_info();
static private native String locale_info_tr(long locale_info, String text);
static private native int locale_info_change(long locale_info, String language, String country);
static private native int locale_info_off(long locale_info, int id);
};