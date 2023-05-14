package com.ujbj.test.test3;

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner oi = outer.new Inner();
        oi.show();
    }
}
