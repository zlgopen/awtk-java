package awtk;

public class TPrintOnClicked extends TOnEvent {
   public TRet onEvent(TEvent evt) {
      TPointerEvent e = TPointerEvent.cast(evt);
      TWidget widget = TWidget.cast(e.getTarget());

      System.out.println("clicked on " + widget.getName() + " at(" + e.getX() + "," + e.getY() + ")");

      return TRet.OK;
    }
}

