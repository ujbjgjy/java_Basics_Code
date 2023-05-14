package com.ujbj.test.test8;

public class Test {
    public static void main(String[] args) {
        StuM students = new StuM();
        Student s1 = new Student("001", "张三", "男");
        Student s2 = new Student("002", "张四", "女");
        Student s3 = new Student("003", "赵六", "男");
        Student s4 = new Student("004", "王五", "女");
        Student s5 = new Student("005", "刘能", "男");

        students.add(s1);
        students.add(s3);
        students.add(s2);
        students.add(s4);
        students.add(s5);

        students.showAll();
    }
}
