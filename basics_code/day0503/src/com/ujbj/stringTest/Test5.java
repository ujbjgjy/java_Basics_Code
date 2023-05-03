package com.ujbj.stringTest;

import java.util.Scanner;

public class Test5 {
    /**
     * 字符串反转
     * 定义一个方法，实现字符串反转。
     * 键盘录入一个字符串，调用该方法后，在控制台输出结果
     * 例如，键盘录入abc,输出结果cba
     */
    public static void main(String[] args) {
        System.out.println("请输入字符串");
        System.out.print("$ ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(reversal(str));
    }

    public static String reversal(String str) {
        String re = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            re += c;
        }
        return re;
    }

}
