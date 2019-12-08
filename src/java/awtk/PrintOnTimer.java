package awtk;

public class PrintOnTimer extends OnTimer {
   public Ret onTimer(TimerInfo info) {
      System.out.println("OnTimer");
      
      return Ret.REPEAT;
    }
}

