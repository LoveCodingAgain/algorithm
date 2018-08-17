package com.lx.algorithm;
import java.util.Scanner;
/**
 * title： com.lx.algorithm
 * @author： lixing
 * date： 2018/8/17 12:34
 * description：计算兔子数
 */
public class CountRabbit {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int mouth=cin.nextInt();
        int m1=1;
        int m2=1;
        if(mouth==1||mouth==2){
            System.out.println(1);
        }else {
            for (int i = 3; i <= mouth; i++) {
                int temp = m2;
                m2 = m1 + m2;
                m1 = temp;
            }
            System.out.println(m2);
        }
    }
}
