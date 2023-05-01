package com.ujbj.practice;

import java.util.Scanner;

public class Test1 {
    /**
     * 卖飞机票
     * 需求：
     * 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
     * 按照如下规则计算机票价格：旺季（5-10月)头等舱9折，经济舱8.5折，淡季（11月到来年4月)头等舱7折，经济舱6.5折。
     * ctrl + alt + m 自动抽取方法
     */
    public static void main(String[] args) {
        // 1. 输入机票原价、月份，和选择什么座位
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入票价:> ");
        int price = sc.nextInt();
        System.out.print("请输入月份:> ");
        int month = sc.nextInt();
        System.out.print("请输入座位[1.头等舱 其他. 经济舱]:> ");
        int seat = sc.nextInt();
//      按照如下规则计算机票价格：旺季（5-10月)头等舱9折，经济舱8.5折，淡季（11月到来年4月)头等舱7折，经济舱6.5折。
        // 判断淡旺季
        //  1. 淡季 5~10
        if (month >= 5 && month <= 10) {
            // 什么舱
            price = getPrice(seat, price, 0.9, 0.85);
        } else if (month <= 12) {
            price = getPrice(seat, price, 0.7, 0.65);
        } else {
            System.out.println("输入错误");
        }
        System.out.println("票价为: " + price);
    }

    public static int getPrice(int seat, int price, double x, double x1) {
        if (seat == 1) {
            price = (int) (price * x);
        } else {
            price = (int) (price * x1);
        }
        return price;
    }
}
