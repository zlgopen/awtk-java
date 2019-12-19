#include "awtk.h"

extern ret_t assets_init(void);

JNIEXPORT jint JNICALL Java_awtk_AWTK_init(JNIEnv* env, jclass ajc, jint w, jint h,
                                           jint app_type) { /*func*/
  tk_init(w, h, APP_SIMULATOR, "AWTK-JAVA", NULL);

  assets_init();

  return RET_OK;
}

JNIEXPORT jint JNICALL Java_awtk_AWTK_run(JNIEnv* env, jclass ajc) { /*func*/
  return (jint)tk_run();
}

/////////////////////////////////////////////////////////////////////////

typedef struct _async_callback_info_t {
  JNIEnv* env;
  jobject obj;
  char func[TK_NAME_LEN + 1];
} async_callback_info_t;

static async_callback_info_t* async_callback_info_create(JNIEnv* env, jobject obj,
                                                         const char* name) {
  async_callback_info_t* info = TKMEM_ZALLOC(async_callback_info_t);
  return_value_if_fail(info != NULL, NULL);

  info->env = env;
  info->obj = (*env)->NewGlobalRef(env, obj);
  tk_strncpy(info->func, name, TK_NAME_LEN);

  return info;
}

static int async_callback_info_call(async_callback_info_t* info, void* data) {
  JNIEnv* env = info->env;
  jclass cls = (*env)->GetObjectClass(env, info->obj);
  jmethodID mid = (*env)->GetMethodID(env, cls, info->func, "(J)I");
  return_value_if_fail(cls != NULL && mid != NULL, RET_BAD_PARAMS);

  return (*env)->CallIntMethod(env, info->obj, mid, data);
}

static ret_t async_callback_info_destroy(async_callback_info_t* info) {
  return_value_if_fail(info != NULL, RET_BAD_PARAMS);

  (*(info->env))->DeleteGlobalRef(info->env, info->obj);

  TKMEM_FREE(info);

  return RET_OK;
}

static ret_t emitter_item_on_destroy(void* data) {
  emitter_item_t* item = (emitter_item_t*)data;

  async_callback_info_destroy((async_callback_info_t*)(item->ctx));

  return RET_OK;
}

static ret_t idle_info_on_destroy(void* data) {
  idle_info_t* item = (idle_info_t*)data;

  async_callback_info_destroy((async_callback_info_t*)(item->ctx));

  return RET_OK;
}

static ret_t timer_info_on_destroy(void* data) {
  timer_info_t* item = (timer_info_t*)data;

  async_callback_info_destroy((async_callback_info_t*)(item->ctx));

  return RET_OK;
}

static ret_t call_on_event(void* ctx, event_t* e) {
  return async_callback_info_call((async_callback_info_t*)(ctx), e);
}

static ret_t call_on_idle(const idle_info_t* info) {
  return async_callback_info_call((async_callback_info_t*)(info->ctx), (void*)info);
}

static ret_t call_on_timer(const timer_info_t* info) {
  return (ret_t)async_callback_info_call((async_callback_info_t*)(info->ctx), (void*)info);
}

static ret_t call_on_data(void* ctx, const void* data) {
  return (ret_t)async_callback_info_call((async_callback_info_t*)(ctx), (void*)data);
}

JNIEXPORT jint JNICALL Java_awtk_TIdle_idle_1add(JNIEnv* env, jclass ajc, jobject on_idle,
                                                jlong ctx) { /*func*/
  async_callback_info_t* info = async_callback_info_create(env, on_idle, "onIdle");

  uint32_t id = idle_add(call_on_idle, info);
  if (id == TK_INVALID_ID) {
    async_callback_info_destroy(info);
  } else {
    idle_set_on_destroy(id, idle_info_on_destroy, NULL);
  }

  return id;
}

JNIEXPORT jint JNICALL Java_awtk_TTimer_timer_1add(JNIEnv* env, jclass ajc, jobject on_timer,
                                                  jlong ctx, jint duration) { /*func*/
  async_callback_info_t* info = async_callback_info_create(env, on_timer, "onTimer");

  uint32_t id = timer_add(call_on_timer, info, duration);
  if (id == TK_INVALID_ID) {
    async_callback_info_destroy(info);
  } else {
    timer_set_on_destroy(id, timer_info_on_destroy, NULL);
  }

  return id;
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1on(JNIEnv* env, jclass ajc, jlong jwidget,
                                                   jint type, jobject on_event,
                                                   jlong ctx) { /*func*/
  widget_t* widget = WIDGET(jwidget);

  async_callback_info_t* info = async_callback_info_create(env, on_event, "onEvent");
  uint32_t id = widget_on(widget, type, call_on_event, info);

  if (id == TK_INVALID_ID) {
    async_callback_info_destroy(info);
  } else {
    emitter_set_on_destroy(widget->emitter, id, emitter_item_on_destroy, NULL);
  }

  return id;
}

JNIEXPORT jint JNICALL Java_awtk_TEmitter_emitter_1on(JNIEnv* env, jclass ajc, jlong jemitter,
                                                     jint type, jobject on_event,
                                                     jlong ctx) { /*func*/
  emitter_t* emitter = EMITTER(jemitter);

  async_callback_info_t* info = async_callback_info_create(env, on_event, "onEvent");
  uint32_t id = emitter_on(emitter, type, call_on_event, info);

  if (id == TK_INVALID_ID) {
    async_callback_info_destroy(info);
  } else {
    emitter_set_on_destroy(emitter, id, emitter_item_on_destroy, NULL);
  }

  return id;
}

JNIEXPORT jint JNICALL Java_awtk_TWidget_widget_1foreach(JNIEnv* env, jclass ajc, jlong jwidget,
                                                        jobject visit, jlong ctx) { /*func*/
  widget_t* widget = WIDGET(jwidget);

  async_callback_info_t* info = async_callback_info_create(env, visit, "onData");
  ret_t ret = widget_foreach(widget, call_on_data, info);
  async_callback_info_destroy(info);

  return ret;
}
