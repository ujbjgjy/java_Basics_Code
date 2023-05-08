package com.ujbj.test.test3;

public class Student extends Person {
    public Student() {
        this(null, 0);
        System.out.println("子类的无参构造");
    }

    public Student(String name, int age) {
        System.out.println("子类的有参构造");
    }

}
