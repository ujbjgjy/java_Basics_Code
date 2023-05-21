package com.ujbj.test.aipDome;

import java.io.*;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) throws IOException {
        // txt往外输入
        FileInputStream fis = new FileInputStream("E:\\文件\\test\\1.txt");
        // 往txt里面输出
        FileOutputStream fos = new FileOutputStream("E:\\文件\\test\\2.txt");

        byte[] arr = new byte[1024];
        int length = 0;

        fos.write((new Scanner(System.in).next()).getBytes());

        while (length != -1) {
            System.out.println(length);
            length = fis.read(arr);
            fos.write(arr);
        }

        fos.close();
        fis.close();
    }
}
