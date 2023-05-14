package com.ujbj.test.test2;

import java.util.ArrayList;

public class ListTest extends ArrayList {
    public ListTest() {
        this.add("a");
        this.add("b");
        this.add("c");
        this.add("d");
    }
    public void pintList() {
        for (int i = 0; i < this.size(); i++) {
            System.out.print(this.get(i) + "\t");
        }
    }
}
