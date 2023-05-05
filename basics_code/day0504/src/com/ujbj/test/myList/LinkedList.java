package com.ujbj.test.myList;

// 链表
public class LinkedList {
    // 创建节点
    private ListNode head;

    // 初始化节点
    public LinkedList() {
        head = null;
    }

    // 头插法
    public void addFirst(String name, char gender, int age, String address) {
        // 创建节点
        ListNode newNode = new ListNode(name, gender, age, address);

        // 新节点成为新的头部
        // 新节点的下个节点也就旧头节点，指向它
        newNode.next = head;
        // 因为我们通常是通过head节点开始遍历的。所以要把新节点的地址在赋给头节点
        head = newNode;
    }

    // 尾插法
    public void addLast(String name, char gender, int age, String address) {
        // 创建节点
        ListNode newNode = new ListNode(name, gender, age, address);

        // 1. 如果头节点为空,直接插入它的下一个节点
        if (head == null) {
            head = newNode;
            return;
        }
        // 2. 找到空的节点插入
        ListNode cur = head;
        //  2.1 找到空的节点，要保留它的上个节点
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;
    }

    // 删除
    public void delete(String name) {
        System.out.println(name);
        // 链表为空.没有要删除的
        if (head == null) return;
        ListNode cur = head;
        // 保留上个节点,否则没有节点指向它了
        while (cur.next != null) {
            // 如果相同
            if (cur.next.name.equals(name)) {
                cur.next = cur.next.next;
                break;
            }
            cur = cur.next;
        }
    }

    // 遍历
    public void printList() {
        if (head == null) return;
        ListNode cur = head;
        System.out.println("-----------------------------------------------------");
        System.out.printf("|%-10s\t|%-5s\t|%-5s\t|%-15s\t|\n", "性名", "性别", "年龄", "住址");
        System.out.println("-----------------------------------------------------");
        while (cur != null) {
            System.out.printf("|%-10s\t|%-5s\t|%-5d\t|%-15s\t|\n", cur.name, cur.gender, cur.age, cur.address);
            System.out.println("-----------------------------------------------------");
            cur = cur.next;
        }
    }
}
