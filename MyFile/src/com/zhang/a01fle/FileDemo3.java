package com.zhang.a01fle;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    //创建  删除
    public static void main(String[] args)  {

        File f1=new File("D:\\file测试文件夹\\aaa\\abc");
        //文件存在返回False,并且创建失败 文件不存创建个空得文件夹,并且返回true
        //如果父级路径不存在就会抛出异常
        //如果创建得文件没有后缀得话,创建得也会是文件,只是 是没有后缀得文件
     /*   try {
            System.out.println(f1.createNewFile());
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("------------------------------");*/
        //如果当前路径中有重名得文件或者文件夹,就会创建失败
        //创建得是文件夹(目录)
        System.out.println(f1.mkdirs());
        System.out.println("------------------------------");

    }
}
