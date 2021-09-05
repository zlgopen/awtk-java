package awtk;


/**
 * 原生窗口。
 *
 */
public class TNativeWindow extends TObject { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TNativeWindow(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TNativeWindow cast(long nativeObj) {
   return new TNativeWindow(nativeObj);
 }


  /**
   * 移动窗口。
   * 
   * @param x x坐标。
   * @param y y坐标。
   * @param force 无论是否shared都move。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet move(int x, int y, boolean force)  {
   return TRet.from(native_window_move(this != null ? (this.nativeObj) : 0, x, y, force));
 }


  /**
   * 调整窗口大小。
   * 
   * @param w 宽。
   * @param h 高。
   * @param force 无论是否shared都resize。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet resize(int w, int h, boolean force)  {
   return TRet.from(native_window_resize(this != null ? (this.nativeObj) : 0, w, h, force));
 }


  /**
   * 调整窗口旋转。
   * 
   * @param old_orientation 旧的旋转角度。
   * @param new_orientation 新的旋转角度。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setOrientation(long old_orientation, long new_orientation)  {
   return TRet.from(native_window_set_orientation(this != null ? (this.nativeObj) : 0, old_orientation, new_orientation));
 }


  /**
   * 最小化窗口。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet minimize()  {
   return TRet.from(native_window_minimize(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 最大化窗口。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet maximize()  {
   return TRet.from(native_window_maximize(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 恢复窗口大小。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet restore()  {
   return TRet.from(native_window_restore(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 窗口居中。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet center()  {
   return TRet.from(native_window_center(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 是否显示边框。
   * 
   * @param show 是否显示。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet showBorder(boolean show)  {
   return TRet.from(native_window_show_border(this != null ? (this.nativeObj) : 0, show));
 }


  /**
   * 是否全屏。
   * 
   * @param fullscreen 是否全屏。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setFullscreen(boolean fullscreen)  {
   return TRet.from(native_window_set_fullscreen(this != null ? (this.nativeObj) : 0, fullscreen));
 }


  /**
   * 设置鼠标光标。
   * 
   * @param name 鼠标光标的名称。
   * @param img 鼠标光标的图片。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setCursor(String name, TBitmap img)  {
   return TRet.from(native_window_set_cursor(this != null ? (this.nativeObj) : 0, name, img != null ? (img.nativeObj) : 0));
 }

static private native int native_window_move(long win, int x, int y, boolean force);
static private native int native_window_resize(long win, int w, int h, boolean force);
static private native int native_window_set_orientation(long win, long old_orientation, long new_orientation);
static private native int native_window_minimize(long win);
static private native int native_window_maximize(long win);
static private native int native_window_restore(long win);
static private native int native_window_center(long win);
static private native int native_window_show_border(long win, boolean show);
static private native int native_window_set_fullscreen(long win, boolean fullscreen);
static private native int native_window_set_cursor(long win, String name, long img);
};