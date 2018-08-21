package com.lx.algorithm;
import java.util.Arrays;
import java.util.Scanner;
/**
 * title： com.lx.algorithm
 * @author： lixing
 * date： 2018/8/21 14:03
 * description：计算一个字符串的里面的各个字符数目然后计算名字最大漂亮度.
 */
public class CharNumbers {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int N = cin.nextInt();
            String[] str = new String[N];
            for (int i = 0; i < N; i++) {
                str[i] = cin.next();
            }
            for (int i = 0; i < N; i++) {
                int[] count = new int[26];
                for(int j=0;j<str[i].length();j++){
                    int asc = str[i].charAt(j);
                    if (asc >= 'a' && asc <= 'z') {
                        count[asc - 97]++;
                    } else if (asc >= 'A' && asc <= 'Z') {
                        count[asc - 65]++;
                    }
                }
                // 排序,升序排序
                Arrays.sort(count);
                int result=0;
                for(int k=0;k<26;k++){
                    result+=count[k]*(k+1);
                }
                System.out.println(result);
            }

        }
        cin.close();
    }
}
