package com.lx.algorithm;
import java.util.Scanner;
/**
 * title： com.lx.algorithm
 * @author： lixing
 * date： 2018/8/17 11:48
 * description：字符串的截取
 */
public class SubString {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()) {
            int n = cin.nextInt();
            System.out.println(calNumber(n));
        }
        cin.close();
    }
    public static int CalcAutomorphicNumbers(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            String str1=String.valueOf(i);
            String str2=String.valueOf(i*i);
            if(str1.equals(str2.substring(str2.length()-str1.length(),str2.length()))){
                count++;
            }
        }
        return count;
    }
    public static int calNumber(int n){
        int count=0;
        for(int i=0;i<=n;i++){
            String str1=String.valueOf(i);
            String str2=String.valueOf(i*i);
            if(str2.endsWith(str1)){
                count++;
            }
        }
        return count;
    }
}
