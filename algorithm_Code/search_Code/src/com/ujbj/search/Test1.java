package com.ujbj.search;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int[] newArr = Arrays.copyOf(arr, 10);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
    }
}
