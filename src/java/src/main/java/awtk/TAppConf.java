package awtk;


/**
 * 应用程序的配置信息。
 *
 *底层实现可以是任何格式，比如INI，XML，JSON和UBJSON。
 *
 *对于树状的文档，key可以是多级的，用.分隔。如network.ip。
 *
 */
public class TAppConf { 

  /**
   * 持久保存配置。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  static TRet save()  {
   return TRet.from(app_conf_save());
 }


  /**
   * 重新加载配置(内存中的配置丢失)。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  static TRet reload()  {
   return TRet.from(app_conf_reload());
 }


  /**
   * 释放conf对象。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  static TRet deinit()  {
   return TRet.from(app_conf_deinit());
 }


  /**
   * 检查配置项是否存在。
   * 
   * @param key 配置项的名称。
   *
   * @return 返回TRUE表示存在，FALSE表示不存在。
   */
 public  static boolean exist(String key)  {
    return app_conf_exist(key);
 }


  /**
   * 设置整数类型配置项的值。
   * 
   * @param key 配置项的名称。
   * @param v 配置项的值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  static TRet setInt(String key, int v)  {
   return TRet.from(app_conf_set_int(key, v));
 }


  /**
   * 设置64位整数类型配置项的值。
   * 
   * @param key 配置项的名称。
   * @param v 配置项的值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  static TRet setInt64(String key, long v)  {
   return TRet.from(app_conf_set_int64(key, v));
 }


  /**
   * 设置bool类型配置项的值。
   * 
   * @param key 配置项的名称。
   * @param v 配置项的值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  static TRet setBool(String key, boolean v)  {
   return TRet.from(app_conf_set_bool(key, v));
 }


  /**
   * 设置双精度类型配置项的值。
   * 
   * @param key 配置项的名称。
   * @param v 配置项的值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  static TRet setDouble(String key, double v)  {
   return TRet.from(app_conf_set_double(key, v));
 }


  /**
   * 设置字符串类型配置项的值。
   * 
   * @param key 配置项的名称。
   * @param v 配置项的值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  static TRet setStr(String key, String v)  {
   return TRet.from(app_conf_set_str(key, v));
 }


  /**
   * 获取整数类型配置项的值。
   * 
   * @param key 配置项的名称。
   * @param defval 缺省值。
   *
   * @return 返回配置项的值（如果不存在返回缺省值）。
   */
 public  static int getInt(String key, int defval)  {
    return app_conf_get_int(key, defval);
 }


  /**
   * 获取64位整数类型配置项的值。
   * 
   * @param key 配置项的名称。
   * @param defval 缺省值。
   *
   * @return 返回配置项的值（如果不存在返回缺省值）。
   */
 public  static long getInt64(String key, long defval)  {
    return app_conf_get_int64(key, defval);
 }


  /**
   * 获取bool类型配置项的值。
   * 
   * @param key 配置项的名称。
   * @param defval 缺省值。
   *
   * @return 返回配置项的值（如果不存在返回缺省值）。
   */
 public  static boolean getBool(String key, boolean defval)  {
    return app_conf_get_bool(key, defval);
 }


  /**
   * 获取单精度浮点数类型配置项的值。
   * 
   * @param key 配置项的名称。
   * @param defval 缺省值。
   *
   * @return 返回配置项的值（如果不存在返回缺省值）。
   */
 public  static double getDouble(String key, double defval)  {
    return app_conf_get_double(key, defval);
 }


  /**
   * 获取字符串类型配置项的值。
   * 
   * @param key 配置项的名称。
   * @param defval 缺省值。
   *
   * @return 返回配置项的值（如果不存在返回缺省值）。
   */
 public  static String getStr(String key, String defval)  {
    return app_conf_get_str(key, defval);
 }


  /**
   * 删除配置项。
   * 
   * @param key 配置项的名称。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  static TRet remove(String key)  {
   return TRet.from(app_conf_remove(key));
 }

static private native int app_conf_save();
static private native int app_conf_reload();
static private native int app_conf_deinit();
static private native boolean app_conf_exist(String key);
static private native int app_conf_set_int(String key, int v);
static private native int app_conf_set_int64(String key, long v);
static private native int app_conf_set_bool(String key, boolean v);
static private native int app_conf_set_double(String key, double v);
static private native int app_conf_set_str(String key, String v);
static private native int app_conf_get_int(String key, int defval);
static private native long app_conf_get_int64(String key, long defval);
static private native boolean app_conf_get_bool(String key, boolean defval);
static private native double app_conf_get_double(String key, double defval);
static private native String app_conf_get_str(String key, String defval);
static private native int app_conf_remove(String key);
};