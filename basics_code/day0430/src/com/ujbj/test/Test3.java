package com.ujbj.test;

import java.util.Scanner;

public class Test3 {
    /**
     * 需求：给你一个整数X。
     * 如果x是一个回文整数，打印true,
     * 否则，返回false。
     * 解释：回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     * 例如，121是回文，而123不是。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请入一个数字:> ");
        int x = sc.nextInt();
        int num = 0;
        int temp = x;
        while (temp != 0) {
            // x = 123
            // 0 * 10 + 3 = 3
            // 3 * 10 + 2 = 32
            // 32 * 10 + 1 = 321
            num = num * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("num = " + num);
        System.out.println(x == num);
    }
}
