package com.ujbj.test;

import java.util.Scanner;

public class Test1 {
    /**
     * 转换罗马数字
     * 键盘录入一个字符串，
     * 要求1：长度为小于等于9
     * 要求2：只能是数字
     * 将内容变成罗马数字
     * 下面是阿拉伯数字跟罗马数字的对比关系：
     * 1-Ⅰ、2-Ⅱ、3-Ⅲ、4-Ⅳ、5-Ⅴ、6-Ⅵ、7-Ⅶ、8-Ⅷ、9-Ⅸ
     * 注意点：
     * 罗马数字里面是没有0的
     * 如果键盘录入的数字包含0，可以变成””（长度为0的字符串）
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请入一个字符串 :)");
            System.out.print("$ ");
            StringBuilder sb = new StringBuilder();
            String str = sc.next();
            if (checkStr(str)) {
                for (int i = 0; i < str.length(); i++) {
                    int index = str.charAt(i) - '0';
                    sb.append(changeLuma(index) + " ");
                }
                System.out.println(sb);
                break;
            } else {
                System.out.println("输入错误 :(");
            }
        }
    }

    public static boolean checkStr(String str) {
        if (str.length() > 9) return false;
        for (int i = 0; i < str.length(); i++) {
            // 只要不符合格条件退出
            //  大于9 || 小于0
            if (str.charAt(i) > '9' || str.charAt(i) < '0') {
                return false;
            }
        }
        // 遍历所有字符，都符合条件。返回true
        return true;
    }

    public static String changeLuma(int index) {
        String[] str = {"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        return str[index];
    }
}
