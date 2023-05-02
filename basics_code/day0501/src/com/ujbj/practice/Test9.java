package com.ujbj.practice;

public class Test9 {
    /**
     * 请将加密后的数据解密出来
     * 加密：先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数。
     */
    public static void main(String[] args) {
        // 1983 加密后 8346
        //
        int[] arr = {8, 3, 4, 6};
        // 1. 解密
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i] - 5;
            if (value < 0) value += 10;
            arr[i] = value;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        int num = 0;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        System.out.println(num);
        // 2. 反转
    }
}
