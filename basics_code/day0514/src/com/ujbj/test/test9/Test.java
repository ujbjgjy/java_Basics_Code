package com.ujbj.test.test9;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StuMgr studMgr = new StuMgr();

        while (true) {
            menu();
            System.out.print("$ ");
            int select = sc.nextInt();
            switch (select) {
                case 1 -> {
                    Student s = new Student();
                    System.out.print("学号:> ");
                    s.setId(sc.next());
                    System.out.print("名字:> ");
                    s.setName(sc.next());
                    System.out.print("性别:> ");
                    s.setGender(sc.next());
                    studMgr.add(s);
                    System.out.println("添加成功 :)");
                    studMgr.showAll();
                }
                case 2 -> {
                    System.out.print("要查询的名字:> ");
                    String name = sc.next();
                    if (studMgr.findStu(name) >= 0) {
                        System.out.println(name + "存在 :)");
                    } else {
                        System.out.println(name + "不存在 :(");
                    }
                    studMgr.showAll();
                }
                case 3 -> {
                    System.out.print("要删除的名字:> ");
                    String name = sc.next();
                    studMgr.removeIf(n -> n.getName().equals(name));
                    studMgr.showAll();
                }
                default -> {
                    System.out.println("输入错误 :(");
                }
            }
        }
    }

    public static void menu() {
        System.out.println("1.添加\t2.查询\t3.删除 :)");
    }
}
