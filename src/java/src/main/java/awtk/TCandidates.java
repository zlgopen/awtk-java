package awtk;


/**
 * 输入法候选字词控件。
 *
 *如果希望启用用数字选择对应的候选字，请设置属性grab_keys="true"。如：
 *
 *```xml
 *<candidates x="0" y="0" w="100%" h="30" grab_keys="true"/>
 *```
 *
 *>相关文件： assets/default/raw/ui/kb_default.xml
 *
 *如果希望通过左右键切换不同的候选字，除了设置属性grab_keys="true"，还需要设置按钮的focused状态的style。
 *
 *```xml
 *<style name="candidates" text_color="black">
 *<normal  />
 *<pressed    bg_color="#c0c0c0" border_color="#a0a0a0"/>
 *<over       bg_color="#e0e0e0" border_color="#a0a0a0"/>
 *<focused    border_color="#a0a0a0"/>
 *</style>
 *```
 *
 *>相关文件：assets/default/raw/styles/keyboard.xml
 *
 */
public class TCandidates extends TWidget { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TCandidates(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TCandidates cast(long nativeObj) {
   return new TCandidates(nativeObj);
 }


  /**
   * 转换为candidates对象(供脚本语言使用)。
   * 
   * @param widget candidates对象。
   *
   * @return candidates对象。
   */
 public  static TCandidates cast(TWidget widget)  {
    return new TCandidates(candidates_cast(widget != null ? (widget.nativeObj) : 0));
 }

static private native long candidates_cast(long widget);
};