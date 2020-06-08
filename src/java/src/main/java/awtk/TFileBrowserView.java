package awtk;


/**
 * 文件管理/浏览/选择控件。
 *
 *file\_browser\_view\_t是[widget\_t](widget_t.md)的子类控件，widget\_t的函数均适用于file\_browser\_view\_t控件。
 *
 *考虑到文件浏览器界面呈现的多样性，界面呈现工作完全有子控件来完成。
 *
 *file\_browser\_view\_t负责关联文件/文件夹数据到子控件上，子控件需要特定的规范命名。
 *
 ** 名为 "cwd" 的子控件用于显示当前路径。
 *
 ** 名为 "selected_file" 的子控件用于显示当前选择的文件。
 *
 ** 名为 "file" 的子控件用于显示文件项的模板控件。
 *
 ** 名为 "folder" 的子控件用于显示文件夹项的模板控件。
 *
 ** 名为 "return_up" 的子控件用于返回上一级文件夹的模板控件。
 *
 ** 名为 "container" 的子控件为容器控件，通常是scrollview。
 *
 ** 名为 "name" 的子控件用于显示文件和文件夹的名称(放在列表项目内)。
 *
 ** 名为 "size" 的子控件用于显示文件和文件夹的大小(放在列表项目内)。
 *
 ** 名为 "mtime" 的子控件用于显示文件和文件夹的修改时间(放在列表项目内)。
 *
 ** 名为 "ctime" 的子控件用于显示文件和文件夹的创建时间(放在列表项目内)。
 *
 ** 名为 "icon" 的子控件用于显示文件和文件夹的图标(放在列表项目内)。
 *
 ** 类型为 "check_button" 的子控件用于选择(放在列表项目内)。
 *
 *完整示例请参考：
 *
 *https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/file_chooser_for_open.xml
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
   * 设置 初始文件夹。
   * 
   * @param init_dir 初始文件夹。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setInitDir(String init_dir)  {
   return TRet.from(file_browser_view_set_init_dir(this != null ? (this.nativeObj) : 0, init_dir));
 }


  /**
   * 设置 过滤规则。
   *> files_only 表示只列出文件，dir_only 表示只列出目录，其它表示只列出满足扩展名文件集合(如：.jpg.png.gif)。
   * 
   * @param filter 过滤规则。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setFilter(String filter)  {
   return TRet.from(file_browser_view_set_filter(this != null ? (this.nativeObj) : 0, filter));
 }


  /**
   * 重新加载。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet reload()  {
   return TRet.from(file_browser_view_reload(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 设置 忽略隐藏文件。
   * 
   * @param ignore_hidden_files 忽略隐藏文件。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setIgnoreHiddenFiles(boolean ignore_hidden_files)  {
   return TRet.from(file_browser_view_set_ignore_hidden_files(this != null ? (this.nativeObj) : 0, ignore_hidden_files));
 }


  /**
   * 设置 是否为升序排序。
   * 
   * @param sort_ascending 是否为升序排序。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setSortAscending(boolean sort_ascending)  {
   return TRet.from(file_browser_view_set_sort_ascending(this != null ? (this.nativeObj) : 0, sort_ascending));
 }


  /**
   * 设置 是否显示checkbutton。
   * 
   * @param show_check_button 是否显示checkbutton。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setShowCheckButton(boolean show_check_button)  {
   return TRet.from(file_browser_view_set_show_check_button(this != null ? (this.nativeObj) : 0, show_check_button));
 }


  /**
   * 设置 排序方式。可选值(name, size, mtime, type)。
   * 
   * @param sort_by 排序方式。可选值(name, size, mtime, type)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setSortBy(String sort_by)  {
   return TRet.from(file_browser_view_set_sort_by(this != null ? (this.nativeObj) : 0, sort_by));
 }


  /**
   * 获取当前路径。
   * 
   *
   * @return 返回当前路径。
   */
 public  String getCwd()  {
    return file_browser_view_get_cwd(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 在当前文件夹创建子文件夹。
   * 
   * @param name 子文件夹名。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet createDir(String name)  {
   return TRet.from(file_browser_view_create_dir(this != null ? (this.nativeObj) : 0, name));
 }


  /**
   * 在当前文件夹创建文件。
   * 
   * @param name 文件名。
   * @param data 数据。
   * @param size 数据长度。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet createFile(String name, String data, int size)  {
   return TRet.from(file_browser_view_create_file(this != null ? (this.nativeObj) : 0, name, data, size));
 }


  /**
   * 初始文件夹。
   *
   */
 public String getInitDir() {
   return file_browser_view_t_get_prop_init_dir(this.nativeObj);
 }


  /**
   * 过滤规则。
   *
   */
 public String getFilter() {
   return file_browser_view_t_get_prop_filter(this.nativeObj);
 }


  /**
   * 是否忽略隐藏文件。
   *
   */
 public boolean getIgnoreHiddenFiles() {
   return file_browser_view_t_get_prop_ignore_hidden_files(this.nativeObj);
 }


  /**
   * 是否为升序排序。
   *
   */
 public boolean getSortAscending() {
   return file_browser_view_t_get_prop_sort_ascending(this.nativeObj);
 }


  /**
   * 是否显示checkbutton。
   *
   */
 public boolean getShowCheckButton() {
   return file_browser_view_t_get_prop_show_check_button(this.nativeObj);
 }


  /**
   * 排序方式。可选值(name, size, mtime, type)。
   *
   */
 public String getSortBy() {
   return file_browser_view_t_get_prop_sort_by(this.nativeObj);
 }

static private native long file_browser_view_create(long parent, int x, int y, int w, int h);
static private native long file_browser_view_cast(long widget);
static private native int file_browser_view_set_init_dir(long widget, String init_dir);
static private native int file_browser_view_set_filter(long widget, String filter);
static private native int file_browser_view_reload(long widget);
static private native int file_browser_view_set_ignore_hidden_files(long widget, boolean ignore_hidden_files);
static private native int file_browser_view_set_sort_ascending(long widget, boolean sort_ascending);
static private native int file_browser_view_set_show_check_button(long widget, boolean show_check_button);
static private native int file_browser_view_set_sort_by(long widget, String sort_by);
static private native String file_browser_view_get_cwd(long widget);
static private native int file_browser_view_create_dir(long widget, String name);
static private native int file_browser_view_create_file(long widget, String name, String data, int size);
static private native String file_browser_view_t_get_prop_init_dir(long nativeObj);
static private native String file_browser_view_t_get_prop_filter(long nativeObj);
static private native boolean file_browser_view_t_get_prop_ignore_hidden_files(long nativeObj);
static private native boolean file_browser_view_t_get_prop_sort_ascending(long nativeObj);
static private native boolean file_browser_view_t_get_prop_show_check_button(long nativeObj);
static private native String file_browser_view_t_get_prop_sort_by(long nativeObj);
};