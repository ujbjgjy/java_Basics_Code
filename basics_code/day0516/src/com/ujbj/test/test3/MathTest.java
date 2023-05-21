package com.ujbj.test.test3;

public class MathTest {
    /**
     * 自幂数，一个n位自然数等于自身各个数位上数字的n次幂之和
     * 举例1：三位数 1^3 + 5^3 + 3^3=153
     * 举例2：四位数 1^4 + 6^4 + 3^4 + 4^3=1634
     * 如果自幂数是一位数，也叫做：独身数
     * 三位自幂数：水仙花数   四位自幂数：四叶玫瑰数
     * 五位自幂数：五角星数   六位自幂数：六合数
     * 七位自幂数：北斗七星数  八位自幂数：八仙数
     * 九位自幂数：九九重阳数  十位自幂数：十全十美数
     */
    public static void main(String[] args) {
        for (long l = 100L; l < 9999999; l++) {
            byte[] temp = getDigit(l);

            // 1. 打印水仙花数
            if (temp.length == 3) {
                double sum = Math.pow(temp[0], 3) + Math.pow(temp[1], 3) + Math.pow(temp[2], 3);
                if (l == 100) System.out.print("水仙花数: ");
                if (sum == l) {
                    System.out.print(l + "\t");
                }
                if (l == 999) System.out.println();
            } else if (temp.length == 4) {
                // 2. 打印四叶玫瑰数
                double sum = Math.pow(temp[0], 4) + Math.pow(temp[1], 4) + Math.pow(temp[2], 4) +  + Math.pow(temp[3], 4);
                if (l == 1000) System.out.print("水仙花数: ");
                if (sum == l) {
                    System.out.print(l + "\t");
                }
                if (l == 9999) System.out.println();
            } else if (temp.length == 5) {
                // 3. 打印五角星数
                double sum = Math.pow(temp[0], 5) + Math.pow(temp[1], 5) + Math.pow(temp[2], 5) + Math.pow(temp[3], 5) + Math.pow(temp[4], 5);
                if (l == 10000) System.out.print("五角星数: ");
                if (sum == l) {
                    System.out.print(l + "\t");
                }
                if (l == 99999) System.out.println();
            } else if (temp.length == 6) {
                // 4. 打印六合数
                double sum = Math.pow(temp[0], 6) + Math.pow(temp[1], 6) + Math.pow(temp[2], 6) + Math.pow(temp[3], 6) + Math.pow(temp[4], 6) + Math.pow(temp[5], 6);
                if (l == 100000) System.out.print("六合数: ");
                if (sum == l) {
                    System.out.print(l + "\t");
                }
                if (l == 999999) System.out.println();
            } else if (temp.length == 7) {
                // 5. 打印北斗七星数
                double sum = Math.pow(temp[0], 7) + Math.pow(temp[1], 7) + Math.pow(temp[2], 7) + Math.pow(temp[3], 7) + Math.pow(temp[4], 7) + Math.pow(temp[5], 7) + + Math.pow(temp[6], 7);
                if (l == 1000000) System.out.print("北斗七星数: ");
                if (sum == l) {
                    System.out.print(l + "\t");
                }
                if (l == 9999999) System.out.println();
            }
        }
    }

    public static byte[] getDigit(long num) {
        StringBuffer sb = new StringBuffer();

        while (num > 0) {
            sb.append(num % 10);
            num /= 10;
        }
        byte[] arr = sb.toString().getBytes();
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= '0';
        }
        return arr;
    }
}
