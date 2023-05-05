package com.ujbj.test;

public class Test3 {
    public static void main(String[] args) {
        String A = "abcd";
        String B = "bacd";
        boolean flag =  checkStr(A, B);
        System.out.println(flag);
    }

    public static boolean checkStr(String A, String B) {
        if (A == null || B == null) return false;
        if (A.length() != B.length()) return false;
        String str = A + A;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.substring(i, i + 4).equals(B)) {
                return true;
            }
        }
        return false;
    }
}
