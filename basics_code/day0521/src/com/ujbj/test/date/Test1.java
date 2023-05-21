package com.ujbj.test.date;

import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            countTime();
        }
    }

    public static void countTime() {
        long curTime = new Date().getTime();

        while (new Date().getTime() - curTime <= 1000) ;
    }
}
