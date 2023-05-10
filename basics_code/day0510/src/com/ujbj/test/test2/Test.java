package com.ujbj.test.test2;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("狗", 12);
        frog frog = new frog("青蛙", 19);
        Sheep sheep = new Sheep("羊", 23);
        System.out.println(dog.getAge() + "岁" + "\t" + dog.getName());
        dog.eat();
        System.out.println(frog.getAge() + "岁" + "\t" + frog.getName());
        frog.eat();
        System.out.println(sheep.getAge() + "岁" + "\t" + sheep.getName());
        sheep.eat();
        
    }
}
