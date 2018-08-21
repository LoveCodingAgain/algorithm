package com.lx.algorithm;
import java.util.Scanner;
/**
 * title： com.lx.algorithm
 * @author： lixing
 * date： 2018/8/21 17:43
 * description：计算排序,结合ASCLL码来计算数据和第一个值的比价.
 */
public class LilySort {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            String str=cin.nextLine();
            char[] chars=str.toCharArray();
            // ASCII码表中从'0'--'z'的字符个数:'0'--48,'z'--122
            int[] arr = new int[75];
            for(int i=0;i<chars.length;i++){
                // 每一个相同的元素有几个.
                arr[chars[i]-'0']++;
            }
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i];j++){
                    System.out.print((char)(i+'0'));
                }
            }
            System.out.println();
        }
        cin.close();
    }
}
