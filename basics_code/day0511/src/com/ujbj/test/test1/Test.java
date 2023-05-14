package com.ujbj.test.test1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        StuMgr stuMgr = new StuMgr();
        Scanner sc = new Scanner(System.in);
        loop:
        while (true) {
            menu();
            int select = sc.nextInt();
            switch (select) {
                case 1 -> {
                    Student student = new Student();
                    System.out.print("学号:> ");
                    student.setId(sc.next());
                    System.out.print("姓名:> ");
                    student.setName(sc.next());
                    System.out.print("性别:> ");
                    student.setGender(sc.next());
                    stuMgr.addStu(student);
                }
                case 2 -> {
                    stuMgr.showAll();
                }
                case 3 -> {
                    System.out.println("删除");
                }
                case 0 -> {
                    break loop;
                }
                default -> {
                    System.out.println("错误");
                }
            }
        }
    }

    public static void menu() {
        System.out.println("1. 添加\t2. 查询\t3. 删除 :)");
        System.out.print("$ ");
    }
}
