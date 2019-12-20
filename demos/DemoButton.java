import awtk.*;

class DemoButton {
 public static void main(String[] args) {
   int w = 320;
   int h = 480;

   if(args.length > 0) {
     w = Integer.parseInt(args[0]);
   }
   
   if(args.length > 1) {
     h = Integer.parseInt(args[1]);
   }

   AWTK.init(w, h, TAppType.SIMULATOR);

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
