package awtk;

public class TPrintOnTimer extends TOnTimer {
   public TRet onTimer(TTimerInfo info) {
      System.out.println("OnTimer");
      
      return TRet.REPEAT;
    }
}

