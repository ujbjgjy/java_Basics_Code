package com.ujbj.stringTest;

public class Test3 {
    public static void main(String[] args) {
        String[] arr = {"xxs", "tmd", "sb"};
        String str = "你xxs在tmd干tmd什sb么";
        for (int i = 0; i < arr.length; i++) {
            str = str.replace(arr[i], "***");
        }
        System.out.println(str);
    }
}
