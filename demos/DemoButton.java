import awtk.*;

class DemoButton {
 public static void main(String[] args) {
   AWTK.init(320, 480, TAppType.SIMULATOR);

   TWidget win = TWindow.createDefault();
   TWidget button = TButton.create(win, 10, 0, 0, 0);
   
   button.setName("OK");
   button.setText("OK");
   button.setSelfLayout("default(x=c,y=m,w=200,h=40)");
   button.on(TEventType.CLICK, new TPrintOnClicked(), 0);

   AWTK.run();
 }

 static {
  System.out.println("loadLibrary:");
  System.loadLibrary("awtk-jni");
  System.out.println("loadLibrary done");
 }
 
}
