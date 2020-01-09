package awtk;


/**
 * 文件管理/浏览/选择控件
 *
 */
public class TFileBrowserView extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TFileBrowserView(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TFileBrowserView cast(long nativeObj) {
   return new TFileBrowserView(nativeObj);
 }


  /**
   * 创建file_browser_view对象
   * 
   * @param parent 父控件
   * @param x x坐标
   * @param y y坐标
   * @param w 宽度
   * @param h 高度
   *
   * @return 对象。
   */
 public  static TWidget create(TWidget parent, int x, int y, int w, int h)  {
    return new TFileBrowserView(file_browser_view_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为file_browser_view对象(供脚本语言使用)。
   * 
   * @param widget file_browser_view对象。
   *
   * @return file_browser_view对象。
   */
 public  static TFileBrowserView cast(TWidget widget)  {
    return new TFileBrowserView(file_browser_view_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 设置 初始目录。
   * 
   * @param init_dir 初始目录。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setInitDir(String init_dir)  {
   return TRet.from(file_browser_view_set_init_dir(this != null ? (this.nativeObj) : 0, init_dir));
 }


  /**
   * 设置 文件项的图标。
   * 
   * @param file_icon 文件项的图标。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setFileIcon(String file_icon)  {
   return TRet.from(file_browser_view_set_file_icon(this != null ? (this.nativeObj) : 0, file_icon));
 }


  /**
   * 设置 目录项的图标。
   * 
   * @param folder_icon 目录项的图标。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setFolderIcon(String folder_icon)  {
   return TRet.from(file_browser_view_set_folder_icon(this != null ? (this.nativeObj) : 0, folder_icon));
 }


  /**
   * 设置 返回上一级目录的图标。
   * 
   * @param return_up_icon 返回上一级目录的图标。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setReturnUpIcon(String return_up_icon)  {
   return TRet.from(file_browser_view_set_return_up_icon(this != null ? (this.nativeObj) : 0, return_up_icon));
 }


  /**
   * 初始目录。
   *
   */
 public String getInitDir() {
   return file_browser_view_t_get_prop_init_dir(this.nativeObj);
 }


  /**
   * 文件项的图标。
   *
   */
 public String getFileIcon() {
   return file_browser_view_t_get_prop_file_icon(this.nativeObj);
 }


  /**
   * 目录项的图标。
   *
   */
 public String getFolderIcon() {
   return file_browser_view_t_get_prop_folder_icon(this.nativeObj);
 }


  /**
   * 返回上一级目录的图标。
   *
   */
 public String getReturnUpIcon() {
   return file_browser_view_t_get_prop_return_up_icon(this.nativeObj);
 }

static private native long file_browser_view_create(long parent, int x, int y, int w, int h);
static private native long file_browser_view_cast(long widget);
static private native int file_browser_view_set_init_dir(long widget, String init_dir);
static private native int file_browser_view_set_file_icon(long widget, String file_icon);
static private native int file_browser_view_set_folder_icon(long widget, String folder_icon);
static private native int file_browser_view_set_return_up_icon(long widget, String return_up_icon);
static private native String file_browser_view_t_get_prop_init_dir(long nativeObj);
static private native String file_browser_view_t_get_prop_file_icon(long nativeObj);
static private native String file_browser_view_t_get_prop_folder_icon(long nativeObj);
static private native String file_browser_view_t_get_prop_return_up_icon(long nativeObj);
};