package com.lx.algorithm;
import java.util.Stack;
/**
 * title： com.lx.algorithm
 * @author： lixing
 * date： 2018/8/18 18:47
 * description：辅助栈和数据栈结合使用,时间复杂度在O(1).
 */
public class MinStack {
    /** 数据栈**/
    private static Stack<Integer> dataStack=new Stack<Integer>();
    /** 辅助栈**/
    private static Stack<Integer> minStack=new Stack<Integer>();
    /** 辅助变量*/
    private static Integer temp=null;

    public static void main(String[] args) {
         MinStack.push(3);
         MinStack.push(4);
         MinStack.push(2);
         MinStack.push(5);
         MinStack.push(1);
         System.out.println(MinStack.min());
    }

    public static void push(int node){
        dataStack.push(node);
        if(minStack.isEmpty()){
            minStack.push(node);
            temp=node;
        }else{
            // temp作为栈顶的元素
            temp=minStack.peek();
            // 当前新入栈节点小于最小栈的栈顶元素
            if(node<=temp){
                // 将该节点入栈
                minStack.push(node);
                // 该节点作为临时节点.
                temp=node;
            }else{
                // 如果新增的元素大于栈顶的元素,就继续将当前最小栈的元素入栈
                minStack.push(temp);
            }
        }
    }
    public static void pop()
    {
        dataStack.pop();
        minStack.pop();
    }

    public static  int top()
    {
        return dataStack.peek();
    }

    public static int min()
    {
        return minStack.peek();
    }
}
