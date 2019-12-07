package awtk;


public enum WidgetProp {
  EXEC (WIDGET_PROP_EXEC()),
  X (WIDGET_PROP_X()),
  Y (WIDGET_PROP_Y()),
  W (WIDGET_PROP_W()),
  H (WIDGET_PROP_H()),
  CANVAS (WIDGET_PROP_CANVAS()),
  LOCALIZE_OPTIONS (WIDGET_PROP_LOCALIZE_OPTIONS()),
  NATIVE_WINDOW (WIDGET_PROP_NATIVE_WINDOW()),
  HIGHLIGHT (WIDGET_PROP_HIGHLIGHT()),
  BAR_SIZE (WIDGET_PROP_BAR_SIZE()),
  OPACITY (WIDGET_PROP_OPACITY()),
  MIN_W (WIDGET_PROP_MIN_W()),
  MAX_W (WIDGET_PROP_MAX_W()),
  CHILDREN_LAYOUT (WIDGET_PROP_CHILDREN_LAYOUT()),
  LAYOUT (WIDGET_PROP_LAYOUT()),
  SELF_LAYOUT (WIDGET_PROP_SELF_LAYOUT()),
  LAYOUT_W (WIDGET_PROP_LAYOUT_W()),
  LAYOUT_H (WIDGET_PROP_LAYOUT_H()),
  VIRTUAL_W (WIDGET_PROP_VIRTUAL_W()),
  VIRTUAL_H (WIDGET_PROP_VIRTUAL_H()),
  NAME (WIDGET_PROP_NAME()),
  TYPE (WIDGET_PROP_TYPE()),
  CLOSABLE (WIDGET_PROP_CLOSABLE()),
  CURSOR (WIDGET_PROP_CURSOR()),
  VALUE (WIDGET_PROP_VALUE()),
  LENGTH (WIDGET_PROP_LENGTH()),
  TEXT (WIDGET_PROP_TEXT()),
  TR_TEXT (WIDGET_PROP_TR_TEXT()),
  STYLE (WIDGET_PROP_STYLE()),
  ENABLE (WIDGET_PROP_ENABLE()),
  FEEDBACK (WIDGET_PROP_FEEDBACK()),
  FLOATING (WIDGET_PROP_FLOATING()),
  MARGIN (WIDGET_PROP_MARGIN()),
  SPACING (WIDGET_PROP_SPACING()),
  LEFT_MARGIN (WIDGET_PROP_LEFT_MARGIN()),
  RIGHT_MARGIN (WIDGET_PROP_RIGHT_MARGIN()),
  TOP_MARGIN (WIDGET_PROP_TOP_MARGIN()),
  BOTTOM_MARGIN (WIDGET_PROP_BOTTOM_MARGIN()),
  STEP (WIDGET_PROP_STEP()),
  VISIBLE (WIDGET_PROP_VISIBLE()),
  SENSITIVE (WIDGET_PROP_SENSITIVE()),
  ANIMATION (WIDGET_PROP_ANIMATION()),
  ANIM_HINT (WIDGET_PROP_ANIM_HINT()),
  FULLSCREEN (WIDGET_PROP_FULLSCREEN()),
  OPEN_ANIM_HINT (WIDGET_PROP_OPEN_ANIM_HINT()),
  CLOSE_ANIM_HINT (WIDGET_PROP_CLOSE_ANIM_HINT()),
  MIN (WIDGET_PROP_MIN()),
  TIPS (WIDGET_PROP_TIPS()),
  INPUT_TYPE (WIDGET_PROP_INPUT_TYPE()),
  READONLY (WIDGET_PROP_READONLY()),
  PASSWORD_VISIBLE (WIDGET_PROP_PASSWORD_VISIBLE()),
  ACTIVE (WIDGET_PROP_ACTIVE()),
  VERTICAL (WIDGET_PROP_VERTICAL()),
  SHOW_TEXT (WIDGET_PROP_SHOW_TEXT()),
  XOFFSET (WIDGET_PROP_XOFFSET()),
  YOFFSET (WIDGET_PROP_YOFFSET()),
  ALIGN_V (WIDGET_PROP_ALIGN_V()),
  ALIGN_H (WIDGET_PROP_ALIGN_H()),
  AUTO_PLAY (WIDGET_PROP_AUTO_PLAY()),
  LOOP (WIDGET_PROP_LOOP()),
  AUTO_FIX (WIDGET_PROP_AUTO_FIX()),
  SELECT_NONE_WHEN_FOCUSED (WIDGET_PROP_SELECT_NONE_WHEN_FOCUSED()),
  OPEN_IM_WHEN_FOCUSED (WIDGET_PROP_OPEN_IM_WHEN_FOCUSED()),
  X_MIN (WIDGET_PROP_X_MIN()),
  X_MAX (WIDGET_PROP_X_MAX()),
  Y_MIN (WIDGET_PROP_Y_MIN()),
  Y_MAX (WIDGET_PROP_Y_MAX()),
  MAX (WIDGET_PROP_MAX()),
  GRAB_KEYS (WIDGET_PROP_GRAB_KEYS()),
  ROW (WIDGET_PROP_ROW()),
  STATE_FOR_STYLE (WIDGET_PROP_STATE_FOR_STYLE()),
  THEME (WIDGET_PROP_THEME()),
  STAGE (WIDGET_PROP_STAGE()),
  IMAGE_MANAGER (WIDGET_PROP_IMAGE_MANAGER()),
  ASSETS_MANAGER (WIDGET_PROP_ASSETS_MANAGER()),
  LOCALE_INFO (WIDGET_PROP_LOCALE_INFO()),
  FONT_MANAGER (WIDGET_PROP_FONT_MANAGER()),
  THEME_OBJ (WIDGET_PROP_THEME_OBJ()),
  DEFAULT_THEME_OBJ (WIDGET_PROP_DEFAULT_THEME_OBJ()),
  ITEM_WIDTH (WIDGET_PROP_ITEM_WIDTH()),
  ITEM_HEIGHT (WIDGET_PROP_ITEM_HEIGHT()),
  DEFAULT_ITEM_HEIGHT (WIDGET_PROP_DEFAULT_ITEM_HEIGHT()),
  XSLIDABLE (WIDGET_PROP_XSLIDABLE()),
  YSLIDABLE (WIDGET_PROP_YSLIDABLE()),
  REPEAT (WIDGET_PROP_REPEAT()),
  ENABLE_LONG_PRESS (WIDGET_PROP_ENABLE_LONG_PRESS()),
  ANIMATABLE (WIDGET_PROP_ANIMATABLE()),
  AUTO_HIDE_SCROLL_BAR (WIDGET_PROP_AUTO_HIDE_SCROLL_BAR()),
  IMAGE (WIDGET_PROP_IMAGE()),
  FORMAT (WIDGET_PROP_FORMAT()),
  DRAW_TYPE (WIDGET_PROP_DRAW_TYPE()),
  SELECTABLE (WIDGET_PROP_SELECTABLE()),
  CLICKABLE (WIDGET_PROP_CLICKABLE()),
  SCALE_X (WIDGET_PROP_SCALE_X()),
  SCALE_Y (WIDGET_PROP_SCALE_Y()),
  ANCHOR_X (WIDGET_PROP_ANCHOR_X()),
  ANCHOR_Y (WIDGET_PROP_ANCHOR_Y()),
  ROTATION (WIDGET_PROP_ROTATION()),
  COMPACT (WIDGET_PROP_COMPACT()),
  SCROLLABLE (WIDGET_PROP_SCROLLABLE()),
  ICON (WIDGET_PROP_ICON()),
  OPTIONS (WIDGET_PROP_OPTIONS()),
  SELECTED (WIDGET_PROP_SELECTED()),
  CHECKED (WIDGET_PROP_CHECKED()),
  ACTIVE_ICON (WIDGET_PROP_ACTIVE_ICON()),
  OPEN_WINDOW (WIDGET_PROP_OPEN_WINDOW()),
  SELECTED_INDEX (WIDGET_PROP_SELECTED_INDEX()),
  CLOSE_WHEN_CLICK (WIDGET_PROP_CLOSE_WHEN_CLICK()),
  CLOSE_WHEN_CLICK_OUTSIDE (WIDGET_PROP_CLOSE_WHEN_CLICK_OUTSIDE()),
  LINE_GAP (WIDGET_PROP_LINE_GAP()),
  BG_COLOR (WIDGET_PROP_BG_COLOR()),
  BORDER_COLOR (WIDGET_PROP_BORDER_COLOR()),
  DELAY (WIDGET_PROP_DELAY()),
  IS_KEYBOARD (WIDGET_PROP_IS_KEYBOARD()),
  FOCUSED (WIDGET_PROP_FOCUSED()),
  FOCUS (WIDGET_PROP_FOCUS()),
  FOCUSABLE (WIDGET_PROP_FOCUSABLE()),
  WITH_FOCUS_STATE (WIDGET_PROP_WITH_FOCUS_STATE()),
  MOVE_FOCUS_PREV_KEY (WIDGET_PROP_MOVE_FOCUS_PREV_KEY()),
  MOVE_FOCUS_NEXT_KEY (WIDGET_PROP_MOVE_FOCUS_NEXT_KEY()),
  MOVE_FOCUS_UP_KEY (WIDGET_PROP_MOVE_FOCUS_UP_KEY()),
  MOVE_FOCUS_DOWN_KEY (WIDGET_PROP_MOVE_FOCUS_DOWN_KEY()),
  MOVE_FOCUS_LEFT_KEY (WIDGET_PROP_MOVE_FOCUS_LEFT_KEY()),
  MOVE_FOCUS_RIGHT_KEY (WIDGET_PROP_MOVE_FOCUS_RIGHT_KEY());
 
   
  private String value;
  WidgetProp(String value) {
    this.value = value;
  }
  public String value() {
    return this.value;
  }

  public static WidgetProp from(String value) {
    for(WidgetProp iter : WidgetProp.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return EXEC;
  }

  static private native String WIDGET_PROP_EXEC();
  static private native String WIDGET_PROP_X();
  static private native String WIDGET_PROP_Y();
  static private native String WIDGET_PROP_W();
  static private native String WIDGET_PROP_H();
  static private native String WIDGET_PROP_CANVAS();
  static private native String WIDGET_PROP_LOCALIZE_OPTIONS();
  static private native String WIDGET_PROP_NATIVE_WINDOW();
  static private native String WIDGET_PROP_HIGHLIGHT();
  static private native String WIDGET_PROP_BAR_SIZE();
  static private native String WIDGET_PROP_OPACITY();
  static private native String WIDGET_PROP_MIN_W();
  static private native String WIDGET_PROP_MAX_W();
  static private native String WIDGET_PROP_CHILDREN_LAYOUT();
  static private native String WIDGET_PROP_LAYOUT();
  static private native String WIDGET_PROP_SELF_LAYOUT();
  static private native String WIDGET_PROP_LAYOUT_W();
  static private native String WIDGET_PROP_LAYOUT_H();
  static private native String WIDGET_PROP_VIRTUAL_W();
  static private native String WIDGET_PROP_VIRTUAL_H();
  static private native String WIDGET_PROP_NAME();
  static private native String WIDGET_PROP_TYPE();
  static private native String WIDGET_PROP_CLOSABLE();
  static private native String WIDGET_PROP_CURSOR();
  static private native String WIDGET_PROP_VALUE();
  static private native String WIDGET_PROP_LENGTH();
  static private native String WIDGET_PROP_TEXT();
  static private native String WIDGET_PROP_TR_TEXT();
  static private native String WIDGET_PROP_STYLE();
  static private native String WIDGET_PROP_ENABLE();
  static private native String WIDGET_PROP_FEEDBACK();
  static private native String WIDGET_PROP_FLOATING();
  static private native String WIDGET_PROP_MARGIN();
  static private native String WIDGET_PROP_SPACING();
  static private native String WIDGET_PROP_LEFT_MARGIN();
  static private native String WIDGET_PROP_RIGHT_MARGIN();
  static private native String WIDGET_PROP_TOP_MARGIN();
  static private native String WIDGET_PROP_BOTTOM_MARGIN();
  static private native String WIDGET_PROP_STEP();
  static private native String WIDGET_PROP_VISIBLE();
  static private native String WIDGET_PROP_SENSITIVE();
  static private native String WIDGET_PROP_ANIMATION();
  static private native String WIDGET_PROP_ANIM_HINT();
  static private native String WIDGET_PROP_FULLSCREEN();
  static private native String WIDGET_PROP_OPEN_ANIM_HINT();
  static private native String WIDGET_PROP_CLOSE_ANIM_HINT();
  static private native String WIDGET_PROP_MIN();
  static private native String WIDGET_PROP_TIPS();
  static private native String WIDGET_PROP_INPUT_TYPE();
  static private native String WIDGET_PROP_READONLY();
  static private native String WIDGET_PROP_PASSWORD_VISIBLE();
  static private native String WIDGET_PROP_ACTIVE();
  static private native String WIDGET_PROP_VERTICAL();
  static private native String WIDGET_PROP_SHOW_TEXT();
  static private native String WIDGET_PROP_XOFFSET();
  static private native String WIDGET_PROP_YOFFSET();
  static private native String WIDGET_PROP_ALIGN_V();
  static private native String WIDGET_PROP_ALIGN_H();
  static private native String WIDGET_PROP_AUTO_PLAY();
  static private native String WIDGET_PROP_LOOP();
  static private native String WIDGET_PROP_AUTO_FIX();
  static private native String WIDGET_PROP_SELECT_NONE_WHEN_FOCUSED();
  static private native String WIDGET_PROP_OPEN_IM_WHEN_FOCUSED();
  static private native String WIDGET_PROP_X_MIN();
  static private native String WIDGET_PROP_X_MAX();
  static private native String WIDGET_PROP_Y_MIN();
  static private native String WIDGET_PROP_Y_MAX();
  static private native String WIDGET_PROP_MAX();
  static private native String WIDGET_PROP_GRAB_KEYS();
  static private native String WIDGET_PROP_ROW();
  static private native String WIDGET_PROP_STATE_FOR_STYLE();
  static private native String WIDGET_PROP_THEME();
  static private native String WIDGET_PROP_STAGE();
  static private native String WIDGET_PROP_IMAGE_MANAGER();
  static private native String WIDGET_PROP_ASSETS_MANAGER();
  static private native String WIDGET_PROP_LOCALE_INFO();
  static private native String WIDGET_PROP_FONT_MANAGER();
  static private native String WIDGET_PROP_THEME_OBJ();
  static private native String WIDGET_PROP_DEFAULT_THEME_OBJ();
  static private native String WIDGET_PROP_ITEM_WIDTH();
  static private native String WIDGET_PROP_ITEM_HEIGHT();
  static private native String WIDGET_PROP_DEFAULT_ITEM_HEIGHT();
  static private native String WIDGET_PROP_XSLIDABLE();
  static private native String WIDGET_PROP_YSLIDABLE();
  static private native String WIDGET_PROP_REPEAT();
  static private native String WIDGET_PROP_ENABLE_LONG_PRESS();
  static private native String WIDGET_PROP_ANIMATABLE();
  static private native String WIDGET_PROP_AUTO_HIDE_SCROLL_BAR();
  static private native String WIDGET_PROP_IMAGE();
  static private native String WIDGET_PROP_FORMAT();
  static private native String WIDGET_PROP_DRAW_TYPE();
  static private native String WIDGET_PROP_SELECTABLE();
  static private native String WIDGET_PROP_CLICKABLE();
  static private native String WIDGET_PROP_SCALE_X();
  static private native String WIDGET_PROP_SCALE_Y();
  static private native String WIDGET_PROP_ANCHOR_X();
  static private native String WIDGET_PROP_ANCHOR_Y();
  static private native String WIDGET_PROP_ROTATION();
  static private native String WIDGET_PROP_COMPACT();
  static private native String WIDGET_PROP_SCROLLABLE();
  static private native String WIDGET_PROP_ICON();
  static private native String WIDGET_PROP_OPTIONS();
  static private native String WIDGET_PROP_SELECTED();
  static private native String WIDGET_PROP_CHECKED();
  static private native String WIDGET_PROP_ACTIVE_ICON();
  static private native String WIDGET_PROP_OPEN_WINDOW();
  static private native String WIDGET_PROP_SELECTED_INDEX();
  static private native String WIDGET_PROP_CLOSE_WHEN_CLICK();
  static private native String WIDGET_PROP_CLOSE_WHEN_CLICK_OUTSIDE();
  static private native String WIDGET_PROP_LINE_GAP();
  static private native String WIDGET_PROP_BG_COLOR();
  static private native String WIDGET_PROP_BORDER_COLOR();
  static private native String WIDGET_PROP_DELAY();
  static private native String WIDGET_PROP_IS_KEYBOARD();
  static private native String WIDGET_PROP_FOCUSED();
  static private native String WIDGET_PROP_FOCUS();
  static private native String WIDGET_PROP_FOCUSABLE();
  static private native String WIDGET_PROP_WITH_FOCUS_STATE();
  static private native String WIDGET_PROP_MOVE_FOCUS_PREV_KEY();
  static private native String WIDGET_PROP_MOVE_FOCUS_NEXT_KEY();
  static private native String WIDGET_PROP_MOVE_FOCUS_UP_KEY();
  static private native String WIDGET_PROP_MOVE_FOCUS_DOWN_KEY();
  static private native String WIDGET_PROP_MOVE_FOCUS_LEFT_KEY();
  static private native String WIDGET_PROP_MOVE_FOCUS_RIGHT_KEY();

}
