package com.ujbj.practice;

public class Test2 {
    /**
     * 判断101-200之间有多少素数(质数)并输出所有素数。
     */
    public static void main(String[] args) {
        // 遍历101~200里面的数
        int count = 0; // 记录101~200里面的质数
        for (int i = 101; i <= 200; i++) {
            // 用 2 ~ i(不包括i) 的数除以i，看是否除尽
            // 假如当前的数是质数
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                // 如能除尽，表示不是质数
                if (i % j == 0) {
                    flag = false; // 当前数不是质数
                    break;
                }
            }
            if (flag) {
                System.out.print(i + "\t");
                count++;
            }
        }
        System.out.println("\n[101~200]里面有:" + count + "个质数");
    }
}
