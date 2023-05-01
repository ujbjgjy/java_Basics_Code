package com.ujbj.practice;

public class Test3 {
    /**
     * 用平方根方式
     * 判断101-200之间有多少素数(质数)并输出所有素数。
     */
    public static void main(String[] args) {
        /**
         * a * b = n
         *  如果 a <= n的平方根
         *  那么一定是 b >= n的平方根
         *  例如 81 平方根为 9
         *  a = 一定小于或等平方根
         *  b = 一定大于或待平方根
         * 简单来说：
         *  81的其中有一个因数一定要小于81的平方根或等它的平方根
         *  我们可以遍历可能是它的因数，来除以81。得到81的另一个因数
         */
        // 遍历101~200的数
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            // 以81为例
            // 2 ~ 9(包括9) 81其中的因数一定在这个范围内。如果没有说明是质数
            boolean flag = true; // 假如是质数
            for (int j = 2; j <= Math.sqrt(i); j++) {
                // 能除尽，不是质数
                if (i % j == 0) {
                    flag = false;
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
