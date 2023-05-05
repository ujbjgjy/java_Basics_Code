package com.ujbj.test;

import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        int count = 10;
        while (count-- > 0) {
            System.out.println(randStr(20));
        }
    }

    public static String randStr(int len) {
        Random r = new Random();
        int count = 3;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char ch;
            int num = r.nextInt(count);
            if (num == 0) {
                ch = (char) (r.nextInt('Z' - 'A' + 1) + 'A');
                sb.append(ch);
            } else if (num == 1) {
                ch = (char) (r.nextInt('z' - 'a' + 1) + 'a');
                sb.append(ch);
            } else {
                count = 2;
                sb.append(r.nextInt(10));
            }
        }
        if (count == 3) {
            char ch = (char) (r.nextInt(10) + '0');
            sb.setCharAt(r.nextInt(len), ch);
        }
        return sb.toString();
    }

    public static String test() {
        Random r = new Random();
        char big = (char) (r.nextInt('Z' + 1) + 'A');
        char small = (char) (r.nextInt('z' + 1) + 'a');
        return big + "" + small;
    }
}
