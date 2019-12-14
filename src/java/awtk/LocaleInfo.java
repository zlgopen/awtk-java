package awtk;


/**
 * 本地化信息。提供字符串翻译数据管理，当前语言改变的事件通知等等。
 *
 */
public class LocaleInfo {
 public long nativeObj;

 public LocaleInfo(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public LocaleInfo cast(long nativeObj) {
   return new LocaleInfo(nativeObj);
 }


/**
 * 获取缺省locale_info。
 * 
 *
 * @returns 返回locale_info对象。
 */
 public  static LocaleInfo instance()  {
   return new LocaleInfo(locale_info());
 }


/**
 * 翻译字符串。
 * 
 * @param locale_info locale_info对象。
 * @param text 待翻译的文本。
 *
 * @returns 返回翻译之后的字符串。
 */
 public  String tr(String text)  {
   return locale_info_tr(this != null ? (this.nativeObj) : 0, text);
 }


/**
 * 设置当前的国家和语言。
 * 
 * @param locale_info locale_info对象。
 * @param language 语言。
 * @param country 国家或地区。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret change(String language, String country)  {
   return Ret.from(locale_info_change(this != null ? (this.nativeObj) : 0, language, country));
 }


/**
 * 注销指定事件的处理函数。
 * 
 * @param locale_info locale_info对象。
 * @param id locale_info_on返回的ID。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret off(int id)  {
   return Ret.from(locale_info_off(this != null ? (this.nativeObj) : 0, id));
 }

static private native long locale_info();
static private native String locale_info_tr(long locale_info, String text);
static private native int locale_info_change(long locale_info, String language, String country);
static private native int locale_info_off(long locale_info, int id);
}

