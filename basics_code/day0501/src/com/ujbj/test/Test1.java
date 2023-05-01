package com.ujbj.test;

public class Test1 {
    /**
     * 需求：使用方法重载的思想，设计比较两个整数是否相同的方法。
     * 要求：兼容全整数类型(byte,short,int,long)
     */
    public static void main(String[] args) {
        byte b1 = 30, b2 = 30;
        short s1 = 30, s2 = 3;
        int i1 = 30, i2 = 31;
        long l1 = 30, l2 = 30;
        compare(b1, b2);
        compare(s1, s2);
        compare(i1, i2);
        compare(l1, l2);
    }

    // 方法重载
    //  再同一类中，方法名相同。参数不同就是方法重载 --- 只看这两种
    public static boolean compare(byte value1, byte value2) {
        if (value1 == value2) System.out.println("相同");
        else System.out.println("不相同");
        return value1 == value2;
    }

    public static boolean compare(short value1, short value2) {
        if (value1 == value2) System.out.println("相同");
        else System.out.println("不相同");
        return value1 == value2;
    }

    public static boolean compare(int value1, int value2) {
        if (value1 == value2) System.out.println("相同");
        else System.out.println("不相同");
        return value1 == value2;
    }

    public static boolean compare(long value1, long value2) {
        if (value1 == value2) System.out.println("相同");
        else System.out.println("不相同");
        return value1 == value2;
    }
}
