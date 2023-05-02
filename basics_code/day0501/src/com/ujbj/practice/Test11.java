package com.ujbj.practice;

import java.awt.dnd.DragGestureListener;
import java.util.Random;
import java.util.Scanner;

public class Test11 {
    /**
     * 投注号码由6个红色球号码和1个蓝色球号码组成。
     * 红色球号码从1一33中选择；蓝色球号码从1一16中选择。
     */
    public static void main(String[] args) {
        // 1. 生成中奖号码
        int[] arr = generateNum();
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%2d\t", arr[i]);
        }
        System.out.println();
        // 2. 用户输入自己的中奖号码
        int[] userArr = userInput();
        System.out.print("开奖双色球号码:> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%2d\t", arr[i]);
        }
        System.out.println();
        System.out.print("用户双色球号码:> ");
        for (int i = 0; i < userArr.length; i++) {
            System.out.printf("%2d\t", userArr[i]);
        }
        System.out.println();
        // 3. 返回奖金
        System.out.println(bonus(arr, userArr));
    }

    public static int[] generateNum() {
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i < arr.length - 1; ) {
            int num = r.nextInt(33) + 1;
            // 不相等，数字加行数组当中
            if (!compare(arr, num)) {
                arr[i] = num;
                i++;
            }
        }
        arr[arr.length - 1] = r.nextInt(16) + 1;
        return arr;
    }

    public static boolean compare(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static int[] userInput() {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length - 1; ) {
            System.out.print("请输入红球号码[" + (i + 1) + "]:> ");
            int num = sc.nextInt();
            if (num > 33 || num < 1) {
                System.out.println("号码违规");
            } else if (compare(arr, num)) {
                System.out.println("红球号码重复");
            } else {
                arr[i] = num;
                i++;
            }
        }
        while (true) {
            System.out.print("请输入蓝球号:> ");
            int num = sc.nextInt();
            if (num >= 1 && num <= 16) {
                arr[arr.length - 1] = num;
                break;
            } else {
                System.out.println("蓝球号码违规");
            }
        }
        return arr;
    }

    public static String bonus(int[] arr, int[] userArr) {
        // 记录中奖规则
        int[] rule = {61, 60, 51, 5041, 4031, 1101};
        // 奖金
        String[] bonusNum = {"1000万", "500万", "3000元", "200元", "10元", "5元"};
        int red = 0;
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                if (arr[i] == userArr[i])
                    num = red * 10 + 1;
                break;
            }
            if (arr[i] == userArr[i]) {
                red++;
            }
        }
        System.out.println("中的球数:> " + num);
        for (int i = 0; i < rule.length; i++) {
            int temp = rule[i] % 100;
            if (temp == num) {
                return bonusNum[i];
            } else if (rule[i] / 100 == num) {
                return bonusNum[i];
            }
        }
        return "没有中奖";
    }
}
