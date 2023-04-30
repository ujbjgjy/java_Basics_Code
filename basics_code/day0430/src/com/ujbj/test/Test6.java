package com.ujbj.test;

import java.util.Scanner;

public class Test6 {
    /**
     * 需求：键盘录入一个大于等于2的整数X,计算并返回X的平方根。
     * 结果只保留整数部分，小数部分将被舍去
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个大于等于2的整数:> ");
        int x = sc.nextInt();
        // 求10
        // 1 * 1 = 1 < 10
        // 2 * 2 = 4 < 10
        // 3 * 3 = 9 < 10
        // 4 * 4 = 16 > 10
        // 3~4 之间
        for (int i = 1; i < x; i++) {
            if (i * i == x) {
                System.out.println("i的平方根是" + i);
                break;
            }
            else if (i * i > x) {
                System.out.println("i的平方根整数是" + (i - 1));
                break;
            }
        }
    }
}
