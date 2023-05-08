package com.ujbj.test.test4;

public class Employee {
    private String ID;
    private String name;
    private int wages;

    public Employee() {
    }

    public Employee(String ID, String name, int wages) {
        this.ID = ID;
        this.name = name;
        this.wages = wages;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }

    public int getWages() {
        return wages;
    }

    public void work() {
        System.out.println("工作");;
    }

    public void eat() {
        System.out.println("吃饭");
    }
}
