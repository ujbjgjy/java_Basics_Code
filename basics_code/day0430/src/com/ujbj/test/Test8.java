package com.ujbj.test;

import java.util.Scanner;

public class Test8 {
    /**
     * 用平方根来算判断这个是否为质数
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        // 我们可以得知，它其中的一个数的范围(两数相乘等的n的其中一个数的范围)
        // 我们可以通其中的一个数求出另一个数

        for (int i = 2; i <= Math.sqrt(n); i++) {
            // n = 81
            // 81 / 2 不能除尽
            // 81 / 3 = 27 ... 0 能被除尽
            // ...
            // 81 / 9 = 9 ... 能被除尽
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // 以81的平方根9为中心
        // 1.
        // a * b = 81
        // 其中有一个必定是小于等于9，另一个是大于等9的
        // a <= 9 * b >= 9
        // 1 * 81
        // 3 * 27
        // 9 * 9
        // 2.
        // 假设都大于9 --- 9.1 * 9.1 > 81
        // 假设都小于9 --- 8.9 * 8.9 > 81
        // 其中一个只能是小于平方根或等平方根
        // 另外一个只能是大于平方根或等平方根
        // 获取一个数的平方根Math.sqrt(double)
        System.out.print("请输入一个数:> ");
        if (isPrime(new Scanner(System.in).nextInt())) {
            System.out.println("为质数");
        }
        else {
            System.out.println("不为质数");
        }
    }
}
