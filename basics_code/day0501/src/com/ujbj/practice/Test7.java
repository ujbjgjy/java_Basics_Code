package com.ujbj.practice;

public class Test7 {
    /**
     * 数字加密
     * 需求：
     * 某系统的数字密码（大于0），比如1983，采用加密方式进行传输。
     * 规则如下：
     * 先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数。
     */
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 3};
        // 1. 加密
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
            arr[i] %= 10;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        // 2. 反转
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start]  = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        System.out.println(num);
    }
}
