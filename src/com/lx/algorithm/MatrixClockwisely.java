package com.lx.algorithm;
import java.util.ArrayList;
/**
 * title： com.lx.algorithm
 * @author： lixing
 * date： 2018/8/20 20:56
 * description：一圈为（startX,startY),那么每行最多有(startY-1)*2个元素，每列最多有(startX-1)*2个元素，因此rows>startY*2并且columns>startX*2.
 */
public class MatrixClockwisely {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> printMatrixClockwisely(int[][] nums ){
        ArrayList<Integer> list=new ArrayList<Integer>();
        // 获取二维数组的行数和列数
        int rows=nums.length;
        int cols=nums[0].length;
        if(nums==null||cols<=0||rows<=0){
            return null;
        }
        // 左上角坐标
        int start=0;
        // 判断循环是否继续
        while(cols>start*2&&rows>start*2){
            printMatrixInCircle(list, nums, cols, rows, start);
            // 循环的内圈的坐标+1
            ++start;
        }
        return list;
    }

    public static void printMatrixInCircle(ArrayList list,int[][] nums, int cols,int rows, int start){
        // 获取结束坐标
        int endX=rows-1-start;
        int endY=cols-1-start;
        // 分别打印一圈的四个边
        // 首先是从左到右
        for(int i=start;i<=endX;i++){
            list.add(nums[start][i]);
        }
        // 从上到下遍历,前提条件是终止行号大于起始行号
        if(start<endY) {
            for (int i = start + 1; i <= endY; i++) {
                list.add(nums[i][endX]);
            }
        }
        // 从右到左遍历,前提条件终止行号大于起始行号,终止列号大于起始列号.
        if(start<endX&& start<endY){
            for(int i=endX-1;i>=start;i--){
                list.add(nums[endY][i]);
            }
        }
        // 从下到上遍历
        if(start<endY&&start<endX-1){
            for(int i=endX-1;i>=start+1;i--){
                list.add(nums[i][start]);
            }
        }
    }
}
