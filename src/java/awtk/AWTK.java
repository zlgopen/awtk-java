package awtk;

public class AWTK {
  static public TRet init(int w, int h, TAppType appType) {
    return TRet.from(AWTK.init(w, h, appType.value()));
  }

  static public native int init(int w, int h, int appType);

  static public native TRet run();
}
