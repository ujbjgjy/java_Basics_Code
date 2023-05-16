package com.ujbj.test.test1;

public class Test {
    public static void main(String[] args) {
        new Swim() {
            @Override
            public void swim() {
                System.out.println("你好");
            }
        }.swim();
//        ((Swim) () -> System.out.println("重写游泳方法")).swim();
        ((Swim) () -> System.out.println("你好")).swim();
    }
}
