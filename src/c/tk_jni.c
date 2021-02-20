/*XXX: GENERATED CODE, DONT EDIT IT.*/
#include <jni.h>
#include "tkc/utf8.h"
#include "tkc/mem.h"
#include "tkc/event.h"
#include "tkc/emitter.h"
#include "tkc/rect.h"
#include "base/bitmap.h"
#include "tkc/object.h"
#include "tkc/value.h"
#include "src/awtk_global.h"
#include "base/bidi.h"
#include "base/canvas_offline.h"
#include "base/canvas.h"
#include "base/clip_board.h"
#include "base/dialog.h"
#include "base/events.h"
#include "base/font_manager.h"
#include "base/font.h"
#include "base/idle.h"
#include "base/image_manager.h"
#include "base/input_method.h"
#include "base/keys.h"
#include "base/locale_info.h"
#include "base/style.h"
#include "base/theme.h"
#include "base/timer.h"
#include "base/types_def.h"
#include "base/vgcanvas.h"
#include "base/widget_consts.h"
#include "base/widget.h"
#include "conf_io/app_conf.h"
#include "slide_view/slide_indicator.h"
#include "tkc/asset_info.h"
#include "tkc/color.h"
#include "tkc/date_time.h"
#include "tkc/easing.h"
#include "tkc/idle_manager.h"
#include "tkc/mime_types.h"
#include "tkc/named_value.h"
#include "tkc/rlog.h"
#include "tkc/time_now.h"
#include "tkc/timer_manager.h"
#include "tkc/types_def.h"
#include "base/assets_manager.h"
#include "base/image_base.h"
#include "base/style_mutable.h"
#include "base/window_base.h"
#include "base/window_manager.h"
#include "canvas_widget/canvas_widget.h"
#include "color_picker/color_component.h"
#include "color_picker/color_picker.h"
#include "features/draggable.h"
#include "file_browser/file_browser_view.h"
#include "file_browser/file_chooser.h"
#include "guage/guage_pointer.h"
#include "guage/guage.h"
#include "image_animation/image_animation.h"
#include "image_value/image_value.h"
#include "keyboard/candidates.h"
#include "keyboard/lang_indicator.h"
#include "mledit/line_number.h"
#include "mledit/mledit.h"
#include "progress_circle/progress_circle.h"
#include "rich_text/rich_text_view.h"
#include "rich_text/rich_text.h"
#include "scroll_label/hscroll_label.h"
#include "scroll_view/list_item.h"
#include "scroll_view/list_view_h.h"
#include "scroll_view/list_view.h"
#include "scroll_view/scroll_bar.h"
#include "scroll_view/scroll_view.h"
#include "slide_menu/slide_menu.h"
#include "slide_view/slide_view.h"
#include "switch/switch.h"
#include "text_selector/text_selector.h"
#include "time_clock/time_clock.h"
#include "widgets/app_bar.h"
#include "widgets/button_group.h"
#include "widgets/button.h"
#include "widgets/check_button.h"
#include "widgets/clip_view.h"
#include "widgets/color_tile.h"
#include "widgets/column.h"
#include "widgets/combo_box_item.h"
#include "widgets/dialog_client.h"
#include "widgets/dialog_title.h"
#include "widgets/digit_clock.h"
#include "widgets/dragger.h"
#include "widgets/edit.h"
#include "widgets/grid_item.h"
#include "widgets/grid.h"
#include "widgets/group_box.h"
#include "widgets/label.h"
#include "widgets/pages.h"
#include "widgets/progress_bar.h"
#include "widgets/row.h"
#include "widgets/slider.h"
#include "widgets/tab_button_group.h"
#include "widgets/tab_button.h"
#include "widgets/tab_control.h"
#include "widgets/view.h"
#include "base/native_window.h"
#include "base/window.h"
#include "gif_image/gif_image.h"
#include "keyboard/keyboard.h"
#include "mutable_image/mutable_image.h"
#include "svg_image/svg_image.h"
#include "tkc/idle_info.h"
#include "tkc/object_array.h"
#include "tkc/object_default.h"
#include "tkc/timer_info.h"
#include "widgets/calibration_win.h"
#include "widgets/combo_box.h"
#include "widgets/image.h"
#include "widgets/overlay.h"
#include "widgets/popup.h"
#include "widgets/spin_box.h"
#include "widgets/system_bar.h"
#include "combo_box_ex/combo_box_ex.h"
#include "custom.c"

JNIEXPORT jlong JNICALL Java_awtk_TEvent_event_1cast(JNIEnv* env,  jclass ajc, jlong jevent) { /*func*/
  event_t* ret;
  event_t* event = (event_t*)jevent;
  ret = (event_t*)event_cast(event);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TEvent_event_1create(JNIEnv* env,  jclass ajc, jint type) { /*func*/
  event_t* ret;
  ret = (event_t*)event_create(type);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEvent_event_1t_1get_1prop_1type(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  event_t* obj = (event_t*)jobj;

  return (jint)(obj->type);
}

JNIEXPORT jint JNICALL Java_awtk_TEvent_event_1t_1get_1prop_1size(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  event_t* obj = (event_t*)jobj;

  return (jint)(obj->size);
}

JNIEXPORT jlong JNICALL Java_awtk_TEvent_event_1t_1get_1prop_1time(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  event_t* obj = (event_t*)jobj;

  return (jlong)(obj->time);
}

JNIEXPORT jlong JNICALL Java_awtk_TEvent_event_1t_1get_1prop_1target(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  event_t* obj = (event_t*)jobj;

  return (jlong)(obj->target);
}

JNIEXPORT jlong JNICALL Java_awtk_TEmitter_emitter_1create(JNIEnv* env,  jclass ajc) { /*func*/
  emitter_t* ret;
  ret = (emitter_t*)emitter_create();

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEmitter_emitter_1dispatch(JNIEnv* env,  jclass ajc, jlong jemitter, jlong je) { /*func*/
  ret_t ret;
  emitter_t* emitter = (emitter_t*)jemitter;
  event_t* e = (event_t*)je;
  ret = (ret_t)emitter_dispatch(emitter, e);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEmitter_emitter_1dispatch_1simple_1event(JNIEnv* env,  jclass ajc, jlong jemitter, jint type) { /*func*/
  ret_t ret;
  emitter_t* emitter = (emitter_t*)jemitter;
  ret = (ret_t)emitter_dispatch_simple_event(emitter, type);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEmitter_emitter_1off(JNIEnv* env,  jclass ajc, jlong jemitter, jint id) { /*func*/
  ret_t ret;
  emitter_t* emitter = (emitter_t*)jemitter;
  ret = (ret_t)emitter_off(emitter, id);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEmitter_emitter_1enable(JNIEnv* env,  jclass ajc, jlong jemitter) { /*func*/
  ret_t ret;
  emitter_t* emitter = (emitter_t*)jemitter;
  ret = (ret_t)emitter_enable(emitter);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEmitter_emitter_1disable(JNIEnv* env,  jclass ajc, jlong jemitter) { /*func*/
  ret_t ret;
  emitter_t* emitter = (emitter_t*)jemitter;
  ret = (ret_t)emitter_disable(emitter);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TEmitter_emitter_1cast(JNIEnv* env,  jclass ajc, jlong jemitter) { /*func*/
  emitter_t* ret;
  emitter_t* emitter = (emitter_t*)jemitter;
  ret = (emitter_t*)emitter_cast(emitter);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TRect_rect_1create(JNIEnv* env,  jclass ajc, jint x, jint y, jint w, jint h) { /*func*/
  rect_t* ret;
  ret = (rect_t*)rect_create(x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TRect_rect_1set(JNIEnv* env,  jclass ajc, jlong jrect, jint x, jint y, jint w, jint h) { /*func*/
  rect_t* ret;
  rect_t* rect = (rect_t*)jrect;
  ret = (rect_t*)rect_set(rect, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TRect_rect_1cast(JNIEnv* env,  jclass ajc, jlong jrect) { /*func*/
  rect_t* ret;
  rect_t* rect = (rect_t*)jrect;
  ret = (rect_t*)rect_cast(rect);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TRect_rect_1t_1get_1prop_1x(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  rect_t* obj = (rect_t*)jobj;

  return (jint)(obj->x);
}

JNIEXPORT jint JNICALL Java_awtk_TRect_rect_1t_1get_1prop_1y(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  rect_t* obj = (rect_t*)jobj;

  return (jint)(obj->y);
}

JNIEXPORT jint JNICALL Java_awtk_TRect_rect_1t_1get_1prop_1w(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  rect_t* obj = (rect_t*)jobj;

  return (jint)(obj->w);
}

JNIEXPORT jint JNICALL Java_awtk_TRect_rect_1t_1get_1prop_1h(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  rect_t* obj = (rect_t*)jobj;

  return (jint)(obj->h);
}

JNIEXPORT jlong JNICALL Java_awtk_TBitmap_bitmap_1create(JNIEnv* env,  jclass ajc) { /*func*/
  bitmap_t* ret;
  ret = (bitmap_t*)bitmap_create();

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TBitmap_bitmap_1create_1ex(JNIEnv* env,  jclass ajc, jint w, jint h, jint line_length, jint format) { /*func*/
  bitmap_t* ret;
  ret = (bitmap_t*)bitmap_create_ex(w, h, line_length, format);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TBitmap_bitmap_1get_1bpp(JNIEnv* env,  jclass ajc, jlong jbitmap) { /*func*/
  uint32_t ret;
  bitmap_t* bitmap = (bitmap_t*)jbitmap;
  ret = (uint32_t)bitmap_get_bpp(bitmap);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TBitmap_bitmap_1get_1bpp_1of_1format(JNIEnv* env,  jclass ajc, jint format) { /*func*/
  uint32_t ret;
  ret = (uint32_t)bitmap_get_bpp_of_format(format);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TBitmap_bitmap_1t_1get_1prop_1w(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  bitmap_t* obj = (bitmap_t*)jobj;

  return (jint)(obj->w);
}

JNIEXPORT jint JNICALL Java_awtk_TBitmap_bitmap_1t_1get_1prop_1h(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  bitmap_t* obj = (bitmap_t*)jobj;

  return (jint)(obj->h);
}

JNIEXPORT jint JNICALL Java_awtk_TBitmap_bitmap_1t_1get_1prop_1line_1length(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  bitmap_t* obj = (bitmap_t*)jobj;

  return (jint)(obj->line_length);
}

JNIEXPORT jint JNICALL Java_awtk_TBitmap_bitmap_1t_1get_1prop_1flags(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  bitmap_t* obj = (bitmap_t*)jobj;

  return (jint)(obj->flags);
}

JNIEXPORT jint JNICALL Java_awtk_TBitmap_bitmap_1t_1get_1prop_1format(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  bitmap_t* obj = (bitmap_t*)jobj;

  return (jint)(obj->format);
}

JNIEXPORT jstring JNICALL Java_awtk_TBitmap_bitmap_1t_1get_1prop_1name(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  bitmap_t* obj = (bitmap_t*)jobj;

  return (*env)->NewStringUTF(env, obj->name);
}

JNIEXPORT jlong JNICALL Java_awtk_TObject_object_1ref(JNIEnv* env,  jclass ajc, jlong jobj) { /*func*/
  object_t* ret;
  object_t* obj = (object_t*)jobj;
  ret = (object_t*)object_ref(obj);

  return (jlong)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TObject_object_1get_1type(JNIEnv* env,  jclass ajc, jlong jobj) { /*func*/
  const char* ret;
  object_t* obj = (object_t*)jobj;
  ret = (const char*)object_get_type(obj);

  return (*env)->NewStringUTF(env, ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TObject_object_1get_1desc(JNIEnv* env,  jclass ajc, jlong jobj) { /*func*/
  const char* ret;
  object_t* obj = (object_t*)jobj;
  ret = (const char*)object_get_desc(obj);

  return (*env)->NewStringUTF(env, ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1get_1size(JNIEnv* env,  jclass ajc, jlong jobj) { /*func*/
  uint32_t ret;
  object_t* obj = (object_t*)jobj;
  ret = (uint32_t)object_get_size(obj);

  return (jint)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TObject_object_1is_1collection(JNIEnv* env,  jclass ajc, jlong jobj) { /*func*/
  bool_t ret;
  object_t* obj = (object_t*)jobj;
  ret = (bool_t)object_is_collection(obj);

  return (jboolean)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1set_1name(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)object_set_name(obj, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1compare(JNIEnv* env,  jclass ajc, jlong jobj, jlong jother) { /*func*/
  int ret;
  object_t* obj = (object_t*)jobj;
  object_t* other = (object_t*)jother;
  ret = (int)object_compare(obj, other);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1get_1prop(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jlong jv) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  value_t* v = (value_t*)jv;
  ret = (ret_t)object_get_prop(obj, name, v);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TObject_object_1get_1prop_1str(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname) { /*func*/
  const char* ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (const char*)object_get_prop_str(obj, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (*env)->NewStringUTF(env, ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TObject_object_1get_1prop_1pointer(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname) { /*func*/
  void* ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (void*)object_get_prop_pointer(obj, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TObject_object_1get_1prop_1object(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname) { /*func*/
  object_t* ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (object_t*)object_get_prop_object(obj, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1get_1prop_1int(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jint defval) { /*func*/
  int32_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (int32_t)object_get_prop_int(obj, name, defval);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TObject_object_1get_1prop_1bool(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jboolean defval) { /*func*/
  bool_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (bool_t)object_get_prop_bool(obj, name, defval);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jboolean)(ret);
}

JNIEXPORT jdouble JNICALL Java_awtk_TObject_object_1get_1prop_1float(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jdouble defval) { /*func*/
  float_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (float_t)object_get_prop_float(obj, name, defval);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jdouble)(ret);
}

JNIEXPORT jdouble JNICALL Java_awtk_TObject_object_1get_1prop_1double(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jdouble defval) { /*func*/
  double ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (double)object_get_prop_double(obj, name, defval);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jdouble)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1remove_1prop(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)object_remove_prop(obj, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1set_1prop(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jlong jvalue) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  value_t* value = (value_t*)jvalue;
  ret = (ret_t)object_set_prop(obj, name, value);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1set_1prop_1str(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jstring jvalue) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  const char* value = (char*)(*env)->GetStringUTFChars(env, jvalue, 0);
  ret = (ret_t)object_set_prop_str(obj, name, value);
  (*env)->ReleaseStringUTFChars(env, jname, name);
  (*env)->ReleaseStringUTFChars(env, jvalue, value);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1set_1prop_1object(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jlong jvalue) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  object_t* value = (object_t*)jvalue;
  ret = (ret_t)object_set_prop_object(obj, name, value);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1set_1prop_1int(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jint value) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)object_set_prop_int(obj, name, value);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1set_1prop_1bool(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jboolean value) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)object_set_prop_bool(obj, name, value);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1set_1prop_1float(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jdouble value) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)object_set_prop_float(obj, name, value);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1set_1prop_1double(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jdouble value) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)object_set_prop_double(obj, name, value);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1copy_1prop(JNIEnv* env,  jclass ajc, jlong jobj, jlong jsrc, jstring jname) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  object_t* src = (object_t*)jsrc;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)object_copy_prop(obj, src, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TObject_object_1has_1prop(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname) { /*func*/
  bool_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (bool_t)object_has_prop(obj, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jboolean)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1eval(JNIEnv* env,  jclass ajc, jlong jobj, jstring jexpr, jlong jv) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* expr = (char*)(*env)->GetStringUTFChars(env, jexpr, 0);
  value_t* v = (value_t*)jv;
  ret = (ret_t)object_eval(obj, expr, v);
  (*env)->ReleaseStringUTFChars(env, jexpr, expr);

  return (jint)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TObject_object_1can_1exec(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jstring jargs) { /*func*/
  bool_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  const char* args = (char*)(*env)->GetStringUTFChars(env, jargs, 0);
  ret = (bool_t)object_can_exec(obj, name, args);
  (*env)->ReleaseStringUTFChars(env, jname, name);
  (*env)->ReleaseStringUTFChars(env, jargs, args);

  return (jboolean)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1exec(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jstring jargs) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  const char* args = (char*)(*env)->GetStringUTFChars(env, jargs, 0);
  ret = (ret_t)object_exec(obj, name, args);
  (*env)->ReleaseStringUTFChars(env, jname, name);
  (*env)->ReleaseStringUTFChars(env, jargs, args);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1notify_1changed(JNIEnv* env,  jclass ajc, jlong jobj) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  ret = (ret_t)object_notify_changed(obj);

  return (jint)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TObject_object_1has_1prop_1by_1path(JNIEnv* env,  jclass ajc, jlong jobj, jstring jpath) { /*func*/
  bool_t ret;
  object_t* obj = (object_t*)jobj;
  const char* path = (char*)(*env)->GetStringUTFChars(env, jpath, 0);
  ret = (bool_t)object_has_prop_by_path(obj, path);
  (*env)->ReleaseStringUTFChars(env, jpath, path);

  return (jboolean)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TObject_object_1get_1prop_1str_1by_1path(JNIEnv* env,  jclass ajc, jlong jobj, jstring jpath) { /*func*/
  const char* ret;
  object_t* obj = (object_t*)jobj;
  const char* path = (char*)(*env)->GetStringUTFChars(env, jpath, 0);
  ret = (const char*)object_get_prop_str_by_path(obj, path);
  (*env)->ReleaseStringUTFChars(env, jpath, path);

  return (*env)->NewStringUTF(env, ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TObject_object_1get_1prop_1pointer_1by_1path(JNIEnv* env,  jclass ajc, jlong jobj, jstring jpath) { /*func*/
  void* ret;
  object_t* obj = (object_t*)jobj;
  const char* path = (char*)(*env)->GetStringUTFChars(env, jpath, 0);
  ret = (void*)object_get_prop_pointer_by_path(obj, path);
  (*env)->ReleaseStringUTFChars(env, jpath, path);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TObject_object_1get_1prop_1object_1by_1path(JNIEnv* env,  jclass ajc, jlong jobj, jstring jpath) { /*func*/
  object_t* ret;
  object_t* obj = (object_t*)jobj;
  const char* path = (char*)(*env)->GetStringUTFChars(env, jpath, 0);
  ret = (object_t*)object_get_prop_object_by_path(obj, path);
  (*env)->ReleaseStringUTFChars(env, jpath, path);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1get_1prop_1int_1by_1path(JNIEnv* env,  jclass ajc, jlong jobj, jstring jpath, jint defval) { /*func*/
  int32_t ret;
  object_t* obj = (object_t*)jobj;
  const char* path = (char*)(*env)->GetStringUTFChars(env, jpath, 0);
  ret = (int32_t)object_get_prop_int_by_path(obj, path, defval);
  (*env)->ReleaseStringUTFChars(env, jpath, path);

  return (jint)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TObject_object_1get_1prop_1bool_1by_1path(JNIEnv* env,  jclass ajc, jlong jobj, jstring jpath, jboolean defval) { /*func*/
  bool_t ret;
  object_t* obj = (object_t*)jobj;
  const char* path = (char*)(*env)->GetStringUTFChars(env, jpath, 0);
  ret = (bool_t)object_get_prop_bool_by_path(obj, path, defval);
  (*env)->ReleaseStringUTFChars(env, jpath, path);

  return (jboolean)(ret);
}

JNIEXPORT jdouble JNICALL Java_awtk_TObject_object_1get_1prop_1float_1by_1path(JNIEnv* env,  jclass ajc, jlong jobj, jstring jpath, jdouble defval) { /*func*/
  float_t ret;
  object_t* obj = (object_t*)jobj;
  const char* path = (char*)(*env)->GetStringUTFChars(env, jpath, 0);
  ret = (float_t)object_get_prop_float_by_path(obj, path, defval);
  (*env)->ReleaseStringUTFChars(env, jpath, path);

  return (jdouble)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1set_1prop_1by_1path(JNIEnv* env,  jclass ajc, jlong jobj, jstring jpath, jlong jvalue) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* path = (char*)(*env)->GetStringUTFChars(env, jpath, 0);
  value_t* value = (value_t*)jvalue;
  ret = (ret_t)object_set_prop_by_path(obj, path, value);
  (*env)->ReleaseStringUTFChars(env, jpath, path);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1set_1prop_1str_1by_1path(JNIEnv* env,  jclass ajc, jlong jobj, jstring jpath, jstring jvalue) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* path = (char*)(*env)->GetStringUTFChars(env, jpath, 0);
  const char* value = (char*)(*env)->GetStringUTFChars(env, jvalue, 0);
  ret = (ret_t)object_set_prop_str_by_path(obj, path, value);
  (*env)->ReleaseStringUTFChars(env, jpath, path);
  (*env)->ReleaseStringUTFChars(env, jvalue, value);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1set_1prop_1object_1by_1path(JNIEnv* env,  jclass ajc, jlong jobj, jstring jpath, jlong jvalue) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* path = (char*)(*env)->GetStringUTFChars(env, jpath, 0);
  object_t* value = (object_t*)jvalue;
  ret = (ret_t)object_set_prop_object_by_path(obj, path, value);
  (*env)->ReleaseStringUTFChars(env, jpath, path);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1set_1prop_1int_1by_1path(JNIEnv* env,  jclass ajc, jlong jobj, jstring jpath, jint value) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* path = (char*)(*env)->GetStringUTFChars(env, jpath, 0);
  ret = (ret_t)object_set_prop_int_by_path(obj, path, value);
  (*env)->ReleaseStringUTFChars(env, jpath, path);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1set_1prop_1bool_1by_1path(JNIEnv* env,  jclass ajc, jlong jobj, jstring jpath, jboolean value) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* path = (char*)(*env)->GetStringUTFChars(env, jpath, 0);
  ret = (ret_t)object_set_prop_bool_by_path(obj, path, value);
  (*env)->ReleaseStringUTFChars(env, jpath, path);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1set_1prop_1float_1by_1path(JNIEnv* env,  jclass ajc, jlong jobj, jstring jpath, jdouble value) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* path = (char*)(*env)->GetStringUTFChars(env, jpath, 0);
  ret = (ret_t)object_set_prop_float_by_path(obj, path, value);
  (*env)->ReleaseStringUTFChars(env, jpath, path);

  return (jint)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TObject_object_1can_1exec_1by_1path(JNIEnv* env,  jclass ajc, jlong jobj, jstring jpath, jstring jargs) { /*func*/
  bool_t ret;
  object_t* obj = (object_t*)jobj;
  const char* path = (char*)(*env)->GetStringUTFChars(env, jpath, 0);
  const char* args = (char*)(*env)->GetStringUTFChars(env, jargs, 0);
  ret = (bool_t)object_can_exec_by_path(obj, path, args);
  (*env)->ReleaseStringUTFChars(env, jpath, path);
  (*env)->ReleaseStringUTFChars(env, jargs, args);

  return (jboolean)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1exec_1by_1path(JNIEnv* env,  jclass ajc, jlong jobj, jstring jpath, jstring jargs) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* path = (char*)(*env)->GetStringUTFChars(env, jpath, 0);
  const char* args = (char*)(*env)->GetStringUTFChars(env, jargs, 0);
  ret = (ret_t)object_exec_by_path(obj, path, args);
  (*env)->ReleaseStringUTFChars(env, jpath, path);
  (*env)->ReleaseStringUTFChars(env, jargs, args);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1get_1prop_1int8(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jint defval) { /*func*/
  int8_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (int8_t)object_get_prop_int8(obj, name, defval);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1set_1prop_1int8(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jint value) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)object_set_prop_int8(obj, name, value);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1get_1prop_1uint8(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jint defval) { /*func*/
  uint8_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (uint8_t)object_get_prop_uint8(obj, name, defval);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1set_1prop_1uint8(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jint value) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)object_set_prop_uint8(obj, name, value);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1get_1prop_1int16(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jint defval) { /*func*/
  int16_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (int16_t)object_get_prop_int16(obj, name, defval);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1set_1prop_1int16(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jint value) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)object_set_prop_int16(obj, name, value);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1get_1prop_1uint16(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jint defval) { /*func*/
  uint16_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (uint16_t)object_get_prop_uint16(obj, name, defval);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1set_1prop_1uint16(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jint value) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)object_set_prop_uint16(obj, name, value);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1get_1prop_1int32(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jint defval) { /*func*/
  int32_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (int32_t)object_get_prop_int32(obj, name, defval);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1set_1prop_1int32(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jint value) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)object_set_prop_int32(obj, name, value);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1get_1prop_1uint32(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jint defval) { /*func*/
  uint32_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (uint32_t)object_get_prop_uint32(obj, name, defval);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1set_1prop_1uint32(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jint value) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)object_set_prop_uint32(obj, name, value);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TObject_object_1get_1prop_1int64(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jlong defval) { /*func*/
  int64_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (int64_t)object_get_prop_int64(obj, name, defval);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1set_1prop_1int64(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jlong value) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)object_set_prop_int64(obj, name, value);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TObject_object_1get_1prop_1uint64(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jlong defval) { /*func*/
  uint64_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (uint64_t)object_get_prop_uint64(obj, name, defval);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1set_1prop_1uint64(JNIEnv* env,  jclass ajc, jlong jobj, jstring jname, jlong value) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)object_set_prop_uint64(obj, name, value);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObject_object_1t_1get_1prop_1ref_1count(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  object_t* obj = (object_t*)jobj;

  return (jint)(obj->ref_count);
}

JNIEXPORT jstring JNICALL Java_awtk_TObject_object_1t_1get_1prop_1name(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  object_t* obj = (object_t*)jobj;

  return (*env)->NewStringUTF(env, obj->name);
}

JNIEXPORT jlong JNICALL Java_awtk_TValue_value_1set_1bool(JNIEnv* env,  jclass ajc, jlong jv, jboolean value) { /*func*/
  value_t* ret;
  value_t* v = (value_t*)jv;
  ret = (value_t*)value_set_bool(v, value);

  return (jlong)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TValue_value_1bool(JNIEnv* env,  jclass ajc, jlong jv) { /*func*/
  bool_t ret;
  value_t* v = (value_t*)jv;
  ret = (bool_t)value_bool(v);

  return (jboolean)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TValue_value_1set_1int8(JNIEnv* env,  jclass ajc, jlong jv, jint value) { /*func*/
  value_t* ret;
  value_t* v = (value_t*)jv;
  ret = (value_t*)value_set_int8(v, value);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TValue_value_1int8(JNIEnv* env,  jclass ajc, jlong jv) { /*func*/
  int8_t ret;
  value_t* v = (value_t*)jv;
  ret = (int8_t)value_int8(v);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TValue_value_1set_1uint8(JNIEnv* env,  jclass ajc, jlong jv, jint value) { /*func*/
  value_t* ret;
  value_t* v = (value_t*)jv;
  ret = (value_t*)value_set_uint8(v, value);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TValue_value_1uint8(JNIEnv* env,  jclass ajc, jlong jv) { /*func*/
  int8_t ret;
  value_t* v = (value_t*)jv;
  ret = (int8_t)value_uint8(v);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TValue_value_1set_1int16(JNIEnv* env,  jclass ajc, jlong jv, jint value) { /*func*/
  value_t* ret;
  value_t* v = (value_t*)jv;
  ret = (value_t*)value_set_int16(v, value);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TValue_value_1int16(JNIEnv* env,  jclass ajc, jlong jv) { /*func*/
  int16_t ret;
  value_t* v = (value_t*)jv;
  ret = (int16_t)value_int16(v);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TValue_value_1set_1uint16(JNIEnv* env,  jclass ajc, jlong jv, jint value) { /*func*/
  value_t* ret;
  value_t* v = (value_t*)jv;
  ret = (value_t*)value_set_uint16(v, value);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TValue_value_1uint16(JNIEnv* env,  jclass ajc, jlong jv) { /*func*/
  uint16_t ret;
  value_t* v = (value_t*)jv;
  ret = (uint16_t)value_uint16(v);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TValue_value_1set_1int32(JNIEnv* env,  jclass ajc, jlong jv, jint value) { /*func*/
  value_t* ret;
  value_t* v = (value_t*)jv;
  ret = (value_t*)value_set_int32(v, value);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TValue_value_1int32(JNIEnv* env,  jclass ajc, jlong jv) { /*func*/
  int32_t ret;
  value_t* v = (value_t*)jv;
  ret = (int32_t)value_int32(v);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TValue_value_1set_1uint32(JNIEnv* env,  jclass ajc, jlong jv, jint value) { /*func*/
  value_t* ret;
  value_t* v = (value_t*)jv;
  ret = (value_t*)value_set_uint32(v, value);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TValue_value_1set_1int64(JNIEnv* env,  jclass ajc, jlong jv, jlong value) { /*func*/
  value_t* ret;
  value_t* v = (value_t*)jv;
  ret = (value_t*)value_set_int64(v, value);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TValue_value_1int64(JNIEnv* env,  jclass ajc, jlong jv) { /*func*/
  int64_t ret;
  value_t* v = (value_t*)jv;
  ret = (int64_t)value_int64(v);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TValue_value_1set_1uint64(JNIEnv* env,  jclass ajc, jlong jv, jlong value) { /*func*/
  value_t* ret;
  value_t* v = (value_t*)jv;
  ret = (value_t*)value_set_uint64(v, value);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TValue_value_1uint64(JNIEnv* env,  jclass ajc, jlong jv) { /*func*/
  uint64_t ret;
  value_t* v = (value_t*)jv;
  ret = (uint64_t)value_uint64(v);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TValue_value_1set_1float(JNIEnv* env,  jclass ajc, jlong jv, jdouble value) { /*func*/
  value_t* ret;
  value_t* v = (value_t*)jv;
  ret = (value_t*)value_set_float(v, value);

  return (jlong)(ret);
}

JNIEXPORT jdouble JNICALL Java_awtk_TValue_value_1float32(JNIEnv* env,  jclass ajc, jlong jv) { /*func*/
  float ret;
  value_t* v = (value_t*)jv;
  ret = (float)value_float32(v);

  return (jdouble)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TValue_value_1set_1double(JNIEnv* env,  jclass ajc, jlong jv, jdouble value) { /*func*/
  value_t* ret;
  value_t* v = (value_t*)jv;
  ret = (value_t*)value_set_double(v, value);

  return (jlong)(ret);
}

JNIEXPORT jdouble JNICALL Java_awtk_TValue_value_1double(JNIEnv* env,  jclass ajc, jlong jv) { /*func*/
  double ret;
  value_t* v = (value_t*)jv;
  ret = (double)value_double(v);

  return (jdouble)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TValue_value_1dup_1str(JNIEnv* env,  jclass ajc, jlong jv, jstring jvalue) { /*func*/
  value_t* ret;
  value_t* v = (value_t*)jv;
  const char* value = (char*)(*env)->GetStringUTFChars(env, jvalue, 0);
  ret = (value_t*)value_dup_str(v, value);
  (*env)->ReleaseStringUTFChars(env, jvalue, value);

  return (jlong)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TValue_value_1str(JNIEnv* env,  jclass ajc, jlong jv) { /*func*/
  const char* ret;
  value_t* v = (value_t*)jv;
  ret = (const char*)value_str(v);

  return (*env)->NewStringUTF(env, ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TValue_value_1str_1ex(JNIEnv* env,  jclass ajc, jlong jv, jstring jbuff, jint size) { /*func*/
  const char* ret;
  value_t* v = (value_t*)jv;
  char* buff = (char*)(*env)->GetStringUTFChars(env, jbuff, 0);
  ret = (const char*)value_str_ex(v, buff, size);
  (*env)->ReleaseStringUTFChars(env, jbuff, buff);

  return (*env)->NewStringUTF(env, ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TValue_value_1is_1null(JNIEnv* env,  jclass ajc, jlong jvalue) { /*func*/
  bool_t ret;
  value_t* value = (value_t*)jvalue;
  ret = (bool_t)value_is_null(value);

  return (jboolean)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TValue_value_1set_1int(JNIEnv* env,  jclass ajc, jlong jv, jint value) { /*func*/
  value_t* ret;
  value_t* v = (value_t*)jv;
  ret = (value_t*)value_set_int(v, value);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TValue_value_1set_1object(JNIEnv* env,  jclass ajc, jlong jv, jlong jvalue) { /*func*/
  value_t* ret;
  value_t* v = (value_t*)jv;
  object_t* value = (object_t*)jvalue;
  ret = (value_t*)value_set_object(v, value);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TValue_value_1object(JNIEnv* env,  jclass ajc, jlong jv) { /*func*/
  object_t* ret;
  value_t* v = (value_t*)jv;
  ret = (object_t*)value_object(v);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TValue_value_1set_1token(JNIEnv* env,  jclass ajc, jlong jv, jint value) { /*func*/
  value_t* ret;
  value_t* v = (value_t*)jv;
  ret = (value_t*)value_set_token(v, value);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TValue_value_1token(JNIEnv* env,  jclass ajc, jlong jv) { /*func*/
  uint32_t ret;
  value_t* v = (value_t*)jv;
  ret = (uint32_t)value_token(v);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TValue_value_1create(JNIEnv* env,  jclass ajc) { /*func*/
  value_t* ret;
  ret = (value_t*)value_create();

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TValue_value_1reset(JNIEnv* env,  jclass ajc, jlong jv) { /*func*/
  ret_t ret;
  value_t* v = (value_t*)jv;
  ret = (ret_t)value_reset(v);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TValue_value_1cast(JNIEnv* env,  jclass ajc, jlong jvalue) { /*func*/
  value_t* ret;
  value_t* value = (value_t*)jvalue;
  ret = (value_t*)value_cast(value);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TGlobal_tk_1init(JNIEnv* env,  jclass ajc, jint w, jint h, jint app_type, jstring japp_name, jstring japp_root) { /*func*/
  ret_t ret;
  const char* app_name = (char*)(*env)->GetStringUTFChars(env, japp_name, 0);
  const char* app_root = (char*)(*env)->GetStringUTFChars(env, japp_root, 0);
  ret = (ret_t)tk_init(w, h, app_type, app_name, app_root);
  (*env)->ReleaseStringUTFChars(env, japp_name, app_name);
  (*env)->ReleaseStringUTFChars(env, japp_root, app_root);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TGlobal_tk_1run(JNIEnv* env,  jclass ajc) { /*func*/
  ret_t ret;
  ret = (ret_t)tk_run();

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TGlobal_tk_1quit(JNIEnv* env,  jclass ajc) { /*func*/
  ret_t ret;
  ret = (ret_t)tk_quit();

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TGlobal_tk_1get_1pointer_1x(JNIEnv* env,  jclass ajc) { /*func*/
  int32_t ret;
  ret = (int32_t)tk_get_pointer_x();

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TGlobal_tk_1get_1pointer_1y(JNIEnv* env,  jclass ajc) { /*func*/
  int32_t ret;
  ret = (int32_t)tk_get_pointer_y();

  return (jint)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TGlobal_tk_1is_1pointer_1pressed(JNIEnv* env,  jclass ajc) { /*func*/
  bool_t ret;
  ret = (bool_t)tk_is_pointer_pressed();

  return (jboolean)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TBidiType_BIDI_1TYPE_1AUTO(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(BIDI_TYPE_AUTO);
}

JNIEXPORT jint JNICALL Java_awtk_TBidiType_BIDI_1TYPE_1LTR(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(BIDI_TYPE_LTR);
}

JNIEXPORT jint JNICALL Java_awtk_TBidiType_BIDI_1TYPE_1RTL(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(BIDI_TYPE_RTL);
}

JNIEXPORT jint JNICALL Java_awtk_TBidiType_BIDI_1TYPE_1LRO(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(BIDI_TYPE_LRO);
}

JNIEXPORT jint JNICALL Java_awtk_TBidiType_BIDI_1TYPE_1RLO(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(BIDI_TYPE_RLO);
}

JNIEXPORT jint JNICALL Java_awtk_TBidiType_BIDI_1TYPE_1WLTR(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(BIDI_TYPE_WLTR);
}

JNIEXPORT jint JNICALL Java_awtk_TBidiType_BIDI_1TYPE_1WRTL(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(BIDI_TYPE_WRTL);
}

JNIEXPORT jint JNICALL Java_awtk_TImageDrawType_IMAGE_1DRAW_1DEFAULT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(IMAGE_DRAW_DEFAULT);
}

JNIEXPORT jint JNICALL Java_awtk_TImageDrawType_IMAGE_1DRAW_1CENTER(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(IMAGE_DRAW_CENTER);
}

JNIEXPORT jint JNICALL Java_awtk_TImageDrawType_IMAGE_1DRAW_1ICON(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(IMAGE_DRAW_ICON);
}

JNIEXPORT jint JNICALL Java_awtk_TImageDrawType_IMAGE_1DRAW_1SCALE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(IMAGE_DRAW_SCALE);
}

JNIEXPORT jint JNICALL Java_awtk_TImageDrawType_IMAGE_1DRAW_1SCALE_1AUTO(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(IMAGE_DRAW_SCALE_AUTO);
}

JNIEXPORT jint JNICALL Java_awtk_TImageDrawType_IMAGE_1DRAW_1SCALE_1DOWN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(IMAGE_DRAW_SCALE_DOWN);
}

JNIEXPORT jint JNICALL Java_awtk_TImageDrawType_IMAGE_1DRAW_1SCALE_1W(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(IMAGE_DRAW_SCALE_W);
}

JNIEXPORT jint JNICALL Java_awtk_TImageDrawType_IMAGE_1DRAW_1SCALE_1H(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(IMAGE_DRAW_SCALE_H);
}

JNIEXPORT jint JNICALL Java_awtk_TImageDrawType_IMAGE_1DRAW_1REPEAT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(IMAGE_DRAW_REPEAT);
}

JNIEXPORT jint JNICALL Java_awtk_TImageDrawType_IMAGE_1DRAW_1REPEAT_1X(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(IMAGE_DRAW_REPEAT_X);
}

JNIEXPORT jint JNICALL Java_awtk_TImageDrawType_IMAGE_1DRAW_1REPEAT_1Y(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(IMAGE_DRAW_REPEAT_Y);
}

JNIEXPORT jint JNICALL Java_awtk_TImageDrawType_IMAGE_1DRAW_1REPEAT_1Y_1INVERSE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(IMAGE_DRAW_REPEAT_Y_INVERSE);
}

JNIEXPORT jint JNICALL Java_awtk_TImageDrawType_IMAGE_1DRAW_1PATCH9(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(IMAGE_DRAW_PATCH9);
}

JNIEXPORT jint JNICALL Java_awtk_TImageDrawType_IMAGE_1DRAW_1PATCH3_1X(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(IMAGE_DRAW_PATCH3_X);
}

JNIEXPORT jint JNICALL Java_awtk_TImageDrawType_IMAGE_1DRAW_1PATCH3_1Y(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(IMAGE_DRAW_PATCH3_Y);
}

JNIEXPORT jint JNICALL Java_awtk_TImageDrawType_IMAGE_1DRAW_1PATCH3_1X_1SCALE_1Y(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(IMAGE_DRAW_PATCH3_X_SCALE_Y);
}

JNIEXPORT jint JNICALL Java_awtk_TImageDrawType_IMAGE_1DRAW_1PATCH3_1Y_1SCALE_1X(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(IMAGE_DRAW_PATCH3_Y_SCALE_X);
}

JNIEXPORT jint JNICALL Java_awtk_TImageDrawType_IMAGE_1DRAW_1REPEAT9(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(IMAGE_DRAW_REPEAT9);
}

JNIEXPORT jint JNICALL Java_awtk_TImageDrawType_IMAGE_1DRAW_1REPEAT3_1X(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(IMAGE_DRAW_REPEAT3_X);
}

JNIEXPORT jint JNICALL Java_awtk_TImageDrawType_IMAGE_1DRAW_1REPEAT3_1Y(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(IMAGE_DRAW_REPEAT3_Y);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1get_1width(JNIEnv* env,  jclass ajc, jlong jc) { /*func*/
  wh_t ret;
  canvas_t* c = (canvas_t*)jc;
  ret = (wh_t)canvas_get_width(c);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1get_1height(JNIEnv* env,  jclass ajc, jlong jc) { /*func*/
  wh_t ret;
  canvas_t* c = (canvas_t*)jc;
  ret = (wh_t)canvas_get_height(c);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1get_1clip_1rect(JNIEnv* env,  jclass ajc, jlong jc, jlong jr) { /*func*/
  ret_t ret;
  canvas_t* c = (canvas_t*)jc;
  rect_t* r = (rect_t*)jr;
  ret = (ret_t)canvas_get_clip_rect(c, r);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1set_1clip_1rect(JNIEnv* env,  jclass ajc, jlong jc, jlong jr) { /*func*/
  ret_t ret;
  canvas_t* c = (canvas_t*)jc;
  const rect_t* r = (const rect_t*)jr;
  ret = (ret_t)canvas_set_clip_rect(c, r);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1set_1clip_1rect_1ex(JNIEnv* env,  jclass ajc, jlong jc, jlong jr, jboolean translate) { /*func*/
  ret_t ret;
  canvas_t* c = (canvas_t*)jc;
  const rect_t* r = (const rect_t*)jr;
  ret = (ret_t)canvas_set_clip_rect_ex(c, r, translate);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1set_1fill_1color_1str(JNIEnv* env,  jclass ajc, jlong jc, jstring jcolor) { /*func*/
  ret_t ret;
  canvas_t* c = (canvas_t*)jc;
  const char* color = (char*)(*env)->GetStringUTFChars(env, jcolor, 0);
  ret = (ret_t)canvas_set_fill_color_str(c, color);
  (*env)->ReleaseStringUTFChars(env, jcolor, color);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1set_1text_1color_1str(JNIEnv* env,  jclass ajc, jlong jc, jstring jcolor) { /*func*/
  ret_t ret;
  canvas_t* c = (canvas_t*)jc;
  const char* color = (char*)(*env)->GetStringUTFChars(env, jcolor, 0);
  ret = (ret_t)canvas_set_text_color_str(c, color);
  (*env)->ReleaseStringUTFChars(env, jcolor, color);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1set_1stroke_1color_1str(JNIEnv* env,  jclass ajc, jlong jc, jstring jcolor) { /*func*/
  ret_t ret;
  canvas_t* c = (canvas_t*)jc;
  const char* color = (char*)(*env)->GetStringUTFChars(env, jcolor, 0);
  ret = (ret_t)canvas_set_stroke_color_str(c, color);
  (*env)->ReleaseStringUTFChars(env, jcolor, color);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1set_1global_1alpha(JNIEnv* env,  jclass ajc, jlong jc, jint alpha) { /*func*/
  ret_t ret;
  canvas_t* c = (canvas_t*)jc;
  ret = (ret_t)canvas_set_global_alpha(c, alpha);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1translate(JNIEnv* env,  jclass ajc, jlong jc, jint dx, jint dy) { /*func*/
  ret_t ret;
  canvas_t* c = (canvas_t*)jc;
  ret = (ret_t)canvas_translate(c, dx, dy);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1untranslate(JNIEnv* env,  jclass ajc, jlong jc, jint dx, jint dy) { /*func*/
  ret_t ret;
  canvas_t* c = (canvas_t*)jc;
  ret = (ret_t)canvas_untranslate(c, dx, dy);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1draw_1vline(JNIEnv* env,  jclass ajc, jlong jc, jint x, jint y, jint h) { /*func*/
  ret_t ret;
  canvas_t* c = (canvas_t*)jc;
  ret = (ret_t)canvas_draw_vline(c, x, y, h);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1draw_1hline(JNIEnv* env,  jclass ajc, jlong jc, jint x, jint y, jint w) { /*func*/
  ret_t ret;
  canvas_t* c = (canvas_t*)jc;
  ret = (ret_t)canvas_draw_hline(c, x, y, w);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1fill_1rect(JNIEnv* env,  jclass ajc, jlong jc, jint x, jint y, jint w, jint h) { /*func*/
  ret_t ret;
  canvas_t* c = (canvas_t*)jc;
  ret = (ret_t)canvas_fill_rect(c, x, y, w, h);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1clear_1rect(JNIEnv* env,  jclass ajc, jlong jc, jint x, jint y, jint w, jint h) { /*func*/
  ret_t ret;
  canvas_t* c = (canvas_t*)jc;
  ret = (ret_t)canvas_clear_rect(c, x, y, w, h);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1stroke_1rect(JNIEnv* env,  jclass ajc, jlong jc, jint x, jint y, jint w, jint h) { /*func*/
  ret_t ret;
  canvas_t* c = (canvas_t*)jc;
  ret = (ret_t)canvas_stroke_rect(c, x, y, w, h);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1set_1font(JNIEnv* env,  jclass ajc, jlong jc, jstring jname, jint size) { /*func*/
  ret_t ret;
  canvas_t* c = (canvas_t*)jc;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)canvas_set_font(c, name, size);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jdouble JNICALL Java_awtk_TCanvas_canvas_1measure_1utf8(JNIEnv* env,  jclass ajc, jlong jc, jstring jstr) { /*func*/
  float_t ret;
  canvas_t* c = (canvas_t*)jc;
  const char* str = (char*)(*env)->GetStringUTFChars(env, jstr, 0);
  ret = (float_t)canvas_measure_utf8(c, str);
  (*env)->ReleaseStringUTFChars(env, jstr, str);

  return (jdouble)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1draw_1utf8(JNIEnv* env,  jclass ajc, jlong jc, jstring jstr, jint x, jint y) { /*func*/
  ret_t ret;
  canvas_t* c = (canvas_t*)jc;
  const char* str = (char*)(*env)->GetStringUTFChars(env, jstr, 0);
  ret = (ret_t)canvas_draw_utf8(c, str, x, y);
  (*env)->ReleaseStringUTFChars(env, jstr, str);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1draw_1utf8_1in_1rect(JNIEnv* env,  jclass ajc, jlong jc, jstring jstr, jlong jr) { /*func*/
  ret_t ret;
  canvas_t* c = (canvas_t*)jc;
  const char* str = (char*)(*env)->GetStringUTFChars(env, jstr, 0);
  const rect_t* r = (const rect_t*)jr;
  ret = (ret_t)canvas_draw_utf8_in_rect(c, str, r);
  (*env)->ReleaseStringUTFChars(env, jstr, str);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1draw_1icon(JNIEnv* env,  jclass ajc, jlong jc, jlong jimg, jint cx, jint cy) { /*func*/
  ret_t ret;
  canvas_t* c = (canvas_t*)jc;
  bitmap_t* img = (bitmap_t*)jimg;
  ret = (ret_t)canvas_draw_icon(c, img, cx, cy);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1draw_1image(JNIEnv* env,  jclass ajc, jlong jc, jlong jimg, jlong jsrc, jlong jdst) { /*func*/
  ret_t ret;
  canvas_t* c = (canvas_t*)jc;
  bitmap_t* img = (bitmap_t*)jimg;
  const rect_t* src = (const rect_t*)jsrc;
  const rect_t* dst = (const rect_t*)jdst;
  ret = (ret_t)canvas_draw_image(c, img, src, dst);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1draw_1image_1ex(JNIEnv* env,  jclass ajc, jlong jc, jlong jimg, jint draw_type, jlong jdst) { /*func*/
  ret_t ret;
  canvas_t* c = (canvas_t*)jc;
  bitmap_t* img = (bitmap_t*)jimg;
  const rect_t* dst = (const rect_t*)jdst;
  ret = (ret_t)canvas_draw_image_ex(c, img, draw_type, dst);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1draw_1image_1ex2(JNIEnv* env,  jclass ajc, jlong jc, jlong jimg, jint draw_type, jlong jsrc, jlong jdst) { /*func*/
  ret_t ret;
  canvas_t* c = (canvas_t*)jc;
  bitmap_t* img = (bitmap_t*)jimg;
  const rect_t* src = (const rect_t*)jsrc;
  const rect_t* dst = (const rect_t*)jdst;
  ret = (ret_t)canvas_draw_image_ex2(c, img, draw_type, src, dst);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TCanvas_canvas_1get_1vgcanvas(JNIEnv* env,  jclass ajc, jlong jc) { /*func*/
  vgcanvas_t* ret;
  canvas_t* c = (canvas_t*)jc;
  ret = (vgcanvas_t*)canvas_get_vgcanvas(c);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TCanvas_canvas_1cast(JNIEnv* env,  jclass ajc, jlong jc) { /*func*/
  canvas_t* ret;
  canvas_t* c = (canvas_t*)jc;
  ret = (canvas_t*)canvas_cast(c);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1reset(JNIEnv* env,  jclass ajc, jlong jc) { /*func*/
  ret_t ret;
  canvas_t* c = (canvas_t*)jc;
  ret = (ret_t)canvas_reset(c);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1t_1get_1prop_1ox(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  canvas_t* obj = (canvas_t*)jobj;

  return (jint)(obj->ox);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1t_1get_1prop_1oy(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  canvas_t* obj = (canvas_t*)jobj;

  return (jint)(obj->oy);
}

JNIEXPORT jstring JNICALL Java_awtk_TCanvas_canvas_1t_1get_1prop_1font_1name(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  canvas_t* obj = (canvas_t*)jobj;

  return (*env)->NewStringUTF(env, obj->font_name);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1t_1get_1prop_1font_1size(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  canvas_t* obj = (canvas_t*)jobj;

  return (jint)(obj->font_size);
}

JNIEXPORT jint JNICALL Java_awtk_TCanvas_canvas_1t_1get_1prop_1global_1alpha(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  canvas_t* obj = (canvas_t*)jobj;

  return (jint)(obj->global_alpha);
}

JNIEXPORT jint JNICALL Java_awtk_TClipBoardDataType_CLIP_1BOARD_1DATA_1TYPE_1NONE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(CLIP_BOARD_DATA_TYPE_NONE);
}

JNIEXPORT jint JNICALL Java_awtk_TClipBoardDataType_CLIP_1BOARD_1DATA_1TYPE_1TEXT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(CLIP_BOARD_DATA_TYPE_TEXT);
}

JNIEXPORT jint JNICALL Java_awtk_TClipBoard_clip_1board_1set_1text(JNIEnv* env,  jclass ajc, jstring jtext) { /*func*/
  ret_t ret;
  const char* text = (char*)(*env)->GetStringUTFChars(env, jtext, 0);
  ret = (ret_t)clip_board_set_text(text);
  (*env)->ReleaseStringUTFChars(env, jtext, text);

  return (jint)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TClipBoard_clip_1board_1get_1text(JNIEnv* env,  jclass ajc) { /*func*/
  const char* ret;
  ret = (const char*)clip_board_get_text();

  return (*env)->NewStringUTF(env, ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDialogQuitCode_DIALOG_1QUIT_1NONE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(DIALOG_QUIT_NONE);
}

JNIEXPORT jint JNICALL Java_awtk_TDialogQuitCode_DIALOG_1QUIT_1OK(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(DIALOG_QUIT_OK);
}

JNIEXPORT jint JNICALL Java_awtk_TDialogQuitCode_DIALOG_1QUIT_1YES(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(DIALOG_QUIT_YES);
}

JNIEXPORT jint JNICALL Java_awtk_TDialogQuitCode_DIALOG_1QUIT_1CANCEL(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(DIALOG_QUIT_CANCEL);
}

JNIEXPORT jint JNICALL Java_awtk_TDialogQuitCode_DIALOG_1QUIT_1NO(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(DIALOG_QUIT_NO);
}

JNIEXPORT jint JNICALL Java_awtk_TDialogQuitCode_DIALOG_1QUIT_1OTHER(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(DIALOG_QUIT_OTHER);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1POINTER_1DOWN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_POINTER_DOWN);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1POINTER_1DOWN_1BEFORE_1CHILDREN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_POINTER_DOWN_BEFORE_CHILDREN);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1POINTER_1MOVE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_POINTER_MOVE);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1POINTER_1MOVE_1BEFORE_1CHILDREN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_POINTER_MOVE_BEFORE_CHILDREN);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1POINTER_1UP(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_POINTER_UP);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1POINTER_1UP_1BEFORE_1CHILDREN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_POINTER_UP_BEFORE_CHILDREN);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1WHEEL(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_WHEEL);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1WHEEL_1BEFORE_1CHILDREN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_WHEEL_BEFORE_CHILDREN);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1POINTER_1DOWN_1ABORT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_POINTER_DOWN_ABORT);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1CONTEXT_1MENU(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_CONTEXT_MENU);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1POINTER_1ENTER(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_POINTER_ENTER);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1POINTER_1LEAVE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_POINTER_LEAVE);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1LONG_1PRESS(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_LONG_PRESS);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1CLICK(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_CLICK);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1FOCUS(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_FOCUS);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1BLUR(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_BLUR);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1KEY_1DOWN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_KEY_DOWN);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1KEY_1LONG_1PRESS(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_KEY_LONG_PRESS);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1KEY_1DOWN_1BEFORE_1CHILDREN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_KEY_DOWN_BEFORE_CHILDREN);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1KEY_1REPEAT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_KEY_REPEAT);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1KEY_1UP(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_KEY_UP);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1KEY_1UP_1BEFORE_1CHILDREN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_KEY_UP_BEFORE_CHILDREN);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1WILL_1MOVE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_WILL_MOVE);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1MOVE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_MOVE);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1WILL_1RESIZE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_WILL_RESIZE);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1RESIZE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_RESIZE);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1WILL_1MOVE_1RESIZE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_WILL_MOVE_RESIZE);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1MOVE_1RESIZE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_MOVE_RESIZE);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1VALUE_1WILL_1CHANGE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_VALUE_WILL_CHANGE);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1VALUE_1CHANGED(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_VALUE_CHANGED);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1VALUE_1CHANGING(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_VALUE_CHANGING);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1PAINT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_PAINT);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1BEFORE_1PAINT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_BEFORE_PAINT);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1AFTER_1PAINT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_AFTER_PAINT);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1PAINT_1DONE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_PAINT_DONE);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1LOCALE_1CHANGED(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_LOCALE_CHANGED);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1ANIM_1START(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_ANIM_START);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1ANIM_1STOP(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_ANIM_STOP);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1ANIM_1PAUSE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_ANIM_PAUSE);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1ANIM_1ONCE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_ANIM_ONCE);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1ANIM_1END(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_ANIM_END);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1WINDOW_1LOAD(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_WINDOW_LOAD);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1WIDGET_1LOAD(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_WIDGET_LOAD);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1WINDOW_1WILL_1OPEN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_WINDOW_WILL_OPEN);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1WINDOW_1OPEN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_WINDOW_OPEN);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1WINDOW_1TO_1BACKGROUND(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_WINDOW_TO_BACKGROUND);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1WINDOW_1TO_1FOREGROUND(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_WINDOW_TO_FOREGROUND);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1WINDOW_1CLOSE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_WINDOW_CLOSE);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1REQUEST_1CLOSE_1WINDOW(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_REQUEST_CLOSE_WINDOW);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1TOP_1WINDOW_1CHANGED(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_TOP_WINDOW_CHANGED);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1IM_1START(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_IM_START);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1IM_1STOP(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_IM_STOP);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1IM_1COMMIT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_IM_COMMIT);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1IM_1CLEAR(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_IM_CLEAR);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1IM_1CANCEL(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_IM_CANCEL);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1IM_1PREEDIT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_IM_PREEDIT);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1IM_1PREEDIT_1CONFIRM(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_IM_PREEDIT_CONFIRM);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1IM_1PREEDIT_1ABORT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_IM_PREEDIT_ABORT);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1IM_1SHOW_1CANDIDATES(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_IM_SHOW_CANDIDATES);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1IM_1SHOW_1PRE_1CANDIDATES(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_IM_SHOW_PRE_CANDIDATES);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1IM_1LANG_1CHANGED(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_IM_LANG_CHANGED);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1IM_1ACTION(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_IM_ACTION);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1IM_1ACTION_1INFO(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_IM_ACTION_INFO);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1DRAG_1START(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_DRAG_START);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1DRAG(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_DRAG);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1DRAG_1END(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_DRAG_END);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1RESET(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_RESET);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1SCREEN_1SAVER(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_SCREEN_SAVER);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1LOW_1MEMORY(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_LOW_MEMORY);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1OUT_1OF_1MEMORY(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_OUT_OF_MEMORY);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1ORIENTATION_1WILL_1CHANGED(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_ORIENTATION_WILL_CHANGED);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1ORIENTATION_1CHANGED(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_ORIENTATION_CHANGED);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1WIDGET_1CREATED(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_WIDGET_CREATED);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1REQUEST_1QUIT_1APP(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_REQUEST_QUIT_APP);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1THEME_1CHANGED(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_THEME_CHANGED);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1WIDGET_1ADD_1CHILD(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_WIDGET_ADD_CHILD);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1WIDGET_1REMOVE_1CHILD(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_WIDGET_REMOVE_CHILD);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1SCROLL_1START(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_SCROLL_START);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1SCROLL(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_SCROLL);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1SCROLL_1END(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_SCROLL_END);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1MULTI_1GESTURE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_MULTI_GESTURE);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1PAGE_1CHANGED(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_PAGE_CHANGED);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1ASSET_1MANAGER_1LOAD_1ASSET(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_ASSET_MANAGER_LOAD_ASSET);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1ASSET_1MANAGER_1UNLOAD_1ASSET(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_ASSET_MANAGER_UNLOAD_ASSET);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1ASSET_1MANAGER_1CLEAR_1CACHE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_ASSET_MANAGER_CLEAR_CACHE);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1TIMER(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_TIMER);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1REQ_1START(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_REQ_START);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1USER_1START(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_USER_START);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1NONE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_NONE);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1PROP_1WILL_1CHANGE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_PROP_WILL_CHANGE);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1PROP_1CHANGED(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_PROP_CHANGED);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1CMD_1WILL_1EXEC(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_CMD_WILL_EXEC);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1CMD_1EXECED(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_CMD_EXECED);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1CMD_1CAN_1EXEC(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_CMD_CAN_EXEC);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1ITEMS_1WILL_1CHANGE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_ITEMS_WILL_CHANGE);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1ITEMS_1CHANGED(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_ITEMS_CHANGED);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1PROPS_1CHANGED(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_PROPS_CHANGED);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1PROGRESS(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_PROGRESS);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1DONE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_DONE);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1ERROR(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_ERROR);
}

JNIEXPORT jint JNICALL Java_awtk_TEventType_EVT_1DESTROY(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EVT_DESTROY);
}

JNIEXPORT jint JNICALL Java_awtk_TFontManager_font_1manager_1unload_1font(JNIEnv* env,  jclass ajc, jlong jfm, jstring jname, jint size) { /*func*/
  ret_t ret;
  font_manager_t* fm = (font_manager_t*)jfm;
  char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)font_manager_unload_font(fm, name, size);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TFontManager_font_1manager_1shrink_1cache(JNIEnv* env,  jclass ajc, jlong jfm, jint cache_size) { /*func*/
  ret_t ret;
  font_manager_t* fm = (font_manager_t*)jfm;
  ret = (ret_t)font_manager_shrink_cache(fm, cache_size);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TFontManager_font_1manager_1unload_1all(JNIEnv* env,  jclass ajc, jlong jfm) { /*func*/
  ret_t ret;
  font_manager_t* fm = (font_manager_t*)jfm;
  ret = (ret_t)font_manager_unload_all(fm);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TGlyphFormat_GLYPH_1FMT_1ALPHA(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(GLYPH_FMT_ALPHA);
}

JNIEXPORT jint JNICALL Java_awtk_TGlyphFormat_GLYPH_1FMT_1MONO(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(GLYPH_FMT_MONO);
}

JNIEXPORT jint JNICALL Java_awtk_TGlyphFormat_GLYPH_1FMT_1RGBA(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(GLYPH_FMT_RGBA);
}

JNIEXPORT jint JNICALL Java_awtk_TIdle_idle_1remove(JNIEnv* env,  jclass ajc, jint idle_id) { /*func*/
  ret_t ret;
  ret = (ret_t)idle_remove(idle_id);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TImageManager_image_1manager(JNIEnv* env,  jclass ajc) { /*func*/
  image_manager_t* ret;
  ret = (image_manager_t*)image_manager();

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageManager_image_1manager_1get_1bitmap(JNIEnv* env,  jclass ajc, jlong jimm, jstring jname, jlong jimage) { /*func*/
  ret_t ret;
  image_manager_t* imm = (image_manager_t*)jimm;
  char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  bitmap_t* image = (bitmap_t*)jimage;
  ret = (ret_t)image_manager_get_bitmap(imm, name, image);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageManager_image_1manager_1preload(JNIEnv* env,  jclass ajc, jlong jimm, jstring jname) { /*func*/
  ret_t ret;
  image_manager_t* imm = (image_manager_t*)jimm;
  char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)image_manager_preload(imm, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TInputType_INPUT_1TEXT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(INPUT_TEXT);
}

JNIEXPORT jint JNICALL Java_awtk_TInputType_INPUT_1INT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(INPUT_INT);
}

JNIEXPORT jint JNICALL Java_awtk_TInputType_INPUT_1UINT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(INPUT_UINT);
}

JNIEXPORT jint JNICALL Java_awtk_TInputType_INPUT_1HEX(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(INPUT_HEX);
}

JNIEXPORT jint JNICALL Java_awtk_TInputType_INPUT_1FLOAT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(INPUT_FLOAT);
}

JNIEXPORT jint JNICALL Java_awtk_TInputType_INPUT_1UFLOAT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(INPUT_UFLOAT);
}

JNIEXPORT jint JNICALL Java_awtk_TInputType_INPUT_1EMAIL(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(INPUT_EMAIL);
}

JNIEXPORT jint JNICALL Java_awtk_TInputType_INPUT_1PASSWORD(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(INPUT_PASSWORD);
}

JNIEXPORT jint JNICALL Java_awtk_TInputType_INPUT_1PHONE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(INPUT_PHONE);
}

JNIEXPORT jint JNICALL Java_awtk_TInputType_INPUT_1IPV4(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(INPUT_IPV4);
}

JNIEXPORT jint JNICALL Java_awtk_TInputType_INPUT_1DATE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(INPUT_DATE);
}

JNIEXPORT jint JNICALL Java_awtk_TInputType_INPUT_1TIME(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(INPUT_TIME);
}

JNIEXPORT jint JNICALL Java_awtk_TInputType_INPUT_1TIME_1FULL(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(INPUT_TIME_FULL);
}

JNIEXPORT jint JNICALL Java_awtk_TInputType_INPUT_1CUSTOM(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(INPUT_CUSTOM);
}

JNIEXPORT jint JNICALL Java_awtk_TInputType_INPUT_1CUSTOM_1PASSWORD(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(INPUT_CUSTOM_PASSWORD);
}

JNIEXPORT jint JNICALL Java_awtk_TInputMethod_input_1method_1commit_1text(JNIEnv* env,  jclass ajc, jlong jim, jstring jtext) { /*func*/
  ret_t ret;
  input_method_t* im = (input_method_t*)jim;
  const char* text = (char*)(*env)->GetStringUTFChars(env, jtext, 0);
  ret = (ret_t)input_method_commit_text(im, text);
  (*env)->ReleaseStringUTFChars(env, jtext, text);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TInputMethod_input_1method_1set_1lang(JNIEnv* env,  jclass ajc, jlong jim, jstring jlang) { /*func*/
  ret_t ret;
  input_method_t* im = (input_method_t*)jim;
  const char* lang = (char*)(*env)->GetStringUTFChars(env, jlang, 0);
  ret = (ret_t)input_method_set_lang(im, lang);
  (*env)->ReleaseStringUTFChars(env, jlang, lang);

  return (jint)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TInputMethod_input_1method_1get_1lang(JNIEnv* env,  jclass ajc, jlong jim) { /*func*/
  const char* ret;
  input_method_t* im = (input_method_t*)jim;
  ret = (const char*)input_method_get_lang(im);

  return (*env)->NewStringUTF(env, ret);
}

JNIEXPORT jint JNICALL Java_awtk_TInputMethod_input_1method_1dispatch_1key(JNIEnv* env,  jclass ajc, jlong jim, jint key) { /*func*/
  ret_t ret;
  input_method_t* im = (input_method_t*)jim;
  ret = (ret_t)input_method_dispatch_key(im, key);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TInputMethod_input_1method_1dispatch_1keys(JNIEnv* env,  jclass ajc, jlong jim, jstring jkey) { /*func*/
  ret_t ret;
  input_method_t* im = (input_method_t*)jim;
  const char* key = (char*)(*env)->GetStringUTFChars(env, jkey, 0);
  ret = (ret_t)input_method_dispatch_keys(im, key);
  (*env)->ReleaseStringUTFChars(env, jkey, key);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TInputMethod_input_1method_1dispatch_1preedit(JNIEnv* env,  jclass ajc, jlong jim) { /*func*/
  ret_t ret;
  input_method_t* im = (input_method_t*)jim;
  ret = (ret_t)input_method_dispatch_preedit(im);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TInputMethod_input_1method_1dispatch_1preedit_1confirm(JNIEnv* env,  jclass ajc, jlong jim) { /*func*/
  ret_t ret;
  input_method_t* im = (input_method_t*)jim;
  ret = (ret_t)input_method_dispatch_preedit_confirm(im);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TInputMethod_input_1method_1dispatch_1preedit_1abort(JNIEnv* env,  jclass ajc, jlong jim) { /*func*/
  ret_t ret;
  input_method_t* im = (input_method_t*)jim;
  ret = (ret_t)input_method_dispatch_preedit_abort(im);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TInputMethod_input_1method(JNIEnv* env,  jclass ajc) { /*func*/
  input_method_t* ret;
  ret = (input_method_t*)input_method();

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1RETURN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_RETURN);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1ESCAPE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_ESCAPE);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1BACKSPACE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_BACKSPACE);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1TAB(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_TAB);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1SPACE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_SPACE);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1EXCLAIM(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_EXCLAIM);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1QUOTEDBL(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_QUOTEDBL);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1HASH(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_HASH);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1PERCENT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_PERCENT);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1DOLLAR(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_DOLLAR);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1AMPERSAND(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_AMPERSAND);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1QUOTE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_QUOTE);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1LEFTPAREN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_LEFTPAREN);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1RIGHTPAREN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_RIGHTPAREN);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1ASTERISK(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_ASTERISK);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1PLUS(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_PLUS);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1COMMA(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_COMMA);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1MINUS(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_MINUS);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1PERIOD(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_PERIOD);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1SLASH(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_SLASH);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_10(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_0);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_11(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_1);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_12(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_2);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_13(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_3);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_14(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_4);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_15(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_5);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_16(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_6);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_17(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_7);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_18(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_8);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_19(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_9);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1COLON(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_COLON);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1SEMICOLON(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_SEMICOLON);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1LESS(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_LESS);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1EQUAL(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_EQUAL);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1GREATER(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_GREATER);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1QUESTION(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_QUESTION);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1AT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_AT);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1LEFTBRACKET(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_LEFTBRACKET);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1BACKSLASH(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_BACKSLASH);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1RIGHTBRACKET(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_RIGHTBRACKET);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1CARET(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_CARET);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1UNDERSCORE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_UNDERSCORE);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1BACKQUOTE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_BACKQUOTE);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1a(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_a);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1b(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_b);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1c(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_c);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1d(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_d);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1e(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_e);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1f(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_f);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1g(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_g);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1h(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_h);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1i(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_i);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1j(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_j);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1k(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_k);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1l(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_l);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1m(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_m);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1n(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_n);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1o(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_o);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1p(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_p);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1q(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_q);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1r(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_r);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1s(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_s);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1t(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_t);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1u(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_u);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1v(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_v);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1w(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_w);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1x(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_x);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1y(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_y);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1z(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_z);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1A(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_A);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1B(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_B);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1C(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_C);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1D(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_D);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1E(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_E);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1F(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_F);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1G(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_G);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1H(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_H);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1I(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_I);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1J(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_J);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1K(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_K);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1L(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_L);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1M(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_M);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1N(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_N);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1O(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_O);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1P(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_P);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1Q(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_Q);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1R(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_R);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1S(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_S);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1T(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_T);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1U(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_U);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1V(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_V);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1W(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_W);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1X(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_X);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1Y(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_Y);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1Z(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_Z);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1DOT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_DOT);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1DELETE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_DELETE);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1LEFTBRACE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_LEFTBRACE);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1RIGHTBRACE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_RIGHTBRACE);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1LSHIFT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_LSHIFT);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1RSHIFT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_RSHIFT);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1LCTRL(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_LCTRL);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1RCTRL(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_RCTRL);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1LALT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_LALT);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1RALT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_RALT);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1CAPSLOCK(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_CAPSLOCK);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1HOME(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_HOME);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1END(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_END);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1INSERT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_INSERT);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1UP(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_UP);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1DOWN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_DOWN);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1LEFT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_LEFT);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1RIGHT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_RIGHT);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1PAGEUP(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_PAGEUP);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1PAGEDOWN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_PAGEDOWN);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1F1(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_F1);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1F2(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_F2);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1F3(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_F3);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1F4(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_F4);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1F5(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_F5);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1F6(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_F6);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1F7(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_F7);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1F8(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_F8);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1F9(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_F9);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1F10(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_F10);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1F11(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_F11);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1F12(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_F12);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1MENU(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_MENU);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1COMMAND(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_COMMAND);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1BACK(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_BACK);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyCode_TK_1KEY_1CANCEL(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(TK_KEY_CANCEL);
}

JNIEXPORT jlong JNICALL Java_awtk_TLocaleInfo_locale_1info(JNIEnv* env,  jclass ajc) { /*func*/
  locale_info_t* ret;
  ret = (locale_info_t*)locale_info();

  return (jlong)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TLocaleInfo_locale_1info_1tr(JNIEnv* env,  jclass ajc, jlong jlocale_info, jstring jtext) { /*func*/
  const char* ret;
  locale_info_t* locale_info = (locale_info_t*)jlocale_info;
  const char* text = (char*)(*env)->GetStringUTFChars(env, jtext, 0);
  ret = (const char*)locale_info_tr(locale_info, text);
  (*env)->ReleaseStringUTFChars(env, jtext, text);

  return (*env)->NewStringUTF(env, ret);
}

JNIEXPORT jint JNICALL Java_awtk_TLocaleInfo_locale_1info_1change(JNIEnv* env,  jclass ajc, jlong jlocale_info, jstring jlanguage, jstring jcountry) { /*func*/
  ret_t ret;
  locale_info_t* locale_info = (locale_info_t*)jlocale_info;
  char* language = (char*)(*env)->GetStringUTFChars(env, jlanguage, 0);
  char* country = (char*)(*env)->GetStringUTFChars(env, jcountry, 0);
  ret = (ret_t)locale_info_change(locale_info, language, country);
  (*env)->ReleaseStringUTFChars(env, jlanguage, language);
  (*env)->ReleaseStringUTFChars(env, jcountry, country);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TLocaleInfo_locale_1info_1off(JNIEnv* env,  jclass ajc, jlong jlocale_info, jint id) { /*func*/
  ret_t ret;
  locale_info_t* locale_info = (locale_info_t*)jlocale_info;
  ret = (ret_t)locale_info_off(locale_info, id);

  return (jint)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1BG_1COLOR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_BG_COLOR);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1FG_1COLOR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_FG_COLOR);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1MASK_1COLOR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_MASK_COLOR);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1FONT_1NAME(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_FONT_NAME);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1FONT_1SIZE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_FONT_SIZE);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1FONT_1STYLE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_FONT_STYLE);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1TEXT_1COLOR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_TEXT_COLOR);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1HIGHLIGHT_1FONT_1NAME(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_HIGHLIGHT_FONT_NAME);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1HIGHLIGHT_1FONT_1SIZE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_HIGHLIGHT_FONT_SIZE);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1HIGHLIGHT_1TEXT_1COLOR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_HIGHLIGHT_TEXT_COLOR);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1TIPS_1TEXT_1COLOR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_TIPS_TEXT_COLOR);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1TEXT_1ALIGN_1H(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_TEXT_ALIGN_H);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1TEXT_1ALIGN_1V(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_TEXT_ALIGN_V);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1BORDER_1COLOR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_BORDER_COLOR);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1BORDER_1WIDTH(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_BORDER_WIDTH);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1BORDER(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_BORDER);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1BG_1IMAGE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_BG_IMAGE);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1BG_1IMAGE_1DRAW_1TYPE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_BG_IMAGE_DRAW_TYPE);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1ICON(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_ICON);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1FG_1IMAGE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_FG_IMAGE);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1FG_1IMAGE_1DRAW_1TYPE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_FG_IMAGE_DRAW_TYPE);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1SPACER(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_SPACER);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1MARGIN(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_MARGIN);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1MARGIN_1LEFT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_MARGIN_LEFT);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1MARGIN_1RIGHT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_MARGIN_RIGHT);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1MARGIN_1TOP(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_MARGIN_TOP);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1MARGIN_1BOTTOM(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_MARGIN_BOTTOM);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1ICON_1AT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_ICON_AT);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1ACTIVE_1ICON(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_ACTIVE_ICON);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1X_1OFFSET(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_X_OFFSET);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1Y_1OFFSET(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_Y_OFFSET);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1SELECTED_1BG_1COLOR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_SELECTED_BG_COLOR);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1SELECTED_1FG_1COLOR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_SELECTED_FG_COLOR);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1SELECTED_1TEXT_1COLOR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_SELECTED_TEXT_COLOR);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1ROUND_1RADIUS(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_ROUND_RADIUS);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1ROUND_1RADIUS_1TOP_1LETF(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_ROUND_RADIUS_TOP_LETF);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1ROUND_1RADIUS_1TOP_1RIGHT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_ROUND_RADIUS_TOP_RIGHT);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1ROUND_1RADIUS_1BOTTOM_1LETF(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_ROUND_RADIUS_BOTTOM_LETF);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1ROUND_1RADIUS_1BOTTOM_1RIGHT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_ROUND_RADIUS_BOTTOM_RIGHT);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1CHILDREN_1LAYOUT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_CHILDREN_LAYOUT);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleId_STYLE_1ID_1SELF_1LAYOUT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, STYLE_ID_SELF_LAYOUT);
}

JNIEXPORT jint JNICALL Java_awtk_TStyle_style_1notify_1widget_1state_1changed(JNIEnv* env,  jclass ajc, jlong js, jlong jwidget) { /*func*/
  ret_t ret;
  style_t* s = (style_t*)js;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)style_notify_widget_state_changed(s, widget);

  return (jint)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TStyle_style_1is_1valid(JNIEnv* env,  jclass ajc, jlong js) { /*func*/
  bool_t ret;
  style_t* s = (style_t*)js;
  ret = (bool_t)style_is_valid(s);

  return (jboolean)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TStyle_style_1get_1int(JNIEnv* env,  jclass ajc, jlong js, jstring jname, jint defval) { /*func*/
  int32_t ret;
  style_t* s = (style_t*)js;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (int32_t)style_get_int(s, name, defval);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TStyle_style_1get_1uint(JNIEnv* env,  jclass ajc, jlong js, jstring jname, jint defval) { /*func*/
  uint32_t ret;
  style_t* s = (style_t*)js;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (uint32_t)style_get_uint(s, name, defval);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyle_style_1get_1str(JNIEnv* env,  jclass ajc, jlong js, jstring jname, jstring jdefval) { /*func*/
  const char* ret;
  style_t* s = (style_t*)js;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  const char* defval = (char*)(*env)->GetStringUTFChars(env, jdefval, 0);
  ret = (const char*)style_get_str(s, name, defval);
  (*env)->ReleaseStringUTFChars(env, jname, name);
  (*env)->ReleaseStringUTFChars(env, jdefval, defval);

  return (*env)->NewStringUTF(env, ret);
}

JNIEXPORT jint JNICALL Java_awtk_TStyle_style_1set(JNIEnv* env,  jclass ajc, jlong js, jstring jstate, jstring jname, jlong jvalue) { /*func*/
  ret_t ret;
  style_t* s = (style_t*)js;
  const char* state = (char*)(*env)->GetStringUTFChars(env, jstate, 0);
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  const value_t* value = (const value_t*)jvalue;
  ret = (ret_t)style_set(s, state, name, value);
  (*env)->ReleaseStringUTFChars(env, jstate, state);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TStyle_style_1set_1style_1data(JNIEnv* env,  jclass ajc, jlong js, jint data, jstring jstate) { /*func*/
  ret_t ret;
  style_t* s = (style_t*)js;
  const char* state = (char*)(*env)->GetStringUTFChars(env, jstate, 0);
  ret = (ret_t)style_set_style_data(s, data, state);
  (*env)->ReleaseStringUTFChars(env, jstate, state);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TStyle_style_1update_1state(JNIEnv* env,  jclass ajc, jlong js, jlong jtheme, jstring jwidget_type, jstring jstyle_name, jstring jwidget_state) { /*func*/
  ret_t ret;
  style_t* s = (style_t*)js;
  theme_t* theme = (theme_t*)jtheme;
  const char* widget_type = (char*)(*env)->GetStringUTFChars(env, jwidget_type, 0);
  const char* style_name = (char*)(*env)->GetStringUTFChars(env, jstyle_name, 0);
  const char* widget_state = (char*)(*env)->GetStringUTFChars(env, jwidget_state, 0);
  ret = (ret_t)style_update_state(s, theme, widget_type, style_name, widget_state);
  (*env)->ReleaseStringUTFChars(env, jwidget_type, widget_type);
  (*env)->ReleaseStringUTFChars(env, jstyle_name, style_name);
  (*env)->ReleaseStringUTFChars(env, jwidget_state, widget_state);

  return (jint)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyle_style_1get_1style_1state(JNIEnv* env,  jclass ajc, jlong js) { /*func*/
  const char* ret;
  style_t* s = (style_t*)js;
  ret = (const char*)style_get_style_state(s);

  return (*env)->NewStringUTF(env, ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TStyle_style_1is_1mutable(JNIEnv* env,  jclass ajc, jlong js) { /*func*/
  bool_t ret;
  style_t* s = (style_t*)js;
  ret = (bool_t)style_is_mutable(s);

  return (jboolean)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyle_style_1get_1style_1type(JNIEnv* env,  jclass ajc, jlong js) { /*func*/
  const char* ret;
  style_t* s = (style_t*)js;
  ret = (const char*)style_get_style_type(s);

  return (*env)->NewStringUTF(env, ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TTheme_theme(JNIEnv* env,  jclass ajc) { /*func*/
  theme_t* ret;
  ret = (theme_t*)theme();

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTimer_timer_1remove(JNIEnv* env,  jclass ajc, jint timer_id) { /*func*/
  ret_t ret;
  ret = (ret_t)timer_remove(timer_id);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTimer_timer_1reset(JNIEnv* env,  jclass ajc, jint timer_id) { /*func*/
  ret_t ret;
  ret = (ret_t)timer_reset(timer_id);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTimer_timer_1suspend(JNIEnv* env,  jclass ajc, jint timer_id) { /*func*/
  ret_t ret;
  ret = (ret_t)timer_suspend(timer_id);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTimer_timer_1resume(JNIEnv* env,  jclass ajc, jint timer_id) { /*func*/
  ret_t ret;
  ret = (ret_t)timer_resume(timer_id);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTimer_timer_1modify(JNIEnv* env,  jclass ajc, jint timer_id, jint duration) { /*func*/
  ret_t ret;
  ret = (ret_t)timer_modify(timer_id, duration);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TAlignV_ALIGN_1V_1NONE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(ALIGN_V_NONE);
}

JNIEXPORT jint JNICALL Java_awtk_TAlignV_ALIGN_1V_1MIDDLE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(ALIGN_V_MIDDLE);
}

JNIEXPORT jint JNICALL Java_awtk_TAlignV_ALIGN_1V_1TOP(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(ALIGN_V_TOP);
}

JNIEXPORT jint JNICALL Java_awtk_TAlignV_ALIGN_1V_1BOTTOM(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(ALIGN_V_BOTTOM);
}

JNIEXPORT jint JNICALL Java_awtk_TAlignH_ALIGN_1H_1NONE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(ALIGN_H_NONE);
}

JNIEXPORT jint JNICALL Java_awtk_TAlignH_ALIGN_1H_1CENTER(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(ALIGN_H_CENTER);
}

JNIEXPORT jint JNICALL Java_awtk_TAlignH_ALIGN_1H_1LEFT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(ALIGN_H_LEFT);
}

JNIEXPORT jint JNICALL Java_awtk_TAlignH_ALIGN_1H_1RIGHT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(ALIGN_H_RIGHT);
}

JNIEXPORT jint JNICALL Java_awtk_TAppType_APP_1MOBILE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(APP_MOBILE);
}

JNIEXPORT jint JNICALL Java_awtk_TAppType_APP_1SIMULATOR(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(APP_SIMULATOR);
}

JNIEXPORT jint JNICALL Java_awtk_TAppType_APP_1DESKTOP(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(APP_DESKTOP);
}

JNIEXPORT jint JNICALL Java_awtk_TBitmapFormat_BITMAP_1FMT_1NONE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(BITMAP_FMT_NONE);
}

JNIEXPORT jint JNICALL Java_awtk_TBitmapFormat_BITMAP_1FMT_1RGBA8888(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(BITMAP_FMT_RGBA8888);
}

JNIEXPORT jint JNICALL Java_awtk_TBitmapFormat_BITMAP_1FMT_1ABGR8888(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(BITMAP_FMT_ABGR8888);
}

JNIEXPORT jint JNICALL Java_awtk_TBitmapFormat_BITMAP_1FMT_1BGRA8888(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(BITMAP_FMT_BGRA8888);
}

JNIEXPORT jint JNICALL Java_awtk_TBitmapFormat_BITMAP_1FMT_1ARGB8888(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(BITMAP_FMT_ARGB8888);
}

JNIEXPORT jint JNICALL Java_awtk_TBitmapFormat_BITMAP_1FMT_1RGB565(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(BITMAP_FMT_RGB565);
}

JNIEXPORT jint JNICALL Java_awtk_TBitmapFormat_BITMAP_1FMT_1BGR565(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(BITMAP_FMT_BGR565);
}

JNIEXPORT jint JNICALL Java_awtk_TBitmapFormat_BITMAP_1FMT_1RGB888(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(BITMAP_FMT_RGB888);
}

JNIEXPORT jint JNICALL Java_awtk_TBitmapFormat_BITMAP_1FMT_1BGR888(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(BITMAP_FMT_BGR888);
}

JNIEXPORT jint JNICALL Java_awtk_TBitmapFormat_BITMAP_1FMT_1GRAY(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(BITMAP_FMT_GRAY);
}

JNIEXPORT jint JNICALL Java_awtk_TBitmapFormat_BITMAP_1FMT_1MONO(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(BITMAP_FMT_MONO);
}

JNIEXPORT jint JNICALL Java_awtk_TBitmapFlag_BITMAP_1FLAG_1NONE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(BITMAP_FLAG_NONE);
}

JNIEXPORT jint JNICALL Java_awtk_TBitmapFlag_BITMAP_1FLAG_1OPAQUE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(BITMAP_FLAG_OPAQUE);
}

JNIEXPORT jint JNICALL Java_awtk_TBitmapFlag_BITMAP_1FLAG_1IMMUTABLE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(BITMAP_FLAG_IMMUTABLE);
}

JNIEXPORT jint JNICALL Java_awtk_TBitmapFlag_BITMAP_1FLAG_1TEXTURE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(BITMAP_FLAG_TEXTURE);
}

JNIEXPORT jint JNICALL Java_awtk_TBitmapFlag_BITMAP_1FLAG_1CHANGED(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(BITMAP_FLAG_CHANGED);
}

JNIEXPORT jint JNICALL Java_awtk_TBitmapFlag_BITMAP_1FLAG_1PREMULTI_1ALPHA(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(BITMAP_FLAG_PREMULTI_ALPHA);
}

JNIEXPORT jlong JNICALL Java_awtk_TVgcanvas_vgcanvas_1cast(JNIEnv* env,  jclass ajc, jlong jvg) { /*func*/
  vgcanvas_t* ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (vgcanvas_t*)vgcanvas_cast(vg);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1flush(JNIEnv* env,  jclass ajc, jlong jvg) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_flush(vg);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1begin_1path(JNIEnv* env,  jclass ajc, jlong jvg) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_begin_path(vg);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1move_1to(JNIEnv* env,  jclass ajc, jlong jvg, jdouble x, jdouble y) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_move_to(vg, x, y);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1line_1to(JNIEnv* env,  jclass ajc, jlong jvg, jdouble x, jdouble y) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_line_to(vg, x, y);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1quad_1to(JNIEnv* env,  jclass ajc, jlong jvg, jdouble cpx, jdouble cpy, jdouble x, jdouble y) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_quad_to(vg, cpx, cpy, x, y);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1bezier_1to(JNIEnv* env,  jclass ajc, jlong jvg, jdouble cp1x, jdouble cp1y, jdouble cp2x, jdouble cp2y, jdouble x, jdouble y) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_bezier_to(vg, cp1x, cp1y, cp2x, cp2y, x, y);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1arc_1to(JNIEnv* env,  jclass ajc, jlong jvg, jdouble x1, jdouble y1, jdouble x2, jdouble y2, jdouble r) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_arc_to(vg, x1, y1, x2, y2, r);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1arc(JNIEnv* env,  jclass ajc, jlong jvg, jdouble x, jdouble y, jdouble r, jdouble start_angle, jdouble end_angle, jboolean ccw) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_arc(vg, x, y, r, start_angle, end_angle, ccw);

  return (jint)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TVgcanvas_vgcanvas_1is_1point_1in_1path(JNIEnv* env,  jclass ajc, jlong jvg, jdouble x, jdouble y) { /*func*/
  bool_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (bool_t)vgcanvas_is_point_in_path(vg, x, y);

  return (jboolean)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1rect(JNIEnv* env,  jclass ajc, jlong jvg, jdouble x, jdouble y, jdouble w, jdouble h) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_rect(vg, x, y, w, h);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1rounded_1rect(JNIEnv* env,  jclass ajc, jlong jvg, jdouble x, jdouble y, jdouble w, jdouble h, jdouble r) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_rounded_rect(vg, x, y, w, h, r);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1ellipse(JNIEnv* env,  jclass ajc, jlong jvg, jdouble x, jdouble y, jdouble rx, jdouble ry) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_ellipse(vg, x, y, rx, ry);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1close_1path(JNIEnv* env,  jclass ajc, jlong jvg) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_close_path(vg);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1path_1winding(JNIEnv* env,  jclass ajc, jlong jvg, jboolean dir) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_path_winding(vg, dir);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1rotate(JNIEnv* env,  jclass ajc, jlong jvg, jdouble rad) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_rotate(vg, rad);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1scale(JNIEnv* env,  jclass ajc, jlong jvg, jdouble x, jdouble y) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_scale(vg, x, y);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1translate(JNIEnv* env,  jclass ajc, jlong jvg, jdouble x, jdouble y) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_translate(vg, x, y);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1transform(JNIEnv* env,  jclass ajc, jlong jvg, jdouble a, jdouble b, jdouble c, jdouble d, jdouble e, jdouble f) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_transform(vg, a, b, c, d, e, f);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1set_1transform(JNIEnv* env,  jclass ajc, jlong jvg, jdouble a, jdouble b, jdouble c, jdouble d, jdouble e, jdouble f) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_set_transform(vg, a, b, c, d, e, f);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1clip_1rect(JNIEnv* env,  jclass ajc, jlong jvg, jdouble x, jdouble y, jdouble w, jdouble h) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_clip_rect(vg, x, y, w, h);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1intersect_1clip_1rect(JNIEnv* env,  jclass ajc, jlong jvg, jdouble x, jdouble y, jdouble w, jdouble h) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_intersect_clip_rect(vg, x, y, w, h);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1fill(JNIEnv* env,  jclass ajc, jlong jvg) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_fill(vg);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1stroke(JNIEnv* env,  jclass ajc, jlong jvg) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_stroke(vg);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1paint(JNIEnv* env,  jclass ajc, jlong jvg, jboolean stroke, jlong jimg) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  bitmap_t* img = (bitmap_t*)jimg;
  ret = (ret_t)vgcanvas_paint(vg, stroke, img);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1set_1font(JNIEnv* env,  jclass ajc, jlong jvg, jstring jfont) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  char* font = (char*)(*env)->GetStringUTFChars(env, jfont, 0);
  ret = (ret_t)vgcanvas_set_font(vg, font);
  (*env)->ReleaseStringUTFChars(env, jfont, font);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1set_1font_1size(JNIEnv* env,  jclass ajc, jlong jvg, jdouble font) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_set_font_size(vg, font);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1set_1text_1align(JNIEnv* env,  jclass ajc, jlong jvg, jstring jvalue) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  char* value = (char*)(*env)->GetStringUTFChars(env, jvalue, 0);
  ret = (ret_t)vgcanvas_set_text_align(vg, value);
  (*env)->ReleaseStringUTFChars(env, jvalue, value);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1set_1text_1baseline(JNIEnv* env,  jclass ajc, jlong jvg, jstring jvalue) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  char* value = (char*)(*env)->GetStringUTFChars(env, jvalue, 0);
  ret = (ret_t)vgcanvas_set_text_baseline(vg, value);
  (*env)->ReleaseStringUTFChars(env, jvalue, value);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1fill_1text(JNIEnv* env,  jclass ajc, jlong jvg, jstring jtext, jdouble x, jdouble y, jdouble max_width) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  char* text = (char*)(*env)->GetStringUTFChars(env, jtext, 0);
  ret = (ret_t)vgcanvas_fill_text(vg, text, x, y, max_width);
  (*env)->ReleaseStringUTFChars(env, jtext, text);

  return (jint)(ret);
}

JNIEXPORT jdouble JNICALL Java_awtk_TVgcanvas_vgcanvas_1measure_1text(JNIEnv* env,  jclass ajc, jlong jvg, jstring jtext) { /*func*/
  float_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  char* text = (char*)(*env)->GetStringUTFChars(env, jtext, 0);
  ret = (float_t)vgcanvas_measure_text(vg, text);
  (*env)->ReleaseStringUTFChars(env, jtext, text);

  return (jdouble)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1draw_1image(JNIEnv* env,  jclass ajc, jlong jvg, jlong jimg, jdouble sx, jdouble sy, jdouble sw, jdouble sh, jdouble dx, jdouble dy, jdouble dw, jdouble dh) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  bitmap_t* img = (bitmap_t*)jimg;
  ret = (ret_t)vgcanvas_draw_image(vg, img, sx, sy, sw, sh, dx, dy, dw, dh);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1draw_1icon(JNIEnv* env,  jclass ajc, jlong jvg, jlong jimg, jdouble sx, jdouble sy, jdouble sw, jdouble sh, jdouble dx, jdouble dy, jdouble dw, jdouble dh) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  bitmap_t* img = (bitmap_t*)jimg;
  ret = (ret_t)vgcanvas_draw_icon(vg, img, sx, sy, sw, sh, dx, dy, dw, dh);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1set_1antialias(JNIEnv* env,  jclass ajc, jlong jvg, jboolean value) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_set_antialias(vg, value);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1set_1global_1alpha(JNIEnv* env,  jclass ajc, jlong jvg, jdouble alpha) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_set_global_alpha(vg, alpha);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1set_1line_1width(JNIEnv* env,  jclass ajc, jlong jvg, jdouble value) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_set_line_width(vg, value);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1set_1fill_1color_1str(JNIEnv* env,  jclass ajc, jlong jvg, jstring jcolor) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  const char* color = (char*)(*env)->GetStringUTFChars(env, jcolor, 0);
  ret = (ret_t)vgcanvas_set_fill_color_str(vg, color);
  (*env)->ReleaseStringUTFChars(env, jcolor, color);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1set_1stroke_1color_1str(JNIEnv* env,  jclass ajc, jlong jvg, jstring jcolor) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  const char* color = (char*)(*env)->GetStringUTFChars(env, jcolor, 0);
  ret = (ret_t)vgcanvas_set_stroke_color_str(vg, color);
  (*env)->ReleaseStringUTFChars(env, jcolor, color);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1set_1line_1cap(JNIEnv* env,  jclass ajc, jlong jvg, jstring jvalue) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  char* value = (char*)(*env)->GetStringUTFChars(env, jvalue, 0);
  ret = (ret_t)vgcanvas_set_line_cap(vg, value);
  (*env)->ReleaseStringUTFChars(env, jvalue, value);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1set_1line_1join(JNIEnv* env,  jclass ajc, jlong jvg, jstring jvalue) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  char* value = (char*)(*env)->GetStringUTFChars(env, jvalue, 0);
  ret = (ret_t)vgcanvas_set_line_join(vg, value);
  (*env)->ReleaseStringUTFChars(env, jvalue, value);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1set_1miter_1limit(JNIEnv* env,  jclass ajc, jlong jvg, jdouble value) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_set_miter_limit(vg, value);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1save(JNIEnv* env,  jclass ajc, jlong jvg) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_save(vg);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1restore(JNIEnv* env,  jclass ajc, jlong jvg) { /*func*/
  ret_t ret;
  vgcanvas_t* vg = (vgcanvas_t*)jvg;
  ret = (ret_t)vgcanvas_restore(vg);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1t_1get_1prop_1w(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  vgcanvas_t* obj = (vgcanvas_t*)jobj;

  return (jint)(obj->w);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1t_1get_1prop_1h(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  vgcanvas_t* obj = (vgcanvas_t*)jobj;

  return (jint)(obj->h);
}

JNIEXPORT jint JNICALL Java_awtk_TVgcanvas_vgcanvas_1t_1get_1prop_1stride(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  vgcanvas_t* obj = (vgcanvas_t*)jobj;

  return (jint)(obj->stride);
}

JNIEXPORT jdouble JNICALL Java_awtk_TVgcanvas_vgcanvas_1t_1get_1prop_1ratio(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  vgcanvas_t* obj = (vgcanvas_t*)jobj;

  return (jdouble)(obj->ratio);
}

JNIEXPORT jboolean JNICALL Java_awtk_TVgcanvas_vgcanvas_1t_1get_1prop_1anti_1alias(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  vgcanvas_t* obj = (vgcanvas_t*)jobj;

  return (jboolean)(obj->anti_alias);
}

JNIEXPORT jdouble JNICALL Java_awtk_TVgcanvas_vgcanvas_1t_1get_1prop_1line_1width(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  vgcanvas_t* obj = (vgcanvas_t*)jobj;

  return (jdouble)(obj->line_width);
}

JNIEXPORT jdouble JNICALL Java_awtk_TVgcanvas_vgcanvas_1t_1get_1prop_1global_1alpha(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  vgcanvas_t* obj = (vgcanvas_t*)jobj;

  return (jdouble)(obj->global_alpha);
}

JNIEXPORT jdouble JNICALL Java_awtk_TVgcanvas_vgcanvas_1t_1get_1prop_1miter_1limit(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  vgcanvas_t* obj = (vgcanvas_t*)jobj;

  return (jdouble)(obj->miter_limit);
}

JNIEXPORT jstring JNICALL Java_awtk_TVgcanvas_vgcanvas_1t_1get_1prop_1line_1cap(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  vgcanvas_t* obj = (vgcanvas_t*)jobj;

  return (*env)->NewStringUTF(env, obj->line_cap);
}

JNIEXPORT jstring JNICALL Java_awtk_TVgcanvas_vgcanvas_1t_1get_1prop_1line_1join(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  vgcanvas_t* obj = (vgcanvas_t*)jobj;

  return (*env)->NewStringUTF(env, obj->line_join);
}

JNIEXPORT jstring JNICALL Java_awtk_TVgcanvas_vgcanvas_1t_1get_1prop_1font(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  vgcanvas_t* obj = (vgcanvas_t*)jobj;

  return (*env)->NewStringUTF(env, obj->font);
}

JNIEXPORT jdouble JNICALL Java_awtk_TVgcanvas_vgcanvas_1t_1get_1prop_1font_1size(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  vgcanvas_t* obj = (vgcanvas_t*)jobj;

  return (jdouble)(obj->font_size);
}

JNIEXPORT jstring JNICALL Java_awtk_TVgcanvas_vgcanvas_1t_1get_1prop_1text_1align(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  vgcanvas_t* obj = (vgcanvas_t*)jobj;

  return (*env)->NewStringUTF(env, obj->text_align);
}

JNIEXPORT jstring JNICALL Java_awtk_TVgcanvas_vgcanvas_1t_1get_1prop_1text_1baseline(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  vgcanvas_t* obj = (vgcanvas_t*)jobj;

  return (*env)->NewStringUTF(env, obj->text_baseline);
}

JNIEXPORT jstring JNICALL Java_awtk_TVgcanvasLineCap_VGCANVAS_1LINE_1CAP_1ROUND(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, VGCANVAS_LINE_CAP_ROUND);
}

JNIEXPORT jstring JNICALL Java_awtk_TVgcanvasLineCap_VGCANVAS_1LINE_1CAP_1SQUARE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, VGCANVAS_LINE_CAP_SQUARE);
}

JNIEXPORT jstring JNICALL Java_awtk_TVgcanvasLineCap_VGCANVAS_1LINE_1CAP_1BUTT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, VGCANVAS_LINE_CAP_BUTT);
}

JNIEXPORT jstring JNICALL Java_awtk_TVgcanvasLineJoin_VGCANVAS_1LINE_1JOIN_1ROUND(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, VGCANVAS_LINE_JOIN_ROUND);
}

JNIEXPORT jstring JNICALL Java_awtk_TVgcanvasLineJoin_VGCANVAS_1LINE_1JOIN_1BEVEL(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, VGCANVAS_LINE_JOIN_BEVEL);
}

JNIEXPORT jstring JNICALL Java_awtk_TVgcanvasLineJoin_VGCANVAS_1LINE_1JOIN_1MITTER(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, VGCANVAS_LINE_JOIN_MITTER);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1EXEC(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_EXEC);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1X(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_X);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1Y(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_Y);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1W(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_W);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1H(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_H);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1DESIGN_1W(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_DESIGN_W);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1DESIGN_1H(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_DESIGN_H);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1AUTO_1SCALE_1CHILDREN_1X(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_AUTO_SCALE_CHILDREN_X);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1AUTO_1SCALE_1CHILDREN_1Y(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_AUTO_SCALE_CHILDREN_Y);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1AUTO_1SCALE_1CHILDREN_1W(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_AUTO_SCALE_CHILDREN_W);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1AUTO_1SCALE_1CHILDREN_1H(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_AUTO_SCALE_CHILDREN_H);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1INPUTING(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_INPUTING);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1ALWAYS_1ON_1TOP(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_ALWAYS_ON_TOP);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1CARET_1X(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_CARET_X);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1CARET_1Y(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_CARET_Y);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1DIRTY_1RECT_1TOLERANCE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_DIRTY_RECT_TOLERANCE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1BIDI(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_BIDI);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1CANVAS(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_CANVAS);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1LOCALIZE_1OPTIONS(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_LOCALIZE_OPTIONS);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1NATIVE_1WINDOW(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_NATIVE_WINDOW);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1HIGHLIGHT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_HIGHLIGHT);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1BAR_1SIZE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_BAR_SIZE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1OPACITY(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_OPACITY);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1MIN_1W(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_MIN_W);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1MAX_1W(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_MAX_W);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1AUTO_1ADJUST_1SIZE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_AUTO_ADJUST_SIZE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1SINGLE_1INSTANCE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_SINGLE_INSTANCE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1CHILDREN_1LAYOUT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_CHILDREN_LAYOUT);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1LAYOUT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_LAYOUT);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1SELF_1LAYOUT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_SELF_LAYOUT);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1LAYOUT_1W(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_LAYOUT_W);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1LAYOUT_1H(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_LAYOUT_H);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1VIRTUAL_1W(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_VIRTUAL_W);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1VIRTUAL_1H(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_VIRTUAL_H);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1NAME(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_NAME);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1TYPE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_TYPE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1CLOSABLE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_CLOSABLE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1POINTER_1CURSOR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_POINTER_CURSOR);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1VALUE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_VALUE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1REVERSE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_REVERSE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1LENGTH(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_LENGTH);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1LINE_1WRAP(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_LINE_WRAP);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1WORD_1WRAP(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_WORD_WRAP);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1TEXT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_TEXT);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1TR_1TEXT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_TR_TEXT);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1STYLE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_STYLE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1ENABLE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_ENABLE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1FEEDBACK(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_FEEDBACK);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1FLOATING(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_FLOATING);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1MARGIN(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_MARGIN);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1SPACING(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_SPACING);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1LEFT_1MARGIN(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_LEFT_MARGIN);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1RIGHT_1MARGIN(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_RIGHT_MARGIN);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1TOP_1MARGIN(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_TOP_MARGIN);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1BOTTOM_1MARGIN(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_BOTTOM_MARGIN);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1STEP(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_STEP);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1VISIBLE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_VISIBLE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1SENSITIVE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_SENSITIVE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1ANIMATION(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_ANIMATION);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1ANIM_1HINT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_ANIM_HINT);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1FULLSCREEN(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_FULLSCREEN);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1DISABLE_1ANIM(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_DISABLE_ANIM);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1OPEN_1ANIM_1HINT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_OPEN_ANIM_HINT);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1CLOSE_1ANIM_1HINT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_CLOSE_ANIM_HINT);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1MIN(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_MIN);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1ACTION_1TEXT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_ACTION_TEXT);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1TIPS(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_TIPS);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1TR_1TIPS(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_TR_TIPS);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1INPUT_1TYPE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_INPUT_TYPE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1KEYBOARD(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_KEYBOARD);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1DEFAULT_1FOCUSED_1CHILD(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_DEFAULT_FOCUSED_CHILD);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1READONLY(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_READONLY);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1CANCELABLE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_CANCELABLE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1PASSWORD_1VISIBLE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_PASSWORD_VISIBLE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1ACTIVE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_ACTIVE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1CURR_1PAGE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_CURR_PAGE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1PAGE_1MAX_1NUMBER(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_PAGE_MAX_NUMBER);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1VERTICAL(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_VERTICAL);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1SHOW_1TEXT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_SHOW_TEXT);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1XOFFSET(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_XOFFSET);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1YOFFSET(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_YOFFSET);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1ALIGN_1V(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_ALIGN_V);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1ALIGN_1H(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_ALIGN_H);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1AUTO_1PLAY(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_AUTO_PLAY);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1LOOP(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_LOOP);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1AUTO_1FIX(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_AUTO_FIX);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1SELECT_1NONE_1WHEN_1FOCUSED(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_SELECT_NONE_WHEN_FOCUSED);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1OPEN_1IM_1WHEN_1FOCUSED(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_OPEN_IM_WHEN_FOCUSED);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1CLOSE_1IM_1WHEN_1BLURED(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_CLOSE_IM_WHEN_BLURED);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1X_1MIN(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_X_MIN);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1X_1MAX(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_X_MAX);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1Y_1MIN(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_Y_MIN);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1Y_1MAX(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_Y_MAX);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1MAX(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_MAX);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1GRAB_1KEYS(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_GRAB_KEYS);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1ROW(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_ROW);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1STATE_1FOR_1STYLE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_STATE_FOR_STYLE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1THEME(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_THEME);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1STAGE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_STAGE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1IMAGE_1MANAGER(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_IMAGE_MANAGER);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1ASSETS_1MANAGER(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_ASSETS_MANAGER);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1LOCALE_1INFO(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_LOCALE_INFO);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1FONT_1MANAGER(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_FONT_MANAGER);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1THEME_1OBJ(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_THEME_OBJ);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1DEFAULT_1THEME_1OBJ(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_DEFAULT_THEME_OBJ);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1ITEM_1WIDTH(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_ITEM_WIDTH);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1ITEM_1HEIGHT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_ITEM_HEIGHT);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1DEFAULT_1ITEM_1HEIGHT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_DEFAULT_ITEM_HEIGHT);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1XSLIDABLE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_XSLIDABLE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1YSLIDABLE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_YSLIDABLE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1REPEAT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_REPEAT);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1LONG_1PRESS_1TIME(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_LONG_PRESS_TIME);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1ENABLE_1LONG_1PRESS(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_ENABLE_LONG_PRESS);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1CLICK_1THROUGH(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_CLICK_THROUGH);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1ANIMATABLE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_ANIMATABLE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1AUTO_1HIDE_1SCROLL_1BAR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_AUTO_HIDE_SCROLL_BAR);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1IMAGE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_IMAGE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1FORMAT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_FORMAT);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1DRAW_1TYPE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_DRAW_TYPE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1SELECTABLE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_SELECTABLE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1CLICKABLE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_CLICKABLE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1SCALE_1X(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_SCALE_X);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1SCALE_1Y(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_SCALE_Y);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1ANCHOR_1X(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_ANCHOR_X);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1ANCHOR_1Y(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_ANCHOR_Y);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1ROTATION(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_ROTATION);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1COMPACT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_COMPACT);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1SCROLLABLE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_SCROLLABLE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1ICON(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_ICON);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1OPTIONS(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_OPTIONS);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1SELECTED(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_SELECTED);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1CHECKED(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_CHECKED);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1ACTIVE_1ICON(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_ACTIVE_ICON);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1LOAD_1UI(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_LOAD_UI);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1OPEN_1WINDOW(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_OPEN_WINDOW);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1SELECTED_1INDEX(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_SELECTED_INDEX);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1CLOSE_1WHEN_1CLICK(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_CLOSE_WHEN_CLICK);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1CLOSE_1WHEN_1CLICK_1OUTSIDE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_CLOSE_WHEN_CLICK_OUTSIDE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1CLOSE_1WHEN_1TIMEOUT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_CLOSE_WHEN_TIMEOUT);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1LINE_1GAP(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_LINE_GAP);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1BG_1COLOR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_BG_COLOR);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1BORDER_1COLOR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_BORDER_COLOR);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1DELAY(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_DELAY);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1IS_1KEYBOARD(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_IS_KEYBOARD);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1FOCUSED(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_FOCUSED);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1FOCUS(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_FOCUS);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1FOCUSABLE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_FOCUSABLE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1WITH_1FOCUS_1STATE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_WITH_FOCUS_STATE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1MOVE_1FOCUS_1PREV_1KEY(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_MOVE_FOCUS_PREV_KEY);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1MOVE_1FOCUS_1NEXT_1KEY(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_MOVE_FOCUS_NEXT_KEY);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1MOVE_1FOCUS_1UP_1KEY(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_MOVE_FOCUS_UP_KEY);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1MOVE_1FOCUS_1DOWN_1KEY(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_MOVE_FOCUS_DOWN_KEY);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1MOVE_1FOCUS_1LEFT_1KEY(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_MOVE_FOCUS_LEFT_KEY);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetProp_WIDGET_1PROP_1MOVE_1FOCUS_1RIGHT_1KEY(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_PROP_MOVE_FOCUS_RIGHT_KEY);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1NONE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_NONE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1WINDOW_1MANAGER(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_WINDOW_MANAGER);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1NORMAL_1WINDOW(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_NORMAL_WINDOW);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1OVERLAY(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_OVERLAY);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1TOOL_1BAR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_TOOL_BAR);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1DIALOG(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_DIALOG);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1POPUP(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_POPUP);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1SYSTEM_1BAR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_SYSTEM_BAR);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1SYSTEM_1BAR_1BOTTOM(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_SYSTEM_BAR_BOTTOM);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1SPRITE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_SPRITE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1KEYBOARD(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_KEYBOARD);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1DND(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_DND);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1LABEL(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_LABEL);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1BUTTON(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_BUTTON);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1IMAGE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_IMAGE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1EDIT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_EDIT);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1PROGRESS_1BAR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_PROGRESS_BAR);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1GROUP_1BOX(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_GROUP_BOX);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1CHECK_1BUTTON(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_CHECK_BUTTON);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1RADIO_1BUTTON(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_RADIO_BUTTON);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1DIALOG_1TITLE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_DIALOG_TITLE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1DIALOG_1CLIENT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_DIALOG_CLIENT);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1SLIDER(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_SLIDER);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1VIEW(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_VIEW);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1COMBO_1BOX(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_COMBO_BOX);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1COMBO_1BOX_1ITEM(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_COMBO_BOX_ITEM);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1SLIDE_1VIEW(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_SLIDE_VIEW);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1SLIDE_1INDICATOR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_SLIDE_INDICATOR);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1SLIDE_1INDICATOR_1ARC(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_SLIDE_INDICATOR_ARC);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1PAGES(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_PAGES);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1TAB_1BUTTON(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_TAB_BUTTON);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1TAB_1CONTROL(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_TAB_CONTROL);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1TAB_1BUTTON_1GROUP(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_TAB_BUTTON_GROUP);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1BUTTON_1GROUP(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_BUTTON_GROUP);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1CANDIDATES(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_CANDIDATES);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1SPIN_1BOX(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_SPIN_BOX);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1DRAGGER(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_DRAGGER);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1SCROLL_1BAR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_SCROLL_BAR);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1SCROLL_1BAR_1DESKTOP(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_SCROLL_BAR_DESKTOP);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1SCROLL_1BAR_1MOBILE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_SCROLL_BAR_MOBILE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1SCROLL_1VIEW(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_SCROLL_VIEW);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1LIST_1VIEW(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_LIST_VIEW);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1LIST_1VIEW_1H(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_LIST_VIEW_H);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1LIST_1ITEM(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_LIST_ITEM);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1COLOR_1PICKER(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_COLOR_PICKER);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1COLOR_1COMPONENT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_COLOR_COMPONENT);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1COLOR_1TILE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_COLOR_TILE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1CLIP_1VIEW(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_CLIP_VIEW);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1RICH_1TEXT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_RICH_TEXT);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1APP_1BAR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_APP_BAR);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1GRID(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_GRID);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1GRID_1ITEM(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_GRID_ITEM);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1ROW(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_ROW);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1COLUMN(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_COLUMN);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetType_WIDGET_1TYPE_1CALIBRATION_1WIN(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_TYPE_CALIBRATION_WIN);
}

JNIEXPORT jint JNICALL Java_awtk_TWindowStage_WINDOW_1STAGE_1NONE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(WINDOW_STAGE_NONE);
}

JNIEXPORT jint JNICALL Java_awtk_TWindowStage_WINDOW_1STAGE_1CREATED(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(WINDOW_STAGE_CREATED);
}

JNIEXPORT jint JNICALL Java_awtk_TWindowStage_WINDOW_1STAGE_1OPENED(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(WINDOW_STAGE_OPENED);
}

JNIEXPORT jint JNICALL Java_awtk_TWindowStage_WINDOW_1STAGE_1CLOSED(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(WINDOW_STAGE_CLOSED);
}

JNIEXPORT jint JNICALL Java_awtk_TWindowStage_WINDOW_1STAGE_1SUSPEND(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(WINDOW_STAGE_SUSPEND);
}

JNIEXPORT jint JNICALL Java_awtk_TWindowClosable_WINDOW_1CLOSABLE_1YES(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(WINDOW_CLOSABLE_YES);
}

JNIEXPORT jint JNICALL Java_awtk_TWindowClosable_WINDOW_1CLOSABLE_1NO(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(WINDOW_CLOSABLE_NO);
}

JNIEXPORT jint JNICALL Java_awtk_TWindowClosable_WINDOW_1CLOSABLE_1CONFIRM(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(WINDOW_CLOSABLE_CONFIRM);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetState_WIDGET_1STATE_1NONE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_STATE_NONE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetState_WIDGET_1STATE_1NORMAL(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_STATE_NORMAL);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetState_WIDGET_1STATE_1CHANGED(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_STATE_CHANGED);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetState_WIDGET_1STATE_1PRESSED(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_STATE_PRESSED);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetState_WIDGET_1STATE_1OVER(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_STATE_OVER);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetState_WIDGET_1STATE_1DISABLE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_STATE_DISABLE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetState_WIDGET_1STATE_1FOCUSED(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_STATE_FOCUSED);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetState_WIDGET_1STATE_1CHECKED(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_STATE_CHECKED);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetState_WIDGET_1STATE_1UNCHECKED(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_STATE_UNCHECKED);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetState_WIDGET_1STATE_1EMPTY(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_STATE_EMPTY);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetState_WIDGET_1STATE_1EMPTY_1FOCUS(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_STATE_EMPTY_FOCUS);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetState_WIDGET_1STATE_1ERROR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_STATE_ERROR);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetState_WIDGET_1STATE_1SELECTED(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_STATE_SELECTED);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetState_WIDGET_1STATE_1NORMAL_1OF_1CHECKED(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_STATE_NORMAL_OF_CHECKED);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetState_WIDGET_1STATE_1PRESSED_1OF_1CHECKED(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_STATE_PRESSED_OF_CHECKED);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetState_WIDGET_1STATE_1OVER_1OF_1CHECKED(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_STATE_OVER_OF_CHECKED);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetState_WIDGET_1STATE_1DISABLE_1OF_1CHECKED(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_STATE_DISABLE_OF_CHECKED);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetState_WIDGET_1STATE_1FOCUSED_1OF_1CHECKED(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_STATE_FOCUSED_OF_CHECKED);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetState_WIDGET_1STATE_1NORMAL_1OF_1ACTIVE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_STATE_NORMAL_OF_ACTIVE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetState_WIDGET_1STATE_1PRESSED_1OF_1ACTIVE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_STATE_PRESSED_OF_ACTIVE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetState_WIDGET_1STATE_1OVER_1OF_1ACTIVE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_STATE_OVER_OF_ACTIVE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetState_WIDGET_1STATE_1DISABLE_1OF_1ACTIVE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_STATE_DISABLE_OF_ACTIVE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetState_WIDGET_1STATE_1FOCUSED_1OF_1ACTIVE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_STATE_FOCUSED_OF_ACTIVE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetCursor_WIDGET_1CURSOR_1DEFAULT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_CURSOR_DEFAULT);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetCursor_WIDGET_1CURSOR_1EDIT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_CURSOR_EDIT);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetCursor_WIDGET_1CURSOR_1HAND(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_CURSOR_HAND);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetCursor_WIDGET_1CURSOR_1WAIT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_CURSOR_WAIT);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetCursor_WIDGET_1CURSOR_1CROSS(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_CURSOR_CROSS);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetCursor_WIDGET_1CURSOR_1NO(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_CURSOR_NO);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetCursor_WIDGET_1CURSOR_1SIZENWSE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_CURSOR_SIZENWSE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetCursor_WIDGET_1CURSOR_1SIZENESW(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_CURSOR_SIZENESW);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetCursor_WIDGET_1CURSOR_1SIZEWE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_CURSOR_SIZEWE);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetCursor_WIDGET_1CURSOR_1SIZENS(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_CURSOR_SIZENS);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidgetCursor_WIDGET_1CURSOR_1SIZEALL(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, WIDGET_CURSOR_SIZEALL);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1count_1children(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  int32_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (int32_t)widget_count_children(widget);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TWidget_widget_1get_1child(JNIEnv* env,  jclass ajc, jlong jwidget, jint index) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)widget_get_child(widget, index);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TWidget_widget_1get_1native_1window(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  native_window_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (native_window_t*)widget_get_native_window(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1index_1of(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  int32_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (int32_t)widget_index_of(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1close_1window(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_close_window(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1move(JNIEnv* env,  jclass ajc, jlong jwidget, jint x, jint y) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_move(widget, x, y);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1resize(JNIEnv* env,  jclass ajc, jlong jwidget, jint w, jint h) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_resize(widget, w, h);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1move_1resize(JNIEnv* env,  jclass ajc, jlong jwidget, jint x, jint y, jint w, jint h) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_move_resize(widget, x, y, w, h);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1value(JNIEnv* env,  jclass ajc, jlong jwidget, jint value) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_set_value(widget, value);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1animate_1value_1to(JNIEnv* env,  jclass ajc, jlong jwidget, jint value, jint duration) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_animate_value_to(widget, value, duration);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1add_1value(JNIEnv* env,  jclass ajc, jlong jwidget, jint delta) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_add_value(widget, delta);

  return (jint)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1is_1style_1exist(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jstyle_name, jstring jstate_name) { /*func*/
  bool_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* style_name = (char*)(*env)->GetStringUTFChars(env, jstyle_name, 0);
  const char* state_name = (char*)(*env)->GetStringUTFChars(env, jstate_name, 0);
  ret = (bool_t)widget_is_style_exist(widget, style_name, state_name);
  (*env)->ReleaseStringUTFChars(env, jstyle_name, style_name);
  (*env)->ReleaseStringUTFChars(env, jstate_name, state_name);

  return (jboolean)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1use_1style(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jstyle) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* style = (char*)(*env)->GetStringUTFChars(env, jstyle, 0);
  ret = (ret_t)widget_use_style(widget, style);
  (*env)->ReleaseStringUTFChars(env, jstyle, style);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1text_1utf8(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jtext) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* text = (char*)(*env)->GetStringUTFChars(env, jtext, 0);
  ret = (ret_t)widget_set_text_utf8(widget, text);
  (*env)->ReleaseStringUTFChars(env, jtext, text);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1child_1text_1utf8(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname, jstring jtext) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  const char* text = (char*)(*env)->GetStringUTFChars(env, jtext, 0);
  ret = (ret_t)widget_set_child_text_utf8(widget, name, text);
  (*env)->ReleaseStringUTFChars(env, jname, name);
  (*env)->ReleaseStringUTFChars(env, jtext, text);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1child_1text_1with_1double(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname, jstring jformat, jdouble value) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  const char* format = (char*)(*env)->GetStringUTFChars(env, jformat, 0);
  ret = (ret_t)widget_set_child_text_with_double(widget, name, format, value);
  (*env)->ReleaseStringUTFChars(env, jname, name);
  (*env)->ReleaseStringUTFChars(env, jformat, format);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1child_1text_1with_1int(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname, jstring jformat, jint value) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  const char* format = (char*)(*env)->GetStringUTFChars(env, jformat, 0);
  ret = (ret_t)widget_set_child_text_with_int(widget, name, format, value);
  (*env)->ReleaseStringUTFChars(env, jname, name);
  (*env)->ReleaseStringUTFChars(env, jformat, format);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1tr_1text(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jtext) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* text = (char*)(*env)->GetStringUTFChars(env, jtext, 0);
  ret = (ret_t)widget_set_tr_text(widget, text);
  (*env)->ReleaseStringUTFChars(env, jtext, text);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1get_1value(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  int32_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (int32_t)widget_get_value(widget);

  return (jint)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidget_widget_1get_1text(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  str_t str;
  jstring jstr;
  const wchar_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (const wchar_t*)widget_get_text(widget);

  str_init(&str, 0);
  str_from_wstr(&str, ret);
  jstr = (*env)->NewStringUTF(env, str.str);
  str_reset(&str);
  return jstr;
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1name(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)widget_set_name(widget, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1theme(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)widget_set_theme(widget, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1pointer_1cursor(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jcursor) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* cursor = (char*)(*env)->GetStringUTFChars(env, jcursor, 0);
  ret = (ret_t)widget_set_pointer_cursor(widget, cursor);
  (*env)->ReleaseStringUTFChars(env, jcursor, cursor);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1animation(JNIEnv* env,  jclass ajc, jlong jwidget, jstring janimation) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* animation = (char*)(*env)->GetStringUTFChars(env, janimation, 0);
  ret = (ret_t)widget_set_animation(widget, animation);
  (*env)->ReleaseStringUTFChars(env, janimation, animation);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1create_1animator(JNIEnv* env,  jclass ajc, jlong jwidget, jstring janimation) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* animation = (char*)(*env)->GetStringUTFChars(env, janimation, 0);
  ret = (ret_t)widget_create_animator(widget, animation);
  (*env)->ReleaseStringUTFChars(env, janimation, animation);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1start_1animator(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)widget_start_animator(widget, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1animator_1time_1scale(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname, jdouble time_scale) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)widget_set_animator_time_scale(widget, name, time_scale);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1pause_1animator(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)widget_pause_animator(widget, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1stop_1animator(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)widget_stop_animator(widget, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1destroy_1animator(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)widget_destroy_animator(widget, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1enable(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean enable) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_set_enable(widget, enable);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1feedback(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean feedback) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_set_feedback(widget, feedback);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1auto_1adjust_1size(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean auto_adjust_size) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_set_auto_adjust_size(widget, auto_adjust_size);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1floating(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean floating) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_set_floating(widget, floating);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1focused(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean focused) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_set_focused(widget, focused);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1focusable(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean focusable) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_set_focusable(widget, focusable);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1state(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jstate) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* state = (char*)(*env)->GetStringUTFChars(env, jstate, 0);
  ret = (ret_t)widget_set_state(widget, state);
  (*env)->ReleaseStringUTFChars(env, jstate, state);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1opacity(JNIEnv* env,  jclass ajc, jlong jwidget, jint opacity) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_set_opacity(widget, opacity);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1dirty_1rect_1tolerance(JNIEnv* env,  jclass ajc, jlong jwidget, jint dirty_rect_tolerance) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_set_dirty_rect_tolerance(widget, dirty_rect_tolerance);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1destroy_1children(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_destroy_children(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1add_1child(JNIEnv* env,  jclass ajc, jlong jwidget, jlong jchild) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  widget_t* child = (widget_t*)jchild;
  ret = (ret_t)widget_add_child(widget, child);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1remove_1child(JNIEnv* env,  jclass ajc, jlong jwidget, jlong jchild) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  widget_t* child = (widget_t*)jchild;
  ret = (ret_t)widget_remove_child(widget, child);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1insert_1child(JNIEnv* env,  jclass ajc, jlong jwidget, jint index, jlong jchild) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  widget_t* child = (widget_t*)jchild;
  ret = (ret_t)widget_insert_child(widget, index, child);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1restack(JNIEnv* env,  jclass ajc, jlong jwidget, jint index) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_restack(widget, index);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TWidget_widget_1child(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (widget_t*)widget_child(widget, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TWidget_widget_1lookup(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname, jboolean recursive) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (widget_t*)widget_lookup(widget, name, recursive);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TWidget_widget_1lookup_1by_1type(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jtype, jboolean recursive) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* type = (char*)(*env)->GetStringUTFChars(env, jtype, 0);
  ret = (widget_t*)widget_lookup_by_type(widget, type, recursive);
  (*env)->ReleaseStringUTFChars(env, jtype, type);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1visible(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean visible) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_set_visible(widget, visible);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1visible_1only(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean visible) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_set_visible_only(widget, visible);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1sensitive(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean sensitive) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_set_sensitive(widget, sensitive);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1off(JNIEnv* env,  jclass ajc, jlong jwidget, jint id) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_off(widget, id);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1invalidate_1force(JNIEnv* env,  jclass ajc, jlong jwidget, jlong jr) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const rect_t* r = (const rect_t*)jr;
  ret = (ret_t)widget_invalidate_force(widget, r);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1prop_1str(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname, jstring jv) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  const char* v = (char*)(*env)->GetStringUTFChars(env, jv, 0);
  ret = (ret_t)widget_set_prop_str(widget, name, v);
  (*env)->ReleaseStringUTFChars(env, jname, name);
  (*env)->ReleaseStringUTFChars(env, jv, v);

  return (jint)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidget_widget_1get_1prop_1str(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname, jstring jdefval) { /*func*/
  const char* ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  const char* defval = (char*)(*env)->GetStringUTFChars(env, jdefval, 0);
  ret = (const char*)widget_get_prop_str(widget, name, defval);
  (*env)->ReleaseStringUTFChars(env, jname, name);
  (*env)->ReleaseStringUTFChars(env, jdefval, defval);

  return (*env)->NewStringUTF(env, ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1prop_1pointer(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname, jlong v) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)widget_set_prop_pointer(widget, name, v);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TWidget_widget_1get_1prop_1pointer(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname) { /*func*/
  void* ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (void*)widget_get_prop_pointer(widget, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1prop_1int(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname, jint v) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)widget_set_prop_int(widget, name, v);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1get_1prop_1int(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname, jint defval) { /*func*/
  int32_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (int32_t)widget_get_prop_int(widget, name, defval);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1prop_1bool(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname, jboolean v) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)widget_set_prop_bool(widget, name, v);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1get_1prop_1bool(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname, jboolean defval) { /*func*/
  bool_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (bool_t)widget_get_prop_bool(widget, name, defval);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jboolean)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1is_1window_1opened(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  bool_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (bool_t)widget_is_window_opened(widget);

  return (jboolean)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1is_1parent_1of(JNIEnv* env,  jclass ajc, jlong jwidget, jlong jchild) { /*func*/
  bool_t ret;
  widget_t* widget = (widget_t*)jwidget;
  widget_t* child = (widget_t*)jchild;
  ret = (bool_t)widget_is_parent_of(widget, child);

  return (jboolean)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1is_1direct_1parent_1of(JNIEnv* env,  jclass ajc, jlong jwidget, jlong jchild) { /*func*/
  bool_t ret;
  widget_t* widget = (widget_t*)jwidget;
  widget_t* child = (widget_t*)jchild;
  ret = (bool_t)widget_is_direct_parent_of(widget, child);

  return (jboolean)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1is_1window(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  bool_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (bool_t)widget_is_window(widget);

  return (jboolean)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1is_1system_1bar(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  bool_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (bool_t)widget_is_system_bar(widget);

  return (jboolean)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1is_1normal_1window(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  bool_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (bool_t)widget_is_normal_window(widget);

  return (jboolean)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1is_1dialog(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  bool_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (bool_t)widget_is_dialog(widget);

  return (jboolean)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1is_1popup(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  bool_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (bool_t)widget_is_popup(widget);

  return (jboolean)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1is_1overlay(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  bool_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (bool_t)widget_is_overlay(widget);

  return (jboolean)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1is_1opened_1dialog(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  bool_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (bool_t)widget_is_opened_dialog(widget);

  return (jboolean)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1is_1opened_1popup(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  bool_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (bool_t)widget_is_opened_popup(widget);

  return (jboolean)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1is_1keyboard(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  bool_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (bool_t)widget_is_keyboard(widget);

  return (jboolean)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1is_1designing_1window(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  bool_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (bool_t)widget_is_designing_window(widget);

  return (jboolean)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1is_1window_1manager(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  bool_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (bool_t)widget_is_window_manager(widget);

  return (jboolean)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TWidget_widget_1get_1window(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)widget_get_window(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TWidget_widget_1get_1window_1manager(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)widget_get_window_manager(widget);

  return (jlong)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidget_widget_1get_1type(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  const char* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (const char*)widget_get_type(widget);

  return (*env)->NewStringUTF(env, ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TWidget_widget_1clone(JNIEnv* env,  jclass ajc, jlong jwidget, jlong jparent) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)widget_clone(widget, parent);

  return (jlong)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1equal(JNIEnv* env,  jclass ajc, jlong jwidget, jlong jother) { /*func*/
  bool_t ret;
  widget_t* widget = (widget_t*)jwidget;
  widget_t* other = (widget_t*)jother;
  ret = (bool_t)widget_equal(widget, other);

  return (jboolean)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TWidget_widget_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)widget_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1destroy(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_destroy(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1destroy_1async(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_destroy_async(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1unref(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_unref(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1stroke_1border_1rect(JNIEnv* env,  jclass ajc, jlong jwidget, jlong jc, jlong jr) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  canvas_t* c = (canvas_t*)jc;
  const rect_t* r = (const rect_t*)jr;
  ret = (ret_t)widget_stroke_border_rect(widget, c, r);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1fill_1bg_1rect(JNIEnv* env,  jclass ajc, jlong jwidget, jlong jc, jlong jr, jint draw_type) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  canvas_t* c = (canvas_t*)jc;
  const rect_t* r = (const rect_t*)jr;
  ret = (ret_t)widget_fill_bg_rect(widget, c, r, draw_type);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1fill_1fg_1rect(JNIEnv* env,  jclass ajc, jlong jwidget, jlong jc, jlong jr, jint draw_type) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  canvas_t* c = (canvas_t*)jc;
  const rect_t* r = (const rect_t*)jr;
  ret = (ret_t)widget_fill_fg_rect(widget, c, r, draw_type);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1dispatch_1to_1target(JNIEnv* env,  jclass ajc, jlong jwidget, jlong je) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  event_t* e = (event_t*)je;
  ret = (ret_t)widget_dispatch_to_target(widget, e);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1dispatch_1to_1key_1target(JNIEnv* env,  jclass ajc, jlong jwidget, jlong je) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  event_t* e = (event_t*)je;
  ret = (ret_t)widget_dispatch_to_key_target(widget, e);

  return (jint)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidget_widget_1get_1style_1type(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  const char* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (const char*)widget_get_style_type(widget);

  return (*env)->NewStringUTF(env, ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1update_1style(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_update_style(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1update_1style_1recursive(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_update_style_recursive(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1as_1key_1target(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_set_as_key_target(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1focus_1next(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_focus_next(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1focus_1prev(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_focus_prev(widget);

  return (jint)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidget_widget_1get_1state_1for_1style(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean active, jboolean checked) { /*func*/
  const char* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (const char*)widget_get_state_for_style(widget, active, checked);

  return (*env)->NewStringUTF(env, ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1layout(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)widget_layout(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1self_1layout(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jparams) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* params = (char*)(*env)->GetStringUTFChars(env, jparams, 0);
  ret = (ret_t)widget_set_self_layout(widget, params);
  (*env)->ReleaseStringUTFChars(env, jparams, params);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1children_1layout(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jparams) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* params = (char*)(*env)->GetStringUTFChars(env, jparams, 0);
  ret = (ret_t)widget_set_children_layout(widget, params);
  (*env)->ReleaseStringUTFChars(env, jparams, params);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1self_1layout_1params(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jx, jstring jy, jstring jw, jstring jh) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* x = (char*)(*env)->GetStringUTFChars(env, jx, 0);
  const char* y = (char*)(*env)->GetStringUTFChars(env, jy, 0);
  const char* w = (char*)(*env)->GetStringUTFChars(env, jw, 0);
  const char* h = (char*)(*env)->GetStringUTFChars(env, jh, 0);
  ret = (ret_t)widget_set_self_layout_params(widget, x, y, w, h);
  (*env)->ReleaseStringUTFChars(env, jx, x);
  (*env)->ReleaseStringUTFChars(env, jy, y);
  (*env)->ReleaseStringUTFChars(env, jw, w);
  (*env)->ReleaseStringUTFChars(env, jh, h);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1style_1int(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jstate_and_name, jint value) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* state_and_name = (char*)(*env)->GetStringUTFChars(env, jstate_and_name, 0);
  ret = (ret_t)widget_set_style_int(widget, state_and_name, value);
  (*env)->ReleaseStringUTFChars(env, jstate_and_name, state_and_name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1style_1str(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jstate_and_name, jstring jvalue) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* state_and_name = (char*)(*env)->GetStringUTFChars(env, jstate_and_name, 0);
  const char* value = (char*)(*env)->GetStringUTFChars(env, jvalue, 0);
  ret = (ret_t)widget_set_style_str(widget, state_and_name, value);
  (*env)->ReleaseStringUTFChars(env, jstate_and_name, state_and_name);
  (*env)->ReleaseStringUTFChars(env, jvalue, value);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1set_1style_1color(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jstate_and_name, jint value) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* state_and_name = (char*)(*env)->GetStringUTFChars(env, jstate_and_name, 0);
  ret = (ret_t)widget_set_style_color(widget, state_and_name, value);
  (*env)->ReleaseStringUTFChars(env, jstate_and_name, state_and_name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1t_1get_1prop_1x(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  widget_t* obj = (widget_t*)jobj;

  return (jint)(obj->x);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1t_1get_1prop_1y(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  widget_t* obj = (widget_t*)jobj;

  return (jint)(obj->y);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1t_1get_1prop_1w(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  widget_t* obj = (widget_t*)jobj;

  return (jint)(obj->w);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1t_1get_1prop_1h(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  widget_t* obj = (widget_t*)jobj;

  return (jint)(obj->h);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidget_widget_1t_1get_1prop_1name(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  widget_t* obj = (widget_t*)jobj;

  return (*env)->NewStringUTF(env, obj->name);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidget_widget_1t_1get_1prop_1pointer_1cursor(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  widget_t* obj = (widget_t*)jobj;

  return (*env)->NewStringUTF(env, obj->pointer_cursor);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidget_widget_1t_1get_1prop_1tr_1text(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  widget_t* obj = (widget_t*)jobj;

  return (*env)->NewStringUTF(env, obj->tr_text);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidget_widget_1t_1get_1prop_1style(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  widget_t* obj = (widget_t*)jobj;

  return (*env)->NewStringUTF(env, obj->style);
}

JNIEXPORT jstring JNICALL Java_awtk_TWidget_widget_1t_1get_1prop_1animation(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  widget_t* obj = (widget_t*)jobj;

  return (*env)->NewStringUTF(env, obj->animation);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1t_1get_1prop_1enable(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  widget_t* obj = (widget_t*)jobj;

  return (jboolean)(obj->enable);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1t_1get_1prop_1feedback(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  widget_t* obj = (widget_t*)jobj;

  return (jboolean)(obj->feedback);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1t_1get_1prop_1visible(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  widget_t* obj = (widget_t*)jobj;

  return (jboolean)(obj->visible);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1t_1get_1prop_1sensitive(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  widget_t* obj = (widget_t*)jobj;

  return (jboolean)(obj->sensitive);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1t_1get_1prop_1focusable(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  widget_t* obj = (widget_t*)jobj;

  return (jboolean)(obj->focusable);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1t_1get_1prop_1with_1focus_1state(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  widget_t* obj = (widget_t*)jobj;

  return (jboolean)(obj->with_focus_state);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1t_1get_1prop_1auto_1adjust_1size(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  widget_t* obj = (widget_t*)jobj;

  return (jboolean)(obj->auto_adjust_size);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWidget_widget_1t_1get_1prop_1floating(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  widget_t* obj = (widget_t*)jobj;

  return (jboolean)(obj->floating);
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1t_1get_1prop_1dirty_1rect_1tolerance(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  widget_t* obj = (widget_t*)jobj;

  return (jint)(obj->dirty_rect_tolerance);
}

JNIEXPORT jlong JNICALL Java_awtk_TWidget_widget_1t_1get_1prop_1parent(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  widget_t* obj = (widget_t*)jobj;

  return (jlong)(obj->parent);
}

JNIEXPORT jint JNICALL Java_awtk_TAppConf_app_1conf_1save(JNIEnv* env,  jclass ajc) { /*func*/
  ret_t ret;
  ret = (ret_t)app_conf_save();

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TAppConf_app_1conf_1reload(JNIEnv* env,  jclass ajc) { /*func*/
  ret_t ret;
  ret = (ret_t)app_conf_reload();

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TAppConf_app_1conf_1deinit(JNIEnv* env,  jclass ajc) { /*func*/
  ret_t ret;
  ret = (ret_t)app_conf_deinit();

  return (jint)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TAppConf_app_1conf_1exist(JNIEnv* env,  jclass ajc, jstring jkey) { /*func*/
  bool_t ret;
  const char* key = (char*)(*env)->GetStringUTFChars(env, jkey, 0);
  ret = (bool_t)app_conf_exist(key);
  (*env)->ReleaseStringUTFChars(env, jkey, key);

  return (jboolean)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TAppConf_app_1conf_1set_1int(JNIEnv* env,  jclass ajc, jstring jkey, jint v) { /*func*/
  ret_t ret;
  const char* key = (char*)(*env)->GetStringUTFChars(env, jkey, 0);
  ret = (ret_t)app_conf_set_int(key, v);
  (*env)->ReleaseStringUTFChars(env, jkey, key);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TAppConf_app_1conf_1set_1int64(JNIEnv* env,  jclass ajc, jstring jkey, jlong v) { /*func*/
  ret_t ret;
  const char* key = (char*)(*env)->GetStringUTFChars(env, jkey, 0);
  ret = (ret_t)app_conf_set_int64(key, v);
  (*env)->ReleaseStringUTFChars(env, jkey, key);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TAppConf_app_1conf_1set_1bool(JNIEnv* env,  jclass ajc, jstring jkey, jboolean v) { /*func*/
  ret_t ret;
  const char* key = (char*)(*env)->GetStringUTFChars(env, jkey, 0);
  ret = (ret_t)app_conf_set_bool(key, v);
  (*env)->ReleaseStringUTFChars(env, jkey, key);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TAppConf_app_1conf_1set_1double(JNIEnv* env,  jclass ajc, jstring jkey, jdouble v) { /*func*/
  ret_t ret;
  const char* key = (char*)(*env)->GetStringUTFChars(env, jkey, 0);
  ret = (ret_t)app_conf_set_double(key, v);
  (*env)->ReleaseStringUTFChars(env, jkey, key);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TAppConf_app_1conf_1set_1str(JNIEnv* env,  jclass ajc, jstring jkey, jstring jv) { /*func*/
  ret_t ret;
  const char* key = (char*)(*env)->GetStringUTFChars(env, jkey, 0);
  const char* v = (char*)(*env)->GetStringUTFChars(env, jv, 0);
  ret = (ret_t)app_conf_set_str(key, v);
  (*env)->ReleaseStringUTFChars(env, jkey, key);
  (*env)->ReleaseStringUTFChars(env, jv, v);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TAppConf_app_1conf_1get_1int(JNIEnv* env,  jclass ajc, jstring jkey, jint defval) { /*func*/
  int32_t ret;
  const char* key = (char*)(*env)->GetStringUTFChars(env, jkey, 0);
  ret = (int32_t)app_conf_get_int(key, defval);
  (*env)->ReleaseStringUTFChars(env, jkey, key);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TAppConf_app_1conf_1get_1int64(JNIEnv* env,  jclass ajc, jstring jkey, jlong defval) { /*func*/
  int64_t ret;
  const char* key = (char*)(*env)->GetStringUTFChars(env, jkey, 0);
  ret = (int64_t)app_conf_get_int64(key, defval);
  (*env)->ReleaseStringUTFChars(env, jkey, key);

  return (jlong)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TAppConf_app_1conf_1get_1bool(JNIEnv* env,  jclass ajc, jstring jkey, jboolean defval) { /*func*/
  bool_t ret;
  const char* key = (char*)(*env)->GetStringUTFChars(env, jkey, 0);
  ret = (bool_t)app_conf_get_bool(key, defval);
  (*env)->ReleaseStringUTFChars(env, jkey, key);

  return (jboolean)(ret);
}

JNIEXPORT jdouble JNICALL Java_awtk_TAppConf_app_1conf_1get_1double(JNIEnv* env,  jclass ajc, jstring jkey, jdouble defval) { /*func*/
  double ret;
  const char* key = (char*)(*env)->GetStringUTFChars(env, jkey, 0);
  ret = (double)app_conf_get_double(key, defval);
  (*env)->ReleaseStringUTFChars(env, jkey, key);

  return (jdouble)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TAppConf_app_1conf_1get_1str(JNIEnv* env,  jclass ajc, jstring jkey, jstring jdefval) { /*func*/
  const char* ret;
  const char* key = (char*)(*env)->GetStringUTFChars(env, jkey, 0);
  const char* defval = (char*)(*env)->GetStringUTFChars(env, jdefval, 0);
  ret = (const char*)app_conf_get_str(key, defval);
  (*env)->ReleaseStringUTFChars(env, jkey, key);
  (*env)->ReleaseStringUTFChars(env, jdefval, defval);

  return (*env)->NewStringUTF(env, ret);
}

JNIEXPORT jint JNICALL Java_awtk_TAppConf_app_1conf_1remove(JNIEnv* env,  jclass ajc, jstring jkey) { /*func*/
  ret_t ret;
  const char* key = (char*)(*env)->GetStringUTFChars(env, jkey, 0);
  ret = (ret_t)app_conf_remove(key);
  (*env)->ReleaseStringUTFChars(env, jkey, key);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TIndicatorDefaultPaint_INDICATOR_1DEFAULT_1PAINT_1AUTO(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(INDICATOR_DEFAULT_PAINT_AUTO);
}

JNIEXPORT jint JNICALL Java_awtk_TIndicatorDefaultPaint_INDICATOR_1DEFAULT_1PAINT_1FILL_1DOT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(INDICATOR_DEFAULT_PAINT_FILL_DOT);
}

JNIEXPORT jint JNICALL Java_awtk_TIndicatorDefaultPaint_INDICATOR_1DEFAULT_1PAINT_1STROKE_1DOT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(INDICATOR_DEFAULT_PAINT_STROKE_DOT);
}

JNIEXPORT jint JNICALL Java_awtk_TIndicatorDefaultPaint_INDICATOR_1DEFAULT_1PAINT_1FILL_1RECT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(INDICATOR_DEFAULT_PAINT_FILL_RECT);
}

JNIEXPORT jint JNICALL Java_awtk_TIndicatorDefaultPaint_INDICATOR_1DEFAULT_1PAINT_1STROKE_1RECT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(INDICATOR_DEFAULT_PAINT_STROKE_RECT);
}

JNIEXPORT jint JNICALL Java_awtk_TAssetType_ASSET_1TYPE_1NONE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(ASSET_TYPE_NONE);
}

JNIEXPORT jint JNICALL Java_awtk_TAssetType_ASSET_1TYPE_1FONT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(ASSET_TYPE_FONT);
}

JNIEXPORT jint JNICALL Java_awtk_TAssetType_ASSET_1TYPE_1IMAGE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(ASSET_TYPE_IMAGE);
}

JNIEXPORT jint JNICALL Java_awtk_TAssetType_ASSET_1TYPE_1STYLE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(ASSET_TYPE_STYLE);
}

JNIEXPORT jint JNICALL Java_awtk_TAssetType_ASSET_1TYPE_1UI(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(ASSET_TYPE_UI);
}

JNIEXPORT jint JNICALL Java_awtk_TAssetType_ASSET_1TYPE_1XML(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(ASSET_TYPE_XML);
}

JNIEXPORT jint JNICALL Java_awtk_TAssetType_ASSET_1TYPE_1STRINGS(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(ASSET_TYPE_STRINGS);
}

JNIEXPORT jint JNICALL Java_awtk_TAssetType_ASSET_1TYPE_1SCRIPT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(ASSET_TYPE_SCRIPT);
}

JNIEXPORT jint JNICALL Java_awtk_TAssetType_ASSET_1TYPE_1FLOW(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(ASSET_TYPE_FLOW);
}

JNIEXPORT jint JNICALL Java_awtk_TAssetType_ASSET_1TYPE_1DATA(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(ASSET_TYPE_DATA);
}

JNIEXPORT jint JNICALL Java_awtk_TAssetInfo_asset_1info_1t_1get_1prop_1type(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  asset_info_t* obj = (asset_info_t*)jobj;

  return (jint)(obj->type);
}

JNIEXPORT jint JNICALL Java_awtk_TAssetInfo_asset_1info_1t_1get_1prop_1subtype(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  asset_info_t* obj = (asset_info_t*)jobj;

  return (jint)(obj->subtype);
}

JNIEXPORT jint JNICALL Java_awtk_TAssetInfo_asset_1info_1t_1get_1prop_1is_1in_1rom(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  asset_info_t* obj = (asset_info_t*)jobj;

  return (jint)(obj->is_in_rom);
}

JNIEXPORT jint JNICALL Java_awtk_TAssetInfo_asset_1info_1t_1get_1prop_1size(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  asset_info_t* obj = (asset_info_t*)jobj;

  return (jint)(obj->size);
}

JNIEXPORT jint JNICALL Java_awtk_TAssetInfo_asset_1info_1t_1get_1prop_1refcount(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  asset_info_t* obj = (asset_info_t*)jobj;

  return (jint)(obj->refcount);
}

JNIEXPORT jstring JNICALL Java_awtk_TAssetInfo_asset_1info_1t_1get_1prop_1name(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  asset_info_t* obj = (asset_info_t*)jobj;

  return (*env)->NewStringUTF(env, obj->name);
}

JNIEXPORT jlong JNICALL Java_awtk_TColor_color_1create(JNIEnv* env,  jclass ajc, jint r, jint b, jint g, jint a) { /*func*/
  color_t* ret;
  ret = (color_t*)color_create(r, b, g, a);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TColor_color_1from_1str(JNIEnv* env,  jclass ajc, jlong jc, jstring jstr) { /*func*/
  color_t* ret;
  color_t* c = (color_t*)jc;
  const char* str = (char*)(*env)->GetStringUTFChars(env, jstr, 0);
  ret = (color_t*)color_from_str(c, str);
  (*env)->ReleaseStringUTFChars(env, jstr, str);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TColor_color_1r(JNIEnv* env,  jclass ajc, jlong jc) { /*func*/
  uint8_t ret;
  color_t* c = (color_t*)jc;
  ret = (uint8_t)color_r(c);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TColor_color_1g(JNIEnv* env,  jclass ajc, jlong jc) { /*func*/
  uint8_t ret;
  color_t* c = (color_t*)jc;
  ret = (uint8_t)color_g(c);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TColor_color_1b(JNIEnv* env,  jclass ajc, jlong jc) { /*func*/
  uint8_t ret;
  color_t* c = (color_t*)jc;
  ret = (uint8_t)color_b(c);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TColor_color_1a(JNIEnv* env,  jclass ajc, jlong jc) { /*func*/
  uint8_t ret;
  color_t* c = (color_t*)jc;
  ret = (uint8_t)color_a(c);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TColor_color_1cast(JNIEnv* env,  jclass ajc, jlong jcolor) { /*func*/
  color_t* ret;
  color_t* color = (color_t*)jcolor;
  ret = (color_t*)color_cast(color);

  return (jlong)(ret);
}

JNIEXPORT void JNICALL Java_awtk_TColor_color_1t_1set_1prop_1color (JNIEnv* env,  jclass ajc, jlong jobj, jint value) {/*set*/
  color_t* obj = (color_t*)jobj;
  obj->color = value;
};

JNIEXPORT jint JNICALL Java_awtk_TColor_color_1t_1get_1prop_1color(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  color_t* obj = (color_t*)jobj;

  return (jint)(obj->color);
}

JNIEXPORT jlong JNICALL Java_awtk_TDateTime_date_1time_1create(JNIEnv* env,  jclass ajc) { /*func*/
  date_time_t* ret;
  ret = (date_time_t*)date_time_create();

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDateTime_date_1time_1set_1year(JNIEnv* env,  jclass ajc, jlong jdt, jint year) { /*func*/
  ret_t ret;
  date_time_t* dt = (date_time_t*)jdt;
  ret = (ret_t)date_time_set_year(dt, year);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDateTime_date_1time_1set_1month(JNIEnv* env,  jclass ajc, jlong jdt, jint month) { /*func*/
  ret_t ret;
  date_time_t* dt = (date_time_t*)jdt;
  ret = (ret_t)date_time_set_month(dt, month);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDateTime_date_1time_1set_1day(JNIEnv* env,  jclass ajc, jlong jdt, jint day) { /*func*/
  ret_t ret;
  date_time_t* dt = (date_time_t*)jdt;
  ret = (ret_t)date_time_set_day(dt, day);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDateTime_date_1time_1set_1hour(JNIEnv* env,  jclass ajc, jlong jdt, jint hour) { /*func*/
  ret_t ret;
  date_time_t* dt = (date_time_t*)jdt;
  ret = (ret_t)date_time_set_hour(dt, hour);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDateTime_date_1time_1set_1minute(JNIEnv* env,  jclass ajc, jlong jdt, jint minute) { /*func*/
  ret_t ret;
  date_time_t* dt = (date_time_t*)jdt;
  ret = (ret_t)date_time_set_minute(dt, minute);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDateTime_date_1time_1set_1second(JNIEnv* env,  jclass ajc, jlong jdt, jint second) { /*func*/
  ret_t ret;
  date_time_t* dt = (date_time_t*)jdt;
  ret = (ret_t)date_time_set_second(dt, second);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDateTime_date_1time_1set(JNIEnv* env,  jclass ajc, jlong jdt) { /*func*/
  ret_t ret;
  date_time_t* dt = (date_time_t*)jdt;
  ret = (ret_t)date_time_set(dt);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDateTime_date_1time_1from_1time(JNIEnv* env,  jclass ajc, jlong jdt, jlong time) { /*func*/
  ret_t ret;
  date_time_t* dt = (date_time_t*)jdt;
  ret = (ret_t)date_time_from_time(dt, time);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TDateTime_date_1time_1to_1time(JNIEnv* env,  jclass ajc, jlong jdt) { /*func*/
  uint64_t ret;
  date_time_t* dt = (date_time_t*)jdt;
  ret = (uint64_t)date_time_to_time(dt);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDateTime_date_1time_1add_1delta(JNIEnv* env,  jclass ajc, jlong jdt, jlong delta) { /*func*/
  ret_t ret;
  date_time_t* dt = (date_time_t*)jdt;
  ret = (ret_t)date_time_add_delta(dt, delta);

  return (jint)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TDateTime_date_1time_1is_1leap(JNIEnv* env,  jclass ajc, jint year) { /*func*/
  bool_t ret;
  ret = (bool_t)date_time_is_leap(year);

  return (jboolean)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDateTime_date_1time_1get_1days(JNIEnv* env,  jclass ajc, jint year, jint montn) { /*func*/
  int32_t ret;
  ret = (int32_t)date_time_get_days(year, montn);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDateTime_date_1time_1get_1wday(JNIEnv* env,  jclass ajc, jint year, jint montn, jint day) { /*func*/
  int32_t ret;
  ret = (int32_t)date_time_get_wday(year, montn, day);

  return (jint)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TDateTime_date_1time_1get_1month_1name(JNIEnv* env,  jclass ajc, jint montn) { /*func*/
  const char* ret;
  ret = (const char*)date_time_get_month_name(montn);

  return (*env)->NewStringUTF(env, ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TDateTime_date_1time_1get_1wday_1name(JNIEnv* env,  jclass ajc, jint wday) { /*func*/
  const char* ret;
  ret = (const char*)date_time_get_wday_name(wday);

  return (*env)->NewStringUTF(env, ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDateTime_date_1time_1t_1get_1prop_1second(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  date_time_t* obj = (date_time_t*)jobj;

  return (jint)(obj->second);
}

JNIEXPORT jint JNICALL Java_awtk_TDateTime_date_1time_1t_1get_1prop_1minute(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  date_time_t* obj = (date_time_t*)jobj;

  return (jint)(obj->minute);
}

JNIEXPORT jint JNICALL Java_awtk_TDateTime_date_1time_1t_1get_1prop_1hour(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  date_time_t* obj = (date_time_t*)jobj;

  return (jint)(obj->hour);
}

JNIEXPORT jint JNICALL Java_awtk_TDateTime_date_1time_1t_1get_1prop_1day(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  date_time_t* obj = (date_time_t*)jobj;

  return (jint)(obj->day);
}

JNIEXPORT jint JNICALL Java_awtk_TDateTime_date_1time_1t_1get_1prop_1wday(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  date_time_t* obj = (date_time_t*)jobj;

  return (jint)(obj->wday);
}

JNIEXPORT jint JNICALL Java_awtk_TDateTime_date_1time_1t_1get_1prop_1month(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  date_time_t* obj = (date_time_t*)jobj;

  return (jint)(obj->month);
}

JNIEXPORT jint JNICALL Java_awtk_TDateTime_date_1time_1t_1get_1prop_1year(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  date_time_t* obj = (date_time_t*)jobj;

  return (jint)(obj->year);
}

JNIEXPORT jint JNICALL Java_awtk_TEasingType_EASING_1LINEAR(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EASING_LINEAR);
}

JNIEXPORT jint JNICALL Java_awtk_TEasingType_EASING_1QUADRATIC_1IN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EASING_QUADRATIC_IN);
}

JNIEXPORT jint JNICALL Java_awtk_TEasingType_EASING_1QUADRATIC_1OUT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EASING_QUADRATIC_OUT);
}

JNIEXPORT jint JNICALL Java_awtk_TEasingType_EASING_1QUADRATIC_1INOUT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EASING_QUADRATIC_INOUT);
}

JNIEXPORT jint JNICALL Java_awtk_TEasingType_EASING_1CUBIC_1IN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EASING_CUBIC_IN);
}

JNIEXPORT jint JNICALL Java_awtk_TEasingType_EASING_1CUBIC_1OUT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EASING_CUBIC_OUT);
}

JNIEXPORT jint JNICALL Java_awtk_TEasingType_EASING_1SIN_1IN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EASING_SIN_IN);
}

JNIEXPORT jint JNICALL Java_awtk_TEasingType_EASING_1SIN_1OUT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EASING_SIN_OUT);
}

JNIEXPORT jint JNICALL Java_awtk_TEasingType_EASING_1SIN_1INOUT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EASING_SIN_INOUT);
}

JNIEXPORT jint JNICALL Java_awtk_TEasingType_EASING_1POW_1IN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EASING_POW_IN);
}

JNIEXPORT jint JNICALL Java_awtk_TEasingType_EASING_1POW_1OUT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EASING_POW_OUT);
}

JNIEXPORT jint JNICALL Java_awtk_TEasingType_EASING_1POW_1INOUT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EASING_POW_INOUT);
}

JNIEXPORT jint JNICALL Java_awtk_TEasingType_EASING_1CIRCULAR_1IN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EASING_CIRCULAR_IN);
}

JNIEXPORT jint JNICALL Java_awtk_TEasingType_EASING_1CIRCULAR_1OUT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EASING_CIRCULAR_OUT);
}

JNIEXPORT jint JNICALL Java_awtk_TEasingType_EASING_1CIRCULAR_1INOUT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EASING_CIRCULAR_INOUT);
}

JNIEXPORT jint JNICALL Java_awtk_TEasingType_EASING_1ELASTIC_1IN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EASING_ELASTIC_IN);
}

JNIEXPORT jint JNICALL Java_awtk_TEasingType_EASING_1ELASTIC_1OUT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EASING_ELASTIC_OUT);
}

JNIEXPORT jint JNICALL Java_awtk_TEasingType_EASING_1ELASTIC_1INOUT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EASING_ELASTIC_INOUT);
}

JNIEXPORT jint JNICALL Java_awtk_TEasingType_EASING_1BACK_1IN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EASING_BACK_IN);
}

JNIEXPORT jint JNICALL Java_awtk_TEasingType_EASING_1BACK_1OUT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EASING_BACK_OUT);
}

JNIEXPORT jint JNICALL Java_awtk_TEasingType_EASING_1BACK_1INOUT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EASING_BACK_INOUT);
}

JNIEXPORT jint JNICALL Java_awtk_TEasingType_EASING_1BOUNCE_1IN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EASING_BOUNCE_IN);
}

JNIEXPORT jint JNICALL Java_awtk_TEasingType_EASING_1BOUNCE_1OUT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EASING_BOUNCE_OUT);
}

JNIEXPORT jint JNICALL Java_awtk_TEasingType_EASING_1BOUNCE_1INOUT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(EASING_BOUNCE_INOUT);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1ENVOY(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_ENVOY);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1FRACTALS(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_FRACTALS);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1FUTURESPLASH(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_FUTURESPLASH);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1HTA(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_HTA);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1JSON(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_JSON);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1UBJSON(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_UBJSON);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1MAC_1BINHEX40(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_MAC_BINHEX40);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1MSWORD(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_MSWORD);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1OCTET_1STREAM(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_OCTET_STREAM);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1ODA(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_ODA);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1OLESCRIPT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_OLESCRIPT);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1PDF(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_PDF);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1PICS_1RULES(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_PICS_RULES);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1PKCS10(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_PKCS10);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1PKIX_1CRL(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_PKIX_CRL);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1POSTSCRIPT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_POSTSCRIPT);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1RTF(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_RTF);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1VND_1MS_1EXCEL(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_VND_MS_EXCEL);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1VND_1MS_1OUTLOOK(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_VND_MS_OUTLOOK);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1VND_1MS_1PKICERTSTORE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_VND_MS_PKICERTSTORE);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1VND_1MS_1PKISECCAT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_VND_MS_PKISECCAT);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1VND_1MS_1PKISTL(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_VND_MS_PKISTL);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1VND_1MS_1POWERPOINT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_VND_MS_POWERPOINT);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1VND_1MS_1PROJECT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_VND_MS_PROJECT);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1VND_1MS_1WORKS(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_VND_MS_WORKS);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1WINHLP(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_WINHLP);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1BCPIO(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_BCPIO);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1CDF(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_CDF);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1COMPRESS(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_COMPRESS);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1COMPRESSED(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_COMPRESSED);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1CPIO(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_CPIO);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1CSH(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_CSH);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1DIRECTOR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_DIRECTOR);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1DVI(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_DVI);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1GTAR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_GTAR);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1GZIP(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_GZIP);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1HDF(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_HDF);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1IPHONE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_IPHONE);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1JAVASCRIPT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_JAVASCRIPT);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1LATEX(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_LATEX);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1MSACCESS(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_MSACCESS);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1MSCARDFILE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_MSCARDFILE);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1MSCLIP(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_MSCLIP);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1MSDOWNLOAD(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_MSDOWNLOAD);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1MSMEDIAVIEW(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_MSMEDIAVIEW);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1MSMETAFILE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_MSMETAFILE);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1MSMONEY(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_MSMONEY);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1MSPUBLISHER(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_MSPUBLISHER);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1MSSCHEDULE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_MSSCHEDULE);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1MSTERMINAL(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_MSTERMINAL);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1MSWRITE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_MSWRITE);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1NETCDF(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_NETCDF);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1PERFMON(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_PERFMON);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1PKCS12(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_PKCS12);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1SH(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_SH);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1SHAR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_SHAR);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1SHOCKWAVE_1FLASH(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_SHOCKWAVE_FLASH);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1STUFFIT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_STUFFIT);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1SV4CPIO(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_SV4CPIO);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1SV4CRC(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_SV4CRC);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1TAR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_TAR);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1TCL(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_TCL);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1TEX(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_TEX);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1TEXINFO(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_TEXINFO);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1TROFF(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_TROFF);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1X_1USTAR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_X_USTAR);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1APPLICATION_1ZIP(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_APPLICATION_ZIP);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1AUDIO_1BASIC(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_AUDIO_BASIC);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1AUDIO_1MID(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_AUDIO_MID);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1AUDIO_1MPEG(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_AUDIO_MPEG);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1AUDIO_1X_1AIFF(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_AUDIO_X_AIFF);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1AUDIO_1X_1MPEGURL(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_AUDIO_X_MPEGURL);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1AUDIO_1X_1WAV(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_AUDIO_X_WAV);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1IMAGE_1BMP(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_IMAGE_BMP);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1IMAGE_1CIS_1COD(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_IMAGE_CIS_COD);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1IMAGE_1GIF(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_IMAGE_GIF);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1IMAGE_1IEF(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_IMAGE_IEF);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1IMAGE_1JPEG(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_IMAGE_JPEG);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1IMAGE_1PIPEG(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_IMAGE_PIPEG);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1IMAGE_1SVG_1XML(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_IMAGE_SVG_XML);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1IMAGE_1TIFF(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_IMAGE_TIFF);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1IMAGE_1X_1CMX(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_IMAGE_X_CMX);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1IMAGE_1X_1ICON(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_IMAGE_X_ICON);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1IMAGE_1X_1RGB(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_IMAGE_X_RGB);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1IMAGE_1X_1XBITMAP(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_IMAGE_X_XBITMAP);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1IMAGE_1X_1XPIXMAP(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_IMAGE_X_XPIXMAP);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1IMAGE_1X_1XWINDOWDUMP(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_IMAGE_X_XWINDOWDUMP);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1MESSAGE_1RFC822(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_MESSAGE_RFC822);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1TEXT_1CSS(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_TEXT_CSS);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1TEXT_1H323(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_TEXT_H323);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1TEXT_1HTML(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_TEXT_HTML);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1TEXT_1IULS(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_TEXT_IULS);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1TEXT_1PLAIN(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_TEXT_PLAIN);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1TEXT_1RICHTEXT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_TEXT_RICHTEXT);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1TEXT_1SCRIPTLET(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_TEXT_SCRIPTLET);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1TEXT_1WEBVIEWHTML(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_TEXT_WEBVIEWHTML);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1TEXT_1X_1COMPONENT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_TEXT_X_COMPONENT);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1TEXT_1X_1SETEXT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_TEXT_X_SETEXT);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1TEXT_1X_1VCARD(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_TEXT_X_VCARD);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1VIDEO_1MPEG(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_VIDEO_MPEG);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1VIDEO_1QUICKTIME(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_VIDEO_QUICKTIME);
}

JNIEXPORT jstring JNICALL Java_awtk_TMIME_TYPE_MIME_1TYPE_1VIDEO_1X_1MSVIDEO(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, MIME_TYPE_VIDEO_X_MSVIDEO);
}

JNIEXPORT jlong JNICALL Java_awtk_TNamedValue_named_1value_1create(JNIEnv* env,  jclass ajc) { /*func*/
  named_value_t* ret;
  ret = (named_value_t*)named_value_create();

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TNamedValue_named_1value_1cast(JNIEnv* env,  jclass ajc, jlong jnv) { /*func*/
  named_value_t* ret;
  named_value_t* nv = (named_value_t*)jnv;
  ret = (named_value_t*)named_value_cast(nv);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TNamedValue_named_1value_1set_1name(JNIEnv* env,  jclass ajc, jlong jnv, jstring jname) { /*func*/
  ret_t ret;
  named_value_t* nv = (named_value_t*)jnv;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)named_value_set_name(nv, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TNamedValue_named_1value_1set_1value(JNIEnv* env,  jclass ajc, jlong jnv, jlong jvalue) { /*func*/
  ret_t ret;
  named_value_t* nv = (named_value_t*)jnv;
  const value_t* value = (const value_t*)jvalue;
  ret = (ret_t)named_value_set_value(nv, value);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TNamedValue_named_1value_1get_1value(JNIEnv* env,  jclass ajc, jlong jnv) { /*func*/
  value_t* ret;
  named_value_t* nv = (named_value_t*)jnv;
  ret = (value_t*)named_value_get_value(nv);

  return (jlong)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TNamedValue_named_1value_1t_1get_1prop_1name(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  named_value_t* obj = (named_value_t*)jobj;

  return (*env)->NewStringUTF(env, obj->name);
}

JNIEXPORT jstring JNICALL Java_awtk_TObjectCmd_OBJECT_1CMD_1SAVE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, OBJECT_CMD_SAVE);
}

JNIEXPORT jstring JNICALL Java_awtk_TObjectCmd_OBJECT_1CMD_1RELOAD(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, OBJECT_CMD_RELOAD);
}

JNIEXPORT jstring JNICALL Java_awtk_TObjectCmd_OBJECT_1CMD_1MOVE_1UP(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, OBJECT_CMD_MOVE_UP);
}

JNIEXPORT jstring JNICALL Java_awtk_TObjectCmd_OBJECT_1CMD_1MOVE_1DOWN(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, OBJECT_CMD_MOVE_DOWN);
}

JNIEXPORT jstring JNICALL Java_awtk_TObjectCmd_OBJECT_1CMD_1REMOVE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, OBJECT_CMD_REMOVE);
}

JNIEXPORT jstring JNICALL Java_awtk_TObjectCmd_OBJECT_1CMD_1REMOVE_1CHECKED(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, OBJECT_CMD_REMOVE_CHECKED);
}

JNIEXPORT jstring JNICALL Java_awtk_TObjectCmd_OBJECT_1CMD_1CLEAR(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, OBJECT_CMD_CLEAR);
}

JNIEXPORT jstring JNICALL Java_awtk_TObjectCmd_OBJECT_1CMD_1ADD(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, OBJECT_CMD_ADD);
}

JNIEXPORT jstring JNICALL Java_awtk_TObjectCmd_OBJECT_1CMD_1DETAIL(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, OBJECT_CMD_DETAIL);
}

JNIEXPORT jstring JNICALL Java_awtk_TObjectCmd_OBJECT_1CMD_1EDIT(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, OBJECT_CMD_EDIT);
}

JNIEXPORT jstring JNICALL Java_awtk_TObjectProp_OBJECT_1PROP_1SIZE(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, OBJECT_PROP_SIZE);
}

JNIEXPORT jstring JNICALL Java_awtk_TObjectProp_OBJECT_1PROP_1CHECKED(JNIEnv* env,  jclass ajc) {/*const*/

  return (*env)->NewStringUTF(env, OBJECT_PROP_CHECKED);
}

JNIEXPORT jlong JNICALL Java_awtk_TRlog_rlog_1create(JNIEnv* env,  jclass ajc, jstring jfilename_pattern, jint max_size, jint buff_size) { /*func*/
  rlog_t* ret;
  const char* filename_pattern = (char*)(*env)->GetStringUTFChars(env, jfilename_pattern, 0);
  ret = (rlog_t*)rlog_create(filename_pattern, max_size, buff_size);
  (*env)->ReleaseStringUTFChars(env, jfilename_pattern, filename_pattern);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TRlog_rlog_1write(JNIEnv* env,  jclass ajc, jlong jlog, jstring jstr) { /*func*/
  ret_t ret;
  rlog_t* log = (rlog_t*)jlog;
  const char* str = (char*)(*env)->GetStringUTFChars(env, jstr, 0);
  ret = (ret_t)rlog_write(log, str);
  (*env)->ReleaseStringUTFChars(env, jstr, str);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TTimeNow_time_1now_1s(JNIEnv* env,  jclass ajc) { /*func*/
  uint64_t ret;
  ret = (uint64_t)time_now_s();

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TTimeNow_time_1now_1ms(JNIEnv* env,  jclass ajc) { /*func*/
  uint64_t ret;
  ret = (uint64_t)time_now_ms();

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TTimeNow_time_1now_1us(JNIEnv* env,  jclass ajc) { /*func*/
  uint64_t ret;
  ret = (uint64_t)time_now_us();

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TRet_RET_1OK(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(RET_OK);
}

JNIEXPORT jint JNICALL Java_awtk_TRet_RET_1OOM(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(RET_OOM);
}

JNIEXPORT jint JNICALL Java_awtk_TRet_RET_1FAIL(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(RET_FAIL);
}

JNIEXPORT jint JNICALL Java_awtk_TRet_RET_1NOT_1IMPL(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(RET_NOT_IMPL);
}

JNIEXPORT jint JNICALL Java_awtk_TRet_RET_1QUIT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(RET_QUIT);
}

JNIEXPORT jint JNICALL Java_awtk_TRet_RET_1FOUND(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(RET_FOUND);
}

JNIEXPORT jint JNICALL Java_awtk_TRet_RET_1BUSY(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(RET_BUSY);
}

JNIEXPORT jint JNICALL Java_awtk_TRet_RET_1REMOVE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(RET_REMOVE);
}

JNIEXPORT jint JNICALL Java_awtk_TRet_RET_1REPEAT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(RET_REPEAT);
}

JNIEXPORT jint JNICALL Java_awtk_TRet_RET_1NOT_1FOUND(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(RET_NOT_FOUND);
}

JNIEXPORT jint JNICALL Java_awtk_TRet_RET_1DONE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(RET_DONE);
}

JNIEXPORT jint JNICALL Java_awtk_TRet_RET_1STOP(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(RET_STOP);
}

JNIEXPORT jint JNICALL Java_awtk_TRet_RET_1SKIP(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(RET_SKIP);
}

JNIEXPORT jint JNICALL Java_awtk_TRet_RET_1CONTINUE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(RET_CONTINUE);
}

JNIEXPORT jint JNICALL Java_awtk_TRet_RET_1OBJECT_1CHANGED(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(RET_OBJECT_CHANGED);
}

JNIEXPORT jint JNICALL Java_awtk_TRet_RET_1ITEMS_1CHANGED(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(RET_ITEMS_CHANGED);
}

JNIEXPORT jint JNICALL Java_awtk_TRet_RET_1BAD_1PARAMS(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(RET_BAD_PARAMS);
}

JNIEXPORT jint JNICALL Java_awtk_TRet_RET_1TIMEOUT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(RET_TIMEOUT);
}

JNIEXPORT jint JNICALL Java_awtk_TRet_RET_1CRC(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(RET_CRC);
}

JNIEXPORT jint JNICALL Java_awtk_TRet_RET_1IO(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(RET_IO);
}

JNIEXPORT jint JNICALL Java_awtk_TRet_RET_1EOS(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(RET_EOS);
}

JNIEXPORT jint JNICALL Java_awtk_TRet_RET_1NOT_1MODIFIED(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(RET_NOT_MODIFIED);
}

JNIEXPORT jint JNICALL Java_awtk_TValueType_VALUE_1TYPE_1INVALID(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(VALUE_TYPE_INVALID);
}

JNIEXPORT jint JNICALL Java_awtk_TValueType_VALUE_1TYPE_1BOOL(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(VALUE_TYPE_BOOL);
}

JNIEXPORT jint JNICALL Java_awtk_TValueType_VALUE_1TYPE_1INT8(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(VALUE_TYPE_INT8);
}

JNIEXPORT jint JNICALL Java_awtk_TValueType_VALUE_1TYPE_1UINT8(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(VALUE_TYPE_UINT8);
}

JNIEXPORT jint JNICALL Java_awtk_TValueType_VALUE_1TYPE_1INT16(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(VALUE_TYPE_INT16);
}

JNIEXPORT jint JNICALL Java_awtk_TValueType_VALUE_1TYPE_1UINT16(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(VALUE_TYPE_UINT16);
}

JNIEXPORT jint JNICALL Java_awtk_TValueType_VALUE_1TYPE_1INT32(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(VALUE_TYPE_INT32);
}

JNIEXPORT jint JNICALL Java_awtk_TValueType_VALUE_1TYPE_1UINT32(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(VALUE_TYPE_UINT32);
}

JNIEXPORT jint JNICALL Java_awtk_TValueType_VALUE_1TYPE_1INT64(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(VALUE_TYPE_INT64);
}

JNIEXPORT jint JNICALL Java_awtk_TValueType_VALUE_1TYPE_1UINT64(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(VALUE_TYPE_UINT64);
}

JNIEXPORT jint JNICALL Java_awtk_TValueType_VALUE_1TYPE_1POINTER(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(VALUE_TYPE_POINTER);
}

JNIEXPORT jint JNICALL Java_awtk_TValueType_VALUE_1TYPE_1FLOAT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(VALUE_TYPE_FLOAT);
}

JNIEXPORT jint JNICALL Java_awtk_TValueType_VALUE_1TYPE_1FLOAT32(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(VALUE_TYPE_FLOAT32);
}

JNIEXPORT jint JNICALL Java_awtk_TValueType_VALUE_1TYPE_1DOUBLE(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(VALUE_TYPE_DOUBLE);
}

JNIEXPORT jint JNICALL Java_awtk_TValueType_VALUE_1TYPE_1STRING(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(VALUE_TYPE_STRING);
}

JNIEXPORT jint JNICALL Java_awtk_TValueType_VALUE_1TYPE_1WSTRING(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(VALUE_TYPE_WSTRING);
}

JNIEXPORT jint JNICALL Java_awtk_TValueType_VALUE_1TYPE_1OBJECT(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(VALUE_TYPE_OBJECT);
}

JNIEXPORT jint JNICALL Java_awtk_TValueType_VALUE_1TYPE_1SIZED_1STRING(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(VALUE_TYPE_SIZED_STRING);
}

JNIEXPORT jint JNICALL Java_awtk_TValueType_VALUE_1TYPE_1BINARY(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(VALUE_TYPE_BINARY);
}

JNIEXPORT jint JNICALL Java_awtk_TValueType_VALUE_1TYPE_1UBJSON(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(VALUE_TYPE_UBJSON);
}

JNIEXPORT jint JNICALL Java_awtk_TValueType_VALUE_1TYPE_1TOKEN(JNIEnv* env,  jclass ajc) {/*const*/

  return (jint)(VALUE_TYPE_TOKEN);
}

JNIEXPORT jlong JNICALL Java_awtk_TAssetsManager_assets_1manager(JNIEnv* env,  jclass ajc) { /*func*/
  assets_manager_t* ret;
  ret = (assets_manager_t*)assets_manager();

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TAssetsManager_assets_1manager_1set_1theme(JNIEnv* env,  jclass ajc, jlong jam, jstring jtheme) { /*func*/
  ret_t ret;
  assets_manager_t* am = (assets_manager_t*)jam;
  const char* theme = (char*)(*env)->GetStringUTFChars(env, jtheme, 0);
  ret = (ret_t)assets_manager_set_theme(am, theme);
  (*env)->ReleaseStringUTFChars(env, jtheme, theme);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TAssetsManager_assets_1manager_1ref(JNIEnv* env,  jclass ajc, jlong jam, jint type, jstring jname) { /*func*/
  asset_info_t* ret;
  assets_manager_t* am = (assets_manager_t*)jam;
  char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (asset_info_t*)assets_manager_ref(am, type, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TAssetsManager_assets_1manager_1ref_1ex(JNIEnv* env,  jclass ajc, jlong jam, jint type, jint subtype, jstring jname) { /*func*/
  asset_info_t* ret;
  assets_manager_t* am = (assets_manager_t*)jam;
  char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (asset_info_t*)assets_manager_ref_ex(am, type, subtype, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TAssetsManager_assets_1manager_1unref(JNIEnv* env,  jclass ajc, jlong jam, jlong jinfo) { /*func*/
  ret_t ret;
  assets_manager_t* am = (assets_manager_t*)jam;
  asset_info_t* info = (asset_info_t*)jinfo;
  ret = (ret_t)assets_manager_unref(am, info);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TWheelEvent_wheel_1event_1cast(JNIEnv* env,  jclass ajc, jlong jevent) { /*func*/
  wheel_event_t* ret;
  event_t* event = (event_t*)jevent;
  ret = (wheel_event_t*)wheel_event_cast(event);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWheelEvent_wheel_1event_1t_1get_1prop_1dy(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  wheel_event_t* obj = (wheel_event_t*)jobj;

  return (jint)(obj->dy);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWheelEvent_wheel_1event_1t_1get_1prop_1alt(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  wheel_event_t* obj = (wheel_event_t*)jobj;

  return (jboolean)(obj->alt);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWheelEvent_wheel_1event_1t_1get_1prop_1ctrl(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  wheel_event_t* obj = (wheel_event_t*)jobj;

  return (jboolean)(obj->ctrl);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWheelEvent_wheel_1event_1t_1get_1prop_1shift(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  wheel_event_t* obj = (wheel_event_t*)jobj;

  return (jboolean)(obj->shift);
}

JNIEXPORT jlong JNICALL Java_awtk_TOrientationEvent_orientation_1event_1cast(JNIEnv* env,  jclass ajc, jlong jevent) { /*func*/
  orientation_event_t* ret;
  event_t* event = (event_t*)jevent;
  ret = (orientation_event_t*)orientation_event_cast(event);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TOrientationEvent_orientation_1event_1t_1get_1prop_1orientation(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  orientation_event_t* obj = (orientation_event_t*)jobj;

  return (jint)(obj->orientation);
}

JNIEXPORT jlong JNICALL Java_awtk_TValueChangeEvent_value_1change_1event_1cast(JNIEnv* env,  jclass ajc, jlong jevent) { /*func*/
  value_change_event_t* ret;
  event_t* event = (event_t*)jevent;
  ret = (value_change_event_t*)value_change_event_cast(event);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TPointerEvent_pointer_1event_1cast(JNIEnv* env,  jclass ajc, jlong jevent) { /*func*/
  pointer_event_t* ret;
  event_t* event = (event_t*)jevent;
  ret = (pointer_event_t*)pointer_event_cast(event);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TPointerEvent_pointer_1event_1t_1get_1prop_1x(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  pointer_event_t* obj = (pointer_event_t*)jobj;

  return (jint)(obj->x);
}

JNIEXPORT jint JNICALL Java_awtk_TPointerEvent_pointer_1event_1t_1get_1prop_1y(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  pointer_event_t* obj = (pointer_event_t*)jobj;

  return (jint)(obj->y);
}

JNIEXPORT jint JNICALL Java_awtk_TPointerEvent_pointer_1event_1t_1get_1prop_1button(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  pointer_event_t* obj = (pointer_event_t*)jobj;

  return (jint)(obj->button);
}

JNIEXPORT jboolean JNICALL Java_awtk_TPointerEvent_pointer_1event_1t_1get_1prop_1pressed(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  pointer_event_t* obj = (pointer_event_t*)jobj;

  return (jboolean)(obj->pressed);
}

JNIEXPORT jboolean JNICALL Java_awtk_TPointerEvent_pointer_1event_1t_1get_1prop_1alt(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  pointer_event_t* obj = (pointer_event_t*)jobj;

  return (jboolean)(obj->alt);
}

JNIEXPORT jboolean JNICALL Java_awtk_TPointerEvent_pointer_1event_1t_1get_1prop_1ctrl(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  pointer_event_t* obj = (pointer_event_t*)jobj;

  return (jboolean)(obj->ctrl);
}

JNIEXPORT jboolean JNICALL Java_awtk_TPointerEvent_pointer_1event_1t_1get_1prop_1cmd(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  pointer_event_t* obj = (pointer_event_t*)jobj;

  return (jboolean)(obj->cmd);
}

JNIEXPORT jboolean JNICALL Java_awtk_TPointerEvent_pointer_1event_1t_1get_1prop_1menu(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  pointer_event_t* obj = (pointer_event_t*)jobj;

  return (jboolean)(obj->menu);
}

JNIEXPORT jboolean JNICALL Java_awtk_TPointerEvent_pointer_1event_1t_1get_1prop_1shift(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  pointer_event_t* obj = (pointer_event_t*)jobj;

  return (jboolean)(obj->shift);
}

JNIEXPORT jlong JNICALL Java_awtk_TKeyEvent_key_1event_1cast(JNIEnv* env,  jclass ajc, jlong jevent) { /*func*/
  key_event_t* ret;
  event_t* event = (event_t*)jevent;
  ret = (key_event_t*)key_event_cast(event);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TKeyEvent_key_1event_1t_1get_1prop_1key(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  key_event_t* obj = (key_event_t*)jobj;

  return (jint)(obj->key);
}

JNIEXPORT jboolean JNICALL Java_awtk_TKeyEvent_key_1event_1t_1get_1prop_1alt(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  key_event_t* obj = (key_event_t*)jobj;

  return (jboolean)(obj->alt);
}

JNIEXPORT jboolean JNICALL Java_awtk_TKeyEvent_key_1event_1t_1get_1prop_1lalt(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  key_event_t* obj = (key_event_t*)jobj;

  return (jboolean)(obj->lalt);
}

JNIEXPORT jboolean JNICALL Java_awtk_TKeyEvent_key_1event_1t_1get_1prop_1ralt(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  key_event_t* obj = (key_event_t*)jobj;

  return (jboolean)(obj->ralt);
}

JNIEXPORT jboolean JNICALL Java_awtk_TKeyEvent_key_1event_1t_1get_1prop_1ctrl(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  key_event_t* obj = (key_event_t*)jobj;

  return (jboolean)(obj->ctrl);
}

JNIEXPORT jboolean JNICALL Java_awtk_TKeyEvent_key_1event_1t_1get_1prop_1lctrl(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  key_event_t* obj = (key_event_t*)jobj;

  return (jboolean)(obj->lctrl);
}

JNIEXPORT jboolean JNICALL Java_awtk_TKeyEvent_key_1event_1t_1get_1prop_1rctrl(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  key_event_t* obj = (key_event_t*)jobj;

  return (jboolean)(obj->rctrl);
}

JNIEXPORT jboolean JNICALL Java_awtk_TKeyEvent_key_1event_1t_1get_1prop_1shift(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  key_event_t* obj = (key_event_t*)jobj;

  return (jboolean)(obj->shift);
}

JNIEXPORT jboolean JNICALL Java_awtk_TKeyEvent_key_1event_1t_1get_1prop_1lshift(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  key_event_t* obj = (key_event_t*)jobj;

  return (jboolean)(obj->lshift);
}

JNIEXPORT jboolean JNICALL Java_awtk_TKeyEvent_key_1event_1t_1get_1prop_1rshift(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  key_event_t* obj = (key_event_t*)jobj;

  return (jboolean)(obj->rshift);
}

JNIEXPORT jboolean JNICALL Java_awtk_TKeyEvent_key_1event_1t_1get_1prop_1cmd(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  key_event_t* obj = (key_event_t*)jobj;

  return (jboolean)(obj->cmd);
}

JNIEXPORT jboolean JNICALL Java_awtk_TKeyEvent_key_1event_1t_1get_1prop_1menu(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  key_event_t* obj = (key_event_t*)jobj;

  return (jboolean)(obj->menu);
}

JNIEXPORT jboolean JNICALL Java_awtk_TKeyEvent_key_1event_1t_1get_1prop_1capslock(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  key_event_t* obj = (key_event_t*)jobj;

  return (jboolean)(obj->capslock);
}

JNIEXPORT jlong JNICALL Java_awtk_TPaintEvent_paint_1event_1cast(JNIEnv* env,  jclass ajc, jlong jevent) { /*func*/
  paint_event_t* ret;
  event_t* event = (event_t*)jevent;
  ret = (paint_event_t*)paint_event_cast(event);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TPaintEvent_paint_1event_1t_1get_1prop_1c(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  paint_event_t* obj = (paint_event_t*)jobj;

  return (jlong)(obj->c);
}

JNIEXPORT jlong JNICALL Java_awtk_TWindowEvent_window_1event_1cast(JNIEnv* env,  jclass ajc, jlong jevent) { /*func*/
  window_event_t* ret;
  event_t* event = (event_t*)jevent;
  ret = (window_event_t*)window_event_cast(event);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TWindowEvent_window_1event_1t_1get_1prop_1window(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  window_event_t* obj = (window_event_t*)jobj;

  return (jlong)(obj->window);
}

JNIEXPORT jlong JNICALL Java_awtk_TMultiGestureEvent_multi_1gesture_1event_1cast(JNIEnv* env,  jclass ajc, jlong jevent) { /*func*/
  multi_gesture_event_t* ret;
  event_t* event = (event_t*)jevent;
  ret = (multi_gesture_event_t*)multi_gesture_event_cast(event);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TMultiGestureEvent_multi_1gesture_1event_1t_1get_1prop_1x(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  multi_gesture_event_t* obj = (multi_gesture_event_t*)jobj;

  return (jint)(obj->x);
}

JNIEXPORT jint JNICALL Java_awtk_TMultiGestureEvent_multi_1gesture_1event_1t_1get_1prop_1y(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  multi_gesture_event_t* obj = (multi_gesture_event_t*)jobj;

  return (jint)(obj->y);
}

JNIEXPORT jdouble JNICALL Java_awtk_TMultiGestureEvent_multi_1gesture_1event_1t_1get_1prop_1rotation(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  multi_gesture_event_t* obj = (multi_gesture_event_t*)jobj;

  return (jdouble)(obj->rotation);
}

JNIEXPORT jdouble JNICALL Java_awtk_TMultiGestureEvent_multi_1gesture_1event_1t_1get_1prop_1distance(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  multi_gesture_event_t* obj = (multi_gesture_event_t*)jobj;

  return (jdouble)(obj->distance);
}

JNIEXPORT jint JNICALL Java_awtk_TAssetsEvent_assets_1event_1t_1get_1prop_1type(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  assets_event_t* obj = (assets_event_t*)jobj;

  return (jint)(obj->type);
}

JNIEXPORT jlong JNICALL Java_awtk_TAssetsEvent_assets_1event_1t_1get_1prop_1asset_1info(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  assets_event_t* obj = (assets_event_t*)jobj;

  return (jlong)(obj->asset_info);
}

JNIEXPORT jint JNICALL Java_awtk_TImageBase_image_1base_1set_1image(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)image_base_set_image(widget, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageBase_image_1base_1set_1rotation(JNIEnv* env,  jclass ajc, jlong jwidget, jdouble rotation) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)image_base_set_rotation(widget, rotation);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageBase_image_1base_1set_1scale(JNIEnv* env,  jclass ajc, jlong jwidget, jdouble scale_x, jdouble scale_y) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)image_base_set_scale(widget, scale_x, scale_y);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageBase_image_1base_1set_1anchor(JNIEnv* env,  jclass ajc, jlong jwidget, jdouble anchor_x, jdouble anchor_y) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)image_base_set_anchor(widget, anchor_x, anchor_y);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageBase_image_1base_1set_1selected(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean selected) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)image_base_set_selected(widget, selected);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageBase_image_1base_1set_1selectable(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean selectable) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)image_base_set_selectable(widget, selectable);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageBase_image_1base_1set_1clickable(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean clickable) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)image_base_set_clickable(widget, clickable);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TImageBase_image_1base_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)image_base_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TImageBase_image_1base_1t_1get_1prop_1image(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_base_t* obj = (image_base_t*)jobj;

  return (*env)->NewStringUTF(env, obj->image);
}

JNIEXPORT jdouble JNICALL Java_awtk_TImageBase_image_1base_1t_1get_1prop_1anchor_1x(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_base_t* obj = (image_base_t*)jobj;

  return (jdouble)(obj->anchor_x);
}

JNIEXPORT jdouble JNICALL Java_awtk_TImageBase_image_1base_1t_1get_1prop_1anchor_1y(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_base_t* obj = (image_base_t*)jobj;

  return (jdouble)(obj->anchor_y);
}

JNIEXPORT jdouble JNICALL Java_awtk_TImageBase_image_1base_1t_1get_1prop_1scale_1x(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_base_t* obj = (image_base_t*)jobj;

  return (jdouble)(obj->scale_x);
}

JNIEXPORT jdouble JNICALL Java_awtk_TImageBase_image_1base_1t_1get_1prop_1scale_1y(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_base_t* obj = (image_base_t*)jobj;

  return (jdouble)(obj->scale_y);
}

JNIEXPORT jdouble JNICALL Java_awtk_TImageBase_image_1base_1t_1get_1prop_1rotation(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_base_t* obj = (image_base_t*)jobj;

  return (jdouble)(obj->rotation);
}

JNIEXPORT jboolean JNICALL Java_awtk_TImageBase_image_1base_1t_1get_1prop_1clickable(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_base_t* obj = (image_base_t*)jobj;

  return (jboolean)(obj->clickable);
}

JNIEXPORT jboolean JNICALL Java_awtk_TImageBase_image_1base_1t_1get_1prop_1selectable(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_base_t* obj = (image_base_t*)jobj;

  return (jboolean)(obj->selectable);
}

JNIEXPORT jboolean JNICALL Java_awtk_TImageBase_image_1base_1t_1get_1prop_1selected(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_base_t* obj = (image_base_t*)jobj;

  return (jboolean)(obj->selected);
}

JNIEXPORT jint JNICALL Java_awtk_TStyleMutable_style_1mutable_1set_1name(JNIEnv* env,  jclass ajc, jlong js, jstring jname) { /*func*/
  ret_t ret;
  style_t* s = (style_t*)js;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)style_mutable_set_name(s, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TStyleMutable_style_1mutable_1set_1int(JNIEnv* env,  jclass ajc, jlong js, jstring jstate, jstring jname, jint val) { /*func*/
  ret_t ret;
  style_t* s = (style_t*)js;
  const char* state = (char*)(*env)->GetStringUTFChars(env, jstate, 0);
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)style_mutable_set_int(s, state, name, val);
  (*env)->ReleaseStringUTFChars(env, jstate, state);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TStyleMutable_style_1mutable_1cast(JNIEnv* env,  jclass ajc, jlong js) { /*func*/
  style_t* ret;
  style_t* s = (style_t*)js;
  ret = (style_t*)style_mutable_cast(s);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TStyleMutable_style_1mutable_1create(JNIEnv* env,  jclass ajc, jlong jdefault_style) { /*func*/
  style_t* ret;
  style_t* default_style = (style_t*)jdefault_style;
  ret = (style_t*)style_mutable_create(default_style);

  return (jlong)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TStyleMutable_style_1mutable_1t_1get_1prop_1name(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  style_mutable_t* obj = (style_mutable_t*)jobj;

  return (*env)->NewStringUTF(env, obj->name);
}

JNIEXPORT jlong JNICALL Java_awtk_TWindowBase_window_1base_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)window_base_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TWindowBase_window_1base_1t_1get_1prop_1theme(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  window_base_t* obj = (window_base_t*)jobj;

  return (*env)->NewStringUTF(env, obj->theme);
}

JNIEXPORT jint JNICALL Java_awtk_TWindowBase_window_1base_1t_1get_1prop_1design_1w(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  window_base_t* obj = (window_base_t*)jobj;

  return (jint)(obj->design_w);
}

JNIEXPORT jint JNICALL Java_awtk_TWindowBase_window_1base_1t_1get_1prop_1design_1h(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  window_base_t* obj = (window_base_t*)jobj;

  return (jint)(obj->design_h);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWindowBase_window_1base_1t_1get_1prop_1auto_1scale_1children_1x(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  window_base_t* obj = (window_base_t*)jobj;

  return (jboolean)(obj->auto_scale_children_x);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWindowBase_window_1base_1t_1get_1prop_1auto_1scale_1children_1y(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  window_base_t* obj = (window_base_t*)jobj;

  return (jboolean)(obj->auto_scale_children_y);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWindowBase_window_1base_1t_1get_1prop_1auto_1scale_1children_1w(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  window_base_t* obj = (window_base_t*)jobj;

  return (jboolean)(obj->auto_scale_children_w);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWindowBase_window_1base_1t_1get_1prop_1auto_1scale_1children_1h(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  window_base_t* obj = (window_base_t*)jobj;

  return (jboolean)(obj->auto_scale_children_h);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWindowBase_window_1base_1t_1get_1prop_1disable_1anim(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  window_base_t* obj = (window_base_t*)jobj;

  return (jboolean)(obj->disable_anim);
}

JNIEXPORT jint JNICALL Java_awtk_TWindowBase_window_1base_1t_1get_1prop_1closable(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  window_base_t* obj = (window_base_t*)jobj;

  return (jint)(obj->closable);
}

JNIEXPORT jstring JNICALL Java_awtk_TWindowBase_window_1base_1t_1get_1prop_1open_1anim_1hint(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  window_base_t* obj = (window_base_t*)jobj;

  return (*env)->NewStringUTF(env, obj->open_anim_hint);
}

JNIEXPORT jstring JNICALL Java_awtk_TWindowBase_window_1base_1t_1get_1prop_1close_1anim_1hint(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  window_base_t* obj = (window_base_t*)jobj;

  return (*env)->NewStringUTF(env, obj->close_anim_hint);
}

JNIEXPORT jstring JNICALL Java_awtk_TWindowBase_window_1base_1t_1get_1prop_1move_1focus_1prev_1key(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  window_base_t* obj = (window_base_t*)jobj;

  return (*env)->NewStringUTF(env, obj->move_focus_prev_key);
}

JNIEXPORT jstring JNICALL Java_awtk_TWindowBase_window_1base_1t_1get_1prop_1move_1focus_1next_1key(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  window_base_t* obj = (window_base_t*)jobj;

  return (*env)->NewStringUTF(env, obj->move_focus_next_key);
}

JNIEXPORT jstring JNICALL Java_awtk_TWindowBase_window_1base_1t_1get_1prop_1move_1focus_1up_1key(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  window_base_t* obj = (window_base_t*)jobj;

  return (*env)->NewStringUTF(env, obj->move_focus_up_key);
}

JNIEXPORT jstring JNICALL Java_awtk_TWindowBase_window_1base_1t_1get_1prop_1move_1focus_1down_1key(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  window_base_t* obj = (window_base_t*)jobj;

  return (*env)->NewStringUTF(env, obj->move_focus_down_key);
}

JNIEXPORT jstring JNICALL Java_awtk_TWindowBase_window_1base_1t_1get_1prop_1move_1focus_1left_1key(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  window_base_t* obj = (window_base_t*)jobj;

  return (*env)->NewStringUTF(env, obj->move_focus_left_key);
}

JNIEXPORT jstring JNICALL Java_awtk_TWindowBase_window_1base_1t_1get_1prop_1move_1focus_1right_1key(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  window_base_t* obj = (window_base_t*)jobj;

  return (*env)->NewStringUTF(env, obj->move_focus_right_key);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWindowBase_window_1base_1t_1get_1prop_1single_1instance(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  window_base_t* obj = (window_base_t*)jobj;

  return (jboolean)(obj->single_instance);
}

JNIEXPORT jlong JNICALL Java_awtk_TWindowManager_window_1manager(JNIEnv* env,  jclass ajc) { /*func*/
  widget_t* ret;
  ret = (widget_t*)window_manager();

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TWindowManager_window_1manager_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)window_manager_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TWindowManager_window_1manager_1get_1top_1main_1window(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)window_manager_get_top_main_window(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TWindowManager_window_1manager_1get_1top_1window(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)window_manager_get_top_window(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TWindowManager_window_1manager_1get_1prev_1window(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)window_manager_get_prev_window(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWindowManager_window_1manager_1get_1pointer_1x(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  xy_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (xy_t)window_manager_get_pointer_x(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWindowManager_window_1manager_1get_1pointer_1y(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  xy_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (xy_t)window_manager_get_pointer_y(widget);

  return (jint)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWindowManager_window_1manager_1get_1pointer_1pressed(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  bool_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (bool_t)window_manager_get_pointer_pressed(widget);

  return (jboolean)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWindowManager_window_1manager_1is_1animating(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  bool_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (bool_t)window_manager_is_animating(widget);

  return (jboolean)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWindowManager_window_1manager_1set_1show_1fps(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean show_fps) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)window_manager_set_show_fps(widget, show_fps);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWindowManager_window_1manager_1set_1screen_1saver_1time(JNIEnv* env,  jclass ajc, jlong jwidget, jint screen_saver_time) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)window_manager_set_screen_saver_time(widget, screen_saver_time);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWindowManager_window_1manager_1set_1cursor(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jcursor) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* cursor = (char*)(*env)->GetStringUTFChars(env, jcursor, 0);
  ret = (ret_t)window_manager_set_cursor(widget, cursor);
  (*env)->ReleaseStringUTFChars(env, jcursor, cursor);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWindowManager_window_1manager_1back(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)window_manager_back(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWindowManager_window_1manager_1back_1to_1home(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)window_manager_back_to_home(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWindowManager_window_1manager_1back_1to(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jtarget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* target = (char*)(*env)->GetStringUTFChars(env, jtarget, 0);
  ret = (ret_t)window_manager_back_to(widget, target);
  (*env)->ReleaseStringUTFChars(env, jtarget, target);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWindowManager_window_1manager_1resize(JNIEnv* env,  jclass ajc, jlong jwidget, jint w, jint h) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)window_manager_resize(widget, w, h);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWindowManager_window_1manager_1close_1all(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)window_manager_close_all(widget);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TCanvasWidget_canvas_1widget_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)canvas_widget_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TCanvasWidget_canvas_1widget_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)canvas_widget_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TColorComponent_color_1component_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)color_component_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TColorPicker_color_1picker_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)color_picker_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TColorPicker_color_1picker_1set_1color(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jcolor) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* color = (char*)(*env)->GetStringUTFChars(env, jcolor, 0);
  ret = (ret_t)color_picker_set_color(widget, color);
  (*env)->ReleaseStringUTFChars(env, jcolor, color);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TColorPicker_color_1picker_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)color_picker_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TColorPicker_color_1picker_1t_1get_1prop_1value(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  color_picker_t* obj = (color_picker_t*)jobj;

  return (*env)->NewStringUTF(env, obj->value);
}

JNIEXPORT jlong JNICALL Java_awtk_TDraggable_draggable_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)draggable_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TDraggable_draggable_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)draggable_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDraggable_draggable_1set_1top(JNIEnv* env,  jclass ajc, jlong jwidget, jint top) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)draggable_set_top(widget, top);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDraggable_draggable_1set_1bottom(JNIEnv* env,  jclass ajc, jlong jwidget, jint bottom) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)draggable_set_bottom(widget, bottom);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDraggable_draggable_1set_1left(JNIEnv* env,  jclass ajc, jlong jwidget, jint left) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)draggable_set_left(widget, left);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDraggable_draggable_1set_1right(JNIEnv* env,  jclass ajc, jlong jwidget, jint right) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)draggable_set_right(widget, right);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDraggable_draggable_1set_1vertical_1only(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean vertical_only) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)draggable_set_vertical_only(widget, vertical_only);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDraggable_draggable_1set_1horizontal_1only(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean horizontal_only) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)draggable_set_horizontal_only(widget, horizontal_only);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDraggable_draggable_1set_1drag_1window(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean drag_window) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)draggable_set_drag_window(widget, drag_window);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDraggable_draggable_1t_1get_1prop_1top(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  draggable_t* obj = (draggable_t*)jobj;

  return (jint)(obj->top);
}

JNIEXPORT jint JNICALL Java_awtk_TDraggable_draggable_1t_1get_1prop_1bottom(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  draggable_t* obj = (draggable_t*)jobj;

  return (jint)(obj->bottom);
}

JNIEXPORT jint JNICALL Java_awtk_TDraggable_draggable_1t_1get_1prop_1left(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  draggable_t* obj = (draggable_t*)jobj;

  return (jint)(obj->left);
}

JNIEXPORT jint JNICALL Java_awtk_TDraggable_draggable_1t_1get_1prop_1right(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  draggable_t* obj = (draggable_t*)jobj;

  return (jint)(obj->right);
}

JNIEXPORT jboolean JNICALL Java_awtk_TDraggable_draggable_1t_1get_1prop_1vertical_1only(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  draggable_t* obj = (draggable_t*)jobj;

  return (jboolean)(obj->vertical_only);
}

JNIEXPORT jboolean JNICALL Java_awtk_TDraggable_draggable_1t_1get_1prop_1horizontal_1only(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  draggable_t* obj = (draggable_t*)jobj;

  return (jboolean)(obj->horizontal_only);
}

JNIEXPORT jboolean JNICALL Java_awtk_TDraggable_draggable_1t_1get_1prop_1drag_1window(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  draggable_t* obj = (draggable_t*)jobj;

  return (jboolean)(obj->drag_window);
}

JNIEXPORT jlong JNICALL Java_awtk_TFileBrowserView_file_1browser_1view_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)file_browser_view_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TFileBrowserView_file_1browser_1view_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)file_browser_view_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TFileBrowserView_file_1browser_1view_1set_1init_1dir(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jinit_dir) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* init_dir = (char*)(*env)->GetStringUTFChars(env, jinit_dir, 0);
  ret = (ret_t)file_browser_view_set_init_dir(widget, init_dir);
  (*env)->ReleaseStringUTFChars(env, jinit_dir, init_dir);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TFileBrowserView_file_1browser_1view_1set_1filter(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jfilter) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* filter = (char*)(*env)->GetStringUTFChars(env, jfilter, 0);
  ret = (ret_t)file_browser_view_set_filter(widget, filter);
  (*env)->ReleaseStringUTFChars(env, jfilter, filter);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TFileBrowserView_file_1browser_1view_1reload(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)file_browser_view_reload(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TFileBrowserView_file_1browser_1view_1set_1ignore_1hidden_1files(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean ignore_hidden_files) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)file_browser_view_set_ignore_hidden_files(widget, ignore_hidden_files);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TFileBrowserView_file_1browser_1view_1set_1sort_1ascending(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean sort_ascending) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)file_browser_view_set_sort_ascending(widget, sort_ascending);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TFileBrowserView_file_1browser_1view_1set_1show_1check_1button(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean show_check_button) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)file_browser_view_set_show_check_button(widget, show_check_button);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TFileBrowserView_file_1browser_1view_1set_1sort_1by(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jsort_by) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* sort_by = (char*)(*env)->GetStringUTFChars(env, jsort_by, 0);
  ret = (ret_t)file_browser_view_set_sort_by(widget, sort_by);
  (*env)->ReleaseStringUTFChars(env, jsort_by, sort_by);

  return (jint)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TFileBrowserView_file_1browser_1view_1get_1cwd(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  const char* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (const char*)file_browser_view_get_cwd(widget);

  return (*env)->NewStringUTF(env, ret);
}

JNIEXPORT jint JNICALL Java_awtk_TFileBrowserView_file_1browser_1view_1create_1dir(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)file_browser_view_create_dir(widget, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TFileBrowserView_file_1browser_1view_1create_1file(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname, jstring jdata, jint size) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  const char* data = (char*)(*env)->GetStringUTFChars(env, jdata, 0);
  ret = (ret_t)file_browser_view_create_file(widget, name, data, size);
  (*env)->ReleaseStringUTFChars(env, jname, name);
  (*env)->ReleaseStringUTFChars(env, jdata, data);

  return (jint)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TFileBrowserView_file_1browser_1view_1t_1get_1prop_1init_1dir(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  file_browser_view_t* obj = (file_browser_view_t*)jobj;

  return (*env)->NewStringUTF(env, obj->init_dir);
}

JNIEXPORT jstring JNICALL Java_awtk_TFileBrowserView_file_1browser_1view_1t_1get_1prop_1filter(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  file_browser_view_t* obj = (file_browser_view_t*)jobj;

  return (*env)->NewStringUTF(env, obj->filter);
}

JNIEXPORT jboolean JNICALL Java_awtk_TFileBrowserView_file_1browser_1view_1t_1get_1prop_1ignore_1hidden_1files(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  file_browser_view_t* obj = (file_browser_view_t*)jobj;

  return (jboolean)(obj->ignore_hidden_files);
}

JNIEXPORT jboolean JNICALL Java_awtk_TFileBrowserView_file_1browser_1view_1t_1get_1prop_1sort_1ascending(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  file_browser_view_t* obj = (file_browser_view_t*)jobj;

  return (jboolean)(obj->sort_ascending);
}

JNIEXPORT jboolean JNICALL Java_awtk_TFileBrowserView_file_1browser_1view_1t_1get_1prop_1show_1check_1button(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  file_browser_view_t* obj = (file_browser_view_t*)jobj;

  return (jboolean)(obj->show_check_button);
}

JNIEXPORT jstring JNICALL Java_awtk_TFileBrowserView_file_1browser_1view_1t_1get_1prop_1sort_1by(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  file_browser_view_t* obj = (file_browser_view_t*)jobj;

  return (*env)->NewStringUTF(env, obj->sort_by);
}

JNIEXPORT jlong JNICALL Java_awtk_TFileChooser_file_1chooser_1create(JNIEnv* env,  jclass ajc) { /*func*/
  file_chooser_t* ret;
  ret = (file_chooser_t*)file_chooser_create();

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TFileChooser_file_1chooser_1set_1init_1dir(JNIEnv* env,  jclass ajc, jlong jchooser, jstring jinit_dir) { /*func*/
  ret_t ret;
  file_chooser_t* chooser = (file_chooser_t*)jchooser;
  const char* init_dir = (char*)(*env)->GetStringUTFChars(env, jinit_dir, 0);
  ret = (ret_t)file_chooser_set_init_dir(chooser, init_dir);
  (*env)->ReleaseStringUTFChars(env, jinit_dir, init_dir);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TFileChooser_file_1chooser_1set_1filter(JNIEnv* env,  jclass ajc, jlong jchooser, jstring jfilter) { /*func*/
  ret_t ret;
  file_chooser_t* chooser = (file_chooser_t*)jchooser;
  const char* filter = (char*)(*env)->GetStringUTFChars(env, jfilter, 0);
  ret = (ret_t)file_chooser_set_filter(chooser, filter);
  (*env)->ReleaseStringUTFChars(env, jfilter, filter);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TFileChooser_file_1chooser_1cast(JNIEnv* env,  jclass ajc, jlong jchooser) { /*func*/
  file_chooser_t* ret;
  file_chooser_t* chooser = (file_chooser_t*)jchooser;
  ret = (file_chooser_t*)file_chooser_cast(chooser);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TFileChooser_file_1chooser_1choose_1file_1for_1save(JNIEnv* env,  jclass ajc, jlong jchooser) { /*func*/
  ret_t ret;
  file_chooser_t* chooser = (file_chooser_t*)jchooser;
  ret = (ret_t)file_chooser_choose_file_for_save(chooser);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TFileChooser_file_1chooser_1choose_1file_1for_1open(JNIEnv* env,  jclass ajc, jlong jchooser) { /*func*/
  ret_t ret;
  file_chooser_t* chooser = (file_chooser_t*)jchooser;
  ret = (ret_t)file_chooser_choose_file_for_open(chooser);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TFileChooser_file_1chooser_1choose_1folder(JNIEnv* env,  jclass ajc, jlong jchooser) { /*func*/
  ret_t ret;
  file_chooser_t* chooser = (file_chooser_t*)jchooser;
  ret = (ret_t)file_chooser_choose_folder(chooser);

  return (jint)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TFileChooser_file_1chooser_1get_1dir(JNIEnv* env,  jclass ajc, jlong jchooser) { /*func*/
  const char* ret;
  file_chooser_t* chooser = (file_chooser_t*)jchooser;
  ret = (const char*)file_chooser_get_dir(chooser);

  return (*env)->NewStringUTF(env, ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TFileChooser_file_1chooser_1get_1filename(JNIEnv* env,  jclass ajc, jlong jchooser) { /*func*/
  const char* ret;
  file_chooser_t* chooser = (file_chooser_t*)jchooser;
  ret = (const char*)file_chooser_get_filename(chooser);

  return (*env)->NewStringUTF(env, ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TFileChooser_file_1chooser_1is_1aborted(JNIEnv* env,  jclass ajc, jlong jchooser) { /*func*/
  bool_t ret;
  file_chooser_t* chooser = (file_chooser_t*)jchooser;
  ret = (bool_t)file_chooser_is_aborted(chooser);

  return (jboolean)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TGuagePointer_guage_1pointer_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)guage_pointer_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TGuagePointer_guage_1pointer_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)guage_pointer_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TGuagePointer_guage_1pointer_1set_1angle(JNIEnv* env,  jclass ajc, jlong jwidget, jint angle) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)guage_pointer_set_angle(widget, angle);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TGuagePointer_guage_1pointer_1set_1image(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jimage) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* image = (char*)(*env)->GetStringUTFChars(env, jimage, 0);
  ret = (ret_t)guage_pointer_set_image(widget, image);
  (*env)->ReleaseStringUTFChars(env, jimage, image);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TGuagePointer_guage_1pointer_1set_1anchor(JNIEnv* env,  jclass ajc, jlong jwidget, jstring janchor_x, jstring janchor_y) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* anchor_x = (char*)(*env)->GetStringUTFChars(env, janchor_x, 0);
  const char* anchor_y = (char*)(*env)->GetStringUTFChars(env, janchor_y, 0);
  ret = (ret_t)guage_pointer_set_anchor(widget, anchor_x, anchor_y);
  (*env)->ReleaseStringUTFChars(env, janchor_x, anchor_x);
  (*env)->ReleaseStringUTFChars(env, janchor_y, anchor_y);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TGuagePointer_guage_1pointer_1t_1get_1prop_1angle(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  guage_pointer_t* obj = (guage_pointer_t*)jobj;

  return (jint)(obj->angle);
}

JNIEXPORT jstring JNICALL Java_awtk_TGuagePointer_guage_1pointer_1t_1get_1prop_1image(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  guage_pointer_t* obj = (guage_pointer_t*)jobj;

  return (*env)->NewStringUTF(env, obj->image);
}

JNIEXPORT jstring JNICALL Java_awtk_TGuagePointer_guage_1pointer_1t_1get_1prop_1anchor_1x(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  guage_pointer_t* obj = (guage_pointer_t*)jobj;

  return (*env)->NewStringUTF(env, obj->anchor_x);
}

JNIEXPORT jstring JNICALL Java_awtk_TGuagePointer_guage_1pointer_1t_1get_1prop_1anchor_1y(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  guage_pointer_t* obj = (guage_pointer_t*)jobj;

  return (*env)->NewStringUTF(env, obj->anchor_y);
}

JNIEXPORT jlong JNICALL Java_awtk_TGuage_guage_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)guage_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TGuage_guage_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)guage_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TGuage_guage_1set_1image(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)guage_set_image(widget, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TGuage_guage_1set_1draw_1type(JNIEnv* env,  jclass ajc, jlong jwidget, jint draw_type) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)guage_set_draw_type(widget, draw_type);

  return (jint)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TGuage_guage_1t_1get_1prop_1image(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  guage_t* obj = (guage_t*)jobj;

  return (*env)->NewStringUTF(env, obj->image);
}

JNIEXPORT jint JNICALL Java_awtk_TGuage_guage_1t_1get_1prop_1draw_1type(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  guage_t* obj = (guage_t*)jobj;

  return (jint)(obj->draw_type);
}

JNIEXPORT jlong JNICALL Java_awtk_TImageAnimation_image_1animation_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)image_animation_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageAnimation_image_1animation_1set_1loop(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean loop) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)image_animation_set_loop(widget, loop);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageAnimation_image_1animation_1set_1image(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jimage) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* image = (char*)(*env)->GetStringUTFChars(env, jimage, 0);
  ret = (ret_t)image_animation_set_image(widget, image);
  (*env)->ReleaseStringUTFChars(env, jimage, image);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageAnimation_image_1animation_1set_1interval(JNIEnv* env,  jclass ajc, jlong jwidget, jint interval) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)image_animation_set_interval(widget, interval);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageAnimation_image_1animation_1set_1delay(JNIEnv* env,  jclass ajc, jlong jwidget, jint delay) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)image_animation_set_delay(widget, delay);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageAnimation_image_1animation_1set_1auto_1play(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean auto_play) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)image_animation_set_auto_play(widget, auto_play);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageAnimation_image_1animation_1set_1sequence(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jsequence) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* sequence = (char*)(*env)->GetStringUTFChars(env, jsequence, 0);
  ret = (ret_t)image_animation_set_sequence(widget, sequence);
  (*env)->ReleaseStringUTFChars(env, jsequence, sequence);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageAnimation_image_1animation_1set_1range_1sequence(JNIEnv* env,  jclass ajc, jlong jwidget, jint start_index, jint end_index) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)image_animation_set_range_sequence(widget, start_index, end_index);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageAnimation_image_1animation_1play(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)image_animation_play(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageAnimation_image_1animation_1stop(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)image_animation_stop(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageAnimation_image_1animation_1pause(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)image_animation_pause(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageAnimation_image_1animation_1next(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)image_animation_next(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageAnimation_image_1animation_1set_1format(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jformat) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* format = (char*)(*env)->GetStringUTFChars(env, jformat, 0);
  ret = (ret_t)image_animation_set_format(widget, format);
  (*env)->ReleaseStringUTFChars(env, jformat, format);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageAnimation_image_1animation_1set_1unload_1after_1paint(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean unload_after_paint) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)image_animation_set_unload_after_paint(widget, unload_after_paint);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TImageAnimation_image_1animation_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)image_animation_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TImageAnimation_image_1animation_1is_1playing(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  bool_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (bool_t)image_animation_is_playing(widget);

  return (jboolean)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TImageAnimation_image_1animation_1t_1get_1prop_1image(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_animation_t* obj = (image_animation_t*)jobj;

  return (*env)->NewStringUTF(env, obj->image);
}

JNIEXPORT jstring JNICALL Java_awtk_TImageAnimation_image_1animation_1t_1get_1prop_1sequence(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_animation_t* obj = (image_animation_t*)jobj;

  return (*env)->NewStringUTF(env, obj->sequence);
}

JNIEXPORT jint JNICALL Java_awtk_TImageAnimation_image_1animation_1t_1get_1prop_1start_1index(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_animation_t* obj = (image_animation_t*)jobj;

  return (jint)(obj->start_index);
}

JNIEXPORT jint JNICALL Java_awtk_TImageAnimation_image_1animation_1t_1get_1prop_1end_1index(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_animation_t* obj = (image_animation_t*)jobj;

  return (jint)(obj->end_index);
}

JNIEXPORT jboolean JNICALL Java_awtk_TImageAnimation_image_1animation_1t_1get_1prop_1loop(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_animation_t* obj = (image_animation_t*)jobj;

  return (jboolean)(obj->loop);
}

JNIEXPORT jboolean JNICALL Java_awtk_TImageAnimation_image_1animation_1t_1get_1prop_1auto_1play(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_animation_t* obj = (image_animation_t*)jobj;

  return (jboolean)(obj->auto_play);
}

JNIEXPORT jboolean JNICALL Java_awtk_TImageAnimation_image_1animation_1t_1get_1prop_1unload_1after_1paint(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_animation_t* obj = (image_animation_t*)jobj;

  return (jboolean)(obj->unload_after_paint);
}

JNIEXPORT jstring JNICALL Java_awtk_TImageAnimation_image_1animation_1t_1get_1prop_1format(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_animation_t* obj = (image_animation_t*)jobj;

  return (*env)->NewStringUTF(env, obj->format);
}

JNIEXPORT jint JNICALL Java_awtk_TImageAnimation_image_1animation_1t_1get_1prop_1interval(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_animation_t* obj = (image_animation_t*)jobj;

  return (jint)(obj->interval);
}

JNIEXPORT jint JNICALL Java_awtk_TImageAnimation_image_1animation_1t_1get_1prop_1delay(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_animation_t* obj = (image_animation_t*)jobj;

  return (jint)(obj->delay);
}

JNIEXPORT jlong JNICALL Java_awtk_TImageValue_image_1value_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)image_value_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageValue_image_1value_1set_1image(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jimage) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* image = (char*)(*env)->GetStringUTFChars(env, jimage, 0);
  ret = (ret_t)image_value_set_image(widget, image);
  (*env)->ReleaseStringUTFChars(env, jimage, image);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageValue_image_1value_1set_1format(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jformat) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* format = (char*)(*env)->GetStringUTFChars(env, jformat, 0);
  ret = (ret_t)image_value_set_format(widget, format);
  (*env)->ReleaseStringUTFChars(env, jformat, format);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageValue_image_1value_1set_1click_1add_1delta(JNIEnv* env,  jclass ajc, jlong jwidget, jdouble delta) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)image_value_set_click_add_delta(widget, delta);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageValue_image_1value_1set_1value(JNIEnv* env,  jclass ajc, jlong jwidget, jdouble value) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)image_value_set_value(widget, value);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageValue_image_1value_1set_1min(JNIEnv* env,  jclass ajc, jlong jwidget, jdouble min) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)image_value_set_min(widget, min);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImageValue_image_1value_1set_1max(JNIEnv* env,  jclass ajc, jlong jwidget, jdouble max) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)image_value_set_max(widget, max);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TImageValue_image_1value_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)image_value_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TImageValue_image_1value_1t_1get_1prop_1image(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_value_t* obj = (image_value_t*)jobj;

  return (*env)->NewStringUTF(env, obj->image);
}

JNIEXPORT jstring JNICALL Java_awtk_TImageValue_image_1value_1t_1get_1prop_1format(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_value_t* obj = (image_value_t*)jobj;

  return (*env)->NewStringUTF(env, obj->format);
}

JNIEXPORT jdouble JNICALL Java_awtk_TImageValue_image_1value_1t_1get_1prop_1click_1add_1delta(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_value_t* obj = (image_value_t*)jobj;

  return (jdouble)(obj->click_add_delta);
}

JNIEXPORT jdouble JNICALL Java_awtk_TImageValue_image_1value_1t_1get_1prop_1value(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_value_t* obj = (image_value_t*)jobj;

  return (jdouble)(obj->value);
}

JNIEXPORT jdouble JNICALL Java_awtk_TImageValue_image_1value_1t_1get_1prop_1min(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_value_t* obj = (image_value_t*)jobj;

  return (jdouble)(obj->min);
}

JNIEXPORT jdouble JNICALL Java_awtk_TImageValue_image_1value_1t_1get_1prop_1max(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_value_t* obj = (image_value_t*)jobj;

  return (jdouble)(obj->max);
}

JNIEXPORT jlong JNICALL Java_awtk_TCandidates_candidates_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)candidates_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCandidates_candidates_1set_1pre(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean pre) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)candidates_set_pre(widget, pre);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCandidates_candidates_1set_1select_1by_1num(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean select_by_num) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)candidates_set_select_by_num(widget, select_by_num);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCandidates_candidates_1set_1auto_1hide(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean auto_hide) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)candidates_set_auto_hide(widget, auto_hide);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCandidates_candidates_1set_1button_1style(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jbutton_style) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* button_style = (char*)(*env)->GetStringUTFChars(env, jbutton_style, 0);
  ret = (ret_t)candidates_set_button_style(widget, button_style);
  (*env)->ReleaseStringUTFChars(env, jbutton_style, button_style);

  return (jint)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TCandidates_candidates_1t_1get_1prop_1pre(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  candidates_t* obj = (candidates_t*)jobj;

  return (jboolean)(obj->pre);
}

JNIEXPORT jboolean JNICALL Java_awtk_TCandidates_candidates_1t_1get_1prop_1select_1by_1num(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  candidates_t* obj = (candidates_t*)jobj;

  return (jboolean)(obj->select_by_num);
}

JNIEXPORT jboolean JNICALL Java_awtk_TCandidates_candidates_1t_1get_1prop_1auto_1hide(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  candidates_t* obj = (candidates_t*)jobj;

  return (jboolean)(obj->auto_hide);
}

JNIEXPORT jstring JNICALL Java_awtk_TCandidates_candidates_1t_1get_1prop_1button_1style(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  candidates_t* obj = (candidates_t*)jobj;

  return (*env)->NewStringUTF(env, obj->button_style);
}

JNIEXPORT jlong JNICALL Java_awtk_TLangIndicator_lang_1indicator_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)lang_indicator_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TLangIndicator_lang_1indicator_1set_1image(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jimage) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* image = (char*)(*env)->GetStringUTFChars(env, jimage, 0);
  ret = (ret_t)lang_indicator_set_image(widget, image);
  (*env)->ReleaseStringUTFChars(env, jimage, image);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TLangIndicator_lang_1indicator_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)lang_indicator_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TLangIndicator_lang_1indicator_1t_1get_1prop_1image(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  lang_indicator_t* obj = (lang_indicator_t*)jobj;

  return (*env)->NewStringUTF(env, obj->image);
}

JNIEXPORT jlong JNICALL Java_awtk_TLineNumber_line_1number_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)line_number_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TLineNumber_line_1number_1set_1top_1margin(JNIEnv* env,  jclass ajc, jlong jwidget, jint top_margin) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)line_number_set_top_margin(widget, top_margin);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TLineNumber_line_1number_1set_1bottom_1margin(JNIEnv* env,  jclass ajc, jlong jwidget, jint bottom_margin) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)line_number_set_bottom_margin(widget, bottom_margin);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TLineNumber_line_1number_1set_1line_1height(JNIEnv* env,  jclass ajc, jlong jwidget, jint line_height) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)line_number_set_line_height(widget, line_height);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TLineNumber_line_1number_1set_1yoffset(JNIEnv* env,  jclass ajc, jlong jwidget, jint yoffset) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)line_number_set_yoffset(widget, yoffset);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TLineNumber_line_1number_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)line_number_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TMledit_mledit_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)mledit_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TMledit_mledit_1set_1readonly(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean readonly) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)mledit_set_readonly(widget, readonly);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TMledit_mledit_1set_1cancelable(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean cancelable) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)mledit_set_cancelable(widget, cancelable);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TMledit_mledit_1set_1focus(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean focus) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)mledit_set_focus(widget, focus);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TMledit_mledit_1set_1wrap_1word(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean wrap_word) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)mledit_set_wrap_word(widget, wrap_word);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TMledit_mledit_1set_1max_1lines(JNIEnv* env,  jclass ajc, jlong jwidget, jint max_lines) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)mledit_set_max_lines(widget, max_lines);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TMledit_mledit_1set_1tips(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jtips) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  char* tips = (char*)(*env)->GetStringUTFChars(env, jtips, 0);
  ret = (ret_t)mledit_set_tips(widget, tips);
  (*env)->ReleaseStringUTFChars(env, jtips, tips);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TMledit_mledit_1set_1tr_1tips(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jtr_tips) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* tr_tips = (char*)(*env)->GetStringUTFChars(env, jtr_tips, 0);
  ret = (ret_t)mledit_set_tr_tips(widget, tr_tips);
  (*env)->ReleaseStringUTFChars(env, jtr_tips, tr_tips);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TMledit_mledit_1set_1keyboard(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jkeyboard) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  char* keyboard = (char*)(*env)->GetStringUTFChars(env, jkeyboard, 0);
  ret = (ret_t)mledit_set_keyboard(widget, keyboard);
  (*env)->ReleaseStringUTFChars(env, jkeyboard, keyboard);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TMledit_mledit_1set_1cursor(JNIEnv* env,  jclass ajc, jlong jwidget, jint cursor) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)mledit_set_cursor(widget, cursor);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TMledit_mledit_1set_1scroll_1line(JNIEnv* env,  jclass ajc, jlong jwidget, jint scroll_line) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)mledit_set_scroll_line(widget, scroll_line);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TMledit_mledit_1set_1open_1im_1when_1focused(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean open_im_when_focused) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)mledit_set_open_im_when_focused(widget, open_im_when_focused);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TMledit_mledit_1set_1close_1im_1when_1blured(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean close_im_when_blured) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)mledit_set_close_im_when_blured(widget, close_im_when_blured);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TMledit_mledit_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)mledit_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TMledit_mledit_1t_1get_1prop_1tips(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  mledit_t* obj = (mledit_t*)jobj;

  return (*env)->NewStringUTF(env, obj->tips);
}

JNIEXPORT jstring JNICALL Java_awtk_TMledit_mledit_1t_1get_1prop_1tr_1tips(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  mledit_t* obj = (mledit_t*)jobj;

  return (*env)->NewStringUTF(env, obj->tr_tips);
}

JNIEXPORT jstring JNICALL Java_awtk_TMledit_mledit_1t_1get_1prop_1keyboard(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  mledit_t* obj = (mledit_t*)jobj;

  return (*env)->NewStringUTF(env, obj->keyboard);
}

JNIEXPORT jint JNICALL Java_awtk_TMledit_mledit_1t_1get_1prop_1max_1lines(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  mledit_t* obj = (mledit_t*)jobj;

  return (jint)(obj->max_lines);
}

JNIEXPORT jboolean JNICALL Java_awtk_TMledit_mledit_1t_1get_1prop_1wrap_1word(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  mledit_t* obj = (mledit_t*)jobj;

  return (jboolean)(obj->wrap_word);
}

JNIEXPORT jint JNICALL Java_awtk_TMledit_mledit_1t_1get_1prop_1scroll_1line(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  mledit_t* obj = (mledit_t*)jobj;

  return (jint)(obj->scroll_line);
}

JNIEXPORT jboolean JNICALL Java_awtk_TMledit_mledit_1t_1get_1prop_1readonly(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  mledit_t* obj = (mledit_t*)jobj;

  return (jboolean)(obj->readonly);
}

JNIEXPORT jboolean JNICALL Java_awtk_TMledit_mledit_1t_1get_1prop_1cancelable(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  mledit_t* obj = (mledit_t*)jobj;

  return (jboolean)(obj->cancelable);
}

JNIEXPORT jboolean JNICALL Java_awtk_TMledit_mledit_1t_1get_1prop_1open_1im_1when_1focused(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  mledit_t* obj = (mledit_t*)jobj;

  return (jboolean)(obj->open_im_when_focused);
}

JNIEXPORT jboolean JNICALL Java_awtk_TMledit_mledit_1t_1get_1prop_1close_1im_1when_1blured(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  mledit_t* obj = (mledit_t*)jobj;

  return (jboolean)(obj->close_im_when_blured);
}

JNIEXPORT jlong JNICALL Java_awtk_TProgressCircle_progress_1circle_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)progress_circle_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TProgressCircle_progress_1circle_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)progress_circle_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TProgressCircle_progress_1circle_1set_1value(JNIEnv* env,  jclass ajc, jlong jwidget, jdouble value) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)progress_circle_set_value(widget, value);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TProgressCircle_progress_1circle_1set_1max(JNIEnv* env,  jclass ajc, jlong jwidget, jint max) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)progress_circle_set_max(widget, max);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TProgressCircle_progress_1circle_1set_1line_1width(JNIEnv* env,  jclass ajc, jlong jwidget, jint line_width) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)progress_circle_set_line_width(widget, line_width);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TProgressCircle_progress_1circle_1set_1start_1angle(JNIEnv* env,  jclass ajc, jlong jwidget, jint start_angle) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)progress_circle_set_start_angle(widget, start_angle);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TProgressCircle_progress_1circle_1set_1unit(JNIEnv* env,  jclass ajc, jlong jwidget, jstring junit) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* unit = (char*)(*env)->GetStringUTFChars(env, junit, 0);
  ret = (ret_t)progress_circle_set_unit(widget, unit);
  (*env)->ReleaseStringUTFChars(env, junit, unit);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TProgressCircle_progress_1circle_1set_1line_1cap(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jline_cap) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* line_cap = (char*)(*env)->GetStringUTFChars(env, jline_cap, 0);
  ret = (ret_t)progress_circle_set_line_cap(widget, line_cap);
  (*env)->ReleaseStringUTFChars(env, jline_cap, line_cap);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TProgressCircle_progress_1circle_1set_1show_1text(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean show_text) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)progress_circle_set_show_text(widget, show_text);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TProgressCircle_progress_1circle_1set_1counter_1clock_1wise(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean counter_clock_wise) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)progress_circle_set_counter_clock_wise(widget, counter_clock_wise);

  return (jint)(ret);
}

JNIEXPORT jdouble JNICALL Java_awtk_TProgressCircle_progress_1circle_1t_1get_1prop_1value(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  progress_circle_t* obj = (progress_circle_t*)jobj;

  return (jdouble)(obj->value);
}

JNIEXPORT jint JNICALL Java_awtk_TProgressCircle_progress_1circle_1t_1get_1prop_1max(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  progress_circle_t* obj = (progress_circle_t*)jobj;

  return (jint)(obj->max);
}

JNIEXPORT jint JNICALL Java_awtk_TProgressCircle_progress_1circle_1t_1get_1prop_1start_1angle(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  progress_circle_t* obj = (progress_circle_t*)jobj;

  return (jint)(obj->start_angle);
}

JNIEXPORT jint JNICALL Java_awtk_TProgressCircle_progress_1circle_1t_1get_1prop_1line_1width(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  progress_circle_t* obj = (progress_circle_t*)jobj;

  return (jint)(obj->line_width);
}

JNIEXPORT jstring JNICALL Java_awtk_TProgressCircle_progress_1circle_1t_1get_1prop_1unit(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  progress_circle_t* obj = (progress_circle_t*)jobj;

  return (*env)->NewStringUTF(env, obj->unit);
}

JNIEXPORT jstring JNICALL Java_awtk_TProgressCircle_progress_1circle_1t_1get_1prop_1line_1cap(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  progress_circle_t* obj = (progress_circle_t*)jobj;

  return (*env)->NewStringUTF(env, obj->line_cap);
}

JNIEXPORT jboolean JNICALL Java_awtk_TProgressCircle_progress_1circle_1t_1get_1prop_1counter_1clock_1wise(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  progress_circle_t* obj = (progress_circle_t*)jobj;

  return (jboolean)(obj->counter_clock_wise);
}

JNIEXPORT jboolean JNICALL Java_awtk_TProgressCircle_progress_1circle_1t_1get_1prop_1show_1text(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  progress_circle_t* obj = (progress_circle_t*)jobj;

  return (jboolean)(obj->show_text);
}

JNIEXPORT jlong JNICALL Java_awtk_TRichTextView_rich_1text_1view_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)rich_text_view_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TRichTextView_rich_1text_1view_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)rich_text_view_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TRichText_rich_1text_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)rich_text_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TRichText_rich_1text_1set_1text(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jtext) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  char* text = (char*)(*env)->GetStringUTFChars(env, jtext, 0);
  ret = (ret_t)rich_text_set_text(widget, text);
  (*env)->ReleaseStringUTFChars(env, jtext, text);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TRichText_rich_1text_1set_1yslidable(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean yslidable) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)rich_text_set_yslidable(widget, yslidable);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TRichText_rich_1text_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)rich_text_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TRichText_rich_1text_1t_1get_1prop_1line_1gap(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  rich_text_t* obj = (rich_text_t*)jobj;

  return (jint)(obj->line_gap);
}

JNIEXPORT jboolean JNICALL Java_awtk_TRichText_rich_1text_1t_1get_1prop_1yslidable(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  rich_text_t* obj = (rich_text_t*)jobj;

  return (jboolean)(obj->yslidable);
}

JNIEXPORT jlong JNICALL Java_awtk_THscrollLabel_hscroll_1label_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)hscroll_label_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_THscrollLabel_hscroll_1label_1set_1lull(JNIEnv* env,  jclass ajc, jlong jwidget, jint lull) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)hscroll_label_set_lull(widget, lull);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_THscrollLabel_hscroll_1label_1set_1duration(JNIEnv* env,  jclass ajc, jlong jwidget, jint duration) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)hscroll_label_set_duration(widget, duration);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_THscrollLabel_hscroll_1label_1set_1only_1focus(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean only_focus) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)hscroll_label_set_only_focus(widget, only_focus);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_THscrollLabel_hscroll_1label_1set_1only_1parent_1focus(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean only_parent_focus) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)hscroll_label_set_only_parent_focus(widget, only_parent_focus);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_THscrollLabel_hscroll_1label_1set_1loop(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean loop) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)hscroll_label_set_loop(widget, loop);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_THscrollLabel_hscroll_1label_1set_1yoyo(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean yoyo) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)hscroll_label_set_yoyo(widget, yoyo);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_THscrollLabel_hscroll_1label_1set_1ellipses(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean ellipses) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)hscroll_label_set_ellipses(widget, ellipses);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_THscrollLabel_hscroll_1label_1set_1xoffset(JNIEnv* env,  jclass ajc, jlong jwidget, jint xoffset) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)hscroll_label_set_xoffset(widget, xoffset);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_THscrollLabel_hscroll_1label_1start(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)hscroll_label_start(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_THscrollLabel_hscroll_1label_1stop(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)hscroll_label_stop(widget);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_THscrollLabel_hscroll_1label_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)hscroll_label_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_THscrollLabel_hscroll_1label_1t_1get_1prop_1only_1focus(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  hscroll_label_t* obj = (hscroll_label_t*)jobj;

  return (jboolean)(obj->only_focus);
}

JNIEXPORT jboolean JNICALL Java_awtk_THscrollLabel_hscroll_1label_1t_1get_1prop_1only_1parent_1focus(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  hscroll_label_t* obj = (hscroll_label_t*)jobj;

  return (jboolean)(obj->only_parent_focus);
}

JNIEXPORT jboolean JNICALL Java_awtk_THscrollLabel_hscroll_1label_1t_1get_1prop_1loop(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  hscroll_label_t* obj = (hscroll_label_t*)jobj;

  return (jboolean)(obj->loop);
}

JNIEXPORT jboolean JNICALL Java_awtk_THscrollLabel_hscroll_1label_1t_1get_1prop_1yoyo(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  hscroll_label_t* obj = (hscroll_label_t*)jobj;

  return (jboolean)(obj->yoyo);
}

JNIEXPORT jboolean JNICALL Java_awtk_THscrollLabel_hscroll_1label_1t_1get_1prop_1ellipses(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  hscroll_label_t* obj = (hscroll_label_t*)jobj;

  return (jboolean)(obj->ellipses);
}

JNIEXPORT jint JNICALL Java_awtk_THscrollLabel_hscroll_1label_1t_1get_1prop_1lull(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  hscroll_label_t* obj = (hscroll_label_t*)jobj;

  return (jint)(obj->lull);
}

JNIEXPORT jint JNICALL Java_awtk_THscrollLabel_hscroll_1label_1t_1get_1prop_1duration(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  hscroll_label_t* obj = (hscroll_label_t*)jobj;

  return (jint)(obj->duration);
}

JNIEXPORT jint JNICALL Java_awtk_THscrollLabel_hscroll_1label_1t_1get_1prop_1xoffset(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  hscroll_label_t* obj = (hscroll_label_t*)jobj;

  return (jint)(obj->xoffset);
}

JNIEXPORT jint JNICALL Java_awtk_THscrollLabel_hscroll_1label_1t_1get_1prop_1text_1w(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  hscroll_label_t* obj = (hscroll_label_t*)jobj;

  return (jint)(obj->text_w);
}

JNIEXPORT jlong JNICALL Java_awtk_TListItem_list_1item_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)list_item_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TListItem_list_1item_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)list_item_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TListViewH_list_1view_1h_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)list_view_h_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TListViewH_list_1view_1h_1set_1item_1width(JNIEnv* env,  jclass ajc, jlong jwidget, jint item_width) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)list_view_h_set_item_width(widget, item_width);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TListViewH_list_1view_1h_1set_1spacing(JNIEnv* env,  jclass ajc, jlong jwidget, jint spacing) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)list_view_h_set_spacing(widget, spacing);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TListViewH_list_1view_1h_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)list_view_h_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TListViewH_list_1view_1h_1t_1get_1prop_1item_1width(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  list_view_h_t* obj = (list_view_h_t*)jobj;

  return (jint)(obj->item_width);
}

JNIEXPORT jint JNICALL Java_awtk_TListViewH_list_1view_1h_1t_1get_1prop_1spacing(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  list_view_h_t* obj = (list_view_h_t*)jobj;

  return (jint)(obj->spacing);
}

JNIEXPORT jlong JNICALL Java_awtk_TListView_list_1view_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)list_view_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TListView_list_1view_1set_1item_1height(JNIEnv* env,  jclass ajc, jlong jwidget, jint item_height) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)list_view_set_item_height(widget, item_height);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TListView_list_1view_1set_1default_1item_1height(JNIEnv* env,  jclass ajc, jlong jwidget, jint default_item_height) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)list_view_set_default_item_height(widget, default_item_height);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TListView_list_1view_1set_1auto_1hide_1scroll_1bar(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean auto_hide_scroll_bar) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)list_view_set_auto_hide_scroll_bar(widget, auto_hide_scroll_bar);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TListView_list_1view_1set_1floating_1scroll_1bar(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean floating_scroll_bar) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)list_view_set_floating_scroll_bar(widget, floating_scroll_bar);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TListView_list_1view_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)list_view_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TListView_list_1view_1reinit(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)list_view_reinit(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TListView_list_1view_1t_1get_1prop_1item_1height(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  list_view_t* obj = (list_view_t*)jobj;

  return (jint)(obj->item_height);
}

JNIEXPORT jint JNICALL Java_awtk_TListView_list_1view_1t_1get_1prop_1default_1item_1height(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  list_view_t* obj = (list_view_t*)jobj;

  return (jint)(obj->default_item_height);
}

JNIEXPORT jboolean JNICALL Java_awtk_TListView_list_1view_1t_1get_1prop_1auto_1hide_1scroll_1bar(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  list_view_t* obj = (list_view_t*)jobj;

  return (jboolean)(obj->auto_hide_scroll_bar);
}

JNIEXPORT jboolean JNICALL Java_awtk_TListView_list_1view_1t_1get_1prop_1floating_1scroll_1bar(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  list_view_t* obj = (list_view_t*)jobj;

  return (jboolean)(obj->floating_scroll_bar);
}

JNIEXPORT jlong JNICALL Java_awtk_TScrollBar_scroll_1bar_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)scroll_bar_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TScrollBar_scroll_1bar_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)scroll_bar_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TScrollBar_scroll_1bar_1create_1mobile(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)scroll_bar_create_mobile(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TScrollBar_scroll_1bar_1create_1desktop(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)scroll_bar_create_desktop(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollBar_scroll_1bar_1set_1params(JNIEnv* env,  jclass ajc, jlong jwidget, jint virtual_size, jint row) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)scroll_bar_set_params(widget, virtual_size, row);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollBar_scroll_1bar_1scroll_1to(JNIEnv* env,  jclass ajc, jlong jwidget, jint value, jint duration) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)scroll_bar_scroll_to(widget, value, duration);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollBar_scroll_1bar_1set_1value(JNIEnv* env,  jclass ajc, jlong jwidget, jint value) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)scroll_bar_set_value(widget, value);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollBar_scroll_1bar_1add_1delta(JNIEnv* env,  jclass ajc, jlong jwidget, jint delta) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)scroll_bar_add_delta(widget, delta);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollBar_scroll_1bar_1scroll_1delta(JNIEnv* env,  jclass ajc, jlong jwidget, jint delta) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)scroll_bar_scroll_delta(widget, delta);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollBar_scroll_1bar_1set_1value_1only(JNIEnv* env,  jclass ajc, jlong jwidget, jint value) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)scroll_bar_set_value_only(widget, value);

  return (jint)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TScrollBar_scroll_1bar_1is_1mobile(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  bool_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (bool_t)scroll_bar_is_mobile(widget);

  return (jboolean)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollBar_scroll_1bar_1t_1get_1prop_1virtual_1size(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  scroll_bar_t* obj = (scroll_bar_t*)jobj;

  return (jint)(obj->virtual_size);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollBar_scroll_1bar_1t_1get_1prop_1value(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  scroll_bar_t* obj = (scroll_bar_t*)jobj;

  return (jint)(obj->value);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollBar_scroll_1bar_1t_1get_1prop_1row(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  scroll_bar_t* obj = (scroll_bar_t*)jobj;

  return (jint)(obj->row);
}

JNIEXPORT jboolean JNICALL Java_awtk_TScrollBar_scroll_1bar_1t_1get_1prop_1animatable(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  scroll_bar_t* obj = (scroll_bar_t*)jobj;

  return (jboolean)(obj->animatable);
}

JNIEXPORT jlong JNICALL Java_awtk_TScrollView_scroll_1view_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)scroll_view_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TScrollView_scroll_1view_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)scroll_view_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollView_scroll_1view_1set_1virtual_1w(JNIEnv* env,  jclass ajc, jlong jwidget, jint w) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)scroll_view_set_virtual_w(widget, w);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollView_scroll_1view_1set_1virtual_1h(JNIEnv* env,  jclass ajc, jlong jwidget, jint h) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)scroll_view_set_virtual_h(widget, h);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollView_scroll_1view_1set_1xslidable(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean xslidable) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)scroll_view_set_xslidable(widget, xslidable);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollView_scroll_1view_1set_1yslidable(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean yslidable) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)scroll_view_set_yslidable(widget, yslidable);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollView_scroll_1view_1set_1snap_1to_1page(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean snap_to_page) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)scroll_view_set_snap_to_page(widget, snap_to_page);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollView_scroll_1view_1set_1move_1to_1page(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean move_to_page) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)scroll_view_set_move_to_page(widget, move_to_page);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollView_scroll_1view_1set_1recursive(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean recursive) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)scroll_view_set_recursive(widget, recursive);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollView_scroll_1view_1set_1recursive_1only(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean recursive) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)scroll_view_set_recursive_only(widget, recursive);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollView_scroll_1view_1set_1offset(JNIEnv* env,  jclass ajc, jlong jwidget, jint xoffset, jint yoffset) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)scroll_view_set_offset(widget, xoffset, yoffset);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollView_scroll_1view_1set_1speed_1scale(JNIEnv* env,  jclass ajc, jlong jwidget, jdouble xspeed_scale, jdouble yspeed_scale) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)scroll_view_set_speed_scale(widget, xspeed_scale, yspeed_scale);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollView_scroll_1view_1scroll_1to(JNIEnv* env,  jclass ajc, jlong jwidget, jint xoffset_end, jint yoffset_end, jint duration) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)scroll_view_scroll_to(widget, xoffset_end, yoffset_end, duration);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollView_scroll_1view_1scroll_1delta_1to(JNIEnv* env,  jclass ajc, jlong jwidget, jint xoffset_delta, jint yoffset_delta, jint duration) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)scroll_view_scroll_delta_to(widget, xoffset_delta, yoffset_delta, duration);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollView_scroll_1view_1t_1get_1prop_1virtual_1w(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  scroll_view_t* obj = (scroll_view_t*)jobj;

  return (jint)(obj->virtual_w);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollView_scroll_1view_1t_1get_1prop_1virtual_1h(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  scroll_view_t* obj = (scroll_view_t*)jobj;

  return (jint)(obj->virtual_h);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollView_scroll_1view_1t_1get_1prop_1xoffset(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  scroll_view_t* obj = (scroll_view_t*)jobj;

  return (jint)(obj->xoffset);
}

JNIEXPORT jint JNICALL Java_awtk_TScrollView_scroll_1view_1t_1get_1prop_1yoffset(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  scroll_view_t* obj = (scroll_view_t*)jobj;

  return (jint)(obj->yoffset);
}

JNIEXPORT jdouble JNICALL Java_awtk_TScrollView_scroll_1view_1t_1get_1prop_1xspeed_1scale(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  scroll_view_t* obj = (scroll_view_t*)jobj;

  return (jdouble)(obj->xspeed_scale);
}

JNIEXPORT jdouble JNICALL Java_awtk_TScrollView_scroll_1view_1t_1get_1prop_1yspeed_1scale(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  scroll_view_t* obj = (scroll_view_t*)jobj;

  return (jdouble)(obj->yspeed_scale);
}

JNIEXPORT jboolean JNICALL Java_awtk_TScrollView_scroll_1view_1t_1get_1prop_1xslidable(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  scroll_view_t* obj = (scroll_view_t*)jobj;

  return (jboolean)(obj->xslidable);
}

JNIEXPORT jboolean JNICALL Java_awtk_TScrollView_scroll_1view_1t_1get_1prop_1yslidable(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  scroll_view_t* obj = (scroll_view_t*)jobj;

  return (jboolean)(obj->yslidable);
}

JNIEXPORT jboolean JNICALL Java_awtk_TScrollView_scroll_1view_1t_1get_1prop_1snap_1to_1page(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  scroll_view_t* obj = (scroll_view_t*)jobj;

  return (jboolean)(obj->snap_to_page);
}

JNIEXPORT jboolean JNICALL Java_awtk_TScrollView_scroll_1view_1t_1get_1prop_1move_1to_1page(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  scroll_view_t* obj = (scroll_view_t*)jobj;

  return (jboolean)(obj->move_to_page);
}

JNIEXPORT jboolean JNICALL Java_awtk_TScrollView_scroll_1view_1t_1get_1prop_1recursive(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  scroll_view_t* obj = (scroll_view_t*)jobj;

  return (jboolean)(obj->recursive);
}

JNIEXPORT jlong JNICALL Java_awtk_TSlideMenu_slide_1menu_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)slide_menu_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TSlideMenu_slide_1menu_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)slide_menu_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideMenu_slide_1menu_1set_1value(JNIEnv* env,  jclass ajc, jlong jwidget, jint value) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)slide_menu_set_value(widget, value);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideMenu_slide_1menu_1set_1align_1v(JNIEnv* env,  jclass ajc, jlong jwidget, jint align_v) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)slide_menu_set_align_v(widget, align_v);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideMenu_slide_1menu_1set_1min_1scale(JNIEnv* env,  jclass ajc, jlong jwidget, jdouble min_scale) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)slide_menu_set_min_scale(widget, min_scale);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideMenu_slide_1menu_1t_1get_1prop_1value(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slide_menu_t* obj = (slide_menu_t*)jobj;

  return (jint)(obj->value);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideMenu_slide_1menu_1t_1get_1prop_1align_1v(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slide_menu_t* obj = (slide_menu_t*)jobj;

  return (jint)(obj->align_v);
}

JNIEXPORT jdouble JNICALL Java_awtk_TSlideMenu_slide_1menu_1t_1get_1prop_1min_1scale(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slide_menu_t* obj = (slide_menu_t*)jobj;

  return (jdouble)(obj->min_scale);
}

JNIEXPORT jlong JNICALL Java_awtk_TSlideIndicator_slide_1indicator_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)slide_indicator_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TSlideIndicator_slide_1indicator_1create_1linear(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)slide_indicator_create_linear(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TSlideIndicator_slide_1indicator_1create_1arc(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)slide_indicator_create_arc(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TSlideIndicator_slide_1indicator_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)slide_indicator_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideIndicator_slide_1indicator_1set_1value(JNIEnv* env,  jclass ajc, jlong jwidget, jint value) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)slide_indicator_set_value(widget, value);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideIndicator_slide_1indicator_1set_1max(JNIEnv* env,  jclass ajc, jlong jwidget, jint max) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)slide_indicator_set_max(widget, max);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideIndicator_slide_1indicator_1set_1default_1paint(JNIEnv* env,  jclass ajc, jlong jwidget, jint default_paint) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)slide_indicator_set_default_paint(widget, default_paint);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideIndicator_slide_1indicator_1set_1auto_1hide(JNIEnv* env,  jclass ajc, jlong jwidget, jint auto_hide) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)slide_indicator_set_auto_hide(widget, auto_hide);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideIndicator_slide_1indicator_1set_1margin(JNIEnv* env,  jclass ajc, jlong jwidget, jint margin) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)slide_indicator_set_margin(widget, margin);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideIndicator_slide_1indicator_1set_1spacing(JNIEnv* env,  jclass ajc, jlong jwidget, jdouble spacing) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)slide_indicator_set_spacing(widget, spacing);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideIndicator_slide_1indicator_1set_1size(JNIEnv* env,  jclass ajc, jlong jwidget, jint size) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)slide_indicator_set_size(widget, size);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideIndicator_slide_1indicator_1set_1anchor(JNIEnv* env,  jclass ajc, jlong jwidget, jstring janchor_x, jstring janchor_y) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* anchor_x = (char*)(*env)->GetStringUTFChars(env, janchor_x, 0);
  const char* anchor_y = (char*)(*env)->GetStringUTFChars(env, janchor_y, 0);
  ret = (ret_t)slide_indicator_set_anchor(widget, anchor_x, anchor_y);
  (*env)->ReleaseStringUTFChars(env, janchor_x, anchor_x);
  (*env)->ReleaseStringUTFChars(env, janchor_y, anchor_y);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideIndicator_slide_1indicator_1set_1indicated_1target(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jtarget_name) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* target_name = (char*)(*env)->GetStringUTFChars(env, jtarget_name, 0);
  ret = (ret_t)slide_indicator_set_indicated_target(widget, target_name);
  (*env)->ReleaseStringUTFChars(env, jtarget_name, target_name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideIndicator_slide_1indicator_1t_1get_1prop_1value(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slide_indicator_t* obj = (slide_indicator_t*)jobj;

  return (jint)(obj->value);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideIndicator_slide_1indicator_1t_1get_1prop_1max(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slide_indicator_t* obj = (slide_indicator_t*)jobj;

  return (jint)(obj->max);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideIndicator_slide_1indicator_1t_1get_1prop_1default_1paint(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slide_indicator_t* obj = (slide_indicator_t*)jobj;

  return (jint)(obj->default_paint);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideIndicator_slide_1indicator_1t_1get_1prop_1auto_1hide(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slide_indicator_t* obj = (slide_indicator_t*)jobj;

  return (jint)(obj->auto_hide);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideIndicator_slide_1indicator_1t_1get_1prop_1margin(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slide_indicator_t* obj = (slide_indicator_t*)jobj;

  return (jint)(obj->margin);
}

JNIEXPORT jdouble JNICALL Java_awtk_TSlideIndicator_slide_1indicator_1t_1get_1prop_1spacing(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slide_indicator_t* obj = (slide_indicator_t*)jobj;

  return (jdouble)(obj->spacing);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideIndicator_slide_1indicator_1t_1get_1prop_1size(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slide_indicator_t* obj = (slide_indicator_t*)jobj;

  return (jint)(obj->size);
}

JNIEXPORT jdouble JNICALL Java_awtk_TSlideIndicator_slide_1indicator_1t_1get_1prop_1anchor_1x(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slide_indicator_t* obj = (slide_indicator_t*)jobj;

  return (jdouble)(obj->anchor_x);
}

JNIEXPORT jdouble JNICALL Java_awtk_TSlideIndicator_slide_1indicator_1t_1get_1prop_1anchor_1y(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slide_indicator_t* obj = (slide_indicator_t*)jobj;

  return (jdouble)(obj->anchor_y);
}

JNIEXPORT jstring JNICALL Java_awtk_TSlideIndicator_slide_1indicator_1t_1get_1prop_1indicated_1target(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slide_indicator_t* obj = (slide_indicator_t*)jobj;

  return (*env)->NewStringUTF(env, obj->indicated_target);
}

JNIEXPORT jlong JNICALL Java_awtk_TSlideView_slide_1view_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)slide_view_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TSlideView_slide_1view_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)slide_view_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideView_slide_1view_1set_1auto_1play(JNIEnv* env,  jclass ajc, jlong jwidget, jint auto_play) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)slide_view_set_auto_play(widget, auto_play);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideView_slide_1view_1set_1active(JNIEnv* env,  jclass ajc, jlong jwidget, jint index) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)slide_view_set_active(widget, index);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideView_slide_1view_1set_1active_1ex(JNIEnv* env,  jclass ajc, jlong jwidget, jint index, jboolean animate) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)slide_view_set_active_ex(widget, index, animate);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideView_slide_1view_1set_1vertical(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean vertical) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)slide_view_set_vertical(widget, vertical);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideView_slide_1view_1set_1anim_1hint(JNIEnv* env,  jclass ajc, jlong jwidget, jstring janim_hint) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* anim_hint = (char*)(*env)->GetStringUTFChars(env, janim_hint, 0);
  ret = (ret_t)slide_view_set_anim_hint(widget, anim_hint);
  (*env)->ReleaseStringUTFChars(env, janim_hint, anim_hint);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideView_slide_1view_1set_1loop(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean loop) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)slide_view_set_loop(widget, loop);

  return (jint)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TSlideView_slide_1view_1t_1get_1prop_1vertical(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slide_view_t* obj = (slide_view_t*)jobj;

  return (jboolean)(obj->vertical);
}

JNIEXPORT jint JNICALL Java_awtk_TSlideView_slide_1view_1t_1get_1prop_1auto_1play(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slide_view_t* obj = (slide_view_t*)jobj;

  return (jint)(obj->auto_play);
}

JNIEXPORT jboolean JNICALL Java_awtk_TSlideView_slide_1view_1t_1get_1prop_1loop(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slide_view_t* obj = (slide_view_t*)jobj;

  return (jboolean)(obj->loop);
}

JNIEXPORT jstring JNICALL Java_awtk_TSlideView_slide_1view_1t_1get_1prop_1anim_1hint(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slide_view_t* obj = (slide_view_t*)jobj;

  return (*env)->NewStringUTF(env, obj->anim_hint);
}

JNIEXPORT jlong JNICALL Java_awtk_TSwitch_switch_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)switch_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSwitch_switch_1set_1value(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean value) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)switch_set_value(widget, value);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TSwitch_switch_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)switch_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TSwitch_switch_1t_1get_1prop_1value(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  switch_t* obj = (switch_t*)jobj;

  return (jboolean)(obj->value);
}

JNIEXPORT jdouble JNICALL Java_awtk_TSwitch_switch_1t_1get_1prop_1max_1xoffset_1ratio(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  switch_t* obj = (switch_t*)jobj;

  return (jdouble)(obj->max_xoffset_ratio);
}

JNIEXPORT jlong JNICALL Java_awtk_TTextSelector_text_1selector_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)text_selector_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TTextSelector_text_1selector_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)text_selector_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTextSelector_text_1selector_1reset_1options(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)text_selector_reset_options(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTextSelector_text_1selector_1count_1options(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  int32_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (int32_t)text_selector_count_options(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTextSelector_text_1selector_1append_1option(JNIEnv* env,  jclass ajc, jlong jwidget, jint value, jstring jtext) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  char* text = (char*)(*env)->GetStringUTFChars(env, jtext, 0);
  ret = (ret_t)text_selector_append_option(widget, value, text);
  (*env)->ReleaseStringUTFChars(env, jtext, text);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTextSelector_text_1selector_1set_1options(JNIEnv* env,  jclass ajc, jlong jwidget, jstring joptions) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  char* options = (char*)(*env)->GetStringUTFChars(env, joptions, 0);
  ret = (ret_t)text_selector_set_options(widget, options);
  (*env)->ReleaseStringUTFChars(env, joptions, options);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTextSelector_text_1selector_1set_1range_1options_1ex(JNIEnv* env,  jclass ajc, jlong jwidget, jint start, jint nr, jint step, jstring jformat) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* format = (char*)(*env)->GetStringUTFChars(env, jformat, 0);
  ret = (ret_t)text_selector_set_range_options_ex(widget, start, nr, step, format);
  (*env)->ReleaseStringUTFChars(env, jformat, format);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTextSelector_text_1selector_1set_1range_1options(JNIEnv* env,  jclass ajc, jlong jwidget, jint start, jint nr, jint step) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)text_selector_set_range_options(widget, start, nr, step);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTextSelector_text_1selector_1get_1value(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  int32_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (int32_t)text_selector_get_value(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTextSelector_text_1selector_1set_1value(JNIEnv* env,  jclass ajc, jlong jwidget, jint value) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)text_selector_set_value(widget, value);

  return (jint)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TTextSelector_text_1selector_1get_1text(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  const char* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (const char*)text_selector_get_text(widget);

  return (*env)->NewStringUTF(env, ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTextSelector_text_1selector_1set_1text(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jtext) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* text = (char*)(*env)->GetStringUTFChars(env, jtext, 0);
  ret = (ret_t)text_selector_set_text(widget, text);
  (*env)->ReleaseStringUTFChars(env, jtext, text);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTextSelector_text_1selector_1set_1selected_1index(JNIEnv* env,  jclass ajc, jlong jwidget, jint index) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)text_selector_set_selected_index(widget, index);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTextSelector_text_1selector_1set_1visible_1nr(JNIEnv* env,  jclass ajc, jlong jwidget, jint visible_nr) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)text_selector_set_visible_nr(widget, visible_nr);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTextSelector_text_1selector_1set_1localize_1options(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean localize_options) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)text_selector_set_localize_options(widget, localize_options);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTextSelector_text_1selector_1set_1loop_1options(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean loop_options) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)text_selector_set_loop_options(widget, loop_options);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTextSelector_text_1selector_1set_1yspeed_1scale(JNIEnv* env,  jclass ajc, jlong jwidget, jdouble yspeed_scale) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)text_selector_set_yspeed_scale(widget, yspeed_scale);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTextSelector_text_1selector_1t_1get_1prop_1visible_1nr(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  text_selector_t* obj = (text_selector_t*)jobj;

  return (jint)(obj->visible_nr);
}

JNIEXPORT jint JNICALL Java_awtk_TTextSelector_text_1selector_1t_1get_1prop_1selected_1index(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  text_selector_t* obj = (text_selector_t*)jobj;

  return (jint)(obj->selected_index);
}

JNIEXPORT jstring JNICALL Java_awtk_TTextSelector_text_1selector_1t_1get_1prop_1options(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  text_selector_t* obj = (text_selector_t*)jobj;

  return (*env)->NewStringUTF(env, obj->options);
}

JNIEXPORT jdouble JNICALL Java_awtk_TTextSelector_text_1selector_1t_1get_1prop_1yspeed_1scale(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  text_selector_t* obj = (text_selector_t*)jobj;

  return (jdouble)(obj->yspeed_scale);
}

JNIEXPORT jboolean JNICALL Java_awtk_TTextSelector_text_1selector_1t_1get_1prop_1localize_1options(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  text_selector_t* obj = (text_selector_t*)jobj;

  return (jboolean)(obj->localize_options);
}

JNIEXPORT jboolean JNICALL Java_awtk_TTextSelector_text_1selector_1t_1get_1prop_1loop_1options(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  text_selector_t* obj = (text_selector_t*)jobj;

  return (jboolean)(obj->loop_options);
}

JNIEXPORT jlong JNICALL Java_awtk_TTimeClock_time_1clock_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)time_clock_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TTimeClock_time_1clock_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)time_clock_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTimeClock_time_1clock_1set_1hour(JNIEnv* env,  jclass ajc, jlong jwidget, jint hour) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)time_clock_set_hour(widget, hour);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTimeClock_time_1clock_1set_1minute(JNIEnv* env,  jclass ajc, jlong jwidget, jint minute) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)time_clock_set_minute(widget, minute);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTimeClock_time_1clock_1set_1second(JNIEnv* env,  jclass ajc, jlong jwidget, jint second) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)time_clock_set_second(widget, second);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTimeClock_time_1clock_1set_1hour_1image(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jhour) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* hour = (char*)(*env)->GetStringUTFChars(env, jhour, 0);
  ret = (ret_t)time_clock_set_hour_image(widget, hour);
  (*env)->ReleaseStringUTFChars(env, jhour, hour);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTimeClock_time_1clock_1set_1minute_1image(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jminute_image) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* minute_image = (char*)(*env)->GetStringUTFChars(env, jminute_image, 0);
  ret = (ret_t)time_clock_set_minute_image(widget, minute_image);
  (*env)->ReleaseStringUTFChars(env, jminute_image, minute_image);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTimeClock_time_1clock_1set_1second_1image(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jsecond_image) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* second_image = (char*)(*env)->GetStringUTFChars(env, jsecond_image, 0);
  ret = (ret_t)time_clock_set_second_image(widget, second_image);
  (*env)->ReleaseStringUTFChars(env, jsecond_image, second_image);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTimeClock_time_1clock_1set_1bg_1image(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jbg_image) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* bg_image = (char*)(*env)->GetStringUTFChars(env, jbg_image, 0);
  ret = (ret_t)time_clock_set_bg_image(widget, bg_image);
  (*env)->ReleaseStringUTFChars(env, jbg_image, bg_image);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTimeClock_time_1clock_1set_1image(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jimage) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* image = (char*)(*env)->GetStringUTFChars(env, jimage, 0);
  ret = (ret_t)time_clock_set_image(widget, image);
  (*env)->ReleaseStringUTFChars(env, jimage, image);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTimeClock_time_1clock_1set_1hour_1anchor(JNIEnv* env,  jclass ajc, jlong jwidget, jstring janchor_x, jstring janchor_y) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* anchor_x = (char*)(*env)->GetStringUTFChars(env, janchor_x, 0);
  const char* anchor_y = (char*)(*env)->GetStringUTFChars(env, janchor_y, 0);
  ret = (ret_t)time_clock_set_hour_anchor(widget, anchor_x, anchor_y);
  (*env)->ReleaseStringUTFChars(env, janchor_x, anchor_x);
  (*env)->ReleaseStringUTFChars(env, janchor_y, anchor_y);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTimeClock_time_1clock_1set_1minute_1anchor(JNIEnv* env,  jclass ajc, jlong jwidget, jstring janchor_x, jstring janchor_y) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* anchor_x = (char*)(*env)->GetStringUTFChars(env, janchor_x, 0);
  const char* anchor_y = (char*)(*env)->GetStringUTFChars(env, janchor_y, 0);
  ret = (ret_t)time_clock_set_minute_anchor(widget, anchor_x, anchor_y);
  (*env)->ReleaseStringUTFChars(env, janchor_x, anchor_x);
  (*env)->ReleaseStringUTFChars(env, janchor_y, anchor_y);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTimeClock_time_1clock_1set_1second_1anchor(JNIEnv* env,  jclass ajc, jlong jwidget, jstring janchor_x, jstring janchor_y) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* anchor_x = (char*)(*env)->GetStringUTFChars(env, janchor_x, 0);
  const char* anchor_y = (char*)(*env)->GetStringUTFChars(env, janchor_y, 0);
  ret = (ret_t)time_clock_set_second_anchor(widget, anchor_x, anchor_y);
  (*env)->ReleaseStringUTFChars(env, janchor_x, anchor_x);
  (*env)->ReleaseStringUTFChars(env, janchor_y, anchor_y);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTimeClock_time_1clock_1t_1get_1prop_1hour(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  time_clock_t* obj = (time_clock_t*)jobj;

  return (jint)(obj->hour);
}

JNIEXPORT jint JNICALL Java_awtk_TTimeClock_time_1clock_1t_1get_1prop_1minute(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  time_clock_t* obj = (time_clock_t*)jobj;

  return (jint)(obj->minute);
}

JNIEXPORT jint JNICALL Java_awtk_TTimeClock_time_1clock_1t_1get_1prop_1second(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  time_clock_t* obj = (time_clock_t*)jobj;

  return (jint)(obj->second);
}

JNIEXPORT jstring JNICALL Java_awtk_TTimeClock_time_1clock_1t_1get_1prop_1image(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  time_clock_t* obj = (time_clock_t*)jobj;

  return (*env)->NewStringUTF(env, obj->image);
}

JNIEXPORT jstring JNICALL Java_awtk_TTimeClock_time_1clock_1t_1get_1prop_1bg_1image(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  time_clock_t* obj = (time_clock_t*)jobj;

  return (*env)->NewStringUTF(env, obj->bg_image);
}

JNIEXPORT jstring JNICALL Java_awtk_TTimeClock_time_1clock_1t_1get_1prop_1hour_1image(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  time_clock_t* obj = (time_clock_t*)jobj;

  return (*env)->NewStringUTF(env, obj->hour_image);
}

JNIEXPORT jstring JNICALL Java_awtk_TTimeClock_time_1clock_1t_1get_1prop_1minute_1image(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  time_clock_t* obj = (time_clock_t*)jobj;

  return (*env)->NewStringUTF(env, obj->minute_image);
}

JNIEXPORT jstring JNICALL Java_awtk_TTimeClock_time_1clock_1t_1get_1prop_1second_1image(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  time_clock_t* obj = (time_clock_t*)jobj;

  return (*env)->NewStringUTF(env, obj->second_image);
}

JNIEXPORT jstring JNICALL Java_awtk_TTimeClock_time_1clock_1t_1get_1prop_1hour_1anchor_1x(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  time_clock_t* obj = (time_clock_t*)jobj;

  return (*env)->NewStringUTF(env, obj->hour_anchor_x);
}

JNIEXPORT jstring JNICALL Java_awtk_TTimeClock_time_1clock_1t_1get_1prop_1hour_1anchor_1y(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  time_clock_t* obj = (time_clock_t*)jobj;

  return (*env)->NewStringUTF(env, obj->hour_anchor_y);
}

JNIEXPORT jstring JNICALL Java_awtk_TTimeClock_time_1clock_1t_1get_1prop_1minute_1anchor_1x(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  time_clock_t* obj = (time_clock_t*)jobj;

  return (*env)->NewStringUTF(env, obj->minute_anchor_x);
}

JNIEXPORT jstring JNICALL Java_awtk_TTimeClock_time_1clock_1t_1get_1prop_1minute_1anchor_1y(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  time_clock_t* obj = (time_clock_t*)jobj;

  return (*env)->NewStringUTF(env, obj->minute_anchor_y);
}

JNIEXPORT jstring JNICALL Java_awtk_TTimeClock_time_1clock_1t_1get_1prop_1second_1anchor_1x(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  time_clock_t* obj = (time_clock_t*)jobj;

  return (*env)->NewStringUTF(env, obj->second_anchor_x);
}

JNIEXPORT jstring JNICALL Java_awtk_TTimeClock_time_1clock_1t_1get_1prop_1second_1anchor_1y(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  time_clock_t* obj = (time_clock_t*)jobj;

  return (*env)->NewStringUTF(env, obj->second_anchor_y);
}

JNIEXPORT jlong JNICALL Java_awtk_TPropChangeEvent_prop_1change_1event_1cast(JNIEnv* env,  jclass ajc, jlong jevent) { /*func*/
  prop_change_event_t* ret;
  event_t* event = (event_t*)jevent;
  ret = (prop_change_event_t*)prop_change_event_cast(event);

  return (jlong)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TPropChangeEvent_prop_1change_1event_1t_1get_1prop_1name(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  prop_change_event_t* obj = (prop_change_event_t*)jobj;

  return (*env)->NewStringUTF(env, obj->name);
}

JNIEXPORT jlong JNICALL Java_awtk_TPropChangeEvent_prop_1change_1event_1t_1get_1prop_1value(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  prop_change_event_t* obj = (prop_change_event_t*)jobj;

  return (jlong)(obj->value);
}

JNIEXPORT jlong JNICALL Java_awtk_TProgressEvent_progress_1event_1cast(JNIEnv* env,  jclass ajc, jlong jevent) { /*func*/
  progress_event_t* ret;
  event_t* event = (event_t*)jevent;
  ret = (progress_event_t*)progress_event_cast(event);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TProgressEvent_progress_1event_1t_1get_1prop_1percent(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  progress_event_t* obj = (progress_event_t*)jobj;

  return (jint)(obj->percent);
}

JNIEXPORT jlong JNICALL Java_awtk_TDoneEvent_done_1event_1cast(JNIEnv* env,  jclass ajc, jlong jevent) { /*func*/
  done_event_t* ret;
  event_t* event = (event_t*)jevent;
  ret = (done_event_t*)done_event_cast(event);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDoneEvent_done_1event_1t_1get_1prop_1result(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  done_event_t* obj = (done_event_t*)jobj;

  return (jint)(obj->result);
}

JNIEXPORT jlong JNICALL Java_awtk_TErrorEvent_error_1event_1cast(JNIEnv* env,  jclass ajc, jlong jevent) { /*func*/
  error_event_t* ret;
  event_t* event = (event_t*)jevent;
  ret = (error_event_t*)error_event_cast(event);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TErrorEvent_error_1event_1t_1get_1prop_1code(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  error_event_t* obj = (error_event_t*)jobj;

  return (jint)(obj->code);
}

JNIEXPORT jstring JNICALL Java_awtk_TErrorEvent_error_1event_1t_1get_1prop_1message(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  error_event_t* obj = (error_event_t*)jobj;

  return (*env)->NewStringUTF(env, obj->message);
}

JNIEXPORT jlong JNICALL Java_awtk_TCmdExecEvent_cmd_1exec_1event_1cast(JNIEnv* env,  jclass ajc, jlong jevent) { /*func*/
  cmd_exec_event_t* ret;
  event_t* event = (event_t*)jevent;
  ret = (cmd_exec_event_t*)cmd_exec_event_cast(event);

  return (jlong)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TCmdExecEvent_cmd_1exec_1event_1t_1get_1prop_1name(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  cmd_exec_event_t* obj = (cmd_exec_event_t*)jobj;

  return (*env)->NewStringUTF(env, obj->name);
}

JNIEXPORT jstring JNICALL Java_awtk_TCmdExecEvent_cmd_1exec_1event_1t_1get_1prop_1args(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  cmd_exec_event_t* obj = (cmd_exec_event_t*)jobj;

  return (*env)->NewStringUTF(env, obj->args);
}

JNIEXPORT jint JNICALL Java_awtk_TCmdExecEvent_cmd_1exec_1event_1t_1get_1prop_1result(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  cmd_exec_event_t* obj = (cmd_exec_event_t*)jobj;

  return (jint)(obj->result);
}

JNIEXPORT jboolean JNICALL Java_awtk_TCmdExecEvent_cmd_1exec_1event_1t_1get_1prop_1can_1exec(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  cmd_exec_event_t* obj = (cmd_exec_event_t*)jobj;

  return (jboolean)(obj->can_exec);
}

JNIEXPORT jlong JNICALL Java_awtk_TAppBar_app_1bar_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)app_bar_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TAppBar_app_1bar_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)app_bar_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TButtonGroup_button_1group_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)button_group_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TButtonGroup_button_1group_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)button_group_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TButton_button_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)button_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TButton_button_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)button_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TButton_button_1set_1repeat(JNIEnv* env,  jclass ajc, jlong jwidget, jint repeat) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)button_set_repeat(widget, repeat);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TButton_button_1set_1long_1press_1time(JNIEnv* env,  jclass ajc, jlong jwidget, jint long_press_time) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)button_set_long_press_time(widget, long_press_time);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TButton_button_1set_1enable_1long_1press(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean enable_long_press) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)button_set_enable_long_press(widget, enable_long_press);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TButton_button_1t_1get_1prop_1repeat(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  button_t* obj = (button_t*)jobj;

  return (jint)(obj->repeat);
}

JNIEXPORT jboolean JNICALL Java_awtk_TButton_button_1t_1get_1prop_1enable_1long_1press(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  button_t* obj = (button_t*)jobj;

  return (jboolean)(obj->enable_long_press);
}

JNIEXPORT jint JNICALL Java_awtk_TButton_button_1t_1get_1prop_1long_1press_1time(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  button_t* obj = (button_t*)jobj;

  return (jint)(obj->long_press_time);
}

JNIEXPORT jlong JNICALL Java_awtk_TCheckButton_check_1button_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)check_button_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TCheckButton_check_1button_1create_1radio(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)check_button_create_radio(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TCheckButton_check_1button_1set_1value(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean value) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)check_button_set_value(widget, value);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TCheckButton_check_1button_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)check_button_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TCheckButton_check_1button_1t_1get_1prop_1value(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  check_button_t* obj = (check_button_t*)jobj;

  return (jboolean)(obj->value);
}

JNIEXPORT jlong JNICALL Java_awtk_TClipView_clip_1view_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)clip_view_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TClipView_clip_1view_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)clip_view_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TColorTile_color_1tile_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)color_tile_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TColorTile_color_1tile_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)color_tile_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TColorTile_color_1tile_1set_1bg_1color(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jcolor) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* color = (char*)(*env)->GetStringUTFChars(env, jcolor, 0);
  ret = (ret_t)color_tile_set_bg_color(widget, color);
  (*env)->ReleaseStringUTFChars(env, jcolor, color);

  return (jint)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TColorTile_color_1tile_1t_1get_1prop_1bg_1color(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  color_tile_t* obj = (color_tile_t*)jobj;

  return (*env)->NewStringUTF(env, obj->bg_color);
}

JNIEXPORT jstring JNICALL Java_awtk_TColorTile_color_1tile_1t_1get_1prop_1border_1color(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  color_tile_t* obj = (color_tile_t*)jobj;

  return (*env)->NewStringUTF(env, obj->border_color);
}

JNIEXPORT jlong JNICALL Java_awtk_TColumn_column_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)column_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TColumn_column_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)column_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TComboBoxItem_combo_1box_1item_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)combo_box_item_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TComboBoxItem_combo_1box_1item_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)combo_box_item_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TComboBoxItem_combo_1box_1item_1set_1checked(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean checked) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)combo_box_item_set_checked(widget, checked);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TComboBoxItem_combo_1box_1item_1set_1value(JNIEnv* env,  jclass ajc, jlong jwidget, jint value) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)combo_box_item_set_value(widget, value);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TComboBoxItem_combo_1box_1item_1t_1get_1prop_1value(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  combo_box_item_t* obj = (combo_box_item_t*)jobj;

  return (jint)(obj->value);
}

JNIEXPORT jboolean JNICALL Java_awtk_TComboBoxItem_combo_1box_1item_1t_1get_1prop_1checked(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  combo_box_item_t* obj = (combo_box_item_t*)jobj;

  return (jboolean)(obj->checked);
}

JNIEXPORT jlong JNICALL Java_awtk_TDialogClient_dialog_1client_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)dialog_client_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TDialogClient_dialog_1client_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)dialog_client_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TDialogTitle_dialog_1title_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)dialog_title_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TDialogTitle_dialog_1title_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)dialog_title_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TDigitClock_digit_1clock_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)digit_clock_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TDigitClock_digit_1clock_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)digit_clock_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDigitClock_digit_1clock_1set_1format(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jformat) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* format = (char*)(*env)->GetStringUTFChars(env, jformat, 0);
  ret = (ret_t)digit_clock_set_format(widget, format);
  (*env)->ReleaseStringUTFChars(env, jformat, format);

  return (jint)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TDigitClock_digit_1clock_1t_1get_1prop_1format(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  digit_clock_t* obj = (digit_clock_t*)jobj;

  return (*env)->NewStringUTF(env, obj->format);
}

JNIEXPORT jlong JNICALL Java_awtk_TDragger_dragger_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)dragger_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TDragger_dragger_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)dragger_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDragger_dragger_1set_1range(JNIEnv* env,  jclass ajc, jlong jwidget, jint x_min, jint y_min, jint x_max, jint y_max) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)dragger_set_range(widget, x_min, y_min, x_max, y_max);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDragger_dragger_1t_1get_1prop_1x_1min(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  dragger_t* obj = (dragger_t*)jobj;

  return (jint)(obj->x_min);
}

JNIEXPORT jint JNICALL Java_awtk_TDragger_dragger_1t_1get_1prop_1y_1min(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  dragger_t* obj = (dragger_t*)jobj;

  return (jint)(obj->y_min);
}

JNIEXPORT jint JNICALL Java_awtk_TDragger_dragger_1t_1get_1prop_1x_1max(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  dragger_t* obj = (dragger_t*)jobj;

  return (jint)(obj->x_max);
}

JNIEXPORT jint JNICALL Java_awtk_TDragger_dragger_1t_1get_1prop_1y_1max(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  dragger_t* obj = (dragger_t*)jobj;

  return (jint)(obj->y_max);
}

JNIEXPORT jlong JNICALL Java_awtk_TEdit_edit_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)edit_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TEdit_edit_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)edit_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEdit_edit_1get_1int(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  int32_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (int32_t)edit_get_int(widget);

  return (jint)(ret);
}

JNIEXPORT jdouble JNICALL Java_awtk_TEdit_edit_1get_1double(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  double ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (double)edit_get_double(widget);

  return (jdouble)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEdit_edit_1set_1int(JNIEnv* env,  jclass ajc, jlong jwidget, jint value) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)edit_set_int(widget, value);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEdit_edit_1set_1double(JNIEnv* env,  jclass ajc, jlong jwidget, jdouble value) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)edit_set_double(widget, value);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEdit_edit_1set_1text_1limit(JNIEnv* env,  jclass ajc, jlong jwidget, jint min, jint max) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)edit_set_text_limit(widget, min, max);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEdit_edit_1set_1int_1limit(JNIEnv* env,  jclass ajc, jlong jwidget, jint min, jint max, jint step) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)edit_set_int_limit(widget, min, max, step);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEdit_edit_1set_1float_1limit(JNIEnv* env,  jclass ajc, jlong jwidget, jdouble min, jdouble max, jdouble step) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)edit_set_float_limit(widget, min, max, step);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEdit_edit_1set_1readonly(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean readonly) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)edit_set_readonly(widget, readonly);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEdit_edit_1set_1cancelable(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean cancelable) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)edit_set_cancelable(widget, cancelable);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEdit_edit_1set_1auto_1fix(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean auto_fix) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)edit_set_auto_fix(widget, auto_fix);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEdit_edit_1set_1select_1none_1when_1focused(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean select_none_when_focused) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)edit_set_select_none_when_focused(widget, select_none_when_focused);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEdit_edit_1set_1open_1im_1when_1focused(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean open_im_when_focused) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)edit_set_open_im_when_focused(widget, open_im_when_focused);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEdit_edit_1set_1close_1im_1when_1blured(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean close_im_when_blured) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)edit_set_close_im_when_blured(widget, close_im_when_blured);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEdit_edit_1set_1input_1type(JNIEnv* env,  jclass ajc, jlong jwidget, jint type) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)edit_set_input_type(widget, type);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEdit_edit_1set_1action_1text(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jaction_text) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  char* action_text = (char*)(*env)->GetStringUTFChars(env, jaction_text, 0);
  ret = (ret_t)edit_set_action_text(widget, action_text);
  (*env)->ReleaseStringUTFChars(env, jaction_text, action_text);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEdit_edit_1set_1tips(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jtips) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  char* tips = (char*)(*env)->GetStringUTFChars(env, jtips, 0);
  ret = (ret_t)edit_set_tips(widget, tips);
  (*env)->ReleaseStringUTFChars(env, jtips, tips);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEdit_edit_1set_1tr_1tips(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jtr_tips) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* tr_tips = (char*)(*env)->GetStringUTFChars(env, jtr_tips, 0);
  ret = (ret_t)edit_set_tr_tips(widget, tr_tips);
  (*env)->ReleaseStringUTFChars(env, jtr_tips, tr_tips);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEdit_edit_1set_1keyboard(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jkeyboard) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  char* keyboard = (char*)(*env)->GetStringUTFChars(env, jkeyboard, 0);
  ret = (ret_t)edit_set_keyboard(widget, keyboard);
  (*env)->ReleaseStringUTFChars(env, jkeyboard, keyboard);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEdit_edit_1set_1password_1visible(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean password_visible) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)edit_set_password_visible(widget, password_visible);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEdit_edit_1set_1focus(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean focus) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)edit_set_focus(widget, focus);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TEdit_edit_1set_1cursor(JNIEnv* env,  jclass ajc, jlong jwidget, jint cursor) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)edit_set_cursor(widget, cursor);

  return (jint)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TEdit_edit_1t_1get_1prop_1tips(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  edit_t* obj = (edit_t*)jobj;

  return (*env)->NewStringUTF(env, obj->tips);
}

JNIEXPORT jstring JNICALL Java_awtk_TEdit_edit_1t_1get_1prop_1tr_1tips(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  edit_t* obj = (edit_t*)jobj;

  return (*env)->NewStringUTF(env, obj->tr_tips);
}

JNIEXPORT jstring JNICALL Java_awtk_TEdit_edit_1t_1get_1prop_1action_1text(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  edit_t* obj = (edit_t*)jobj;

  return (*env)->NewStringUTF(env, obj->action_text);
}

JNIEXPORT jstring JNICALL Java_awtk_TEdit_edit_1t_1get_1prop_1keyboard(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  edit_t* obj = (edit_t*)jobj;

  return (*env)->NewStringUTF(env, obj->keyboard);
}

JNIEXPORT jdouble JNICALL Java_awtk_TEdit_edit_1t_1get_1prop_1min(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  edit_t* obj = (edit_t*)jobj;

  return (jdouble)(obj->min);
}

JNIEXPORT jdouble JNICALL Java_awtk_TEdit_edit_1t_1get_1prop_1max(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  edit_t* obj = (edit_t*)jobj;

  return (jdouble)(obj->max);
}

JNIEXPORT jdouble JNICALL Java_awtk_TEdit_edit_1t_1get_1prop_1step(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  edit_t* obj = (edit_t*)jobj;

  return (jdouble)(obj->step);
}

JNIEXPORT jint JNICALL Java_awtk_TEdit_edit_1t_1get_1prop_1input_1type(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  edit_t* obj = (edit_t*)jobj;

  return (jint)(obj->input_type);
}

JNIEXPORT jboolean JNICALL Java_awtk_TEdit_edit_1t_1get_1prop_1readonly(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  edit_t* obj = (edit_t*)jobj;

  return (jboolean)(obj->readonly);
}

JNIEXPORT jboolean JNICALL Java_awtk_TEdit_edit_1t_1get_1prop_1password_1visible(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  edit_t* obj = (edit_t*)jobj;

  return (jboolean)(obj->password_visible);
}

JNIEXPORT jboolean JNICALL Java_awtk_TEdit_edit_1t_1get_1prop_1auto_1fix(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  edit_t* obj = (edit_t*)jobj;

  return (jboolean)(obj->auto_fix);
}

JNIEXPORT jboolean JNICALL Java_awtk_TEdit_edit_1t_1get_1prop_1select_1none_1when_1focused(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  edit_t* obj = (edit_t*)jobj;

  return (jboolean)(obj->select_none_when_focused);
}

JNIEXPORT jboolean JNICALL Java_awtk_TEdit_edit_1t_1get_1prop_1open_1im_1when_1focused(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  edit_t* obj = (edit_t*)jobj;

  return (jboolean)(obj->open_im_when_focused);
}

JNIEXPORT jboolean JNICALL Java_awtk_TEdit_edit_1t_1get_1prop_1close_1im_1when_1blured(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  edit_t* obj = (edit_t*)jobj;

  return (jboolean)(obj->close_im_when_blured);
}

JNIEXPORT jboolean JNICALL Java_awtk_TEdit_edit_1t_1get_1prop_1cancelable(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  edit_t* obj = (edit_t*)jobj;

  return (jboolean)(obj->cancelable);
}

JNIEXPORT jlong JNICALL Java_awtk_TGridItem_grid_1item_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)grid_item_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TGridItem_grid_1item_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)grid_item_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TGrid_grid_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)grid_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TGrid_grid_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)grid_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TGroupBox_group_1box_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)group_box_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TGroupBox_group_1box_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)group_box_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TLabel_label_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)label_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TLabel_label_1set_1length(JNIEnv* env,  jclass ajc, jlong jwidget, jint length) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)label_set_length(widget, length);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TLabel_label_1set_1line_1wrap(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean line_wrap) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)label_set_line_wrap(widget, line_wrap);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TLabel_label_1set_1word_1wrap(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean word_wrap) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)label_set_word_wrap(widget, word_wrap);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TLabel_label_1resize_1to_1content(JNIEnv* env,  jclass ajc, jlong jwidget, jint min_w, jint max_w, jint min_h, jint max_h) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)label_resize_to_content(widget, min_w, max_w, min_h, max_h);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TLabel_label_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)label_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TLabel_label_1t_1get_1prop_1length(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  label_t* obj = (label_t*)jobj;

  return (jint)(obj->length);
}

JNIEXPORT jboolean JNICALL Java_awtk_TLabel_label_1t_1get_1prop_1line_1wrap(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  label_t* obj = (label_t*)jobj;

  return (jboolean)(obj->line_wrap);
}

JNIEXPORT jboolean JNICALL Java_awtk_TLabel_label_1t_1get_1prop_1word_1wrap(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  label_t* obj = (label_t*)jobj;

  return (jboolean)(obj->word_wrap);
}

JNIEXPORT jlong JNICALL Java_awtk_TPages_pages_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)pages_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TPages_pages_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)pages_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TPages_pages_1set_1active(JNIEnv* env,  jclass ajc, jlong jwidget, jint index) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)pages_set_active(widget, index);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TPages_pages_1set_1active_1by_1name(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)pages_set_active_by_name(widget, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TPages_pages_1t_1get_1prop_1active(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  pages_t* obj = (pages_t*)jobj;

  return (jint)(obj->active);
}

JNIEXPORT jlong JNICALL Java_awtk_TProgressBar_progress_1bar_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)progress_bar_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TProgressBar_progress_1bar_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)progress_bar_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TProgressBar_progress_1bar_1set_1value(JNIEnv* env,  jclass ajc, jlong jwidget, jdouble value) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)progress_bar_set_value(widget, value);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TProgressBar_progress_1bar_1set_1max(JNIEnv* env,  jclass ajc, jlong jwidget, jint max) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)progress_bar_set_max(widget, max);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TProgressBar_progress_1bar_1set_1vertical(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean vertical) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)progress_bar_set_vertical(widget, vertical);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TProgressBar_progress_1bar_1set_1show_1text(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean show_text) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)progress_bar_set_show_text(widget, show_text);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TProgressBar_progress_1bar_1set_1reverse(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean reverse) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)progress_bar_set_reverse(widget, reverse);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TProgressBar_progress_1bar_1get_1percent(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  uint32_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (uint32_t)progress_bar_get_percent(widget);

  return (jint)(ret);
}

JNIEXPORT jdouble JNICALL Java_awtk_TProgressBar_progress_1bar_1t_1get_1prop_1value(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  progress_bar_t* obj = (progress_bar_t*)jobj;

  return (jdouble)(obj->value);
}

JNIEXPORT jdouble JNICALL Java_awtk_TProgressBar_progress_1bar_1t_1get_1prop_1max(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  progress_bar_t* obj = (progress_bar_t*)jobj;

  return (jdouble)(obj->max);
}

JNIEXPORT jboolean JNICALL Java_awtk_TProgressBar_progress_1bar_1t_1get_1prop_1vertical(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  progress_bar_t* obj = (progress_bar_t*)jobj;

  return (jboolean)(obj->vertical);
}

JNIEXPORT jboolean JNICALL Java_awtk_TProgressBar_progress_1bar_1t_1get_1prop_1show_1text(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  progress_bar_t* obj = (progress_bar_t*)jobj;

  return (jboolean)(obj->show_text);
}

JNIEXPORT jboolean JNICALL Java_awtk_TProgressBar_progress_1bar_1t_1get_1prop_1reverse(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  progress_bar_t* obj = (progress_bar_t*)jobj;

  return (jboolean)(obj->reverse);
}

JNIEXPORT jlong JNICALL Java_awtk_TRow_row_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)row_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TRow_row_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)row_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TSlider_slider_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)slider_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TSlider_slider_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)slider_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlider_slider_1set_1value(JNIEnv* env,  jclass ajc, jlong jwidget, jdouble value) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)slider_set_value(widget, value);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlider_slider_1set_1min(JNIEnv* env,  jclass ajc, jlong jwidget, jdouble min) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)slider_set_min(widget, min);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlider_slider_1set_1max(JNIEnv* env,  jclass ajc, jlong jwidget, jdouble max) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)slider_set_max(widget, max);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlider_slider_1set_1step(JNIEnv* env,  jclass ajc, jlong jwidget, jdouble step) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)slider_set_step(widget, step);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlider_slider_1set_1bar_1size(JNIEnv* env,  jclass ajc, jlong jwidget, jint bar_size) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)slider_set_bar_size(widget, bar_size);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSlider_slider_1set_1vertical(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean vertical) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)slider_set_vertical(widget, vertical);

  return (jint)(ret);
}

JNIEXPORT jdouble JNICALL Java_awtk_TSlider_slider_1t_1get_1prop_1value(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slider_t* obj = (slider_t*)jobj;

  return (jdouble)(obj->value);
}

JNIEXPORT jdouble JNICALL Java_awtk_TSlider_slider_1t_1get_1prop_1min(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slider_t* obj = (slider_t*)jobj;

  return (jdouble)(obj->min);
}

JNIEXPORT jdouble JNICALL Java_awtk_TSlider_slider_1t_1get_1prop_1max(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slider_t* obj = (slider_t*)jobj;

  return (jdouble)(obj->max);
}

JNIEXPORT jdouble JNICALL Java_awtk_TSlider_slider_1t_1get_1prop_1step(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slider_t* obj = (slider_t*)jobj;

  return (jdouble)(obj->step);
}

JNIEXPORT jboolean JNICALL Java_awtk_TSlider_slider_1t_1get_1prop_1vertical(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slider_t* obj = (slider_t*)jobj;

  return (jboolean)(obj->vertical);
}

JNIEXPORT jint JNICALL Java_awtk_TSlider_slider_1t_1get_1prop_1bar_1size(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slider_t* obj = (slider_t*)jobj;

  return (jint)(obj->bar_size);
}

JNIEXPORT jint JNICALL Java_awtk_TSlider_slider_1t_1get_1prop_1dragger_1size(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slider_t* obj = (slider_t*)jobj;

  return (jint)(obj->dragger_size);
}

JNIEXPORT jboolean JNICALL Java_awtk_TSlider_slider_1t_1get_1prop_1dragger_1adapt_1to_1icon(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slider_t* obj = (slider_t*)jobj;

  return (jboolean)(obj->dragger_adapt_to_icon);
}

JNIEXPORT jboolean JNICALL Java_awtk_TSlider_slider_1t_1get_1prop_1slide_1with_1bar(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  slider_t* obj = (slider_t*)jobj;

  return (jboolean)(obj->slide_with_bar);
}

JNIEXPORT jlong JNICALL Java_awtk_TTabButtonGroup_tab_1button_1group_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)tab_button_group_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTabButtonGroup_tab_1button_1group_1set_1compact(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean compact) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)tab_button_group_set_compact(widget, compact);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTabButtonGroup_tab_1button_1group_1set_1scrollable(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean scrollable) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)tab_button_group_set_scrollable(widget, scrollable);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TTabButtonGroup_tab_1button_1group_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)tab_button_group_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TTabButtonGroup_tab_1button_1group_1t_1get_1prop_1compact(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  tab_button_group_t* obj = (tab_button_group_t*)jobj;

  return (jboolean)(obj->compact);
}

JNIEXPORT jboolean JNICALL Java_awtk_TTabButtonGroup_tab_1button_1group_1t_1get_1prop_1scrollable(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  tab_button_group_t* obj = (tab_button_group_t*)jobj;

  return (jboolean)(obj->scrollable);
}

JNIEXPORT jlong JNICALL Java_awtk_TTabButton_tab_1button_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)tab_button_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TTabButton_tab_1button_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)tab_button_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTabButton_tab_1button_1set_1value(JNIEnv* env,  jclass ajc, jlong jwidget, jint value) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)tab_button_set_value(widget, value);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTabButton_tab_1button_1set_1icon(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)tab_button_set_icon(widget, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTabButton_tab_1button_1set_1active_1icon(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)tab_button_set_active_icon(widget, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TTabButton_tab_1button_1set_1load_1ui(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)tab_button_set_load_ui(widget, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TTabButton_tab_1button_1t_1get_1prop_1value(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  tab_button_t* obj = (tab_button_t*)jobj;

  return (jboolean)(obj->value);
}

JNIEXPORT jstring JNICALL Java_awtk_TTabButton_tab_1button_1t_1get_1prop_1load_1ui(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  tab_button_t* obj = (tab_button_t*)jobj;

  return (*env)->NewStringUTF(env, obj->load_ui);
}

JNIEXPORT jstring JNICALL Java_awtk_TTabButton_tab_1button_1t_1get_1prop_1active_1icon(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  tab_button_t* obj = (tab_button_t*)jobj;

  return (*env)->NewStringUTF(env, obj->active_icon);
}

JNIEXPORT jstring JNICALL Java_awtk_TTabButton_tab_1button_1t_1get_1prop_1icon(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  tab_button_t* obj = (tab_button_t*)jobj;

  return (*env)->NewStringUTF(env, obj->icon);
}

JNIEXPORT jlong JNICALL Java_awtk_TTabControl_tab_1control_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)tab_control_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TTabControl_tab_1control_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)tab_control_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TView_view_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)view_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TView_view_1set_1default_1focused_1child(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jdefault_focused_child) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* default_focused_child = (char*)(*env)->GetStringUTFChars(env, jdefault_focused_child, 0);
  ret = (ret_t)view_set_default_focused_child(widget, default_focused_child);
  (*env)->ReleaseStringUTFChars(env, jdefault_focused_child, default_focused_child);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TView_view_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)view_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TView_view_1t_1get_1prop_1default_1focused_1child(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  view_t* obj = (view_t*)jobj;

  return (*env)->NewStringUTF(env, obj->default_focused_child);
}

JNIEXPORT jlong JNICALL Java_awtk_TDialog_dialog_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)dialog_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TDialog_dialog_1create_1simple(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)dialog_create_simple(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TDialog_dialog_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)dialog_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TDialog_dialog_1get_1title(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)dialog_get_title(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TDialog_dialog_1get_1client(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)dialog_get_client(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TDialog_dialog_1open(JNIEnv* env,  jclass ajc, jstring jname) { /*func*/
  widget_t* ret;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (widget_t*)dialog_open(name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDialog_dialog_1set_1title(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jtitle) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  char* title = (char*)(*env)->GetStringUTFChars(env, jtitle, 0);
  ret = (ret_t)dialog_set_title(widget, title);
  (*env)->ReleaseStringUTFChars(env, jtitle, title);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDialog_dialog_1modal(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  dialog_quit_code_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (dialog_quit_code_t)dialog_modal(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDialog_dialog_1quit(JNIEnv* env,  jclass ajc, jlong jwidget, jint code) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)dialog_quit(widget, code);

  return (jint)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TDialog_dialog_1is_1quited(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  bool_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (bool_t)dialog_is_quited(widget);

  return (jboolean)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TDialog_dialog_1is_1modal(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  bool_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (bool_t)dialog_is_modal(widget);

  return (jboolean)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDialog_dialog_1toast(JNIEnv* env,  jclass ajc, jstring jtext, jint duration) { /*func*/
  ret_t ret;
  const char* text = (char*)(*env)->GetStringUTFChars(env, jtext, 0);
  ret = (ret_t)dialog_toast(text, duration);
  (*env)->ReleaseStringUTFChars(env, jtext, text);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDialog_dialog_1info(JNIEnv* env,  jclass ajc, jstring jtitle, jstring jtext) { /*func*/
  ret_t ret;
  const char* title = (char*)(*env)->GetStringUTFChars(env, jtitle, 0);
  const char* text = (char*)(*env)->GetStringUTFChars(env, jtext, 0);
  ret = (ret_t)dialog_info(title, text);
  (*env)->ReleaseStringUTFChars(env, jtitle, title);
  (*env)->ReleaseStringUTFChars(env, jtext, text);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDialog_dialog_1warn(JNIEnv* env,  jclass ajc, jstring jtitle, jstring jtext) { /*func*/
  ret_t ret;
  const char* title = (char*)(*env)->GetStringUTFChars(env, jtitle, 0);
  const char* text = (char*)(*env)->GetStringUTFChars(env, jtext, 0);
  ret = (ret_t)dialog_warn(title, text);
  (*env)->ReleaseStringUTFChars(env, jtitle, title);
  (*env)->ReleaseStringUTFChars(env, jtext, text);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TDialog_dialog_1confirm(JNIEnv* env,  jclass ajc, jstring jtitle, jstring jtext) { /*func*/
  ret_t ret;
  const char* title = (char*)(*env)->GetStringUTFChars(env, jtitle, 0);
  const char* text = (char*)(*env)->GetStringUTFChars(env, jtext, 0);
  ret = (ret_t)dialog_confirm(title, text);
  (*env)->ReleaseStringUTFChars(env, jtitle, title);
  (*env)->ReleaseStringUTFChars(env, jtext, text);

  return (jint)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TDialog_dialog_1t_1get_1prop_1highlight(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  dialog_t* obj = (dialog_t*)jobj;

  return (*env)->NewStringUTF(env, obj->highlight);
}

JNIEXPORT jint JNICALL Java_awtk_TNativeWindow_native_1window_1move(JNIEnv* env,  jclass ajc, jlong jwin, jint x, jint y, jboolean force) { /*func*/
  ret_t ret;
  native_window_t* win = (native_window_t*)jwin;
  ret = (ret_t)native_window_move(win, x, y, force);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TNativeWindow_native_1window_1resize(JNIEnv* env,  jclass ajc, jlong jwin, jint w, jint h, jboolean force) { /*func*/
  ret_t ret;
  native_window_t* win = (native_window_t*)jwin;
  ret = (ret_t)native_window_resize(win, w, h, force);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TNativeWindow_native_1window_1minimize(JNIEnv* env,  jclass ajc, jlong jwin) { /*func*/
  ret_t ret;
  native_window_t* win = (native_window_t*)jwin;
  ret = (ret_t)native_window_minimize(win);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TNativeWindow_native_1window_1maximize(JNIEnv* env,  jclass ajc, jlong jwin) { /*func*/
  ret_t ret;
  native_window_t* win = (native_window_t*)jwin;
  ret = (ret_t)native_window_maximize(win);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TNativeWindow_native_1window_1restore(JNIEnv* env,  jclass ajc, jlong jwin) { /*func*/
  ret_t ret;
  native_window_t* win = (native_window_t*)jwin;
  ret = (ret_t)native_window_restore(win);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TNativeWindow_native_1window_1center(JNIEnv* env,  jclass ajc, jlong jwin) { /*func*/
  ret_t ret;
  native_window_t* win = (native_window_t*)jwin;
  ret = (ret_t)native_window_center(win);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TNativeWindow_native_1window_1show_1border(JNIEnv* env,  jclass ajc, jlong jwin, jboolean show) { /*func*/
  ret_t ret;
  native_window_t* win = (native_window_t*)jwin;
  ret = (ret_t)native_window_show_border(win, show);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TNativeWindow_native_1window_1set_1fullscreen(JNIEnv* env,  jclass ajc, jlong jwin, jboolean fullscreen) { /*func*/
  ret_t ret;
  native_window_t* win = (native_window_t*)jwin;
  ret = (ret_t)native_window_set_fullscreen(win, fullscreen);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TNativeWindow_native_1window_1set_1cursor(JNIEnv* env,  jclass ajc, jlong jwin, jstring jname, jlong jimg) { /*func*/
  ret_t ret;
  native_window_t* win = (native_window_t*)jwin;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  bitmap_t* img = (bitmap_t*)jimg;
  ret = (ret_t)native_window_set_cursor(win, name, img);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TWindow_window_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)window_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TWindow_window_1create_1default(JNIEnv* env,  jclass ajc) { /*func*/
  widget_t* ret;
  ret = (widget_t*)window_create_default();

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWindow_window_1set_1fullscreen(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean fullscreen) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)window_set_fullscreen(widget, fullscreen);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWindow_window_1set_1auto_1scale_1children(JNIEnv* env,  jclass ajc, jlong jwidget, jint design_w, jint design_h) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)window_set_auto_scale_children(widget, design_w, design_h);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TWindow_window_1open(JNIEnv* env,  jclass ajc, jstring jname) { /*func*/
  widget_t* ret;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (widget_t*)window_open(name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TWindow_window_1open_1and_1close(JNIEnv* env,  jclass ajc, jstring jname, jlong jto_close) { /*func*/
  widget_t* ret;
  const char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  widget_t* to_close = (widget_t*)jto_close;
  ret = (widget_t*)window_open_and_close(name, to_close);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWindow_window_1close(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)window_close(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TWindow_window_1close_1force(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)window_close_force(widget);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TWindow_window_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)window_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TWindow_window_1t_1get_1prop_1fullscreen(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  window_t* obj = (window_t*)jobj;

  return (jboolean)(obj->fullscreen);
}

JNIEXPORT jlong JNICALL Java_awtk_TGifImage_gif_1image_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)gif_image_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TGifImage_gif_1image_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)gif_image_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TKeyboard_keyboard_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)keyboard_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TKeyboard_keyboard_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)keyboard_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TSvgImage_svg_1image_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)svg_image_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TSvgImage_svg_1image_1set_1image(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jname) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  char* name = (char*)(*env)->GetStringUTFChars(env, jname, 0);
  ret = (ret_t)svg_image_set_image(widget, name);
  (*env)->ReleaseStringUTFChars(env, jname, name);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TSvgImage_svg_1image_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)svg_image_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TIdleInfo_idle_1info_1cast(JNIEnv* env,  jclass ajc, jlong jidle) { /*func*/
  idle_info_t* ret;
  idle_info_t* idle = (idle_info_t*)jidle;
  ret = (idle_info_t*)idle_info_cast(idle);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TIdleInfo_idle_1info_1t_1get_1prop_1ctx(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  idle_info_t* obj = (idle_info_t*)jobj;

  return (jlong)(obj->ctx);
}

JNIEXPORT jint JNICALL Java_awtk_TIdleInfo_idle_1info_1t_1get_1prop_1id(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  idle_info_t* obj = (idle_info_t*)jobj;

  return (jint)(obj->id);
}

JNIEXPORT jlong JNICALL Java_awtk_TObjectArray_object_1array_1create(JNIEnv* env,  jclass ajc) { /*func*/
  object_t* ret;
  ret = (object_t*)object_array_create();

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObjectArray_object_1array_1clear_1props(JNIEnv* env,  jclass ajc, jlong jobj) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  ret = (ret_t)object_array_clear_props(obj);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObjectArray_object_1array_1insert(JNIEnv* env,  jclass ajc, jlong jobj, jint index, jlong jv) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const value_t* v = (const value_t*)jv;
  ret = (ret_t)object_array_insert(obj, index, v);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObjectArray_object_1array_1push(JNIEnv* env,  jclass ajc, jlong jobj, jlong jv) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  const value_t* v = (const value_t*)jv;
  ret = (ret_t)object_array_push(obj, v);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObjectArray_object_1array_1remove(JNIEnv* env,  jclass ajc, jlong jobj, jint index) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  ret = (ret_t)object_array_remove(obj, index);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObjectArray_object_1array_1t_1get_1prop_1size(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  object_array_t* obj = (object_array_t*)jobj;

  return (jint)(obj->size);
}

JNIEXPORT jlong JNICALL Java_awtk_TObjectDefault_object_1default_1create(JNIEnv* env,  jclass ajc) { /*func*/
  object_t* ret;
  ret = (object_t*)object_default_create();

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObjectDefault_object_1default_1clear_1props(JNIEnv* env,  jclass ajc, jlong jobj) { /*func*/
  ret_t ret;
  object_t* obj = (object_t*)jobj;
  ret = (ret_t)object_default_clear_props(obj);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TObjectDefault_object_1default_1t_1get_1prop_1props_1size(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  object_default_t* obj = (object_default_t*)jobj;

  return (jint)(obj->props_size);
}

JNIEXPORT jlong JNICALL Java_awtk_TTimerInfo_timer_1info_1cast(JNIEnv* env,  jclass ajc, jlong jtimer) { /*func*/
  timer_info_t* ret;
  timer_info_t* timer = (timer_info_t*)jtimer;
  ret = (timer_info_t*)timer_info_cast(timer);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TTimerInfo_timer_1info_1t_1get_1prop_1ctx(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  timer_info_t* obj = (timer_info_t*)jobj;

  return (jlong)(obj->ctx);
}

JNIEXPORT jint JNICALL Java_awtk_TTimerInfo_timer_1info_1t_1get_1prop_1id(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  timer_info_t* obj = (timer_info_t*)jobj;

  return (jint)(obj->id);
}

JNIEXPORT jlong JNICALL Java_awtk_TTimerInfo_timer_1info_1t_1get_1prop_1now(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  timer_info_t* obj = (timer_info_t*)jobj;

  return (jlong)(obj->now);
}

JNIEXPORT jlong JNICALL Java_awtk_TCalibrationWin_calibration_1win_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)calibration_win_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TComboBox_combo_1box_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)combo_box_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TComboBox_combo_1box_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)combo_box_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TComboBox_combo_1box_1set_1open_1window(JNIEnv* env,  jclass ajc, jlong jwidget, jstring jopen_window) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* open_window = (char*)(*env)->GetStringUTFChars(env, jopen_window, 0);
  ret = (ret_t)combo_box_set_open_window(widget, open_window);
  (*env)->ReleaseStringUTFChars(env, jopen_window, open_window);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TComboBox_combo_1box_1reset_1options(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)combo_box_reset_options(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TComboBox_combo_1box_1count_1options(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  int32_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (int32_t)combo_box_count_options(widget);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TComboBox_combo_1box_1set_1selected_1index(JNIEnv* env,  jclass ajc, jlong jwidget, jint index) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)combo_box_set_selected_index(widget, index);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TComboBox_combo_1box_1set_1localize_1options(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean localize_options) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)combo_box_set_localize_options(widget, localize_options);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TComboBox_combo_1box_1set_1value(JNIEnv* env,  jclass ajc, jlong jwidget, jint value) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)combo_box_set_value(widget, value);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TComboBox_combo_1box_1set_1item_1height(JNIEnv* env,  jclass ajc, jlong jwidget, jint item_height) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)combo_box_set_item_height(widget, item_height);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TComboBox_combo_1box_1append_1option(JNIEnv* env,  jclass ajc, jlong jwidget, jint value, jstring jtext) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* text = (char*)(*env)->GetStringUTFChars(env, jtext, 0);
  ret = (ret_t)combo_box_append_option(widget, value, text);
  (*env)->ReleaseStringUTFChars(env, jtext, text);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TComboBox_combo_1box_1set_1options(JNIEnv* env,  jclass ajc, jlong jwidget, jstring joptions) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  const char* options = (char*)(*env)->GetStringUTFChars(env, joptions, 0);
  ret = (ret_t)combo_box_set_options(widget, options);
  (*env)->ReleaseStringUTFChars(env, joptions, options);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TComboBox_combo_1box_1get_1value(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  int32_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (int32_t)combo_box_get_value(widget);

  return (jint)(ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TComboBox_combo_1box_1get_1text(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  const char* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (const char*)combo_box_get_text(widget);

  return (*env)->NewStringUTF(env, ret);
}

JNIEXPORT jstring JNICALL Java_awtk_TComboBox_combo_1box_1t_1get_1prop_1open_1window(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  combo_box_t* obj = (combo_box_t*)jobj;

  return (*env)->NewStringUTF(env, obj->open_window);
}

JNIEXPORT jint JNICALL Java_awtk_TComboBox_combo_1box_1t_1get_1prop_1selected_1index(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  combo_box_t* obj = (combo_box_t*)jobj;

  return (jint)(obj->selected_index);
}

JNIEXPORT jint JNICALL Java_awtk_TComboBox_combo_1box_1t_1get_1prop_1value(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  combo_box_t* obj = (combo_box_t*)jobj;

  return (jint)(obj->value);
}

JNIEXPORT jboolean JNICALL Java_awtk_TComboBox_combo_1box_1t_1get_1prop_1localize_1options(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  combo_box_t* obj = (combo_box_t*)jobj;

  return (jboolean)(obj->localize_options);
}

JNIEXPORT jstring JNICALL Java_awtk_TComboBox_combo_1box_1t_1get_1prop_1options(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  combo_box_t* obj = (combo_box_t*)jobj;

  return (*env)->NewStringUTF(env, obj->options);
}

JNIEXPORT jint JNICALL Java_awtk_TComboBox_combo_1box_1t_1get_1prop_1item_1height(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  combo_box_t* obj = (combo_box_t*)jobj;

  return (jint)(obj->item_height);
}

JNIEXPORT jlong JNICALL Java_awtk_TImage_image_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)image_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImage_image_1set_1draw_1type(JNIEnv* env,  jclass ajc, jlong jwidget, jint draw_type) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)image_set_draw_type(widget, draw_type);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TImage_image_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)image_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TImage_image_1t_1get_1prop_1draw_1type(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  image_t* obj = (image_t*)jobj;

  return (jint)(obj->draw_type);
}

JNIEXPORT jlong JNICALL Java_awtk_TOverlay_overlay_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)overlay_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TOverlay_overlay_1set_1click_1through(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean click_through) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)overlay_set_click_through(widget, click_through);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TOverlay_overlay_1set_1always_1on_1top(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean always_on_top) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)overlay_set_always_on_top(widget, always_on_top);

  return (jint)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TOverlay_overlay_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)overlay_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TOverlay_overlay_1t_1get_1prop_1click_1through(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  overlay_t* obj = (overlay_t*)jobj;

  return (jboolean)(obj->click_through);
}

JNIEXPORT jboolean JNICALL Java_awtk_TOverlay_overlay_1t_1get_1prop_1always_1on_1top(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  overlay_t* obj = (overlay_t*)jobj;

  return (jboolean)(obj->always_on_top);
}

JNIEXPORT jlong JNICALL Java_awtk_TPopup_popup_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)popup_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TPopup_popup_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)popup_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TPopup_popup_1set_1close_1when_1click(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean close_when_click) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)popup_set_close_when_click(widget, close_when_click);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TPopup_popup_1set_1close_1when_1click_1outside(JNIEnv* env,  jclass ajc, jlong jwidget, jboolean close_when_click_outside) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)popup_set_close_when_click_outside(widget, close_when_click_outside);

  return (jint)(ret);
}

JNIEXPORT jint JNICALL Java_awtk_TPopup_popup_1set_1close_1when_1timeout(JNIEnv* env,  jclass ajc, jlong jwidget, jint close_when_timeout) { /*func*/
  ret_t ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (ret_t)popup_set_close_when_timeout(widget, close_when_timeout);

  return (jint)(ret);
}

JNIEXPORT jboolean JNICALL Java_awtk_TPopup_popup_1t_1get_1prop_1close_1when_1click(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  popup_t* obj = (popup_t*)jobj;

  return (jboolean)(obj->close_when_click);
}

JNIEXPORT jboolean JNICALL Java_awtk_TPopup_popup_1t_1get_1prop_1close_1when_1click_1outside(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  popup_t* obj = (popup_t*)jobj;

  return (jboolean)(obj->close_when_click_outside);
}

JNIEXPORT jint JNICALL Java_awtk_TPopup_popup_1t_1get_1prop_1close_1when_1timeout(JNIEnv* env,  jclass ajc, jlong jobj) {/*get*/
  popup_t* obj = (popup_t*)jobj;

  return (jint)(obj->close_when_timeout);
}

JNIEXPORT jlong JNICALL Java_awtk_TSpinBox_spin_1box_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)spin_box_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TSpinBox_spin_1box_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)spin_box_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TSystemBar_system_1bar_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)system_bar_create(parent, x, y, w, h);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TSystemBar_system_1bar_1cast(JNIEnv* env,  jclass ajc, jlong jwidget) { /*func*/
  widget_t* ret;
  widget_t* widget = (widget_t*)jwidget;
  ret = (widget_t*)system_bar_cast(widget);

  return (jlong)(ret);
}

JNIEXPORT jlong JNICALL Java_awtk_TComboBoxEx_combo_1box_1ex_1create(JNIEnv* env,  jclass ajc, jlong jparent, jint x, jint y, jint w, jint h) { /*func*/
  widget_t* ret;
  widget_t* parent = (widget_t*)jparent;
  ret = (widget_t*)combo_box_ex_create(parent, x, y, w, h);

  return (jlong)(ret);
}

