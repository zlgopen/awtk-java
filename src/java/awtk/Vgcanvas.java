package awtk;


/**
 * 矢量图画布抽象基类。 具体实现时可以使用agg，nanovg, cairo和skia等方式。 cairo和skia体积太大，不适合嵌入式平台，但在PC平台也是一种选择。 目前我们只提供了基于nanovg的实现，支持软件渲染和硬件渲染。 我们对nanovg进行了一些改进: * 可以用agg/agge实现软件渲染(暂时不支持文本绘制)。 * 可以用bgfx使用DirectX(Windows平台)和Metal(iOS)平台硬件加速。 ```graphviz   [default_style]   vgcanvas_cairo_t -> vgcanvas_t[arrowhead = "empty"]   vgcanvas_nanovg_t -> vgcanvas_t[arrowhead = "empty"]   opengl -> vgcanvas_nanovg_t[arrowhead = "none"]   bgfx -> vgcanvas_nanovg_t[arrowhead = "none"]   agg -> vgcanvas_nanovg_t[arrowhead = "none"]   agge -> vgcanvas_nanovg_t[arrowhead = "none"]   vgcanvas_skia_t -> vgcanvas_t[arrowhead = "empty"]   vgcanvas_agge_t -> vgcanvas_t[arrowhead = "empty"] ``` 示例： ```c   vgcanvas_t* vg = canvas_get_vgcanvas(c);   vgcanvas_save(vg);   vgcanvas_translate(vg, 0, 100);   vgcanvas_set_line_width(vg, 1);   vgcanvas_set_fill_color(vg, color_init(0xff, 0, 0, 0xff));   vgcanvas_rect(vg, 5, 5, 100, 100);   vgcanvas_fill(vg);   vgcanvas_restore(vg); ```请参考：https://www.w3schools.com/tags/ref_canvas.asp
 *
 */
public class Vgcanvas {
 public long nativeObj;

 public Vgcanvas(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public Vgcanvas cast(long nativeObj) {
   return new Vgcanvas(nativeObj);
 }


/**
 * 转换为vgcanvas对象(供脚本语言使用)。
 * 
 * @param vg vgcanvas对象。
 *
 * @returns vgcanvas对象。
 */
 public  static Vgcanvas cast(Vgcanvas vg)  {
   return new Vgcanvas(vgcanvas_cast(vg != null ? (vg.nativeObj) : 0));
 }


/**
 * flush
 * 
 * @param vg vgcanvas对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret flush()  {
   return Ret.from(vgcanvas_flush(this != null ? (this.nativeObj) : 0));
 }


/**
 * 清除之前的路径，并重新开始一条路径。
 * 
 * @param vg vgcanvas对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret beginPath()  {
   return Ret.from(vgcanvas_begin_path(this != null ? (this.nativeObj) : 0));
 }


/**
 * 移动当前点到指定点。
 * 
 * @param vg vgcanvas对象。
 * @param x x坐标。
 * @param y y坐标。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret moveTo(double x, double y)  {
   return Ret.from(vgcanvas_move_to(this != null ? (this.nativeObj) : 0, x, y));
 }


/**
 * 生成一条线段(从当前点到目标点)。
 * 
 * @param vg vgcanvas对象。
 * @param x x坐标。
 * @param y y坐标。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret lineTo(double x, double y)  {
   return Ret.from(vgcanvas_line_to(this != null ? (this.nativeObj) : 0, x, y));
 }


/**
 * 生成一条二次贝塞尔曲线。
 * 
 * @param vg vgcanvas对象。
 * @param cpx 控制点x坐标。
 * @param cpy 控制点y坐标。
 * @param x x坐标。
 * @param y y坐标。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret quadTo(double cpx, double cpy, double x, double y)  {
   return Ret.from(vgcanvas_quad_to(this != null ? (this.nativeObj) : 0, cpx, cpy, x, y));
 }


/**
 * 生成一条三次贝塞尔曲线。
 * 
 * @param vg vgcanvas对象。
 * @param cp1x 控制点1x坐标。
 * @param cp1y 控制点1y坐标。
 * @param cp2x 控制点2x坐标。
 * @param cp2y 控制点3y坐标。
 * @param x x坐标。
 * @param y y坐标。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret bezierTo(double cp1x, double cp1y, double cp2x, double cp2y, double x, double y)  {
   return Ret.from(vgcanvas_bezier_to(this != null ? (this.nativeObj) : 0, cp1x, cp1y, cp2x, cp2y, x, y));
 }


/**
 * 生成一条圆弧路径到指定点。
 * 
 * @param vg vgcanvas对象。
 * @param x1 起始点x坐标。
 * @param y1 起始点y坐标。
 * @param x2 结束点x坐标。
 * @param y2 结束点y坐标。
 * @param r 半径。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret arcTo(double x1, double y1, double x2, double y2, double r)  {
   return Ret.from(vgcanvas_arc_to(this != null ? (this.nativeObj) : 0, x1, y1, x2, y2, r));
 }


/**
 * 生成一条圆弧。
 * 
 * @param vg vgcanvas对象。
 * @param x 原点x坐标。
 * @param y 原点y坐标。
 * @param r 半径。
 * @param start_angle 起始角度。
 * @param end_angle 结束角度。
 * @param ccw 是否逆时针。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret arc(double x, double y, double r, double start_angle, double end_angle, boolean ccw)  {
   return Ret.from(vgcanvas_arc(this != null ? (this.nativeObj) : 0, x, y, r, start_angle, end_angle, ccw));
 }


/**
 * 检查点是否在当前路径中。
 * 
 * @param vg vgcanvas对象。
 * @param x x坐标。
 * @param y y坐标。
 *
 * @returns 返回TRUE表示在，否则表示不在。
 */
 public  boolean isPointInPath(double x, double y)  {
   return vgcanvas_is_point_in_path(this != null ? (this.nativeObj) : 0, x, y);
 }


/**
 * 生成一个矩形路径。
 * 
 * @param vg vgcanvas对象。
 * @param x x坐标。
 * @param y y坐标。
 * @param w 宽度。
 * @param h 高度。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret rect(double x, double y, double w, double h)  {
   return Ret.from(vgcanvas_rect(this != null ? (this.nativeObj) : 0, x, y, w, h));
 }


/**
 * 生成一个圆角矩形路径。
 * 
 * @param vg vgcanvas对象。
 * @param x x坐标。
 * @param y y坐标。
 * @param w 宽度。
 * @param h 高度。
 * @param r 圆角半径。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret roundedRect(double x, double y, double w, double h, double r)  {
   return Ret.from(vgcanvas_rounded_rect(this != null ? (this.nativeObj) : 0, x, y, w, h, r));
 }


/**
 * 生成一个椭圆路径。
 * 
 * @param vg vgcanvas对象。
 * @param x x坐标。
 * @param y y坐标。
 * @param rx 圆角半径。
 * @param ry 圆角半径。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret ellipse(double x, double y, double rx, double ry)  {
   return Ret.from(vgcanvas_ellipse(this != null ? (this.nativeObj) : 0, x, y, rx, ry));
 }


/**
 * 闭合路径。闭合路径是指把起点和终点连接起来，形成一个封闭的多边形。
 * 
 * @param vg vgcanvas对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret closePath()  {
   return Ret.from(vgcanvas_close_path(this != null ? (this.nativeObj) : 0));
 }


/**
 * 旋转。
 * 
 * @param vg vgcanvas对象。
 * @param rad 角度
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret rotate(double rad)  {
   return Ret.from(vgcanvas_rotate(this != null ? (this.nativeObj) : 0, rad));
 }


/**
 * 缩放。
 * 
 * @param vg vgcanvas对象。
 * @param x x方向缩放比例。
 * @param y y方向缩放比例。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret scale(double x, double y)  {
   return Ret.from(vgcanvas_scale(this != null ? (this.nativeObj) : 0, x, y));
 }


/**
 * 平移。
 * 
 * @param vg vgcanvas对象。
 * @param x x方向偏移。
 * @param y y方向偏移。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret translate(double x, double y)  {
   return Ret.from(vgcanvas_translate(this != null ? (this.nativeObj) : 0, x, y));
 }


/**
 * 变换矩阵。
 * 
 * @param vg vgcanvas对象。
 * @param a a
 * @param b b
 * @param c c
 * @param d d
 * @param e e
 * @param f f
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret transform(double a, double b, double c, double d, double e, double f)  {
   return Ret.from(vgcanvas_transform(this != null ? (this.nativeObj) : 0, a, b, c, d, e, f));
 }


/**
 * 设置变换矩阵。
 * 
 * @param vg vgcanvas对象。
 * @param a a
 * @param b b
 * @param c c
 * @param d d
 * @param e e
 * @param f f
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setTransform(double a, double b, double c, double d, double e, double f)  {
   return Ret.from(vgcanvas_set_transform(this != null ? (this.nativeObj) : 0, a, b, c, d, e, f));
 }


/**
 * 矩形裁剪。
 * 
 * @param vg vgcanvas对象。
 * @param x x坐标。
 * @param y y坐标。
 * @param w 宽度。
 * @param h 高度。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret clipRect(double x, double y, double w, double h)  {
   return Ret.from(vgcanvas_clip_rect(this != null ? (this.nativeObj) : 0, x, y, w, h));
 }


/**
 * 填充多边形。
 * 
 * @param vg vgcanvas对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret fill()  {
   return Ret.from(vgcanvas_fill(this != null ? (this.nativeObj) : 0));
 }


/**
 * 画线。
 * 
 * @param vg vgcanvas对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret stroke()  {
   return Ret.from(vgcanvas_stroke(this != null ? (this.nativeObj) : 0));
 }


/**
 * 用图片填充/画多边形(可能存在可移植性问题，除非必要请勿使用)。 多边形的顶点必须在图片范围内，可以通过矩阵变化画到不同的位置。
 * 
 * @param vg vgcanvas对象。
 * @param stroke TRUE表示画线FALSE表示填充。
 * @param img 图片。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret paint(boolean stroke, Bitmap img)  {
   return Ret.from(vgcanvas_paint(this != null ? (this.nativeObj) : 0, stroke, img != null ? (img.nativeObj) : 0));
 }


/**
 * 设置字体的名称。
 * 
 * @param vg vgcanvas对象。
 * @param font 字体名称。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setFont(String font)  {
   return Ret.from(vgcanvas_set_font(this != null ? (this.nativeObj) : 0, font));
 }


/**
 * 设置字体的大小。
 * 
 * @param vg vgcanvas对象。
 * @param font 字体大小。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setFontSize(double font)  {
   return Ret.from(vgcanvas_set_font_size(this != null ? (this.nativeObj) : 0, font));
 }


/**
 * 设置文本水平对齐的方式。
 * 
 * @param vg vgcanvas对象。
 * @param value 取值：left|center|right，必须为常量字符串。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setTextAlign(String value)  {
   return Ret.from(vgcanvas_set_text_align(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 设置文本垂直对齐的方式。
 * 
 * @param vg vgcanvas对象。
 * @param value 取值：top|middle|bottom，必须为常量字符串。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setTextBaseline(String value)  {
   return Ret.from(vgcanvas_set_text_baseline(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 绘制文本。
 * 
 * @param vg vgcanvas对象。
 * @param text text
 * @param x x坐标。
 * @param y y坐标。
 * @param max_width 最大宽度。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret fillText(String text, double x, double y, double max_width)  {
   return Ret.from(vgcanvas_fill_text(this != null ? (this.nativeObj) : 0, text, x, y, max_width));
 }


/**
 * 测量文本的宽度。
 * 
 * @param vg vgcanvas对象。
 * @param text text
 *
 * @returns 返回text的宽度。
 */
 public  double measureText(String text)  {
   return vgcanvas_measure_text(this != null ? (this.nativeObj) : 0, text);
 }


/**
 * 绘制图片。
 * 
 * @param vg vgcanvas对象。
 * @param img 图片。
 * @param sx sx
 * @param sy sy
 * @param sw sw
 * @param sh sh
 * @param dx dx
 * @param dy dy
 * @param dw dw
 * @param dh dh
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret drawImage(Bitmap img, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh)  {
   return Ret.from(vgcanvas_draw_image(this != null ? (this.nativeObj) : 0, img != null ? (img.nativeObj) : 0, sx, sy, sw, sh, dx, dy, dw, dh));
 }


/**
 * 绘制图标。 绘制图标时会根据屏幕密度进行自动缩放，而绘制普通图片时不会。
 * 
 * @param vg vgcanvas对象。
 * @param img 图片。
 * @param sx sx
 * @param sy sy
 * @param sw sw
 * @param sh sh
 * @param dx dx
 * @param dy dy
 * @param dw dw
 * @param dh dh
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret drawIcon(Bitmap img, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh)  {
   return Ret.from(vgcanvas_draw_icon(this != null ? (this.nativeObj) : 0, img != null ? (img.nativeObj) : 0, sx, sy, sw, sh, dx, dy, dw, dh));
 }


/**
 * 设置是否启用反走样。
 * 
 * @param vg vgcanvas对象。
 * @param value 是否启用反走样。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setAntialias(boolean value)  {
   return Ret.from(vgcanvas_set_antialias(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 设置全局透明度。
 * 
 * @param vg vgcanvas对象。
 * @param alpha global alpha。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setGlobalAlpha(double alpha)  {
   return Ret.from(vgcanvas_set_global_alpha(this != null ? (this.nativeObj) : 0, alpha));
 }


/**
 * 设置线条的宽度。
 * 
 * @param vg vgcanvas对象。
 * @param value 线宽。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setLineWidth(double value)  {
   return Ret.from(vgcanvas_set_line_width(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 设置填充颜色。
 * 
 * @param vg vgcanvas对象。
 * @param color 颜色。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setFillColor(String color)  {
   return Ret.from(vgcanvas_set_fill_color_str(this != null ? (this.nativeObj) : 0, color));
 }


/**
 * 设置线条颜色。
 * 
 * @param vg vgcanvas对象。
 * @param color 颜色。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setStrokeColor(String color)  {
   return Ret.from(vgcanvas_set_stroke_color_str(this != null ? (this.nativeObj) : 0, color));
 }


/**
 * 设置line cap。
 * 
 * @param vg vgcanvas对象。
 * @param value 取值：butt|round|square，必须为常量字符串。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setLineCap(String value)  {
   return Ret.from(vgcanvas_set_line_cap(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 设置line join。
 * 
 * @param vg vgcanvas对象。
 * @param value 取值：bevel|round|miter，必须为常量字符串。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setLineJoin(String value)  {
   return Ret.from(vgcanvas_set_line_join(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 设置miter limit。
 * 
 * @param vg vgcanvas对象。
 * @param value miter limit
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret setMiterLimit(double value)  {
   return Ret.from(vgcanvas_set_miter_limit(this != null ? (this.nativeObj) : 0, value));
 }


/**
 * 保存当前的状态。如颜色和矩阵等信息。 save/restore必须配套使用，否则可能导致状态混乱。
 * 
 * @param vg vgcanvas对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret save()  {
   return Ret.from(vgcanvas_save(this != null ? (this.nativeObj) : 0));
 }


/**
 * 恢复上次save的状态。> save/restore必须配套使用，否则可能导致状态混乱。
 * 
 * @param vg vgcanvas对象。
 *
 * @returns 返回RET_OK表示成功，否则表示失败。
 */
 public  Ret restore()  {
   return Ret.from(vgcanvas_restore(this != null ? (this.nativeObj) : 0));
 }

 public int getW() {
   return vgcanvas_t_get_prop_w(this.nativeObj);
 }

 public int getH() {
   return vgcanvas_t_get_prop_h(this.nativeObj);
 }

 public int getStride() {
   return vgcanvas_t_get_prop_stride(this.nativeObj);
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
static private native int vgcanvas_t_get_prop_stride(long nativeObj);
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

