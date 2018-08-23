package com.lx.algorithm;
import java.util.Scanner;
/**
 * title： com.lx.algorithm
 * @author： lixing
 * date： 2018/8/21 18:10
 * description：JAVA大数据计算乘法.
 */
public class BigNumberTest {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String num1=cin.nextLine();
        String num2=cin.nextLine();
        // 存储结果数组
        int len1=num1.length();
        int len2=num2.length();
        int[] resultArray=new int[len1+len2];
        // 存储进位
        int carry=0;
        // 计算两数相乘
        for(int i=len1-1;i>=0;i--){
            // 获取该位数字
            int tempNum1=num1.charAt(i)-'0';

            for(int j=len2-1;j>=0;j--){
                int tempNum2=num2.charAt(j)-'0';

                int sum=resultArray[i+j+1]+tempNum1*tempNum2+carry;
                // 计算向上一位的进位
                carry=sum/10;
                // 进位后的值
                resultArray[i+j+1]=sum%10;
            }
            // 计算一次循环后.复制给前面
            if(carry!=0){
                resultArray[i]=carry;
            }
            // 清零
            carry=0;
        }
        StringBuilder builder=new StringBuilder();
        if(resultArray[0]!=0){
            builder.append(resultArray[0]);
        }
        for(int z=1;z<resultArray.length;z++){
            builder.append(resultArray[z]);
        }
        System.out.println(builder.toString());
        cin.close();
    }
}
