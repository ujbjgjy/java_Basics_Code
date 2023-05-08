package com.ujbj.test.test5;

public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void show() {
        System.out.println(getName() + "," + getAge());
    }
}
