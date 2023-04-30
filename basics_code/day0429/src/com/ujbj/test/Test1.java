package com.ujbj.test;

import java.util.Scanner;
public class Test1 {
    /**
     * 求出各个位上的数
     */
    public static void main(String[] args) {
        System.out.print("请输入一个整数:> ");
        Scanner sc = new Scanner(System.in);
        // 接收用户输入的整数
        int inputNum = sc.nextInt();
        while (inputNum != 0) {
            System.out.print(inputNum % 10 + "\t");
            inputNum /= 10;
        }
    }
}
