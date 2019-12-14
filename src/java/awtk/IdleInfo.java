package awtk;


/**
 * 单个idle的信息。
 *
 */
public class IdleInfo extends Object {
 public long nativeObj;

 public IdleInfo(long nativeObj) {
   super(nativeObj);
 }

 static public IdleInfo cast(long nativeObj) {
   return new IdleInfo(nativeObj);
 }


/**
 * 转换为idle_info对象(供脚本语言使用)。
 * 
 * @param idle idle_info对象。
 *
 * @returns idle_info对象。
 */
 public  static IdleInfo cast(IdleInfo idle)  {
   return new IdleInfo(idle_info_cast(idle != null ? (idle.nativeObj) : 0));
 }

 public long getCtx() {
   return idle_info_t_get_prop_ctx(this.nativeObj);
 }

 public int getId() {
   return idle_info_t_get_prop_id(this.nativeObj);
 }

static private native long idle_info_cast(long idle);
static private native long idle_info_t_get_prop_ctx(long nativeObj);
static private native int idle_info_t_get_prop_id(long nativeObj);
}

