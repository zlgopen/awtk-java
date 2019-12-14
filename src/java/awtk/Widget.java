package awtk;


/**
 * **widget_t** 是所有控件、窗口和窗口管理器的基类。 **widget_t**也是一个容器，可放其它**widget_t**到它的内部，形成一个树形结构。 ```graphviz   [default_style]   widget_t -> widget_t[arrowhead = "diamond"]   window_t -> widget_t[arrowhead = "empty"]   window_manager_t -> widget_t[arrowhead = "empty"]   button_t -> widget_t[arrowhead = "empty"]   label_t -> widget_t[arrowhead = "empty"]   xxx_widget_t -> widget_t[arrowhead = "empty"] ``` 通常**widget_t**通过一个矩形区域向用户呈现一些信息，接受用户的输入，并据此做出适当的反应。 它负责控件的生命周期、通用状态、事件分发和Style的管理。 本类提供的接口(函数和属性)除非特别说明，一般都适用于子类控件。 为了便于解释，这里特别说明一下几个术语： * **父控件与子控件**：父控件与子控件指的两个控件的组合关系(这是在运行时决定的)。 比如：在窗口中放一个按钮，此时，我们称按钮是窗口的子控件，窗口是按钮的父控件。 ```graphviz   [default_style]   子控件 -> 父控件[arrowhead = "ediamond"] ``` * **子类控件与父类控件**：子类控件与父类控件指的两类控件的继承关系(这是在设计时决定的)。 比如：我们称**button_t**是**widget_t**的子类控件，**widget_t**是**button_t**的父类控件。 ```graphviz   [default_style]   子类控件 -> 父类控件[arrowhead = "empty"] ``` widget相关的函数都只能在GUI线程中执行，如果需在非GUI线程中想调用widget相关函数， 请用idle\_queue或timer\_queue进行串行化。 请参考[demo thread](https://github.com/zlgopen/awtk/blob/master/demos/demo_thread_app.c) **widget\_t**是抽象类，不要直接创建**widget\_t**的实例。控件支持两种创建方式： * 通过XML创建。如： ```xml <button x="c" y="m" w="80" h="30" text="OK"/> ``` * 通过代码创建。如： ```c  widget_t* button = button_create(win, 10, 10, 128, 30);  widget_set_text(button, L"OK");  widget_on(button, EVT_CLICK, on_click, NULL); ```
 *
 */
public class Widget {
 public long nativeObj;

 public Widget(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public Widget cast(long nativeObj) {
   return new Widget(nativeObj);
 }


/**
 * 获取子控件的个数。
 * 
 * @param widget 控件对象。
 *
 * @returns 子控件的个数。
 */
 public  int countChildren()  {
   return widget_count_children(this != null ? (this.nativeObj) : 0);
 }


/**
 * 获取指定索引的子控件。
 * 
 * @param widget 控件对象。
 * @param index 索引。
 *
 * @returns 子控件。
 */
 public  Widget getChild(int index)  {
   return new Widget(widget_get_child(this != null ? (this.nativeObj) : 0, index));
 }


/**
 * 获取控件在父控件中的索引编号。
 * 
 * @param widget 控件对象。
 *
 * @returns 在父控件中的索引编号。
 */
 public  int indexOf()  {
   return widget_index_of(this != null ? (this.nativeObj) : 0);
 }


/**
 * 移动控件。
 * 
 * @param widget 控件对象。
 * @param x x坐标
 * @param y y坐标
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret move(int x, int y)  {
   return Ret.from(widget_move(this != null ? (this.nativeObj) : 0, x, y));
 }


/**
 * 调整控件的大小。
 * 
 * @param widget 控件对象。
 * @param w 宽度
 * @param h 高度
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret resize(int w, int h)  {
   return Ret.from(widget_resize(this != null ? (this.nativeObj) : 0, w, h));
 }


/**
 * 移动控件并调整控件的大小。
 * 
 * @param widget 控件对象。
 * @param x x坐标
 * @param y y坐标
 * @param w 宽度
 * @param h 高度
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret moveResize(int x, int y, int w, int h)  {
   return Ret.from(widget_move_resize(this != null ? (this.nativeObj) : 0, x, y, w, h));
 }


/**
 * 设置控件的值。 只是对widget\_set\_prop的包装，值的意义由子类控件决定。
 * 
 * @param widget 控件对象。
 * @param value 值。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setValue(int value)  {
   return Ret.from(widget_set_value(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 设置控件的值(以动画形式变化到指定的值)。 只是对widget\_set\_prop的包装，值的意义由子类控件决定。
 * 
 * @param widget 控件对象。
 * @param value 值。
 * @param duration 动画持续时间(毫秒)。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret animateValueTo(int value, int duration)  {
   return Ret.from(widget_animate_value_to(this != null ? (this.nativeObj) : 0, value, duration));
 }


/**
 * 增加控件的值。 只是对widget\_set\_prop的包装，值的意义由子类控件决定。
 * 
 * @param widget 控件对象。
 * @param delta 增量。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret addValue(int delta)  {
   return Ret.from(widget_add_value(this != null ? (this.nativeObj) : 0, delta));
 }


/**
 * 启用指定的主题。
 * 
 * @param widget 控件对象。
 * @param style style的名称。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret useStyle(String style)  {
   return Ret.from(widget_use_style(this != null ? (this.nativeObj) : 0, style));
 }


/**
 * 设置控件的文本。 只是对widget\_set\_prop的包装，文本的意义由子类控件决定。
 * 
 * @param widget 控件对象。
 * @param text 文本。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setText(String text)  {
   return Ret.from(widget_set_text_utf8(this != null ? (this.nativeObj) : 0, text));
 }


/**
 * 获取翻译之后的文本，然后调用widget_set_text。
 * 
 * @param widget 控件对象。
 * @param text 文本。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setTrText(String text)  {
   return Ret.from(widget_set_tr_text(this != null ? (this.nativeObj) : 0, text));
 }


/**
 * 获取控件的值。只是对widget\_get\_prop的包装，值的意义由子类控件决定。
 * 
 * @param widget 控件对象。
 *
 * @returns 返回值。
 */
 public  int getValue()  {
   return widget_get_value(this != null ? (this.nativeObj) : 0);
 }


/**
 * 获取控件的文本。 只是对widget\_get\_prop的包装，文本的意义由子类控件决定。
 * 
 * @param widget 控件对象。
 *
 * @returns 返回文本。
 */
 public  long getText()  {
   return widget_get_text(this != null ? (this.nativeObj) : 0);
 }


/**
 * 设置控件的名称。
 * 
 * @param widget 控件对象。
 * @param name 名称。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setName(String name)  {
   return Ret.from(widget_set_name(this != null ? (this.nativeObj) : 0, name));
 }


/**
 * 设置theme的名称，用于动态切换主题。名称与当前主题名称相同，则重新加载全部资源。 目前只支持带有文件系统的平台。
 * 
 * @param widget 控件对象。
 * @param name 主题的名称。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setTheme(String name)  {
   return Ret.from(widget_set_theme(this != null ? (this.nativeObj) : 0, name));
 }


/**
 * 设置鼠标指针的图片名。
 * 
 * @param widget 控件对象。
 * @param cursor 图片名称(无扩展名)。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setPointerCursor(String cursor)  {
   return Ret.from(widget_set_pointer_cursor(this != null ? (this.nativeObj) : 0, cursor));
 }


/**
 * 设置控件的动画参数(仅用于在UI文件使用)。 请参考[控件动画](https://github.com/zlgopen/awtk/blob/master/docs/widget_animator.md)
 * 
 * @param widget 控件对象。
 * @param animation 动画参数。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setAnimation(String animation)  {
   return Ret.from(widget_set_animation(this != null ? (this.nativeObj) : 0, animation));
 }


/**
 * 创建动画。 请参考[控件动画](https://github.com/zlgopen/awtk/blob/master/docs/widget_animator.md) * 除非指定auto_start=false，动画创建后自动启动。 * 除非指定auto_destroy=false，动画播放完成后自动销毁。
 * 
 * @param widget 控件对象。
 * @param animation 动画参数。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret createAnimator(String animation)  {
   return Ret.from(widget_create_animator(this != null ? (this.nativeObj) : 0, animation));
 }


/**
 * 播放动画。 请参考[控件动画](https://github.com/zlgopen/awtk/blob/master/docs/widget_animator.md) * 1.widget为NULL时，播放所有名称为name的动画。 * 2.name为NULL时，播放所有widget相关的动画。 * 3.widget和name均为NULL，播放所有动画。
 * 
 * @param widget 控件对象。
 * @param name 动画名称。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret startAnimator(String name)  {
   return Ret.from(widget_start_animator(this != null ? (this.nativeObj) : 0, name));
 }


/**
 * 设置动画的时间倍率，<0: 时间倒退，<1: 时间变慢，>1 时间变快。 请参考[控件动画](https://github.com/zlgopen/awtk/blob/master/docs/widget_animator.md) * 1.widget为NULL时，设置所有名称为name的动画的时间倍率。 * 2.name为NULL时，设置所有widget相关的动画的时间倍率。 * 3.widget和name均为NULL，设置所有动画的时间倍率。
 * 
 * @param widget 控件对象。
 * @param name 动画名称。
 * @param time_scale 时间倍率。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setAnimatorTimeScale(String name, double time_scale)  {
   return Ret.from(widget_set_animator_time_scale(this != null ? (this.nativeObj) : 0, name, time_scale));
 }


/**
 * 暂停动画。 请参考[控件动画](https://github.com/zlgopen/awtk/blob/master/docs/widget_animator.md) * 1.widget为NULL时，暂停所有名称为name的动画。 * 2.name为NULL时，暂停所有widget相关的动画。 * 3.widget和name均为NULL，暂停所有动画。
 * 
 * @param widget 控件对象。
 * @param name 动画名称。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret pauseAnimator(String name)  {
   return Ret.from(widget_pause_animator(this != null ? (this.nativeObj) : 0, name));
 }


/**
 * 停止动画(控件的相应属性回归原位)。 请参考[控件动画](https://github.com/zlgopen/awtk/blob/master/docs/widget_animator.md) * 1.widget为NULL时，停止所有名称为name的动画。 * 2.name为NULL时，停止所有widget相关的动画。 * 3.widget和name均为NULL，停止所有动画。
 * 
 * @param widget 控件对象。
 * @param name 动画名称。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret stopAnimator(String name)  {
   return Ret.from(widget_stop_animator(this != null ? (this.nativeObj) : 0, name));
 }


/**
 * 销毁动画。 请参考[控件动画](https://github.com/zlgopen/awtk/blob/master/docs/widget_animator.md) * 1.widget为NULL时，销毁所有名称为name的动画。 * 2.name为NULL时，销毁所有widget相关的动画。 * 3.widget和name均为NULL，销毁所有动画。
 * 
 * @param widget 控件对象。
 * @param name 动画名称。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret destroyAnimator(String name)  {
   return Ret.from(widget_destroy_animator(this != null ? (this.nativeObj) : 0, name));
 }


/**
 * 设置控件的可用性。
 * 
 * @param widget 控件对象。
 * @param enable 是否可用性。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setEnable(boolean enable)  {
   return Ret.from(widget_set_enable(this != null ? (this.nativeObj) : 0, enable));
 }


/**
 * 设置控件是否启用反馈。
 * 
 * @param widget 控件对象。
 * @param feedback 是否启用反馈。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setFeedback(boolean feedback)  {
   return Ret.from(widget_set_feedback(this != null ? (this.nativeObj) : 0, feedback));
 }


/**
 * 设置控件的floating标志。> floating的控件不受父控件的子控件布局参数的影响。
 * 
 * @param widget 控件对象。
 * @param floating 是否启用floating布局。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setFloating(boolean floating)  {
   return Ret.from(widget_set_floating(this != null ? (this.nativeObj) : 0, floating));
 }


/**
 * 设置控件的是否聚焦。
 * 
 * @param widget 控件对象。
 * @param focused 是否聚焦。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setFocused(boolean focused)  {
   return Ret.from(widget_set_focused(this != null ? (this.nativeObj) : 0, focused));
 }


/**
 * 设置控件的状态。
 * 
 * @param widget 控件对象。
 * @param state 状态(必须为真正的常量字符串，在widget的整个生命周期有效)。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setState(String state)  {
   return Ret.from(widget_set_state(this != null ? (this.nativeObj) : 0, state));
 }


/**
 * 设置控件的不透明度。>在嵌入式平台，半透明效果会使性能大幅下降，请谨慎使用。
 * 
 * @param widget 控件对象。
 * @param opacity 不透明度(取值0-255，0表示完全透明，255表示完全不透明)。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setOpacity(int opacity)  {
   return Ret.from(widget_set_opacity(this != null ? (this.nativeObj) : 0, opacity));
 }


/**
 * 销毁全部子控件。
 * 
 * @param widget 控件对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret destroyChildren()  {
   return Ret.from(widget_destroy_children(this != null ? (this.nativeObj) : 0));
 }


/**
 * 加入一个子控件。
 * 
 * @param widget 控件对象。
 * @param child 子控件对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret addChild(Widget child)  {
   return Ret.from(widget_add_child(this != null ? (this.nativeObj) : 0, child != null ? (child.nativeObj) : 0));
 }


/**
 * 移出指定的子控件(并不销毁)。
 * 
 * @param widget 控件对象。
 * @param child 子控件对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret removeChild(Widget child)  {
   return Ret.from(widget_remove_child(this != null ? (this.nativeObj) : 0, child != null ? (child.nativeObj) : 0));
 }


/**
 * 插入子控件到指定的位置。
 * 
 * @param widget 控件对象。
 * @param index 位置序数(大于等于总个数，则放到最后)。
 * @param child 子控件对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret insertChild(int index, Widget child)  {
   return Ret.from(widget_insert_child(this != null ? (this.nativeObj) : 0, index, child != null ? (child.nativeObj) : 0));
 }


/**
 * 调整控件在父控件中的位置序数。
 * 
 * @param widget 控件对象。
 * @param index 位置序数(大于等于总个数，则放到最后)。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret restack(int index)  {
   return Ret.from(widget_restack(this != null ? (this.nativeObj) : 0, index));
 }


/**
 * 查找指定名称的子控件(同widget_lookup(widget, name, FALSE))。
 * 
 * @param widget 控件对象。
 * @param name 子控件的名称。
 *
 * @returns 子控件或NULL。
 */
 public  Widget child(String name)  {
   return new Widget(widget_child(this != null ? (this.nativeObj) : 0, name));
 }


/**
 * 查找指定名称的子控件(返回第一个)。
 * 
 * @param widget 控件对象。
 * @param name 子控件的名称。
 * @param recursive 是否递归查找全部子控件。
 *
 * @returns 子控件或NULL。
 */
 public  Widget lookup(String name, boolean recursive)  {
   return new Widget(widget_lookup(this != null ? (this.nativeObj) : 0, name, recursive));
 }


/**
 * 查找指定类型的子控件(返回第一个)。
 * 
 * @param widget 控件对象。
 * @param type 子控件的名称。
 * @param recursive 是否递归查找全部子控件。
 *
 * @returns 子控件或NULL。
 */
 public  Widget lookupByType(String type, boolean recursive)  {
   return new Widget(widget_lookup_by_type(this != null ? (this.nativeObj) : 0, type, recursive));
 }


/**
 * 设置控件的可见性。
 * 
 * @param widget 控件对象。
 * @param visible 是否可见。
 * @param recursive 是否递归设置全部子控件。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setVisible(boolean visible, boolean recursive)  {
   return Ret.from(widget_set_visible(this != null ? (this.nativeObj) : 0, visible, recursive));
 }


/**
 * 设置控件的可见性(不触发repaint和relayout)。
 * 
 * @param widget 控件对象。
 * @param visible 是否可见。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setVisibleOnly(boolean visible)  {
   return Ret.from(widget_set_visible_only(this != null ? (this.nativeObj) : 0, visible));
 }


/**
 * 设置控件是否接受用户事件。
 * 
 * @param widget 控件对象。
 * @param sensitive 是否接受用户事件。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setSensitive(boolean sensitive)  {
   return Ret.from(widget_set_sensitive(this != null ? (this.nativeObj) : 0, sensitive));
 }


/**
 * 注册指定事件的处理函数。 使用示例： ```c widget_t* ok = button_create(win, 10, 10, 80, 30); widget_on(ok, EVT_CLICK, on_click, NULL); ```
 * 
 * @param widget 控件对象。
 * @param type 事件类型。
 * @param on_event 事件处理函数。
 * @param ctx 事件处理函数上下文。
 *
 * @returns 返回id，用于widget_off。
 */
 public  int on(EventType type, OnEvent on_event, long ctx)  {
   return widget_on(this != null ? (this.nativeObj) : 0, type.value(), on_event, ctx);
 }


/**
 * 注销指定事件的处理函数。
 * 
 * @param widget 控件对象。
 * @param id widget_on返回的ID。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret off(int id)  {
   return Ret.from(widget_off(this != null ? (this.nativeObj) : 0, id));
 }


/**
 * 请求强制重绘控件。
 * 
 * @param widget 控件对象。
 * @param r 矩形对象(widget本地坐标)。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret invalidateForce(Rect r)  {
   return Ret.from(widget_invalidate_force(this != null ? (this.nativeObj) : 0, r != null ? (r.nativeObj) : 0));
 }


/**
 * 设置字符串格式的属性。
 * 
 * @param widget 控件对象。
 * @param name 属性的名称。
 * @param v 属性的值。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setPropStr(String name, String v)  {
   return Ret.from(widget_set_prop_str(this != null ? (this.nativeObj) : 0, name, v));
 }


/**
 * 获取字符串格式的属性。
 * 
 * @param widget 控件对象。
 * @param name 属性的名称。
 * @param defval 缺省值。
 *
 * @returns 返回属性的值。
 */
 public  String getPropStr(String name, String defval)  {
   return widget_get_prop_str(this != null ? (this.nativeObj) : 0, name, defval);
 }


/**
 * 设置整数格式的属性。
 * 
 * @param widget 控件对象。
 * @param name 属性的名称。
 * @param v 属性的值。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setPropInt(String name, int v)  {
   return Ret.from(widget_set_prop_int(this != null ? (this.nativeObj) : 0, name, v));
 }


/**
 * 获取整数格式的属性。
 * 
 * @param widget 控件对象。
 * @param name 属性的名称。
 * @param defval 缺省值。
 *
 * @returns 返回属性的值。
 */
 public  int getPropInt(String name, int defval)  {
   return widget_get_prop_int(this != null ? (this.nativeObj) : 0, name, defval);
 }


/**
 * 设置布尔格式的属性。
 * 
 * @param widget 控件对象。
 * @param name 属性的名称。
 * @param v 属性的值。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setPropBool(String name, boolean v)  {
   return Ret.from(widget_set_prop_bool(this != null ? (this.nativeObj) : 0, name, v));
 }


/**
 * 获取布尔格式的属性。
 * 
 * @param widget 控件对象。
 * @param name 属性的名称。
 * @param defval 缺省值。
 *
 * @returns 返回属性的值。
 */
 public  boolean getPropBool(String name, boolean defval)  {
   return widget_get_prop_bool(this != null ? (this.nativeObj) : 0, name, defval);
 }


/**
 * 判断当前控件所在的窗口是否已经打开。
 * 
 * @param widget 控件对象。
 *
 * @returns 返回当前控件所在的窗口是否已经打开。
 */
 public  boolean isWindowOpened()  {
   return widget_is_window_opened(this != null ? (this.nativeObj) : 0);
 }


/**
 * 判断当前控件是否是窗口。
 * 
 * @param widget 控件对象。
 *
 * @returns 返回当前控件是否是窗口。
 */
 public  boolean isWindow()  {
   return widget_is_window(this != null ? (this.nativeObj) : 0);
 }


/**
 * 判断当前控件是否是设计窗口。
 * 
 * @param widget 控件对象。
 *
 * @returns 返回当前控件是否是设计窗口。
 */
 public  boolean isDesigningWindow()  {
   return widget_is_designing_window(this != null ? (this.nativeObj) : 0);
 }


/**
 * 判断当前控件是否是窗口管理器。
 * 
 * @param widget 控件对象。
 *
 * @returns 返回当前控件是否是窗口管理器。
 */
 public  boolean isWindowManager()  {
   return widget_is_window_manager(this != null ? (this.nativeObj) : 0);
 }


/**
 * 遍历当前控件及子控件。
 * 
 * @param widget 控件对象。
 * @param visit 遍历的回调函数。
 * @param ctx 回调函数的上下文。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret foreach(OnData visit, long ctx)  {
   return Ret.from(widget_foreach(this != null ? (this.nativeObj) : 0, visit, ctx));
 }


/**
 * 获取当前控件所在的窗口。
 * 
 * @param widget 控件对象。
 *
 * @returns 窗口对象。
 */
 public  Widget getWindow()  {
   return new Widget(widget_get_window(this != null ? (this.nativeObj) : 0));
 }


/**
 * 获取当前的窗口管理器。
 * 
 * @param widget 控件对象。
 *
 * @returns 窗口管理器对象。
 */
 public  Widget getWindowManager()  {
   return new Widget(widget_get_window_manager(this != null ? (this.nativeObj) : 0));
 }


/**
 * 获取当前控件的类型名称。
 * 
 * @param widget 控件对象。
 *
 * @returns 返回类型名。
 */
 public  String getType()  {
   return widget_get_type(this != null ? (this.nativeObj) : 0);
 }


/**
 * clone。
 * 
 * @param widget 控件对象。
 * @param parent clone新控件的parent对象。
 *
 * @returns 返回clone的对象。
 */
 public  Widget clone(Widget parent)  {
   return new Widget(widget_clone(this != null ? (this.nativeObj) : 0, parent != null ? (parent.nativeObj) : 0));
 }


/**
 * 判断两个widget是否相同。
 * 
 * @param widget 控件对象。
 * @param other 要比较的控件对象。
 *
 * @returns 返回TRUE表示相同，否则表示不同。
 */
 public  boolean equal(Widget other)  {
   return widget_equal(this != null ? (this.nativeObj) : 0, other != null ? (other.nativeObj) : 0);
 }


/**
 * 转换为widget对象(供脚本语言使用)。
 * 
 * @param widget widget对象。
 *
 * @returns widget对象。
 */
 public  static Widget cast(Widget widget)  {
   return new Widget(widget_cast(widget != null ? (widget.nativeObj) : 0));
 }


/**
 * 从父控件中移除控件，并调用unref函数销毁控件。 一般无需直接调用，关闭窗口时，自动销毁相关控件。
 * 
 * @param widget 控件对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret destroy()  {
   return Ret.from(widget_destroy(this != null ? (this.nativeObj) : 0));
 }


/**
 * 减少控件的引用计数。引用计数为0时销毁控件。
 * 
 * @param widget 控件对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret unref()  {
   return Ret.from(widget_unref(this != null ? (this.nativeObj) : 0));
 }


/**
 * 布局当前控件及子控件。
 * 
 * @param widget widget对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret layout()  {
   return Ret.from(widget_layout(this != null ? (this.nativeObj) : 0));
 }


/**
 * 设置控件自己的布局参数。
 * 
 * @param widget 控件对象。
 * @param params 布局参数。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setSelfLayout(String params)  {
   return Ret.from(widget_set_self_layout(this != null ? (this.nativeObj) : 0, params));
 }


/**
 * 设置子控件的布局参数。
 * 
 * @param widget 控件对象。
 * @param params 布局参数。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setChildrenLayout(String params)  {
   return Ret.from(widget_set_children_layout(this != null ? (this.nativeObj) : 0, params));
 }


/**
 * 设置控件自己的布局(缺省布局器)参数(过时，请用widget\_set\_self\_layout)。
 * 
 * @param widget 控件对象。
 * @param x x参数。
 * @param y y参数。
 * @param w w参数。
 * @param h h参数。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setSelfLayoutParams(String x, String y, String w, String h)  {
   return Ret.from(widget_set_self_layout_params(this != null ? (this.nativeObj) : 0, x, y, w, h));
 }


/**
 * 设置整数类型的style。
 * 
 * @param widget 控件对象。
 * @param state_and_name 状态和名字，用英文的冒号分隔。
 * @param value 值。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setStyleInt(String state_and_name, int value)  {
   return Ret.from(widget_set_style_int(this != null ? (this.nativeObj) : 0, state_and_name, value));
 }


/**
 * 设置字符串类型的style。
 * 
 * @param widget 控件对象。
 * @param state_and_name 状态和名字，用英文的冒号分隔。
 * @param value 值。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setStyleStr(String state_and_name, String value)  {
   return Ret.from(widget_set_style_str(this != null ? (this.nativeObj) : 0, state_and_name, value));
 }


/**
 * 设置颜色类型的style。
 * 
 * @param widget 控件对象。
 * @param state_and_name 状态和名字，用英文的冒号分隔。
 * @param value 值。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setStyleColor(String state_and_name, int value)  {
   return Ret.from(widget_set_style_color(this != null ? (this.nativeObj) : 0, state_and_name, value));
 }

 public int getX() {
   return widget_t_get_prop_x(this.nativeObj);
 }

 public int getY() {
   return widget_t_get_prop_y(this.nativeObj);
 }

 public int getW() {
   return widget_t_get_prop_w(this.nativeObj);
 }

 public int getH() {
   return widget_t_get_prop_h(this.nativeObj);
 }

 public String getName() {
   return widget_t_get_prop_name(this.nativeObj);
 }

 public String getTrText() {
   return widget_t_get_prop_tr_text(this.nativeObj);
 }

 public String getStyle() {
   return widget_t_get_prop_style(this.nativeObj);
 }

 public String getAnimation() {
   return widget_t_get_prop_animation(this.nativeObj);
 }

 public boolean getEnable() {
   return widget_t_get_prop_enable(this.nativeObj);
 }

 public boolean getFeedback() {
   return widget_t_get_prop_feedback(this.nativeObj);
 }

 public boolean getVisible() {
   return widget_t_get_prop_visible(this.nativeObj);
 }

 public boolean getSensitive() {
   return widget_t_get_prop_sensitive(this.nativeObj);
 }

 public boolean getFocusable() {
   return widget_t_get_prop_focusable(this.nativeObj);
 }

 public boolean getWithFocusState() {
   return widget_t_get_prop_with_focus_state(this.nativeObj);
 }

 public boolean getFloating() {
   return widget_t_get_prop_floating(this.nativeObj);
 }

 public Widget getParent() {
   return new Widget(widget_t_get_prop_parent(this.nativeObj));
 }

static private native int widget_count_children(long widget);
static private native long widget_get_child(long widget, int index);
static private native int widget_index_of(long widget);
static private native int widget_move(long widget, int x, int y);
static private native int widget_resize(long widget, int w, int h);
static private native int widget_move_resize(long widget, int x, int y, int w, int h);
static private native int widget_set_value(long widget, int value);
static private native int widget_animate_value_to(long widget, int value, int duration);
static private native int widget_add_value(long widget, int delta);
static private native int widget_use_style(long widget, String style);
static private native int widget_set_text_utf8(long widget, String text);
static private native int widget_set_tr_text(long widget, String text);
static private native int widget_get_value(long widget);
static private native long widget_get_text(long widget);
static private native int widget_set_name(long widget, String name);
static private native int widget_set_theme(long widget, String name);
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
static private native int widget_set_floating(long widget, boolean floating);
static private native int widget_set_focused(long widget, boolean focused);
static private native int widget_set_state(long widget, String state);
static private native int widget_set_opacity(long widget, int opacity);
static private native int widget_destroy_children(long widget);
static private native int widget_add_child(long widget, long child);
static private native int widget_remove_child(long widget, long child);
static private native int widget_insert_child(long widget, int index, long child);
static private native int widget_restack(long widget, int index);
static private native long widget_child(long widget, String name);
static private native long widget_lookup(long widget, String name, boolean recursive);
static private native long widget_lookup_by_type(long widget, String type, boolean recursive);
static private native int widget_set_visible(long widget, boolean visible, boolean recursive);
static private native int widget_set_visible_only(long widget, boolean visible);
static private native int widget_set_sensitive(long widget, boolean sensitive);
static private native int widget_on(long widget, int type, OnEvent on_event, long ctx);
static private native int widget_off(long widget, int id);
static private native int widget_invalidate_force(long widget, long r);
static private native int widget_set_prop_str(long widget, String name, String v);
static private native String widget_get_prop_str(long widget, String name, String defval);
static private native int widget_set_prop_int(long widget, String name, int v);
static private native int widget_get_prop_int(long widget, String name, int defval);
static private native int widget_set_prop_bool(long widget, String name, boolean v);
static private native boolean widget_get_prop_bool(long widget, String name, boolean defval);
static private native boolean widget_is_window_opened(long widget);
static private native boolean widget_is_window(long widget);
static private native boolean widget_is_designing_window(long widget);
static private native boolean widget_is_window_manager(long widget);
static private native int widget_foreach(long widget, OnData visit, long ctx);
static private native long widget_get_window(long widget);
static private native long widget_get_window_manager(long widget);
static private native String widget_get_type(long widget);
static private native long widget_clone(long widget, long parent);
static private native boolean widget_equal(long widget, long other);
static private native long widget_cast(long widget);
static private native int widget_destroy(long widget);
static private native int widget_unref(long widget);
static private native int widget_layout(long widget);
static private native int widget_set_self_layout(long widget, String params);
static private native int widget_set_children_layout(long widget, String params);
static private native int widget_set_self_layout_params(long widget, String x, String y, String w, String h);
static private native int widget_set_style_int(long widget, String state_and_name, int value);
static private native int widget_set_style_str(long widget, String state_and_name, String value);
static private native int widget_set_style_color(long widget, String state_and_name, int value);
static private native int widget_t_get_prop_x(long nativeObj);
static private native int widget_t_get_prop_y(long nativeObj);
static private native int widget_t_get_prop_w(long nativeObj);
static private native int widget_t_get_prop_h(long nativeObj);
static private native String widget_t_get_prop_name(long nativeObj);
static private native String widget_t_get_prop_tr_text(long nativeObj);
static private native String widget_t_get_prop_style(long nativeObj);
static private native String widget_t_get_prop_animation(long nativeObj);
static private native boolean widget_t_get_prop_enable(long nativeObj);
static private native boolean widget_t_get_prop_feedback(long nativeObj);
static private native boolean widget_t_get_prop_visible(long nativeObj);
static private native void widget_t_set_prop_visible(long nativeObj, boolean value);
static private native boolean widget_t_get_prop_sensitive(long nativeObj);
static private native void widget_t_set_prop_sensitive(long nativeObj, boolean value);
static private native boolean widget_t_get_prop_focusable(long nativeObj);
static private native void widget_t_set_prop_focusable(long nativeObj, boolean value);
static private native boolean widget_t_get_prop_with_focus_state(long nativeObj);
static private native void widget_t_set_prop_with_focus_state(long nativeObj, boolean value);
static private native boolean widget_t_get_prop_floating(long nativeObj);
static private native long widget_t_get_prop_parent(long nativeObj);
}

