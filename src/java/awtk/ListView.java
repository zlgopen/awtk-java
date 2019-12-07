package awtk;

public class ListView extends Widget {
 public ListView(long nativeObj) {
   super(nativeObj);
 }

 static public ListView cast(long nativeObj) {
   return new ListView(nativeObj);
 }

 public  static Widget create(Widget parent, int x, int y, int w, int h)  {
   return new ListView(list_view_create(parent != null ? (parent.nativeObj) : 0, x, y, w, h));
 }

 public  Ret setItemHeight(int item_height)  {
   return Ret.from(list_view_set_item_height(this.nativeObj, item_height));
 }

 public  Ret setDefaultItemHeight(int default_item_height)  {
   return Ret.from(list_view_set_default_item_height(this.nativeObj, default_item_height));
 }

 public  Ret setAutoHideScrollBar(boolean auto_hide_scroll_bar)  {
   return Ret.from(list_view_set_auto_hide_scroll_bar(this.nativeObj, auto_hide_scroll_bar));
 }

 public  static Widget cast(Widget widget)  {
   return new ListView(list_view_cast(widget != null ? (widget.nativeObj) : 0));
 }

 public int getItemHeight() {
   return list_view_t_get_prop_item_height(this.nativeObj);
 }

 public int getDefaultItemHeight() {
   return list_view_t_get_prop_default_item_height(this.nativeObj);
 }

 public boolean getAutoHideScrollBar() {
   return list_view_t_get_prop_auto_hide_scroll_bar(this.nativeObj);
 }

static private native long list_view_create(long parent, int x, int y, int w, int h);
static private native int list_view_set_item_height(long widget, int item_height);
static private native int list_view_set_default_item_height(long widget, int default_item_height);
static private native int list_view_set_auto_hide_scroll_bar(long widget, boolean auto_hide_scroll_bar);
static private native long list_view_cast(long widget);
static private native int list_view_t_get_prop_item_height(long nativeObj);
static private native int list_view_t_get_prop_default_item_height(long nativeObj);
static private native boolean list_view_t_get_prop_auto_hide_scroll_bar(long nativeObj);
}

