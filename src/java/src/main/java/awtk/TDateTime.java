package awtk;


/**
 * 日期时间。
 *
 *> 在嵌入式平台中，在系统初始时，需要调用date\_time\_global\_init设置实际获取/设置系统时间的函数。
 *
 */
public class TDateTime { 

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
 public TDateTime(long nativeObj) {
   this.nativeObj = nativeObj;
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TDateTime cast(long nativeObj) {
   return new TDateTime(nativeObj);
 }


  /**
   * 创建date_time对象，并初始为当前日期和时间(一般供脚本语言中使用)。
   * 
   *
   * @return 返回date_time对象。
   */
 public  static TDateTime create()  {
    return new TDateTime(date_time_create());
 }


  /**
   * 设置当前时间。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet set()  {
   return TRet.from(date_time_set(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 从time转换而来。
   * 
   * @param time 时间。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet fromTime(long time)  {
   return TRet.from(date_time_from_time(this != null ? (this.nativeObj) : 0, time));
 }


  /**
   * 是否是闰年。
   * 
   * @param year 年份。
   *
   * @return 返回TRUE表示是，否则表示否。
   */
 public  static boolean isLeap(int year)  {
    return date_time_is_leap(year);
 }


  /**
   * 获取指定年份月份的天数。
   * 
   * @param year 年份。
   * @param montn 月份(1-12)。
   *
   * @return 返回大于0表示天数，否则表示失败。
   */
 public  static int getDays(int year, int montn)  {
    return date_time_get_days(year, montn);
 }


  /**
   * 获取指定日期是周几(0-6, Sunday = 0)。。
   * 
   * @param year 年份。
   * @param montn 月份(1-12)。
   * @param day 日(1-31)。
   *
   * @return 返回大于等于0表示周几(0-6)，否则表示失败。
   */
 public  static int getWday(int year, int montn, int day)  {
    return date_time_get_wday(year, montn, day);
 }


  /**
   * 获取指定月份的英文名称(简写)。
   * 
   * @param montn 月份(1-12)。
   *
   * @return 返回指定月份的英文名称(简写)。
   */
 public  static String getMonthName(int montn)  {
    return date_time_get_month_name(montn);
 }


  /**
   * 获取周几的英文名称(简写)。
   * 
   * @param wday 星期几(0-6, Sunday = 0)。
   *
   * @return 返回指定周几的英文名称(简写)。
   */
 public  static String getWdayName(int wday)  {
    return date_time_get_wday_name(wday);
 }


  /**
   * 销毁date_time对象(一般供脚本语言中使用)。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet destroy()  {
   return TRet.from(date_time_destroy(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 秒(0 - 59)。
   *
   */
 public int getSecond() {
   return date_time_t_get_prop_second(this.nativeObj);
 }


  /**
   * 分(0 - 59)。
   *
   */
 public int getMinute() {
   return date_time_t_get_prop_minute(this.nativeObj);
 }


  /**
   * 时(0 - 23)。
   *
   */
 public int getHour() {
   return date_time_t_get_prop_hour(this.nativeObj);
 }


  /**
   * 日(1-31)。
   *
   */
 public int getDay() {
   return date_time_t_get_prop_day(this.nativeObj);
 }


  /**
   * 星期几(0-6, Sunday = 0)。
   *
   */
 public int getWday() {
   return date_time_t_get_prop_wday(this.nativeObj);
 }


  /**
   * 月(1-12)。
   *
   */
 public int getMonth() {
   return date_time_t_get_prop_month(this.nativeObj);
 }


  /**
   * 年。
   *
   */
 public int getYear() {
   return date_time_t_get_prop_year(this.nativeObj);
 }

static private native long date_time_create();
static private native int date_time_set(long dt);
static private native int date_time_from_time(long dt, long time);
static private native boolean date_time_is_leap(int year);
static private native int date_time_get_days(int year, int montn);
static private native int date_time_get_wday(int year, int montn, int day);
static private native String date_time_get_month_name(int montn);
static private native String date_time_get_wday_name(int wday);
static private native int date_time_destroy(long dt);
static private native int date_time_t_get_prop_second(long nativeObj);
static private native int date_time_t_get_prop_minute(long nativeObj);
static private native int date_time_t_get_prop_hour(long nativeObj);
static private native int date_time_t_get_prop_day(long nativeObj);
static private native int date_time_t_get_prop_wday(long nativeObj);
static private native int date_time_t_get_prop_month(long nativeObj);
static private native int date_time_t_get_prop_year(long nativeObj);
};