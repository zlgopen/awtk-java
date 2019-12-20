package awtk;


/**
 * 单个定时器的信息。
 *
 */
public class TTimerInfo extends TObject { 

/**
 * 原生对象。
 */

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TTimerInfo(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TTimerInfo cast(long nativeObj) {
   return new TTimerInfo(nativeObj);
 }


/**
 * 转换为timer_info对象(供脚本语言使用)。
 * 
 * @param timer timer_info对象。
 
 * @return timer_info对象。
 */
 public  static TTimerInfo cast(TTimerInfo timer)  {
    return new TTimerInfo(timer_info_cast(timer != null ? (timer.nativeObj) : 0));
 }


/**
 * 定时器回调函数的上下文
 *
 */
 public long getCtx() {
   return timer_info_t_get_prop_ctx(this.nativeObj);
 }


/**
 * 定时器的ID
 *
 *> 为TK\_INVALID\_ID时表示无效定时器。
 *
 */
 public int getId() {
   return timer_info_t_get_prop_id(this.nativeObj);
 }


/**
 * 当前时间(相对时间，单位为毫秒)。
 *
 */
 public long getNow() {
   return timer_info_t_get_prop_now(this.nativeObj);
 }

static private native long timer_info_cast(long timer);
static private native long timer_info_t_get_prop_ctx(long nativeObj);
static private native int timer_info_t_get_prop_id(long nativeObj);
static private native long timer_info_t_get_prop_now(long nativeObj);
};