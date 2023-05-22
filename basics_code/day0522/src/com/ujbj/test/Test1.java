package com.ujbj.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    /**
     * 键盘录入一些1~100之间的整数，并添加到集合中。
     * 直到集合中所有数据和超过200为止
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {
            String value = sc.nextLine();
            int num = Integer.parseInt(value);

            if (num >= 1 && num <= 100) {

                if ((sum += num) > 200)  break;
                list.add(num);
            } else {
                System.out.println("数值小于1或大于100");
            }
        }

        getListSum(list);
    }

    public static void getListSum(ArrayList<Integer> list) {
        Integer sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("sum = " + sum);
    }
}
