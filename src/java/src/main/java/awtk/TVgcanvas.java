package awtk;


/**
 * 矢量图画布抽象基类。
 *
 *具体实现时可以使用agg，nanovg, cairo和skia等方式。
 *
 *cairo和skia体积太大，不适合嵌入式平台，但在PC平台也是一种选择。
 *
 *目前我们只提供了基于nanovg的实现，支持软件渲染和硬件渲染。
 *
 *我们对nanovg进行了一些改进:
 *
 ** 可以用agg/agge实现软件渲染(暂时不支持文本绘制)。
 *
 ** 可以用bgfx使用DirectX(Windows平台)和Metal(iOS)平台硬件加速。
 *
 *
 *
 *示例：
 *
 *
 *>请参考：https://www.w3schools.com/tags/ref_canvas.asp
 *
 */
public class TVgcanvas { 

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
 public TVgcanvas(long nativeObj) {
   this.nativeObj = nativeObj;
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TVgcanvas cast(long nativeObj) {
   return new TVgcanvas(nativeObj);
 }


  /**
   * 转换为vgcanvas对象(供脚本语言使用)。
   * 
   * @param vg vgcanvas对象。
   *
   * @return vgcanvas对象。
   */
 public  static TVgcanvas cast(TVgcanvas vg)  {
    return new TVgcanvas(vgcanvas_cast(vg != null ? (vg.nativeObj) : 0));
 }


  /**
   * flush
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet flush()  {
   return TRet.from(vgcanvas_flush(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 清除之前的路径，并重新开始一条路径。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet beginPath()  {
   return TRet.from(vgcanvas_begin_path(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 移动当前点到指定点。
   * 
   * @param x x坐标。
   * @param y y坐标。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet moveTo(double x, double y)  {
   return TRet.from(vgcanvas_move_to(this != null ? (this.nativeObj) : 0, x, y));
 }


  /**
   * 生成一条线段(从当前点到目标点)。
   * 
   * @param x x坐标。
   * @param y y坐标。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet lineTo(double x, double y)  {
   return TRet.from(vgcanvas_line_to(this != null ? (this.nativeObj) : 0, x, y));
 }


  /**
   * 生成一条二次贝塞尔曲线。
   * 
   * @param cpx 控制点x坐标。
   * @param cpy 控制点y坐标。
   * @param x x坐标。
   * @param y y坐标。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet quadTo(double cpx, double cpy, double x, double y)  {
   return TRet.from(vgcanvas_quad_to(this != null ? (this.nativeObj) : 0, cpx, cpy, x, y));
 }


  /**
   * 生成一条三次贝塞尔曲线。
   * 
   * @param cp1x 控制点1x坐标。
   * @param cp1y 控制点1y坐标。
   * @param cp2x 控制点2x坐标。
   * @param cp2y 控制点3y坐标。
   * @param x x坐标。
   * @param y y坐标。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet bezierTo(double cp1x, double cp1y, double cp2x, double cp2y, double x, double y)  {
   return TRet.from(vgcanvas_bezier_to(this != null ? (this.nativeObj) : 0, cp1x, cp1y, cp2x, cp2y, x, y));
 }


  /**
   * 生成一条圆弧路径到指定点。
   * 
   * @param x1 起始点x坐标。
   * @param y1 起始点y坐标。
   * @param x2 结束点x坐标。
   * @param y2 结束点y坐标。
   * @param r 半径。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet arcTo(double x1, double y1, double x2, double y2, double r)  {
   return TRet.from(vgcanvas_arc_to(this != null ? (this.nativeObj) : 0, x1, y1, x2, y2, r));
 }


  /**
   * 生成一条圆弧。
   * 
   * @param x 原点x坐标。
   * @param y 原点y坐标。
   * @param r 半径。
   * @param start_angle 起始角度。
   * @param end_angle 结束角度。
   * @param ccw 是否逆时针。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet arc(double x, double y, double r, double start_angle, double end_angle, boolean ccw)  {
   return TRet.from(vgcanvas_arc(this != null ? (this.nativeObj) : 0, x, y, r, start_angle, end_angle, ccw));
 }


  /**
   * 检查点是否在当前路径中。
   * 
   * @param x x坐标。
   * @param y y坐标。
   *
   * @return 返回TRUE表示在，否则表示不在。
   */
 public  boolean isPointInPath(double x, double y)  {
    return vgcanvas_is_point_in_path(this != null ? (this.nativeObj) : 0, x, y);
 }


  /**
   * 生成一个矩形路径。
   * 
   * @param x x坐标。
   * @param y y坐标。
   * @param w 宽度。
   * @param h 高度。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet rect(double x, double y, double w, double h)  {
   return TRet.from(vgcanvas_rect(this != null ? (this.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 生成一个圆角矩形路径。
   * 
   * @param x x坐标。
   * @param y y坐标。
   * @param w 宽度。
   * @param h 高度。
   * @param r 圆角半径。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet roundedRect(double x, double y, double w, double h, double r)  {
   return TRet.from(vgcanvas_rounded_rect(this != null ? (this.nativeObj) : 0, x, y, w, h, r));
 }


  /**
   * 生成一个椭圆路径。
   * 
   * @param x x坐标。
   * @param y y坐标。
   * @param rx 圆角半径。
   * @param ry 圆角半径。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet ellipse(double x, double y, double rx, double ry)  {
   return TRet.from(vgcanvas_ellipse(this != null ? (this.nativeObj) : 0, x, y, rx, ry));
 }


  /**
   * 闭合路径。
   *
   *>闭合路径是指把起点和终点连接起来，形成一个封闭的多边形。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet closePath()  {
   return TRet.from(vgcanvas_close_path(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 设置路径填充实心与否。
   *
   *>CCW(1)为实心，CW(2)为镂空，设置其他则默认根据非零环绕规则判断(nonzero)。
   * 
   * @param dir 填充方法。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet pathWinding(boolean dir)  {
   return TRet.from(vgcanvas_path_winding(this != null ? (this.nativeObj) : 0, dir));
 }


  /**
   * 旋转。
   * 
   * @param rad 角度
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet rotate(double rad)  {
   return TRet.from(vgcanvas_rotate(this != null ? (this.nativeObj) : 0, rad));
 }


  /**
   * 缩放。
   * 
   * @param x x方向缩放比例。
   * @param y y方向缩放比例。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet scale(double x, double y)  {
   return TRet.from(vgcanvas_scale(this != null ? (this.nativeObj) : 0, x, y));
 }


  /**
   * 平移。
   * 
   * @param x x方向偏移。
   * @param y y方向偏移。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet translate(double x, double y)  {
   return TRet.from(vgcanvas_translate(this != null ? (this.nativeObj) : 0, x, y));
 }


  /**
   * 变换矩阵。
   * 
   * @param a a
   * @param b b
   * @param c c
   * @param d d
   * @param e e
   * @param f f
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet transform(double a, double b, double c, double d, double e, double f)  {
   return TRet.from(vgcanvas_transform(this != null ? (this.nativeObj) : 0, a, b, c, d, e, f));
 }


  /**
   * 设置变换矩阵。
   * 
   * @param a a
   * @param b b
   * @param c c
   * @param d d
   * @param e e
   * @param f f
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setTransform(double a, double b, double c, double d, double e, double f)  {
   return TRet.from(vgcanvas_set_transform(this != null ? (this.nativeObj) : 0, a, b, c, d, e, f));
 }


  /**
   * 使用当前的path裁剪。
   *>目前只有部分backend支持(如cairo)。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet clipPath()  {
   return TRet.from(vgcanvas_clip_path(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 矩形裁剪。
   * 
   * @param x x坐标。
   * @param y y坐标。
   * @param w 宽度。
   * @param h 高度。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet clipRect(double x, double y, double w, double h)  {
   return TRet.from(vgcanvas_clip_rect(this != null ? (this.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 矩形区域是否在矩形裁剪中。
   * 
   * @param left 矩形区域左边。
   * @param top 矩形区域上边。
   * @param right 矩形区域右边。
   * @param bottom 矩形区域下边。
   *
   * @return 返回 TURE 则在区域中，返回 FALSE 则不在区域中。
   */
 public  boolean isRectfInClipRect(double left, double top, double right, double bottom)  {
    return vgcanvas_is_rectf_in_clip_rect(this != null ? (this.nativeObj) : 0, left, top, right, bottom);
 }


  /**
   * 设置一个与前一个裁剪区做交集的矩形裁剪区。
   *如果下面这种情况，则不能直接调用 rect_intersect 函数来做矩形交集和 vgcanvas_clip_rect 函数设置裁剪区，而采用本函数做交集。
   *由于缩放和旋转以及平移会导致 vg 的坐标系和上一个裁剪区的坐标系不同，
   *导致直接使用做交集的话，裁剪区会出错。
   *
   *```
   *vgcanvas_clip_rect(vg, old_r.x, old_r.y, old_r.w, old_r.h);
   *vgcanvas_save(vg);
   *vgcanvas_scale(vg, scale_x, scale_y);
   *vgcanvas_rotate(vg, TK_D2R(15));
   *vgcanvas_intersect_clip_rect(vg, r.x, r.y, r.w, r.h);
   *..................
   *vgcanvas_restore(vg);
   *```
   * 
   * @param x x坐标。
   * @param y y坐标。
   * @param w 宽度。
   * @param h 高度。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet intersectClipRect(double x, double y, double w, double h)  {
   return TRet.from(vgcanvas_intersect_clip_rect(this != null ? (this.nativeObj) : 0, x, y, w, h));
 }


  /**
   * 填充多边形。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet fill()  {
   return TRet.from(vgcanvas_fill(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 画线。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet stroke()  {
   return TRet.from(vgcanvas_stroke(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 用图片填充/画多边形(可能存在可移植性问题，除非必要请勿使用)。
   *多边形的顶点必须在图片范围内，可以通过矩阵变化画到不同的位置。
   * 
   * @param stroke TRUE表示画线FALSE表示填充。
   * @param img 图片。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet paint(boolean stroke, TBitmap img)  {
   return TRet.from(vgcanvas_paint(this != null ? (this.nativeObj) : 0, stroke, img != null ? (img.nativeObj) : 0));
 }


  /**
   * 设置字体的名称。
   * 
   * @param font 字体名称。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setFont(String font)  {
   return TRet.from(vgcanvas_set_font(this != null ? (this.nativeObj) : 0, font));
 }


  /**
   * 设置字体的大小。
   * 
   * @param font 字体大小。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setFontSize(double font)  {
   return TRet.from(vgcanvas_set_font_size(this != null ? (this.nativeObj) : 0, font));
 }


  /**
   * 设置文本水平对齐的方式。
   * 
   * @param value 取值：left|center|right，必须为常量字符串。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setTextAlign(String value)  {
   return TRet.from(vgcanvas_set_text_align(this != null ? (this.nativeObj) : 0, value));
 }


  /**
   * 设置文本垂直对齐的方式。
   * 
   * @param value 取值：top|middle|bottom，必须为常量字符串。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setTextBaseline(String value)  {
   return TRet.from(vgcanvas_set_text_baseline(this != null ? (this.nativeObj) : 0, value));
 }


  /**
   * 绘制文本。
   * 
   * @param text text
   * @param x x坐标。
   * @param y y坐标。
   * @param max_width 最大宽度。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet fillText(String text, double x, double y, double max_width)  {
   return TRet.from(vgcanvas_fill_text(this != null ? (this.nativeObj) : 0, text, x, y, max_width));
 }


  /**
   * 测量文本的宽度。
   * 
   * @param text text
   *
   * @return 返回text的宽度。
   */
 public  double measureText(String text)  {
    return vgcanvas_measure_text(this != null ? (this.nativeObj) : 0, text);
 }


  /**
   * 绘制图片。
   * 
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
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet drawImage(TBitmap img, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh)  {
   return TRet.from(vgcanvas_draw_image(this != null ? (this.nativeObj) : 0, img != null ? (img.nativeObj) : 0, sx, sy, sw, sh, dx, dy, dw, dh));
 }


  /**
   * 绘制图片。
   *
   *备注：
   *当绘制区域大于原图区域时，多余的绘制区域会重复绘制原图区域的东西。（绘制图区按照绘制图片的宽高来绘制的）
   *当绘制图片的宽高和原图的不同，在重复绘制的同时加入缩放。
   * 
   * @param img 图片。
   * @param sx 原图区域的 x
   * @param sy 原图区域的 y
   * @param sw 原图区域的 w
   * @param sh 原图区域的 h
   * @param dx 绘制区域的 x
   * @param dy 绘制区域的 y
   * @param dw 绘制区域的 w
   * @param dh 绘制区域的 h
   * @param dst_w 绘制图片的宽
   * @param dst_h 绘制图片的高
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet drawImageRepeat(TBitmap img, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh, double dst_w, double dst_h)  {
   return TRet.from(vgcanvas_draw_image_repeat(this != null ? (this.nativeObj) : 0, img != null ? (img.nativeObj) : 0, sx, sy, sw, sh, dx, dy, dw, dh, dst_w, dst_h));
 }


  /**
   * 绘制图标。
   *
   *绘制图标时会根据屏幕密度进行自动缩放，而绘制普通图片时不会。
   * 
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
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet drawIcon(TBitmap img, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh)  {
   return TRet.from(vgcanvas_draw_icon(this != null ? (this.nativeObj) : 0, img != null ? (img.nativeObj) : 0, sx, sy, sw, sh, dx, dy, dw, dh));
 }


  /**
   * 设置是否启用反走样。
   * 
   * @param value 是否启用反走样。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setAntialias(boolean value)  {
   return TRet.from(vgcanvas_set_antialias(this != null ? (this.nativeObj) : 0, value));
 }


  /**
   * 设置全局透明度。
   * 
   * @param alpha global alpha。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setGlobalAlpha(double alpha)  {
   return TRet.from(vgcanvas_set_global_alpha(this != null ? (this.nativeObj) : 0, alpha));
 }


  /**
   * 设置线条的宽度。
   * 
   * @param value 线宽。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setLineWidth(double value)  {
   return TRet.from(vgcanvas_set_line_width(this != null ? (this.nativeObj) : 0, value));
 }


  /**
   * 设置填充颜色。
   * 
   * @param color 颜色。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setFillColor(String color)  {
   return TRet.from(vgcanvas_set_fill_color_str(this != null ? (this.nativeObj) : 0, color));
 }


  /**
   * 设置线条颜色。
   * 
   * @param color 颜色。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setStrokeColor(String color)  {
   return TRet.from(vgcanvas_set_stroke_color_str(this != null ? (this.nativeObj) : 0, color));
 }


  /**
   * 设置line cap。
   * 
   * @param value 取值：butt|round|square，必须为常量字符串。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setLineCap(String value)  {
   return TRet.from(vgcanvas_set_line_cap(this != null ? (this.nativeObj) : 0, value));
 }


  /**
   * 设置line join。
   * 
   * @param value 取值：bevel|round|miter，必须为常量字符串。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setLineJoin(String value)  {
   return TRet.from(vgcanvas_set_line_join(this != null ? (this.nativeObj) : 0, value));
 }


  /**
   * 设置miter limit。
   * 
   * @param value miter limit
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet setMiterLimit(double value)  {
   return TRet.from(vgcanvas_set_miter_limit(this != null ? (this.nativeObj) : 0, value));
 }


  /**
   * 保存当前的状态。如颜色和矩阵等信息。
   *
   *> save/restore必须配套使用，否则可能导致状态混乱。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet save()  {
   return TRet.from(vgcanvas_save(this != null ? (this.nativeObj) : 0));
 }


  /**
   * 恢复上次save的状态。
   *
   *> save/restore必须配套使用，否则可能导致状态混乱。
   * 
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet restore()  {
   return TRet.from(vgcanvas_restore(this != null ? (this.nativeObj) : 0));
 }


  /**
   * canvas的宽度
   *
   */
 public int getW() {
   return vgcanvas_t_get_prop_w(this.nativeObj);
 }


  /**
   * canvas的高度
   *
   */
 public int getH() {
   return vgcanvas_t_get_prop_h(this.nativeObj);
 }


  /**
   * 一行占的字节
   *
   */
 public int getStride() {
   return vgcanvas_t_get_prop_stride(this.nativeObj);
 }


  /**
   * 显示比例。
   *
   */
 public double getRatio() {
   return vgcanvas_t_get_prop_ratio(this.nativeObj);
 }


  /**
   * 是否启用反走样功能。
   *
   */
 public boolean getAntiAlias() {
   return vgcanvas_t_get_prop_anti_alias(this.nativeObj);
 }


  /**
   * 线宽。
   *
   */
 public double getLineWidth() {
   return vgcanvas_t_get_prop_line_width(this.nativeObj);
 }


  /**
   * 全局alpha。
   *
   */
 public double getGlobalAlpha() {
   return vgcanvas_t_get_prop_global_alpha(this.nativeObj);
 }


  /**
   * miter\_limit。
   *@see http://www.w3school.com.cn/tags/canvas_miterlimit.asp
   *
   */
 public double getMiterLimit() {
   return vgcanvas_t_get_prop_miter_limit(this.nativeObj);
 }


  /**
   * line\_cap。
   *@see http://www.w3school.com.cn/tags/canvas_linecap.asp
   *
   */
 public String getLineCap() {
   return vgcanvas_t_get_prop_line_cap(this.nativeObj);
 }


  /**
   * line\_join。
   *@see http://www.w3school.com.cn/tags/canvas_linejoin.asp
   *
   */
 public String getLineJoin() {
   return vgcanvas_t_get_prop_line_join(this.nativeObj);
 }


  /**
   * 字体。
   *
   */
 public String getFont() {
   return vgcanvas_t_get_prop_font(this.nativeObj);
 }


  /**
   * 字体大小。
   *
   */
 public double getFontSize() {
   return vgcanvas_t_get_prop_font_size(this.nativeObj);
 }


  /**
   * 文本对齐方式。
   *
   *@see http://www.w3school.com.cn/tags/canvas_textalign.asp
   *
   */
 public String getTextAlign() {
   return vgcanvas_t_get_prop_text_align(this.nativeObj);
 }


  /**
   * 文本基线。
   *
   *@see http://www.w3school.com.cn/tags/canvas_textbaseline.asp
   *
   */
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
static private native int vgcanvas_path_winding(long vg, boolean dir);
static private native int vgcanvas_rotate(long vg, double rad);
static private native int vgcanvas_scale(long vg, double x, double y);
static private native int vgcanvas_translate(long vg, double x, double y);
static private native int vgcanvas_transform(long vg, double a, double b, double c, double d, double e, double f);
static private native int vgcanvas_set_transform(long vg, double a, double b, double c, double d, double e, double f);
static private native int vgcanvas_clip_path(long vg);
static private native int vgcanvas_clip_rect(long vg, double x, double y, double w, double h);
static private native boolean vgcanvas_is_rectf_in_clip_rect(long vg, double left, double top, double right, double bottom);
static private native int vgcanvas_intersect_clip_rect(long vg, double x, double y, double w, double h);
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
static private native int vgcanvas_draw_image_repeat(long vg, long img, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh, double dst_w, double dst_h);
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
};