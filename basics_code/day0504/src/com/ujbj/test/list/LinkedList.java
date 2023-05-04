package com.ujbj.test.list;

public class LinkedList {
    private ListNode head;

    public LinkedList() {
        head = null;
    }

    // 在链表头部插入节点
    public void addFirst(int val) {
        // 创建ListNode对象
        ListNode newNode = new ListNode(val);
        // 新节点的下个节点指向头部
        newNode.next = head;
        // 新节点为头部
        head = newNode;
    }

    // 在链表尾部插入节点
    public void addLast(int val) {
        // 创建一个新节点
        ListNode newNode = new ListNode(val);
        // 当头部为空，说明当前链表还为空，添加新创建的节点
        if (head == null) {
            head = newNode;
            return;
        }
        // 遍历节点，找到空的节点，然后插入新创建的节点
        //  头部的下个节点为空添加新节点
        ListNode cur = head;
        while (cur.next != null) {
            // cur 一直指向下一个节点
            // cur = cur-->next
            cur = cur.next;
        }
        // 添加节点
        cur.next = newNode;
    }

    // 删除链表中第一个值为val的节点
    public void remove(int val) {
        // 空链表，没有节点可删除
        if (head == null) {
            return;
        }
        // 头部的值如果相同，指向下个节点
        if (head.val == val) {
            head = head.next;
            return;
        }
        // 遍历节点，直找到相同的值退出循环
        ListNode cur = head;
        while (cur.next != null && cur.next.val != val) {
            cur = cur.next;
        }
        // cur节点不为空，说明当前值是存在的，删除
        if (cur.next != null) {
            cur.next = cur.next.next;
        }
    }

    // 打印链表
    public void printList() {
        ListNode cur = head;
        // 遍历节点
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
