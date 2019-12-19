package awtk;

public abstract class TOnTimer implements IOnTimer {
  public abstract TRet onTimer(TTimerInfo info);

  public int onTimer(long info) {
    return this.onTimer(TTimerInfo.cast(info)).value();
  }
};
