package com.ujbj.test.test5;

public class PingPongCoach extends Person {
    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("教打乒乓球");
    }
}
