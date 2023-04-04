package com.zhang.a01fle;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        File f1=new File("D:\\源码\\a1.txt");
        File f2=new File("D:\\源码","a2.txt");
        File f3=new File(f2,"a3.txt");

    }
}
