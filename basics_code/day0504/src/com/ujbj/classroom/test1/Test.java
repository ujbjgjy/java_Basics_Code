package com.ujbj.classroom.test1;

public class Test {
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Cat("猫", 4);
        animal[1] = new Duck("鸭子", 2);
        animal[2] = new Dolphin("海豚");
        for (int i = 0; i < animal.length; i++) {
            if (animal[i] instanceof Terrestial) {
                System.out.println(animal[i].getName() + "\t" + ((Terrestial) animal[i]).getLegNum());
                animal[i].shout();
            } else {
                System.out.println(animal[i].getName() + "\t");
                animal[i].shout();
            }
        }
    }
}
