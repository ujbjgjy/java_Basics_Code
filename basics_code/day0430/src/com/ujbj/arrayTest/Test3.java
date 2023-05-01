package com.ujbj.arrayTest;

public class Test3 {
    /**
     * 需求：定义一个数组，存入1,2,3,4,5。按照要求交换索引对应的元素。
     * 交换前：1,2,3,4,5
     * 交换后：5,2,3,4,1
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int start = 0;
        int end = arr.length - 1;
        // 中间不交换
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
