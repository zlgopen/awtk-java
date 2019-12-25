import awtk.*;

public class DemoBasic extends App {
  static class OnClicked extends TOnEvent {
    @Override
    public TRet onEvent(TEvent evt) {
      TWidget target = TWidget.cast(evt.getTarget());
      String name = target.getName();

      System.out.println(name + " clicked");
      if(name.startsWith("open:")) {
        String winName = name.substring(5);
        DemoBasic.openWindow(winName);
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

  @Override
  public void createUI() {
    TWindow.open("system_bar");

    DemoBasic.openWindow("main");
  }

  public static void main(String[] args) {
    (new DemoBasic()).start(args);
  }
}
