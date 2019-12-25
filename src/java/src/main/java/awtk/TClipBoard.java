package awtk;


/**
 * 剪切板接口。
 *
 */
public class TClipBoard { 

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
 public TClipBoard(long nativeObj) {
   this.nativeObj = nativeObj;
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TClipBoard cast(long nativeObj) {
   return new TClipBoard(nativeObj);
 }


  /**
   * 设置文本(UTF8)数据到剪切板。
   * 
   * @param text 文本。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  static TRet setText(String text)  {
   return TRet.from(clip_board_set_text(text));
 }


  /**
   * 从剪切板中获取文本(UTF8)数据。
   * 
   *
   * @return 返回文本数据。
   */
 public  static String getText()  {
    return clip_board_get_text();
 }

static private native int clip_board_set_text(String text);
static private native String clip_board_get_text();
};