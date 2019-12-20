import awtk.*;

class DemoTimer {
  public static void main(String[] args) {
    AWTK.init(320, 480, TAppType.SIMULATOR);

    TWidget win = TWindow.createDefault();
    TWidget text = TLabel.create(win, 0, 0, 0, 0);
    text.setSelfLayout("default(x=c,y=m,w=100%,h=30)");
    text.setText("Hello World");

    TTimer.add(new TPrintOnTimer(), 0, 1000);

    AWTK.run();
  }

  static {
    System.loadLibrary("awtk-jni");
  }

}
