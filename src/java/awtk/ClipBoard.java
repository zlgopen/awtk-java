package awtk;

public class ClipBoard {
 public long nativeObj;

 public ClipBoard(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public ClipBoard cast(long nativeObj) {
   return new ClipBoard(nativeObj);
 }

 public  static Ret setText(String text)  {
   return Ret.from(clip_board_set_text(text));
 }

 public  static String getText()  {
   return clip_board_get_text();
 }

static private native int clip_board_set_text(String text);
static private native String clip_board_get_text();
}

