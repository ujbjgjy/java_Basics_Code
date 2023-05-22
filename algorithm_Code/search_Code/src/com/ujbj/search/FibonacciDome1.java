package com.ujbj.search;

import java.util.Scanner;

public class FibonacciDome1 {
    public static void main(String[] args) {
        int t1 = 0, t2 = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("输入要打印的斐波那契的数量:)");
        System.out.print("$ ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}