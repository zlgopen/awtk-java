package awtk;

public class AWTK {
  static public Ret init(int w, int h, AppType appType) {
    return Ret.from(AWTK.init(w, h, appType.value()));
  }

  static public native int init(int w, int h, int appType);

  static public native Ret run();
}
