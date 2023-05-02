package com.ujbj.practice;

import java.util.Scanner;

public class Test8 {
    /**
     * 需求：
     * 把整数上的每一位都添加到数组当中
     * 反向推导
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数");
        System.out.print("$ ");
        int number = sc.nextInt();
        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        int[] arr = new int[count];
        temp = number;
        int index = arr.length;
        while (temp != 0) {
            index--;
            arr[index] = temp % 10;
            temp /= 10;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
