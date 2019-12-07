package awtk;

public class AssetsManager {
 public long nativeObj;

 public AssetsManager(long nativeObj) {
   this.nativeObj = nativeObj;
 }

 static public AssetsManager cast(long nativeObj) {
   return new AssetsManager(nativeObj);
 }

 public  static AssetsManager instance()  {
   return new AssetsManager(assets_manager());
 }

 public  AssetInfo ref(AssetType type, String name)  {
   return new AssetInfo(assets_manager_ref(this.nativeObj, type.value(), name));
 }

 public  Ret unref(AssetInfo info)  {
   return Ret.from(assets_manager_unref(this.nativeObj, info != null ? (info.nativeObj) : 0));
 }

static private native long assets_manager();
static private native long assets_manager_ref(long am, int type, String name);
static private native int assets_manager_unref(long am, long info);
}

