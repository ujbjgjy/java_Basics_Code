package com.ujbj.test.aipDome;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        showFile("E:\\HTML");
    }

    public static void showFile(String path) {
        File file = new File(path);

        if (!file.exists()) {
            System.out.println("文件不存在");
            return;
        }

        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            File temp = files[i];
            if (temp.isFile()) {
                System.out.println("文件名称:" + temp.getName() + "\t文件长度:" + temp.length());
            } else {
                System.out.println("文件路径:" + temp.getPath());
                showFile(temp.getPath());
            }
        }
    }
}
