package awtk;

public abstract class OnWidget implements OnData {
  public abstract Ret onWidget(Widget widget);

  public int onData(long widget) {
    return this.onWidget(Widget.cast(widget)).value();
  }
};
