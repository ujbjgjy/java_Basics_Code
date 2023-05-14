package com.ujbj.test.test3;

public class Outer {
    private int a = 10;

    public Outer() {
        System.out.println("outer:" + this);
    }

    public class Inner {
        private int a = 20;
        public void show() {
            System.out.println("Outer.this:" + Outer.this);
            int a = 30;
            System.out.println(Outer.this.a); // 10
            System.out.println(this.a); // 20
            System.out.println(a); // 30
        }
    }
}
