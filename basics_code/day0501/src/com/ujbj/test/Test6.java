package com.ujbj.test;

public class Test6 {
    /**
     * 求最大值
     * 需求：
     * 定义一个方法copyOfRange(int[] arr,int from,int to)
     * 功能：
     * 将数组arr中从索引from（包含from)开始。
     * 到索引to结束（不包含to)的元素复制到新数组中，
     * 将新数组返回。
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newArr = copyOFRange(arr, 3, 7);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
    }

    public static int[] copyOFRange(int[] arr, int form, int to) {
        // 传的是地址值数组, int[] arr = arr
        int[] newArr = new int[to - form];
        // 遍历新数组
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[form + i];
        }
        return newArr;
    }
}
