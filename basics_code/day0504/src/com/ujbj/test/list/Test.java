package com.ujbj.test.list;

public class Test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.printList(); // 2 1 3
        list.remove(1);
        list.printList(); // 2 3
    }
}
