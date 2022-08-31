package awtk;


/**
 * 用于串口通信的控件
 *在xml中使用"serial"标签创建控件。如：
 *
 *```xml
 *<!-- ui -->
 *<serial device="COM1" baudrate="115200"/>
 *```
 *
 *可用通过style来设置控件的显示风格，如字体的大小和颜色等等。如：
 *> 本控件默认不可见，无需指定style。
 *
 *```xml
 *<!-- style -->
 *<serial>
 *<style name="default" font_size="32">
 *<normal text_color="black" />
 *</style>
 *</serial>
 *```
 *
 */
public class TSerialWidget extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TSerialWidget(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TSerialWidget cast(long nativeObj) {
   return new TSerialWidget(nativeObj);
 }


  /**
   * 创建serial_widget对象
   * 
   * @param parent 父控件
   * @param x x坐标
   * @param y y坐标
   * @param w 宽度
   * @param h 高度
   *
   * @return serial_widget对象。
   */
 public  static TWidget create(TWidget parent, int x, int y, int w, int h)  {
    return new TSerialWidget(serial_widget_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 转换为serial_widget对象(供脚本语言使用)。
   * 
   * @param widget serial_widget对象。
   *
   * @return serial_widget对象。
   */
 public  static TSerialWidget cast(TWidget widget)  {
    return new TSerialWidget(serial_widget_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 设置 波特率。
   * 
   * @param baudrate 波特率。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setBaudrate(int baudrate)  {
   return TRet.from(serial_widget_set_baudrate(this != null ? (this.nativeObj) : 0, baudrate));
 }


  /**
   * 设置 设备。
   * 
   * @param device 设备。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setDevice(String device)  {
   return TRet.from(serial_widget_set_device(this != null ? (this.nativeObj) : 0, device));
 }


  /**
   * 设置 字节位数。
   * 
   * @param bytesize 字节位数。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setBytesize(int bytesize)  {
   return TRet.from(serial_widget_set_bytesize(this != null ? (this.nativeObj) : 0, bytesize));
 }


  /**
   * 设置 奇偶校验。
   * 
   * @param parity 奇偶校验。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setParity(int parity)  {
   return TRet.from(serial_widget_set_parity(this != null ? (this.nativeObj) : 0, parity));
 }


  /**
   * 设置 停止位。
   * 
   * @param stopbits 停止位。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setStopbits(int stopbits)  {
   return TRet.from(serial_widget_set_stopbits(this != null ? (this.nativeObj) : 0, stopbits));
 }


  /**
   * 设置 流控。
   * 
   * @param flowcontrol 流控。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setFlowcontrol(int flowcontrol)  {
   return TRet.from(serial_widget_set_flowcontrol(this != null ? (this.nativeObj) : 0, flowcontrol));
 }


  /**
   * 设置 轮询时间。
   * 
   * @param check_interval 轮询时间（单位：ms）。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setCheckInterval(int check_interval)  {
   return TRet.from(serial_widget_set_check_interval(this != null ? (this.nativeObj) : 0, check_interval));
 }


  /**
   * 设备(文件)名。
   *
   */
 public String getDevice() {
   return serial_widget_t_get_prop_device(this.nativeObj);
 }


  /**
   * 波特率。
   *
   */
 public int getBaudrate() {
   return serial_widget_t_get_prop_baudrate(this.nativeObj);
 }


  /**
   * 字节位数。
   *
   */
 public int getBytesize() {
   return serial_widget_t_get_prop_bytesize(this.nativeObj);
 }


  /**
   * 奇偶校验。
   *
   */
 public int getParity() {
   return serial_widget_t_get_prop_parity(this.nativeObj);
 }


  /**
   * 停止位。
   *
   */
 public int getStopbits() {
   return serial_widget_t_get_prop_stopbits(this.nativeObj);
 }


  /**
   * 流控。
   *
   */
 public int getFlowcontrol() {
   return serial_widget_t_get_prop_flowcontrol(this.nativeObj);
 }


  /**
   * 轮询时间（单位：ms）。
   *> 仅在不支持用select等待串口数据的嵌入式设备上有效。
   *
   */
 public int getCheckInterval() {
   return serial_widget_t_get_prop_check_interval(this.nativeObj);
 }

static private native long serial_widget_create(long parent, int x, int y, int w, int h);
static private native long serial_widget_cast(long widget);
static private native int serial_widget_set_baudrate(long widget, int baudrate);
static private native int serial_widget_set_device(long widget, String device);
static private native int serial_widget_set_bytesize(long widget, int bytesize);
static private native int serial_widget_set_parity(long widget, int parity);
static private native int serial_widget_set_stopbits(long widget, int stopbits);
static private native int serial_widget_set_flowcontrol(long widget, int flowcontrol);
static private native int serial_widget_set_check_interval(long widget, int check_interval);
static private native String serial_widget_t_get_prop_device(long nativeObj);
static private native int serial_widget_t_get_prop_baudrate(long nativeObj);
static private native int serial_widget_t_get_prop_bytesize(long nativeObj);
static private native int serial_widget_t_get_prop_parity(long nativeObj);
static private native int serial_widget_t_get_prop_stopbits(long nativeObj);
static private native int serial_widget_t_get_prop_flowcontrol(long nativeObj);
static private native int serial_widget_t_get_prop_check_interval(long nativeObj);
};