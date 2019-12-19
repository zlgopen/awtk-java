package awtk;


/**
 * 事件分发器, 用于实现观察者模式。
 *
 */
public class TEmitter { 

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
 public TEmitter(long nativeObj) {
   this.nativeObj = nativeObj;
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TEmitter cast(long nativeObj) {
   return new TEmitter(nativeObj);
 }


/**
 * 创建emitter对象。
 * 
 
 * @return 对象。
 */
 public  static TEmitter create()  {
    return new TEmitter(emitter_create());
 }


/**
 * 分发事件。如果当前分发的回调函数返回RET_REMOVE，该回调函数将被移出。
 *禁用状态下，本函数不做任何事情。
 * 
 * @param e 事件对象。
 
 * @return 如果当前分发的回调函数返回RET_STOP，dispatch中断分发，并返回RET_STOP，否则返回RET_OK。
 */
 public  TRet dispatch(TEvent e)  {
   return TRet.from(emitter_dispatch(this != null ? (this.nativeObj) : 0, e != null ? (e.nativeObj) : 0));
 }


/**
 * 分发事件。
 *> 对emitter_dispatch的包装，分发一个简单的事件。
 *如果当前分发的回调函数返回RET_STOP，dispatch中断分发，并返回RET_STOP，否则返回RET_OK。
 * 
 * @param type 事件类型。
 
 * @return 
 */
 public  TRet dispatchSimpleEvent(TEventType type)  {
   return TRet.from(emitter_dispatch_simple_event(this != null ? (this.nativeObj) : 0, type.value()));
 }


/**
 * 注册指定事件的处理函数。
 * 
 * @param type 事件类型。
 * @param on_event 事件处理函数。
 * @param ctx 事件处理函数上下文。
 
 * @return 返回id，用于emitter_off。
 */
 public  int on(TEventType type, TOnEvent on_event, long ctx)  {
    return emitter_on(this != null ? (this.nativeObj) : 0, type.value(), on_event, ctx);
 }


/**
 * 注销指定事件的处理函数。
 * 
 * @param id emitter_on返回的ID。
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet off(int id)  {
   return TRet.from(emitter_off(this != null ? (this.nativeObj) : 0, id));
 }


/**
 * 启用。
 * 
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet enable()  {
   return TRet.from(emitter_enable(this != null ? (this.nativeObj) : 0));
 }


/**
 * 禁用。
 *
 *禁用后emitter_dispatch无效，但可以注册和注销。
 * 
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet disable()  {
   return TRet.from(emitter_disable(this != null ? (this.nativeObj) : 0));
 }


/**
 * 获取注册的回调函数个数，主要用于辅助测试。
 * 
 
 * @return 回调函数个数。
 */
 public  int size()  {
    return emitter_size(this != null ? (this.nativeObj) : 0);
 }


/**
 * 销毁。
 * 
 
 * @return 返回RET_OK表示成功，否则表示失败。
 */
 public  TRet destroy()  {
   return TRet.from(emitter_destroy(this != null ? (this.nativeObj) : 0));
 }


/**
 * 转换为emitter对象(供脚本语言使用)。
 *
 *主要给脚本语言使用。
 * 
 * @param emitter emitter对象。
 
 * @return 对象。
 */
 public  static TEmitter cast(TEmitter emitter)  {
    return new TEmitter(emitter_cast(emitter != null ? (emitter.nativeObj) : 0));
 }

static private native long emitter_create();
static private native int emitter_dispatch(long emitter, long e);
static private native int emitter_dispatch_simple_event(long emitter, int type);
static private native int emitter_on(long emitter, int type, TOnEvent on_event, long ctx);
static private native int emitter_off(long emitter, int id);
static private native int emitter_enable(long emitter);
static private native int emitter_disable(long emitter);
static private native int emitter_size(long emitter);
static private native int emitter_destroy(long emitter);
static private native long emitter_cast(long emitter);
};