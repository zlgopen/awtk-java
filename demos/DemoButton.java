import awtk.*;

class DemoButton {
 public static void main(String[] args) {
   AWTK.init(320, 480, 0);

   Widget win = Window.create(null, 0, 0, 0, 0);
   Widget button = Button.create(win, 10, 10, 100, 30);
   button.setName("OK");
   button.setText("OK");
   button.on(EventType.CLICK, new PrintOnClicked(), 0);

   AWTK.run();
 }

 static {
   System.loadLibrary("awtk-jni");
 }
 
}
