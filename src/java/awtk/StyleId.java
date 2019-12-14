package awtk;


public enum StyleId {
  _ID_BG_COLOR (STYLE_ID_BG_COLOR()),
  _ID_FG_COLOR (STYLE_ID_FG_COLOR()),
  _ID_MASK_COLOR (STYLE_ID_MASK_COLOR()),
  _ID_FONT_NAME (STYLE_ID_FONT_NAME()),
  _ID_FONT_SIZE (STYLE_ID_FONT_SIZE()),
  _ID_FONT_STYLE (STYLE_ID_FONT_STYLE()),
  _ID_TEXT_COLOR (STYLE_ID_TEXT_COLOR()),
  _ID_TIPS_TEXT_COLOR (STYLE_ID_TIPS_TEXT_COLOR()),
  _ID_TEXT_ALIGN_H (STYLE_ID_TEXT_ALIGN_H()),
  _ID_TEXT_ALIGN_V (STYLE_ID_TEXT_ALIGN_V()),
  _ID_BORDER_COLOR (STYLE_ID_BORDER_COLOR()),
  _ID_BORDER_WIDTH (STYLE_ID_BORDER_WIDTH()),
  _ID_BORDER (STYLE_ID_BORDER()),
  _ID_BG_IMAGE (STYLE_ID_BG_IMAGE()),
  _ID_BG_IMAGE_DRAW_TYPE (STYLE_ID_BG_IMAGE_DRAW_TYPE()),
  _ID_ICON (STYLE_ID_ICON()),
  _ID_FG_IMAGE (STYLE_ID_FG_IMAGE()),
  _ID_FG_IMAGE_DRAW_TYPE (STYLE_ID_FG_IMAGE_DRAW_TYPE()),
  _ID_SPACER (STYLE_ID_SPACER()),
  _ID_MARGIN (STYLE_ID_MARGIN()),
  _ID_MARGIN_LEFT (STYLE_ID_MARGIN_LEFT()),
  _ID_MARGIN_RIGHT (STYLE_ID_MARGIN_RIGHT()),
  _ID_MARGIN_TOP (STYLE_ID_MARGIN_TOP()),
  _ID_MARGIN_BOTTOM (STYLE_ID_MARGIN_BOTTOM()),
  _ID_ICON_AT (STYLE_ID_ICON_AT()),
  _ID_ACTIVE_ICON (STYLE_ID_ACTIVE_ICON()),
  _ID_X_OFFSET (STYLE_ID_X_OFFSET()),
  _ID_Y_OFFSET (STYLE_ID_Y_OFFSET()),
  _ID_SELECTED_BG_COLOR (STYLE_ID_SELECTED_BG_COLOR()),
  _ID_SELECTED_FG_COLOR (STYLE_ID_SELECTED_FG_COLOR()),
  _ID_SELECTED_TEXT_COLOR (STYLE_ID_SELECTED_TEXT_COLOR()),
  _ID_ROUND_RADIUS (STYLE_ID_ROUND_RADIUS()),
  _ID_CHILDREN_LAYOUT (STYLE_ID_CHILDREN_LAYOUT()),
  _ID_SELF_LAYOUT (STYLE_ID_SELF_LAYOUT());
 
   
  private String value;
  StyleId(String value) {
    this.value = value;
  }
  public String value() {
    return this.value;
  }

  public static StyleId from(String value) {
    for(StyleId iter : StyleId.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return _ID_BG_COLOR;
  }

  static private native String STYLE_ID_BG_COLOR();
  static private native String STYLE_ID_FG_COLOR();
  static private native String STYLE_ID_MASK_COLOR();
  static private native String STYLE_ID_FONT_NAME();
  static private native String STYLE_ID_FONT_SIZE();
  static private native String STYLE_ID_FONT_STYLE();
  static private native String STYLE_ID_TEXT_COLOR();
  static private native String STYLE_ID_TIPS_TEXT_COLOR();
  static private native String STYLE_ID_TEXT_ALIGN_H();
  static private native String STYLE_ID_TEXT_ALIGN_V();
  static private native String STYLE_ID_BORDER_COLOR();
  static private native String STYLE_ID_BORDER_WIDTH();
  static private native String STYLE_ID_BORDER();
  static private native String STYLE_ID_BG_IMAGE();
  static private native String STYLE_ID_BG_IMAGE_DRAW_TYPE();
  static private native String STYLE_ID_ICON();
  static private native String STYLE_ID_FG_IMAGE();
  static private native String STYLE_ID_FG_IMAGE_DRAW_TYPE();
  static private native String STYLE_ID_SPACER();
  static private native String STYLE_ID_MARGIN();
  static private native String STYLE_ID_MARGIN_LEFT();
  static private native String STYLE_ID_MARGIN_RIGHT();
  static private native String STYLE_ID_MARGIN_TOP();
  static private native String STYLE_ID_MARGIN_BOTTOM();
  static private native String STYLE_ID_ICON_AT();
  static private native String STYLE_ID_ACTIVE_ICON();
  static private native String STYLE_ID_X_OFFSET();
  static private native String STYLE_ID_Y_OFFSET();
  static private native String STYLE_ID_SELECTED_BG_COLOR();
  static private native String STYLE_ID_SELECTED_FG_COLOR();
  static private native String STYLE_ID_SELECTED_TEXT_COLOR();
  static private native String STYLE_ID_ROUND_RADIUS();
  static private native String STYLE_ID_CHILDREN_LAYOUT();
  static private native String STYLE_ID_SELF_LAYOUT();

}
