package com.ujbj.test.test3;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal a, String someThing) {
        // a 如果是Dog 就强转为Dog为b的变量
        if (a instanceof Dog b) {
            System.out.printf("年龄%d岁的%s养了一只%s颜色的%d岁的狗\n", age, name, b.getColor(), b.getAge());
            b.eat(someThing);
            b.lookHome();
        } else if (a instanceof Cat c) {
            System.out.printf("年龄为%d岁的%s养了一只%s颜色的%d岁的猫\n", age, name, c.getColor(), c.getAge());
            c.eat(someThing);
            c.catchMouse();
        }
    }
}
