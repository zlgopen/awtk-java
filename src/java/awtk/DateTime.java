package awtk;

public class DateTime {
 public long nativeObj;

 public DateTime(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public DateTime cast(long nativeObj) {
   return new DateTime(nativeObj);
 }

 public  static DateTime create()  {
   return new DateTime(date_time_create());
 }

 public  Ret set()  {
   return Ret.from(date_time_set(this.nativeObj));
 }

 public  Ret destroy()  {
   return Ret.from(date_time_destroy(this.nativeObj));
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

