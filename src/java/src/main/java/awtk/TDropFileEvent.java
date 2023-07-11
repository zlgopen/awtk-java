package awtk;


/**
 * 文件拖入事件。
 *
 */
public class TDropFileEvent extends TEvent { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TDropFileEvent(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TDropFileEvent cast(long nativeObj) {
   return new TDropFileEvent(nativeObj);
 }


  /**
   * 把event对象转drop_file_event_t对象。
   * 
   * @param event event对象。
   *
   * @return event 对象。
   */
 public  static TDropFileEvent cast(TEvent event)  {
    return new TDropFileEvent(drop_file_event_cast(event != null ? (event.nativeObj) : 0));
 }


  /**
   * 文件名。
   *
   */
 public String getFilename() {
   return drop_file_event_t_get_prop_filename(this.nativeObj);
 }

static private native long drop_file_event_cast(long event);
static private native String drop_file_event_t_get_prop_filename(long nativeObj);
};