package com.ujbj.test.test1;

public class Test {
    public static void main(String[] args) {
        ((Swim) () -> System.out.println("重写游泳方法")).swim();
        new Swim() {
            @Override
            public void swim() {
                System.out.println("重写游泳方法");
            }
        };
        method(new Swim() {
            @Override
            public void swim() {
                System.out.println("重写游泳方法");
            }
        });
    }

    public static void method(Swim s) {
        s.swim();
    }
}
