package awtk;


/**
 * 主题。 负责管理缺省的主题数据，方便实现style\_const。
 *
 */
public class Theme {
 public long nativeObj;

 public Theme(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public Theme cast(long nativeObj) {
   return new Theme(nativeObj);
 }


/**
 * 获取缺省的主题对象。
 * 
 *
 * @returns 返回主题对象。
 */
 public  static Theme instance()  {
   return new Theme(theme());
 }

static private native long theme();
}

