package com.ujbj.test.test3;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("张三", 12);
        Person p = new Person();
        System.out.println(student.name + "\t" + student.age + "\t" + student.getGender());
        System.out.println(p.name + "\t" + p.age + "\t" + p.getGender());
    }
}
