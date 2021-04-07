package awtk;


/**
 * 循环记录日志(支持多线程访问)。
 *如果我们把日志写入文件中，随着时间的推移，日志文件会越来越大，最终占满这个磁盘，出现不可预料的错误。
 *rlog提供一个循环记录日志的功能，让日志文件始终不会超出指定的大小，达到指定大小后再从头开始写。
 *
 *> 为了实现简单，我们把日志文件分成0和1两个文件，先写文件0，到达指定最大值的一半时，再写文件1。
 *> 文件1到达指定最大值的一半时，删除文件0，并将文件1改名为文件0，重新创建文件1，继续写文件1，重复此过程。
 *
 */
public class TRlog { 

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
 public TRlog(long nativeObj) {
   this.nativeObj = nativeObj;
 }


/**
 * 把nativeObj转换层Java对象。
 *
 * @param nativeObj 原生对象。

 * @return 对应的Java对象。
 */
 static public TRlog cast(long nativeObj) {
   return new TRlog(nativeObj);
 }


  /**
   * rlog_t* log = rlog_create("./logs/%d.log", 1020*1024, 256);
   *rlog_write(log, "hello\n");
   *rlog_destroy(log);
   *```
   * 
   * @param filename_pattern 用来确定文件名的路径和文件名。
   * @param max_size log文件占用最大磁盘空间(字节)。
   * @param buff_size 用于指定print时的buff大小。
   *
   * @return 返回rlog对象。
   */
 public  static TRlog create(String filename_pattern, int max_size, int buff_size)  {
    return new TRlog(rlog_create(filename_pattern, max_size, buff_size));
 }


  /**
   * 写入一条日志记录。
   * 
   * @param str 日志字符串。
   *
   * @return 返回RET_OK表示成功，否则表示失败。
   */
 public  TRet write(String str)  {
   return TRet.from(rlog_write(this != null ? (this.nativeObj) : 0, str));
 }

static private native long rlog_create(String filename_pattern, int max_size, int buff_size);
static private native int rlog_write(long log, String str);
};