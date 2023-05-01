package com.ujbj.test;

public class Test2 {

    public static void main(String[] args) {
        System.out.println(sum(30, 39));
        System.out.println(sum(30, 39, 32));
        System.out.println(sum((double) 30, (double) 39));
    }

    /**
     * 需求：
     * 定义一个方法求两个整数的和
     * 定义一个方法求三个整数的和
     * 定义一个方法求两个小数的和
     */
    public static int sum(int value1, int value2) {
        return value1 + value2;
    }

    public static int sum(int value1, int value2, int value3) {
        return value1 + value2 + value3;
    }

    public static double sum(double value1, double value2) {
        return value1 + value2;
    }
}
