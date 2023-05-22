package com.ujbj.test;

import java.util.Scanner;

public class Test2 {
    /**
     * 自己实现parselnt方法的效果，将字符串形式的数据转成整数。
     * 要求：
     * 字符串中只能是数字不能有其他字符
     * 最少一位，最多10位0不能开头
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 3;
        while (count-- > 0) {
            System.out.println("请输入一个字符串 :)");
            System.out.print("$ ");
            String str = sc.nextLine();
            int num = MyParseInt(str);
            System.out.println("结果 = " + num * 10);
        }
    }

    public static int MyParseInt(String str) {
        if (str.matches("[1-9]\\d{0,9}")) {
            int num = 0;
            for (int i = 0; i < str.length(); i++) {
                // 123
                // 0 * 10 + 1 = 1
                // 1 * 10 + 2 = 12
                // 12 * 10 + 3 = 123
                int val = str.charAt(i) - '0';
                num = num * 10 + val;
            }
            return num;
        } else {
            return 0;
        }
    }
}
