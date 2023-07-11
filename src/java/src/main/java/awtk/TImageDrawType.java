package awtk;



/**
 * 图片绘制方法常量定义。
 *
 */

public enum TImageDrawType {
  
  /**
   * 缺省显示。将图片按原大小显示在目标矩形的左上角。
   *
   */
 
  DEFAULT (IMAGE_DRAW_DEFAULT()),
  
  /**
   * 居中显示。将图片按原大小显示在目标矩形的中央。
   *
   */
 
  CENTER (IMAGE_DRAW_CENTER()),
  
  /**
   * 图标显示。同居中显示，但会根据屏幕密度调整大小。
   *
   */
 
  ICON (IMAGE_DRAW_ICON()),
  
  /**
   * 缩放显示。将图片缩放至目标矩形的大小(不保证宽高成比例)。
   *
   */
 
  SCALE (IMAGE_DRAW_SCALE()),
  
  /**
   * 自动缩放显示。将图片缩放至目标矩形的宽度或高度(选取最小的比例)，并居中显示。
   *
   */
 
  SCALE_AUTO (IMAGE_DRAW_SCALE_AUTO()),
  
  /**
   * 如果图片比目标矩形大，自动缩小显示，否则居中显示。
   *
   */
 
  SCALE_DOWN (IMAGE_DRAW_SCALE_DOWN()),
  
  /**
   * 宽度缩放显示。 将图片缩放至目标矩形的宽度，高度按此比例进行缩放，超出不部分不显示。
   *
   */
 
  SCALE_W (IMAGE_DRAW_SCALE_W()),
  
  /**
   * 高度缩放显示。将图片缩放至目标矩形的高度，宽度按此比例进行缩放，超出不部分不显示。
   *
   */
 
  SCALE_H (IMAGE_DRAW_SCALE_H()),
  
  /**
   * 填充整个区域。将图片缩放至目标矩形的高度或宽度，包装填满整个目标区域，超出不部分不显示。
   *
   */
 
  FILL (IMAGE_DRAW_FILL()),
  
  /**
   * 平铺显示。
   *
   */
 
  REPEAT (IMAGE_DRAW_REPEAT()),
  
  /**
   * 水平方向平铺显示，垂直方向缩放。
   *
   */
 
  REPEAT_X (IMAGE_DRAW_REPEAT_X()),
  
  /**
   * 垂直方向平铺显示，水平方向缩放。
   *
   */
 
  REPEAT_Y (IMAGE_DRAW_REPEAT_Y()),
  
  /**
   * 垂直方向平铺显示，水平方向缩放(从底部到顶部)。
   *
   */
 
  REPEAT_Y_INVERSE (IMAGE_DRAW_REPEAT_Y_INVERSE()),
  
  /**
   * 9宫格显示。
   *将图片分成等大小的9块，4个角按原大小显示在目标矩形的4个角，左右上下和中间5块分别缩放显示在对应的目标区域。
   *
   */
 
  PATCH9 (IMAGE_DRAW_PATCH9()),
  
  /**
   * 水平方向3宫格显示，垂直方向居中显示。
   *将图片在水平方向上分成等大小的3块，左右两块按原大小显示在目标矩形的左右，中间一块缩放显示在目标区域中间剩余部分。
   *
   */
 
  PATCH3_X (IMAGE_DRAW_PATCH3_X()),
  
  /**
   * 垂直方向3宫格显示，水平方向居中显示。
   *将图片在垂直方向上分成等大小的3块，上下两块按原大小显示在目标矩形的上下，中间一块缩放显示在目标区域中间剩余部分。
   *
   */
 
  PATCH3_Y (IMAGE_DRAW_PATCH3_Y()),
  
  /**
   * 水平方向3宫格显示，垂直方向缩放显示。
   *将图片在水平方向上分成等大小的3块，左右两块按原大小显示在目标矩形的左右，中间一块缩放显示在目标区域中间剩余部分。
   *
   */
 
  PATCH3_X_SCALE_Y (IMAGE_DRAW_PATCH3_X_SCALE_Y()),
  
  /**
   * 垂直方向3宫格显示，水平方向缩放显示。
   *将图片在垂直方向上分成等大小的3块，上下两块按原大小显示在目标矩形的上下，中间一块缩放显示在目标区域中间剩余部分。
   *
   */
 
  PATCH3_Y_SCALE_X (IMAGE_DRAW_PATCH3_Y_SCALE_X()),
  
  /**
   * 平铺9宫格显示。
   *将图片分成4个角和5块平铺块，4个角按原大小显示在目标矩形的4个角，其余5块会平铺对应的目标区域。
   *切割方法为（如下图）：
   *如果图片宽度为奇数，则中间一块为一列数据，如果图片宽度为偶数，则中间一块为二列数据，其他数据分为左右块
   *如果图片高度为奇数，则中间一块为一行数据，如果图片高度为偶数，则中间一块为二行数据，其他数据分为上下块
   *中间一块数据根据上面两条规则组成4中情况，分别是一列一行数据，一列两行数据，两列一行数据和两行两列数据
   *
   */
 
  REPEAT9 (IMAGE_DRAW_REPEAT9()),
  
  /**
   * 水平方向3宫格显示，垂直方向居中显示。
   *将图片在水平方向上分成左右相等两块和中间一块，如果图片宽度为奇数，则中间一块为一列数据，如果图片宽度为偶数，则中间一块为二列数据，其他数据分为左右块。
   *左右两块按原大小显示在目标矩形的左右，中间一列像素点平铺显示在目标区域中间剩余部分。
   *
   */
 
  REPEAT3_X (IMAGE_DRAW_REPEAT3_X()),
  
  /**
   * 垂直方向3宫格显示，水平方向居中显示。
   *将图片在垂直方向上分成上下相等两块和中间一块，如果图片高度为奇数，则中间一块为一行数据，如果图片高度为偶数，则中间一块为二行数据，其他数据分为上下块
   *上下两块按原大小显示在目标矩形的上下，中间一块平铺显示在目标区域中间剩余部分。
   *
   */
 
  REPEAT3_Y (IMAGE_DRAW_REPEAT3_Y());
 
 
  private TImageDrawType(int value) {
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
  public static TImageDrawType from(int value) {
    for(TImageDrawType iter : TImageDrawType.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return DEFAULT;
  }
  
  private int value;

  static private native int IMAGE_DRAW_DEFAULT();
  static private native int IMAGE_DRAW_CENTER();
  static private native int IMAGE_DRAW_ICON();
  static private native int IMAGE_DRAW_SCALE();
  static private native int IMAGE_DRAW_SCALE_AUTO();
  static private native int IMAGE_DRAW_SCALE_DOWN();
  static private native int IMAGE_DRAW_SCALE_W();
  static private native int IMAGE_DRAW_SCALE_H();
  static private native int IMAGE_DRAW_FILL();
  static private native int IMAGE_DRAW_REPEAT();
  static private native int IMAGE_DRAW_REPEAT_X();
  static private native int IMAGE_DRAW_REPEAT_Y();
  static private native int IMAGE_DRAW_REPEAT_Y_INVERSE();
  static private native int IMAGE_DRAW_PATCH9();
  static private native int IMAGE_DRAW_PATCH3_X();
  static private native int IMAGE_DRAW_PATCH3_Y();
  static private native int IMAGE_DRAW_PATCH3_X_SCALE_Y();
  static private native int IMAGE_DRAW_PATCH3_Y_SCALE_X();
  static private native int IMAGE_DRAW_REPEAT9();
  static private native int IMAGE_DRAW_REPEAT3_X();
  static private native int IMAGE_DRAW_REPEAT3_Y();

}
