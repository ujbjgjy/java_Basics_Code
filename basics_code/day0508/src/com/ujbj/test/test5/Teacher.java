package com.ujbj.test.test5;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }
    @Override
    public void show() {
        System.out.println(getName() + "," + getAge());
    }
}
