package com.ujbj.test.test2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("张三", 20, "男");
        Student s2 = new Student("李四", 23, "女");
        Student s3 = new Student("王五", 40, "男");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        int max = StudentUtil.getStudentMax(list);
        System.out.println("max = " + max);
    }
}
