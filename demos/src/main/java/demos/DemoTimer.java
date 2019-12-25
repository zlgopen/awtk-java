import awtk.*;

public class DemoTimer extends App {
  @Override
  public void createUI() {
    TWidget win = TWindow.createDefault();
    TWidget text = TLabel.create(win, 0, 0, 0, 0);
    text.setSelfLayout("default(x=c,y=m,w=100%,h=30)");
    text.setText("Hello World");

    TTimer.add(new TPrintOnTimer(), 0, 1000);
  }

  public static void main(String[] args) {
    (new DemoTimer()).start(args);
  }
}
