package awtk;

public class PrintOnIdle extends OnIdle {
   public Ret onIdle(IdleInfo info) {
      System.out.println("OnIdle");
      
      return Ret.REPEAT;
    }
}

