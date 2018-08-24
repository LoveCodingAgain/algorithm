package com.lx.algorithm.study;
import java.util.Scanner;
/**
 * title： com.lx.algorithm.study
 * @author： lixing
 * date： 2018/8/24 12:20
 * description：局部逆序交换实现.
 * intput： 输入一个字符串和一个要交换的数组.空间复杂度为O(1).
 */
public class ChangeStr {

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String str=cin.next();
        int n=cin.nextInt();
        System.out.println(reverseStr(str, n));
    }

    public static String reverseStr(String str, int n){
        if(str==null||n<0||str.length()<=n){
            System.out.println(str);
        }
        char[] chars=str.toCharArray();
        reverseCharArray(chars,0,n);
        reverseCharArray(chars,n+1,str.length()-1);
        reverseCharArray(chars, 0, str.length()-1);
        return new String (chars);
    }

    /** 字符数组局部逆序*/
    public static  void reverseCharArray(char[] charArray, int begin, int end){
        char temp;
        while(begin<end){
          temp=charArray[begin];
          charArray[begin]=charArray[end];
          charArray[end]=temp;
          begin++;
          end--;
        }
    }
}
