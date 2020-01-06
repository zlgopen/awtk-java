package awtk;



/**
 * 控件的属性。
 *
 */

public enum TWidgetProp {
  
  /**
   * 用于执行某些特殊的命令（比如控制动画的启停），主要是方便MVVM通过属性来控制动画。
   *
   */
 
  EXEC (WIDGET_PROP_EXEC()),
  
  /**
   * X坐标。
   *
   */
 
  X (WIDGET_PROP_X()),
  
  /**
   * Y坐标。
   *
   */
 
  Y (WIDGET_PROP_Y()),
  
  /**
   * 宽度。
   *
   */
 
  W (WIDGET_PROP_W()),
  
  /**
   * 高度。
   *
   */
 
  H (WIDGET_PROP_H()),
  
  /**
   * 脏矩形超出控件本身大小的最大范围。
   *
   */
 
  DIRTY_RECT_TOLERANCE (WIDGET_PROP_DIRTY_RECT_TOLERANCE()),
  
  /**
   * Canvas。
   *
   */
 
  CANVAS (WIDGET_PROP_CANVAS()),
  
  /**
   * Canvas。
   *
   */
 
  LOCALIZE_OPTIONS (WIDGET_PROP_LOCALIZE_OPTIONS()),
  
  /**
   * Native Window。
   *
   */
 
  NATIVE_WINDOW (WIDGET_PROP_NATIVE_WINDOW()),
  
  /**
   * dialog highlight。
   *
   */
 
  HIGHLIGHT (WIDGET_PROP_HIGHLIGHT()),
  
  /**
   * slider中的bar的的宽度或高度。
   *
   */
 
  BAR_SIZE (WIDGET_PROP_BAR_SIZE()),
  
  /**
   * 不透明度。
   *
   */
 
  OPACITY (WIDGET_PROP_OPACITY()),
  
  /**
   * 最小宽度。
   *
   */
 
  MIN_W (WIDGET_PROP_MIN_W()),
  
  /**
   * 最大宽度。
   *
   */
 
  MAX_W (WIDGET_PROP_MAX_W()),
  
  /**
   * 子控件布局参数。
   *
   */
 
  CHILDREN_LAYOUT (WIDGET_PROP_CHILDREN_LAYOUT()),
  
  /**
   * 子控件布局参数(过时)。
   *
   */
 
  LAYOUT (WIDGET_PROP_LAYOUT()),
  
  /**
   * 控件布局参数。
   *
   */
 
  SELF_LAYOUT (WIDGET_PROP_SELF_LAYOUT()),
  
  /**
   * layout宽度。
   *
   */
 
  LAYOUT_W (WIDGET_PROP_LAYOUT_W()),
  
  /**
   * layout高度。
   *
   */
 
  LAYOUT_H (WIDGET_PROP_LAYOUT_H()),
  
  /**
   * 虚拟宽度。
   *
   */
 
  VIRTUAL_W (WIDGET_PROP_VIRTUAL_W()),
  
  /**
   * 虚拟高度。
   *
   */
 
  VIRTUAL_H (WIDGET_PROP_VIRTUAL_H()),
  
  /**
   * 名称。
   *
   */
 
  NAME (WIDGET_PROP_NAME()),
  
  /**
   * 类型。
   *
   */
 
  TYPE (WIDGET_PROP_TYPE()),
  
  /**
   * 是否可以关闭。
   *
   */
 
  CLOSABLE (WIDGET_PROP_CLOSABLE()),
  
  /**
   * 鼠标指针。
   *
   */
 
  CURSOR (WIDGET_PROP_CURSOR()),
  
  /**
   * 值。
   *
   */
 
  VALUE (WIDGET_PROP_VALUE()),
  
  /**
   * 长度。
   *
   */
 
  LENGTH (WIDGET_PROP_LENGTH()),
  
  /**
   * 文本。
   *
   */
 
  TEXT (WIDGET_PROP_TEXT()),
  
  /**
   * 待翻译文本。
   *
   */
 
  TR_TEXT (WIDGET_PROP_TR_TEXT()),
  
  /**
   * style。
   *
   */
 
  STYLE (WIDGET_PROP_STYLE()),
  
  /**
   * 是否启用。
   *
   */
 
  ENABLE (WIDGET_PROP_ENABLE()),
  
  /**
   * 是否启用按键音等反馈。
   *
   */
 
  FEEDBACK (WIDGET_PROP_FEEDBACK()),
  
  /**
   * 是否启用floating布局。
   *
   */
 
  FLOATING (WIDGET_PROP_FLOATING()),
  
  /**
   * 边距。
   *
   */
 
  MARGIN (WIDGET_PROP_MARGIN()),
  
  /**
   * 间距。
   *
   */
 
  SPACING (WIDGET_PROP_SPACING()),
  
  /**
   * 左边距。
   *
   */
 
  LEFT_MARGIN (WIDGET_PROP_LEFT_MARGIN()),
  
  /**
   * 右边距。
   *
   */
 
  RIGHT_MARGIN (WIDGET_PROP_RIGHT_MARGIN()),
  
  /**
   * 顶边距。
   *
   */
 
  TOP_MARGIN (WIDGET_PROP_TOP_MARGIN()),
  
  /**
   * 底边距。
   *
   */
 
  BOTTOM_MARGIN (WIDGET_PROP_BOTTOM_MARGIN()),
  
  /**
   * 步长。
   *
   */
 
  STEP (WIDGET_PROP_STEP()),
  
  /**
   * 是否可见。
   *
   */
 
  VISIBLE (WIDGET_PROP_VISIBLE()),
  
  /**
   * 是否接受用户事件。
   *
   */
 
  SENSITIVE (WIDGET_PROP_SENSITIVE()),
  
  /**
   * 控件动画。
   *
   */
 
  ANIMATION (WIDGET_PROP_ANIMATION()),
  
  /**
   * 窗口动画。
   *
   */
 
  ANIM_HINT (WIDGET_PROP_ANIM_HINT()),
  
  /**
   * 窗口设置为全部大小。
   *
   */
 
  FULLSCREEN (WIDGET_PROP_FULLSCREEN()),
  
  /**
   * 打开窗口动画。
   *
   */
 
  OPEN_ANIM_HINT (WIDGET_PROP_OPEN_ANIM_HINT()),
  
  /**
   * 关闭窗口动画。
   *
   */
 
  CLOSE_ANIM_HINT (WIDGET_PROP_CLOSE_ANIM_HINT()),
  
  /**
   * 最小值。
   *
   */
 
  MIN (WIDGET_PROP_MIN()),
  
  /**
   * 提示信息。
   *
   */
 
  TIPS (WIDGET_PROP_TIPS()),
  
  /**
   * 输入类型。
   *
   */
 
  INPUT_TYPE (WIDGET_PROP_INPUT_TYPE()),
  
  /**
   * 只读模式。
   *
   */
 
  READONLY (WIDGET_PROP_READONLY()),
  
  /**
   * 密码是否可见。
   *
   */
 
  PASSWORD_VISIBLE (WIDGET_PROP_PASSWORD_VISIBLE()),
  
  /**
   * 是否处于active状态。
   *
   */
 
  ACTIVE (WIDGET_PROP_ACTIVE()),
  
  /**
   * 是否为垂直模式。
   *
   */
 
  VERTICAL (WIDGET_PROP_VERTICAL()),
  
  /**
   * 是否显示文本。
   *
   */
 
  SHOW_TEXT (WIDGET_PROP_SHOW_TEXT()),
  
  /**
   * X方向的偏移。
   *
   */
 
  XOFFSET (WIDGET_PROP_XOFFSET()),
  
  /**
   * Y方向的偏移。
   *
   */
 
  YOFFSET (WIDGET_PROP_YOFFSET()),
  
  /**
   * 垂直对齐模式。
   *
   */
 
  ALIGN_V (WIDGET_PROP_ALIGN_V()),
  
  /**
   * 水平对齐模式。
   *
   */
 
  ALIGN_H (WIDGET_PROP_ALIGN_H()),
  
  /**
   * 是否自动播放或指定播放的时间。
   *
   */
 
  AUTO_PLAY (WIDGET_PROP_AUTO_PLAY()),
  
  /**
   * 是否循环播放或循环播放的次数。
   *
   */
 
  LOOP (WIDGET_PROP_LOOP()),
  
  /**
   * 是否启用自动更正功能。
   *
   */
 
  AUTO_FIX (WIDGET_PROP_AUTO_FIX()),
  
  /**
   * 编辑器在获得焦点时是否不选中文本。
   *
   */
 
  SELECT_NONE_WHEN_FOCUSED (WIDGET_PROP_SELECT_NONE_WHEN_FOCUSED()),
  
  /**
   * 编辑器在获得焦点时是否打开输入法。
   *
   */
 
  OPEN_IM_WHEN_FOCUSED (WIDGET_PROP_OPEN_IM_WHEN_FOCUSED()),
  
  /**
   * X最小值。
   *
   */
 
  X_MIN (WIDGET_PROP_X_MIN()),
  
  /**
   * X最大值。
   *
   */
 
  X_MAX (WIDGET_PROP_X_MAX()),
  
  /**
   * Y最小值。
   *
   */
 
  Y_MIN (WIDGET_PROP_Y_MIN()),
  
  /**
   * Y最大值。
   *
   */
 
  Y_MAX (WIDGET_PROP_Y_MAX()),
  
  /**
   * 最大值。
   *
   */
 
  MAX (WIDGET_PROP_MAX()),
  
  /**
   * 让窗口管理器直接把按键发给自己。
   *
   */
 
  GRAB_KEYS (WIDGET_PROP_GRAB_KEYS()),
  
  /**
   * 行数或每行的高度。
   *
   */
 
  ROW (WIDGET_PROP_ROW()),
  
  /**
   * 控件状态。
   *
   */
 
  STATE_FOR_STYLE (WIDGET_PROP_STATE_FOR_STYLE()),
  
  /**
   * 窗口主题名称。
   *
   */
 
  THEME (WIDGET_PROP_THEME()),
  
  /**
   * window stage
   *
   */
 
  STAGE (WIDGET_PROP_STAGE()),
  
  /**
   * 图片管理器。
   *
   */
 
  IMAGE_MANAGER (WIDGET_PROP_IMAGE_MANAGER()),
  
  /**
   * 资源管理器。
   *
   */
 
  ASSETS_MANAGER (WIDGET_PROP_ASSETS_MANAGER()),
  
  /**
   * locale_info。
   *
   */
 
  LOCALE_INFO (WIDGET_PROP_LOCALE_INFO()),
  
  /**
   * 字体管理器。
   *
   */
 
  FONT_MANAGER (WIDGET_PROP_FONT_MANAGER()),
  
  /**
   * 窗口的主题对象。
   *
   */
 
  THEME_OBJ (WIDGET_PROP_THEME_OBJ()),
  
  /**
   * 缺省的主题对象。
   *
   */
 
  DEFAULT_THEME_OBJ (WIDGET_PROP_DEFAULT_THEME_OBJ()),
  
  /**
   * 项的宽度。
   *
   */
 
  ITEM_WIDTH (WIDGET_PROP_ITEM_WIDTH()),
  
  /**
   * 项的高度。
   *
   */
 
  ITEM_HEIGHT (WIDGET_PROP_ITEM_HEIGHT()),
  
  /**
   * 项的缺省高度。
   *
   */
 
  DEFAULT_ITEM_HEIGHT (WIDGET_PROP_DEFAULT_ITEM_HEIGHT()),
  
  /**
   * X方向是否可拖动。
   *
   */
 
  XSLIDABLE (WIDGET_PROP_XSLIDABLE()),
  
  /**
   * Y方向是否可拖动。
   *
   */
 
  YSLIDABLE (WIDGET_PROP_YSLIDABLE()),
  
  /**
   * 重复次数。
   *
   */
 
  REPEAT (WIDGET_PROP_REPEAT()),
  
  /**
   * 是否启用长按。
   *
   */
 
  ENABLE_LONG_PRESS (WIDGET_PROP_ENABLE_LONG_PRESS()),
  
  /**
   * 是否启用动画。
   *
   */
 
  ANIMATABLE (WIDGET_PROP_ANIMATABLE()),
  
  /**
   * 是否自动隐藏滚动条。
   *
   */
 
  AUTO_HIDE_SCROLL_BAR (WIDGET_PROP_AUTO_HIDE_SCROLL_BAR()),
  
  /**
   * 图片名称。
   *
   */
 
  IMAGE (WIDGET_PROP_IMAGE()),
  
  /**
   * 显示格式。
   *
   */
 
  FORMAT (WIDGET_PROP_FORMAT()),
  
  /**
   * 图片绘制类型。
   *
   */
 
  DRAW_TYPE (WIDGET_PROP_DRAW_TYPE()),
  
  /**
   * 是否可选择。
   *
   */
 
  SELECTABLE (WIDGET_PROP_SELECTABLE()),
  
  /**
   * 是否可点击。
   *
   */
 
  CLICKABLE (WIDGET_PROP_CLICKABLE()),
  
  /**
   * X方向缩放比例。
   *
   */
 
  SCALE_X (WIDGET_PROP_SCALE_X()),
  
  /**
   * Y方向缩放比例。
   *
   */
 
  SCALE_Y (WIDGET_PROP_SCALE_Y()),
  
  /**
   * x锚点。
   *
   */
 
  ANCHOR_X (WIDGET_PROP_ANCHOR_X()),
  
  /**
   * y锚点。
   *
   */
 
  ANCHOR_Y (WIDGET_PROP_ANCHOR_Y()),
  
  /**
   * 选中角度(幅度)
   *
   */
 
  ROTATION (WIDGET_PROP_ROTATION()),
  
  /**
   * 紧凑模式。
   *
   */
 
  COMPACT (WIDGET_PROP_COMPACT()),
  
  /**
   * 是否支持滚动。
   *
   */
 
  SCROLLABLE (WIDGET_PROP_SCROLLABLE()),
  
  /**
   * 图标名称。
   *
   */
 
  ICON (WIDGET_PROP_ICON()),
  
  /**
   * 选项集合。
   *
   */
 
  OPTIONS (WIDGET_PROP_OPTIONS()),
  
  /**
   * 是否被选中。
   *
   */
 
  SELECTED (WIDGET_PROP_SELECTED()),
  
  /**
   * 是否被勾选。
   *
   */
 
  CHECKED (WIDGET_PROP_CHECKED()),
  
  /**
   * active状态下的图标。
   *
   */
 
  ACTIVE_ICON (WIDGET_PROP_ACTIVE_ICON()),
  
  /**
   * 动态加载UI名字。
   *
   */
 
  LOAD_UI (WIDGET_PROP_LOAD_UI()),
  
  /**
   * 要打开窗口的名称。
   *
   */
 
  OPEN_WINDOW (WIDGET_PROP_OPEN_WINDOW()),
  
  /**
   * 被选中项的索引。
   *
   */
 
  SELECTED_INDEX (WIDGET_PROP_SELECTED_INDEX()),
  
  /**
   * 点击窗口时关闭窗口。
   *
   */
 
  CLOSE_WHEN_CLICK (WIDGET_PROP_CLOSE_WHEN_CLICK()),
  
  /**
   * 点击窗口外部时关闭窗口。
   *
   */
 
  CLOSE_WHEN_CLICK_OUTSIDE (WIDGET_PROP_CLOSE_WHEN_CLICK_OUTSIDE()),
  
  /**
   * 行间距。
   *
   */
 
  LINE_GAP (WIDGET_PROP_LINE_GAP()),
  
  /**
   * 背景颜色(仅仅使用于color tile)。
   *
   */
 
  BG_COLOR (WIDGET_PROP_BG_COLOR()),
  
  /**
   * 边框颜色(仅仅使用于color tile)。
   *
   */
 
  BORDER_COLOR (WIDGET_PROP_BORDER_COLOR()),
  
  /**
   * 延迟时间(毫秒)
   *
   */
 
  DELAY (WIDGET_PROP_DELAY()),
  
  /**
   * 是否为键盘。
   *
   */
 
  IS_KEYBOARD (WIDGET_PROP_IS_KEYBOARD()),
  
  /**
   * 是否为焦点控件。
   *
   */
 
  FOCUSED (WIDGET_PROP_FOCUSED()),
  
  /**
   * (过时请用focused)。
   *
   */
 
  FOCUS (WIDGET_PROP_FOCUS()),
  
  /**
   * 是否支持焦点停留。
   *
   */
 
  FOCUSABLE (WIDGET_PROP_FOCUSABLE()),
  
  /**
   * 是否支持焦点状态(如果希望style支持焦点状态，但有不希望焦点停留，可用本属性)。
   *
   */
 
  WITH_FOCUS_STATE (WIDGET_PROP_WITH_FOCUS_STATE()),
  
  /**
   * 将焦点移到前一个的键值。
   *
   */
 
  MOVE_FOCUS_PREV_KEY (WIDGET_PROP_MOVE_FOCUS_PREV_KEY()),
  
  /**
   * 将焦点移到后一个的键值。
   *
   */
 
  MOVE_FOCUS_NEXT_KEY (WIDGET_PROP_MOVE_FOCUS_NEXT_KEY()),
  
  /**
   * 将焦点向上移动的键值。
   *
   */
 
  MOVE_FOCUS_UP_KEY (WIDGET_PROP_MOVE_FOCUS_UP_KEY()),
  
  /**
   * 将焦点向下移动的键值。
   *
   */
 
  MOVE_FOCUS_DOWN_KEY (WIDGET_PROP_MOVE_FOCUS_DOWN_KEY()),
  
  /**
   * 将焦点向左移动的键值。
   *
   */
 
  MOVE_FOCUS_LEFT_KEY (WIDGET_PROP_MOVE_FOCUS_LEFT_KEY()),
  
  /**
   * 将焦点向右移动的键值。
   *
   */
 
  MOVE_FOCUS_RIGHT_KEY (WIDGET_PROP_MOVE_FOCUS_RIGHT_KEY());
 
 
  private TWidgetProp(String value) {
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
  public static TWidgetProp from(String value) {
    for(TWidgetProp iter : TWidgetProp.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return EXEC;
  }
  
  private String value;

  static private native String WIDGET_PROP_EXEC();
  static private native String WIDGET_PROP_X();
  static private native String WIDGET_PROP_Y();
  static private native String WIDGET_PROP_W();
  static private native String WIDGET_PROP_H();
  static private native String WIDGET_PROP_DIRTY_RECT_TOLERANCE();
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
  static private native String WIDGET_PROP_LOAD_UI();
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
