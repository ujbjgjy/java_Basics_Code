package com.ujbj.test.aipDome;

import java.math.BigInteger;

public class Test3 {
    public static void main(String[] args) {
        BigInteger bd1 = BigInteger.valueOf(14);
        BigInteger bd2 = BigInteger.valueOf(14);

        BigInteger bd3 = bd1.add(bd2);

        System.out.println(bd3 == bd1);

        System.out.println(bd3.pow(2));
        BigInteger[] arr = bd3.divideAndRemainder(bd2);
        System.out.println(arr[0] + "," +  arr[1]);

        BigInteger bd4 = BigInteger.valueOf(Long.MAX_VALUE);
    }
}
