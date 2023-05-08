package com.ujbj.test.test5;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("张三", 12);
        Teacher t = new Teacher("李四老师", 50);
        Administrators admin = new Administrators("管理员", 23);

        register(s);
        register(t);
        register(admin);
    }

    // 这个方法即能接收老师，又能接收学生，还能接收管理员
    // 只能把参数写这三个类型的父类
    public static void register(Person p) {
        p.show();
    }
}
