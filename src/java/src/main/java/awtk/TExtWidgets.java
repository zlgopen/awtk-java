package awtk;


/**
 * 扩展控件。
 *
 */
public class TExtWidgets { 

  /**
   * 初始化AWTK扩展控件。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  static TRet init()  {
   return TRet.from(tk_ext_widgets_init());
 }

static private native int tk_ext_widgets_init();
};