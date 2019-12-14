package awtk;


/**
 * 单个资源的描述信息。
 *
 */
public class AssetInfo {
 public long nativeObj;

 public AssetInfo(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public AssetInfo cast(long nativeObj) {
   return new AssetInfo(nativeObj);
 }

 public int getType() {
   return asset_info_t_get_prop_type(this.nativeObj);
 }

 public int getSubtype() {
   return asset_info_t_get_prop_subtype(this.nativeObj);
 }

 public int getIsInRom() {
   return asset_info_t_get_prop_is_in_rom(this.nativeObj);
 }

 public int getSize() {
   return asset_info_t_get_prop_size(this.nativeObj);
 }

 public int getRefcount() {
   return asset_info_t_get_prop_refcount(this.nativeObj);
 }

 public String getName() {
   return asset_info_t_get_prop_name(this.nativeObj);
 }

static private native int asset_info_t_get_prop_type(long nativeObj);
static private native int asset_info_t_get_prop_subtype(long nativeObj);
static private native int asset_info_t_get_prop_is_in_rom(long nativeObj);
static private native int asset_info_t_get_prop_size(long nativeObj);
static private native int asset_info_t_get_prop_refcount(long nativeObj);
static private native String asset_info_t_get_prop_name(long nativeObj);
}

