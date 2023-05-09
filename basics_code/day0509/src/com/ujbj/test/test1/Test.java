package com.ujbj.test.test1;

public class Test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);

        list.addLast(6);
        list.addLast(7);
        list.addLast(713);
        list.addLast(9);
        list.addLast(10);

        list.remove(713);
        list.setVal(10, 20030713);

        list.printList();
    }
}
