package com.lx.algorithm;
/**
 * title： com.lx.algorithm
 * @author： lixing
 * date： 2018/8/20 11:58
 * description：Java多线程死锁,线程A持有了锁A,等待获取锁B.所对象.
 * Synchronized的锁重入,防止死锁.
 * A线程调用对象加入synchronized关键字的方法时,就获得了对象锁.
 * B线程调用的使用就只能等待了.因为一个对象一把锁.
 */
public class DeathLock {
    public static void main(String[] args) {
        final Object a=new Object();
        final Object b=new Object();
        Thread threadA=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (a){
                    System.out.println("now in lockA a class");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (b){
                        System.out.println("now in lockA b class");
                    }
                }
            }
        });
        Thread threadB=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (b){
                    System.out.println("now in lockB b class");
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (a){
                        System.out.println("now in lockB a class");
                    }
                }
            }
        });
        threadA.start();
        threadB.start();
    }
}
