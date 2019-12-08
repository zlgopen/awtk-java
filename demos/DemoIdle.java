import awtk.*;

class DemoIdle {
 public static void main(String[] args) {
   AWTK.init(320, 480, AppType.SIMULATOR);

   Widget win = Window.create(null, 0, 0, 0, 0);
   Widget text = Label.create(win, 0, 0, 0, 0);
   text.setSelfLayout("default(x=c,y=m,w=100%,h=30)");
   text.setText("Hello World");

   Idle.add(new PrintOnIdle(), 0);

   AWTK.run();
 }

 static {
   System.loadLibrary("awtk-jni");
 }
 
}
