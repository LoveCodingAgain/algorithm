package com.lx.algorithm;
/**
 * title： com.lx.algorithm
 * @author： lixing
 * date： 2018/8/20 14:01
 * description：测试对象锁和类锁的业务方法.
 */
public class Service {

    synchronized public  static void synMethod1(){
        System.out.println("线程名称为:"+Thread.currentThread().getName()+" 在"+System.currentTimeMillis()+"进入方法synMethod1");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("执行对象锁里面的业务!");
        System.out.println("线程名称为:"+Thread.currentThread().getName()+" 在"+System.currentTimeMillis()+"离开方法synMethod1");
    }
    synchronized public static void synMethod2(){
        System.out.println("线程名称为:"+Thread.currentThread().getName()+" 在"+System.currentTimeMillis()+"进入方法synMethod2");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("执行对象锁里面的业务!");
        System.out.println("线程名称为:"+Thread.currentThread().getName()+" 在"+System.currentTimeMillis()+"离开方法synMethod2");
    }


    synchronized public static void synTest(){
        System.out.println("线程名称为:"+Thread.currentThread().getName()+" 在"+System.currentTimeMillis()+"进入方法synTest()");
        System.out.println("执行类锁里面的业务!");
        System.out.println("线程名称为:"+Thread.currentThread().getName()+" 在"+System.currentTimeMillis()+"离开方法synTest()");
    }
}
