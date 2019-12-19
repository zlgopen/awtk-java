package awtk;

public abstract class TOnIdle implements IOnIdle {
  public abstract TRet onIdle(TIdleInfo info);

  public int onIdle(long info) {
    return this.onIdle(TIdleInfo.cast(info)).value();
  }
};
