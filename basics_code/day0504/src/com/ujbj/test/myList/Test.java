package com.ujbj.test.myList;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
            System.out.println("请选择 ⚆_⚆");
            System.out.print("$ ");
            int input = sc.nextInt();
            switch (input) {
                case 1 -> {
                    ListNode userInfo = userInput();
                    list.addFirst(userInfo.name, userInfo.gender, userInfo.age, userInfo.address);
                    list.printList();
                }
                case 2 -> {
                    ListNode userInfo = userInput();
                    list.addLast(userInfo.name, userInfo.gender, userInfo.age, userInfo.address);
                    list.printList();
                }
                case 3 -> {
                    System.out.println("请输入要删除的名字");
                    System.out.print("$ ");
                    list.delete(sc.next());
                }
                case 4 -> {
                    list.printList();
                }
                case 0 -> {
                    System.out.println("退出");
                }
                default -> {
                    System.out.println("输入错误");
                }
            }
            if (input == 0) {
                break;
            }
        }
    }
    public static void menu() {
        System.out.println("******************************");
        System.out.println("*  1. addFirst  2. addLast   *");
        System.out.println("*  3. delete    4. printList *");
        System.out.println("*          0. exit           *");
        System.out.println("******************************");
    }

    public static ListNode userInput() {
        Scanner sc = new Scanner(System.in);
        ListNode userInfo = new ListNode();
        System.out.println("请输入姓名 :)");
        System.out.print("$ ");
        userInfo.name = sc.next();
        System.out.println("请输入性别 :)");
        System.out.print("$ ");
        userInfo.gender = sc.next().charAt(0);
        System.out.println("请输入年龄 :)");
        System.out.print("$ ");
        userInfo.age = sc.nextInt();
        System.out.println("请输入住址 :)");
        System.out.print("$ ");
        userInfo.address = sc.next();
        return userInfo;
    }
}