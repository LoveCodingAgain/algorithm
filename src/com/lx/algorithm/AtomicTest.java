package com.lx.algorithm;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
/**
 * title： com.lx.algorithm
 * @author： lixing
 * date： 2018/8/18 13:54
 * description：Atomic实现原子操作的线程安全的计数器,只能原子更新一个共享变量,
 */
public class AtomicTest {
    public static final AtomicLong count = new AtomicLong(0L);

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        MyThread myThread = null;
        for(int i = 0;i<1000;i++){
            myThread = new MyThread(count);
            executorService.submit(myThread);
        }
        executorService.shutdown();
        System.out.println(count.get());
    }
}

class MyThread extends Thread {
    private AtomicLong count;

    public MyThread(AtomicLong count){
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "正在执行。。。");
        // ++num;
        System.out.println(count.incrementAndGet());
    }
}
