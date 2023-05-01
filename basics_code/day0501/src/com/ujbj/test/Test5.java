package com.ujbj.test;

public class Test5 {
    /**
     * 判断是否存在
     * 定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 54, 5};
        System.out.println(contain(arr, 5));
    }

    public static boolean contain(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            // 找到了程序结束
            if (value == arr[i]) return true;
        }
        // 遍历结束还找到
        return false;
    }
}
