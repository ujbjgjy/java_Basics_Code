package com.ujbj.test.test3;

public class Person {
    String name;
    int age;
    private String gender;
    public Person() {
        System.out.println("父类里面的空参构造");
    }

    public Person(String name, int age) {
        System.out.println("父类里面的有参构造");
        this.name = name;
        this.age = age;
        this.gender = "女";
    }

    public String getGender() {
        return gender;
    }
}
