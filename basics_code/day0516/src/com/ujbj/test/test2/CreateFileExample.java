package com.ujbj.test.test2;

import java.io.*;
import java.util.Scanner;

public class CreateFileExample {
    public static void main(String[] args) {
        File file = new File("E:\\文件\\test\\example.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("文件创建成功：" + file.getAbsolutePath());
            } else {
                System.out.println("文件已存在：" + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("文件创建失败：" + e.getMessage());
        }

        try {
            String str = new Scanner(System.in).next();
            OutputStream os = new FileOutputStream(file);
            os.write(str.getBytes());
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

