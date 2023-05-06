package com.ujbj.test.list1;

public class Test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 10; i++) {
            list.addLast(i + 1);
        }
        list.printList();
        list.remove(2);
        list.remove(4);
        list.remove(5);
        list.remove(6);
        list.remove(8);
        list.remove(9);
        list.remove(10);
        list.printList();
    }
}
