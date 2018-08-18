package com.lx.algorithm;
/**
 * title： com.lx.algorithm
 * @author： lixing
 * date： 2018/8/18 13:14
 * description：测试线程的Join方法.将自定义线程加入当前执行的主线程里面,直到自定义线程执行完毕后,主线程才继续执行的..join(有参数)如果自定义线程的执行时间内,自定义没有执行完成任务,自定义就切换执行主线程.
 *
 */
public class ThreadJoinTest implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new ThreadJoinTest());
        thread.start();
        // 主线程只等待自定义线程2000ms
        thread.join(2000);
        System.out.println("主线程执行完毕!");
        Thread.sleep(3000);
        System.out.println("主线程继续执行!");
    }

    @Override
    public void run() {
        System.out.println("子线程开始执行!");
        for (int i = 0; i <5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("当前执行线程:"+i);
        }
        System.out.println("子线程结束执行！");
        try {
            // 自定义线程休眠3000ms
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
