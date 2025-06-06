package awtk;


/**
 * 本地化信息。
 *locale_info_t 的子类。
 *提供从 xml 文件中获取本地化信息的功能。
 *
 *注意：fallback_tr2 回调已被设置用于从xml文件中获取本地化信息，不可再重复设置，否则将导致功能失效！
 *
 */
public class TLocaleInfoXml extends TLocaleInfo { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TLocaleInfoXml(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TLocaleInfoXml cast(long nativeObj) {
   return new TLocaleInfoXml(nativeObj);
 }

};