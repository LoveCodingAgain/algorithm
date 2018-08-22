package com.lx.algorithm;
/**
 * title： com.lx.algorithm
 * @author： lixing
 * date： 2018/8/22 12:43
 * description：DCL双检查机制.
 * 1.分配对象的内存空间.
 * 2.初始化对象.
 * 3.设置instance引用指向内存地址.
 * 解决方法就是说2,3不能重排序.
 * 2,3可以重排序,但是要保证这个可以共享变量让其他线程实时看到结果.
 */
public class MyObject {
    private volatile static MyObject myObject;

    private MyObject() {
    }

    public static MyObject getInstance() {
        try {
            // 第一次检查如果对象不为空,那么就不需要执行加锁和初始化.降低了synchronized带来的性能开销.
            if(myObject==null){
                Thread.sleep(3000);
                // 加锁
                synchronized (MyObject.class) {
                    if (myObject == null) {
                        // 初始化
                        myObject = new MyObject();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
