package com.lx.algorithm.study;
import java.util.Scanner;
/**
 * title： com.lx.algorithm.study
 * @author： lixing
 * date： 2018/9/1 22:35
 * description：判断一个数是否是完全平方数.
 * 数学定理:一个完全平方数:可以表示为一个连续的奇数和.
 */
public class isPerfectSquare {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            int num=cin.nextInt();
            System.out.println(isPerfectSquare(num));
        }
    }
    public static boolean isPerfectSquare(int num){
        int i=1;
        while(num>0){
            num-=i;
            i+=2;
        }
        return num==0;
    }
}
