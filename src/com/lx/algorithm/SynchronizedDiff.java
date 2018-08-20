package com.lx.algorithm;
/**
 * title： com.lx.algorithm
 * @author： lixing
 * date： 2018/8/20 13:54
 * description：对象锁和类锁的区别
 * 对象锁和类锁是不同的锁，所以多个线程同时执行这2个不同锁的方法时，是异步的.
 * 对象锁和类锁互不影响.
 * 互斥锁,synchronized方法执行完毕后,或出现异常就自动释放锁.
 */
public class SynchronizedDiff {
    public static void main(String[] args) {
        ThreadA a=new ThreadA(new Service());
        ThreadB b=new ThreadB(new Service());
        a.setName("A");
        b.setName("B");
        a.start();
        b.start();
    }
}
class ThreadA extends Thread{
    private Service service;
    public ThreadA(Service service){
        super();
        this.service=service;
    }

    @Override
    public void run(){
        service.synMethod1();
    }
}
class ThreadB extends Thread{
    private Service service;
    public ThreadB(Service service){
        super();
        this.service=service;
    }

    @Override
    public void run(){
        service.synMethod2();
    }
}

class ThreadC extends Thread{

    @Override
    public void run(){
        Service.synTest();
    }
}