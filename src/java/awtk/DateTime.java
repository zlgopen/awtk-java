package awtk;


/**
 * 日期时间。> 在嵌入式平台中，在系统初始时，需要调用date\_time\_global\_init设置实际获取/设置系统时间的函数。
 *
 */
public class DateTime {
 public long nativeObj;

 public DateTime(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public DateTime cast(long nativeObj) {
   return new DateTime(nativeObj);
 }


/**
 * 创建date_time对象，并初始为当前日期和时间(一般供脚本语言中使用)。
 * 
 *
 * @returns 返回date_time对象。
 */
 public  static DateTime create()  {
   return new DateTime(date_time_create());
 }


/**
 * 设置当前时间。
 * 
 * @param dt date_time对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret set()  {
   return Ret.from(date_time_set(this != null ? (this.nativeObj) : 0));
 }


/**
 * 销毁date_time对象(一般供脚本语言中使用)。
 * 
 * @param dt date_time对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret destroy()  {
   return Ret.from(date_time_destroy(this != null ? (this.nativeObj) : 0));
 }

 public int getSecond() {
   return date_time_t_get_prop_second(this.nativeObj);
 }

 public int getMinute() {
   return date_time_t_get_prop_minute(this.nativeObj);
 }

 public int getHour() {
   return date_time_t_get_prop_hour(this.nativeObj);
 }

 public int getDay() {
   return date_time_t_get_prop_day(this.nativeObj);
 }

 public int getWday() {
   return date_time_t_get_prop_wday(this.nativeObj);
 }

 public int getMonth() {
   return date_time_t_get_prop_month(this.nativeObj);
 }

 public int getYear() {
   return date_time_t_get_prop_year(this.nativeObj);
 }

static private native long date_time_create();
static private native int date_time_set(long dt);
static private native int date_time_destroy(long dt);
static private native int date_time_t_get_prop_second(long nativeObj);
static private native int date_time_t_get_prop_minute(long nativeObj);
static private native int date_time_t_get_prop_hour(long nativeObj);
static private native int date_time_t_get_prop_day(long nativeObj);
static private native int date_time_t_get_prop_wday(long nativeObj);
static private native int date_time_t_get_prop_month(long nativeObj);
static private native int date_time_t_get_prop_year(long nativeObj);
}

