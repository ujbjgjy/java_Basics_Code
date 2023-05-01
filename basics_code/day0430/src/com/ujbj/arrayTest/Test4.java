package com.ujbj.arrayTest;

import java.util.Random;

public class Test4 {
    /**
     * 打乱数组中的数据
     * 需求：定义一个数组，存入1~5。要求打乱数组中所有数据的顺序。
     */
    public static void main(String[] args) {
        // 思路
        //  遍历数组，用随机数获取随机下标。然后生交换元素
        int[] arr = {1, 2, 3, 4, 5};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
