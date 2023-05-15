package com.ujbj.ui;

import java.util.Random;

public class CodeUtil {
    private CodeUtil() {
    }

    public static String codeStr() {
        Random r = new Random();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < 5; i++) {
            if (r.nextBoolean()) {
                char c = (char) (r.nextInt('z' - 'a' + 1) + 'a');
                sb.append(c);
            } else {
                char c = (char) (r.nextInt('Z' - 'A' + 1) + 'A');
                sb.append(c);
            }
        }
        int index = r.nextInt(5);
        char ch = (char) (r.nextInt(10) + '0');
        sb.setCharAt(index, ch);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(codeStr());
    }
}
