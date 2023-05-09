package com.ujbj.test.classroom.test1;

public class Duck extends Animal implements Terrestial {
    int lenNum;

    public Duck(String name, int lenNum) {
        super(name);
        this.lenNum = lenNum;
    }

    public void shout() {
        System.out.println("鸭在叫");
    }

    @Override
    public int getLenNum() {
        return lenNum;
    }
}
