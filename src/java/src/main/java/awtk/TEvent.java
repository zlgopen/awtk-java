package awtk;


/**
 * 事件基类。
 *
 */
public class TEvent { 

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
 public TEvent(long nativeObj) {
   this.nativeObj = nativeObj;
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TEvent cast(long nativeObj) {
   return new TEvent(nativeObj);
 }


  /**
   * 将事件名转换成事件的类型。
   * 
   * @param name 事件名。
   *
   * @return 返回事件的类型。
   */
 public  static int fromName(String name)  {
    return event_from_name(name);
 }


  /**
   * 给事件注册名称。
   * 
   * @param event_type 事件类型。
   * @param name 事件名。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  static TRet registerCustomName(int event_type, String name)  {
   return TRet.from(event_register_custom_name(event_type, name));
 }


  /**
   * 注销事件名称。
   * 
   * @param name 事件名。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  static TRet unregisterCustomName(String name)  {
   return TRet.from(event_unregister_custom_name(name));
 }


  /**
   * 转换为event对象。
   *
   *> 供脚本语言使用
   * 
   * @param event event对象。
   *
   * @return event对象。
   */
 public  static TEvent cast(TEvent event)  {
    return new TEvent(event_cast(event != null ? (event.nativeObj) : 0));
 }


  /**
   * 获取event类型。
   * 
   *
   * @return 返回event类型。
   */
 public  int getType()  {
    return event_get_type(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 创建event对象。
   *
   *主要给脚本语言使用。
   * 
   * @param type 事件类型。
   *
   * @return 返回事件对象。
   */
 public  static TEvent create(int type)  {
    return new TEvent(event_create(type));
 }


  /**
   * 销毁事件对象。
   *
   *主要给脚本语言使用。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet destroy()  {
   return TRet.from(event_destroy(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 结构体的大小。
   *
   */
 public int getSize() {
   return event_t_get_prop_size(this.nativeObj);
 }


  /**
   * 事件发生的时间点（该时间点并非真实时间）。
   *
   */
 public long getTime() {
   return event_t_get_prop_time(this.nativeObj);
 }


  /**
   * 事件发生的目标对象。
   *
   */
 public long getTarget() {
   return event_t_get_prop_target(this.nativeObj);
 }

static private native int event_from_name(String name);
static private native int event_register_custom_name(int event_type, String name);
static private native int event_unregister_custom_name(String name);
static private native long event_cast(long event);
static private native int event_get_type(long event);
static private native long event_create(int type);
static private native int event_destroy(long event);
static private native int event_t_get_prop_type(long nativeObj);
static private native int event_t_get_prop_size(long nativeObj);
static private native long event_t_get_prop_time(long nativeObj);
static private native long event_t_get_prop_target(long nativeObj);
};