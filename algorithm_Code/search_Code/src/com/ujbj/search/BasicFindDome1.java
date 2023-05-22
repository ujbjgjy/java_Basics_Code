package com.ujbj.search;

public class BasicFindDome1 {
    // 二分查找
    public static void main(String[] args) {
        int[] arr = new int[]{98, 23, 56, 3, 42, 1, 89, 33, 12, 7};
        arr = BubbleSort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1]);
        // 1, 3, 7, 12, 23, 33, 42, 56, 89, 98
        System.out.println();

        int result = binarySearch(arr, 1);

        System.out.println(result);
    }

    // 冒泡排序
    public static int[] BubbleSort(int[] arr) {
        // 一共要有多少元素的排序
        for (int i = 0; i < arr.length - 1; i++) {
            // 第i个元素要交换的次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];

                    arr[j + 1] = arr[j] ^ arr[j + 1];

                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
        return arr;
    }

    // 二分查找
    public static int binarySearch(int[] arr, int val) {
        int min = 0; // 最小下标
        int max = arr.length - 1; // 最大小下标
        while (min <= max) {
            int mid = (min + max) / 2;
            // 中间值大于要找的val
            if (arr[mid] > val) {
                max = mid - 1;
            } else if (arr[mid] < val) {
                // 中间值小于要找的val
                min = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
