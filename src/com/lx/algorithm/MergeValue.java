package com.lx.algorithm;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
/**
 * title： com.lx.algorithm
 * @author： lixing
 * date： 2018/8/21 15:26
 * description：合并数据表,注意输出按照key进行升序排序.
 */
public class MergeValue {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
            int n=cin.nextInt();
            for(int i=0;i<n;i++){
                int s=cin.nextInt();
                int value=cin.nextInt();
                if(map.containsKey(s)){
                    map.put(s, map.get(s)+value);
                }else{
                    map.put(s, value);
                }
            }
            for(Map.Entry entry:map.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    }
}
