package awtk;


/**
 * 主题变化事件。
 *
 */
public class TThemeChangeEvent extends TEvent { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TThemeChangeEvent(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TThemeChangeEvent cast(long nativeObj) {
   return new TThemeChangeEvent(nativeObj);
 }


  /**
   * 把event对象转theme_change_event_t对象。
   * 
   * @param event event对象。
   *
   * @return 返回event对象。
   */
 public  static TThemeChangeEvent cast(TEvent event)  {
    return new TThemeChangeEvent(theme_change_event_cast(event != null ? (event.nativeObj) : 0));
 }


  /**
   * 主题名称。
   *
   */
 public String getName() {
   return theme_change_event_t_get_prop_name(this.nativeObj);
 }

static private native long theme_change_event_cast(long event);
static private native String theme_change_event_t_get_prop_name(long nativeObj);
};