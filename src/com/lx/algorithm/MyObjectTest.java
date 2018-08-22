package com.lx.algorithm;
/**
 * title： com.lx.algorithm
 * @author： lixing
 * date： 2018/8/22 13:06
 * description：测试单列.使用对象的hashcode().
 */
public class MyObjectTest {
    public static void main(String[] args) {
        MyObjectThread t1=new MyObjectThread();
        MyObjectThread t2=new MyObjectThread();
        MyObjectThread t3=new MyObjectThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
class MyObjectThread extends Thread{
    @Override
    public void run(){
        System.out.println(MyObject.getInstance().hashCode());
    }
}
