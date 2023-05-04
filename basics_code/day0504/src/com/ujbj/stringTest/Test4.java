package com.ujbj.stringTest;

import java.util.Scanner;

public class Test4 {
    /**
     * 对称字符串
     * 需求：键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
     * 对称字符串：123321、111
     * 非对称字符串：123123
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        System.out.print("$ ");
        String str = sc.next();
        String result = new StringBuilder().append(str).reverse().toString();
        System.out.println(result);
        if (str.equals(result)) {
            System.out.println("是对称字符串");
        } else {
            System.out.println("不是对称字符串");
        }
    }
}
