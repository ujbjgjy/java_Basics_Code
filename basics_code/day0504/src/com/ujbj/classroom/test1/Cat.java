package com.ujbj.classroom.test1;

public class Cat extends Animal implements Terrestial {
    int legNum;

    public Cat() {
    }

    public Cat(String name, int legNum) {
        super(name);
        this.legNum = legNum;
    }

    public void shout() {
        System.out.println("猫在叫");
    }

    public int getLegNum() {
        return legNum;
    }
}