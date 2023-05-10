package com.ujbj.test.test5;

public class PingPong extends Person implements English {
    public PingPong() {
    }

    public PingPong(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void english() {
        System.out.println("说英语");
    }
}
