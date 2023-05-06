package com.ujbj.test.list2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("姓名:> ");
            String name = sc.next();
            System.out.print("年龄:> ");
            int age = sc.nextInt();
            Student student = new Student(name, age);
            list.add(student);
        }
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getName();
            int age = list.get(i).getAge();
            System.out.println("姓名: " + name + "\t年龄: " + age);
        }
    }
}
