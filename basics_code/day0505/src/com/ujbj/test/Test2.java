package com.ujbj.test;

public class Test2 {
    /**
     * 调整字符串
     * 给定两个字符串，A和B。
     * A的旋转操作就是将A最左边的字符移动到最右边。
     * 例如，若A='abcde',在移动一次之后结果就是'bcdea'。
     * 如果在若干次调整操作之后，A能变成B,那么返回True。
     * 如果未能匹配成功，则返回false
     */
    public static void main(String[] args) {
        // 1. 创建A和B两个字符串
        // 2. 旋转字符串: 最左字符放入最右边
        // 3. 调用旋转方法。如果找到相同的返回true否则false
        String A = "abcd";
        String B = "daba";

        System.out.println(checkStr(A, B));
    }
    // 2. 旋转字符串: 最左字符放入最右边
    public static String rotate(String str) {
        // 通过字符串截取的方式
        return str.substring(1) + str.charAt(0);
    }

    public static boolean checkStr(String A, String B) {
        if (A == null || B == null) return false;
        if (A.length() != B.length()) return false;
        for (int i = 0; i < A.length(); i++) {
            if (A.equals(B)) {
                return true;
            }
            // 最后一次交换了，但是没有使用
            A = rotate(A);
        }
        return false;
    }
}
