package com.ujbj.test.test4;

public class Chef extends Employee {
    public Chef() {
    }

    public Chef(String ID, String name, int wages) {
        super(ID, name, wages);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("炒菜");
    }
}
