package com.ujbj.test.test7;

public class LinkedList {
    private ListNode head;

    public LinkedList() {
        this.head = null;
    }

    // 头插法
    public void addFirst(int value) {
        // 创建新节点，并赋值
        ListNode newNode = new ListNode(value);

        newNode.next = head;
        head = newNode;
    }
    // 尾插法
    public void addLast(int value) {
        // 创建新节点，并赋值
        ListNode newNode = new ListNode(value);

        // 找到链表的尾部, 不要让它成为一个单节点，要保留上个节点指向它
        if (head == null) {
            head = newNode;
        }
        ListNode cur = head;
        // 判断我的下个节点是否为空，如果不是就移到下个节点再进行判断
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;
    }
    // 删除
    public void remove(int value) {
        if (head == null) return;
        // 因为要保留上个节点，所以是从当前的下个节点开始判断的。
        if (head.value == value) {
            head = head.next;
            return;
        }
        // 移动节点
        ListNode cur = head;
        // 当前的节点的下个节点不能是空，并且如果等于要删除的值跳出循环
        while (cur.next != null && cur.next.value != value) {
            cur = cur.next;
        }
        if (cur.next != null) {
            cur.next = cur.next.next;
        }
    }

    // 修改
    public void modify(int value, int newVal) {
        if (head == null) return;

        ListNode cur = head;
        // 当前节点不是空，并且值不等找改的节点
        while (cur != null && cur.value != value) {
            cur = cur.next;
        }
        // 不为空节点
        if (cur != null) {
            cur.value = newVal;
        }
    }

    // 遍历
    public void printList() {
        if (head == null) return;

        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.value + "-->");
            cur = cur.next;
        }
        System.out.println(cur);
    }
}
