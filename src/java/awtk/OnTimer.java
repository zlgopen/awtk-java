package awtk;

public abstract class OnTimer implements IOnTimer {
  public abstract Ret onTimer(TimerInfo info);

  public int onTimer(long info) {
    return this.onTimer(TimerInfo.cast(info)).value();
  }
};
