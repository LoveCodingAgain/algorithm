package com.lx.algorithm;
import java.io.File;
/**
 * title： com.lx.algorithm
 * @author： lixing
 * date： 2018/8/17 19:14
 * description：统计一个文件夹下的所有子文件夹的名称
 */
public class GetDirectorys {
    public static void main(String[] args) {
        listDirects("D://BaiduYunDownload");
    }
    public static void listDirects(String driect){
        File[] file=new File(driect).listFiles();
        if(file==null||file.length<=0){
            System.out.println("空文件夹哟!");
            return ;
        }else{
            for(File fd:file){
                if(fd.isDirectory()){
                    System.out.println("名录名称:"+fd.getName());
                }
                if(fd.isFile()){
                    System.out.println("文件名称:"+fd.getName());
                }
            }
        }
    }
}
