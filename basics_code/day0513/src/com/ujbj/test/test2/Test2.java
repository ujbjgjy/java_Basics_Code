package com.ujbj.test.test2;

import java.io.*;
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\文件\\test\\test.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fos =  new FileOutputStream(file);
        fos.write("hello world!".getBytes());

        FileInputStream fis = new FileInputStream(file);
        byte[] b = new byte[5];
        int len = fis.read(b);
        System.out.println(new String(b) + "\t长度:"  + len);

        fos.close();
        fis.close();
    }
}
