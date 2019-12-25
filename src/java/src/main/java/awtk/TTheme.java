package awtk;


/**
 * 主题。
 *
 *负责管理缺省的主题数据，方便实现style\_const。
 *
 */
public class TTheme { 

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
 public TTheme(long nativeObj) {
   this.nativeObj = nativeObj;
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TTheme cast(long nativeObj) {
   return new TTheme(nativeObj);
 }


  /**
   * 获取缺省的主题对象。
   * 
   *
   * @return 返回主题对象。
   */
 public  static TTheme instance()  {
    return new TTheme(theme());
 }

static private native long theme();
};