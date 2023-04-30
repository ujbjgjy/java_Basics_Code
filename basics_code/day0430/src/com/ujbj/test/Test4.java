package com.ujbj.test;

public class Test4 {
    /**
     * 需求：给定两个整教，被除数和除数（都是正数，且不超过it的范围）
     * 将两数相除，要求不使用乘法、除法和%运算符。
     * 得到商和余数。
     */
    public static void main(String[] args) {
        // 被除数
        int dividend = 231;
        // 除数
        int divisor = 10;
        // 记录相减的次数
        int count = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            count++;
        }
        System.out.printf("商 = %d\t余数 = %d", count, dividend);
    }
}
