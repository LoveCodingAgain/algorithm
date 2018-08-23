package com.lx.algorithm;
import java.util.Scanner;
/**
 * title： com.lx.algorithm
 * @author： lixing
 * date： 2018/8/23 15:34
 * description：PrimeNumber的数字.
 * 任何一个合数都可以有两个素数相加组成.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()) {
            int num = cin.nextInt();
            int[] res = new int[2];
            for (int i = 2; i <= num / 2; i++) {
                if (isPrime(i) && isPrime(num - i)) {
                    res[0] = i;
                    res[1] = num - i;
                }
            }
            System.out.println(res[0]);
            System.out.println(res[1]);
        }
    }

    public static boolean isPrime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
