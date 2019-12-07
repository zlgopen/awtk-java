package awtk;

public class PrintOnClicked implements OnEvent {
   public Ret onEvent(long evt) {
      PointerEvent e = PointerEvent.cast(evt);
      Widget widget = Widget.cast(e.getTarget());

      System.out.println("clicked on " + widget.getName() + " at(" + e.getX() + "," + e.getY() + ")");

      return Ret.OK;
    }
}

