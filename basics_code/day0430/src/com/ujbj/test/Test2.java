package com.ujbj.test;

public class Test2 {
    /**
     * 需求：世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，假如我
     * 有一张足够大的纸，它的厚度是0.1毫米。
     * 请问，我折叠多少次，可以折成珠穆朗玛峰的高度？
     */
    public static void main(String[] args) {
        double height = 8844430;
        double a = 0.1;
        int count = 0;
        while (a < height) {
            a *= 2;
            count++;
        }
        System.out.println(count);
    }
}
