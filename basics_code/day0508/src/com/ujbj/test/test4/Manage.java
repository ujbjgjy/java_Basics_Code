package com.ujbj.test.test4;

public class Manage extends Employee {
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Manage() {
    }

    public Manage(String ID, String name, int wages, int bonus) {
        super(ID, name, wages);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("管理其他人");
    }
}
