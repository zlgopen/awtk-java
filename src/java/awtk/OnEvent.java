package awtk;

public abstract class OnEvent implements IOnEvent {
  public abstract Ret onEvent(Event evt);

  public int onEvent(long evt) {
    return this.onEvent(Event.cast(evt)).value();
  }
};

