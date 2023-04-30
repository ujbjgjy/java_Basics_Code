package com.ujbj.test;

public class Test5 {
    /**
     * 朋友聚会的时候可能会玩一个游戏：
     * 逢7过
     * 游戏规则：从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍
     * 数时都要说过：过
     * 需求：使用程序在控制台打印出1-100之间的满足逢七必过规则的数据
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // 求出各个位上的数, 只要一位得7就过或7的倍数
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println("i = " + i);
            }
        }
    }
}
