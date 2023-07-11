package awtk;


/**
 * 在某些情况下，需要多个资源管理器。比如在手表系统里，每个应用或表盘，可能放在独立的资源包中，
 *此时优先加载应用自己的资源，如果没有就加载系统的资源。
 *
 */
public class TLocaleInfos { 

  /**
   * 获取指定小应用程序(applet)的locale_info。
   * 
   * @param name 小应用程序(applet)的名称。
   *
   * @return 返回locale_info对象。
   */
 public  static TLocaleInfo ref(String name)  {
    return new TLocaleInfo(locale_infos_ref(name));
 }


  /**
   * 释放指定小应用程序(applet)的locale_info。
   * 
   * @param locale_info locale_info对象。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  static TRet unref(TLocaleInfo locale_info)  {
   return TRet.from(locale_infos_unref(locale_info != null ? (locale_info.nativeObj) : 0));
 }


  /**
   * 设置全部locale_info的当前国家和语言。
   * 
   * @param language 语言。
   * @param country 国家或地区。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  static TRet change(String language, String country)  {
   return TRet.from(locale_infos_change(language, country));
 }


  /**
   * 注册指定事件的处理函数。
   * 
   * @param type 事件类型，目前有EVT_LOCALE_INFOS_LOAD_INFO、EVT_LOCALE_INFOS_UNLOAD_INFO。
   * @param on_event 事件处理函数。
   * @param ctx 事件处理函数上下文。
   *
   * @return 返回id，用于locale_infos_off。
   */
 public  static int on(TEventType type, TOnEvent on_event, long ctx)  {
    return locale_infos_on(type.value(), on_event, ctx);
 }


  /**
   * 注销指定事件的处理函数。
   * 
   * @param id locale_infos_on返回的ID。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  static TRet off(int id)  {
   return TRet.from(locale_infos_off(id));
 }


  /**
   * 重新加载全部字符串资源。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  static TRet reloadAll()  {
   return TRet.from(locale_infos_reload_all());
 }

static private native long locale_infos_ref(String name);
static private native int locale_infos_unref(long locale_info);
static private native int locale_infos_change(String language, String country);
static private native int locale_infos_on(int type, TOnEvent on_event, long ctx);
static private native int locale_infos_off(int id);
static private native int locale_infos_reload_all();
};