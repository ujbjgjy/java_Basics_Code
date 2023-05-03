package com.ujbj.stringTest;

import java.util.Scanner;

public class Test2 {
    /**
     * 统计字符次数
     * 键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数
     * (不考虑其他字符)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        System.out.print("$ ");
        String str = sc.next();
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
//            System.out.println(ch);
            // char 在进行计算会整型提升的到int类型
            if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= '0' && ch <= '9') {
                numCount++;
            }
        }
        System.out.println("bigCount = " + bigCount);
        System.out.println("smallCount = " + smallCount);
        System.out.println("numCount = " + numCount);
    }
}
