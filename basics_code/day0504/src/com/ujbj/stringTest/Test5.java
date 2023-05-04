package com.ujbj.stringTest;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(convert(arr));
    }
    public static String convert(int[] arr) {
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (int i = 0; i < arr.length; i++) {
           if (i == arr.length - 1) {
               result.append(arr[i] + "]");
           } else {
               result.append(arr[i] + ", ");
           }
        }

        return result.toString();
    }
}
