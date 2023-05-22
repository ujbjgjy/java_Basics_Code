package com.ujbj.test;

public class Test3 {
    /**
     * 定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
     */
    public static void main(String[] args) {
        System.out.println(MyToBinaryString(713));
    }

    public static String MyToBinaryString(int val) {
        StringBuffer sb = new StringBuffer();

        while (true) {
            sb.insert(0, val % 2);
            if ((val /= 2) == 0) break;
        }

        return sb.toString();
    }
}
