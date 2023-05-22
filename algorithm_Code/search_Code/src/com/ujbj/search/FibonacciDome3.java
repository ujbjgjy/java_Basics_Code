package com.ujbj.search;

import java.util.Arrays;

public class FibonacciDome3 {
    private static int maxSize = 20;

    public static void main(String[] args) {
        int[] arr = {3, 5, 12, 43, 45, 67, 80, 200, 1222, 2222};

        int result = fibonacciSearch(arr, 2222);
        System.out.println("result = " + result);
    }

    public static int fibonacciSearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;

        int[] f = fib();
        int k = 0;
        while (high > f[k] - 1) {
            k++;
        }
        int[] temp = Arrays.copyOf(arr, f[k]);
        for (int i = high; i < temp.length; i++) {
            temp[i] = arr[high];
        }

        while (low <= high) {

            int mid = low + (f[k - 1] - 1);

            if (temp[mid] < value) {
                low = mid + 1;
                k--;
            } else if (temp[mid] < value) {
                high = mid - 1;
                k -= 2;
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


    private static int[] fib() {
        int[] arr = new int[maxSize];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }
}
