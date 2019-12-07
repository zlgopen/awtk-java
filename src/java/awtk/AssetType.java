package awtk;


public enum AssetType {
  NONE (ASSET_TYPE_NONE()),
  FONT (ASSET_TYPE_FONT()),
  IMAGE (ASSET_TYPE_IMAGE()),
  STYLE (ASSET_TYPE_STYLE()),
  UI (ASSET_TYPE_UI()),
  XML (ASSET_TYPE_XML()),
  STRINGS (ASSET_TYPE_STRINGS()),
  SCRIPT (ASSET_TYPE_SCRIPT()),
  DATA (ASSET_TYPE_DATA());
 
   
  private int value;
  AssetType(int value) {
    this.value = value;
  }
  public int value() {
    return this.value;
  }

  public static AssetType from(int value) {
    for(AssetType iter : AssetType.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return NONE;
  }

  static private native int ASSET_TYPE_NONE();
  static private native int ASSET_TYPE_FONT();
  static private native int ASSET_TYPE_IMAGE();
  static private native int ASSET_TYPE_STYLE();
  static private native int ASSET_TYPE_UI();
  static private native int ASSET_TYPE_XML();
  static private native int ASSET_TYPE_STRINGS();
  static private native int ASSET_TYPE_SCRIPT();
  static private native int ASSET_TYPE_DATA();

}
