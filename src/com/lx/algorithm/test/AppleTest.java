package com.lx.algorithm.test;
import java.util.Scanner;
/**
 * title： com.lx.algorithm.test
 * @author： lixing
 * date： 2018/8/23 16:11
 * description：苹果数目计算
 */
public class AppleTest {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            int m=cin.nextInt();
            int n=cin.nextInt();
            if(m<1||n>10){
                System.out.println(-1);
            }
            System.out.println(dealApple(m,n));
        }
    }

    public static int dealApple(int m, int n){

        if(m<0){
            return 0;
        }

        if(m==0||m==1||n==1){
            return 1;
        }

        if(n>m){
            return dealApple(m, m);
        }

        else{
            return dealApple(m,n-1)+dealApple(m-n, n);
        }
    }
}
