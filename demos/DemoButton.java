import awtk.*;

class DemoButton {
 public static void main(String[] args) {
   AWTK.init(320, 480, AppType.SIMULATOR);

   Widget win = Window.create(null, 0, 0, 0, 0);
   Widget button = Button.create(win, 10, 0, 0, 0);
   
   button.setName("OK");
   button.setText("OK");
   button.setSelfLayout("default(x=c,y=m,w=200,h=40)");
   button.on(EventType.CLICK, new PrintOnClicked(), 0);

   AWTK.run();
 }

 static {
   System.loadLibrary("awtk-jni");
 }
 
}
