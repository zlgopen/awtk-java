package awtk;

public class Vgcanvas {
 public long nativeObj;

 public Vgcanvas(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public Vgcanvas cast(long nativeObj) {
   return new Vgcanvas(nativeObj);
 }

 public  static Vgcanvas cast(Vgcanvas vg)  {
   return new Vgcanvas(vgcanvas_cast(vg != null ? (vg.nativeObj) : 0));
 }

 public  Ret flush()  {
   return Ret.from(vgcanvas_flush(this.nativeObj));
 }

 public  Ret beginPath()  {
   return Ret.from(vgcanvas_begin_path(this.nativeObj));
 }

 public  Ret moveTo(double x, double y)  {
   return Ret.from(vgcanvas_move_to(this.nativeObj, x, y));
 }

 public  Ret lineTo(double x, double y)  {
   return Ret.from(vgcanvas_line_to(this.nativeObj, x, y));
 }

 public  Ret quadTo(double cpx, double cpy, double x, double y)  {
   return Ret.from(vgcanvas_quad_to(this.nativeObj, cpx, cpy, x, y));
 }

 public  Ret bezierTo(double cp1x, double cp1y, double cp2x, double cp2y, double x, double y)  {
   return Ret.from(vgcanvas_bezier_to(this.nativeObj, cp1x, cp1y, cp2x, cp2y, x, y));
 }

 public  Ret arcTo(double x1, double y1, double x2, double y2, double r)  {
   return Ret.from(vgcanvas_arc_to(this.nativeObj, x1, y1, x2, y2, r));
 }

 public  Ret arc(double x, double y, double r, double start_angle, double end_angle, boolean ccw)  {
   return Ret.from(vgcanvas_arc(this.nativeObj, x, y, r, start_angle, end_angle, ccw));
 }

 public  boolean isPointInPath(double x, double y)  {
   return vgcanvas_is_point_in_path(this.nativeObj, x, y);
 }

 public  Ret rect(double x, double y, double w, double h)  {
   return Ret.from(vgcanvas_rect(this.nativeObj, x, y, w, h));
 }

 public  Ret roundedRect(double x, double y, double w, double h, double r)  {
   return Ret.from(vgcanvas_rounded_rect(this.nativeObj, x, y, w, h, r));
 }

 public  Ret ellipse(double x, double y, double rx, double ry)  {
   return Ret.from(vgcanvas_ellipse(this.nativeObj, x, y, rx, ry));
 }

 public  Ret closePath()  {
   return Ret.from(vgcanvas_close_path(this.nativeObj));
 }

 public  Ret rotate(double rad)  {
   return Ret.from(vgcanvas_rotate(this.nativeObj, rad));
 }

 public  Ret scale(double x, double y)  {
   return Ret.from(vgcanvas_scale(this.nativeObj, x, y));
 }

 public  Ret translate(double x, double y)  {
   return Ret.from(vgcanvas_translate(this.nativeObj, x, y));
 }

 public  Ret transform(double a, double b, double c, double d, double e, double f)  {
   return Ret.from(vgcanvas_transform(this.nativeObj, a, b, c, d, e, f));
 }

 public  Ret setTransform(double a, double b, double c, double d, double e, double f)  {
   return Ret.from(vgcanvas_set_transform(this.nativeObj, a, b, c, d, e, f));
 }

 public  Ret clipRect(double x, double y, double w, double h)  {
   return Ret.from(vgcanvas_clip_rect(this.nativeObj, x, y, w, h));
 }

 public  Ret fill()  {
   return Ret.from(vgcanvas_fill(this.nativeObj));
 }

 public  Ret stroke()  {
   return Ret.from(vgcanvas_stroke(this.nativeObj));
 }

 public  Ret paint(boolean stroke, Bitmap img)  {
   return Ret.from(vgcanvas_paint(this.nativeObj, stroke, img != null ? (img.nativeObj) : 0));
 }

 public  Ret setFont(String font)  {
   return Ret.from(vgcanvas_set_font(this.nativeObj, font));
 }

 public  Ret setFontSize(double font)  {
   return Ret.from(vgcanvas_set_font_size(this.nativeObj, font));
 }

 public  Ret setTextAlign(String value)  {
   return Ret.from(vgcanvas_set_text_align(this.nativeObj, value));
 }

 public  Ret setTextBaseline(String value)  {
   return Ret.from(vgcanvas_set_text_baseline(this.nativeObj, value));
 }

 public  Ret fillText(String text, double x, double y, double max_width)  {
   return Ret.from(vgcanvas_fill_text(this.nativeObj, text, x, y, max_width));
 }

 public  double measureText(String text)  {
   return vgcanvas_measure_text(this.nativeObj, text);
 }

 public  Ret drawImage(Bitmap img, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh)  {
   return Ret.from(vgcanvas_draw_image(this.nativeObj, img != null ? (img.nativeObj) : 0, sx, sy, sw, sh, dx, dy, dw, dh));
 }

 public  Ret drawIcon(Bitmap img, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh)  {
   return Ret.from(vgcanvas_draw_icon(this.nativeObj, img != null ? (img.nativeObj) : 0, sx, sy, sw, sh, dx, dy, dw, dh));
 }

 public  Ret setAntialias(boolean value)  {
   return Ret.from(vgcanvas_set_antialias(this.nativeObj, value));
 }

 public  Ret setGlobalAlpha(double alpha)  {
   return Ret.from(vgcanvas_set_global_alpha(this.nativeObj, alpha));
 }

 public  Ret setLineWidth(double value)  {
   return Ret.from(vgcanvas_set_line_width(this.nativeObj, value));
 }

 public  Ret setFillColor(String color)  {
   return Ret.from(vgcanvas_set_fill_color_str(this.nativeObj, color));
 }

 public  Ret setStrokeColor(String color)  {
   return Ret.from(vgcanvas_set_stroke_color_str(this.nativeObj, color));
 }

 public  Ret setLineCap(String value)  {
   return Ret.from(vgcanvas_set_line_cap(this.nativeObj, value));
 }

 public  Ret setLineJoin(String value)  {
   return Ret.from(vgcanvas_set_line_join(this.nativeObj, value));
 }

 public  Ret setMiterLimit(double value)  {
   return Ret.from(vgcanvas_set_miter_limit(this.nativeObj, value));
 }

 public  Ret save()  {
   return Ret.from(vgcanvas_save(this.nativeObj));
 }

 public  Ret restore()  {
   return Ret.from(vgcanvas_restore(this.nativeObj));
 }

 public int getW() {
   return vgcanvas_t_get_prop_w(this.nativeObj);
 }

 public int getH() {
   return vgcanvas_t_get_prop_h(this.nativeObj);
 }

 public double getRatio() {
   return vgcanvas_t_get_prop_ratio(this.nativeObj);
 }

 public boolean getAntiAlias() {
   return vgcanvas_t_get_prop_anti_alias(this.nativeObj);
 }

 public double getLineWidth() {
   return vgcanvas_t_get_prop_line_width(this.nativeObj);
 }

 public double getGlobalAlpha() {
   return vgcanvas_t_get_prop_global_alpha(this.nativeObj);
 }

 public double getMiterLimit() {
   return vgcanvas_t_get_prop_miter_limit(this.nativeObj);
 }

 public String getLineCap() {
   return vgcanvas_t_get_prop_line_cap(this.nativeObj);
 }

 public String getLineJoin() {
   return vgcanvas_t_get_prop_line_join(this.nativeObj);
 }

 public String getFont() {
   return vgcanvas_t_get_prop_font(this.nativeObj);
 }

 public double getFontSize() {
   return vgcanvas_t_get_prop_font_size(this.nativeObj);
 }

 public String getTextAlign() {
   return vgcanvas_t_get_prop_text_align(this.nativeObj);
 }

 public String getTextBaseline() {
   return vgcanvas_t_get_prop_text_baseline(this.nativeObj);
 }

static private native long vgcanvas_cast(long vg);
static private native int vgcanvas_flush(long vg);
static private native int vgcanvas_begin_path(long vg);
static private native int vgcanvas_move_to(long vg, double x, double y);
static private native int vgcanvas_line_to(long vg, double x, double y);
static private native int vgcanvas_quad_to(long vg, double cpx, double cpy, double x, double y);
static private native int vgcanvas_bezier_to(long vg, double cp1x, double cp1y, double cp2x, double cp2y, double x, double y);
static private native int vgcanvas_arc_to(long vg, double x1, double y1, double x2, double y2, double r);
static private native int vgcanvas_arc(long vg, double x, double y, double r, double start_angle, double end_angle, boolean ccw);
static private native boolean vgcanvas_is_point_in_path(long vg, double x, double y);
static private native int vgcanvas_rect(long vg, double x, double y, double w, double h);
static private native int vgcanvas_rounded_rect(long vg, double x, double y, double w, double h, double r);
static private native int vgcanvas_ellipse(long vg, double x, double y, double rx, double ry);
static private native int vgcanvas_close_path(long vg);
static private native int vgcanvas_rotate(long vg, double rad);
static private native int vgcanvas_scale(long vg, double x, double y);
static private native int vgcanvas_translate(long vg, double x, double y);
static private native int vgcanvas_transform(long vg, double a, double b, double c, double d, double e, double f);
static private native int vgcanvas_set_transform(long vg, double a, double b, double c, double d, double e, double f);
static private native int vgcanvas_clip_rect(long vg, double x, double y, double w, double h);
static private native int vgcanvas_fill(long vg);
static private native int vgcanvas_stroke(long vg);
static private native int vgcanvas_paint(long vg, boolean stroke, long img);
static private native int vgcanvas_set_font(long vg, String font);
static private native int vgcanvas_set_font_size(long vg, double font);
static private native int vgcanvas_set_text_align(long vg, String value);
static private native int vgcanvas_set_text_baseline(long vg, String value);
static private native int vgcanvas_fill_text(long vg, String text, double x, double y, double max_width);
static private native double vgcanvas_measure_text(long vg, String text);
static private native int vgcanvas_draw_image(long vg, long img, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh);
static private native int vgcanvas_draw_icon(long vg, long img, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh);
static private native int vgcanvas_set_antialias(long vg, boolean value);
static private native int vgcanvas_set_global_alpha(long vg, double alpha);
static private native int vgcanvas_set_line_width(long vg, double value);
static private native int vgcanvas_set_fill_color_str(long vg, String color);
static private native int vgcanvas_set_stroke_color_str(long vg, String color);
static private native int vgcanvas_set_line_cap(long vg, String value);
static private native int vgcanvas_set_line_join(long vg, String value);
static private native int vgcanvas_set_miter_limit(long vg, double value);
static private native int vgcanvas_save(long vg);
static private native int vgcanvas_restore(long vg);
static private native int vgcanvas_t_get_prop_w(long nativeObj);
static private native int vgcanvas_t_get_prop_h(long nativeObj);
static private native double vgcanvas_t_get_prop_ratio(long nativeObj);
static private native boolean vgcanvas_t_get_prop_anti_alias(long nativeObj);
static private native double vgcanvas_t_get_prop_line_width(long nativeObj);
static private native double vgcanvas_t_get_prop_global_alpha(long nativeObj);
static private native double vgcanvas_t_get_prop_miter_limit(long nativeObj);
static private native String vgcanvas_t_get_prop_line_cap(long nativeObj);
static private native String vgcanvas_t_get_prop_line_join(long nativeObj);
static private native String vgcanvas_t_get_prop_font(long nativeObj);
static private native double vgcanvas_t_get_prop_font_size(long nativeObj);
static private native String vgcanvas_t_get_prop_text_align(long nativeObj);
static private native String vgcanvas_t_get_prop_text_baseline(long nativeObj);
}

