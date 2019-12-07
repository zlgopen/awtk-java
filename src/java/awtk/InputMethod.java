package awtk;

public class InputMethod {
 public long nativeObj;

 public InputMethod(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public InputMethod cast(long nativeObj) {
   return new InputMethod(nativeObj);
 }

 public  Ret commitText(String text)  {
   return Ret.from(input_method_commit_text(this.nativeObj, text));
 }

 public  Ret dispatchKey(int key)  {
   return Ret.from(input_method_dispatch_key(this.nativeObj, key));
 }

 public  static InputMethod instance()  {
   return new InputMethod(input_method());
 }

static private native int input_method_commit_text(long im, String text);
static private native int input_method_dispatch_key(long im, int key);
static private native long input_method();
}

