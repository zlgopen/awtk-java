import awtk.*;

class DemoButton {
  public static void init(String[] args) {
    int w = 320;
    int h = 480;

    if (args.length > 0) {
      w = Integer.parseInt(args[0]);
    }

    if (args.length > 1) {
      h = Integer.parseInt(args[1]);
    }

    AWTK.init(w, h, TAppType.SIMULATOR);
  }

  public static void createUI() {
    TWidget win = TWindow.createDefault();
    TWidget button = TButton.create(win, 10, 0, 0, 0);

    button.setName("quit");
    button.setText("Quit");
    button.setSelfLayout("default(x=c,y=m,w=200,h=40)");

    button.on(TEventType.CLICK, new TOnEvent() {
      @Override
      public TRet onEvent(TEvent evt) {
        System.out.println("OnClick");
        TGlobal.quit();
        return TRet.OK;
      }
    }, 0);
  }

  public static void main(String[] args) {
    DemoButton.init(args);
    DemoButton.createUI();

    AWTK.run();
  }

  static {
    System.loadLibrary("awtk-jni");
  }

}
