package awtk;


public enum WidgetType {
  NONE (WIDGET_TYPE_NONE()),
  WINDOW_MANAGER (WIDGET_TYPE_WINDOW_MANAGER()),
  NORMAL_WINDOW (WIDGET_TYPE_NORMAL_WINDOW()),
  OVERLAY (WIDGET_TYPE_OVERLAY()),
  TOOL_BAR (WIDGET_TYPE_TOOL_BAR()),
  DIALOG (WIDGET_TYPE_DIALOG()),
  POPUP (WIDGET_TYPE_POPUP()),
  SYSTEM_BAR (WIDGET_TYPE_SYSTEM_BAR()),
  SYSTEM_BAR_BOTTOM (WIDGET_TYPE_SYSTEM_BAR_BOTTOM()),
  SPRITE (WIDGET_TYPE_SPRITE()),
  KEYBOARD (WIDGET_TYPE_KEYBOARD()),
  DND (WIDGET_TYPE_DND()),
  LABEL (WIDGET_TYPE_LABEL()),
  BUTTON (WIDGET_TYPE_BUTTON()),
  IMAGE (WIDGET_TYPE_IMAGE()),
  EDIT (WIDGET_TYPE_EDIT()),
  PROGRESS_BAR (WIDGET_TYPE_PROGRESS_BAR()),
  GROUP_BOX (WIDGET_TYPE_GROUP_BOX()),
  CHECK_BUTTON (WIDGET_TYPE_CHECK_BUTTON()),
  RADIO_BUTTON (WIDGET_TYPE_RADIO_BUTTON()),
  DIALOG_TITLE (WIDGET_TYPE_DIALOG_TITLE()),
  DIALOG_CLIENT (WIDGET_TYPE_DIALOG_CLIENT()),
  SLIDER (WIDGET_TYPE_SLIDER()),
  VIEW (WIDGET_TYPE_VIEW()),
  COMBO_BOX (WIDGET_TYPE_COMBO_BOX()),
  COMBO_BOX_ITEM (WIDGET_TYPE_COMBO_BOX_ITEM()),
  SLIDE_VIEW (WIDGET_TYPE_SLIDE_VIEW()),
  SLIDE_INDICATOR (WIDGET_TYPE_SLIDE_INDICATOR()),
  SLIDE_INDICATOR_ARC (WIDGET_TYPE_SLIDE_INDICATOR_ARC()),
  PAGES (WIDGET_TYPE_PAGES()),
  TAB_BUTTON (WIDGET_TYPE_TAB_BUTTON()),
  TAB_CONTROL (WIDGET_TYPE_TAB_CONTROL()),
  TAB_BUTTON_GROUP (WIDGET_TYPE_TAB_BUTTON_GROUP()),
  BUTTON_GROUP (WIDGET_TYPE_BUTTON_GROUP()),
  CANDIDATES (WIDGET_TYPE_CANDIDATES()),
  SPIN_BOX (WIDGET_TYPE_SPIN_BOX()),
  DRAGGER (WIDGET_TYPE_DRAGGER()),
  SCROLL_BAR (WIDGET_TYPE_SCROLL_BAR()),
  SCROLL_BAR_DESKTOP (WIDGET_TYPE_SCROLL_BAR_DESKTOP()),
  SCROLL_BAR_MOBILE (WIDGET_TYPE_SCROLL_BAR_MOBILE()),
  SCROLL_VIEW (WIDGET_TYPE_SCROLL_VIEW()),
  LIST_VIEW (WIDGET_TYPE_LIST_VIEW()),
  LIST_VIEW_H (WIDGET_TYPE_LIST_VIEW_H()),
  LIST_ITEM (WIDGET_TYPE_LIST_ITEM()),
  COLOR_PICKER (WIDGET_TYPE_COLOR_PICKER()),
  COLOR_COMPONENT (WIDGET_TYPE_COLOR_COMPONENT()),
  COLOR_TILE (WIDGET_TYPE_COLOR_TILE()),
  CLIP_VIEW (WIDGET_TYPE_CLIP_VIEW()),
  RICH_TEXT (WIDGET_TYPE_RICH_TEXT()),
  APP_BAR (WIDGET_TYPE_APP_BAR()),
  GRID (WIDGET_TYPE_GRID()),
  GRID_ITEM (WIDGET_TYPE_GRID_ITEM()),
  ROW (WIDGET_TYPE_ROW()),
  COLUMN (WIDGET_TYPE_COLUMN()),
  CALIBRATION_WIN (WIDGET_TYPE_CALIBRATION_WIN());
 
   
  private String value;
  WidgetType(String value) {
    this.value = value;
  }
  public String value() {
    return this.value;
  }

  public static WidgetType from(String value) {
    for(WidgetType iter : WidgetType.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return NONE;
  }

  static private native String WIDGET_TYPE_NONE();
  static private native String WIDGET_TYPE_WINDOW_MANAGER();
  static private native String WIDGET_TYPE_NORMAL_WINDOW();
  static private native String WIDGET_TYPE_OVERLAY();
  static private native String WIDGET_TYPE_TOOL_BAR();
  static private native String WIDGET_TYPE_DIALOG();
  static private native String WIDGET_TYPE_POPUP();
  static private native String WIDGET_TYPE_SYSTEM_BAR();
  static private native String WIDGET_TYPE_SYSTEM_BAR_BOTTOM();
  static private native String WIDGET_TYPE_SPRITE();
  static private native String WIDGET_TYPE_KEYBOARD();
  static private native String WIDGET_TYPE_DND();
  static private native String WIDGET_TYPE_LABEL();
  static private native String WIDGET_TYPE_BUTTON();
  static private native String WIDGET_TYPE_IMAGE();
  static private native String WIDGET_TYPE_EDIT();
  static private native String WIDGET_TYPE_PROGRESS_BAR();
  static private native String WIDGET_TYPE_GROUP_BOX();
  static private native String WIDGET_TYPE_CHECK_BUTTON();
  static private native String WIDGET_TYPE_RADIO_BUTTON();
  static private native String WIDGET_TYPE_DIALOG_TITLE();
  static private native String WIDGET_TYPE_DIALOG_CLIENT();
  static private native String WIDGET_TYPE_SLIDER();
  static private native String WIDGET_TYPE_VIEW();
  static private native String WIDGET_TYPE_COMBO_BOX();
  static private native String WIDGET_TYPE_COMBO_BOX_ITEM();
  static private native String WIDGET_TYPE_SLIDE_VIEW();
  static private native String WIDGET_TYPE_SLIDE_INDICATOR();
  static private native String WIDGET_TYPE_SLIDE_INDICATOR_ARC();
  static private native String WIDGET_TYPE_PAGES();
  static private native String WIDGET_TYPE_TAB_BUTTON();
  static private native String WIDGET_TYPE_TAB_CONTROL();
  static private native String WIDGET_TYPE_TAB_BUTTON_GROUP();
  static private native String WIDGET_TYPE_BUTTON_GROUP();
  static private native String WIDGET_TYPE_CANDIDATES();
  static private native String WIDGET_TYPE_SPIN_BOX();
  static private native String WIDGET_TYPE_DRAGGER();
  static private native String WIDGET_TYPE_SCROLL_BAR();
  static private native String WIDGET_TYPE_SCROLL_BAR_DESKTOP();
  static private native String WIDGET_TYPE_SCROLL_BAR_MOBILE();
  static private native String WIDGET_TYPE_SCROLL_VIEW();
  static private native String WIDGET_TYPE_LIST_VIEW();
  static private native String WIDGET_TYPE_LIST_VIEW_H();
  static private native String WIDGET_TYPE_LIST_ITEM();
  static private native String WIDGET_TYPE_COLOR_PICKER();
  static private native String WIDGET_TYPE_COLOR_COMPONENT();
  static private native String WIDGET_TYPE_COLOR_TILE();
  static private native String WIDGET_TYPE_CLIP_VIEW();
  static private native String WIDGET_TYPE_RICH_TEXT();
  static private native String WIDGET_TYPE_APP_BAR();
  static private native String WIDGET_TYPE_GRID();
  static private native String WIDGET_TYPE_GRID_ITEM();
  static private native String WIDGET_TYPE_ROW();
  static private native String WIDGET_TYPE_COLUMN();
  static private native String WIDGET_TYPE_CALIBRATION_WIN();

}
