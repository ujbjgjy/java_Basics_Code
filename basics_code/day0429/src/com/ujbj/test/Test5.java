package com.ujbj.test;

public class Test5 {
    /**
     * 逻辑运算符
     */
    public static void main(String[] args) {
        // 1. 13 & 2
        // 两个为真，才为真
        //  1101
        //  0010
        System.out.println(13 & 2);
        // 2. 13 & 2
        //  0000
        // 1为个真，才为真
        //  1101
        //  0010
        //  1111
        System.out.println(13 | 2);
        // 3. 1 ^ 1
        // 两个相同，为假
        //  1111
        //  1111
        //  0000
        System.out.println(1 ^ 1);
    }
}
