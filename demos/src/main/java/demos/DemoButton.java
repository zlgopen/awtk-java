import awtk.*;

public class DemoButton extends App {
  @Override
  public void createUI() {
    TWidget win = TWindow.createDefault();
    TWidget button = TButton.create(win, 10, 0, 0, 0);

    button.setName("quit");
    button.setText("Quit");
    button.setSelfLayout("default(x=c,y=m,w=200,h=40)");

    button.on(TEventType.CLICK.value(), new TOnEvent() {
      @Override
      public TRet onEvent(TEvent evt) {
        System.out.println("OnClick");
        TGlobal.quit();
        return TRet.OK;
      }
    }, 0);
  }

  public static void main(String[] args) {
    (new DemoButton()).start(args);
  }
}
