package awtk;



/**
 * style常量定义。
 *
 */

public enum TStyleId {
  
  /**
   * 背景颜色。
   *
   */
 
  _ID_BG_COLOR (STYLE_ID_BG_COLOR()),
  
  /**
   * 前景颜色。
   *
   */
 
  _ID_FG_COLOR (STYLE_ID_FG_COLOR()),
  
  /**
   * 蒙版颜色。
   *
   */
 
  _ID_MASK_COLOR (STYLE_ID_MASK_COLOR()),
  
  /**
   * 字体名称。
   *
   */
 
  _ID_FONT_NAME (STYLE_ID_FONT_NAME()),
  
  /**
   * 字体大小。
   *
   */
 
  _ID_FONT_SIZE (STYLE_ID_FONT_SIZE()),
  
  /**
   * 字体风格(粗体、斜体等)。
   *
   */
 
  _ID_FONT_STYLE (STYLE_ID_FONT_STYLE()),
  
  /**
   * 文本颜色。
   *
   */
 
  _ID_TEXT_COLOR (STYLE_ID_TEXT_COLOR()),
  
  /**
   * 提示文本颜色。
   *
   */
 
  _ID_TIPS_TEXT_COLOR (STYLE_ID_TIPS_TEXT_COLOR()),
  
  /**
   * 文本水平对齐的方式。
   *
   */
 
  _ID_TEXT_ALIGN_H (STYLE_ID_TEXT_ALIGN_H()),
  
  /**
   * 文本垂直对齐的方式。
   *
   */
 
  _ID_TEXT_ALIGN_V (STYLE_ID_TEXT_ALIGN_V()),
  
  /**
   * 边框颜色。
   *
   */
 
  _ID_BORDER_COLOR (STYLE_ID_BORDER_COLOR()),
  
  /**
   * 边框线宽。
   *
   */
 
  _ID_BORDER_WIDTH (STYLE_ID_BORDER_WIDTH()),
  
  /**
   * 边框类型。
   *
   */
 
  _ID_BORDER (STYLE_ID_BORDER()),
  
  /**
   * 图片的名称。
   *
   */
 
  _ID_BG_IMAGE (STYLE_ID_BG_IMAGE()),
  
  /**
   * 图片的显示方式。
   *
   */
 
  _ID_BG_IMAGE_DRAW_TYPE (STYLE_ID_BG_IMAGE_DRAW_TYPE()),
  
  /**
   * 图标的名称。
   *
   */
 
  _ID_ICON (STYLE_ID_ICON()),
  
  /**
   * 图片的名称。
   *
   */
 
  _ID_FG_IMAGE (STYLE_ID_FG_IMAGE()),
  
  /**
   * 图片的显示方式。
   *
   */
 
  _ID_FG_IMAGE_DRAW_TYPE (STYLE_ID_FG_IMAGE_DRAW_TYPE()),
  
  /**
   * 间距。
   *
   */
 
  _ID_SPACER (STYLE_ID_SPACER()),
  
  /**
   * 边距。
   *
   */
 
  _ID_MARGIN (STYLE_ID_MARGIN()),
  
  /**
   * 左边距。
   *
   */
 
  _ID_MARGIN_LEFT (STYLE_ID_MARGIN_LEFT()),
  
  /**
   * 右边距。
   *
   */
 
  _ID_MARGIN_RIGHT (STYLE_ID_MARGIN_RIGHT()),
  
  /**
   * 顶边距。
   *
   */
 
  _ID_MARGIN_TOP (STYLE_ID_MARGIN_TOP()),
  
  /**
   * 底边距。
   *
   */
 
  _ID_MARGIN_BOTTOM (STYLE_ID_MARGIN_BOTTOM()),
  
  /**
   * 图标的位置。
   *
   */
 
  _ID_ICON_AT (STYLE_ID_ICON_AT()),
  
  /**
   * Active图标的名称。
   *
   */
 
  _ID_ACTIVE_ICON (STYLE_ID_ACTIVE_ICON()),
  
  /**
   * X方向的偏移，方便实现按下的效果。
   *
   */
 
  _ID_X_OFFSET (STYLE_ID_X_OFFSET()),
  
  /**
   * Y方向的偏移，方便实现按下的效果。
   *
   */
 
  _ID_Y_OFFSET (STYLE_ID_Y_OFFSET()),
  
  /**
   * 编辑器中选中区域的背景颜色。
   *
   */
 
  _ID_SELECTED_BG_COLOR (STYLE_ID_SELECTED_BG_COLOR()),
  
  /**
   * 编辑器中选中区域的前景颜色。
   *
   */
 
  _ID_SELECTED_FG_COLOR (STYLE_ID_SELECTED_FG_COLOR()),
  
  /**
   * 编辑器中选中区域的文本颜色。
   *
   */
 
  _ID_SELECTED_TEXT_COLOR (STYLE_ID_SELECTED_TEXT_COLOR()),
  
  /**
   * 圆角半径(仅在WITH_VGCANVAS定义时生效)。
   *
   */
 
  _ID_ROUND_RADIUS (STYLE_ID_ROUND_RADIUS()),
  
  /**
   * 子控件布局参数。
   *
   */
 
  _ID_CHILDREN_LAYOUT (STYLE_ID_CHILDREN_LAYOUT()),
  
  /**
   * 控件布局参数。
   *
   */
 
  _ID_SELF_LAYOUT (STYLE_ID_SELF_LAYOUT());
 
 
  private TStyleId(String value) {
    this.value = value;
  }

/**
 * 获取枚举的值。
 *
 * @return 枚举的值。
 */
  public String value() {
    return this.value;
  }

/**
 * 把枚举的值转换层枚举。
 *
 * @param value 枚举的值。

 * @return 对应的枚举类型。
 */
  public static TStyleId from(String value) {
    for(TStyleId iter : TStyleId.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return _ID_BG_COLOR;
  }
  
  private String value;

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
