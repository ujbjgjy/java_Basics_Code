package com.ujbj.test.test3;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("李四", 2);
        Cat cat = new Cat(28, "橘");
        Dog dog = new Dog(21, "白");

        person.keepPet(cat, "猫粮");
        person.keepPet(dog, "狗粮");
    }
}
