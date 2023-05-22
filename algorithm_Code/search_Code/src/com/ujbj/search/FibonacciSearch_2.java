package com.ujbj.search;

import java.util.Arrays;

public class FibonacciSearch_2 {
    public static void main(String[] args) {
        int[] arr = {1, 123, 204, 422, 1234, 2300};
        int result = fibSearch(arr, 1);
        System.out.println(result);
    }

    private static int maxSize = 20;
    private static int[] fib() {
        int[] f = new int[maxSize];

        f[0] = f[1] = 1;

        for (int i = 2; i < f.length; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f;
    }

    public static int fibSearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        // 获取斐波那契数列
        // 1	1	2	3	5	8	13	21	34	55	89	144	233	377	610	987	1597	2584	4181	6765
        // 理解
        // 元素个数是89的数组分割为: 34 55，列出
        // 89 = 55 + 34
        // 55 = 34 + 21
        // ...
        // f[k] = f[k - 1] + f[k - 2]
        // 这里获取的是结果是下标，要进行-1的操作
        int[] f = fib();
        int k = 0;
        // high表示要查找数组最后一位数的下标
        // 拿斐波那契的 89 55 34举例
        // 例
        // 89 表示是长度是89的数组，它的黄金分割比是，55 34
        // 也就是说，我要查找的数组元素的下标得是 89 - 1 >= high
        // 为什么-1 89个元素的最后一个下标是88
        // 1. f[k] - 1 = 1 - 1 = 0
        // 2. f[k] - 1 = 1 - 1 = 0
        // 3. f[k] - 1 = 2 - 1 = 1
        // 4. f[k] - 1 = 3 - 1 = 2
        // 5. f[k] - 1 = 5 - 1 = 4
        // 6. f[k] - 1 = 8 - 1 = 5
        // f[k] 表示要查找数组的长 -1表示要查找数组的下标
        // f[k] >= 查找数组的长度
        // 即f[k] - 1 >= 要查找数组的最大下标
        while (high > f[k] - 1) {
            k++;
        }

        // 1	1	2	3	5	8	13	21	34	55	89	144	233	377	610	987	1597	2584	4181	6765
        // 数组最大下标6-1, 开辟新数组最大下标要在这组斐波那契数列中(>=)
        // 我们从上面已经得 k，要开辟新数组最大下标，f[k] 新数组的长度8
        //  arr: 1, 123, 204, 422, 1234, 2300
        // temp: 1, 123, 204, 422, 1234, 2300, 2300, 2300
        // 不够的元素补最后一个元素的值
        int[] temp = Arrays.copyOf(arr, f[k]);
        for (int i = high + 1; i < temp.length; i++) {
            temp[i] = arr[high];
        }

        // 开始分割
        while (low <= high) {
            // mid 表示low和high之间的分割比
            // f[k] = f[k - 1] + f[k - 2];
            // f[k - 1]: 获取左边的,但是表示是数组的长度，我们要是下标
            // 例: 还是拿89 55 34
            // 元素个数是89的数组 左边分55 右边分34,
            // 但我通过f[k - 1] 获取是长度, 我们需要是下标，即左边是有55个元素的下标是什么
            // 加上low, 偏移量, 去已排除的左边
            int mid = low + f[k - 1] - 1;
            // 以下以数组长度8为例
            // f[k] = 8
            // f[k-1] = 5
            // f[k-2] = 3
            if (key < temp[mid]) { // key小于mid，mid做最大值
                high = mid - 1;
                // 去左边的数组长度为3
                // f[k - 2] = 3
                // f[k-1 - 2] = 2
                // f[k-2-1] = 1
                k -= 2;
            } else if (key > temp[mid]) { // key大于mid，
                high = mid - 1;
                // 去除右边的数组长度为5
                // f[k-1] =  5
                // f[k-1-1] = 3
                // f[k-2-1] = 2
                k--;
            } else {
                if (mid <= high) {
                    return mid;
                } else {
                    return high;
                }
            }
        }
        return -1;
    }
}
