package awtk;


/**
 * 剪切板接口。
 *
 */
public class ClipBoard {
 public long nativeObj;

 public ClipBoard(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public ClipBoard cast(long nativeObj) {
   return new ClipBoard(nativeObj);
 }


/**
 * 设置文本(UTF8)数据到剪切板。
 * 
 * @param text 文本。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  static Ret setText(String text)  {
   return Ret.from(clip_board_set_text(text));
 }


/**
 * 从剪切板中获取文本(UTF8)数据。
 * 
 *
 * @returns 返回文本数据。
 */
 public  static String getText()  {
   return clip_board_get_text();
 }

static private native int clip_board_set_text(String text);
static private native String clip_board_get_text();
}

