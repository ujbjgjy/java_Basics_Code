package com.ujbj.test.test1;

public class LinkedList {
    // 定义头节点
    private ListNode head;

    // 初始化头节点
    public LinkedList() {
        this.head = null;
    }

    // 头插法
    public void addFirst(int val) {
        // 创建一个节点并赋值
        ListNode newNode = new ListNode(val);

        // 连接链表
        newNode.next = head;
        head = newNode;
    }

    // 尾插法
    public void addLast(int val) {
        // 创建一个节点并赋值
        ListNode newNode = new ListNode(val);

        // 将新节点连接链表
        // 1. 如果是空链表直接将新节点给头部，不必指向下个节点
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode cur = head;
        // 2. 找到尾部
        // 保持链表不断，一直有节点指向下个节点
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;
    }

    // 删除
    public void remove(int val) {
        if (head == null) return;
        if (head.val == val) {
            head = head.next;
        }

        // 当前的下个节点不能为空，并且不能与要删除的值相同
        ListNode cur = head;
        while (cur.next != null && cur.next.val != val) {
            // 我要判断的是它的下个节点是否为空，如果下个节点不是空，并且下个节点不是
            // 我要找到值，cur 等于 cur的下个节点
            cur = cur.next;
        }
        // cur的下个节点不是空并且有我要找的值
        cur.next = cur.next.next;
    }

    // 修改
    public void setVal(int val, int newVal) {
        if (head == null) return;

        ListNode cur = head;
        // 当前节点值不相同并且不是空值
        while (cur != null && cur.val != val) {
            cur = cur.next;
        }
        if (cur != null) {
            cur.val = newVal;
        }
    }

    public void printList() {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + "-->");
            cur = cur.next;
        }
        System.out.println(cur);

    }
}
