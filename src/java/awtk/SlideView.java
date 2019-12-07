package awtk;

public class SlideView extends Widget {
 public SlideView(long nativeObj) {
   super(nativeObj);
 }

 static public SlideView cast(long nativeObj) {
   return new SlideView(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new SlideView(slide_view_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new SlideView(slide_view_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public  Ret setAutoPlay(int auto_play)  {
   return Ret.from(slide_view_set_auto_play(this.nativeObj, auto_play));
 }

 public  Ret setActive(int index)  {
   return Ret.from(slide_view_set_active(this.nativeObj, index));
 }

 public  Ret setVertical(boolean vertical)  {
   return Ret.from(slide_view_set_vertical(this.nativeObj, vertical));
 }

 public  Ret setAnimHint(String anim_hint)  {
   return Ret.from(slide_view_set_anim_hint(this.nativeObj, anim_hint));
 }

 public  Ret setLoop(boolean loop)  {
   return Ret.from(slide_view_set_loop(this.nativeObj, loop));
 }

 public boolean getVertical() {
   return slide_view_t_get_prop_vertical(this.nativeObj);
 }

 public int getAutoPlay() {
   return slide_view_t_get_prop_auto_play(this.nativeObj);
 }

 public boolean getLoop() {
   return slide_view_t_get_prop_loop(this.nativeObj);
 }

 public String getAnimHint() {
   return slide_view_t_get_prop_anim_hint(this.nativeObj);
 }

static private native long slide_view_create(long parent, int x, int y, int w, int h);
static private native long slide_view_cast(long widget);
static private native int slide_view_set_auto_play(long widget, int auto_play);
static private native int slide_view_set_active(long widget, int index);
static private native int slide_view_set_vertical(long widget, boolean vertical);
static private native int slide_view_set_anim_hint(long widget, String anim_hint);
static private native int slide_view_set_loop(long widget, boolean loop);
static private native boolean slide_view_t_get_prop_vertical(long nativeObj);
static private native int slide_view_t_get_prop_auto_play(long nativeObj);
static private native boolean slide_view_t_get_prop_loop(long nativeObj);
static private native String slide_view_t_get_prop_anim_hint(long nativeObj);
}

