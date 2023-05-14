package com.ujbj.test.test1;

import java.util.Random;

public class test {
    /**
     * 打乱一维数组中的数据
     * int[] tempArr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
     * 要求：打乱一维数组中的数据，并按照4个一组的方式添加到二维数组中。
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();

        for (int i = 0; i < tempArr.length; i++) {
            int indexRandom = r.nextInt(16);
            int temp = tempArr[indexRandom];
            tempArr[indexRandom] = tempArr[i];
            tempArr[i] = temp;
        }
        int index = 0;
        int[][] newArr = new int[4][4];
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                newArr[i][j] = tempArr[index++];
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                System.out.printf("%2d\t", newArr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
