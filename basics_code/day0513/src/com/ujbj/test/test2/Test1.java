package com.ujbj.test.test2;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
//        showFile("E:\\文件\\test");
        File file = new File("E:\\文件\\test\\");
        System.out.println(file.list()[0].indexOf("124"));
    }

    public static void showFile(String path) {
        File file = new File(path);

        // exists 判断当前路径是否存在 exists:存在
        // isDirectory 判断当前路径是否为目录
        if (!file.exists() || !file.isDirectory()) {
            return;
        }
        // listFile 方法 让 file里面的内容形成一个数组
        File[] files = file.listFiles();
        for (File f : files) {
            // isFile 是否为文件
            if (f.isFile()) {
                System.out.println("文件名称:" + f.getName() + "文件长度:" + f.length());
            } else {
                // 如果不文件那么就目录
                System.out.println("目录的路径:" + f.getPath());
                showFile(f.getPath());
            }
        }
    }
}
