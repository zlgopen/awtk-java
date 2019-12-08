package awtk;

public abstract class OnIdle implements IOnIdle {
  public abstract Ret onIdle(IdleInfo info);

  public int onIdle(long info) {
    return this.onIdle(IdleInfo.cast(info)).value();
  }
};
