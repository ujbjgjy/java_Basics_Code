package com.ujbj.test.aipDome;

import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        Runtime r = Runtime.getRuntime();
        System.out.println(r.availableProcessors());
        System.out.println(123);
        System.out.println(123);
        System.out.println(123);
        Runtime.getRuntime().exec("Notepad");
    }
}
