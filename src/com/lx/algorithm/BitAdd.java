package com.lx.algorithm;
import java.util.Scanner;
/**
 * title： com.lx.algorithm
 * @author： lixing
 * date： 2018/8/19 0:05
 * description：使用异或,与,左移
 * 两数异或相当于对相当于每一位相加，而不考虑进位.
 * 两个数相与,并左移一位：相当于求得进位.
 */
public class BitAdd {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int num1=cin.nextInt();
        int num2=cin.nextInt();
        System.out.println(add(num1, num2));
        // System.out.println(negNum(-3));
        System.out.println(mins(num1, num2));
    }
    /** 加法*/
    public static int add(int num1, int num2){
        int sum=num1^num2;
        int carry=(num1&num2)<<1;
        return sum+carry;
    }
    /** 负数取反*/
    public static int negNum(int n){
        return add(~n,1);
    }
    /** 减法*/
    public static int mins(int num1, int num2){
        return add(num1,negNum(num2));
    }
}
