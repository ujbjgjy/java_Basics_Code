package com.ujbj.test.test7;

public class Test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.remove(1);

        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);

        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);
        list.addLast(713);

        list.modify(7, 13);
        list.modify(5, 13);

        list.printList();
    }
}
