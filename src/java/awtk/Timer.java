package awtk;


/**
 * 定时器系统。 本定时器精度较低，最高精度为1000/FPS，如果需要高精度的定时器，请用OS提供的定时器。 示例： ```c static ret_t my_on_timer(const timer_info_t* info) {  widget_t* widget = WIDGET(info->ctx);  ...  return RET_REPEAT; } ... timer_add(my_on_timer, widget, 1000); ``` 在非GUI线程请用timer\_queue。
 *
 */
public class Timer {

/**
 * 增加一个timer。
 * 
 * @param on_timer timer回调函数。
 * @param ctx timer回调函数的上下文。
 * @param duration 时间。
 *
 * @returns 返回timer的ID，TK_INVALID_ID表示失败。
 */
 public  static int add(OnTimer on_timer, long ctx, int duration)  {
   return timer_add(on_timer, ctx, duration);
 }


/**
 * 删除指定的timer。
 * 
 * @param timer_id timerID。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  static Ret remove(int timer_id)  {
   return Ret.from(timer_remove(timer_id));
 }


/**
 * 重置指定的timer，重置之后定时器重新开始计时。
 * 
 * @param timer_id timerID。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  static Ret reset(int timer_id)  {
   return Ret.from(timer_reset(timer_id));
 }


/**
 * 修改指定的timer的duration，修改之后定时器重新开始计时。
 * 
 * @param timer_id timerID。
 * @param duration 新的时间。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  static Ret modify(int timer_id, int duration)  {
   return Ret.from(timer_modify(timer_id, duration));
 }

static private native int timer_add(OnTimer on_timer, long ctx, int duration);
static private native int timer_remove(int timer_id);
static private native int timer_reset(int timer_id);
static private native int timer_modify(int timer_id, int duration);
}

