package com.lx.algorithm;
import java.util.Arrays;
import java.util.LinkedList;
/**
 * title： com.lx.algorithm
 * @author： lixing
 * date： 2018/8/16 22:26
 * description：sy
 */
public class GetNumber {
    public static void main(String[] args) {
      int[] numbers=new int[]{1,5,7,2,4,8,4,23};
        Arrays.sort(numbers);
        LinkedList<Integer> linkedList =init(numbers);
        getNumber(linkedList);
    }
    public static LinkedList init(int[] numbers){
        // 首先将拍好序的元素插入队列里面,有大到小
        LinkedList<Integer> linkedList=new LinkedList<>();
        for(int i=numbers.length-1;i>=0;i--){
            linkedList.offer(numbers[i]);
        }
        return linkedList;
    }

    public static void getNumber(LinkedList linkedList){
        LinkedList<Integer> list=linkedList;
        // 首先是返回当前的对首元素后然后删除.
        System.out.println(list.poll());
        System.out.println("当前的对首元素是:"+list.peek());
    }
}
