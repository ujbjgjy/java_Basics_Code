package com.ujbj.classroom.test2;

import com.ujbj.classroom.test1.Terrestial;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("猫", 4);
        animals[1] = new Duck("鸭", 2);
        animals[2] = new Dolphin("海豚");
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Terrestial) {
                System.out.println(animals[i].getName() + "\t" + ((Terrestial) animals[i]).getLegNum());
            } else {
                System.out.println(animals[i].getName() + "\t0");
            }
        }
    }
}
