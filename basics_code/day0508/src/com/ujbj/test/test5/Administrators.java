package com.ujbj.test.test5;

public class Administrators extends Person {
    public Administrators() {
    }

    public Administrators(String name, int age) {
        super(name, age);
    }
    @Override
    public void show() {
        System.out.println(getName() + "," + getAge());
    }
}
