package com.ujbj.test.test5;

public class Basketball extends Person implements English {
    public Basketball() {
    }

    public Basketball(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("学打篮球");
    }

    @Override
    public void english() {
        System.out.println("说英语");
    }
}
