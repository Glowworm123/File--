package com.zhang.a01fle;

import java.io.File;
import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;

public class FileDemo2 {
    public static void main(String[] args) {
        String name="D:\\file测试文件夹\\a.txt";
        File f1=new File(name);
        //判断该路径是否是文件夹
        System.out.println(f1.isDirectory());
        System.out.println("----------------------------");
        //判断是否为文件(除了文件夹以外的文件)
        System.out.println(f1.isFile());
        System.out.println("----------------------------");
        //对一个不存在的路径进行判断是否存在(判断该文件是否存在)
        System.out.println(f1.exists());
        System.out.println("----------------------------");
        //返回文件内容大小单位是字节
        //如果文件的单位是KB,M,G的话就要不断除1024除一次是KB两次是M三次是G
        //并且无法获取文件夹的大小,文件夹的大小需要把文件夹里的文件大小累加再一起;
        System.out.println(f1.length());
        System.out.println("----------------------------");
        //返回文件的绝对路径
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getAbsoluteFile());
        System.out.println("----------------------------");
        //返回定义文件夹时的路径
        System.out.println(f1.getParent());
        System.out.println("----------------------------");
        //返回文件名称带后缀
        //文件夹只返回名字,没有后缀
        System.out.println(f1.getName());
        System.out.println("----------------------------");
        //返回文件最后修改时间
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println(sdf.format(new java.util.Date(f1.lastModified())));
        //System.out.println(d);
        System.out.println("----------------------------");

    }
}
