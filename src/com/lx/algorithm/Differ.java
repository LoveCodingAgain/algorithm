package com.lx.algorithm;
import java.util.Arrays;
import java.util.Scanner;
/**
 * title： com.lx.algorithm
 * @author： lixing
 * date： 2018/8/18 23:25
 * description：输入包括三个整数A ，B，C（0 <= A，B，C <= 100).
 *  例1: (2, 4, 5) -> (3, 5, 5) -> (5, 5, 5)
    需 (n1 + (n2 - n1) / 2) 次操作
    例2: (1, 4, 5) -> (2, 5, 5) -> (4, 5, 5) -> (6, 5, 5) -> (6, 6, 6)
    需 (n1 + (n2 - n1) / 2 + 2) 次操作
 */
public class Differ {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int[] num=new int[3];
        for(int i=0;i<num.length;i++){
            num[i]=cin.nextInt();
        }
        int n1=num[2]-num[0];
        int n2=num[2]-num[1];
        Arrays.sort(num);
        int count=0;
        // 如果是两个数的差为奇数的时候,要另外进行两步加1操作.
        if((n1-n2)%2==1){
            count=n2+(n1-n2)/2+2;
        }else{
            // 两个数的差为偶数,就只进行第一个最小数的加2操作
            count=n2+(n1-n2)/2;
        }
        System.out.println(count);
    }
}
