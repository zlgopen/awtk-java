package awtk;



/**
 * 类型常量定义。
 *
 */

public enum TEventType {
  
  /**
   * 指针按下事件名(pointer_event_t)。
   *
   */
 
  POINTER_DOWN (EVT_POINTER_DOWN()),
  
  /**
   * 指针按下事件名，在子控件处理之前触发(pointer_event_t)。
   *
   */
 
  POINTER_DOWN_BEFORE_CHILDREN (EVT_POINTER_DOWN_BEFORE_CHILDREN()),
  
  /**
   * 指针移动事件名(pointer_event_t)。
   *
   */
 
  POINTER_MOVE (EVT_POINTER_MOVE()),
  
  /**
   * 指针移动事件名，在子控件处理之前触发(pointer_event_t)。
   *
   */
 
  POINTER_MOVE_BEFORE_CHILDREN (EVT_POINTER_MOVE_BEFORE_CHILDREN()),
  
  /**
   * 指针抬起事件名(pointer_event_t)。
   *
   */
 
  POINTER_UP (EVT_POINTER_UP()),
  
  /**
   * 指针抬起事件名，在子控件处理之前触发(pointer_event_t)。
   *
   */
 
  POINTER_UP_BEFORE_CHILDREN (EVT_POINTER_UP_BEFORE_CHILDREN()),
  
  /**
   * 滚轮事件名(wheel_event_t)。
   *
   */
 
  WHEEL (EVT_WHEEL()),
  
  /**
   * 鼠标滚轮事件名，在子控件处理之前触发(wheel_event_t)。
   *
   */
 
  WHEEL_BEFORE_CHILDREN (EVT_WHEEL_BEFORE_CHILDREN()),
  
  /**
   * 取消前一个指针按下事件名(pointer_event_t)。
   *
   */
 
  POINTER_DOWN_ABORT (EVT_POINTER_DOWN_ABORT()),
  
  /**
   * 右键/长按弹出上下文菜单的事件名(pointer_event_t)。
   *
   */
 
  CONTEXT_MENU (EVT_CONTEXT_MENU()),
  
  /**
   * 指针进入事件名(pointer_event_t)。
   *
   */
 
  POINTER_ENTER (EVT_POINTER_ENTER()),
  
  /**
   * 指针离开事件名(pointer_event_t)。
   *
   */
 
  POINTER_LEAVE (EVT_POINTER_LEAVE()),
  
  /**
   * 长按事件名(pointer_event_t)。
   *
   */
 
  LONG_PRESS (EVT_LONG_PRESS()),
  
  /**
   * 点击事件名(pointer_event_t)。
   *
   */
 
  CLICK (EVT_CLICK()),
  
  /**
   * 双击事件名(pointer_event_t)。
   *
   */
 
  DOUBLE_CLICK (EVT_DOUBLE_CLICK()),
  
  /**
   * 得到焦点事件名(event_t)。
   *
   */
 
  FOCUS (EVT_FOCUS()),
  
  /**
   * 失去焦点事件名(event_t)。
   *
   */
 
  BLUR (EVT_BLUR()),
  
  /**
   * 键按下事件名(key_event_t)。
   *
   */
 
  KEY_DOWN (EVT_KEY_DOWN()),
  
  /**
   * 键长按事件名(key_event_t)。
   *
   */
 
  KEY_LONG_PRESS (EVT_KEY_LONG_PRESS()),
  
  /**
   * 键按下事件名，在子控件处理之前触发(key_event_t)。
   *
   */
 
  KEY_DOWN_BEFORE_CHILDREN (EVT_KEY_DOWN_BEFORE_CHILDREN()),
  
  /**
   * 按键repeat事件名(key_event_t)。
   *
   */
 
  KEY_REPEAT (EVT_KEY_REPEAT()),
  
  /**
   * 键抬起事件名(key_event_t)。
   *
   */
 
  KEY_UP (EVT_KEY_UP()),
  
  /**
   * 键抬起事件名，在子控件处理之前触发(key_event_t)。
   *
   */
 
  KEY_UP_BEFORE_CHILDREN (EVT_KEY_UP_BEFORE_CHILDREN()),
  
  /**
   * 即将移动Widget的事件名(event_t)。
   *
   */
 
  WILL_MOVE (EVT_WILL_MOVE()),
  
  /**
   * 移动Widget的事件名(event_t)。
   *
   */
 
  MOVE (EVT_MOVE()),
  
  /**
   * 即将调整Widget大小的事件名(event_t)。
   *
   */
 
  WILL_RESIZE (EVT_WILL_RESIZE()),
  
  /**
   * 调整Widget大小的事件名(event_t)。
   *
   */
 
  RESIZE (EVT_RESIZE()),
  
  /**
   * 即将调整Widget大小/位置的事件名(event_t)。
   *
   */
 
  WILL_MOVE_RESIZE (EVT_WILL_MOVE_RESIZE()),
  
  /**
   * 调整Widget大小/位置的事件名(event_t)。
   *
   */
 
  MOVE_RESIZE (EVT_MOVE_RESIZE()),
  
  /**
   * 绘制的事件名(paint_event_t)。
   *
   */
 
  PAINT (EVT_PAINT()),
  
  /**
   * 即将绘制的事件名(paint_event_t)。
   *
   */
 
  BEFORE_PAINT (EVT_BEFORE_PAINT()),
  
  /**
   * 绘制完成的事件名(paint_event_t)。
   *
   */
 
  AFTER_PAINT (EVT_AFTER_PAINT()),
  
  /**
   * 绘制完成(canvas状态已经恢复)的事件名(paint_event_t)。
   *
   */
 
  PAINT_DONE (EVT_PAINT_DONE()),
  
  /**
   * locale改变的事件(event_t)。
   *
   */
 
  LOCALE_CHANGED (EVT_LOCALE_CHANGED()),
  
  /**
   * 控件动画开始事件(event_t)。
   *
   */
 
  ANIM_START (EVT_ANIM_START()),
  
  /**
   * 控件动画被主动停止的事件(event_t)。
   *
   */
 
  ANIM_STOP (EVT_ANIM_STOP()),
  
  /**
   * 控件动画被暂停的事件(event_t)。
   *
   */
 
  ANIM_PAUSE (EVT_ANIM_PAUSE()),
  
  /**
   * 控件动画yoyo/repeat时，完成一次的事件(event_t)。
   *
   */
 
  ANIM_ONCE (EVT_ANIM_ONCE()),
  
  /**
   * 控件动画完成事件(event_t)。
   *
   */
 
  ANIM_END (EVT_ANIM_END()),
  
  /**
   * 窗口加载完成事件(event_t)。
   *
   */
 
  WINDOW_LOAD (EVT_WINDOW_LOAD()),
  
  /**
   * 控件加载完成事件(event_t)。
   *
   */
 
  WIDGET_LOAD (EVT_WIDGET_LOAD()),
  
  /**
   * 窗口即将打开事件(event_t)。
   *如果有窗口动画，在窗口动画开始前触发。如果没有窗口动画，在窗口被加载后的下一次循环中触发。
   *
   */
 
  WINDOW_WILL_OPEN (EVT_WINDOW_WILL_OPEN()),
  
  /**
   * 窗口打开事件(event_t)。
   *如果有窗口动画，在窗口动画完成时触发。如果没有窗口动画，在窗口被加载后的下一次循环中触发。
   *
   */
 
  WINDOW_OPEN (EVT_WINDOW_OPEN()),
  
  /**
   * 窗口被切换到后台事件(event_t)。
   *打开新窗口时，当前窗口被切换到后台时，对当前窗口触发本事件。
   *
   */
 
  WINDOW_TO_BACKGROUND (EVT_WINDOW_TO_BACKGROUND()),
  
  /**
   * 窗口被切换到前台事件(event_t)。
   *关闭当前窗口时，前一个窗口被切换到前台时，对前一个窗口触发本事件。
   *
   */
 
  WINDOW_TO_FOREGROUND (EVT_WINDOW_TO_FOREGROUND()),
  
  /**
   * 窗口关闭事件。
   *
   */
 
  WINDOW_CLOSE (EVT_WINDOW_CLOSE()),
  
  /**
   * 请求关闭窗口的事件(event_t)。
   *
   */
 
  REQUEST_CLOSE_WINDOW (EVT_REQUEST_CLOSE_WINDOW()),
  
  /**
   * 顶层窗口改变的事件(window_event_t)。
   *
   */
 
  TOP_WINDOW_CHANGED (EVT_TOP_WINDOW_CHANGED()),
  
  /**
   * 输入法启动(event_t)。
   *
   */
 
  IM_START (EVT_IM_START()),
  
  /**
   * 输入法停止(event_t)。
   *
   */
 
  IM_STOP (EVT_IM_STOP()),
  
  /**
   * 输入法提交输入的文本事件(im_commit_event_t)。
   *
   */
 
  IM_COMMIT (EVT_IM_COMMIT()),
  
  /**
   * 清除编辑器内容(event_t)。
   *
   */
 
  IM_CLEAR (EVT_IM_CLEAR()),
  
  /**
   * 取消编辑，恢复之前的内容(event_t)。
   *
   */
 
  IM_CANCEL (EVT_IM_CANCEL()),
  
  /**
   * 进入预编辑状态(event_t)。
   *
   */
 
  IM_PREEDIT (EVT_IM_PREEDIT()),
  
  /**
   * 确认预编辑内容，退出预编辑状态(event_t)。
   *
   */
 
  IM_PREEDIT_CONFIRM (EVT_IM_PREEDIT_CONFIRM()),
  
  /**
   * 删除预编辑内容，退出预编辑状态event_t)。
   *
   */
 
  IM_PREEDIT_ABORT (EVT_IM_PREEDIT_ABORT()),
  
  /**
   * 输入法请求显示候选字事件(im_candidates_event_t)。
   *
   */
 
  IM_SHOW_CANDIDATES (EVT_IM_SHOW_CANDIDATES()),
  
  /**
   * 输入法请求显示预候选字事件(im_candidates_event_t)。
   *
   */
 
  IM_SHOW_PRE_CANDIDATES (EVT_IM_SHOW_PRE_CANDIDATES()),
  
  /**
   * 输入法语言改变事件(event_t)。
   *
   */
 
  IM_LANG_CHANGED (EVT_IM_LANG_CHANGED()),
  
  /**
   * 软键盘Action点击事件(event_t)。
   *
   */
 
  IM_ACTION (EVT_IM_ACTION()),
  
  /**
   * 请求更新软键盘上的Action按钮的信息(im_action_button_info_event_t)。
   *
   */
 
  IM_ACTION_INFO (EVT_IM_ACTION_INFO()),
  
  /**
   * 开始拖动(event_t)。
   *
   */
 
  DRAG_START (EVT_DRAG_START()),
  
  /**
   * 拖动(event_t)。
   *
   */
 
  DRAG (EVT_DRAG()),
  
  /**
   * 结束拖动(event_t)。
   *
   */
 
  DRAG_END (EVT_DRAG_END()),
  
  /**
   * Reset(event_t)。
   *
   */
 
  RESET (EVT_RESET()),
  
  /**
   * 在指定的时间内，没有用户输入事件，由窗口管理器触发。
   *
   */
 
  SCREEN_SAVER (EVT_SCREEN_SAVER()),
  
  /**
   * 内存不足(event_t)。
   *
   */
 
  LOW_MEMORY (EVT_LOW_MEMORY()),
  
  /**
   * 内存耗尽(event_t)。
   *
   */
 
  OUT_OF_MEMORY (EVT_OUT_OF_MEMORY()),
  
  /**
   * 屏幕即将旋转(event_t)。
   *
   */
 
  ORIENTATION_WILL_CHANGED (EVT_ORIENTATION_WILL_CHANGED()),
  
  /**
   * 屏幕旋转(event_t)。
   *
   */
 
  ORIENTATION_CHANGED (EVT_ORIENTATION_CHANGED()),
  
  /**
   * 控件创建事件(event_t)。
   *
   */
 
  WIDGET_CREATED (EVT_WIDGET_CREATED()),
  
  /**
   * 请求退出应用程序事件。
   *点击原生窗口关闭按钮时，通过窗口管理器触发，注册该事件并返回RET_STOP，可以阻止窗口关闭。
   *
   */
 
  REQUEST_QUIT_APP (EVT_REQUEST_QUIT_APP()),
  
  /**
   * 即将改变主题(event_t)。
   *
   */
 
  THEME_WILL_CHANGE (EVT_THEME_WILL_CHANGE()),
  
  /**
   * 主题变化(event_t)。
   *
   */
 
  THEME_CHANGED (EVT_THEME_CHANGED()),
  
  /**
   * 控件根据自己当前状态即将更新style(event_t)。
   *
   */
 
  WIDGET_WILL_UPDATE_STYLE (EVT_WIDGET_WILL_UPDATE_STYLE()),
  
  /**
   * 控件根据自己当前状态更新style(event_t)。
   *
   */
 
  WIDGET_UPDATE_STYLE (EVT_WIDGET_UPDATE_STYLE()),
  
  /**
   * 控件加载新的子控件(event_t)。
   *
   */
 
  WIDGET_ADD_CHILD (EVT_WIDGET_ADD_CHILD()),
  
  /**
   * 控件移除子控件(event_t)。
   *
   */
 
  WIDGET_REMOVE_CHILD (EVT_WIDGET_REMOVE_CHILD()),
  
  /**
   * scroll view开始滚动(event_t)。
   *
   */
 
  SCROLL_START (EVT_SCROLL_START()),
  
  /**
   * scroll view滚动(event_t)。
   *
   */
 
  SCROLL (EVT_SCROLL()),
  
  /**
   * scroll view结束滚动(event_t)。
   *
   */
 
  SCROLL_END (EVT_SCROLL_END()),
  
  /**
   * 多点触摸手势(multi_gesture_event_t)。
   *
   */
 
  MULTI_GESTURE (EVT_MULTI_GESTURE()),
  
  /**
   * 当前看到的页面改变了(event_t)。
   *
   */
 
  PAGE_CHANGED (EVT_PAGE_CHANGED()),
  
  /**
   * 当前看到的页面正在改变(offset_change_event_t)。
   *
   */
 
  PAGE_CHANGING (EVT_PAGE_CHANGING()),
  
  /**
   * 资源管理加载某个资源(assets_event_t)。
   *
   */
 
  ASSET_MANAGER_LOAD_ASSET (EVT_ASSET_MANAGER_LOAD_ASSET()),
  
  /**
   * 资源管理卸载某个资源(assets_event_t)。
   *
   */
 
  ASSET_MANAGER_UNLOAD_ASSET (EVT_ASSET_MANAGER_UNLOAD_ASSET()),
  
  /**
   * 资源管理移除同种资源缓存(assets_event_t)。
   *
   */
 
  ASSET_MANAGER_CLEAR_CACHE (EVT_ASSET_MANAGER_CLEAR_CACHE()),
  
  /**
   * 定时器(event_t)。
   *
   */
 
  TIMER (EVT_TIMER()),
  
  /**
   * 数据到来(event_t)。
   *
   */
 
  DATA (EVT_DATA()),
  
  /**
   * 客户连接到来(event_t)。
   *
   */
 
  CONNECT (EVT_CONNECT()),
  
  /**
   * 模型变化。用于fscript实现窗口间通讯(model_event_t)。
   *
   */
 
  MODEL_CHANGE (EVT_MODEL_CHANGE()),
  
  /**
   * SDL系统事件(system_event_t)。
   *
   */
 
  SYSTEM (EVT_SYSTEM()),
  
  /**
   * SDL文件拖入事件(drop_file_event_t)。
   *
   */
 
  DROP_FILE (EVT_DROP_FILE()),
  
  /**
   * locale_infos加载某个本地化信息(event_t)。
   *
   */
 
  LOCALE_INFOS_LOAD_INFO (EVT_LOCALE_INFOS_LOAD_INFO()),
  
  /**
   * locale_infos卸载某个本地化信息(event_t)。
   *
   */
 
  LOCALE_INFOS_UNLOAD_INFO (EVT_LOCALE_INFOS_UNLOAD_INFO()),
  
  /**
   * 控件进入激活状态(event_t)。
   *
   */
 
  ACTIVATED (EVT_ACTIVATED()),
  
  /**
   * 控件退出激活状态(event_t)。
   *
   */
 
  UNACTIVATED (EVT_UNACTIVATED()),
  
  /**
   * UI加载完成事件(event_t)。
   *
   */
 
  UI_LOAD (EVT_UI_LOAD()),
  
  /**
   * 触摸按下事件名(touch_event_t)。
   *
   */
 
  TOUCH_DOWN (EVT_TOUCH_DOWN()),
  
  /**
   * 触摸移动事件名(touch_event_t)。
   *
   */
 
  TOUCH_MOVE (EVT_TOUCH_MOVE()),
  
  /**
   * 触摸抬起事件名(touch_event_t)。
   *
   */
 
  TOUCH_UP (EVT_TOUCH_UP()),
  
  /**
   * event queue其它请求编号起始值。
   *
   */
 
  REQ_START (EVT_REQ_START()),
  
  /**
   * 用户定义事件起始值。
   *
   */
 
  USER_START (EVT_USER_START()),
  
  /**
   * 无效事件名称。
   *
   */
 
  NONE (EVT_NONE()),
  
  /**
   * 对象的属性即将改变的事件名(prop_change_event_t)。
   *
   */
 
  PROP_WILL_CHANGE (EVT_PROP_WILL_CHANGE()),
  
  /**
   * 对象的属性改变的事件名(prop_change_event_t)。
   *
   */
 
  PROP_CHANGED (EVT_PROP_CHANGED()),
  
  /**
   * 对象即将执行命令(cmd_exec_event_t)。
   *
   */
 
  CMD_WILL_EXEC (EVT_CMD_WILL_EXEC()),
  
  /**
   * 对象完成执行命令(cmd_exec_event_t)。
   *
   */
 
  CMD_EXECED (EVT_CMD_EXECED()),
  
  /**
   * 对象命令是否能执行指定的命令(cmd_exec_event_t)。
   *
   */
 
  CMD_CAN_EXEC (EVT_CMD_CAN_EXEC()),
  
  /**
   * 即将增加和删除集合中的项目(event_t)。
   *
   */
 
  ITEMS_WILL_CHANGE (EVT_ITEMS_WILL_CHANGE()),
  
  /**
   * 完成增加和删除集合中的项目(event_t)。
   *
   */
 
  ITEMS_CHANGED (EVT_ITEMS_CHANGED()),
  
  /**
   * 对象的属性改变的事件名(props_event_t)。
   *
   */
 
  PROPS_CHANGED (EVT_PROPS_CHANGED()),
  
  /**
   * 进度状态(progress_event_t)。
   *
   */
 
  PROGRESS (EVT_PROGRESS()),
  
  /**
   * 完成(done_event_t)。
   *
   */
 
  DONE (EVT_DONE()),
  
  /**
   * 错误(error_event_t)。
   *
   */
 
  ERROR (EVT_ERROR()),
  
  /**
   * 对象销毁事件名(event_t)。
   *
   */
 
  DESTROY (EVT_DESTROY()),
  
  /**
   * 值即将改变的事件名(value_change_event_t)。
   *
   */
 
  VALUE_WILL_CHANGE (EVT_VALUE_WILL_CHANGE()),
  
  /**
   * 值改变的事件名(value_change_event_t)。
   *
   */
 
  VALUE_CHANGED (EVT_VALUE_CHANGED()),
  
  /**
   * 值持续改变(如编辑器正在编辑)的事件名(value_change_event_t)。
   *
   */
 
  VALUE_CHANGING (EVT_VALUE_CHANGING()),
  
  /**
   * 日志信息。
   *
   */
 
  LOG_MESSAGE (EVT_LOG_MESSAGE());
 
 
  private TEventType(int value) {
    this.value = value;
  }

/**
 * 获取枚举的值。
 *
 * @return 枚举的值。
 */
  public int value() {
    return this.value;
  }

/**
 * 把枚举的值转换层枚举。
 *
 * @param value 枚举的值。

 * @return 对应的枚举类型。
 */
  public static TEventType from(int value) {
    for(TEventType iter : TEventType.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return POINTER_DOWN;
  }
  
  private int value;

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
  static private native int EVT_DOUBLE_CLICK();
  static private native int EVT_FOCUS();
  static private native int EVT_BLUR();
  static private native int EVT_KEY_DOWN();
  static private native int EVT_KEY_LONG_PRESS();
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
  static private native int EVT_WIDGET_LOAD();
  static private native int EVT_WINDOW_WILL_OPEN();
  static private native int EVT_WINDOW_OPEN();
  static private native int EVT_WINDOW_TO_BACKGROUND();
  static private native int EVT_WINDOW_TO_FOREGROUND();
  static private native int EVT_WINDOW_CLOSE();
  static private native int EVT_REQUEST_CLOSE_WINDOW();
  static private native int EVT_TOP_WINDOW_CHANGED();
  static private native int EVT_IM_START();
  static private native int EVT_IM_STOP();
  static private native int EVT_IM_COMMIT();
  static private native int EVT_IM_CLEAR();
  static private native int EVT_IM_CANCEL();
  static private native int EVT_IM_PREEDIT();
  static private native int EVT_IM_PREEDIT_CONFIRM();
  static private native int EVT_IM_PREEDIT_ABORT();
  static private native int EVT_IM_SHOW_CANDIDATES();
  static private native int EVT_IM_SHOW_PRE_CANDIDATES();
  static private native int EVT_IM_LANG_CHANGED();
  static private native int EVT_IM_ACTION();
  static private native int EVT_IM_ACTION_INFO();
  static private native int EVT_DRAG_START();
  static private native int EVT_DRAG();
  static private native int EVT_DRAG_END();
  static private native int EVT_RESET();
  static private native int EVT_SCREEN_SAVER();
  static private native int EVT_LOW_MEMORY();
  static private native int EVT_OUT_OF_MEMORY();
  static private native int EVT_ORIENTATION_WILL_CHANGED();
  static private native int EVT_ORIENTATION_CHANGED();
  static private native int EVT_WIDGET_CREATED();
  static private native int EVT_REQUEST_QUIT_APP();
  static private native int EVT_THEME_WILL_CHANGE();
  static private native int EVT_THEME_CHANGED();
  static private native int EVT_WIDGET_WILL_UPDATE_STYLE();
  static private native int EVT_WIDGET_UPDATE_STYLE();
  static private native int EVT_WIDGET_ADD_CHILD();
  static private native int EVT_WIDGET_REMOVE_CHILD();
  static private native int EVT_SCROLL_START();
  static private native int EVT_SCROLL();
  static private native int EVT_SCROLL_END();
  static private native int EVT_MULTI_GESTURE();
  static private native int EVT_PAGE_CHANGED();
  static private native int EVT_PAGE_CHANGING();
  static private native int EVT_ASSET_MANAGER_LOAD_ASSET();
  static private native int EVT_ASSET_MANAGER_UNLOAD_ASSET();
  static private native int EVT_ASSET_MANAGER_CLEAR_CACHE();
  static private native int EVT_TIMER();
  static private native int EVT_DATA();
  static private native int EVT_CONNECT();
  static private native int EVT_MODEL_CHANGE();
  static private native int EVT_SYSTEM();
  static private native int EVT_DROP_FILE();
  static private native int EVT_LOCALE_INFOS_LOAD_INFO();
  static private native int EVT_LOCALE_INFOS_UNLOAD_INFO();
  static private native int EVT_ACTIVATED();
  static private native int EVT_UNACTIVATED();
  static private native int EVT_UI_LOAD();
  static private native int EVT_TOUCH_DOWN();
  static private native int EVT_TOUCH_MOVE();
  static private native int EVT_TOUCH_UP();
  static private native int EVT_REQ_START();
  static private native int EVT_USER_START();
  static private native int EVT_NONE();
  static private native int EVT_PROP_WILL_CHANGE();
  static private native int EVT_PROP_CHANGED();
  static private native int EVT_CMD_WILL_EXEC();
  static private native int EVT_CMD_EXECED();
  static private native int EVT_CMD_CAN_EXEC();
  static private native int EVT_ITEMS_WILL_CHANGE();
  static private native int EVT_ITEMS_CHANGED();
  static private native int EVT_PROPS_CHANGED();
  static private native int EVT_PROGRESS();
  static private native int EVT_DONE();
  static private native int EVT_ERROR();
  static private native int EVT_DESTROY();
  static private native int EVT_VALUE_WILL_CHANGE();
  static private native int EVT_VALUE_CHANGED();
  static private native int EVT_VALUE_CHANGING();
  static private native int EVT_LOG_MESSAGE();

}
