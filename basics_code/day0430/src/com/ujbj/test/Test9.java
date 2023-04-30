package com.ujbj.test;

import java.util.Random;
import java.util.Scanner;

public class Test9 {
    /**
     * 随机数
     */
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        // r.nextInt(10) 0~9 --- 包头不包尾，包左不包右
        int num = r.nextInt(100 + 1) + 1; // 1 ~ 100
        int count = 5;
        while (count-- != 0) {
            // count 打印的是下次进行比较的数
            System.out.print("请入你猜的数字(次数"+ (count + 1) +") :> ");
            int guessNum = sc.nextInt();
            if (guessNum > num) System.out.println("<: 大了");
            else if (guessNum < num) System.out.println("<: 小了");
            else System.out.println("<: 猜对了");
        }
        System.out.println("随机数为:> " + num);
    }
}
