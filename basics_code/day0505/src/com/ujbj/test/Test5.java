package com.ujbj.test;

import java.util.Random;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("请输入字符串 :)");
        System.out.print("$ ");
        String str = sc.next();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int randIndex = r.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[randIndex];
            arr[randIndex] = temp;
        }
        str = new String(arr);
        System.out.println(str);
    }
}
