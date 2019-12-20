package awtk;


/**
 * 单个idle的信息。
 *
 */
public class TIdleInfo extends TObject { 

/**
 * 原生对象。
 */

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TIdleInfo(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TIdleInfo cast(long nativeObj) {
   return new TIdleInfo(nativeObj);
 }


/**
 * 转换为idle_info对象(供脚本语言使用)。
 * 
 * @param idle idle_info对象。
 
 * @return idle_info对象。
 */
 public  static TIdleInfo cast(TIdleInfo idle)  {
    return new TIdleInfo(idle_info_cast(idle != null ? (idle.nativeObj) : 0));
 }


/**
 * idle回调函数上下文。
 *
 */
 public long getCtx() {
   return idle_info_t_get_prop_ctx(this.nativeObj);
 }


/**
 * idle的ID
 *
 *> 为TK\_INVALID\_ID时表示无效idle。
 *
 */
 public int getId() {
   return idle_info_t_get_prop_id(this.nativeObj);
 }

static private native long idle_info_cast(long idle);
static private native long idle_info_t_get_prop_ctx(long nativeObj);
static private native int idle_info_t_get_prop_id(long nativeObj);
};