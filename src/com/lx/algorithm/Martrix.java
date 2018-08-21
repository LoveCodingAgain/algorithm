package com.lx.algorithm;
import java.util.Scanner;
/**
 * title： com.lx.algorithm
 * @author： lixing
 * date： 2018/8/21 16:10
 * description：蛇形矩阵(上三角矩阵),解题思路,注意每行的第一个数字.和递增规律,以及每行的格式.
 */
public class Martrix {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
            while(cin.hasNext()) {
                int n = cin.nextInt();
                int first_cols = 1;
                for (int i = 1; i <= n; i++) {
                    System.out.print(first_cols);
                    int temp = first_cols;
                    for (int j = i + 1; j <= n; j++) {
                        temp += j;
                        System.out.print(" " + temp);
                    }
                    System.out.println();
                    first_cols += i;
                }
            }
        cin.close();
    }
}