package awtk;


/**
 * TK全局对象。
 *
 */
public class Global {

/**
 * 退出TK事件主循环。
 * 
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  static Ret quit()  {
   return Ret.from(tk_quit());
 }


/**
 * 获取全局指针的X坐标。
 * 
 *
 * @returns 返回全局指针的X坐标。
 */
 public  static int getPointerX()  {
   return tk_get_pointer_x();
 }


/**
 * 获取全局指针的Y坐标。
 * 
 *
 * @returns 返回全局指针的X坐标。
 */
 public  static int getPointerY()  {
   return tk_get_pointer_y();
 }


/**
 * 获取全局指针是否按下。
 * 
 *
 * @returns 返回全局指针是否按下。
 */
 public  static boolean isPointerPressed()  {
   return tk_is_pointer_pressed();
 }

static private native int tk_quit();
static private native int tk_get_pointer_x();
static private native int tk_get_pointer_y();
static private native boolean tk_is_pointer_pressed();
}

