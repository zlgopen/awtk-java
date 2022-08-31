package awtk;


/**
 * model变化事件。
 *
 */
public class TModelEvent extends TEvent { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TModelEvent(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TModelEvent cast(long nativeObj) {
   return new TModelEvent(nativeObj);
 }


  /**
   * 把event对象转model_event_t对象，主要给脚本语言使用。
   * 
   * @param event event对象。
   *
   * @return event对象。
   */
 public  static TModelEvent cast(TEvent event)  {
    return new TModelEvent(model_event_cast(event != null ? (event.nativeObj) : 0));
 }


  /**
   * 模型名称。
   *
   */
 public String getName() {
   return model_event_t_get_prop_name(this.nativeObj);
 }


  /**
   * 变化类型(update/add/remove)。
   *
   */
 public String getChangeType() {
   return model_event_t_get_prop_change_type(this.nativeObj);
 }


  /**
   * 模型。
   *
   */
 public TObject getModel() {
   return new TObject(model_event_t_get_prop_model(this.nativeObj));
 }

static private native long model_event_cast(long event);
static private native String model_event_t_get_prop_name(long nativeObj);
static private native String model_event_t_get_prop_change_type(long nativeObj);
static private native long model_event_t_get_prop_model(long nativeObj);
};