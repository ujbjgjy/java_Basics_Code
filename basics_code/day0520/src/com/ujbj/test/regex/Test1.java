package com.ujbj.test.regex;

public class Test1 {
    public static void main(String[] args) {
        // matches: 匹配
        System.out.println("zwtsss".matches("[a-z&&c-z]{5,10}"));
        System.out.println("aaa".matches("abc"));
        System.out.println("0".matches("[0-9[^a-z]]"));
    }
}
