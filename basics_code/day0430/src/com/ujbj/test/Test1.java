package com.ujbj.test;

import java.util.Scanner;

public class Test1 {
    /**
     * 需求：键盘录入星期数
     * 输出工作日、休息日。
     * (1-5)工作日，6-7休息日。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输星期数:> ");
        int num = sc.nextInt();
        switch (num) {
            case 1, 2, 3, 4, 5 -> System.out.println("今天是工作日");
            case 6, 7 -> System.out.println("今天是休息日");
            default -> System.out.println("输入错误");
        }
    }
}
