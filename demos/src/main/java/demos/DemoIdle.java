import awtk.*;

public class DemoIdle extends App {
  @Override
  public void createUI() {
    TWidget win = TWindow.createDefault();
    TWidget text = TLabel.create(win, 0, 0, 0, 0);

    text.setSelfLayout("default(x=c,y=m,w=100%,h=30)");
    text.setText("Hello World");

    TIdle.add(new TPrintOnIdle(), 0);
  }

  public static void main(String[] args) {
    (new DemoIdle()).start(args);
  }
}
