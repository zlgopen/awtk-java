package awtk;


/**
 * idle可以看作是duration为0的定时器。 idle可以用来实现一些异步处理。 示例： ```c static ret_t something_on_idle(const idle_info_t* info) {   widget_t* widget = WIDGET(info->ctx);   edit_t* edit = EDIT(widget);   ...   return RET_REMOVE; } ... idle_add(something_on_idle, edit); ``` 在非GUI线程请用idle\_queue。
 *
 */
public class Idle {

/**
 * 增加一个idle。
 * 
 * @param on_idle idle回调函数，回调函数返回RET_REPEAT，则下次继续执行，否则自动移出。
 * @param ctx idle回调函数的上下文。
 *
 * @returns 返回idle的ID，0表示失败。
 */
 public  static int add(OnIdle on_idle, long ctx)  {
   return idle_add(on_idle, ctx);
 }


/**
 * 删除指定的idle。
 * 
 * @param idle_id idleID。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  static Ret remove(int idle_id)  {
   return Ret.from(idle_remove(idle_id));
 }

static private native int idle_add(OnIdle on_idle, long ctx);
static private native int idle_remove(int idle_id);
}

