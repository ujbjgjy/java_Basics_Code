package com.ujbj.test;

import java.util.Scanner;

public class Test7 {
    /**
     * 回文数
     */
    public static void main(String[] args) {
        System.out.print("请输入一个回文数:> ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(palindrome(num) == num);
    }
    public static int palindrome(int value) {
        // 把数字倒过来做对比
        // 1. 获取各个位数的数
        int num = 0;
        while (value != 0) {
            num  = num * 10 + value % 10;
            value /= 10;
        }
        return num;
    }
}
