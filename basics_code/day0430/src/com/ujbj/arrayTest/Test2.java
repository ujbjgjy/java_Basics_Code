package com.ujbj.arrayTest;

import java.util.Random;

public class Test2 {
    /**
     * 遍历数组并求和
     * 需求：生成10个1~100之间的随机数存入数组。
     * (1) 求出所有数据的和
     * (2) 求所有数据的平均数
     * (3) 统计有多少个数据比平均值小
     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        // 1. 生成10个随机数并放入数组里面
        System.out.print("数组为:> ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100 + 1) + 1;
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        // 2. 求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum = " + sum);
        // 3. 求平均数
        int average = sum / arr.length;
        System.out.println("average = " + average);
        // 4. 统计有多少个数据比平均值小
        int count = 0;
        System.out.print("小于平均数:> ");;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                System.out.print(arr[i] + "\t");
                count++;
            }
        }
        System.out.println("\n一共有" + count + "个数据小于平均数");
    }
}
