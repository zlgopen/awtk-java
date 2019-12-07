package awtk;

public class SlideMenu extends Widget {
 public SlideMenu(long nativeObj) {
   super(nativeObj);
 }

 static public SlideMenu cast(long nativeObj) {
   return new SlideMenu(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new SlideMenu(slide_menu_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  static Widget cast(Widget widget)  {
   return new SlideMenu(slide_menu_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public  Ret setValue(int value)  {
   return Ret.from(slide_menu_set_value(this.nativeObj, value));
 }

 public  Ret setAlignV(AlignV align_v)  {
   return Ret.from(slide_menu_set_align_v(this.nativeObj, align_v.value()));
 }

 public  Ret setMinScale(double min_scale)  {
   return Ret.from(slide_menu_set_min_scale(this.nativeObj, min_scale));
 }

 public AlignV getAlignV() {
   return AlignV.from(slide_menu_t_get_prop_align_v(this.nativeObj));

 }

 public double getMinScale() {
   return slide_menu_t_get_prop_min_scale(this.nativeObj);
 }

static private native long slide_menu_create(long parent, int x, int y, int w, int h);
static private native long slide_menu_cast(long widget);
static private native int slide_menu_set_value(long widget, int value);
static private native int slide_menu_set_align_v(long widget, int align_v);
static private native int slide_menu_set_min_scale(long widget, double min_scale);
static private native int slide_menu_t_get_prop_value(long nativeObj);
static private native int slide_menu_t_get_prop_align_v(long nativeObj);
static private native double slide_menu_t_get_prop_min_scale(long nativeObj);
}

