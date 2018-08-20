package com.lx.algorithm;
/**
 * title： com.lx.algorithm
 * @author： lixing
 * date： 2018/8/20 11:58
 * description：Java多线程死锁,线程A持有了锁A,等待获取锁B.
 */
public class DeathLock {
    public static void main(String[] args) {
        final Object a=new Object();
        final Object b=new Object();
        Thread threadA=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (a){
                    System.out.println("now in lock a class");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (b){
                        System.out.println("now in lock b class");
                    }
                }
            }
        });
        Thread threadB=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (b){
                    System.out.println("now in lock b class");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (a){
                        System.out.println("now in lock a class");
                    }
                }
            }
        });
        threadA.start();
        threadB.start();
    }
}
