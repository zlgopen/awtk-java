package awtk;

public class ImageAnimation extends Widget {
 public ImageAnimation(long nativeObj) {
   super(nativeObj);
 }

 static public ImageAnimation cast(long nativeObj) {
   return new ImageAnimation(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new ImageAnimation(image_animation_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  Ret setLoop(boolean loop)  {
   return Ret.from(image_animation_set_loop(this.nativeObj, loop));
 }

 public  Ret setImage(String image)  {
   return Ret.from(image_animation_set_image(this.nativeObj, image));
 }

 public  Ret setInterval(int interval)  {
   return Ret.from(image_animation_set_interval(this.nativeObj, interval));
 }

 public  Ret setDelay(int delay)  {
   return Ret.from(image_animation_set_delay(this.nativeObj, delay));
 }

 public  Ret setAutoPlay(boolean auto_play)  {
   return Ret.from(image_animation_set_auto_play(this.nativeObj, auto_play));
 }

 public  Ret setSequence(String sequence)  {
   return Ret.from(image_animation_set_sequence(this.nativeObj, sequence));
 }

 public  Ret setRangeSequence(int start_index, int end_index)  {
   return Ret.from(image_animation_set_range_sequence(this.nativeObj, start_index, end_index));
 }

 public  Ret play()  {
   return Ret.from(image_animation_play(this.nativeObj));
 }

 public  Ret stop()  {
   return Ret.from(image_animation_stop(this.nativeObj));
 }

 public  Ret pause()  {
   return Ret.from(image_animation_pause(this.nativeObj));
 }

 public  Ret next()  {
   return Ret.from(image_animation_next(this.nativeObj));
 }

 public  Ret setFormat(String format)  {
   return Ret.from(image_animation_set_format(this.nativeObj, format));
 }

 public  Ret setUnloadAfterPaint(boolean unload_after_paint)  {
   return Ret.from(image_animation_set_unload_after_paint(this.nativeObj, unload_after_paint));
 }

 public  static Widget cast(Widget widget)  {
   return new ImageAnimation(image_animation_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public String getImage() {
   return image_animation_t_get_prop_image(this.nativeObj);
 }

 public String getSequence() {
   return image_animation_t_get_prop_sequence(this.nativeObj);
 }

 public int getStartIndex() {
   return image_animation_t_get_prop_start_index(this.nativeObj);
 }

 public int getEndIndex() {
   return image_animation_t_get_prop_end_index(this.nativeObj);
 }

 public boolean getLoop() {
   return image_animation_t_get_prop_loop(this.nativeObj);
 }

 public boolean getAutoPlay() {
   return image_animation_t_get_prop_auto_play(this.nativeObj);
 }

 public boolean getUnloadAfterPaint() {
   return image_animation_t_get_prop_unload_after_paint(this.nativeObj);
 }

 public String getFormat() {
   return image_animation_t_get_prop_format(this.nativeObj);
 }

 public int getInterval() {
   return image_animation_t_get_prop_interval(this.nativeObj);
 }

 public int getDelay() {
   return image_animation_t_get_prop_delay(this.nativeObj);
 }

static private native long image_animation_create(long parent, int x, int y, int w, int h);
static private native int image_animation_set_loop(long widget, boolean loop);
static private native int image_animation_set_image(long widget, String image);
static private native int image_animation_set_interval(long widget, int interval);
static private native int image_animation_set_delay(long widget, int delay);
static private native int image_animation_set_auto_play(long widget, boolean auto_play);
static private native int image_animation_set_sequence(long widget, String sequence);
static private native int image_animation_set_range_sequence(long widget, int start_index, int end_index);
static private native int image_animation_play(long widget);
static private native int image_animation_stop(long widget);
static private native int image_animation_pause(long widget);
static private native int image_animation_next(long widget);
static private native int image_animation_set_format(long widget, String format);
static private native int image_animation_set_unload_after_paint(long widget, boolean unload_after_paint);
static private native long image_animation_cast(long widget);
static private native String image_animation_t_get_prop_image(long nativeObj);
static private native String image_animation_t_get_prop_sequence(long nativeObj);
static private native int image_animation_t_get_prop_start_index(long nativeObj);
static private native int image_animation_t_get_prop_end_index(long nativeObj);
static private native boolean image_animation_t_get_prop_loop(long nativeObj);
static private native boolean image_animation_t_get_prop_auto_play(long nativeObj);
static private native boolean image_animation_t_get_prop_unload_after_paint(long nativeObj);
static private native String image_animation_t_get_prop_format(long nativeObj);
static private native int image_animation_t_get_prop_interval(long nativeObj);
static private native int image_animation_t_get_prop_delay(long nativeObj);
}

