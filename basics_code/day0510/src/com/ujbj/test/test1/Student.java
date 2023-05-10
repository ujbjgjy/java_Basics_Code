package com.ujbj.test.test1;

public class Student {
    private String name;
    private int age;

    {
        int a = 10;
    }
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static {
        System.out.println("静态代码块");
    }
}
