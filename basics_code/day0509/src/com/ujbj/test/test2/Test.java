package com.ujbj.test.test2;

public class Test {
    public static void main(String[] args) {
        Animal a = new Cat();
        System.out.println(a.name);
        a.show();
    }
}

class Animal {
    String name = "动物";
    public void show() {
        System.out.println("父类里面的方法");
    }
}

class Cat extends Animal {
    String name = "猫";

    public void show() {
        System.out.println("子类里面的方法");
    }
}