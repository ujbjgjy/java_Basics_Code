package com.ujbj.test.classroom.test1;

public class Cat extends Animal implements Terrestial {
    int lenNum;

    public Cat(String name, int lenNum) {
        super(name);
        this.lenNum = lenNum;
    }
    @Override
    public void shout() {
        System.out.println("猫在叫");
    }
    public int getLenNum() {
        return lenNum;
    }
}
