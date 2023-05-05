package com.ujbj.classroom.test1;

public class Duck extends Animal implements Terrestial {
    int legNum;

    public Duck() {
    }

    public Duck(String name, int legNum) {
        super(name);
        this.legNum = legNum;
    }

    public void shout() {
        System.out.println("鸭在叫");
    }

    public int getLegNum() {
        return legNum;
    }
}
