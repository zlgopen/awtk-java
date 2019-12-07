package awtk;


public enum Ret {
  OK (RET_OK()),
  OOM (RET_OOM()),
  FAIL (RET_FAIL()),
  NOT_IMPL (RET_NOT_IMPL()),
  QUIT (RET_QUIT()),
  FOUND (RET_FOUND()),
  BUSY (RET_BUSY()),
  REMOVE (RET_REMOVE()),
  REPEAT (RET_REPEAT()),
  NOT_FOUND (RET_NOT_FOUND()),
  DONE (RET_DONE()),
  STOP (RET_STOP()),
  SKIP (RET_SKIP()),
  CONTINUE (RET_CONTINUE()),
  OBJECT_CHANGED (RET_OBJECT_CHANGED()),
  ITEMS_CHANGED (RET_ITEMS_CHANGED()),
  BAD_PARAMS (RET_BAD_PARAMS()),
  TIMEOUT (RET_TIMEOUT()),
  CRC (RET_CRC()),
  IO (RET_IO()),
  EOS (RET_EOS());
 
   
  private int value;
  Ret(int value) {
    this.value = value;
  }
  public int value() {
    return this.value;
  }

  public static Ret from(int value) {
    for(Ret iter : Ret.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return OK;
  }

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
