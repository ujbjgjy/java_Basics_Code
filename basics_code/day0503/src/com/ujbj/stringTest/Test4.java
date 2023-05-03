package com.ujbj.stringTest;

public class Test4 {
    /**
     * 拼接字符串
     * 定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，
     * 调用该方法，并在控制台输出结果。
     * 例如：
     * 数组为int arr={1,2,3}:
     * 执行方法后的输出结果为：[1,2,3]
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(splicing(arr));
    }

    public static String splicing(int[] arr) {
        if (arr == null) return "";
        if (arr.length == 0) return "[]";
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str = str + arr[i] + "]";
            } else {
                str = str + arr[i] + ", ";
            }
        }
        return str;
    }





}
