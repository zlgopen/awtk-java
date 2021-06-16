package awtk;


/**
 * 格式化日期时间。
 *
 *格式规则：
 ** Y 代表年(完整显示)
 ** M 代表月(1-12)
 ** D 代表日(1-31)
 ** h 代表时(0-23)
 ** m 代表分(0-59)
 ** s 代表秒(0-59)
 ** w 代表星期(0-6)
 ** W 代表星期的英文缩写(支持翻译)
 ** YY 代表年(只显示末两位)
 ** MM 代表月(01-12)
 ** DD 代表日(01-31)
 ** hh 代表时(00-23)
 ** mm 代表分(00-59)
 ** ss 代表秒(00-59)
 ** MMM 代表月的英文缩写(支持翻译)
 *
 *如 日期时间为：2018/11/12 9:10:20
 ** "Y/M/D"显示为"2018/11/12"
 ** "Y-M-D"显示为"2018-11-12"
 ** "Y-M-D h:m:s"显示为"2018-11-12 9:10:20"
 ** "Y-M-D hh:mm:ss"显示为"2018-11-12 09:10:20"
 *
 */
public class TDataTimeFormat { 

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
 public TDataTimeFormat(long nativeObj) {
   this.nativeObj = nativeObj;
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TDataTimeFormat cast(long nativeObj) {
   return new TDataTimeFormat(nativeObj);
 }

};