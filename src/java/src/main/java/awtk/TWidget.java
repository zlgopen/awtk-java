package awtk;


/**
 * widget_t* button = button_create(win, 10, 10, 128, 30);
 *widget_set_text(button, L"OK");
 *widget_on(button, EVT_CLICK, on_click, NULL);
 *```
 *
 */
public class TWidget { 

/**
 * 原生对象。
 */
 public long nativeObj;


/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TWidget(long nativeObj) {
   this.nativeObj = nativeObj;
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TWidget cast(long nativeObj) {
   return new TWidget(nativeObj);
 }


  /**
   * 获取子控件的个数。
   * 
   *
   * @return 子控件的个数。
   */
 public  int countChildren()  {
    return widget_count_children(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 获取指定索引的子控件。
   * 
   * @param index 索引。
   *
   * @return 子控件。
   */
 public  TWidget getChild(int index)  {
    return new TWidget(widget_get_child(this != null ? (this.nativeObj) : 0, index));
 }


  /**
   * 通过名称查找父控件。
   * 
   * @param name 名称。
   *
   * @return 父控件。
   */
 public  TWidget findParentByName(String name)  {
    return new TWidget(widget_find_parent_by_name(this != null ? (this.nativeObj) : 0, name));
 }


  /**
   * 通过类型查找父控件。
   * 
   * @param type 类型。
   *
   * @return 父控件。
   */
 public  TWidget findParentByType(String type)  {
    return new TWidget(widget_find_parent_by_type(this != null ? (this.nativeObj) : 0, type));
 }


  /**
   * 获取当前窗口中的焦点控件。
   * 
   *
   * @return 焦点控件。
   */
 public  TWidget getFocusedWidget()  {
    return new TWidget(widget_get_focused_widget(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 获取原生窗口对象。
   * 
   *
   * @return 原生窗口对象。
   */
 public  TNativeWindow getNativeWindow()  {
    return new TNativeWindow(widget_get_native_window(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 获取控件在父控件中的索引编号。
   * 
   *
   * @return 在父控件中的索引编号。
   */
 public  int indexOf()  {
    return widget_index_of(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 关闭控件所在的窗口。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet closeWindow()  {
   return TRet.from(widget_close_window(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 关闭控件所在的窗口。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet closeWindowForce()  {
   return TRet.from(widget_close_window_force(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 请求返回到前一个窗口。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet back()  {
   return TRet.from(widget_back(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 请求返回到home窗口。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet backToHome()  {
   return TRet.from(widget_back_to_home(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 移动控件。
   * 
   * @param x x坐标
   * @param y y坐标
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet move(int x, int y)  {
   return TRet.from(widget_move(this != null ? (this.nativeObj) : 0, x, y));
 }


  /**
   * 移动控件到父控件中间。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet moveToCenter()  {
   return TRet.from(widget_move_to_center(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 调整控件的大小。
   * 
   * @param w 宽度
   * @param h 高度
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet resize(int w, int h)  {
   return TRet.from(widget_resize(this != null ? (this.nativeObj) : 0, w, h));
 }


  /**
   * 移动控件并调整控件的大小。
   * 
   * @param x x坐标
   * @param y y坐标
   * @param w 宽度
   * @param h 高度
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet moveResize(int x, int y, int w, int h)  {
   return TRet.from(widget_move_resize(this != null ? (this.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 获取控件的值。只是对widget\_get\_prop的包装，值的意义由子类控件决定。
   * 
   *
   * @return 返回值。
   */
 public  double getValue()  {
    return widget_get_value(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 设置控件的值。
   *只是对widget\_set\_prop的包装，值的意义由子类控件决定。
   * 
   * @param value 值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setValue(double value)  {
   return TRet.from(widget_set_value(this != null ? (this.nativeObj) : 0, value));
 }


  /**
   * 增加控件的值。
   *只是对widget\_set\_prop的包装，值的意义由子类控件决定。
   * 
   * @param delta 增量。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet addValue(double delta)  {
   return TRet.from(widget_add_value(this != null ? (this.nativeObj) : 0, delta));
 }


  /**
   * 获取控件的值。只是对widget\_get\_prop的包装，值的意义由子类控件决定。
   * 
   *
   * @return 返回值。
   */
 public  int getValueInt()  {
    return widget_get_value_int(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 设置控件的值。
   *只是对widget\_set\_prop的包装，值的意义由子类控件决定。
   * 
   * @param value 值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setValueInt(int value)  {
   return TRet.from(widget_set_value_int(this != null ? (this.nativeObj) : 0, value));
 }


  /**
   * 增加控件的值。
   *只是对widget\_set\_prop的包装，值的意义由子类控件决定。
   * 
   * @param delta 增量。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet addValueInt(int delta)  {
   return TRet.from(widget_add_value_int(this != null ? (this.nativeObj) : 0, delta));
 }


  /**
   * 设置控件的值(以动画形式变化到指定的值)。
   *只是对widget\_set\_prop的包装，值的意义由子类控件决定。
   * 
   * @param value 值。
   * @param duration 动画持续时间(毫秒)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet animateValueTo(double value, int duration)  {
   return TRet.from(widget_animate_value_to(this != null ? (this.nativeObj) : 0, value, duration));
 }


  /**
   * 查询指定的style是否存在。
   * 
   * @param style_name style的名称（如果为 NULL，则默认为 default）。
   * @param state_name state的名称（如果为 NULL，则默认为 normal）。
   *
   * @return 存在返回 TRUE，不存在返回 FALSE。
   */
 public  boolean isStyleExist(String style_name, String state_name)  {
    return widget_is_style_exist(this != null ? (this.nativeObj) : 0, style_name, state_name);
 }


  /**
   * 启用指定的style。
   * 
   * @param style style的名称。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet useStyle(String style)  {
   return TRet.from(widget_use_style(this != null ? (this.nativeObj) : 0, style));
 }


  /**
   * 设置控件的文本。（如果字符串相同，则不会重复设置以及触发事件）
   * 
   * @param text 文本。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setText(String text)  {
   return TRet.from(widget_set_text_utf8(this != null ? (this.nativeObj) : 0, text));
 }


  /**
   * 设置控件的文本。
   * 
   * @param text 文本。
   * @param check_diff 是否检查设置的文本是否和控件中的文本一样。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setTextEx(String text, boolean check_diff)  {
   return TRet.from(widget_set_text_utf8_ex(this != null ? (this.nativeObj) : 0, text, check_diff));
 }


  /**
   * 设置子控件的文本。
   *只是对widget\_set\_prop的包装，文本的意义由子类控件决定。
   * 
   * @param name 子控件的名称。
   * @param text 文本。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setChildText(String name, String text)  {
   return TRet.from(widget_set_child_text_utf8(this != null ? (this.nativeObj) : 0, name, text));
 }


  /**
   * 用一个浮点数去设置子控件的文本。
   *只是对widget\_set\_prop的包装，文本的意义由子类控件决定。
   * 
   * @param name 子控件的名称。
   * @param format 格式字符串(如："%2.2lf")。
   * @param value 浮点数值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setChildTextWithDouble(String name, String format, double value)  {
   return TRet.from(widget_set_child_text_with_double(this != null ? (this.nativeObj) : 0, name, format, value));
 }


  /**
   * 用一个整数去设置子控件的文本。
   *只是对widget\_set\_prop的包装，文本的意义由子类控件决定。
   * 
   * @param name 子控件的名称。
   * @param format 格式字符串(如："%d")。
   * @param value 值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setChildTextWithInt(String name, String format, int value)  {
   return TRet.from(widget_set_child_text_with_int(this != null ? (this.nativeObj) : 0, name, format, value));
 }


  /**
   * 获取翻译之后的文本，然后调用widget_set_text。
   * 
   * @param text 文本。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setTrText(String text)  {
   return TRet.from(widget_set_tr_text(this != null ? (this.nativeObj) : 0, text));
 }


  /**
   * 获取控件enable属性值。
   * 
   *
   * @return 返回enable。
   */
 public  boolean getEnable()  {
    return widget_get_enable(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 获取控件floating属性值。
   * 
   *
   * @return 返回floating。
   */
 public  boolean getFloating()  {
    return widget_get_floating(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 获取控件auto_adjust_size属性值。
   * 
   *
   * @return 返回auto_adjust_size。
   */
 public  boolean getAutoAdjustSize()  {
    return widget_get_auto_adjust_size(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 获取控件with_focus_state属性值。
   * 
   *
   * @return 返回with_focus_state。
   */
 public  boolean getWithFocusState()  {
    return widget_get_with_focus_state(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 获取控件focusable属性值。
   * 
   *
   * @return 返回focusable。
   */
 public  boolean getFocusable()  {
    return widget_get_focusable(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 获取控件sensitive属性值。
   * 
   *
   * @return 返回sensitive。
   */
 public  boolean getSensitive()  {
    return widget_get_sensitive(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 获取控件visible属性值。
   * 
   *
   * @return 返回visible。
   */
 public  boolean getVisible()  {
    return widget_get_visible(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 获取控件feedback属性值。
   * 
   *
   * @return 返回feedback。
   */
 public  boolean getFeedback()  {
    return widget_get_feedback(this != null ? (this.nativeObj) : 0);
 }


  /**
   * str_t str;
   *str_init(&str, 0);
   *str_from_wstr(&str, widget_get_text(target));
   *log_debug("%s: %s\n", target->name, str.str);
   *str_reset(&str);
   *```
   * 
   *
   * @return 返回文本。
   */
 public  long getText()  {
    return widget_get_text(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 设置控件的名称。
   * 
   * @param name 名称。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setName(String name)  {
   return TRet.from(widget_set_name(this != null ? (this.nativeObj) : 0, name));
 }


  /**
   * 设置theme的名称，用于动态切换主题。名称与当前主题名称相同，则重新加载全部资源。
   * 
   * @param name 主题的名称。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setTheme(String name)  {
   return TRet.from(widget_set_theme(this != null ? (this.nativeObj) : 0, name));
 }


  /**
   * 获取 theme 的名称
   * 
   *
   * @return 成功返回主题名称，失败否则 NULL。
   */
 public  String getThemeName()  {
    return widget_get_theme_name(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 设置鼠标指针的图片名。
   * 
   * @param cursor 图片名称(无扩展名)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setPointerCursor(String cursor)  {
   return TRet.from(widget_set_pointer_cursor(this != null ? (this.nativeObj) : 0, cursor));
 }


  /**
   * 设置控件的动画参数(仅用于在UI文件使用)。
   *请参考[控件动画](https://github.com/zlgopen/awtk/blob/master/docs/widget_animator.md)
   * 
   * @param animation 动画参数。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setAnimation(String animation)  {
   return TRet.from(widget_set_animation(this != null ? (this.nativeObj) : 0, animation));
 }


  /**
   * 创建动画。
   *请参考[控件动画](https://github.com/zlgopen/awtk/blob/master/docs/widget_animator.md)
   *
   ** 除非指定auto_start=false，动画创建后自动启动。
   ** 除非指定auto_destroy=false，动画播放完成后自动销毁。
   * 
   * @param animation 动画参数。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet createAnimator(String animation)  {
   return TRet.from(widget_create_animator(this != null ? (this.nativeObj) : 0, animation));
 }


  /**
   * 播放动画。
   *请参考[控件动画](https://github.com/zlgopen/awtk/blob/master/docs/widget_animator.md)
   *
   ** 1.widget为NULL时，播放所有名称为name的动画。
   ** 2.name为NULL时，播放所有widget相关的动画。
   ** 3.widget和name均为NULL，播放所有动画。
   * 
   * @param name 动画名称。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet startAnimator(String name)  {
   return TRet.from(widget_start_animator(this != null ? (this.nativeObj) : 0, name));
 }


  /**
   * 设置动画的时间倍率，<0: 时间倒退，<1: 时间变慢，>1 时间变快。
   *请参考[控件动画](https://github.com/zlgopen/awtk/blob/master/docs/widget_animator.md)
   *
   ** 1.widget为NULL时，设置所有名称为name的动画的时间倍率。
   ** 2.name为NULL时，设置所有widget相关的动画的时间倍率。
   ** 3.widget和name均为NULL，设置所有动画的时间倍率。
   * 
   * @param name 动画名称。
   * @param time_scale 时间倍率。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setAnimatorTimeScale(String name, double time_scale)  {
   return TRet.from(widget_set_animator_time_scale(this != null ? (this.nativeObj) : 0, name, time_scale));
 }


  /**
   * 暂停动画。
   *请参考[控件动画](https://github.com/zlgopen/awtk/blob/master/docs/widget_animator.md)
   *
   ** 1.widget为NULL时，暂停所有名称为name的动画。
   ** 2.name为NULL时，暂停所有widget相关的动画。
   ** 3.widget和name均为NULL，暂停所有动画。
   * 
   * @param name 动画名称。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet pauseAnimator(String name)  {
   return TRet.from(widget_pause_animator(this != null ? (this.nativeObj) : 0, name));
 }


  /**
   * 停止动画(控件的相应属性回归原位)。
   *请参考[控件动画](https://github.com/zlgopen/awtk/blob/master/docs/widget_animator.md)
   *
   ** 1.widget为NULL时，停止所有名称为name的动画。
   ** 2.name为NULL时，停止所有widget相关的动画。
   ** 3.widget和name均为NULL，停止所有动画。
   * 
   * @param name 动画名称。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet stopAnimator(String name)  {
   return TRet.from(widget_stop_animator(this != null ? (this.nativeObj) : 0, name));
 }


  /**
   * 销毁动画。
   *请参考[控件动画](https://github.com/zlgopen/awtk/blob/master/docs/widget_animator.md)
   *
   ** 1.widget为NULL时，销毁所有名称为name的动画。
   ** 2.name为NULL时，销毁所有widget相关的动画。
   ** 3.widget和name均为NULL，销毁所有动画。
   * 
   * @param name 动画名称。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet destroyAnimator(String name)  {
   return TRet.from(widget_destroy_animator(this != null ? (this.nativeObj) : 0, name));
 }


  /**
   * 设置控件的可用性。
   * 
   * @param enable 是否可用性。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setEnable(boolean enable)  {
   return TRet.from(widget_set_enable(this != null ? (this.nativeObj) : 0, enable));
 }


  /**
   * 设置控件是否启用反馈。
   * 
   * @param feedback 是否启用反馈。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setFeedback(boolean feedback)  {
   return TRet.from(widget_set_feedback(this != null ? (this.nativeObj) : 0, feedback));
 }


  /**
   * 设置控件是否根据子控件和文本自动调整控件自身大小。
   * 
   * @param auto_adjust_size 是否根据子控件和文本自动调整控件自身大小。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setAutoAdjustSize(boolean auto_adjust_size)  {
   return TRet.from(widget_set_auto_adjust_size(this != null ? (this.nativeObj) : 0, auto_adjust_size));
 }


  /**
   * 设置控件的floating标志。
   *> floating的控件不受父控件的子控件布局参数的影响。
   * 
   * @param floating 是否启用floating布局。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setFloating(boolean floating)  {
   return TRet.from(widget_set_floating(this != null ? (this.nativeObj) : 0, floating));
 }


  /**
   * 设置控件是否获得焦点。
   * 
   * @param focused 是否获得焦点。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setFocused(boolean focused)  {
   return TRet.from(widget_set_focused(this != null ? (this.nativeObj) : 0, focused));
 }


  /**
   * 设置控件是否可获得焦点。
   * 
   * @param focusable 是否可获得焦点。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setFocusable(boolean focusable)  {
   return TRet.from(widget_set_focusable(this != null ? (this.nativeObj) : 0, focusable));
 }


  /**
   * 设置控件的状态。
   * 
   * @param state 状态(必须为真正的常量字符串，在widget的整个生命周期有效)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setState(String state)  {
   return TRet.from(widget_set_state(this != null ? (this.nativeObj) : 0, state));
 }


  /**
   * 设置控件的不透明度。
   *
   *>在嵌入式平台，半透明效果会使性能大幅下降，请谨慎使用。
   * 
   * @param opacity 不透明度(取值0-255，0表示完全透明，255表示完全不透明)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setOpacity(int opacity)  {
   return TRet.from(widget_set_opacity(this != null ? (this.nativeObj) : 0, opacity));
 }


  /**
   * 设置控件脏矩形超出控件本身大小的最大范围(一般不用指定)。
   * 
   * @param dirty_rect_tolerance 控件脏脏矩形超出控件本身大小的最大范。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setDirtyRectTolerance(int dirty_rect_tolerance)  {
   return TRet.from(widget_set_dirty_rect_tolerance(this != null ? (this.nativeObj) : 0, dirty_rect_tolerance));
 }


  /**
   * 销毁全部子控件。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet destroyChildren()  {
   return TRet.from(widget_destroy_children(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 加入一个子控件。
   * 
   * @param child 子控件对象。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet addChild(TWidget child)  {
   return TRet.from(widget_add_child(this != null ? (this.nativeObj) : 0, child != null ? (child.nativeObj) : 0));
 }


  /**
   * 移出指定的子控件(并不销毁)。
   * 
   * @param child 子控件对象。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet removeChild(TWidget child)  {
   return TRet.from(widget_remove_child(this != null ? (this.nativeObj) : 0, child != null ? (child.nativeObj) : 0));
 }


  /**
   * 插入子控件到指定的位置。
   * 
   * @param index 位置序数(大于等于总个数，则放到最后)。
   * @param child 子控件对象。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet insertChild(int index, TWidget child)  {
   return TRet.from(widget_insert_child(this != null ? (this.nativeObj) : 0, index, child != null ? (child.nativeObj) : 0));
 }


  /**
   * 调整控件在父控件中的位置序数。
   * 
   * @param index 位置序数(大于等于总个数，则放到最后)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet restack(int index)  {
   return TRet.from(widget_restack(this != null ? (this.nativeObj) : 0, index));
 }


  /**
   * 查找指定名称的子控件(同widget_lookup(widget, name, FALSE))。
   * 
   * @param name 子控件的名称。
   *
   * @return 子控件或NULL。
   */
 public  TWidget child(String name)  {
    return new TWidget(widget_child(this != null ? (this.nativeObj) : 0, name));
 }


  /**
   * 查找指定名称的子控件(返回第一个)。
   * 
   * @param name 子控件的名称。
   * @param recursive 是否递归查找全部子控件。
   *
   * @return 子控件或NULL。
   */
 public  TWidget lookup(String name, boolean recursive)  {
    return new TWidget(widget_lookup(this != null ? (this.nativeObj) : 0, name, recursive));
 }


  /**
   * 查找指定类型的子控件(返回第一个)。
   * 
   * @param type 子控件的名称。
   * @param recursive 是否递归查找全部子控件。
   *
   * @return 子控件或NULL。
   */
 public  TWidget lookupByType(String type, boolean recursive)  {
    return new TWidget(widget_lookup_by_type(this != null ? (this.nativeObj) : 0, type, recursive));
 }


  /**
   * 设置控件的可见性。
   * 
   * @param visible 是否可见。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setVisible(boolean visible)  {
   return TRet.from(widget_set_visible(this != null ? (this.nativeObj) : 0, visible));
 }


  /**
   * 设置控件的可见性(不触发repaint和relayout)。
   * 
   * @param visible 是否可见。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setVisibleOnly(boolean visible)  {
   return TRet.from(widget_set_visible_only(this != null ? (this.nativeObj) : 0, visible));
 }


  /**
   * 设置控件是否接受用户事件。
   * 
   * @param sensitive 是否接受用户事件。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setSensitive(boolean sensitive)  {
   return TRet.from(widget_set_sensitive(this != null ? (this.nativeObj) : 0, sensitive));
 }


  /**
   * widget_t* ok = button_create(win, 10, 10, 80, 30);
   *widget_on(ok, EVT_CLICK, on_click, NULL);
   *
   *```
   * 
   * @param type 事件类型。
   * @param on_event 事件处理函数。
   * @param ctx 事件处理函数上下文。
   *
   * @return 返回id，用于widget_off。
   */
 public  int on(TEventType type, TOnEvent on_event, long ctx)  {
    return widget_on(this != null ? (this.nativeObj) : 0, type.value(), on_event, ctx);
 }


  /**
   * 注销指定事件的处理函数。
   * 
   * @param id widget_on返回的ID。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet off(int id)  {
   return TRet.from(widget_off(this != null ? (this.nativeObj) : 0, id));
 }


  /**
   * 请求强制重绘控件。
   * 
   * @param r 矩形对象(widget本地坐标)。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet invalidateForce(TRect r)  {
   return TRet.from(widget_invalidate_force(this != null ? (this.nativeObj) : 0, r != null ? (r.nativeObj) : 0));
 }


  /**
   * 设置多个参数。
   *>参数之间用&分隔，名称和值之间用=分隔。如: name=awtk&min=10&max=100
   * 
   * @param params 参数列表。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setProps(String params)  {
   return TRet.from(widget_set_props(this != null ? (this.nativeObj) : 0, params));
 }


  /**
   * 设置字符串格式的属性。
   * 
   * @param name 属性的名称。
   * @param v 属性的值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setPropStr(String name, String v)  {
   return TRet.from(widget_set_prop_str(this != null ? (this.nativeObj) : 0, name, v));
 }


  /**
   * 获取字符串格式的属性。
   * 
   * @param name 属性的名称。
   * @param defval 缺省值。
   *
   * @return 返回属性的值。
   */
 public  String getPropStr(String name, String defval)  {
    return widget_get_prop_str(this != null ? (this.nativeObj) : 0, name, defval);
 }


  /**
   * 设置指针格式的属性。
   * 
   * @param name 属性的名称。
   * @param v 属性的值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setPropPointer(String name, long v)  {
   return TRet.from(widget_set_prop_pointer(this != null ? (this.nativeObj) : 0, name, v));
 }


  /**
   * 获取指针格式的属性。
   * 
   * @param name 属性的名称。
   *
   * @return 返回属性的值。
   */
 public  long getPropPointer(String name)  {
    return widget_get_prop_pointer(this != null ? (this.nativeObj) : 0, name);
 }


  /**
   * 设置浮点数格式的属性。
   * 
   * @param name 属性的名称。
   * @param v 属性的值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setPropFloat(String name, double v)  {
   return TRet.from(widget_set_prop_float(this != null ? (this.nativeObj) : 0, name, v));
 }


  /**
   * 获取浮点数格式的属性。
   * 
   * @param name 属性的名称。
   * @param defval 缺省值。
   *
   * @return 返回属性的值。
   */
 public  double getPropFloat(String name, double defval)  {
    return widget_get_prop_float(this != null ? (this.nativeObj) : 0, name, defval);
 }


  /**
   * 设置整数格式的属性。
   * 
   * @param name 属性的名称。
   * @param v 属性的值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setPropInt(String name, int v)  {
   return TRet.from(widget_set_prop_int(this != null ? (this.nativeObj) : 0, name, v));
 }


  /**
   * 获取整数格式的属性。
   * 
   * @param name 属性的名称。
   * @param defval 缺省值。
   *
   * @return 返回属性的值。
   */
 public  int getPropInt(String name, int defval)  {
    return widget_get_prop_int(this != null ? (this.nativeObj) : 0, name, defval);
 }


  /**
   * 设置布尔格式的属性。
   * 
   * @param name 属性的名称。
   * @param v 属性的值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setPropBool(String name, boolean v)  {
   return TRet.from(widget_set_prop_bool(this != null ? (this.nativeObj) : 0, name, v));
 }


  /**
   * 获取布尔格式的属性。
   * 
   * @param name 属性的名称。
   * @param defval 缺省值。
   *
   * @return 返回属性的值。
   */
 public  boolean getPropBool(String name, boolean defval)  {
    return widget_get_prop_bool(this != null ? (this.nativeObj) : 0, name, defval);
 }


  /**
   * 判断当前控件所在的窗口是否已经打开。
   * 
   *
   * @return 返回当前控件所在的窗口是否已经打开。
   */
 public  boolean isWindowOpened()  {
    return widget_is_window_opened(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 判断窗口及子控件创建或加载是否完成。
   * 
   *
   * @return 返回创建或加载是否完成。
   */
 public  boolean isWindowCreated()  {
    return widget_is_window_created(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 判断当前控件是否是指定控件的父控件(包括非直系)。
   * 
   * @param child 控件对象。
   *
   * @return 返回TRUE表示是，否则表示不是。
   */
 public  boolean isParentOf(TWidget child)  {
    return widget_is_parent_of(this != null ? (this.nativeObj) : 0, child != null ? (child.nativeObj) : 0);
 }


  /**
   * 判断当前控件是否是指定控件的直系父控件。
   * 
   * @param child 控件对象。
   *
   * @return 返回TRUE表示是，否则表示不是。
   */
 public  boolean isDirectParentOf(TWidget child)  {
    return widget_is_direct_parent_of(this != null ? (this.nativeObj) : 0, child != null ? (child.nativeObj) : 0);
 }


  /**
   * 判断当前控件是否是窗口。
   * 
   *
   * @return 返回当前控件是否是窗口。
   */
 public  boolean isWindow()  {
    return widget_is_window(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 检查控件是否是system bar类型。
   * 
   *
   * @return 返回FALSE表示不是，否则表示是。
   */
 public  boolean isSystemBar()  {
    return widget_is_system_bar(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 检查控件是否是普通窗口类型。
   * 
   *
   * @return 返回FALSE表示不是，否则表示是。
   */
 public  boolean isNormalWindow()  {
    return widget_is_normal_window(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 检查控件是否是对话框类型。
   * 
   *
   * @return 返回FALSE表示不是，否则表示是。
   */
 public  boolean isDialog()  {
    return widget_is_dialog(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 检查控件是否是弹出窗口类型。
   * 
   *
   * @return 返回FALSE表示不是，否则表示是。
   */
 public  boolean isPopup()  {
    return widget_is_popup(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 检查控件是否是overlay窗口类型。
   * 
   *
   * @return 返回FALSE表示不是，否则表示是。
   */
 public  boolean isOverlay()  {
    return widget_is_overlay(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 检查控件弹出对话框控件是否已经打开了（而非挂起状态）。
   * 
   *
   * @return 返回FALSE表示不是，否则表示是。
   */
 public  boolean isOpenedDialog()  {
    return widget_is_opened_dialog(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 检查控件弹出窗口控件是否已经打开了（而非挂起状态）。
   * 
   *
   * @return 返回FALSE表示不是，否则表示是。
   */
 public  boolean isOpenedPopup()  {
    return widget_is_opened_popup(this != null ? (this.nativeObj) : 0);
 }


  /**
   * widget_set_prop_bool(group, WIDGET_PROP_IS_KEYBOARD, TRUE);
   *```
   * 
   *
   * @return 返回FALSE表示不是，否则表示是。
   */
 public  boolean isKeyboard()  {
    return widget_is_keyboard(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 判断当前控件是否是设计窗口。
   * 
   *
   * @return 返回当前控件是否是设计窗口。
   */
 public  boolean isDesigningWindow()  {
    return widget_is_designing_window(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 判断当前控件是否是窗口管理器。
   * 
   *
   * @return 返回当前控件是否是窗口管理器。
   */
 public  boolean isWindowManager()  {
    return widget_is_window_manager(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 遍历当前控件及子控件。
   * 
   * @param visit 遍历的回调函数。
   * @param ctx 回调函数的上下文。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet foreach(TOnWidget visit, long ctx)  {
   return TRet.from(widget_foreach(this != null ? (this.nativeObj) : 0, visit, ctx));
 }


  /**
   * 获取当前控件所在的窗口。
   * 
   *
   * @return 窗口对象。
   */
 public  TWidget getWindow()  {
    return new TWidget(widget_get_window(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 获取当前的窗口管理器。
   * 
   *
   * @return 窗口管理器对象。
   */
 public  TWidget getWindowManager()  {
    return new TWidget(widget_get_window_manager(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 获取当前控件的类型名称。
   * 
   *
   * @return 返回类型名。
   */
 public  String getType()  {
    return widget_get_type(this != null ? (this.nativeObj) : 0);
 }


  /**
   * clone。
   * 
   * @param parent clone新控件的parent对象。
   *
   * @return 返回clone的对象。
   */
 public  TWidget clone(TWidget parent)  {
    return new TWidget(widget_clone(this != null ? (this.nativeObj) : 0, parent != null ? (parent.nativeObj) : 0));
 }


  /**
   * 判断两个widget是否相同。
   * 
   * @param other 要比较的控件对象。
   *
   * @return 返回TRUE表示相同，否则表示不同。
   */
 public  boolean equal(TWidget other)  {
    return widget_equal(this != null ? (this.nativeObj) : 0, other != null ? (other.nativeObj) : 0);
 }


  /**
   * 转换为widget对象(供脚本语言使用)。
   * 
   * @param widget widget对象。
   *
   * @return widget对象。
   */
 public  static TWidget cast(TWidget widget)  {
    return new TWidget(widget_cast(widget != null ? (widget.nativeObj) : 0));
 }


  /**
   * 从父控件中移除控件，并调用unref函数销毁控件。
   *
   *> 一般无需直接调用，关闭窗口时，自动销毁相关控件。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet destroy()  {
   return TRet.from(widget_destroy(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 从父控件中移除控件，并调用unref函数销毁控件。
   *
   *> 一般无需直接调用，关闭窗口时，自动销毁相关控件。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet destroyAsync()  {
   return TRet.from(widget_destroy_async(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 减少控件的引用计数。引用计数为0时销毁控件。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet unref()  {
   return TRet.from(widget_unref(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 根据控件的style绘制边框矩形。
   * 
   * @param c 画布对象。
   * @param r 矩形区域。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet strokeBorderRect(TCanvas c, TRect r)  {
   return TRet.from(widget_stroke_border_rect(this != null ? (this.nativeObj) : 0, c != null ? (c.nativeObj) : 0, r != null ? (r.nativeObj) : 0));
 }


  /**
   * 根据控件的style绘制背景矩形。
   * 
   * @param c 画布对象。
   * @param r 矩形区域。
   * @param draw_type 图片缺省绘制方式。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet fillBgRect(TCanvas c, TRect r, TImageDrawType draw_type)  {
   return TRet.from(widget_fill_bg_rect(this != null ? (this.nativeObj) : 0, c != null ? (c.nativeObj) : 0, r != null ? (r.nativeObj) : 0, draw_type.value()));
 }


  /**
   * 根据控件的style绘制前景矩形。
   * 
   * @param c 画布对象。
   * @param r 矩形区域。
   * @param draw_type 图片缺省绘制方式。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet fillFgRect(TCanvas c, TRect r, TImageDrawType draw_type)  {
   return TRet.from(widget_fill_fg_rect(this != null ? (this.nativeObj) : 0, c != null ? (c.nativeObj) : 0, r != null ? (r.nativeObj) : 0, draw_type.value()));
 }


  /**
   * 递归的分发一个事件到所有target子控件。
   * 
   * @param e 事件。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet dispatchToTarget(TEvent e)  {
   return TRet.from(widget_dispatch_to_target(this != null ? (this.nativeObj) : 0, e != null ? (e.nativeObj) : 0));
 }


  /**
   * 递归的分发一个事件到所有key_target子控件。
   * 
   * @param e 事件。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet dispatchToKeyTarget(TEvent e)  {
   return TRet.from(widget_dispatch_to_key_target(this != null ? (this.nativeObj) : 0, e != null ? (e.nativeObj) : 0));
 }


  /**
   * 获取 widget 对应风格类型
   * 
   *
   * @return 返回 widget 的对应风格类型。
   */
 public  String getStyleType()  {
    return widget_get_style_type(this != null ? (this.nativeObj) : 0);
 }


  /**
   * 让控件根据自己当前状态更新style。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet updateStyle()  {
   return TRet.from(widget_update_style(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 让控件及子控件根据自己当前状态更新style。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet updateStyleRecursive()  {
   return TRet.from(widget_update_style_recursive(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 递归的把父控件的key_target设置为自己。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setAsKeyTarget()  {
   return TRet.from(widget_set_as_key_target(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 把焦点移动下一个控件。
   *
   *>widget必须是当前焦点控件。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet focusNext()  {
   return TRet.from(widget_focus_next(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 把焦点移动前一个控件。
   *
   *>widget必须是当前焦点控件。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet focusPrev()  {
   return TRet.from(widget_focus_prev(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 把控件的状态转成获取style选要的状态，一般只在子类中使用。
   * 
   * @param active 控件是否为当前项。
   * @param checked 控件是否为选中项。
   *
   * @return 返回状态值。
   */
 public  String getStateForStyle(boolean active, boolean checked)  {
    return widget_get_state_for_style(this != null ? (this.nativeObj) : 0, active, checked);
 }


  /**
   * 布局当前控件及子控件。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet layout()  {
   return TRet.from(widget_layout(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 设置控件自己的布局参数。
   * 
   * @param params 布局参数。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setSelfLayout(String params)  {
   return TRet.from(widget_set_self_layout(this != null ? (this.nativeObj) : 0, params));
 }


  /**
   * 设置子控件的布局参数。
   * 
   * @param params 布局参数。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setChildrenLayout(String params)  {
   return TRet.from(widget_set_children_layout(this != null ? (this.nativeObj) : 0, params));
 }


  /**
   * 设置控件自己的布局(缺省布局器)参数(过时，请用widget\_set\_self\_layout)。
   * 
   * @param x x参数。
   * @param y y参数。
   * @param w w参数。
   * @param h h参数。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setSelfLayoutParams(String x, String y, String w, String h)  {
   return TRet.from(widget_set_self_layout_params(this != null ? (this.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 设置整数类型的style。
   *
   *> * [state 的取值](https://github.com/zlgopen/awtk/blob/master/docs/manual/widget_state_t.md)
   *> * [name 的取值](https://github.com/zlgopen/awtk/blob/master/docs/theme.md)
   * 
   * @param state_and_name 状态和名字，用英文的冒号分隔。
   * @param value 值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setStyleInt(String state_and_name, int value)  {
   return TRet.from(widget_set_style_int(this != null ? (this.nativeObj) : 0, state_and_name, value));
 }


  /**
   * 设置字符串类型的style。
   *
   *> * [state 的取值](https://github.com/zlgopen/awtk/blob/master/docs/manual/widget_state_t.md)
   *> * [name 的取值](https://github.com/zlgopen/awtk/blob/master/docs/theme.md)
   * 
   * @param state_and_name 状态和名字，用英文的冒号分隔。
   * @param value 值。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setStyleStr(String state_and_name, String value)  {
   return TRet.from(widget_set_style_str(this != null ? (this.nativeObj) : 0, state_and_name, value));
 }


  /**
   * widget_set_style_color(label, "normal:bg_color", 0xFF332211);
   *```
   * 
   * @param state_and_name 状态和名字，用英文的冒号分隔。
   * @param value 值。颜色值一般用十六进制表示，每两个数字表示一个颜色通道，从高位到低位，依次是ABGR。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setStyleColor(String state_and_name, int value)  {
   return TRet.from(widget_set_style_color(this != null ? (this.nativeObj) : 0, state_and_name, value));
 }


  /**
   * 加入一个子控件默认实现(供子类调用)。
   * 
   * @param child 子控件对象。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet addChildDefault(TWidget child)  {
   return TRet.from(widget_add_child_default(this != null ? (this.nativeObj) : 0, child != null ? (child.nativeObj) : 0));
 }


  /**
   * x坐标(相对于父控件的x坐标)。
   *
   */
 public int getX() {
   return widget_t_get_prop_x(this.nativeObj);
 }


  /**
   * y坐标(相对于父控件的y坐标)。
   *
   */
 public int getY() {
   return widget_t_get_prop_y(this.nativeObj);
 }


  /**
   * 宽度。
   *
   */
 public int getW() {
   return widget_t_get_prop_w(this.nativeObj);
 }


  /**
   * 高度。
   *
   */
 public int getH() {
   return widget_t_get_prop_h(this.nativeObj);
 }


  /**
   * 控件名字。
   *
   */
 public String getName() {
   return widget_t_get_prop_name(this.nativeObj);
 }


  /**
   * 鼠标光标图片名称。
   *
   */
 public String getPointerCursor() {
   return widget_t_get_prop_pointer_cursor(this.nativeObj);
 }


  /**
   * 保存用于翻译的字符串。
   *
   */
 public String getTrText() {
   return widget_t_get_prop_tr_text(this.nativeObj);
 }


  /**
   * style的名称。
   *
   */
 public String getStyle() {
   return widget_t_get_prop_style(this.nativeObj);
 }


  /**
   * 动画参数。请参考[控件动画](https://github.com/zlgopen/awtk/blob/master/docs/widget_animator.md)
   *
   */
 public String getAnimation() {
   return widget_t_get_prop_animation(this.nativeObj);
 }


  /**
   * 不透明度(0-255)，0完全透明，255完全不透明。
   *
   */
 public int getOpacity() {
   return widget_t_get_prop_opacity(this.nativeObj);
 }


  /**
   * 脏矩形超出控件本身大小的最大范围(一般不用指定)。
   *
   *> 如果 border 太粗或 offset 太大等原因，导致脏矩形超出控件本身大小太多（大于缺省值）时，才需要指定。
   *
   */
 public int getDirtyRectTolerance() {
   return widget_t_get_prop_dirty_rect_tolerance(this.nativeObj);
 }


  /**
   * 父控件
   *
   */
 public TWidget getParent() {
   return new TWidget(widget_t_get_prop_parent(this.nativeObj));
 }

static private native int widget_count_children(long widget);
static private native long widget_get_child(long widget, int index);
static private native long widget_find_parent_by_name(long widget, String name);
static private native long widget_find_parent_by_type(long widget, String type);
static private native long widget_get_focused_widget(long widget);
static private native long widget_get_native_window(long widget);
static private native int widget_index_of(long widget);
static private native int widget_close_window(long widget);
static private native int widget_close_window_force(long widget);
static private native int widget_back(long widget);
static private native int widget_back_to_home(long widget);
static private native int widget_move(long widget, int x, int y);
static private native int widget_move_to_center(long widget);
static private native int widget_resize(long widget, int w, int h);
static private native int widget_move_resize(long widget, int x, int y, int w, int h);
static private native double widget_get_value(long widget);
static private native int widget_set_value(long widget, double value);
static private native int widget_add_value(long widget, double delta);
static private native int widget_get_value_int(long widget);
static private native int widget_set_value_int(long widget, int value);
static private native int widget_add_value_int(long widget, int delta);
static private native int widget_animate_value_to(long widget, double value, int duration);
static private native boolean widget_is_style_exist(long widget, String style_name, String state_name);
static private native int widget_use_style(long widget, String style);
static private native int widget_set_text_utf8(long widget, String text);
static private native int widget_set_text_utf8_ex(long widget, String text, boolean check_diff);
static private native int widget_set_child_text_utf8(long widget, String name, String text);
static private native int widget_set_child_text_with_double(long widget, String name, String format, double value);
static private native int widget_set_child_text_with_int(long widget, String name, String format, int value);
static private native int widget_set_tr_text(long widget, String text);
static private native boolean widget_get_enable(long widget);
static private native boolean widget_get_floating(long widget);
static private native boolean widget_get_auto_adjust_size(long widget);
static private native boolean widget_get_with_focus_state(long widget);
static private native boolean widget_get_focusable(long widget);
static private native boolean widget_get_sensitive(long widget);
static private native boolean widget_get_visible(long widget);
static private native boolean widget_get_feedback(long widget);
static private native long widget_get_text(long widget);
static private native int widget_set_name(long widget, String name);
static private native int widget_set_theme(long widget, String name);
static private native String widget_get_theme_name(long widget);
static private native int widget_set_pointer_cursor(long widget, String cursor);
static private native int widget_set_animation(long widget, String animation);
static private native int widget_create_animator(long widget, String animation);
static private native int widget_start_animator(long widget, String name);
static private native int widget_set_animator_time_scale(long widget, String name, double time_scale);
static private native int widget_pause_animator(long widget, String name);
static private native int widget_stop_animator(long widget, String name);
static private native int widget_destroy_animator(long widget, String name);
static private native int widget_set_enable(long widget, boolean enable);
static private native int widget_set_feedback(long widget, boolean feedback);
static private native int widget_set_auto_adjust_size(long widget, boolean auto_adjust_size);
static private native int widget_set_floating(long widget, boolean floating);
static private native int widget_set_focused(long widget, boolean focused);
static private native int widget_set_focusable(long widget, boolean focusable);
static private native int widget_set_state(long widget, String state);
static private native int widget_set_opacity(long widget, int opacity);
static private native int widget_set_dirty_rect_tolerance(long widget, int dirty_rect_tolerance);
static private native int widget_destroy_children(long widget);
static private native int widget_add_child(long widget, long child);
static private native int widget_remove_child(long widget, long child);
static private native int widget_insert_child(long widget, int index, long child);
static private native int widget_restack(long widget, int index);
static private native long widget_child(long widget, String name);
static private native long widget_lookup(long widget, String name, boolean recursive);
static private native long widget_lookup_by_type(long widget, String type, boolean recursive);
static private native int widget_set_visible(long widget, boolean visible);
static private native int widget_set_visible_only(long widget, boolean visible);
static private native int widget_set_sensitive(long widget, boolean sensitive);
static private native int widget_on(long widget, int type, TOnEvent on_event, long ctx);
static private native int widget_off(long widget, int id);
static private native int widget_invalidate_force(long widget, long r);
static private native int widget_set_props(long widget, String params);
static private native int widget_set_prop_str(long widget, String name, String v);
static private native String widget_get_prop_str(long widget, String name, String defval);
static private native int widget_set_prop_pointer(long widget, String name, long v);
static private native long widget_get_prop_pointer(long widget, String name);
static private native int widget_set_prop_float(long widget, String name, double v);
static private native double widget_get_prop_float(long widget, String name, double defval);
static private native int widget_set_prop_int(long widget, String name, int v);
static private native int widget_get_prop_int(long widget, String name, int defval);
static private native int widget_set_prop_bool(long widget, String name, boolean v);
static private native boolean widget_get_prop_bool(long widget, String name, boolean defval);
static private native boolean widget_is_window_opened(long widget);
static private native boolean widget_is_window_created(long widget);
static private native boolean widget_is_parent_of(long widget, long child);
static private native boolean widget_is_direct_parent_of(long widget, long child);
static private native boolean widget_is_window(long widget);
static private native boolean widget_is_system_bar(long widget);
static private native boolean widget_is_normal_window(long widget);
static private native boolean widget_is_dialog(long widget);
static private native boolean widget_is_popup(long widget);
static private native boolean widget_is_overlay(long widget);
static private native boolean widget_is_opened_dialog(long widget);
static private native boolean widget_is_opened_popup(long widget);
static private native boolean widget_is_keyboard(long widget);
static private native boolean widget_is_designing_window(long widget);
static private native boolean widget_is_window_manager(long widget);
static private native int widget_foreach(long widget, TOnWidget visit, long ctx);
static private native long widget_get_window(long widget);
static private native long widget_get_window_manager(long widget);
static private native String widget_get_type(long widget);
static private native long widget_clone(long widget, long parent);
static private native boolean widget_equal(long widget, long other);
static private native long widget_cast(long widget);
static private native int widget_destroy(long widget);
static private native int widget_destroy_async(long widget);
static private native int widget_unref(long widget);
static private native int widget_stroke_border_rect(long widget, long c, long r);
static private native int widget_fill_bg_rect(long widget, long c, long r, int draw_type);
static private native int widget_fill_fg_rect(long widget, long c, long r, int draw_type);
static private native int widget_dispatch_to_target(long widget, long e);
static private native int widget_dispatch_to_key_target(long widget, long e);
static private native String widget_get_style_type(long widget);
static private native int widget_update_style(long widget);
static private native int widget_update_style_recursive(long widget);
static private native int widget_set_as_key_target(long widget);
static private native int widget_focus_next(long widget);
static private native int widget_focus_prev(long widget);
static private native String widget_get_state_for_style(long widget, boolean active, boolean checked);
static private native int widget_layout(long widget);
static private native int widget_set_self_layout(long widget, String params);
static private native int widget_set_children_layout(long widget, String params);
static private native int widget_set_self_layout_params(long widget, String x, String y, String w, String h);
static private native int widget_set_style_int(long widget, String state_and_name, int value);
static private native int widget_set_style_str(long widget, String state_and_name, String value);
static private native int widget_set_style_color(long widget, String state_and_name, int value);
static private native int widget_add_child_default(long widget, long child);
static private native int widget_t_get_prop_x(long nativeObj);
static private native int widget_t_get_prop_y(long nativeObj);
static private native int widget_t_get_prop_w(long nativeObj);
static private native int widget_t_get_prop_h(long nativeObj);
static private native String widget_t_get_prop_name(long nativeObj);
static private native String widget_t_get_prop_pointer_cursor(long nativeObj);
static private native String widget_t_get_prop_tr_text(long nativeObj);
static private native String widget_t_get_prop_style(long nativeObj);
static private native String widget_t_get_prop_animation(long nativeObj);
static private native boolean widget_t_get_prop_enable(long nativeObj);
static private native boolean widget_t_get_prop_feedback(long nativeObj);
static private native boolean widget_t_get_prop_visible(long nativeObj);
static private native boolean widget_t_get_prop_sensitive(long nativeObj);
static private native boolean widget_t_get_prop_focusable(long nativeObj);
static private native boolean widget_t_get_prop_with_focus_state(long nativeObj);
static private native boolean widget_t_get_prop_auto_adjust_size(long nativeObj);
static private native boolean widget_t_get_prop_floating(long nativeObj);
static private native int widget_t_get_prop_opacity(long nativeObj);
static private native int widget_t_get_prop_dirty_rect_tolerance(long nativeObj);
static private native long widget_t_get_prop_parent(long nativeObj);
};