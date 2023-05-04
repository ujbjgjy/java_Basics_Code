package com.ujbj.test.myList;

public class ListNode {
    String name;
    char gender;
    int age;
    String address;
    // 定义一个节点
    ListNode next;
    ListNode () {
    }
    ListNode (String name, char gender, int age, String address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }
}
