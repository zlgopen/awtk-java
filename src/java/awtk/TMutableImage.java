package awtk;


/**
 * mutable图片控件。
 *
 *像摄像头和视频的图像是变化的，每一帧都不同，我们把这类图片称为mutable image。
 *
 *本控件辅助实现摄像头和视频的显示功能。
 *
 *mutable\_image\_t是[image\_base\_t](image_base_t.md)的子类控件，image\_base\_t的函数均适用于mutable\_image\_t控件。
 *
 *在xml中使用"mutable\_image"标签创建mutable图片控件。如：
 *
 *```xml
 *<mutable_image w="100%" h="100%"/>
 *```
 *
 *>更多用法请参考：
 *[mutable
 *image](https://github.com/zlgopen/awtk/blob/master/demos/assets/default/raw/ui/mutable_image.xml)
 *
 *在c代码中使用函数mutable\_image\_create创建mutable图片控件。如：
 *
 *
 *> 创建之后:
 *>
 *> 需要用mutable\_image\_set\_prepare\_image设置准备图片的回调函数。
 *
 *> 完整示例请参考：[mutable image demo](
 *https://github.com/zlgopen/awtk-c-demos/blob/master/demos/mutable_image.c)
 *
 *一般不需通过style来设置控件的显示风格，如果在特殊情况下需要，可以参考其它控件。
 *
 */
public class TMutableImage extends TImageBase { 

/**
 * 通过nativeObj构造Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 public TMutableImage(long nativeObj) {
   super(nativeObj);
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TMutableImage cast(long nativeObj) {
   return new TMutableImage(nativeObj);
 }

};