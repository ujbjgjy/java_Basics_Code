package com.ujbj.test.test2;

public class Test1 {
    /**
     * 求质数: 大于1的数，只能被1和本整除的数
     * 1到100的质数有哪些：
     * 2、3、5、7、11
     * 13、17、19、23、29
     * 31、37、41、43、47
     * 53、59、61、67、71
     * 73、79、83、89、97
     * 共计25个
     */
    public static void main(String[] args) {
        // 方法一
        System.out.println("----- 方法一 -----");
        int count = 0;
        for (int i = 2; i <= 100; i++) {
            boolean flag = true; // 假如这个数是质数
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + "\t");
                count++;
                if (count % 5 == 0) System.out.println();
            }
        }
        System.out.println("共" + count + "个");
        System.out.println("----- 方法二 -----");
        /**
         * 81平方根: 9 * 9 = 81
         * a * b = 81
         * 如果， a <= 9，那么b>= 9
         * 例：8.9 * 8.9 = n < 81
         *
         * 可得：它的其一个因数只可以是 9 >= n 的
         * 我们可以通过它的其中的一个因数看是否能整除
         */
        // 遍历一个数的中只可能出现的因数，除以这个数看是否整除，如果整除说明不是质数,不包含根号本身
        // Math.sqrt() 求一个数的根号
        count = 0;
        for (int i = 2; i <= 100; i++) {
            boolean flag = true;
            for (int j = 2; j <= (int) Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + "\t");
                count++;
                if (count % 5 == 0) System.out.println();
            }
        }
        System.out.println("一共" + count);
    }
}
