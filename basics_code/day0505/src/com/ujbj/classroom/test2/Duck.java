package com.ujbj.classroom.test2;

import com.ujbj.classroom.test1.Terrestial;

public class Duck extends Animal implements Terrestial {
    int legNum;

    public Duck(String name, int legNum) {
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
