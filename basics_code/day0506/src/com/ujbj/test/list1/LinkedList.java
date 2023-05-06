package com.ujbj.test.list1;

public class LinkedList {
    // 定义头节点
    ListNode head;

    // 初始化头节点
    public LinkedList() {
        head = null;
    }

    // 头插法
    public void addFirst(int value) {
        // 新建节点, 并将值传给新节点
        ListNode newNode = new ListNode(value);

        // 连接链表
        newNode.next = head;
        head = newNode;
    }

    // 尾插法
    public void addLast(int value) {
        // 新建节点，并赋值
        ListNode newNode = new ListNode(value);

        // 连接节点
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode cur = head;
        // 保留上个节点
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;
    }

    // 删除
    public void remove(int value) {
        if (head == null) return;
        if (head.value == value) {
            head = null;
            return;
        }
        // 比较下个节点的值是否相同，要保留上个节点
        ListNode cur = head;
        // 下个节点不是空，并且值不相同
        while (cur.next != null && cur.next.value != value) {
            // cur的下个节点不是空，在来比较cur的下节点的下个节点
            cur = cur.next;
        }
        // 不是因为cur.next为空跳出来的
        // cur.next.value == value
        if (cur.next != null) {
            cur.next = cur.next.next;
        }
    }

    // 遍历链表
    public void printList() {
        // 为要让head发生改变
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.value + "-->");
            cur = cur.next;
        }
        System.out.println(cur);
    }










}
