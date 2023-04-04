package com.zhang.a01fle;

import java.io.File;

public class FileDemo4 {
    //删除
    public static void main(String[] args) {
        //文件直接删除,并且不走回收站
        //空目录直接删除,并且不走回收站
        //目录里面有内容得话,删除失败
        File f1=new File("D:\\file测试文件夹\\aaa\\abc");
        f1.deleteOnExit();

    }
}
