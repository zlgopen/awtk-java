package awtk;



/**
 * 对话框退出码。
 *
 *> 一般用作dialog_quit函数的参数。
 *
 */

public enum TDialogQuitCode {
  
/**
 * 对话框被强行关闭或不关心关闭原因。
 *
 */
 
  NONE (DIALOG_QUIT_NONE()),
  
/**
 * 点击“OK”按钮关闭。
 *
 */
 
  OK (DIALOG_QUIT_OK()),
  
/**
 * 点击“YES”按钮关闭。
 *
 */
 
  YES (DIALOG_QUIT_YES()),
  
/**
 * 点击“CANCEL”按钮关闭。
 *
 */
 
  CANCEL (DIALOG_QUIT_CANCEL()),
  
/**
 * 点击“NO”按钮关闭。
 *
 */
 
  NO (DIALOG_QUIT_NO()),
  
/**
 * 点击其它按钮关闭。
 *
 */
 
  OTHER (DIALOG_QUIT_OTHER());
 
 
  private TDialogQuitCode(int value) {
    this.value = value;
  }

/**
 * 获取枚举的值。
 *
 * @return 枚举的值。
 */
  public int value() {
    return this.value;
  }

/**
 * 把枚举的值转换层枚举。
 *
 * @param value 枚举的值。

 * @return 对应的枚举类型。
 */
  public static TDialogQuitCode from(int value) {
    for(TDialogQuitCode iter : TDialogQuitCode.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return NONE;
  }
  
  private int value;

  static private native int DIALOG_QUIT_NONE();
  static private native int DIALOG_QUIT_OK();
  static private native int DIALOG_QUIT_YES();
  static private native int DIALOG_QUIT_CANCEL();
  static private native int DIALOG_QUIT_NO();
  static private native int DIALOG_QUIT_OTHER();

}
