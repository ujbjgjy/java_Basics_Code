package com.ujbj.test;
public class Test2 {
    /**
     * java 判断数据类型
     */
    public static void main(String[] args) {
        // object instanceof datatype 判断数据类型,返回true和false
        String str = "hello world!";
        if (str instanceof String) {
            System.out.println("这是一个字符串");
        }
        for (int i = 'a'; i < 26 + 'a'; i++) {
            System.out.print((char)i + "\t");
        }
        byte a = 1;
        byte b = 1;
        int c = a + b;
    }
}
