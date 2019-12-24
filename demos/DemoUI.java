import awtk.*;

class DemoUI {
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
  
  static class OnClicked extends TOnEvent {
    @Override
    public TRet onEvent(TEvent evt) {
      TWidget target = TWidget.cast(evt.getTarget());
      String name = target.getName();

      System.out.println(name + " clicked");
      if(name.startsWith("open:")) {
        String winName = name.substring(5);
        DemoUI.openWindow(winName);
      } else if(name.equals("close")) {
        TWindow.cast(target.getWindow()).close();
      } else if(name.equals("quit")) {
        TDialog.cast(target.getWindow()).quit(0);
      } else if(name.equals("exit")) {
        TGlobal.quit();
      }

      return TRet.OK;
    }
  }

  static void openWindow(String name) {
    TWidget win;
   
    if(name.equals("toast")) {
      TDialog.toast("Hello AWTK, This is Toast!", 3000);
      return;
    } else if(name.equals("info")) {
      TDialog.info("Info", "Hello AWTK, Timeout!");
      return;
    } else if(name.equals("warn")) {
      TDialog.warn("Warnning", "Hello AWTK, Timeout!");
      return;
    } else if(name.equals("confirm")) {
      TDialog.confirm("Confirm", "Hello AWTK, Are You Sure to Quit?");
      return;
    }
    win = TWindow.open(name);
    
    win.foreach(new TOnWidget() {
      @Override
      public TRet onWidget(TWidget widget) {
        if(widget.getName() != null) {
          System.out.println(widget.getName());
          widget.on(TEventType.CLICK, new OnClicked(), 0);
        }

        return TRet.OK;
      }
    }, 0);

    if(win.isDialog()) {
      TDialog.cast(win).modal();
    }
  }

  public static void createUI() {
    TWindow.open("system_bar");
    DemoUI.openWindow("main");
  }

  public static void main(String[] args) {
    DemoUI.init(args);
    DemoUI.createUI();

    AWTK.run();
  }

  static {
    System.loadLibrary("awtk-jni");
  }

}
