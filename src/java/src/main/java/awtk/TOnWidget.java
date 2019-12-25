package awtk;

public abstract class TOnWidget implements IOnData {
  public abstract TRet onWidget(TWidget widget);

  public int onData(long widget) {
    return this.onWidget(TWidget.cast(widget)).value();
  }
};
