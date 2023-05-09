package com.ujbj.test.classroom.test1;

public class Dolphin extends Animal {

    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void shout() {
        System.out.println("海豚在叫");
    }
}
