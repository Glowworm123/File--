package com.zhang.a01fle;

import java.io.File;
import java.util.List;

public class FileDemo5 {
    //获取并连遍历
    public static void main(String[] args) {
        /*
        * 1.当调用者File表示得路径不存在时,返回NULL
        * 2.当调用者File表示得路径是一个文件时,返回NULL
        * 3.当调用者File表示得路径是一个空文件夹时,返回一个长度为0得File数组
        * 4.当调用者File表示得路径是一个有内容得文件夹时,将里面得所有文件夹和文件得路径存入File数组中返回
        * 5.当调用者File表示得路径中包含隐藏文件时,会把隐藏文件一起返回
        * 6.当调用者File表示得路径是一个需要权限才能访问得文件夹时,也会返回NULL
        * */
        File f1=new File("D:\\file测试文件夹");
        File[] ff = f1.listFiles();
        assert ff != null;
        for (File file : ff) {
            System.out.println(file.getName());
        }
    }
}
