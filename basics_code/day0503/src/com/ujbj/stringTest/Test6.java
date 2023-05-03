package com.ujbj.stringTest;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        System.out.println("请输入数字");
        System.out.print("$ ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char[] chs = {'佰', '拾', '万', '仟', '佰', '拾', '元'};
        if (num > 9999999 || num < 0) {
            System.out.println("数字违法");
        } else {
            // 1. 数字转为中文数字
            String str = "";
            while (num > 0) {
                // 321
                // 3 + ''
                // 2 + 3
                // 23 + 1
                str = convert(num % 10) + str;
                num /= 10;
            }
            // 2. 前面补零 7 - 4
            for (int i = str.length(); i < 7; i++) {
                // 123
                // 0 + 123
                // 0 + 0123
                str = '零' + str;
            }
            // 3. 插入位数
            String re = "";
            for (int i = 0; i < chs.length; i++) {
                re = re  + str.charAt(i) + chs[i];
            }
            System.out.println(re);
        }

    }

    public static char convert(int index) {
        char[] chs = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};
        return chs[index];
    }
}
