package com.ujbj.search;

public class FibonacciDome2 {
    public static int maxSize = 20;
    public static void main(String[] args) {
        int[] f = getFeiBo();

        for (int i = 0; i < f.length; i++) {
            System.out.print(f[i] + "\t");
        }
        System.out.println();
        int k = 10;

        for (int i = 10; i > 4; i--) {
            System.out.println("f[k] - 1 = " + (f[k] - 1));
            System.out.println("f[k - 1] - 1 =" +  (f[k - 1] - 1));
            System.out.println("f[k - 2] - 1 =" +  (f[k - 2] - 1));
            k--;
        }

    }

    public static int[] getFeiBo() {
        int[] arr = new int[maxSize];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            // 1 1 2
            // 1 2 3
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        return arr;
    }
}
