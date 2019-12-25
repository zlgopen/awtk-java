package awtk;



/**
 * 函数返回值常量定义。
 *
 */

public enum TRet {
  
/**
 * 成功。
 *
 */
 
  OK (RET_OK()),
  
/**
 * Out of memory。
 *
 */
 
  OOM (RET_OOM()),
  
/**
 * 失败。
 *
 */
 
  FAIL (RET_FAIL()),
  
/**
 * 没有实现/不支持。
 *
 */
 
  NOT_IMPL (RET_NOT_IMPL()),
  
/**
 * 退出。通常用于主循环。
 *
 */
 
  QUIT (RET_QUIT()),
  
/**
 * 找到。
 *
 */
 
  FOUND (RET_FOUND()),
  
/**
 * 对象忙。
 *
 */
 
  BUSY (RET_BUSY()),
  
/**
 * 移出。通常用于定时器。
 *
 */
 
  REMOVE (RET_REMOVE()),
  
/**
 * 重复。通常用于定时器。
 *
 */
 
  REPEAT (RET_REPEAT()),
  
/**
 * 没找到。
 *
 */
 
  NOT_FOUND (RET_NOT_FOUND()),
  
/**
 * 操作完成。
 *
 */
 
  DONE (RET_DONE()),
  
/**
 * 停止后续操作。
 *
 */
 
  STOP (RET_STOP()),
  
/**
 * 跳过当前项。
 *
 */
 
  SKIP (RET_SKIP()),
  
/**
 * 继续后续操作。
 *
 */
 
  CONTINUE (RET_CONTINUE()),
  
/**
 * 对象属性变化。
 *
 */
 
  OBJECT_CHANGED (RET_OBJECT_CHANGED()),
  
/**
 * 集合数目变化。
 *
 */
 
  ITEMS_CHANGED (RET_ITEMS_CHANGED()),
  
/**
 * 无效参数。
 *
 */
 
  BAD_PARAMS (RET_BAD_PARAMS()),
  
/**
 * 超时。
 *
 */
 
  TIMEOUT (RET_TIMEOUT()),
  
/**
 * CRC错误。
 *
 */
 
  CRC (RET_CRC()),
  
/**
 * IO错误。
 *
 */
 
  IO (RET_IO()),
  
/**
 * End of Stream
 *
 */
 
  EOS (RET_EOS());
 
 
  private TRet(int value) {
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
  public static TRet from(int value) {
    for(TRet iter : TRet.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return OK;
  }
  
  private int value;

  static private native int RET_OK();
  static private native int RET_OOM();
  static private native int RET_FAIL();
  static private native int RET_NOT_IMPL();
  static private native int RET_QUIT();
  static private native int RET_FOUND();
  static private native int RET_BUSY();
  static private native int RET_REMOVE();
  static private native int RET_REPEAT();
  static private native int RET_NOT_FOUND();
  static private native int RET_DONE();
  static private native int RET_STOP();
  static private native int RET_SKIP();
  static private native int RET_CONTINUE();
  static private native int RET_OBJECT_CHANGED();
  static private native int RET_ITEMS_CHANGED();
  static private native int RET_BAD_PARAMS();
  static private native int RET_TIMEOUT();
  static private native int RET_CRC();
  static private native int RET_IO();
  static private native int RET_EOS();

}
