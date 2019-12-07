package awtk;


public enum EventType {
  POINTER_DOWN (EVT_POINTER_DOWN()),
  POINTER_DOWN_BEFORE_CHILDREN (EVT_POINTER_DOWN_BEFORE_CHILDREN()),
  POINTER_MOVE (EVT_POINTER_MOVE()),
  POINTER_MOVE_BEFORE_CHILDREN (EVT_POINTER_MOVE_BEFORE_CHILDREN()),
  POINTER_UP (EVT_POINTER_UP()),
  POINTER_UP_BEFORE_CHILDREN (EVT_POINTER_UP_BEFORE_CHILDREN()),
  WHEEL (EVT_WHEEL()),
  WHEEL_BEFORE_CHILDREN (EVT_WHEEL_BEFORE_CHILDREN()),
  POINTER_DOWN_ABORT (EVT_POINTER_DOWN_ABORT()),
  CONTEXT_MENU (EVT_CONTEXT_MENU()),
  POINTER_ENTER (EVT_POINTER_ENTER()),
  POINTER_LEAVE (EVT_POINTER_LEAVE()),
  LONG_PRESS (EVT_LONG_PRESS()),
  CLICK (EVT_CLICK()),
  FOCUS (EVT_FOCUS()),
  BLUR (EVT_BLUR()),
  KEY_DOWN (EVT_KEY_DOWN()),
  KEY_DOWN_BEFORE_CHILDREN (EVT_KEY_DOWN_BEFORE_CHILDREN()),
  KEY_REPEAT (EVT_KEY_REPEAT()),
  KEY_UP (EVT_KEY_UP()),
  KEY_UP_BEFORE_CHILDREN (EVT_KEY_UP_BEFORE_CHILDREN()),
  WILL_MOVE (EVT_WILL_MOVE()),
  MOVE (EVT_MOVE()),
  WILL_RESIZE (EVT_WILL_RESIZE()),
  RESIZE (EVT_RESIZE()),
  WILL_MOVE_RESIZE (EVT_WILL_MOVE_RESIZE()),
  MOVE_RESIZE (EVT_MOVE_RESIZE()),
  VALUE_WILL_CHANGE (EVT_VALUE_WILL_CHANGE()),
  VALUE_CHANGED (EVT_VALUE_CHANGED()),
  VALUE_CHANGING (EVT_VALUE_CHANGING()),
  PAINT (EVT_PAINT()),
  BEFORE_PAINT (EVT_BEFORE_PAINT()),
  AFTER_PAINT (EVT_AFTER_PAINT()),
  PAINT_DONE (EVT_PAINT_DONE()),
  LOCALE_CHANGED (EVT_LOCALE_CHANGED()),
  ANIM_START (EVT_ANIM_START()),
  ANIM_STOP (EVT_ANIM_STOP()),
  ANIM_PAUSE (EVT_ANIM_PAUSE()),
  ANIM_ONCE (EVT_ANIM_ONCE()),
  ANIM_END (EVT_ANIM_END()),
  WINDOW_LOAD (EVT_WINDOW_LOAD()),
  WINDOW_WILL_OPEN (EVT_WINDOW_WILL_OPEN()),
  WINDOW_OPEN (EVT_WINDOW_OPEN()),
  WINDOW_TO_BACKGROUND (EVT_WINDOW_TO_BACKGROUND()),
  WINDOW_TO_FOREGROUND (EVT_WINDOW_TO_FOREGROUND()),
  WINDOW_CLOSE (EVT_WINDOW_CLOSE()),
  REQUEST_CLOSE_WINDOW (EVT_REQUEST_CLOSE_WINDOW()),
  TOP_WINDOW_CHANGED (EVT_TOP_WINDOW_CHANGED()),
  IM_COMMIT (EVT_IM_COMMIT()),
  IM_SHOW_CANDIDATES (EVT_IM_SHOW_CANDIDATES()),
  IM_ACTION (EVT_IM_ACTION()),
  IM_ACTION_INFO (EVT_IM_ACTION_INFO()),
  DRAG_START (EVT_DRAG_START()),
  DRAG (EVT_DRAG()),
  DRAG_END (EVT_DRAG_END()),
  SCREEN_SAVER (EVT_SCREEN_SAVER()),
  LOW_MEMORY (EVT_LOW_MEMORY()),
  OUT_OF_MEMORY (EVT_OUT_OF_MEMORY()),
  ORIENTATION_WILL_CHANGED (EVT_ORIENTATION_WILL_CHANGED()),
  ORIENTATION_CHANGED (EVT_ORIENTATION_CHANGED()),
  WIDGET_CREATED (EVT_WIDGET_CREATED()),
  REQUEST_QUIT_APP (EVT_REQUEST_QUIT_APP()),
  THEME_CHANGED (EVT_THEME_CHANGED()),
  REQ_START (EVT_REQ_START()),
  USER_START (EVT_USER_START()),
  NONE (EVT_NONE()),
  PROP_WILL_CHANGE (EVT_PROP_WILL_CHANGE()),
  PROP_CHANGED (EVT_PROP_CHANGED()),
  ITEMS_WILL_CHANGE (EVT_ITEMS_WILL_CHANGE()),
  ITEMS_CHANGED (EVT_ITEMS_CHANGED()),
  PROPS_CHANGED (EVT_PROPS_CHANGED()),
  PROGRESS (EVT_PROGRESS()),
  DESTROY (EVT_DESTROY());
 
   
  private int value;
  EventType(int value) {
    this.value = value;
  }
  public int value() {
    return this.value;
  }

  public static EventType from(int value) {
    for(EventType iter : EventType.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return POINTER_DOWN;
  }

  static private native int EVT_POINTER_DOWN();
  static private native int EVT_POINTER_DOWN_BEFORE_CHILDREN();
  static private native int EVT_POINTER_MOVE();
  static private native int EVT_POINTER_MOVE_BEFORE_CHILDREN();
  static private native int EVT_POINTER_UP();
  static private native int EVT_POINTER_UP_BEFORE_CHILDREN();
  static private native int EVT_WHEEL();
  static private native int EVT_WHEEL_BEFORE_CHILDREN();
  static private native int EVT_POINTER_DOWN_ABORT();
  static private native int EVT_CONTEXT_MENU();
  static private native int EVT_POINTER_ENTER();
  static private native int EVT_POINTER_LEAVE();
  static private native int EVT_LONG_PRESS();
  static private native int EVT_CLICK();
  static private native int EVT_FOCUS();
  static private native int EVT_BLUR();
  static private native int EVT_KEY_DOWN();
  static private native int EVT_KEY_DOWN_BEFORE_CHILDREN();
  static private native int EVT_KEY_REPEAT();
  static private native int EVT_KEY_UP();
  static private native int EVT_KEY_UP_BEFORE_CHILDREN();
  static private native int EVT_WILL_MOVE();
  static private native int EVT_MOVE();
  static private native int EVT_WILL_RESIZE();
  static private native int EVT_RESIZE();
  static private native int EVT_WILL_MOVE_RESIZE();
  static private native int EVT_MOVE_RESIZE();
  static private native int EVT_VALUE_WILL_CHANGE();
  static private native int EVT_VALUE_CHANGED();
  static private native int EVT_VALUE_CHANGING();
  static private native int EVT_PAINT();
  static private native int EVT_BEFORE_PAINT();
  static private native int EVT_AFTER_PAINT();
  static private native int EVT_PAINT_DONE();
  static private native int EVT_LOCALE_CHANGED();
  static private native int EVT_ANIM_START();
  static private native int EVT_ANIM_STOP();
  static private native int EVT_ANIM_PAUSE();
  static private native int EVT_ANIM_ONCE();
  static private native int EVT_ANIM_END();
  static private native int EVT_WINDOW_LOAD();
  static private native int EVT_WINDOW_WILL_OPEN();
  static private native int EVT_WINDOW_OPEN();
  static private native int EVT_WINDOW_TO_BACKGROUND();
  static private native int EVT_WINDOW_TO_FOREGROUND();
  static private native int EVT_WINDOW_CLOSE();
  static private native int EVT_REQUEST_CLOSE_WINDOW();
  static private native int EVT_TOP_WINDOW_CHANGED();
  static private native int EVT_IM_COMMIT();
  static private native int EVT_IM_SHOW_CANDIDATES();
  static private native int EVT_IM_ACTION();
  static private native int EVT_IM_ACTION_INFO();
  static private native int EVT_DRAG_START();
  static private native int EVT_DRAG();
  static private native int EVT_DRAG_END();
  static private native int EVT_SCREEN_SAVER();
  static private native int EVT_LOW_MEMORY();
  static private native int EVT_OUT_OF_MEMORY();
  static private native int EVT_ORIENTATION_WILL_CHANGED();
  static private native int EVT_ORIENTATION_CHANGED();
  static private native int EVT_WIDGET_CREATED();
  static private native int EVT_REQUEST_QUIT_APP();
  static private native int EVT_THEME_CHANGED();
  static private native int EVT_REQ_START();
  static private native int EVT_USER_START();
  static private native int EVT_NONE();
  static private native int EVT_PROP_WILL_CHANGE();
  static private native int EVT_PROP_CHANGED();
  static private native int EVT_ITEMS_WILL_CHANGE();
  static private native int EVT_ITEMS_CHANGED();
  static private native int EVT_PROPS_CHANGED();
  static private native int EVT_PROGRESS();
  static private native int EVT_DESTROY();

}
