package com.ujbj.test;

import java.util.Scanner;

public class Test4 {
    /**
     * 您和您的约会对象在餐厅里面正在约会。
     * 键盘录入两个整数，表示你和你约会对象衣服的时髦度。（手动录入0~10之间的整数，不能录其他）
     * 如果你的时髦程度大于你对象的时髦程度，相亲就成功，输出true，否则输出false。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的时髦程度:> ");
        int myFashion = sc.nextInt();
        System.out.print("请输入她的时髦程度:> ");
        int sheFashion = sc.nextInt();
        boolean result = myFashion > sheFashion;
        System.out.println(result);
    }
}
