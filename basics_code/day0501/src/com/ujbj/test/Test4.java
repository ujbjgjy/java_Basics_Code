package com.ujbj.test;

public class Test4 {
    /**
     * 数组最大值
     * 需求：设计一个方法求数组的最大值，并将最大值返回
     */
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 3, 2};
        System.out.println("max = " + getMax(arr));

    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // 遍历完数组后选出最大值
        return max;
    }
}
