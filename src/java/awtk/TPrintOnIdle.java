package awtk;

public class TPrintOnIdle extends TOnIdle {
   public TRet onIdle(TIdleInfo info) {
      System.out.println("OnIdle");
      
      return TRet.REPEAT;
    }
}

