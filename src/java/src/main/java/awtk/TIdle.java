package awtk;


/**
 * idle可以看作是duration为0的定时器。
 *
 *> idle可以用来实现一些异步处理。
 *
 *示例：
 *
 *
 *
 *> 在非GUI线程请用idle\_queue。
 *
 */
public class TIdle { 

  /**
   * 增加一个idle。
   * 
   * @param on_idle idle回调函数，回调函数返回RET_REPEAT，则下次继续执行，否则自动移出。
   * @param ctx idle回调函数的上下文。
   *
   * @return 返回idle的ID，0表示失败。
   */
 public  static int add(TOnIdle on_idle, long ctx)  {
    return idle_add(on_idle, ctx);
 }


  /**
   * 删除指定的idle。
   * 
   * @param idle_id idleID。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  static TRet remove(int idle_id)  {
   return TRet.from(idle_remove(idle_id));
 }


  /**
   * 根据上下文删除所有对应的idle。
   * 
   * @param ctx idle回调函数的上下文
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  static TRet removeAllByCtx(long ctx)  {
   return TRet.from(idle_remove_all_by_ctx(ctx));
 }

static private native int idle_add(TOnIdle on_idle, long ctx);
static private native int idle_remove(int idle_id);
static private native int idle_remove_all_by_ctx(long ctx);
};