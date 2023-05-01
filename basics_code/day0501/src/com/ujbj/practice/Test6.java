package com.ujbj.practice;

import java.util.Scanner;

public class Test6 {
    /**
     * 评委打分
     * 需求：
     * 在唱歌比赛中，有6名评委给选手打分，分数范围是[0-100]之间的整数。选手的最后得分为：去掉最
     * 高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
     */
    public static void main(String[] args) {
        // 1. 录入评委分数
        int[] scoreArr = enterScore();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.print(scoreArr[i] + "\t");
        }
        System.out.println();
        // 2. 求出最大值
        int max = getMax(scoreArr);
        System.out.println("max = " + max);
        // 3. 求出最小值
        int min = getMin(scoreArr);
        System.out.println("min = " + min);
        // 4. 求和
        int sum = getSum(scoreArr);
        System.out.println("sum = " + sum);
        // 5. 减去最大最小值 在再求出平均值
        int ave = (sum - max - min) / (scoreArr.length - 2);
        System.out.println("ave = " + ave);
    }

    // 录入
    public static int[] enterScore() {
        int[] scoreArr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scoreArr.length; ) {
            System.out.print("请打分["+ (i + 1) +"]:> ");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scoreArr[i] = score;
                i++;
            } else {
                System.out.println("只能输入0~100");
            }
        }
        return scoreArr;
    }

    // 求最大值
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    // 求最小值
    public static int getMin(int[] arr) {
        // shift + f6
        int min = arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    // 求和
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
