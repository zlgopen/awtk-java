import awtk.*;

public abstract class App {
  public abstract void createUI();

  public void init(String[] args) {
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

  public void start(String[] args) {
    this.init(args);
    this.createUI();

    AWTK.run();
  }

  static {
    System.loadLibrary("awtk-jni");
  }
}
