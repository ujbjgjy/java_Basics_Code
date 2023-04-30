package com.ujbj.test;

import java.util.Scanner;

public class Test7 {
    /**
     * 需求：键盘录入一个正整数x，判断该整数是否为一个质数
     * 质数：如果一个整数只能被1和本身整除，那么这个数就是质数。否则这个数叫做合数
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个正整数:> ");
        int x = sc.nextInt();
        // 假如这是个质数
        boolean flag = true;
        // 从2 循环到 x - 1。不除于1和本身，如果2 ~ x-1 没有一个能除尽的说明是质数
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                // 能除尽，说明不是质数直接跳出
                flag = false;
                break;
            }
        }
        if (flag) System.out.println(x + "是个质数");
        else System.out.println(x + "不是个质数");
    }
}
