package awtk;

public abstract class TOnEvent implements IOnEvent {
  public abstract TRet onEvent(TEvent evt);

  public int onEvent(long evt) {
    return this.onEvent(TEvent.cast(evt)).value();
  }
};

