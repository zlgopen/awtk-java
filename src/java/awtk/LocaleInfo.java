package awtk;

public class LocaleInfo {
 public long nativeObj;

 public LocaleInfo(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public LocaleInfo cast(long nativeObj) {
   return new LocaleInfo(nativeObj);
 }

 public  static LocaleInfo instance()  {
   return new LocaleInfo(locale_info());
 }

 public  String tr(String text)  {
   return locale_info_tr(this.nativeObj, text);
 }

 public  Ret change(String language, String country)  {
   return Ret.from(locale_info_change(this.nativeObj, language, country));
 }

 public  Ret off(int id)  {
   return Ret.from(locale_info_off(this.nativeObj, id));
 }

static private native long locale_info();
static private native String locale_info_tr(long locale_info, String text);
static private native int locale_info_change(long locale_info, String language, String country);
static private native int locale_info_off(long locale_info, int id);
}

