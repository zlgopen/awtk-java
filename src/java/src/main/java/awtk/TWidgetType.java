package awtk;



/**
 * 控件的类型。
 *
 */

public enum TWidgetType {
  
  /**
   * 无特殊类型。
   *
   */
 
  NONE (WIDGET_TYPE_NONE()),
  
  /**
   * 窗口管理器。
   *
   */
 
  WINDOW_MANAGER (WIDGET_TYPE_WINDOW_MANAGER()),
  
  /**
   * 普通窗口。
   *
   */
 
  NORMAL_WINDOW (WIDGET_TYPE_NORMAL_WINDOW()),
  
  /**
   * overlay窗口。
   *
   */
 
  OVERLAY (WIDGET_TYPE_OVERLAY()),
  
  /**
   * 工具条。
   *
   */
 
  TOOL_BAR (WIDGET_TYPE_TOOL_BAR()),
  
  /**
   * 对话框。
   *
   */
 
  DIALOG (WIDGET_TYPE_DIALOG()),
  
  /**
   * 弹出窗口。
   *
   */
 
  POPUP (WIDGET_TYPE_POPUP()),
  
  /**
   * system bar window
   *
   */
 
  SYSTEM_BAR (WIDGET_TYPE_SYSTEM_BAR()),
  
  /**
   * system bar window ato bottom
   *
   */
 
  SYSTEM_BAR_BOTTOM (WIDGET_TYPE_SYSTEM_BAR_BOTTOM()),
  
  /**
   * 精灵窗口。
   *
   */
 
  SPRITE (WIDGET_TYPE_SPRITE()),
  
  /**
   * 键盘窗口。
   *
   */
 
  KEYBOARD (WIDGET_TYPE_KEYBOARD()),
  
  /**
   * 拖放状态窗口。
   *
   */
 
  DND (WIDGET_TYPE_DND()),
  
  /**
   * 文本控件。
   *
   */
 
  LABEL (WIDGET_TYPE_LABEL()),
  
  /**
   * 按钮控件。
   *
   */
 
  BUTTON (WIDGET_TYPE_BUTTON()),
  
  /**
   * 图片控件。
   *
   */
 
  IMAGE (WIDGET_TYPE_IMAGE()),
  
  /**
   * 文本编辑控件。
   *
   */
 
  EDIT (WIDGET_TYPE_EDIT()),
  
  /**
   * 进度条控件。
   *
   */
 
  PROGRESS_BAR (WIDGET_TYPE_PROGRESS_BAR()),
  
  /**
   * 分组控件。
   *
   */
 
  GROUP_BOX (WIDGET_TYPE_GROUP_BOX()),
  
  /**
   * 多选按钮控件。
   *
   */
 
  CHECK_BUTTON (WIDGET_TYPE_CHECK_BUTTON()),
  
  /**
   * 单选按钮控件。
   *
   */
 
  RADIO_BUTTON (WIDGET_TYPE_RADIO_BUTTON()),
  
  /**
   * 对话框标题。
   *
   */
 
  DIALOG_TITLE (WIDGET_TYPE_DIALOG_TITLE()),
  
  /**
   * 对话框客户区域。
   *
   */
 
  DIALOG_CLIENT (WIDGET_TYPE_DIALOG_CLIENT()),
  
  /**
   * 滑块控件。
   *
   */
 
  SLIDER (WIDGET_TYPE_SLIDER()),
  
  /**
   * 视图控件。
   *
   */
 
  VIEW (WIDGET_TYPE_VIEW()),
  
  /**
   * 下拉选择框控件。
   *
   */
 
  COMBO_BOX (WIDGET_TYPE_COMBO_BOX()),
  
  /**
   * 下拉选择框的列表项控件。
   *
   */
 
  COMBO_BOX_ITEM (WIDGET_TYPE_COMBO_BOX_ITEM()),
  
  /**
   * 滑动视图控件。
   *
   */
 
  SLIDE_VIEW (WIDGET_TYPE_SLIDE_VIEW()),
  
  /**
   * 滑动视图的指示器控件。
   *
   */
 
  SLIDE_INDICATOR (WIDGET_TYPE_SLIDE_INDICATOR()),
  
  /**
   * 滑动视图的指示器控件（圆弧显示）。
   *
   */
 
  SLIDE_INDICATOR_ARC (WIDGET_TYPE_SLIDE_INDICATOR_ARC()),
  
  /**
   * 多页控件。
   *
   */
 
  PAGES (WIDGET_TYPE_PAGES()),
  
  /**
   * 标签按钮控件。
   *
   */
 
  TAB_BUTTON (WIDGET_TYPE_TAB_BUTTON()),
  
  /**
   * 标签控件。
   *
   */
 
  TAB_CONTROL (WIDGET_TYPE_TAB_CONTROL()),
  
  /**
   * 标签按钮分组控件。
   *
   */
 
  TAB_BUTTON_GROUP (WIDGET_TYPE_TAB_BUTTON_GROUP()),
  
  /**
   * 按钮分组控件。
   *
   */
 
  BUTTON_GROUP (WIDGET_TYPE_BUTTON_GROUP()),
  
  /**
   * 候选字控件。
   *
   */
 
  CANDIDATES (WIDGET_TYPE_CANDIDATES()),
  
  /**
   * 数值编辑控件。
   *
   */
 
  SPIN_BOX (WIDGET_TYPE_SPIN_BOX()),
  
  /**
   * 拖动块控件。
   *
   */
 
  DRAGGER (WIDGET_TYPE_DRAGGER()),
  
  /**
   * 滚动条控件。
   *
   */
 
  SCROLL_BAR (WIDGET_TYPE_SCROLL_BAR()),
  
  /**
   * 桌面版滚动条控件。
   *
   */
 
  SCROLL_BAR_DESKTOP (WIDGET_TYPE_SCROLL_BAR_DESKTOP()),
  
  /**
   * 移动版滚动条控件。
   *
   */
 
  SCROLL_BAR_MOBILE (WIDGET_TYPE_SCROLL_BAR_MOBILE()),
  
  /**
   * 滚动视图控件。
   *
   */
 
  SCROLL_VIEW (WIDGET_TYPE_SCROLL_VIEW()),
  
  /**
   * 列表视图控件。
   *
   */
 
  LIST_VIEW (WIDGET_TYPE_LIST_VIEW()),
  
  /**
   * 水平列表视图控件。
   *
   */
 
  LIST_VIEW_H (WIDGET_TYPE_LIST_VIEW_H()),
  
  /**
   * 列表项控件。
   *
   */
 
  LIST_ITEM (WIDGET_TYPE_LIST_ITEM()),
  
  /**
   * 颜色选择器控件。
   *
   */
 
  COLOR_PICKER (WIDGET_TYPE_COLOR_PICKER()),
  
  /**
   * 颜色选择器组件控件。
   *
   */
 
  COLOR_COMPONENT (WIDGET_TYPE_COLOR_COMPONENT()),
  
  /**
   * 颜色块控件。
   *
   */
 
  COLOR_TILE (WIDGET_TYPE_COLOR_TILE()),
  
  /**
   * 裁剪控件。
   *
   */
 
  CLIP_VIEW (WIDGET_TYPE_CLIP_VIEW()),
  
  /**
   * 富文本控件。
   *
   */
 
  RICH_TEXT (WIDGET_TYPE_RICH_TEXT()),
  
  /**
   * AppBar控件。
   *
   */
 
  APP_BAR (WIDGET_TYPE_APP_BAR()),
  
  /**
   * 网格控件。
   *
   */
 
  GRID (WIDGET_TYPE_GRID()),
  
  /**
   * 网格项目控件。
   *
   */
 
  GRID_ITEM (WIDGET_TYPE_GRID_ITEM()),
  
  /**
   * 行控件。
   *
   */
 
  ROW (WIDGET_TYPE_ROW()),
  
  /**
   * 列控件。
   *
   */
 
  COLUMN (WIDGET_TYPE_COLUMN()),
  
  /**
   * 电阻屏校准窗口。
   *
   */
 
  CALIBRATION_WIN (WIDGET_TYPE_CALIBRATION_WIN());
 
 
  private TWidgetType(String value) {
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
  public static TWidgetType from(String value) {
    for(TWidgetType iter : TWidgetType.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return NONE;
  }
  
  private String value;

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
