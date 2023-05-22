package com.ujbj.search;

public class BasicFindDome2 {
    // 插值查找
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 12, 23, 33, 42, 56, 89, 98};

        System.out.println(InterpolationSearch(arr, 3));
        System.out.println(binarySearch(arr, 3));

    }

    public static int InterpolationSearch(int[] arr, int val) {
        int left = 0;
        int right = arr.length - 1;

        int count = 0;

        while (left <= right) {
            count++;
            int pos = left + ((val - arr[left]) * (right - left) / (arr[right] - arr[left]));
            if (arr[pos] > val) {
                right = pos - 1;
            } else if (arr[pos] < val) {
                left = pos + 1;
            } else {
                System.out.println("count = " + count);
                return pos;
            }
        }
        System.out.println("count = " + count);
        return -1;
    }

    public static int binarySearch(int[] arr, int val) {
        int left = 0;
        int right = arr.length - 1;

        int count = 0;

        while (left <= right) {
            count++;

            int mid = (left + right) / 2;

            if (arr[mid] > val) {
                right = mid - 1;
            } else if (arr[mid] < val) {
                left = mid + 1;
            } else {
                System.out.println("count = " + count);
                return mid;
            }
        }
        System.out.println("count = " + count);
        return -1;
    }

}
