package com.ujbj.stringTest;

public class Test1 {
    public static void main(String[] args) {
        String phoneNum = "13342347788";
        String begin = phoneNum.substring(0, 4);
        String end = phoneNum.substring(7);
        String str = begin + "*****" + end;
        System.out.println(str);
    }
}
