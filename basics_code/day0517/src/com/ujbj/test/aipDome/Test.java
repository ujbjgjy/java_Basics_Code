package com.ujbj.test.aipDome;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        // 读: 文件向java输入
        FileInputStream fis1TxtR = new FileInputStream("E:\\文件\\test\\1.txt");
        // 写: 文件被java输出
        FileOutputStream fos1TxtW = new FileOutputStream("E:\\文件\\test\\1.txt");

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        fos1TxtW.write(str.getBytes());

        byte[] arr = new byte[1024];

        fis1TxtR.read(arr);
        System.out.println(new String(arr, 0, str.length()));

        File file = new File("E:\\dome.txt");
        if (!file.exists()) file.createNewFile();

        FileOutputStream newFosW = new FileOutputStream(file);
        byte[] arr2 = new byte[1024];
        // 读里面的信息放入arr2中
        fis1TxtR.read(arr2);
        // 将arr2写入newFosW中
        newFosW.write(arr2);

        fos1TxtW.close();
        fis1TxtR.close();
    }
}
