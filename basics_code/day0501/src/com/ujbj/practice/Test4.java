package com.ujbj.practice;

import java.util.Random;

public class Test4 {
    /**
     * 需求：
     * 定义方法实现随机产生一个5位的验证码
     * 验证码格式：
     * 长度为5前四位是大写字母或者小写字母,最后一位是数字
     */
    public static void main(String[] args) {
        System.out.print("随机验证码为:> ");
        String result = "";
        for (int i = 0; i < 5 - 1; i++) {
            result += rand();
        }
        result += rand(10);
        System.out.println(result);
    }

    public static char rand() {
        Random r = new Random();
        int ch = 0;
        if (r.nextBoolean()) {
            ch = r.nextInt(26) + 'a';
        }
        else {
            ch = r.nextInt(26) + 'A';
        }
        return (char) ch;
    }
    public static int rand(int num) {
        Random r = new Random();
        return r.nextInt(num);
    }
}
