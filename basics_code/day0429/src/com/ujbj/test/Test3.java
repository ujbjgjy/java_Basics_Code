package com.ujbj.test;

public class Test3 {
    /**
     * 隐式转换练习
     */
    public static void main(String[] args) {
        // 例1
        byte b1 = 10;
        byte b2 = 20;
        int result1 = b1 + b2;
        // 例2
        int i = 10;
        long n1 = 100L;
        double d = 20.0;
        double result2 = i + n1 + d;
        // 例3
        byte b = 10;
        short s = 20;
        long n2 = 100L;
        long result3 = b + s + n2;
        // 例4
        byte b3 = 10;
        byte b4 = 20;
        // byte result4 = b3 + b4; error
        byte result4 = (byte) (b3 + b4);
        // byte = 8bit = 1111 1111 = 255 = -128 ~ 127
        // 1000 0000 ~ 1111 1111 = -128 ~ -1
        // 0000 0000 ~ 0111 1111 = 0 ~ 127
        System.out.println((byte) (127 + 1)); // result = -128 = 0111 1111 + 1 = 1111 1111
        System.out.println((byte) (-128 - 1)); // result = -128 = 1000 0000 - 1 = 0111 1111
    }
}
