package awtk;


/**
 * 电阻屏校准窗口。
 *
 *calibration\_win\_t是[window\_base\_t](window_base_t.md)的子类控件，
 *window\_base\_t的函数均适用于calibration\_win\_t控件。
 *
 *在xml中使用"calibration\_win"标签创建电阻屏校准窗口。如：
 *
 *```xml
 *<calibration_win name="cali" w="100%" h="100%" text="Please click the center of cross">
 *</calibration_win>
 *```
 *
 *> 更多用法请参考：
 *[window.xml](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/calibration_win.xml)
 *
 *在c代码中使用函数calibration\_win\_create创建窗口。如：
 *
 *
 *通过calibration\_win\_set\_on\_done注册回调函数，用于保存校准数据。
 *
 */
public class TCalibrationWin extends TWindowBase { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TCalibrationWin(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TCalibrationWin cast(long nativeObj) {
   return new TCalibrationWin(nativeObj);
 }


  /**
   * 转换为calibration_win对象(供脚本语言使用)。
   * 
   * @param widget calibration_win对象。
   *
   * @return calibration_win对象。
   */
 public  static TCalibrationWin cast(TWidget widget)  {
    return new TCalibrationWin(calibration_win_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long calibration_win_cast(long widget);
};