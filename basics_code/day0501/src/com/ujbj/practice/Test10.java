package com.ujbj.practice;

import java.util.Random;

public class Test10 {
    /**
     * 需求：
     * 一个大V直播抽奖，奖品是现金红包，分别有{2,88，888,1000,10000}五个奖金。请使用代码模拟抽奖
     * 打印出每个奖项，奖项的出现顺序要随机且不重复。
     */
    public static void main(String[] args) {
        int[] arr = {2, 88, 888, 1000, 10000};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
