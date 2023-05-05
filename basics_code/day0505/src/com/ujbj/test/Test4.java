package com.ujbj.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        String s = "hello world";
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char  c = s.charAt(i);
            if (c == ' ') {
                break;
            }
            sb.append(c);
        }
        System.out.println(sb.reverse().toString());
    }
}