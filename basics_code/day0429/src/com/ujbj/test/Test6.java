package com.ujbj.test;

public class Test6 {
    /**
     * 不创建临时变量交换两个变量的值
     */
    public static void main(String[] args) {
        // 方法1
        //  1. 让 a 等于 a + b
        //  2. 让 b 等于 a - b
        //  3. 让 a 等于 a - b
        int a = 13;
        int b = 3;
        System.out.printf("a = %d\t b = %d\n", a, b);
        System.out.println("交换后:");
        a = a + b; // a = 16
        b = a - b; // b = 16 - 13 = 3 = b  b = 3
        a = a - b; // b = 3 也就是交换后的a  a = 16 - 3 = 13
        System.out.printf("a = %d\t b = %d\n", a, b);
        System.out.println("----------");
        // 方法2
        //  使用逻辑运算符交换变量
        System.out.println(13 ^ 3);
        int c = 13;
        int d = 3;
        System.out.printf("c = %d\t d = %d\n", c, d);
        // 获取一个密码，在用第二个数进行异或能得到原来的数字
        // 如果用第一个数(密码)异或能得到第一个数的
        c = c ^ d; // 得到一个密码
        // c 现在是这个密码
        d = c ^ d; // 再进行异或得到原的值 d = c
        c = c ^ d; //
        System.out.println("交换后:");
        System.out.printf("c = %d\t d = %d", c, d);
        /**
         * 这种方法的缺点有以下几个：
         * 1. 可读性差：异或操作虽然在计算机底层操作中很常见，但对于非计算机专业人士来说，可能需要花费更长时间来理解此方法的本质。
         * 2. 容易出错：由于异或操作同时涉及到三个变量的操作，也容易因为顺序不当、拼写错误等原因导致结果出错。
         * 3. 不具备通用性：该算法仅适用于数值类型的变量，而对于其他类型（如字符串、数组等）则需要使用其他方式来实现交换。
         * 4. 可能会降低代码可维护性：该方法可能会对程序员造成干扰，并给后续的代码维护带来困难。
         */
    }
}
