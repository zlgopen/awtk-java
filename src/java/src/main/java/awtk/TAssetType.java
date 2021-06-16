package awtk;



/**
 * 资源类型常量定义。
 *
 */

public enum TAssetType {
  
  /**
   * 无效资源。
   *
   */
 
  NONE (ASSET_TYPE_NONE()),
  
  /**
   * 字体资源。
   *
   */
 
  FONT (ASSET_TYPE_FONT()),
  
  /**
   * 图片资源。
   *
   */
 
  IMAGE (ASSET_TYPE_IMAGE()),
  
  /**
   * 窗体样式资源。
   *
   */
 
  STYLE (ASSET_TYPE_STYLE()),
  
  /**
   * UI数据资源。
   *
   */
 
  UI (ASSET_TYPE_UI()),
  
  /**
   * XML数据资源。
   *
   */
 
  XML (ASSET_TYPE_XML()),
  
  /**
   * 字符串数据资源。
   *
   */
 
  STRINGS (ASSET_TYPE_STRINGS()),
  
  /**
   * JS等脚本资源。
   *
   */
 
  SCRIPT (ASSET_TYPE_SCRIPT()),
  
  /**
   * 流图资源。
   *
   */
 
  FLOW (ASSET_TYPE_FLOW()),
  
  /**
   * 其它数据资源。
   *
   */
 
  DATA (ASSET_TYPE_DATA());
 
 
  private TAssetType(int value) {
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
  public static TAssetType from(int value) {
    for(TAssetType iter : TAssetType.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return NONE;
  }
  
  private int value;

  static private native int ASSET_TYPE_NONE();
  static private native int ASSET_TYPE_FONT();
  static private native int ASSET_TYPE_IMAGE();
  static private native int ASSET_TYPE_STYLE();
  static private native int ASSET_TYPE_UI();
  static private native int ASSET_TYPE_XML();
  static private native int ASSET_TYPE_STRINGS();
  static private native int ASSET_TYPE_SCRIPT();
  static private native int ASSET_TYPE_FLOW();
  static private native int ASSET_TYPE_DATA();

}
