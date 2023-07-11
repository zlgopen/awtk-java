package awtk;


/**
 * 对象执行命令的事件。
 *
 */
public class TCmdExecEvent extends TEvent { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TCmdExecEvent(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TCmdExecEvent cast(long nativeObj) {
   return new TCmdExecEvent(nativeObj);
 }


  /**
   * 把event对象转cmd_exec_event_t对象。
   * 
   * @param event event对象。
   *
   * @return 返回event对象。
   */
 public  static TCmdExecEvent cast(TEvent event)  {
    return new TCmdExecEvent(cmd_exec_event_cast(event != null ? (event.nativeObj) : 0));
 }


  /**
   * 命令的名称。
   *
   */
 public String getName() {
   return cmd_exec_event_t_get_prop_name(this.nativeObj);
 }


  /**
   * 命令的参数。
   *
   */
 public String getArgs() {
   return cmd_exec_event_t_get_prop_args(this.nativeObj);
 }


  /**
   * 执行结果(适用于EXECED)。
   *
   */
 public TRet getResult() {
   return TRet.from(cmd_exec_event_t_get_prop_result(this.nativeObj));

 }


  /**
   * 标识命令是否可以执行(适用于CAN_EXEC)。
   *
   */
 public boolean getCanExec() {
   return cmd_exec_event_t_get_prop_can_exec(this.nativeObj);
 }

static private native long cmd_exec_event_cast(long event);
static private native String cmd_exec_event_t_get_prop_name(long nativeObj);
static private native String cmd_exec_event_t_get_prop_args(long nativeObj);
static private native int cmd_exec_event_t_get_prop_result(long nativeObj);
static private native boolean cmd_exec_event_t_get_prop_can_exec(long nativeObj);
};