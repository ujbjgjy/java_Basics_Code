package com.ujbj.test;

public class Test {
    public static void main(String[] args) {
        byte a = -128;
        // 1000 0001
        // 1111 1111
        // 0000 0000
        System.out.println((byte) (a - 1));
        // 1000 0000 0000 0001
        // 1111 1111 1111 1111
        System.out.println(-1 >> 1); // -1 * 2
        // 1111 1111
        System.out.println((byte) (-1 + 1));
        System.out.println((byte) -128);
        int num = 300; // 00000000 00000000 0000 0001 0010 1100
        byte b = (byte)num; // 0010 1100
        System.out.println(b);
    }
}
