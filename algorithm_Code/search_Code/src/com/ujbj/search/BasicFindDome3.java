package com.ujbj.search;

public class BasicFindDome3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int result = interpolationSearch(arr, 7);
        System.out.println("result = " + result);
    }

    public static int interpolationSearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && value >= arr[low] && value <= arr[high]) {
            if (low == high) {
                if (arr[low] == value) {
                    return low;
                } else {
                    return -1;
                }
            }

            int pos = low + ((value - arr[low]) / (arr[high] / arr[low])  * (high - low));

            if (arr[pos] == value) {
                return pos;
            } else if (arr[pos] < value) {
                // pos小于value，pos+1当做最小值
                low = pos + 1;
            } else {
                high = pos - 1;
            }

        }
        return -1;
    }

}
